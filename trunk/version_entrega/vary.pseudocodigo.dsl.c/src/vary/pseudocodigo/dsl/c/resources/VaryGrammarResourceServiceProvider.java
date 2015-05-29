package vary.pseudocodigo.dsl.c.resources;

import org.eclipse.xtext.resource.DescriptionUtils;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.generic.GenericResourceServiceProvider;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.emf.common.util.URI;

import diagramapseudocodigo.DiagramapseudocodigoPackage;

public class VaryGrammarResourceServiceProvider extends GenericResourceServiceProvider implements IResourceServiceProvider {

private DefaultResourceDescriptionManager resourceDescriptionManager = new VaryGrammarResourceDescriptionManager();
	
	public VaryGrammarResourceServiceProvider(){
		VaryGrammarResourceDescriptionStrategy strategy = new VaryGrammarResourceDescriptionStrategy();
		resourceDescriptionManager.setStrategy(strategy);
		resourceDescriptionManager.setDescriptionUtils(new DescriptionUtils());
		resourceDescriptionManager.setContainerManager(new SimpleResourceDescriptionsBasedContainerManager());
	}
	
	public IResourceDescription.Manager getResourceDescriptionManager() {
		return resourceDescriptionManager;
	}
	
	public boolean canHandle(URI uri) {
		return uri.fileExtension().equals("vyc");
	}
	
	@Override
	public <T> T get(Class<T> t) {
		return null;
	}	
}
