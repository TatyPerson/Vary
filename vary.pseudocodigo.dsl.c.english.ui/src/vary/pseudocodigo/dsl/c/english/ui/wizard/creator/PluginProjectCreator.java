package vary.pseudocodigo.dsl.c.english.ui.wizard.creator;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

public abstract class PluginProjectCreator extends AbstractProjectCreator {
	
	@Inject
	private Provider<PluginProjectFactory> projectFactoryProvider;
	
	@Override
	protected ProjectFactory configureProjectFactory(ProjectFactory factory) {
		PluginProjectFactory result = (PluginProjectFactory) super.configureProjectFactory(factory);
		
		result.addRequiredBundles(getRequiredBundles());
		result.addExportedPackages(getExportedPackages());
		result.addImportedPackages(getImportedPackages());
		result.setActivatorClassName(getActivatorClassName());
		
		return result;
	}
	
	@Override
	protected PluginProjectFactory createProjectFactory() {
		return projectFactoryProvider.get();
	}
	
	protected List<String> getRequiredBundles() {
		return Lists.newArrayList(
			"com.ibm.icu",
			"org.eclipse.xtext", 
			"org.eclipse.xtext.generator",
			"org.eclipse.xtend",
			"org.eclipse.xtend.typesystem.emf",
			"org.eclipse.xpand", 
			"de.itemis.xtext.antlr;resolution:=optional",
			"org.eclipse.emf.mwe2.launch;resolution:=optional");
	}
	
	protected List<String> getExportedPackages() {
        return Collections.emptyList();
    }
	
	protected List<String> getImportedPackages() {
        return Lists.newArrayList(
        		"org.apache.log4j", 
        		"org.apache.commons.logging");
    }
	
	protected String getActivatorClassName() {
        return null;
    }

}
