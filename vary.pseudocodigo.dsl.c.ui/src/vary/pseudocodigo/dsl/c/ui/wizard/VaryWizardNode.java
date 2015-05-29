package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardNode;
import org.eclipse.swt.graphics.Point;

public class VaryWizardNode implements IWizardNode {
	String name;
	IWizard wizard;
	
	public VaryWizardNode(String name) {
        this.name = name;
    }
	
	public String getName() {
        return name;
    }

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getExtent() {
		return new Point(-1, -1);
	}

	/*@Override
	public IWizard getWizard() {
		if(wizard == null) {
           wizard = (IWizard) new FinalWizard();
        }
        
        return (IWizard) wizard;
	}*/

	@Override
	public boolean isContentCreated() {
		return wizard != null;
	}

	@Override
	public IWizard getWizard() {
		// TODO Auto-generated method stub
		return null;
	}
}
