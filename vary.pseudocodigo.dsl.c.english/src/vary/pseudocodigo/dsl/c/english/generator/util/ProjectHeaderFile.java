package vary.pseudocodigo.dsl.c.english.generator.util;

public class ProjectHeaderFile {
	
	private static boolean headerFile;
	
	public ProjectHeaderFile() {
		headerFile = false;
	}
	
	public static void setHeaderOption(boolean headerFileAux) {
		headerFile = headerFileAux;
	}
	
	public static boolean getHeaderOption() {
		return headerFile;
	}
}
