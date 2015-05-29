package vary.pseudocodigo.dsl.c.ui.quickfix.util;

public class VaryGrammarQuickfixProviderUtil {
	
	public static String buscarIndiceVector(String cadena) {
		String indice = "";
		boolean esIndice = false;
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i) == ']') {
				esIndice = false;
			}
			if(esIndice) {
				indice = indice + cadena.charAt(i);
			}
			if(cadena.charAt(i) == '[') {
				esIndice = true;
			}
		}
		return indice;
	}
	
}
