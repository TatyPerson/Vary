package vary.pseudocodigo.dsl.c.english.ui.sintaxcoloring;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import vary.pseudocodigo.dsl.c.ui.sintaxcoloring.VaryHighLightingConfiguration;

public class VaryAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		System.out.println("El token es: "+tokenName);
		if("'Algorithm'".equals(tokenName) || "'end_algorithm'".equals(tokenName) ||
				"'Module'".equals(tokenName) || "'end_module'".equals(tokenName)) {
			return VaryHighLightingConfiguration.ALGORITMO_ID;
		} else if("'import'".equals(tokenName) || "'end_import'".equals(tokenName) ||
				"'const'".equals(tokenName)	|| "'type'".equals(tokenName) ||
				"'var'".equals(tokenName) || "'main'".equals(tokenName) ||
				"'initiation'".equals(tokenName) || "'end_initiation'".equals(tokenName) ||
				"'export'".equals(tokenName) || "'end_export'".equals(tokenName) ||
				"'implementation'".equals(tokenName) || "'end_implementation'".equals(tokenName)) {
			return VaryHighLightingConfiguration.PRINCIPALES_ID;
		} else if("'vector'".equals(tokenName) || "'matrix'".equals(tokenName) ||
				"'registry:'".equals(tokenName) || "'end_registry'".equals(tokenName) ||
				"'vector'".equals(tokenName) || "'archive of '".equals(tokenName) ||
				"'of'".equals(tokenName) || "'function'".equals(tokenName) ||
				"'end_function'".equals(tokenName) || "'procedure'".equals(tokenName) ||
				"'end_procedure'".equals(tokenName) || "':'".equals(tokenName) ||
				"'..'".equals(tokenName) || "'{'".equals(tokenName) ||
				"'}'".equals(tokenName) || "'return'".equals(tokenName) ||
				"'<-'".equals(tokenName) || "'read'".equals(tokenName) ||
				"'write'".equals(tokenName) || "'open'".equals(tokenName) ||
				"'close'".equals(tokenName) || "'.'".equals(tokenName))  {
			return VaryHighLightingConfiguration.TIPOS_ID;
		} else if("'integer'".equals(tokenName) || "'real'".equals(tokenName) ||
				"'boolean'".equals(tokenName) || "'string'".equals(tokenName) ||
				"'character'".equals(tokenName)) {
			return VaryHighLightingConfiguration.DECLARACIONES_ID;
		} else if("'for'".equals(tokenName) || "'to'".equals(tokenName) ||
				"'do'".equals(tokenName) || "'end_for'".equals(tokenName) || 
				"'while'".equals(tokenName) || "'end_while'".equals(tokenName) ||
				"'if'".equals(tokenName) || "'then'".equals(tokenName) || 
				"'end_if'".equals(tokenName) || "'repeat'".equals(tokenName) ||
				"'until'".equals(tokenName) || "'case'".equals(tokenName) ||
				"'according_to'".equals(tokenName) || "'otherwise:'".equals(tokenName) ||
				"'end_according_to'".equals(tokenName) || "'else'".equals(tokenName)) {
			return VaryHighLightingConfiguration.GENERAL_ID;
		} else if("RULE_CAD".equals(tokenName) || "RULE_CAR".equals(tokenName)) {
			return VaryHighLightingConfiguration.CADENA_ID;
		} 
		return super.calculateId(tokenName, tokenType);
	}
}
