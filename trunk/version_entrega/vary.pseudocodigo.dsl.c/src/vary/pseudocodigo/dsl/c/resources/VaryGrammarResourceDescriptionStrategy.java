package vary.pseudocodigo.dsl.c.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import diagramapseudocodigo.Modulo;

public class VaryGrammarResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy implements IDefaultResourceDescriptionStrategy {
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		System.out.println("Estoy en to la strategy");
		if(DiagramapseudocodigoPackage.Literals.MODULO.equals(eObject.eClass())|| DiagramapseudocodigoPackage.Literals.ALGORITMO.equals(eObject.eClass())){
			return super.createEObjectDescriptions(eObject, acceptor);
		}
		return true;
	}
	
	/*@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	private static List<IEObjectDescription> eobjectsDescriptionModules = new ArrayList<IEObjectDescription>();
	private static List<IEObjectDescription> eobjectsDescriptionAlgorithms = new ArrayList<IEObjectDescription>();
	
	public static List<IEObjectDescription> getAllIEObjectsDescriptionModules() {
		return eobjectsDescriptionModules;
	}
	
	public static List<IEObjectDescription> getAllIEObjectsDescriptionAlgorithms() {
		return eobjectsDescriptionAlgorithms;
	}
	
	public static void clearAllIEObjectsDescription() {
		eobjectsDescriptionModules.clear();
		eobjectsDescriptionAlgorithms.clear();
	}
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject,
			IAcceptor<IEObjectDescription> acceptor) {
		System.out.println("Estoy entrando en el Strategy!");

		if (eObject instanceof Modulo) {
			acceptor.accept(createModuleDescription((Modulo) eObject,
					qualifiedNameProvider));
			return false;
		} else if (eObject instanceof Algoritmo) {
			acceptor.accept(createAlgoritmoDescription((Algoritmo) eObject,
					qualifiedNameProvider));
			return false;
		} else {
			return false;
		}
	}

	@Override
	public boolean createReferenceDescriptions(EObject eObject,
			URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static IEObjectDescription createModuleDescription(Modulo modulo,
			IQualifiedNameProvider nameProvider) {
		//QualifiedName name = nameProvider.getFullyQualifiedName(modulo);
		QualifiedName name = QualifiedName.create(modulo.getNombre());
		System.out.println("Estoy insertando el modulo!");
		//if (name != null) {
			Map<String, String> userData = new HashMap<String, String>();
			userData.put("nombre",
					modulo.getNombre());
			eobjectsDescriptionModules.add(EObjectDescription.create(name, modulo, userData));
			return EObjectDescription.create(name, modulo, userData);
		//}

		//return null;
	}
	
	public static IEObjectDescription createAlgoritmoDescription(Algoritmo algoritmo,
			IQualifiedNameProvider nameProvider) {
		//QualifiedName name = nameProvider.getFullyQualifiedName(algoritmo);
		QualifiedName name = QualifiedName.create(algoritmo.getNombre());
		System.out.println("Qualified name de algoritmo: "+name);
		//if (name != null) {
			Map<String, String> userData = new HashMap<String, String>();
			userData.put("nombre",
					algoritmo.getNombre());
			eobjectsDescriptionAlgorithms.add(EObjectDescription.create(name, algoritmo, userData));
			return EObjectDescription.create(name, algoritmo, userData);
		//}

		//return null;
	}*/

}
