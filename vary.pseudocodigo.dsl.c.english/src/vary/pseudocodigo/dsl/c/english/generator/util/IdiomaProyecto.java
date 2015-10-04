package vary.pseudocodigo.dsl.c.english.generator.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class IdiomaProyecto {

	private static String idioma;
	private static ResourceBundle bundle;
	
	private IdiomaProyecto() {
		idioma = "English";
		Locale englishLocale = new Locale("en", "US");
		bundle = ResourceBundle.getBundle("Language", englishLocale);
	}
	
	public static String getIdiomaProyecto() {
		return idioma;
	}
	
	public static ResourceBundle getBundleLanguage() {
		return bundle;
	}
	
}
