package org.sonar.vary.checks;

import java.util.List;

import com.google.common.collect.ImmutableList;

public final class CheckList {

  public static final String REPOSITORY_KEY = "vary";

  public static final String DEFAULT_PROFILE = "Sonar way";

  private CheckList() {
  }
  
  @SuppressWarnings("rawtypes")
  public static List<Class> getChecks() {
    return ImmutableList.<Class>of(
    	FileComplexityCheck.class,
    	TooLongLineCheck.class,
    	TooManyGlobalVariables.class,
    	TooLongNameVariable.class,
    	TooMuchComplexityMain.class,
    	MissingCommentsBeforeSubprocess.class
    /*
      CollapsibleIfCandidateCheck.class,
      CommentedCodeCheck.class,
      CommentRegularExpressionCheck.class,
      CycleBetweenPackagesCheck.class,
      DuplicatedIncludeCheck.class,
      FileComplexityCheck.class,
      FileHeaderCheck.class,
      FileEncodingCheck.class,
      FileRegularExpressionCheck.class,
      LineRegularExpressionCheck.class,
      FixmeTagPresenceCheck.class,
      FunctionComplexityCheck.class,
      HardcodedAccountCheck.class,
      HardcodedIpCheck.class,
      IndentationCheck.class,
      MagicNumberCheck.class,
      MissingCurlyBracesCheck.class,
      MissingIncludeFileCheck.class,
      MissingNewLineAtEndOfFileCheck.class,
      NoSonarCheck.class,
      ParsingErrorCheck.class,
      ParsingErrorRecoveryCheck.class,
      ReservedNamesCheck.class,
      StringLiteralDuplicatedCheck.class,
      SwitchLastCaseIsDefaultCheck.class,
      TabCharacterCheck.class,
      TodoTagPresenceCheck.class,
      TooLongLineCheck.class,
      TooManyLinesOfCodeInFileCheck.class,
      TooManyStatementsPerLineCheck.class,
      UndocumentedApiCheck.class,
      UnnamedNamespaceInHeaderCheck.class,
      UselessParenthesesCheck.class,
      UseCorrectTypeCheck.class,
      UsingNamespaceInHeaderCheck.class,
      SafetyTagCheck.class,
      UseCorrectIncludeCheck.class,
      XPathCheck.class,
      BooleanEqualityComparisonCheck.class,
      CompileIncludePathNotFoundOrInvalid.class
      */
    );
  }

}
