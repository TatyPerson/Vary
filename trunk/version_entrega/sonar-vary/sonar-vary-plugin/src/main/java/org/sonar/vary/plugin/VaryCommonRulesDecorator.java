package org.sonar.vary.plugin;

import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.resources.ProjectFileSystem;
import org.sonar.commonrules.api.CommonRulesDecorator;

public class VaryCommonRulesDecorator extends CommonRulesDecorator {
	public VaryCommonRulesDecorator(ProjectFileSystem fs, RulesProfile qProfile) {
	    super(VaryLanguage.KEY, fs, qProfile);
	  }
}
