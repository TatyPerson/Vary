package vary.pseudocodigo.dsl.c.english.scoping;

import java.util.List;

import org.eclipse.xtext.scoping.IScope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;

import vary.pseudocodigo.dsl.c.scoping.VaryGrammarGlobalScopeProvider;

import com.google.common.base.Predicate;
import com.google.inject.Singleton;

import diagramapseudocodigo.Modulo;

@Singleton
public class VaryGrammarEnglishGlobalScopeProvider extends VaryGrammarGlobalScopeProvider {

	/*private List<String> accessibleObjects;

	@Override
	public IScope getScope(Resource resource, EReference reference, Predicate<IEObjectDescription> filter) {
		if(filter==null){
			filter = new Predicate<IEObjectDescription>() {

				@Override
				public boolean apply(IEObjectDescription input) {
					if(accessibleObjects != null){
						URI uri = EcoreUtil2.getURI(input.getEObjectOrProxy());
						if(uri.hasFragment()){
							return accessibleObjects.contains(uri.fragment());
						}
						return false;
					}
					return true;
				}
			};
		}
		return super.getScope(resource, reference, filter);
	}

	public void setAccessibleEObjects(List<String> accessibleObjects) {
		this.accessibleObjects = accessibleObjects;
	}
	
	protected IScope createContainerScopeWithContext(Resource eResource, IScope parent, IContainer container,
			Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase) {
		return createContainerScope(parent, container, filter, type, ignoreCase);
	}*/
	
}
