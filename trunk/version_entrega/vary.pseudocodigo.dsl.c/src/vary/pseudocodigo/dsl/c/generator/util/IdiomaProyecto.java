package vary.pseudocodigo.dsl.c.generator.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class IdiomaProyecto {

	private static String idioma;
	public static ResourceBundle bundle;
	
	public IdiomaProyecto() {
		idioma = "Spanish";
	}
	
	public static void setIdiomaProyecto(String idiomaAux) {
		idioma = idiomaAux;
		if(idioma.equals("English")) {
			Locale englishLocale = new Locale("en", "US");
			bundle = ResourceBundle.getBundle("Language", englishLocale);
		}
	}
	
	public static String getIdiomaProyecto() {
		return idioma;
	}
	
	public static ResourceBundle getBundleLanguage() {
		return bundle;
	}
	
}
