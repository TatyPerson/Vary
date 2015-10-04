package vary.pseudocodigo.dsl.c.english.keywords;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface;

public class ReadKeywords implements ReadKeywordsInterface {
	
	private static ResourceBundle resource;
	private static final Logger LOGGER = Logger.getLogger(ReadKeywords.class);
	
	public ReadKeywords() {
		resource = ResourceBundle.getBundle("vary.pseudocodigo.dsl.c.english.keywords.keywords");
	}
	
	public ResourceBundle getBundle() {
		return resource;
	}
	
	public String getString(String key, Object... params  ) throws MissingResourceException {
        try {
            return MessageFormat.format(resource.getString(key), params);
        } catch (MissingResourceException e) {
        	LOGGER.info(e.getMessage());
            return "Error with " + key + '!';
        }
    }
}
