package vary.pseudocodigo.dsl.c.english.generator.util;

public class ProjectEmpty {
	
	private static boolean empty;
	
	public ProjectEmpty() {
		empty = false;
	}
	
	public static void setEmptyOption(boolean emptyAux) {
		empty = emptyAux;
	}
	
	public static boolean getEmptyOption() {
		return empty;
	}
}
