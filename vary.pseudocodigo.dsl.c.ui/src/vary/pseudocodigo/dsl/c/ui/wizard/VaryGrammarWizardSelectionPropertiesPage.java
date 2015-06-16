package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import vary.pseudocodigo.dsl.c.ui.wizard.properties.VaryPropertiesForC;
import vary.pseudocodigo.dsl.c.ui.wizard.properties.VaryPropertiesForLanguage;

public class VaryGrammarWizardSelectionPropertiesPage extends WizardSelectionPage {
	
	private boolean checkboxHeaderValue = false;
	private boolean checkboxWhiteValue = false;
	private Button checkboxHeader;
	private Button checkboxWhite;
	private String language;
	VaryPropertiesForLanguage properties;
	
	public boolean getChecboxHeaderValue() {
		return checkboxHeaderValue;
	}
	
	public boolean getChecboxWhiteValue() {
		return checkboxWhiteValue;
	}
	
	public void setLanguage(String language) {
		this.language = language;
		setProperties(language);
	}
	
	public void setProperties(String language) {
		if(language.equals("C") || language.equals("C++")) {
			this.properties = new VaryPropertiesForC();
		}
	}
	
	public VaryPropertiesForLanguage getProperties() {
		return this.properties;
	}
	
	public String getLanguage() {
		return this.language;
	}

	protected VaryGrammarWizardSelectionPropertiesPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		
		setPageComplete(true);
		
		/*if(language == null) {
			//Al inicio por defecto cargamos el wizard de C y C++
			setProperties("C");
			this.properties.defineControlForLanguage(parent, this);
			createControl(parent);
		}
		
		else {
			setPageComplete(true);
			this.properties.defineControlForLanguage(parent, this);
			createControl(parent);
		}*/
		
		if(language == null) {
			showOptionsCProjects(parent);
		}
		else if(language.equals("C") || language.equals("C++")) {
			showOptionsCProjects(parent);
		}
	}
	
	
	private void showOptionsCProjects(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		
        //Checkbox para elegir si quieres .h o no
		checkboxHeader = new Button(composite, SWT.CHECK);
		//checkbox.setData(p);
		checkboxHeader.setSelection(false);
		checkboxHeader.setText("Generate .h file.");
		checkboxHeader.addSelectionListener(new SelectionAdapter()
		{
		    @Override
		    public void widgetSelected(SelectionEvent e)
		    {
		        if (checkboxHeader.getSelection()) {
		        	checkboxHeaderValue = true;
		        }
		        else {
		        	checkboxHeaderValue = false;
		        }
		    }
		});
		
		Label l = new Label(composite, SWT.NONE);
		l.setText("");
		//Checbox para elegir si quieres el fichero inicial en blanco o no
		checkboxWhite = new Button(composite, SWT.CHECK);
		checkboxWhite.setSelection(false);
		checkboxWhite.setText("Generate an empty initial file.");
		checkboxWhite.addSelectionListener(new SelectionAdapter()
		{
		    @Override
		    public void widgetSelected(SelectionEvent e)
		    {
		        if (checkboxWhite.getSelection()) {
		        	checkboxWhiteValue = true;
		        }
		        else {
		        	checkboxWhiteValue = false;
		        }
		    }
		});
		
		GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
        
        setControl(composite);
	}

}
