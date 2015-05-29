package vary.pseudocodigo.dsl.c.resources;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;

import com.google.inject.Provider;

public class VaryGrammarResourceDescriptionManager extends DefaultResourceDescriptionManager {
	
	/*protected IResourceDescription internalGetResourceDescription(Resource resource,
			VaryGrammarResourceDescriptionStrategy strategy) {
		return new VaryGrammarResourceDescription(resource, strategy);
	}*/
	
	private static final String CACHE_KEY = VaryGrammarResourceDescriptionManager.class.getName() + "#getResourceDescription";
	private IDefaultResourceDescriptionStrategy localStrategy;
	
	@Override
	public IResourceDescription getResourceDescription(final Resource resource) {
		return getCache().get(CACHE_KEY, resource, new Provider<IResourceDescription>() {
			public IResourceDescription get() {
				return internalGetResourceDescription(resource, localStrategy);
			}
		});
	}
	
	protected IResourceDescription internalGetResourceDescription(Resource resource, IDefaultResourceDescriptionStrategy strategy) {
		return new VaryGrammarResourceDescription(resource, (DefaultResourceDescriptionStrategy) strategy, getCache());
	}
	
	public void setStrategy(IDefaultResourceDescriptionStrategy strategy) {
		super.setStrategy(strategy);
		this.localStrategy = strategy;
	}
	
}
