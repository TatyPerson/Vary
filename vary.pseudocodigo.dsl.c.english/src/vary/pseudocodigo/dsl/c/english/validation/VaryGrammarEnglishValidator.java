package vary.pseudocodigo.dsl.c.english.validation;

import com.google.inject.Inject;

import vary.pseudocodigo.dsl.c.validation.VaryGrammarValidator;

public class VaryGrammarEnglishValidator extends VaryGrammarValidator {
	
	@Inject
	public VaryGrammarEnglishValidator() {
		super("English Messages");
		System.out.println("Instanciando validador Inglés");
	}
	
}
