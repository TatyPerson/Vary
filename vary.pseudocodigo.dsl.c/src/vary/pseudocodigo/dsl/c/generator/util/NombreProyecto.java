package vary.pseudocodigo.dsl.c.generator.util;

public class NombreProyecto {
	
	private static String nombre;
	
	private NombreProyecto() {
		nombre = "";
	}
	
	public static void setNombreProyecto(String nombreAux) {
		nombre = nombreAux;
	}
	
	public static String getNombreProyecto() {
		return nombre;
	}

}
