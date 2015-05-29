package vary.pseudocodigo.dsl.c.resources;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import diagramapseudocodigo.Modulo;

public class VaryGrammarQualifiedNameProvider extends SimpleNameProvider implements IQualifiedNameProvider {
	
	private final IQualifiedNameConverter converter = new VaryGrammarQualifiedNameConverter();

	@Override
    public QualifiedName getFullyQualifiedName(final EObject obj) {
		final String name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
        if (name == null || name.isEmpty()) {
            return null;
        }
		return converter.toQualifiedName(name);
	}
	
	public QualifiedName qualifiedName(Modulo m) {
		Modulo m2 = (Modulo) m.eContainer();
        return QualifiedName.create(m2.getNombre(), m.getNombre());
    }
	
}
