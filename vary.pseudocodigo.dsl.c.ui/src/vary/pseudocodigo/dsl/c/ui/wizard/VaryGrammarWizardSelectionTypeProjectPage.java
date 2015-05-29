package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class VaryGrammarWizardSelectionTypeProjectPage extends WizardSelectionPage {
	
	VaryWizardNode selectedWizardNode;
	VaryWizardNode selectedWizardNodeLanguage;
	boolean checkboxHeaderValue;
	boolean checkboxWhiteValue;
	Button checkboxHeader;
	Button checkboxWhite;

	public VaryGrammarWizardSelectionTypeProjectPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public VaryWizardNode getSelectedNode() {
		return selectedWizardNode;
	}
	
	public VaryWizardNode getSelectedNodeLanguage() {
		return selectedWizardNodeLanguage;
	}
	
	public void setSelectedNodeLanguage(VaryWizardNode node) {
		this.selectedWizardNodeLanguage = node;
	}
	
	public boolean getChecboxHeaderValue() {
		return checkboxHeaderValue;
	}
	
	public boolean getChecboxWhiteValue() {
		return checkboxWhiteValue;
	}
 
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		Composite composite = new Composite(parent, SWT.NONE);
		// Name, you can create your form like normally
        //Label l = new Label(composite, SWT.NONE);
        //l.setText("Project name");
        //new Text(composite, SWT.BORDER);
        
        // Project type
        //Label labelType = new Label(composite, SWT.NONE);
        //labelType.setText("Reply .h file");
        
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
		        setPageComplete(true);
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
		        setPageComplete(true);
		    }
		});
        
        /*TableViewer projectType = new TableViewer(composite);
        projectType.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
        projectType.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
                    Object o = ((IStructuredSelection) selection).getFirstElement();
                    if(o instanceof VaryWizardNode) {
                        // Now we set our selected node, which toggles the next button
                        selectedWizardNode = (VaryWizardNode) o;
                        if(selectedWizardNode.getName() == "Yes") {
                        	setTitle("The .h file will be generated.");
                        }
                        else {
                        	setTitle("The .h file won't be generated.");
                        }
                        setSelectedNode(selectedWizardNode);
                        setPageComplete(true);
                    }
                }
            }
        }); */
        // Project language

        l.setText("Selecciona el lenguaje para la transformación:");
        
        TableViewer projectLanguage = new TableViewer(composite);
        projectLanguage.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
        projectLanguage.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                ISelection selection = event.getSelection();
                if(!selection.isEmpty() && selection instanceof IStructuredSelection) {
                    Object o = ((IStructuredSelection) selection).getFirstElement();
                    if(o instanceof VaryWizardNode) {
                        // Now we set our selected node, which toggles the next button
                        selectedWizardNodeLanguage = (VaryWizardNode) o;
                        if(selectedWizardNodeLanguage.getName() == "C") {
                        	setTitle("C");
                        }
                        else {
                        	setTitle("C++");
                        }
                        setSelectedNodeLanguage(selectedWizardNodeLanguage);
                        setPageComplete(true);
                    }
                }
            }
        });
        //projectType.setContentProvider(new ArrayContentProvider());
        //projectType.setLabelProvider(new LabelProvider() {
         /*   @Override
            public String getText(Object element) {
                if(element instanceof VaryWizardNode) {
                    return ((VaryWizardNode) element).getName();
                }
                return super.getText(element);
            }
        });*/
        projectLanguage.setContentProvider(new ArrayContentProvider());
        projectLanguage.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if(element instanceof VaryWizardNode) {
                    return ((VaryWizardNode) element).getName();
                }
                return super.getText(element);
            }
        });
        //VaryWizardNode[] wizardNodesType = new VaryWizardNode[]{
        //    new VaryWizardNode("Yes"),
        //    new VaryWizardNode("No")
        //};
        VaryWizardNode[] wizardNodesLanguage = new VaryWizardNode[]{
                new VaryWizardNode("C"),
               new VaryWizardNode("C++")
        };
        //projectType.setInput(wizardNodesType);
        projectLanguage.setInput(wizardNodesLanguage);
        
        GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
        
        setControl(composite);
    }
}
