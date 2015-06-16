package vary.pseudocodigo.dsl.c.ui.wizard.properties;

import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.widgets.Composite;

public interface VaryPropertiesForLanguage {
	public boolean getPropertyValue(int indexProperty);
	public void defineControlForLanguage(Composite parent, WizardSelectionPage page);
}
