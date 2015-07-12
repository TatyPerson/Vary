package org.sonar.vary;


import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.LoggerFactory;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.ActiveRule;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.issue.Issuable;
import org.sonar.api.issue.Issue;
import org.sonar.squidbridge.api.SquidConfiguration;

public class VaryConfiguration extends SquidConfiguration {

	  private static final org.slf4j.Logger LOG = LoggerFactory.getLogger("VaryConfiguration");
	  public static final String OverallIncludeKey = "VaryOverallInclude";
	  public static final String OverallDefineKey = "VaryOverallDefine";
	  
	  private boolean ignoreHeaderComments = false;
	  private final HashMap<String, Set<String>> uniqueIncludes = new HashMap<>();
	  private final HashMap<String, Set<String>> uniqueDefines = new HashMap<>();
	  private List<String> forceIncludeFiles = new ArrayList<>();
	  private List<String> headerFileSuffixes = new ArrayList<>();
	  private String baseDir;
	  private boolean errorRecoveryEnabled = true;
	  private List<String> cFilesPatterns = new ArrayList<>();
	  private boolean missingIncludeWarningsEnabled = true;
	  private ResourcePerspectives perspectives;
	  private FileSystem fs;
	  
	  private ActiveRule activeRule;
	  
	  public VaryConfiguration() {
	    uniqueIncludes.put(OverallIncludeKey, new HashSet<String>());
	    uniqueDefines.put(OverallDefineKey, new HashSet<String>());
	    //cxxVCppParser = new VaryBuildLogParser(uniqueIncludes, uniqueDefines);
	  }

	  public VaryConfiguration(Charset encoding) {
	    super(encoding);   
	    uniqueIncludes.put(OverallIncludeKey, new HashSet<String>());
	    uniqueDefines.put(OverallDefineKey, new HashSet<String>());
	    //cxxVCppParser = new VaryBuildLogParser(uniqueIncludes, uniqueDefines);
	  }
	  
	  public VaryConfiguration(FileSystem fs) {
	    super(fs.encoding());   
	    this.fs = fs;
	    uniqueIncludes.put(OverallIncludeKey, new HashSet<String>());
	    uniqueDefines.put(OverallDefineKey, new HashSet<String>());
	    //cxxVCppParser = new VaryBuildLogParser(uniqueIncludes, uniqueDefines);
	  }
	  
	  public VaryConfiguration(FileSystem fs,
	          ResourcePerspectives perspectivesIn,
	          ActiveRule activeRule) {
	    super(fs.encoding());   
	    this.fs = fs;
	    perspectives = perspectivesIn;
	    uniqueIncludes.put(OverallIncludeKey, new HashSet<String>());
	    uniqueDefines.put(OverallDefineKey, new HashSet<String>());
	    //cxxVCppParser = new VaryBuildLogParser(uniqueIncludes, uniqueDefines);
	    this.activeRule = activeRule;
	  }

	  public void setIgnoreHeaderComments(boolean ignoreHeaderComments) {
	    this.ignoreHeaderComments = ignoreHeaderComments;
	  }

	  public boolean getIgnoreHeaderComments() {
	    return ignoreHeaderComments;
	  }

	  public void setDefines(List<String> defines) {
	    Set<String> overallDefs = uniqueDefines.get(OverallDefineKey);
	    for(String define : defines) {      
	      if (!overallDefs.contains(define)) {
	        overallDefs.add(define);
	      }
	    }
	  }

	  public void setDefines(String[] defines) {
	    if (defines != null) {
	      setDefines(Arrays.asList(defines));
	    }
	  }

	  public List<String> getDefines() {
	    Set<String> allDefines = new HashSet<>();
	    
	    for(Set<String> elemSet : uniqueDefines.values()) {
	      for(String value : elemSet) {
	        if (!allDefines.contains(value)) {
	          allDefines.add(value);
	        }
	      }
	    }
	    
	    return new ArrayList<>(allDefines);
	  }

	  public void setIncludeDirectories(List<String> includeDirectories) {
	    Set<String> overallIncludes = uniqueIncludes.get(OverallIncludeKey);
	    for(String include : includeDirectories) {      
	      if (!overallIncludes.contains(include)) {
	        overallIncludes.add(include);
	      }
	    }
	  }

	  public void setIncludeDirectories(String[] includeDirectories) {
	    if (includeDirectories != null) {
	      setIncludeDirectories(Arrays.asList(includeDirectories));
	    }
	  }

