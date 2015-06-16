package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class VaryGrammarWizardSelectionTypeProjectPage extends WizardSelectionPage {
	
	VaryWizardNode selectedWizardNode;
	VaryWizardNode selectedWizardNodeLanguage;

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
 
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		final Composite composite = new Composite(parent, SWT.NONE);
		// Name, you can create your form like normally
        //Label l = new Label(composite, SWT.NONE);
        //l.setText("Project name");
        //new Text(composite, SWT.BORDER);
        
        // Project type
        //Label labelType = new Label(composite, SWT.NONE);
        //labelType.setText("Reply .h file");
        
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
		Label l = new Label(composite, SWT.NONE);
        l.setText("Select the language for transformation:");
        
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
                        VarySelectorWizardProperties.setLanguageSelected(selectedWizardNodeLanguage.getName());
                        setPageComplete(false);
                        canFlipToNextPage();
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
	
	@Override
	public boolean canFlipToNextPage() {
		if(selectedWizardNodeLanguage == null) {
			return false;
		}
		else if(selectedWizardNodeLanguage.getName() != null) {
			VaryGrammarWizardSelectionPropertiesPage selectionPage = (VaryGrammarWizardSelectionPropertiesPage) getWizard().getPage("selectPropertiesPage");
			selectionPage.setLanguage(selectedWizardNodeLanguage.getName());
			return true;
		}
		else {
			return super.canFlipToNextPage();
		}
	}
	
	@Override
	public IWizardPage getNextPage() {
		if(selectedWizardNodeLanguage.getName() != null) {
			return getWizard().getPage("selectPropertiesPage");
		}
		else {
			return super.getNextPage();
		}
	}
}
