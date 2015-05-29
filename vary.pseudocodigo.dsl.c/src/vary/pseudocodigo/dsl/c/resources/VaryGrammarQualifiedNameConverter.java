package vary.pseudocodigo.dsl.c.resources;

import java.util.List;

import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

public class VaryGrammarQualifiedNameConverter implements IQualifiedNameConverter {
	
	/**
	 * Converts the given qualified name to a string.
	 * 
	 * @exception IllegalArgumentException
	 *                when the qualified name is null.
	 */
	public String toString(QualifiedName qualifiedName) {
		if (qualifiedName == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		return qualifiedName.toString(getDelimiter());
	}

	/**
	 * Splits the given string into segments and returns them as a {@link QualifiedName}.
	 * 
	 * @exception IllegalArgumentException
	 *                if the input is empty or null.
	 */
	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
		if (qualifiedNameAsString == null)
			throw new IllegalArgumentException("Qualified name cannot be null");
		if (qualifiedNameAsString.equals(""))
			throw new IllegalArgumentException("Qualified name cannot be empty");
		if (Strings.isEmpty(getDelimiter()))
			return QualifiedName.create(qualifiedNameAsString);
		List<String> segs = getDelimiter().length() == 1 ? Strings.split(qualifiedNameAsString, getDelimiter()
				.charAt(0)) : Strings.split(qualifiedNameAsString, getDelimiter());
		return QualifiedName.create(segs);
	}

	public String getDelimiter() {
		return ".";
	}
}
