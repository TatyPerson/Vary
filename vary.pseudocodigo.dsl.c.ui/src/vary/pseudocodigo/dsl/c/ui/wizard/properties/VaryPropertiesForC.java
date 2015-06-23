package vary.pseudocodigo.dsl.c.ui.wizard.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class VaryPropertiesForC implements VaryPropertiesForLanguage {
	List<Boolean> properties;
	private Button checkboxHeader;
	
	public VaryPropertiesForC() {
		properties = new ArrayList<Boolean>(1);
		properties.add(false);
	}
		
	@Override
	public boolean getPropertyValue(int indexProperty) {
		return properties.get(indexProperty);
	}

	@Override
	public void defineControlForLanguage(Composite composite) {
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
		
		GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
	}

}
