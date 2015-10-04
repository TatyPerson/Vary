package vary.pseudocodigo.dsl.c.english.generator.util;

import org.apache.log4j.Logger;

public class ProjectLocationFolder {
	private static String path;
	private static String OS;
	private static final Logger LOGGER = Logger.getLogger(ProjectLocationFolder.class);
	
	private ProjectLocationFolder() {
		
	}
	
	public static void setPath(String path) {
		ProjectLocationFolder.path = path;
	}
	
	public static String getPath() {
		return path;
	}
	
	public static void setOS(String osAux) {
		ProjectLocationFolder.OS = osAux;
	}
	
	public static String getOS() {
		return OS;
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}
	
}
