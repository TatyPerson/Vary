package vary.pseudocodigo.dsl.c.english.generator.util;

import org.apache.log4j.Logger;

public class ProjectLocationFolder {
	static String path;
	static String OS;
	static final Logger logger = Logger.getLogger(ProjectLocationFolder.class);
	
	public static void setPath(String path) {
		ProjectLocationFolder.path = path;
	}
	
	public static String getPath() {
		return path;
	}
	
	public static void setOS(String OS) {
		ProjectLocationFolder.OS = OS;
	}
	
	public static String getOS() {
		return OS;
	}
	
	public static Logger getLogger() {
		return logger;
	}
	
}
