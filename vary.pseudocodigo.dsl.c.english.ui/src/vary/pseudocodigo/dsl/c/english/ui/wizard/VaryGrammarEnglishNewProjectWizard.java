package vary.pseudocodigo.dsl.c.english.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import vary.pseudocodigo.dsl.c.generator.util.LenguajeProyecto;
import vary.pseudocodigo.dsl.c.generator.util.NombreProyecto;
import vary.pseudocodigo.dsl.c.generator.util.ProjectEmpty;
import vary.pseudocodigo.dsl.c.generator.util.ProjectHeaderFile;
import vary.pseudocodigo.dsl.c.ui.wizard.components.VarySelectionLanguagePage;
import vary.pseudocodigo.dsl.c.ui.wizard.components.VarySelectionPropertiesPage;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class VaryGrammarEnglishNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage main;
	private VarySelectionLanguagePage selectionLanguage;
	private VarySelectionPropertiesPage selectionProperties;

	@Inject
	public VaryGrammarEnglishNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Vary Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		main = new WizardNewProjectCreationPage("creationPage");
		main.setTitle("Vary Project");
		main.setDescription("Create a new Vary project.");
		addPage(main);
		selectionLanguage = new VarySelectionLanguagePage("selectionLanguagePage");
		selectionLanguage.setPreviousPage(main);
		selectionLanguage.setTitle("Vary C/C++ Project options");
		selectionLanguage.setDescription("Select the language of the project.");
		addPage(selectionLanguage);
		selectionProperties = new VarySelectionPropertiesPage("selectionPropertiesPage");
		selectionProperties.setPreviousPage(selectionLanguage);
		selectionProperties.setTitle("Vary C/C++ Project options");
		selectionProperties.setDescription("The project will be generated depending on the options you choose.");
		addPage(selectionProperties);
	}
	
	@Override
	protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
		//IdiomaProyecto.setIdiomaProyecto(selectionProjectTypePage.getSelectedNodeLanguage().getName());
		//TipoProyecto.setTipoProyecto(selectionProjectTypePage.getSelectedNode().getName());
		
		if(selectionLanguage.getSelectedNodeLanguage().getName().equals("C") || selectionLanguage.getSelectedNodeLanguage().getName().equals("C++")) {
			//selectionPropertiesPage = (VaryGrammarWizardSelectionPropertiesPage) selectionProjectTypePage.getNextPage();
			//ProjectEmpty.setEmptyOption(selectionPropertiesPage.getChecboxWhiteValue());
			ProjectEmpty.setEmptyOption(selectionProperties.getProperties().getPropertyValue(1));
			//ProjectHeaderFile.setHeaderOption(selectionPropertiesPage.getChecboxHeaderValue());
			ProjectHeaderFile.setHeaderOption(selectionProperties.getProperties().getPropertyValue(0));
			LenguajeProyecto.setLenguajeProyecto(selectionLanguage.getSelectedNodeLanguage().getName());
		}
		super.doFinish(projectInfo, monitor);

	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		vary.pseudocodigo.dsl.c.english.ui.wizard.VaryGrammarEnglishProjectInfo projectInfo = new vary.pseudocodigo.dsl.c.english.ui.wizard.VaryGrammarEnglishProjectInfo();
		projectInfo.setProjectName(main.getProjectName());
		NombreProyecto.setNombreProyecto(main.getProjectName());
		return projectInfo;
	}
	
	@Override
	public boolean canFinish() {
		if(selectionLanguage.getSelectedNodeLanguage() != null && selectionProperties.getLanguage() != null) {
			return true;
		} else {
			return super.canFinish();
		}
	}

}
