/*
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.english.formatting

import com.google.inject.Inject
import vary.pseudocodigo.dsl.c.english.services.VaryGrammarEnglishGrammarAccess
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface
import vary.pseudocodigo.dsl.c.english.keywords.ReadKeywords
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class VaryGrammarEnglishFormatter extends AbstractDeclarativeFormatter {	
	
	@Inject extension VaryGrammarEnglishGrammarAccess
	
	protected final ReadKeywordsInterface readerKeywords = new ReadKeywords();
	
	override protected configureFormatting(FormattingConfig c) {
		
		for(pair: findKeywordPairs('{', '}')) {
			c.setIndentation(pair.first, pair.second)
			c.setLinewrap(1).after(pair.first)
			c.setLinewrap(1).before(pair.second)
			c.setLinewrap(1).after(pair.second)
		}
		for(comma: findKeywords(',')) {
			c.setNoLinewrap().before(comma)
			c.setNoSpace().before(comma)
			c.setLinewrap().after(comma)
		}
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		for(comma: findKeywords(",")) {
            c.setNoLinewrap().before(comma);
            c.setNoSpace().before(comma);
            c.setSpace(" ").after(comma);
        }
        
        for(comentario: findKeywords("//")) {
        	c.setLinewrap(2).before(comentario);
        }
        
        for(dosPuntos: findKeywords(":")) {
        	c.setNoSpace().before(dosPuntos);
        	c.setNoSpace().after(dosPuntos);
        }
        
        for(menosMenos: findKeywords("--")) {
        	c.setNoSpace().before(menosMenos);
        }
        
        for(masMas: findKeywords("++")) {
        	c.setNoSpace().before(masMas);
        }
        
        //Para el formato de los registros:
        for(registro: findKeywords(readerKeywords.getBundle().getString("KEYWORD_REGISTRO"))) {
        	c.setLinewrap(1).before(registro);
        }
        for(finRegistro: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_REGISTRO"))) {
        	c.setLinewrap(2).after(finRegistro);
        }
        c.setLinewrap(1).after(getRegistroAccess().getNombreEStringParserRuleCall_1_0());
        c.setLinewrap(2).after(getTipoComplejoRule());
        c.setLinewrap(1).after(getDeclaracionRule());
        
        
        c.setLinewrap(1).after(getDeclaracionBasicaRule());
        
        for(variable: findKeywords(".")) {
        	c.setNoSpace().before(variable);
        	c.setNoSpace().after(variable);
        }
        
        c.setLinewrap(2).after(getSentenciaRule());
        
        for(keyEntonces: findKeywords(readerKeywords.getBundle().getString("KEYWORD_ENTONCES"))) {
        	c.setLinewrap(2).after(keyEntonces);
        }
        
        for(llave: findKeywords("[")) {
        	c.setNoSpace().before(llave);
        	c.setNoSpace().after(llave);
        }
        
        for(llave: findKeywords("]")) {
        	c.setNoSpace().before(llave);
        }
        
        for(llave: findKeywords("][")) {
        	c.setNoSpace().before(llave);
        	c.setNoSpace().after(llave);
        }
        
        for(llave: findKeywords("(")) {
        	c.setNoSpace().after(llave);
        	c.setNoSpace().before(llave);
        }
        
        for(llave: findKeywords(")")) {
        	c.setNoSpace().before(llave);
        }
        
        for(keyConst: findKeywords(readerKeywords.getBundle().getString("KEYWORD_CONST"))) {
        	c.setLinewrap(2).before(keyConst);
        }
        
        for(keyTipo: findKeywords(readerKeywords.getBundle().getString("KEYWORD_TIPO"))) {
        	c.setLinewrap(2).before(keyTipo);
        }
        
        
        for(keyInicio: findKeywords(readerKeywords.getBundle().getString("KEYWORD_INICIO"))) {
        	c.setLinewrap(2).before(keyInicio);
        }
        
        for(keyFinDesde: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_DESDE"))) {
        	c.setLinewrap(2).after(keyFinDesde);
        }
        
        for(keyConst: findKeywords(readerKeywords.getBundle().getString("KEYWORD_CONST"))) {
        	c.setIndentationIncrement().after(keyConst);
        }
        
        for(keyTipo: findKeywords(readerKeywords.getBundle().getString("KEYWORD_TIPO"))) {
        	c.setIndentationDecrement().before(keyTipo);
        	c.setIndentationIncrement().after(keyTipo);
        }
        
        c.setIndentationDecrement().before(getSubprocesoRule());
        
        
        for(keyVar: findKeywords(readerKeywords.getBundle().getString("KEYWORD_VAR"))) {
        	c.setLinewrap(2).before(keyVar);
        	c.setLinewrap(2).after(keyVar);
        	c.setIndentationIncrement().before(keyVar);
        	c.setIndentationIncrement().after(keyVar);
        }
        
        c.setLinewrap(2).after(getSubprocesoRule());

        c.setLinewrap(2).after(getTipoComplejoRule());
        
        for(keyInicio: findKeywords(readerKeywords.getBundle().getString("KEYWORD_INICIO"))) {
        	c.setIndentationDecrement().before(keyInicio);
        	c.setIndentationIncrement().after(keyInicio);
        }
        
        c.setLinewrap(2).after(getDevolverRule());
        
        for(keyFinFuncion: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_FUNCION"))) {
        	c.setIndentationDecrement().before(keyFinFuncion);
        }
        
        c.setIndentationDecrement().between(getSubprocesoRule(), getInicioRule());
        c.setIndentationDecrement().between(getSubprocesoRule(), getInicioRule());
        
        for(keyFinProc: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_PROCEDIMIENTO"))) {
        	c.setIndentationDecrement().before(keyFinProc);
        }
        
        for(keyFinInicio: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_INICIO"))) {
        	c.setIndentationDecrement().before(keyFinInicio);
        }
        
        for(keyHacerDesde: findKeywords(readerKeywords.getBundle().getString("KEYWORD_HACER"))) {
        	c.setLinewrap(1).after(keyHacerDesde);
        	c.setIndentationIncrement().before(keyHacerDesde);
        }
        
        for(keyFinDesde: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_DESDE"))) {
        	c.setIndentationDecrement().before(keyFinDesde);
        }
        
        for(keyEntoncesSi: findKeywords(readerKeywords.getBundle().getString("KEYWORD_ENTONCES"))) {
        	c.setIndentationIncrement().before(keyEntoncesSi);
        }
        
        for(keySinoSi: findKeywords(readerKeywords.getBundle().getString("KEYWORD_SINO"))) {
        	c.setIndentationDecrement().before(keySinoSi);
        	c.setIndentationIncrement().after(keySinoSi);
        }
        
        for(keyFinSi: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_SI"))) {
        	c.setIndentationDecrement().before(keyFinSi);
        }
        
        for(keyFinMientras: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_MIENTRAS"))) {
        	c.setIndentationDecrement().before(keyFinMientras);
        }
        
        for(keyRepetir: findKeywords(readerKeywords.getBundle().getString("KEYWORD_REPETIR"))) {
        	c.setIndentationIncrement().after(keyRepetir);
        }
        
        for(keyHastaQueRepetir: findKeywords(readerKeywords.getBundle().getString("KEYWORD_HASTA_QUE"))) {
        	c.setIndentationDecrement().before(keyHastaQueRepetir);
        }
        
        for(keyFinSegun: findKeywords(readerKeywords.getBundle().getString("KEYWORD_FIN_SEGUN"))) {
        	c.setIndentationDecrement().before(keyFinSegun);
        }
        
        c.setLinewrap(1).after(getSentenciaRule());
	}
}