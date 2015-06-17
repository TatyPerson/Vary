package vary.pseudocodigo.dsl.c.ui.wizard.components;

import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import vary.pseudocodigo.dsl.c.ui.wizard.properties.VaryPropertiesForC;
import vary.pseudocodigo.dsl.c.ui.wizard.properties.VaryPropertiesForLanguage;

public class VarySelectionPropertiesPage extends WizardSelectionPage {
	private String language;
	private VaryPropertiesForLanguage properties;
	private Composite composite;
	
	
	public void setLanguage(String language) {
		this.language = language;
		setProperties(language);
	}
	
	public void setProperties(String language) {
		if(language.equals("C") || language.equals("C++")) {
			if(!(this.properties instanceof VaryPropertiesForC)) {
				this.properties = new VaryPropertiesForC();
				createControl(this.composite);
			}
		} else {
			//this.properties = new VaryPropertiesForOtherLanguage();
		}
	}
	
	public VaryPropertiesForLanguage getProperties() {
		return this.properties;
	}
	
	public String getLanguage() {
		return this.language;
	}

	public VarySelectionPropertiesPage(String pageName) {
		super(pageName);
		//Lo instanciamos por defecto con las propiedades de C/C++
		this.properties = new VaryPropertiesForC();
	}
	
	private void setComposite(Composite composite) {
		this.composite = composite;
	}
	
	public Composite getComposite() {
		return this.composite;
	}

	@Override
	public void createControl(Composite parent) {
		
		if(this.composite == null) {
			Composite composite = new Composite(parent, SWT.NONE);
			setComposite(composite);
			this.properties.defineControlForLanguage(this.composite);
			setPageComplete(true);
			setControl(this.composite);
		} else {
			this.properties.defineControlForLanguage(this.composite);
			setPageComplete(true);
			setControl(this.composite);
		}
	}
}
