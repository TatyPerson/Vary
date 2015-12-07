package vary.pseudocodigo.dsl.c.ui.sintaxcoloring;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import vary.pseudocodigo.dsl.c.keywords.ReadKeywords;
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface;

import com.google.inject.Inject;

public class VaryAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	protected final ReadKeywordsInterface readerKeywords;
	
	@Inject
	public VaryAntlrTokenToAttributeIdMapper() {
		readerKeywords = new ReadKeywords();
	}
	
	public VaryAntlrTokenToAttributeIdMapper(String language) {
		readerKeywords = new vary.pseudocodigo.dsl.c.english.keywords.ReadKeywords();
	}
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.println("El token es: "+tokenName);
		if(("'"+ readerKeywords.getBundle().getString("KEYWORD_ALGORITMO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_ALGORITMO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_MODULO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_MODULO") + "'").equals(tokenName)) {
			return VaryHighLightingConfiguration.ALGORITMO_ID;
		} else if(("'"+ readerKeywords.getBundle().getString("KEYWORD_IMPORTA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_IMPORTA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_CONST") + "'").equals(tokenName)	|| 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_TIPO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_VAR") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_PRINCIPAL") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_INICIO") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_INICIO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_EXPORTA") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_EXPORTA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_IMPLEMENTACION") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_IMPLEMENTACION") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_PRINCIPAL") + "'").equals(tokenName)) {
			return VaryHighLightingConfiguration.PRINCIPALES_ID;
		} else if(("'"+ readerKeywords.getBundle().getString("KEYWORD_VECTOR") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_MATRIZ") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_REGISTRO") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_REGISTRO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_ARCHIVO") + " '").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_DE") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FUNCION") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_FUNCION") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_PROCEDIMIENTO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_PROCEDIMIENTO") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_DOS_PUNTOS") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_DOS_PUNTOS_SUSPENSIVOS") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_LLAVE_IZQ") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_LLAVE_DER") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_DEVOLVER") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_ASIGNACION") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_LEER") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_ESCRIBIR") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_ABRIR") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_CERRAR") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_PUNTO") + "'").equals(tokenName))  {
			return VaryHighLightingConfiguration.TIPOS_ID;
		} else if(("'"+ readerKeywords.getBundle().getString("KEYWORD_ENTERO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_REAL") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_LOGICO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_CADENA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_CARACTER") + "'").equals(tokenName)) {
			return VaryHighLightingConfiguration.DECLARACIONES_ID;
		} else if(("'"+ readerKeywords.getBundle().getString("KEYWORD_DESDE") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_HASTA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_HACER") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_DESDE") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_MIENTRAS") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_MIENTRAS").concat("(") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_MIENTRAS") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_SI") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_SI").concat("(") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_ENTONCES") + "'").equals(tokenName) || 
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_SI") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_REPETIR") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_HASTA_QUE") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_HASTA_QUE").concat("(") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_CASO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_SEGUN_SEA") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_SEGUN_SEA").concat("(") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_EN_OTRO_CASO") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_FIN_SEGUN") + "'").equals(tokenName) ||
				("'"+ readerKeywords.getBundle().getString("KEYWORD_SINO") + "'").equals(tokenName)) {
			return VaryHighLightingConfiguration.GENERAL_ID;
		} else if("RULE_CAD".equals(tokenName) || "RULE_CAR".equals(tokenName)) {
			return VaryHighLightingConfiguration.CADENA_ID;
		} 
		return super.calculateId(tokenName, tokenType);
	}
}
