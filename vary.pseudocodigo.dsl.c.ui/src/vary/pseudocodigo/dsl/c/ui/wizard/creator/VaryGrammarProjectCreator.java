package vary.pseudocodigo.dsl.c.ui.wizard.creator;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.cdt.core.CCProjectNature;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.cdt.make.core.MakeBuilder;
import org.eclipse.cdt.make.core.MakeProjectNature;
import org.eclipse.cdt.build.core.scannerconfig.ScannerConfigBuilder;
import org.eclipse.cdt.build.core.scannerconfig.ScannerConfigNature;

import vary.pseudocodigo.dsl.c.generator.util.ProjectEmpty;
import vary.pseudocodigo.dsl.c.ui.util.PluginProjectFactory;
import vary.pseudocodigo.dsl.c.ui.util.ProjectFactory;
import vary.pseudocodigo.dsl.c.ui.wizard.VaryGrammarProjectInfo;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class VaryGrammarProjectCreator extends PluginProjectCreator {

	protected static final String DSL_GENERATOR_PROJECT_NAME = "vary.pseudocodigo.dsl.c.english";

	protected static final String SRC_ROOT = "src";
	protected static final String SRC_GEN_ROOT = "src-gen";
	protected final List<String> SRC_FOLDER_LIST = ImmutableList.of(SRC_ROOT, SRC_GEN_ROOT);

	@Override
	protected VaryGrammarProjectInfo getProjectInfo() {
		return (VaryGrammarProjectInfo) super.getProjectInfo();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected IProject createProject(IProgressMonitor monitor) {
		ProjectFactory factory = createProjectFactoryCustom();
		configureProjectBuilder(factory);
		return factory.createProject(monitor, null);
	}
	
	@Override
	protected ProjectFactory configureProjectFactory(ProjectFactory factory) {
		PluginProjectFactory result = (PluginProjectFactory) super.configureProjectFactory(factory);
		
		result.addRequiredBundles(getRequiredBundles());
		result.addExportedPackages(getExportedPackages());
		result.addImportedPackages(getImportedPackages());
		result.setActivatorClassName(getActivatorClassName());
		
		return result;
	}
	
	protected ProjectFactory createProjectFactoryCustom() {
		return new PluginProjectFactory();
	}
	
	protected String getModelFolderName() {
		return SRC_ROOT;
	}
	
	@Override
	protected List<String> getAllFolders() {
        return SRC_FOLDER_LIST;
    }

    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(DSL_GENERATOR_PROJECT_NAME);
		result.add("org.eclipse.cdt");
		return result;
	}
    
    //Lo he añadido yo para las naturalezas
    @Override
    protected String[] getProjectNatures() {
        return new String[] {
        	CCProjectNature.CC_NATURE_ID,
        	ScannerConfigNature.NATURE_ID,
        	MakeProjectNature.NATURE_ID,
    		//"org.eclipse.cdt.managedbuilder.core.managedBuildNature",
    		//"org.eclipse.cdt.managedbuilder.core.ScannerConfigNature",
			XtextProjectHelper.NATURE_ID
			
		};
    }
    
    //Lo he añadido yo para las naturalezas
    @Override
    protected String[] getBuilders() {
    	return new String[]{
    		MakeBuilder.BUILDER_ID,
    		ScannerConfigBuilder.BUILDER_ID,
    		//"org.eclipse.cdt.managedbuilder.core.genmakebuilder",
    		//"org.eclipse.cdt.managedbuilder.core.ScannerConfigBuilder",
			XtextProjectHelper.BUILDER_ID
		};
	}
    
    @Override
	protected void execute(final IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, 
				getCreateModelProjectMessage(), 
				2);
		try {
			final IProject project = createProject(subMonitor.newChild(1));
			if (project == null)
				return;
			enhanceProject(project, subMonitor.newChild(1));
			IFile modelFile = getModelFile(project);
			setResult(modelFile);
		} finally {
			subMonitor.done();
		}
	}

	protected void enhanceProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, getEncoding(), null, true, project.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("UTF-8");
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		
		if(ProjectEmpty.getEmptyOption()) {
			facade.evaluate("vary::pseudocodigo::dsl::c::ui::wizard::VaryGrammarNewProjectEmpty::main", getProjectInfo());
		}
		else {
			facade.evaluate("vary::pseudocodigo::dsl::c::ui::wizard::VaryGrammarNewProject::main", getProjectInfo());
		}

		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	}

}