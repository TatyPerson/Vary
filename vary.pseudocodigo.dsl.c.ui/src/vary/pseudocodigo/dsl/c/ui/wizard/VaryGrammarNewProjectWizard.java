package vary.pseudocodigo.dsl.c.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

import vary.pseudocodigo.dsl.c.generator.util.IdiomaProyecto;
import vary.pseudocodigo.dsl.c.generator.util.LenguajeProyecto;
import vary.pseudocodigo.dsl.c.generator.util.NombreProyecto;
import vary.pseudocodigo.dsl.c.generator.util.ProjectEmpty;
import vary.pseudocodigo.dsl.c.generator.util.ProjectHeaderFile;
import vary.pseudocodigo.dsl.c.generator.util.TipoProyecto;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class VaryGrammarNewProjectWizard extends org.eclipse.xtext.ui.wizard.XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;
	private VaryGrammarWizardSelectionTypeProjectPage selectionProjectTypePage;

	@Inject
	public VaryGrammarNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New VaryGrammar Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("VaryGrammar Project");
		mainPage.setDescription("Create a new VaryGrammar project.");
		addPage(mainPage);
		selectionProjectTypePage = new VaryGrammarWizardSelectionTypeProjectPage("selectNewProjectTypePage");
		selectionProjectTypePage.setPreviousPage(mainPage);
		selectionProjectTypePage.setTitle("Vary C Project options");
		selectionProjectTypePage.setDescription("The project will be generated depending on the options you choose.");
		addPage(selectionProjectTypePage);
	}
	
	@Override
	protected void doFinish(final IProjectInfo projectInfo, final IProgressMonitor monitor) {
		//IdiomaProyecto.setIdiomaProyecto(selectionProjectTypePage.getSelectedNodeLanguage().getName());
		//TipoProyecto.setTipoProyecto(selectionProjectTypePage.getSelectedNode().getName());
		ProjectEmpty.setEmptyOption(selectionProjectTypePage.getChecboxWhiteValue());
		ProjectHeaderFile.setHeaderOption(selectionProjectTypePage.getChecboxHeaderValue());
		LenguajeProyecto.setLenguajeProyecto(selectionProjectTypePage.getSelectedNodeLanguage().getName());
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

}
