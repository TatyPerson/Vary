package vary.pseudocodigo.dsl.c.ui.wizard.components;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class VarySelectionLanguagePage extends WizardSelectionPage {
	private VarySelectionNode selectedNodeLanguage;

	public VarySelectionLanguagePage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}
	
	public VarySelectionNode getSelectedNodeLanguage() {
		return selectedNodeLanguage;
	}
	
	public void setSelectedNodeLanguage(VarySelectionNode node) {
		this.selectedNodeLanguage = node;
	}
 
	@Override
	public void createControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);

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
                    if(o instanceof VarySelectionNode) {
                        // Now we set our selected node, which toggles the next button
                        selectedNodeLanguage = (VarySelectionNode) o;
                        if(selectedNodeLanguage.getName() == "C") {
                        	setTitle("C");
                        }
                        else {
                        	setTitle("C++");
                        }
                        setSelectedNodeLanguage(selectedNodeLanguage);
                        setPageComplete(false);
                        canFlipToNextPage();
                    }
                }
            }
        });
      
        projectLanguage.setContentProvider(new ArrayContentProvider());
        projectLanguage.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                if(element instanceof VarySelectionNode) {
                    return ((VarySelectionNode) element).getName();
                }
                return super.getText(element);
            }
        });
        VarySelectionNode[] wizardNodesLanguage = new VarySelectionNode[]{
                new VarySelectionNode("C"),
               new VarySelectionNode("C++")
        };
        projectLanguage.setInput(wizardNodesLanguage);
        
        GridLayoutFactory.swtDefaults().numColumns(2).generateLayout(composite);
        
        setControl(composite);
    }
	
	@Override
	public boolean canFlipToNextPage() {
		if(selectedNodeLanguage == null) {
			return false;
		}
		else if(selectedNodeLanguage.getName() != null) {
			return true;
		}
		else {
			return super.canFlipToNextPage();
		}
	}
	
	@Override
	public IWizardPage getNextPage() {
		if(selectedNodeLanguage.getName() != null) {
			VarySelectionPropertiesPage nextPage = (VarySelectionPropertiesPage) getWizard().getPage("selectionPropertiesPage");
			nextPage.setLanguage(selectedNodeLanguage.getName());
			return nextPage;
		}
		else {
			return super.getNextPage();
		}
	}
}