	  public List<String> getIncludeDirectories() {
	    Set<String> allIncludes = new HashSet<>();
	    
	    for(Set<String> elemSet : uniqueIncludes.values()) {
	      for(String value : elemSet) {
	        if (!allIncludes.contains(value)) {
	          allIncludes.add(value);
	        }
	      }
	    }
	    
	    return new ArrayList<>(allIncludes);
	  }

	  public void setForceIncludeFiles(List<String> forceIncludeFiles) {
	    this.forceIncludeFiles = forceIncludeFiles;
	  }

	  public void setForceIncludeFiles(String[] forceIncludeFiles) {
	    if (forceIncludeFiles != null) {
	      setForceIncludeFiles(Arrays.asList(forceIncludeFiles));
	    }
	  }

	  public List<String> getForceIncludeFiles() {
	    return forceIncludeFiles;
	  }

	  public void setBaseDir(String baseDir) {
	    this.baseDir = baseDir;
	  }

	  public String getBaseDir() {
	    return baseDir;
	  }

	  public void setErrorRecoveryEnabled(boolean errorRecoveryEnabled){
	    this.errorRecoveryEnabled = errorRecoveryEnabled;
	  }

	  public boolean getErrorRecoveryEnabled(){
	    return this.errorRecoveryEnabled;
	  }

	  public List<String> getCFilesPatterns() {
	    return cFilesPatterns;
	  }

	  public void setCFilesPatterns(String[] cFilesPatterns) {
	    if (this.cFilesPatterns != null) {
	      this.cFilesPatterns = Arrays.asList(cFilesPatterns);
	    }
	  }

	  public void setHeaderFileSuffixes(List<String> headerFileSuffixes) {
	      this.headerFileSuffixes = headerFileSuffixes;
	  }

	  public void setHeaderFileSuffixes(String[] headerFileSuffixes) {
	    if (headerFileSuffixes != null) {
	      setHeaderFileSuffixes(Arrays.asList(headerFileSuffixes));
	    }
	  }

	  public List<String> getHeaderFileSuffixes() {
	    return this.headerFileSuffixes;
	  }

	  public void setMissingIncludeWarningsEnabled(boolean enabled){
	    this.missingIncludeWarningsEnabled = enabled;
	  }

	  public boolean getMissingIncludeWarningsEnabled(){
	    return this.missingIncludeWarningsEnabled;
	  }
	  
	  public void setCompilationPropertiesWithBuildLog(List<File> reports,
	          String fileFormat,
	          String charsetName) {
	    
	    if(reports == null) {
	      return;
	    }
	    
	    for(File buildLog : reports) {
	      if (buildLog.exists()) {
	        LOG.debug("Parse build log  file '{}'", buildLog.getAbsolutePath());
	        if (fileFormat.equals("Visual C++")) {
	          //cxxVCppParser.parseVCppLog(buildLog, baseDir, charsetName);
	        }

	        LOG.debug("Parse build log OK: includes: '{}' defines: '{}'", uniqueIncludes.size(), uniqueDefines.size());
	      } else {
	        LOG.error("Compilation log not found: '{}'", buildLog.getAbsolutePath());
	      }    
	    }
	    
	    if(activeRule != null) {
	     // RaiseIssuesForNotFoundIncludes(activeRule, fs);  
	    }     
	  }

	 /* private void RaiseIssuesForNotFoundIncludes(ActiveRule rule, FileSystem fs ) {
	    
	    
	    // raise issues for files that have invalid include folders
	    for(Map.Entry<String, Set<String>> entry : uniqueIncludes.entrySet()) {
	      if(!entry.getKey().equals(OverallIncludeKey)) {
	        
	        for(String value : entry.getValue()) {
	          try
	          {
	            File directory = new File(entry.getKey());
	            if (!directory.exists()) {
	              InputFile sonarFile = fs.inputFile(fs.predicates().hasAbsolutePath(value));
	              Issuable issuable = perspectives.as(Issuable.class, sonarFile);
	              if ((issuable != null) && (rule != null)) {
	                Issue issue = issuable.newIssueBuilder()
	                    .ruleKey(rule.ruleKey())
	                    .line(1)
	                    .message("Remove include from poject files, \"" + value + "\" it does not exist.")
	                    .build();
	                issuable.addIssue(issue);
	              }            
	            }            
	          } catch(IllegalArgumentException ex) {
	            LOG.warn("Cannot Create Issue for: '{}' reason: '{}'", value, ex.getMessage());
	          }
	      }
	    }
	  }
	  }*/
	}