package vary.pseudocodigo.dsl.c.ui.wizard.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class VaryPropertiesForC implements VaryPropertiesForLanguage {
	List<Boolean> properties;
	private Button checkboxHeader;
	private Button checkboxWhite;
	
	public VaryPropertiesForC() {
		properties = new ArrayList<Boolean>(2);
		properties.add(false);
		properties.add(false);
	}
		
	@Override
	public boolean getPropertyValue(int indexProperty) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void defineControlForLanguage(Composite parent, WizardSelectionPage page) {
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
		        	properties.set(0, true);
		        }
		        else {
		        	properties.set(0, false);
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
		        	properties.set(1, true);
		        }
		        else {
		        	properties.set(1, false);
		        }
		    }
		});
		
		GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
		
	}

}
