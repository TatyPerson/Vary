package vary.pseudocodigo.dsl.c.english.validation;

import org.apache.log4j.Logger;

import com.google.inject.Inject;
import vary.pseudocodigo.dsl.c.validation.VaryGrammarValidator;

public class VaryGrammarEnglishValidator extends VaryGrammarValidator {
	
	private static final Logger LOGGER = Logger.getLogger(VaryGrammarEnglishValidator.class);
	
	@Inject
	public VaryGrammarEnglishValidator() {
		super("English Messages");
		LOGGER.info("Instanciando validador Inglés");
	}
	
}
