package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.jface.wizard.WizardSelectionPage;

public class VarySelectorWizardProperties {
	
	static String languageSelected;
	
	public VarySelectorWizardProperties() {}
	
	//Sobrecargar para añadir nuevos lenguajes
	static public  WizardSelectionPage seleccionarWizard(String lenguaje) {
		if(lenguaje.equals("C") || lenguaje.equals("C++")) {
			return new VaryGrammarWizardSelectionPropertiesPage("selectNewProjectTypePageC");
		}
		else {
			return null;
		}
	}
	
	//Sobrecargar al añadir nuevos lenguajes
	static public boolean fileWhite(WizardSelectionPage page)  {
		if(page instanceof VaryGrammarWizardSelectionPropertiesPage) {
			VaryGrammarWizardSelectionPropertiesPage pageAux = (VaryGrammarWizardSelectionPropertiesPage) page;
			return pageAux.getChecboxWhiteValue();
		} else {
			return false;
		}
	}
	
	//Sobrecargar al añadir nuevos lenguajes
	static public boolean headerFile(WizardSelectionPage page) {
		if(page instanceof VaryGrammarWizardSelectionPropertiesPage) {
			VaryGrammarWizardSelectionPropertiesPage pageAux = (VaryGrammarWizardSelectionPropertiesPage) page;
			return pageAux.getChecboxHeaderValue();
		} else {
			return false;
		}
	}
	
	static public void setLanguageSelected(String language) {
		VarySelectorWizardProperties.languageSelected = language;
	}
	
	static public String getLanguageSelected() {
		return VarySelectorWizardProperties.languageSelected;
	}
	
}
