package org.sonar.vary.plugin.squid;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.rule.ActiveRules;
import org.sonar.api.batch.rule.ActiveRule;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.design.Dependency;
import org.sonar.api.issue.Issuable;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.PersistenceMode;
import org.sonar.api.resources.Directory;
import org.sonar.api.resources.File;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.graph.Cycle;
import org.sonar.graph.DirectedGraph;
import org.sonar.graph.Dsm;
import org.sonar.graph.DsmTopologicalSorter;
import org.sonar.graph.Edge;
import org.sonar.graph.IncrementalCyclesAndFESSolver;
import org.sonar.graph.MinimumFeedbackEdgeSetSolver;
import org.sonar.vary.plugin.utils.VaryMetrics;
import org.sonar.vary.plugin.utils.VaryUtils;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class DependencyAnalyzer {

  private Project project;
  private SensorContext context;
  private ResourcePerspectives perspectives;
  private int violationsCount;
  private ActiveRule duplicateIncludeRule;
  private ActiveRule cycleBetweenPackagesRule;

  private DirectedGraph<File, FileEdge> filesGraph = new DirectedGraph<File, FileEdge>();
  private DirectedGraph<Directory, DirectoryEdge> packagesGraph = new DirectedGraph<Directory, DirectoryEdge>();
  private Map<Edge, Dependency> dependencyIndex = new HashMap<Edge, Dependency>();
  private Multimap<Directory, File> directoryFiles = HashMultimap.create();

  public DependencyAnalyzer(ResourcePerspectives perspectives, Project project, SensorContext context, ActiveRules rules) {
    this.project = project;
    this.context = context;
    this.perspectives = perspectives;

    this.violationsCount = 0;
  }

  public void addFile(File sonarFile/*, Collection<CxxPreprocessor.Include> includedFiles*/) {
    //Store the directory and file
    Directory sonarDir = sonarFile.getParent();
    packagesGraph.addVertex(sonarDir);
    directoryFiles.put(sonarDir, sonarFile);

    //Build the dependency graph
    Map<String, Integer> firstIncludeLine = new HashMap<String, Integer>();
    /*for (CxxPreprocessor.Include include : includedFiles) {
      File includedFile = File.fromIOFile(new java.io.File(include.getPath()), project);
      String includedFilePath = includedFile != null ? includedFile.getPath() : include.getPath();
      Integer prevIncludeLine = firstIncludeLine.put(includedFilePath, include.getLine());
      if (prevIncludeLine != null) {
        Issuable issuable = perspectives.as(Issuable.class, sonarFile);
        if ((issuable != null) && (duplicateIncludeRule != null)) {
          Issue issue = issuable.newIssueBuilder()
              .ruleKey(duplicateIncludeRule.ruleKey())
              .line(include.getLine())
              .message("Remove duplicated include, \"" + includedFilePath + "\" is already included at line " + prevIncludeLine + ".")
              .build();
          if (issuable.addIssue(issue))
            violationsCount++;
        } else {
          VaryUtils.LOG.warn("Already created edge from '" + sonarFile.getKey() + "' (line " + include.getLine() + ") to '" + includedFilePath + "'" +
              ", previous edge from line " + prevIncludeLine);
        }
      } else if (includedFile == null) {
        VaryUtils.LOG.warn("Unable to find resource '" + include.getPath() + "' to create a dependency with '" + sonarFile.getKey() + "'");
      } else if (context.isIndexed(includedFile, false)) {
        //Add the dependency in the files graph
        FileEdge fileEdge = new FileEdge(sonarFile, includedFile, include.getLine());
        filesGraph.addEdge(fileEdge);

        //Add the dependency in the packages graph, if the directories are different
        Directory includedDir = includedFile.getParent();
        if (!sonarDir.equals(includedDir)) {
          DirectoryEdge edge = packagesGraph.getEdge(sonarDir, includedDir);
          if (edge == null) {
            edge = new DirectoryEdge(sonarDir, includedDir);
            packagesGraph.addEdge(edge);
          }
          edge.addRootEdge(fileEdge);
        }
      }  else {
        VaryUtils.LOG.debug("Skipping dependency to file '{}', because it is'nt part of this project", includedFile.getName());
      }
    }*/
  }

  /** Perform the analysis and save the results.
   */
  public void save() {
    final Collection<Directory> packages = packagesGraph.getVertices();
    for (Directory dir : packages) {
      //Save dependencies (cross-directories, including cross-directory file dependencies)
      for (DirectoryEdge edge : packagesGraph.getOutgoingEdges(dir)) {
        Dependency dependency = new Dependency(dir, edge.getTo())
            .setUsage("references")
            .setWeight(edge.getWeight())
            .setParent(null);
        context.saveDependency(dependency);
        dependencyIndex.put(edge, dependency);

        for(FileEdge subEdge : edge.getRootEdges()) {
          saveFileEdge(subEdge, dependency);
        }
      }

      //Save file dependencies (inside directory) & directory metrics
      saveDirectory(dir);
    }

    IncrementalCyclesAndFESSolver<Directory> cycleDetector = new IncrementalCyclesAndFESSolver<Directory>(packagesGraph, packages);
    Set<Cycle> cycles = cycleDetector.getCycles();
    Set<Edge> feedbackEdges = cycleDetector.getFeedbackEdgeSet();
    int tangles = cycleDetector.getWeightOfFeedbackEdgeSet();

    VaryUtils.LOG.info("Project '" + project.getKey() + "'"
        + " Cycles:" + cycles.size()
        + " Feedback cycles:" + feedbackEdges.size()
        + " Tangles:" + tangles
        + " Weight:" + getEdgesWeight(packagesGraph.getEdges(packages)));

    saveViolations(feedbackEdges, packagesGraph);
    savePositiveMeasure(project, CoreMetrics.PACKAGE_CYCLES, cycles.size());
    savePositiveMeasure(project, CoreMetrics.PACKAGE_FEEDBACK_EDGES, feedbackEdges.size());
    savePositiveMeasure(project, CoreMetrics.PACKAGE_TANGLES, tangles);
    savePositiveMeasure(project, CoreMetrics.PACKAGE_EDGES_WEIGHT, getEdgesWeight(packagesGraph.getEdges(packages)));

    String dsmJson = serializeDsm(packages, feedbackEdges);
    Measure dsmMeasure = new Measure(CoreMetrics.DEPENDENCY_MATRIX, dsmJson)
        .setPersistenceMode(PersistenceMode.DATABASE);
    context.saveMeasure(project, dsmMeasure);
  }

  private void saveDirectory(Directory dir) {
    final Collection<File> files = directoryFiles.get(dir);
    for(File file: files) {
      for (FileEdge edge : filesGraph.getOutgoingEdges(file)) {
        saveFileEdge(edge, null);
      }
    }

    IncrementalCyclesAndFESSolver<File> cycleDetector = new IncrementalCyclesAndFESSolver<File>(filesGraph, files);
    Set<Cycle> cycles = cycleDetector.getCycles();
    MinimumFeedbackEdgeSetSolver solver = new MinimumFeedbackEdgeSetSolver(cycles);
    Set<Edge> feedbackEdges = solver.getEdges();
    int tangles = solver.getWeightOfFeedbackEdgeSet();

    VaryUtils.LOG.info("Directory: '" + dir.getKey() + "'"
        + " Cycles:" + cycles.size()
        + " Feedback cycles:" + feedbackEdges.size()
        + " Tangles:" + tangles
        + " Weight:" + getEdgesWeight(filesGraph.getEdges(files)));

    savePositiveMeasure(dir, CoreMetrics.FILE_CYCLES, cycles.size());
    savePositiveMeasure(dir, CoreMetrics.FILE_FEEDBACK_EDGES, feedbackEdges.size());
    savePositiveMeasure(dir, CoreMetrics.FILE_TANGLES, tangles);
    savePositiveMeasure(dir, CoreMetrics.FILE_EDGES_WEIGHT, getEdgesWeight(filesGraph.getEdges(files)));

    String dsmJson = serializeDsm(files, feedbackEdges);
    context.saveMeasure(dir, new Measure(CoreMetrics.DEPENDENCY_MATRIX, dsmJson));
  }

  private void saveViolations(Set<Edge> feedbackEdges, DirectedGraph<Directory, DirectoryEdge> packagesGraph) {
    if (cycleBetweenPackagesRule != null) {
      for (Edge feedbackEdge : feedbackEdges) {
        Directory fromPackage = (Directory) feedbackEdge.getFrom();
        Directory toPackage = (Directory) feedbackEdge.getTo();
        DirectoryEdge edge = packagesGraph.getEdge(fromPackage, toPackage);
        for (FileEdge subEdge : edge.getRootEdges()) {
          Resource fromFile = subEdge.getFrom();
          Resource toFile = subEdge.getTo();
          Issuable issuable = perspectives.as(Issuable.class, fromFile);
          // If resource cannot be obtained, then silently ignore, because anyway warning will be printed by method addFile
          if ((issuable != null) && (fromFile != null) && (toFile != null)) {
            Issue issue = issuable.newIssueBuilder()
                .ruleKey(cycleBetweenPackagesRule.ruleKey())
                .line(subEdge.getLine())
                .message("Remove the dependency from file \"" + fromFile.getLongName()
                    + "\" to file \"" + toFile.getLongName() + "\" to break a package cycle.")
                .effortToFix((double) subEdge.getWeight())
                .build();
            if (issuable.addIssue(issue))
              violationsCount++;
          }
        }
      }
    }
    if (cycleBetweenPackagesRule != null || duplicateIncludeRule != null) {
      Measure measure = new Measure(VaryMetrics.DEPENDENCIES);
      measure.setIntValue(violationsCount);
      context.saveMeasure(measure);
    }
  }

  private void saveFileEdge(FileEdge edge, Dependency parent) {
    if (!dependencyIndex.containsKey(edge)) {
      Dependency dependency = new Dependency(edge.getFrom(), edge.getTo())
          .setUsage("includes")
          .setWeight(edge.getWeight())
          .setParent(parent);
      context.saveDependency(dependency);
      dependencyIndex.put(edge, dependency);
    }
  }

  private double getEdgesWeight(Collection<? extends Edge> edges) {
    double total = 0.0;
    for (Edge edge : edges) {
      total += edge.getWeight();
    }
    return total;
  }

  private String serializeDsm(Collection<? extends Resource> vertices, Set<Edge> feedbackEdges) {
    Dsm<? extends Resource> dsm = new Dsm(packagesGraph, vertices, feedbackEdges);
    DsmTopologicalSorter.sort(dsm);
    return DsmSerializer.serialize(dsm, dependencyIndex);
  }

  private void savePositiveMeasure(Resource sonarResource, Metric metric, double value) {
    if (value >= 0.0) {
      context.saveMeasure(sonarResource, metric, value);
    }
  }

}
