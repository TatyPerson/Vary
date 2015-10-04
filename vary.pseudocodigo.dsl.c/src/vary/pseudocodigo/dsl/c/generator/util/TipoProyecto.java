package vary.pseudocodigo.dsl.c.generator.util;

public class TipoProyecto {
	
	private static String tipo;
	
	private TipoProyecto() {
		tipo = "No";
	}
	
	public static void setTipoProyecto(String tipoAux) {
		tipo = tipoAux;
	}
	
	public static String getTipoProyecto() {
		return tipo;
	}

}
