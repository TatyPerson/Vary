/*
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VaryGrammarUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return vary.pseudocodigo.dsl.c.ui.internal.VaryGrammarActivator.getInstance().getInjector("vary.pseudocodigo.dsl.c.VaryGrammar");
	}
	
}
