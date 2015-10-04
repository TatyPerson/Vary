package vary.pseudocodigo.dsl.c.resources;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import diagramapseudocodigo.DiagramapseudocodigoPackage;

public class VaryGrammarResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy implements IDefaultResourceDescriptionStrategy {
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		if(DiagramapseudocodigoPackage.Literals.MODULO.equals(eObject.eClass())|| DiagramapseudocodigoPackage.Literals.ALGORITMO.equals(eObject.eClass())){
			return super.createEObjectDescriptions(eObject, acceptor);
		}
		return true;
	}

}
