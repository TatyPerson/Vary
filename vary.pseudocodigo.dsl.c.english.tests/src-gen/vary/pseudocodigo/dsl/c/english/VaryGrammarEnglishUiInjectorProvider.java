/*
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.english;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VaryGrammarEnglishUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return vary.pseudocodigo.dsl.c.english.ui.internal.VaryGrammarEnglishActivator.getInstance().getInjector("vary.pseudocodigo.dsl.c.english.VaryGrammarEnglish");
	}
	
}
