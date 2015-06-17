package vary.pseudocodigo.dsl.c.ui.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.model.IPathEntry;
import org.eclipse.cdt.core.model.ISourceEntry;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.make.core.MakeBuilder;
import org.eclipse.cdt.managedbuilder.core.BuildException;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IConfiguration;
import org.eclipse.cdt.managedbuilder.core.IProjectType;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedBuildInfo;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkingSet;

import vary.pseudocodigo.dsl.c.generator.util.LenguajeProyecto;
import vary.pseudocodigo.dsl.c.generator.util.ProjectHeaderFile;
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder;


@SuppressWarnings("restriction")
public class CProjectFactory extends ProjectFactory {
	
	private static final Logger logger = Logger.getLogger(CProjectFactory.class);

	@Override
	protected void enhanceProject(IProject project, SubMonitor monitor, Shell shell) throws CoreException, CModelException {
		super.enhanceProject(project, monitor, shell);
		if(builderIds.contains(MakeBuilder.BUILDER_ID)) {
			//Contruimos un proyecto C++
			
			System.out.println("La FullPath del proyecto es:"+project.getLocation());
			ProjectLocationFolder.setPath(project.getLocation().toString());
			
			CProjectNature.addCNature(project, monitor);
			ICProjectDescriptionManager mgr = CoreModel.getDefault().getProjectDescriptionManager();
			ICProjectDescription des = mgr.getProjectDescription(project, true);

			if (des != null)
			        return; // C project description already exists

			des = mgr.createProjectDescription(project, true);

			ManagedBuildInfo info = ManagedBuildManager.createBuildInfo(project);
			IProjectType projType = null;
			IToolChain toolChain = null;
			
			if(Platform.getOS().equals(Platform.OS_MACOSX)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.macosx.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.macosx.exe.release");
				ProjectLocationFolder.setOS("MACOSX");
			}
			else if(Platform.getOS().equals(Platform.OS_WIN32)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.gnu.cygwin.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.cygwin.exe.release");
				ProjectLocationFolder.setOS("WIN32");
				String pathAux = new String();
				for(int i=0; i<ProjectLocationFolder.getPath().length(); i++) {
					if(ProjectLocationFolder.getPath().charAt(i) == '/') {
						pathAux = pathAux + "\\\\";
					}
					else {
						pathAux = pathAux + ProjectLocationFolder.getPath().charAt(i);
					}
				}
				pathAux = pathAux + "\\\\";
				ProjectLocationFolder.setPath(pathAux);
				logger.error("Es un Windows!");
				logger.error(ProjectLocationFolder.getPath());
			}
			else if(Platform.getOS().equals(Platform.OS_LINUX)) {
				projType =
				         ManagedBuildManager.getExtensionProjectType("cdt.managedbuild.target.gnu.exe"); 
				toolChain =
				         ManagedBuildManager.getExtensionToolChain("cdt.managedbuild.toolchain.gnu.exe.release");
				ProjectLocationFolder.setOS("LINUX");
			}
			else {
				System.out.println("Otro SO");
			}
			

			ManagedProject mProj = new ManagedProject(project, projType);
			info.setManagedProject(mProj);

			IConfiguration[] configs = ManagedBuildManager.getExtensionConfigurations(toolChain, projType);

			for (IConfiguration icf : configs) {
			    if (!(icf instanceof Configuration)) {
			        continue;
			    }
			    Configuration cf = (Configuration) icf;

			    String id = ManagedBuildManager.calculateChildId(cf.getId(), null);
			    Configuration config = new Configuration(mProj, cf, id, false, true);

			    ICConfigurationDescription cfgDes =
			    des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID,
			                                         config.getConfigurationData());
			    config.setConfigurationDescription(cfgDes);
			    config.exportArtifactInfo();

			    IBuilder bld = config.getEditableBuilder();
			    if (bld != null) { bld.setManagedBuildOn(true); }

			    config.setName(toolChain.getName());
			    config.setArtifactName(project.getName());

			}

			mgr.setProjectDescription(project, des);
		    
		    ICProject cProject = CoreModel.getDefault().create(project);
		    IPathEntry[] entries = cProject.getRawPathEntries();
		    List<IPathEntry> newEntries = new ArrayList<IPathEntry>(Arrays.asList(entries));
		    ISourceEntry sourceEntry = CoreModel.newSourceEntry(project.getFullPath().append("src-gen"));
		    newEntries.add(sourceEntry);
		    CoreModel.setRawPathEntries(cProject, (IPathEntry[]) newEntries.toArray(new IPathEntry[newEntries.size()]), null);
		    
		    IConfiguration activeConfig = ManagedBuildManager.getBuildInfo(project).getDefaultConfiguration();
		    try {
				activeConfig.setManagedBuildOn(true);
			} catch (BuildException e1) {
				e1.printStackTrace();
			} 
		    ManagedBuildManager.saveBuildInfo(project, true);
		    monitor.worked(1);
		}
		createFile(".varyproject", project, "ficheroCabeceras="+ProjectHeaderFile.getHeaderOption()
				+'\n' + "lenguajeGeneracion=" +LenguajeProyecto.getLenguajeProyecto() , monitor);
	}
	
	protected void addMoreClasspathEntriesTo(List<IClasspathEntry> classpathEntries) {}

	@Override
	public CProjectFactory addBuilderIds(String... builderIds) {
		return (CProjectFactory) super.addBuilderIds(builderIds);
	}

	@Override
	public CProjectFactory addFolders(List<String> folders) {
		return (CProjectFactory) super.addFolders(folders);
	}

	@Override
	public CProjectFactory setProjectName(String projectName) {
		return (CProjectFactory) super.setProjectName(projectName);
	}

	@Override
	public CProjectFactory addProjectNatures(String... projectNatures) {
		return (CProjectFactory) super.addProjectNatures(projectNatures);
	}
	
	@Override
	public CProjectFactory addReferencedProjects(List<IProject> referencedProjects) {
		return (CProjectFactory) super.addReferencedProjects(referencedProjects);
	}

	@Override
	public CProjectFactory setLocation(IPath location) {
		return (CProjectFactory) super.setLocation(location);
	}
	
	@Override
	public CProjectFactory addWorkingSets(List<IWorkingSet> workingSets) {
		return (CProjectFactory) super.addWorkingSets(workingSets);
	}
	
}
