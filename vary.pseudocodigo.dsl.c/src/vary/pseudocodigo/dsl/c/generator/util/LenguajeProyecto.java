package vary.pseudocodigo.dsl.c.generator.util;

public class LenguajeProyecto {
	
private static String lenguaje;
	
	public LenguajeProyecto() {
		lenguaje = "C";
	}
	
	public static void setLenguajeProyecto(String lenguajeAux) {
		lenguaje = lenguajeAux;
	}
	
	public static String getLenguajeProyecto() {
		return lenguaje;
	}

}
