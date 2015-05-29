package vary.pseudocodigo.dsl.c.validation;
import org.eclipse.emf.ecore.resource.Resource;
import java.util.HashMap;
import java.util.Map;

public class RecursosCompartidos {
	public static Map<Resource, String> modulos;
	
	RecursosCompartidos() {
		if(modulos == null) {
			modulos = new HashMap<Resource,String>();
		}
	}
	
}
