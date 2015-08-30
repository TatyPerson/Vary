package org.sonar.vary.plugin;

import java.util.ArrayList;
import java.util.List;

import org.sonar.api.PropertyType;
import org.sonar.api.SonarPlugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;
import org.sonar.vary.plugin.coverage.VaryCoverageSensor;
import org.sonar.vary.plugin.externalrules.VaryExternalRuleRepository;
import org.sonar.vary.plugin.externalrules.VaryExternalRulesSensor;
import org.sonar.vary.plugin.squid.VarySquidSensor;
import org.sonar.vary.plugin.utils.VaryMetrics;
import org.sonar.vary.plugin.xunit.VaryXunitSensor;

import com.google.common.collect.ImmutableList;

/**
 * {@inheritDoc}
 */
public final class VaryPlugin extends SonarPlugin {
  static final String SOURCE_FILE_SUFFIXES_KEY = "sonar.vary.suffixes.sources";
  public static final String FILE_SUFFIXES_DEFVALUE = ".p,.ep";
  public static final String HEADER_FILE_SUFFIXES_KEY = "sonar.vary.suffixes.headers";
  public static final String DEFINES_KEY = "sonar.vary.defines";  
  public static final String INCLUDE_DIRECTORIES_KEY = "sonar.vary.includeDirectories";
  public static final String ERROR_RECOVERY_KEY = "sonar.vary.errorRecoveryEnabled";
  public static final String FORCE_INCLUDE_FILES_KEY = "sonar.vary.forceIncludes";
  public static final String MISSING_INCLUDE_WARN = "sonar.vary.missingIncludeWarnings";

  private static List<PropertyDefinition> generalProperties() {
    String subcateg = "(1) General";
    return ImmutableList.of(
    
      PropertyDefinition.builder(SOURCE_FILE_SUFFIXES_KEY)
      .defaultValue(VaryLanguage.DEFAULT_FILE_SUFFIXES)
      .name("Source files suffixes")
      .description("Comma-separated list of suffixes for source files to analyze. Leave empty to use the default.")
      .subCategory(subcateg)
      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
      .index(1)
      .build(),

      PropertyDefinition.builder(DEFINES_KEY)
      .name("Default macros")
      .description("Additional macro definitions (one per line) to use when analysing the source code. Use to provide macros which cannot be resolved by other means."
                   + " Use the 'force includes' setting to inject more complex, multi-line macros.")
      .subCategory(subcateg)
      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
      .type(PropertyType.TEXT)
      .index(5)
      .build(),     

      PropertyDefinition.builder(VaryPlugin.ERROR_RECOVERY_KEY)
      .defaultValue("False")
      .name("Parse error recovery")
      .description("Enables/disables the parse error recovery (experimental).")
      .subCategory(subcateg)
      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
      .type(PropertyType.BOOLEAN)
      .index(7)              
      .build(),
      PropertyDefinition.builder(VaryPlugin.MISSING_INCLUDE_WARN)
      .defaultValue("True")
      .name("Missing include warnings")
      .description("Enables/disables the warnings when included files could not be found.")
      .subCategory(subcateg)
      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
      .type(PropertyType.BOOLEAN)
      .index(8)   
      .build()
      );
  }

	  private static List<PropertyDefinition> compilerWarningsProperties() {
	    String subcateg = "(4) Compiler warnings";
	    return ImmutableList.of();
	  }

	  private static List<PropertyDefinition> testingAndCoverageProperties() {
	    String subcateg = "(3) Testing & Coverage";
	    return ImmutableList.of(
	      PropertyDefinition.builder(VaryXunitSensor.REPORT_PATH_KEY)
	      .name("Unit test execution report(s)")
	      .description("Path to unit test execution report(s), relative to projects root."
	                   + " See <a href='https://github.com/wenns/sonar-cxx/wiki/Get-test-execution-metrics' for supported formats."
	                   + " Use <a href='https://ant.apache.org/manual/dirtasks.html'>Ant-style wildcards</a> if neccessary.")
	      .subCategory(subcateg)
	      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
	      .index(5)
	      .build(),

	      PropertyDefinition.builder(VaryXunitSensor.XSLT_URL_KEY)
	      .name("XSLT transformer")
	      .description("By default, the unit test execution reports are expected to be in the JUnitReport format."
	                   + " To import a report in an other format, set this property to an URL to a XSLT stylesheet which is able to perform the according transformation.")
	      .subCategory(subcateg)
	      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
	      .index(6)
	      .build(),

	      PropertyDefinition.builder(VaryXunitSensor.PROVIDE_DETAILS_KEY)
	      .name("Provide test execution details")
	      .description("If 'True', tries to assign testcases in report to test resources in SonarQube, "
	                   + "thus making the drillown to details possible")
	      .defaultValue("False")
	      .subCategory(subcateg)
	      .onQualifiers(Qualifiers.PROJECT, Qualifiers.MODULE)
	      .type(PropertyType.BOOLEAN)
	      .index(7)
	      .build());
	  }

  /**
   * {@inheritDoc}
   */
  public List getExtensions() {
    List<Object> l = new ArrayList<Object>();
    l.add(VaryLanguage.class);
    l.add(VaryMetrics.class);
    l.add(VarySquidSensor.class);
    l.add(VaryCpdMapping.class);
    //l.add(CxxRatsRuleRepository.class);
    //l.add(CxxRatsSensor.class);
    l.add(VaryXunitSensor.class);
    l.add(VaryCoverageSensor.class);
    //l.add(CxxCppCheckRuleRepository.class);
    //l.add(CxxCppCheckSensor.class);
    //l.add(CxxPCLintRuleRepository.class);
    //l.add(CxxPCLintSensor.class);
    //l.add(CxxCompilerVcRuleRepository.class);
    //l.add(CxxCompilerGccRuleRepository.class);
    //l.add(CxxCompilerSensor.class);
    //l.add(CxxVeraxxRuleRepository.class);
    //l.add(CxxVeraxxSensor.class);
    //l.add(CxxValgrindRuleRepository.class);
    //l.add(CxxValgrindSensor.class);
    l.add(VaryDefaultProfile.class);
    l.add(VaryCommonRulesEngine.class);
    l.add(VaryCommonRulesDecorator.class);
    l.add(VaryRuleRepository.class);
    l.add(VaryExternalRulesSensor.class);
    l.add(VaryExternalRuleRepository.class);
    //l.add(MSTestResultsAggregator.class);
    //l.add(MSTestResultsImportSensor.class);

    l.addAll(generalProperties());
    //l.addAll(codeAnalysisProperties());
    l.addAll(testingAndCoverageProperties());
    l.addAll(compilerWarningsProperties());

    return l;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
