package vary.pseudocodigo.dsl.c.keywords;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ReadKeywords implements ReadKeywordsInterface {
	
	private static ResourceBundle resource;
	
	public ReadKeywords() {
		resource = ResourceBundle.getBundle("vary.pseudocodigo.dsl.c.keywords.keywords");
	}
	
	public ResourceBundle getBundle() {
		return resource;
	}
	
	public String getString(String key, Object... params  ) {
        try {
            return MessageFormat.format(resource.getString(key), params);
        } catch (MissingResourceException e) {
            return "Error with " + key + '!';
        }
    }
}
