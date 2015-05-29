package vary.pseudocodigo.dsl.c.generator.util;

public class NombreProyecto {
	
	private static String nombre;
	
	public NombreProyecto() {
		nombre = "";
	}
	
	public static void setNombreProyecto(String nombreAux) {
		nombre = nombreAux;
	}
	
	public static String getNombreProyecto() {
		return nombre;
	}

}
