package vary.pseudocodigo.dsl.c.english.validation.messages;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;

public class ReadMessagesValidator implements ReadMessagesValidatorInterface {
	
	private static ResourceBundle resource;
	
	public ReadMessagesValidator() {
		resource = ResourceBundle.getBundle("vary.pseudocodigo.dsl.c.english.validation.messages.messages");
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
