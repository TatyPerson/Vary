package vary.pseudocodigo.dsl.c.generator.util;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;

public class ProjectLocationFolder {
	static String path;
	static String OS;
	static final Logger logger = Logger.getLogger(ProjectLocationFolder.class);
	static Resource resource;
	
	public static void setPath(String path) {
		ProjectLocationFolder.path = path;
	}
	
	public static String getPath() {

		//Corrigiendo bug: Cuando Eclipse se cierra se pierde la ruta del proyecto 
		//para leer el fichero .vary
		ProjectLocationFolder.setPath(resource.getURI().toString());
		String nombreProyecto = resource.getURI().toString().replaceAll("src.*", "");
		nombreProyecto = nombreProyecto.replaceAll("platform:/resource", "");
		ProjectLocationFolder.setPath(Platform.getLocation().toString() + nombreProyecto);

		return path;
	}
	
	public static void setResource(Resource resource) {
		ProjectLocationFolder.resource = resource;
	}
	
	public static void setOS(String OS) {
		ProjectLocationFolder.OS = OS;
	}
	
	public static String getOS() {
		if(OS == null) {
			if(Platform.getOS().equals(Platform.OS_MACOSX)) {
				ProjectLocationFolder.setOS("MACOSX");
			}
			else if(Platform.getOS().equals(Platform.OS_WIN32)) {
				ProjectLocationFolder.setOS("WIN32");
			}
			else if(Platform.getOS().equals(Platform.OS_LINUX)) {
				ProjectLocationFolder.setOS("LINUX");
			}
		}
		return OS;
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
}
