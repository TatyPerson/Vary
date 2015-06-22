package vary.pseudocodigo.dsl.c.validation.messages;

import java.util.ResourceBundle;

public interface ReadMessagesValidatorInterface {
	public ResourceBundle getBundle();
	public String getString(String key, Object... params  );
}
