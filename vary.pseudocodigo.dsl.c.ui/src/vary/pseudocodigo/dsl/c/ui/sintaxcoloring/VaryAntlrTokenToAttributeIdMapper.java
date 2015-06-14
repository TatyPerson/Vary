package vary.pseudocodigo.dsl.c.ui.sintaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class VaryAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if("'Algoritmo'".equals(tokenName) || "'fin_algoritmo'".equals(tokenName) ||
				"'Modulo'".equals(tokenName) || "'fin_modulo'".equals(tokenName)) {
			return VaryHighLightingConfiguration.ALGORITMO_ID;
		} else if("'importa'".equals(tokenName) || "'fin_importa'".equals(tokenName) ||
				"'const'".equals(tokenName)	|| "'tipo'".equals(tokenName) ||
				"'var'".equals(tokenName) || "'principal'".equals(tokenName) ||
				"'inicio'".equals(tokenName) || "'fin_inicio'".equals(tokenName) ||
				"'exporta'".equals(tokenName) || "'fin_exporta'".equals(tokenName) ||
				"'implementacion'".equals(tokenName) || "'fin_implementacion'".equals(tokenName)) {
			return VaryHighLightingConfiguration.PRINCIPALES_ID;
		} else if("'vector'".equals(tokenName) || "'matriz'".equals(tokenName) ||
				"'registro:'".equals(tokenName) || "'fin_registro'".equals(tokenName) ||
				"'vector'".equals(tokenName) || "'archivo de '".equals(tokenName) ||
				"'de'".equals(tokenName) || "'funcion'".equals(tokenName) ||
				"'fin_funcion'".equals(tokenName) || "'procedimiento'".equals(tokenName) ||
				"'fin_procedimiento'".equals(tokenName) || "':'".equals(tokenName) ||
				"'..'".equals(tokenName) || "'{'".equals(tokenName) ||
				"'}'".equals(tokenName) || "'devolver'".equals(tokenName) ||
				"'<-'".equals(tokenName) || "'leer'".equals(tokenName) ||
				"'escribir'".equals(tokenName) || "'abrir'".equals(tokenName) ||
				"'cerrar'".equals(tokenName)) {
			return VaryHighLightingConfiguration.TIPOS_ID;
		} else if("'entero'".equals(tokenName) || "'real'".equals(tokenName) ||
				"'logico'".equals(tokenName) || "'cadena'".equals(tokenName) ||
				"'caracter'".equals(tokenName)) {
			return VaryHighLightingConfiguration.DECLARACIONES_ID;
		} else if("'desde'".equals(tokenName) || "'hasta'".equals(tokenName) ||
				"'hacer'".equals(tokenName) || "'fin_desde'".equals(tokenName) || 
				"'mientras'".equals(tokenName) || "'fin_mientras'".equals(tokenName) ||
				"'si'".equals(tokenName) || "'entonces'".equals(tokenName) || 
				"'fin_si'".equals(tokenName) || "'repetir'".equals(tokenName) ||
				"'hasta_que'".equals(tokenName) || "'caso'".equals(tokenName) ||
				"'segun_sea'".equals(tokenName) || "'en_otro_caso:'".equals(tokenName) ||
				"'fin_segun'".equals(tokenName) || "'sino'".equals(tokenName)) {
			return VaryHighLightingConfiguration.GENERAL_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
}
