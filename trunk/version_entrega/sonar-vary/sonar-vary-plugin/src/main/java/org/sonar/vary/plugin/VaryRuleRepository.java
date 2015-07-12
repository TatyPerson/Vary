package org.sonar.vary.plugin;

import java.io.StringReader;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.sonar.api.config.Settings;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;
import org.sonar.api.server.rule.RulesDefinition.Context;
import org.sonar.api.server.rule.RulesDefinition.NewRepository;
import org.sonar.vary.checks.CheckList;
import org.sonar.vary.plugin.utils.VaryUtils;
import org.sonar.squidbridge.annotations.AnnotationBasedRulesDefinition;

public class VaryRuleRepository implements RulesDefinition {
  /*public final Settings settings;
  private final RulesDefinitionXmlLoader xmlRuleLoader;
  public static final String RULES_KEY = "sonar.vary.rules";
	
  public VaryRuleRepository(RulesDefinitionXmlLoader xmlRuleLoader, Settings settings) {	
	 this.xmlRuleLoader = xmlRuleLoader;
	 this.settings = settings;
  }*/

  @Override
  public void define(Context context) {
	  final String languageKey = VaryLanguage.KEY;
      final String repositoryKey = CheckList.REPOSITORY_KEY;

      @SuppressWarnings("rawtypes")
      final List<Class> list = CheckList.getChecks();

      final NewRepository repository
          = context.createRepository(repositoryKey, languageKey)
          .setName("SonarQube");

      AnnotationBasedRulesDefinition.load(repository, languageKey, list);
      
      for (NewRule rule : repository.rules()) {
          //FIXME: set internal key to key to ensure rule templates works properly : should be removed when SONAR-6162 is fixed.
          rule.setInternalKey(rule.key());
      }

      repository.done();
  }
  
  
}
