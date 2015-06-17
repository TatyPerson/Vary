package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import vary.pseudocodigo.dsl.c.generator.util.LenguajeProyecto;
import vary.pseudocodigo.dsl.c.generator.util.NombreProyecto;
import vary.pseudocodigo.dsl.c.generator.util.ProjectEmpty;
import vary.pseudocodigo.dsl.c.generator.util.ProjectHeaderFile;

import com.google.inject.Inject;

public class VaryGrammarNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;
	private VaryGrammarWizardSelectionTypeProjectPage selectionProjectTypePage;
	private VaryGrammarWizardSelectionPropertiesPage selectionPropertiesPage;

	@Inject
	public VaryGrammarNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Vary Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Vary Project");
		mainPage.setDescription("Create a new Vary project.");
		addPage(mainPage);
		selectionProjectTypePage = new VaryGrammarWizardSelectionTypeProjectPage("selectNewProjectTypePage");
		selectionProjectTypePage.setPreviousPage(mainPage);
		selectionProjectTypePage.setTitle("Vary C/C++ Project options");
		selectionProjectTypePage.setDescription("Select the language of the project.");
		addPage(selectionProjectTypePage);
		selectionPropertiesPage = new VaryGrammarWizardSelectionPropertiesPage("selectPropertiesPage");
		selectionPropertiesPage.setPreviousPage(selectionProjectTypePage);
		selectionPropertiesPage.setTitle("Vary C/C++ Project options");
		selectionPropertiesPage.setDescription("The project will be generated depending on the options you choose.");
		addPage(selectionPropertiesPage);
	}
	
	@Override
	protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
		//IdiomaProyecto.setIdiomaProyecto(selectionProjectTypePage.getSelectedNodeLanguage().getName());
		//TipoProyecto.setTipoProyecto(selectionProjectTypePage.getSelectedNode().getName());
		
		if(selectionProjectTypePage.getSelectedNodeLanguage().getName().equals("C") || selectionProjectTypePage.getSelectedNodeLanguage().getName().equals("C++")) {
			//selectionPropertiesPage = (VaryGrammarWizardSelectionPropertiesPage) selectionProjectTypePage.getNextPage();
			//ProjectEmpty.setEmptyOption(selectionPropertiesPage.getChecboxWhiteValue());
			ProjectEmpty.setEmptyOption(selectionPropertiesPage.getProperties().getPropertyValue(1));
			//ProjectHeaderFile.setHeaderOption(selectionPropertiesPage.getChecboxHeaderValue());
			ProjectHeaderFile.setHeaderOption(selectionPropertiesPage.getProperties().getPropertyValue(0));
			LenguajeProyecto.setLenguajeProyecto(selectionProjectTypePage.getSelectedNodeLanguage().getName());
		}
		super.doFinish(projectInfo, monitor);

	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		vary.pseudocodigo.dsl.c.ui.wizard.VaryGrammarProjectInfo projectInfo = new vary.pseudocodigo.dsl.c.ui.wizard.VaryGrammarProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		NombreProyecto.setNombreProyecto(mainPage.getProjectName());
		return projectInfo;
	}
	
	@Override
	public boolean canFinish() {
		if(selectionProjectTypePage.getSelectedNodeLanguage() != null && selectionPropertiesPage.getLanguage() != null) {
			return true;
		} else {
			return super.canFinish();
		}
	}

}
