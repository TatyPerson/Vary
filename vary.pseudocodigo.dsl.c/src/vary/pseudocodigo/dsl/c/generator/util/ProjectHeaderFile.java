package vary.pseudocodigo.dsl.c.generator.util;

public class ProjectHeaderFile {
	
	private static boolean headerFile;
	
	private ProjectHeaderFile() {
		headerFile = false;
	}
	
	public static void setHeaderOption(boolean headerFileAux) {
		headerFile = headerFileAux;
	}
	
	public static boolean getHeaderOption() {
		return headerFile;
	}
}
