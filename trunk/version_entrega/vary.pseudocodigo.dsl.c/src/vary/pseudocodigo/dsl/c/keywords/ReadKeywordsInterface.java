package vary.pseudocodigo.dsl.c.keywords;

import java.util.ResourceBundle;

public interface ReadKeywordsInterface {
	public ResourceBundle getBundle();
	public String getString(String key, Object... params  );
}
