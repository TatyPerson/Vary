package vary.pseudocodigo.dsl.c.english.ui.wizard.creator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.xtext.ui.util.IProjectFactoryContributor;
import org.eclipse.xtext.ui.util.IProjectFactoryContributor.IFileCreator;
import org.eclipse.xtext.ui.util.Messages;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ProjectFactory {
	private static final Logger LOGGER = Logger.getLogger(ProjectFactory.class);

	@Inject(optional = true)
	protected IWorkbench workbench;

	@Inject
	protected IWorkspace workspace;

	protected String projectName;
	protected IPath location;
	protected List<String> folders;
	protected List<IProject> referencedProjects;
	protected List<String> projectNatures;
	protected List<String> builderIds;
	protected List<IWorkingSet> workingSets;
	/**
	 * @since 2.4
	 */
	protected String defaultCharset;

	private List<IProjectFactoryContributor> contributors;

	public ProjectFactory addBuilderIds(String... builderIds) {
		if (this.builderIds == null)
			this.builderIds = Lists.newArrayList();
		this.builderIds.addAll(Arrays.asList(builderIds));
		return this;
	}

	public ProjectFactory addProjectNatures(String... projectNatures) {
		if (this.projectNatures == null)
			this.projectNatures = Lists.newArrayList();
		this.projectNatures.addAll(Arrays.asList(projectNatures));
		return this;
	}

	public ProjectFactory setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}

	public ProjectFactory setLocation(IPath location) {
		this.location = location;
		return this;
	}

	public ProjectFactory addFolders(List<String> folders) {
		if (this.folders == null)
			this.folders = Lists.newArrayList();
		this.folders.addAll(folders);
		return this;
	}

	public ProjectFactory addReferencedProjects(List<IProject> referencedProjects) {
		if (this.referencedProjects == null)
			this.referencedProjects = Lists.newArrayList();
		this.referencedProjects.addAll(referencedProjects);
		return this;
	}

	public ProjectFactory addWorkingSets(List<IWorkingSet> workingSets) {
		if (this.workingSets == null)
			this.workingSets = Lists.newArrayList();
		this.workingSets.addAll(workingSets);
		return this;
	}

	/**
	 * @since 2.3
	 */
	public void addContributor(IProjectFactoryContributor projectFactoryContributor) {
		if (this.contributors == null) {
			contributors = Lists.newArrayList();
		}
		contributors.add(projectFactoryContributor);
	}
	
	/**
	 * @since 2.4
	 */
	public void setProjectDefaultCharset(String encoding) {
		this.defaultCharset = encoding;
	}

	public IProject createProject(IProgressMonitor monitor, Shell shell) {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, 10);
		try {
			final IProjectDescription description = createProjectDescription();
			subMonitor.subTask(Messages.ProjectFactory_0 + description.getName());
			final IProject project = workspace.getRoot().getProject(projectName);
			if (!deleteExistingProject(project, shell, subMonitor)) {
				return null;
			}

			project.create(description, subMonitor.newChild(1));
			project.open(subMonitor.newChild(1));
			project.setDescription(description, subMonitor.newChild(1));
			project.setDefaultCharset(defaultCharset, subMonitor.newChild(1));
			createFolders(project, subMonitor, shell);
			enhanceProject(project, subMonitor, shell);

			if (contributors != null) {
				IFileCreator fileCreator = new IFileCreator() {

					@Override
					public IFile writeToFile(CharSequence chars, String fileName) {
						return ProjectFactory.this.writeToFile(chars, fileName, project, subMonitor);
					}
				};
				for (IProjectFactoryContributor contributor : contributors) {
					contributor.contributeFiles(project, fileCreator);
				}
			}
			return project;
		} catch (final CoreException exception) {
			LOGGER.error(exception.getMessage(), exception);
			return null;
		} finally {
			subMonitor.done();
		}
	}

	protected void createFolders(IProject project, SubMonitor subMonitor, Shell shell) throws CoreException {
		if (folders != null) {
			for (final String folderName : folders) {
				final IFolder folder = project.getFolder(folderName);
				if (!folder.exists()) {
					folder.create(false, true, subMonitor.newChild(1));
				}
			}
		}
	}

	protected void enhanceProject(final IProject project, final SubMonitor subMonitor, Shell shell)
			throws CoreException {
		if (workbench != null && workingSets != null) {
			workbench.getWorkingSetManager().addToWorkingSets(project,
					workingSets.toArray(new IWorkingSet[workingSets.size()]));
		}

	}

	protected boolean deleteExistingProject(IProject project, final Shell theShell, SubMonitor subMonitor)
			throws CoreException {
		// Clean up any old project information.
		if (project.exists()) {
			final boolean[] result = new boolean[1];
			if (workbench != null && theShell != null) {
				workbench.getDisplay().syncExec(new Runnable() {
					@Override
					public void run() {
						result[0] = MessageDialog.openQuestion(theShell, Messages.ProjectFactory_1 + projectName,
								Messages.ProjectFactory_2 + projectName + Messages.ProjectFactory_3);
					}
				});
			} else {
				result[0] = true;
			}
			if (result[0]) {
				project.delete(true, true, subMonitor.newChild(1));
			} else {
				return false;
			}
		}
		return true;
	}

	protected IProjectDescription createProjectDescription() {
		if(workspace == null) {
			workspace = IDEWorkbenchPlugin.getPluginWorkspace();
		}
		final IProjectDescription projectDescription = workspace.newProjectDescription(projectName);
		if (location != null && !Platform.getLocation().equals(location.removeLastSegments(1))) {
			projectDescription.setLocation(location);
		}

		if (referencedProjects != null && !referencedProjects.isEmpty()) {
			projectDescription
					.setReferencedProjects(referencedProjects.toArray(new IProject[referencedProjects.size()]));
		}
		if (projectNatures != null)
			projectDescription.setNatureIds(projectNatures.toArray(new String[projectNatures.size()]));
		if (builderIds != null)
			setBuilder(projectDescription, builderIds.toArray(new String[builderIds.size()]));
		return projectDescription;
	}

	protected void setBuilder(final IProjectDescription projectDescription, final String[] builders) {
		List<ICommand> commands = Lists.newArrayList();
		for (int i = 0; i < builders.length; i++) {
			ICommand command = projectDescription.newCommand();
			command.setBuilderName(builders[i]);
			commands.add(command);
		}
		projectDescription.setBuildSpec(commands.toArray(new ICommand[commands.size()]));
	}

	protected IFile createFile(final String name, final IContainer container, final String content,
			final IProgressMonitor progressMonitor) {
		final IFile file = container.getFile(new Path(name));
		createRecursive(file.getParent());
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 1);
		try {
			final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
			if (file.exists()) {
				LOGGER.debug("Overwriting content of '" + file.getFullPath() + "'");
				file.setContents(stream, true, true, subMonitor.newChild(1));
			} else {
				file.create(stream, true, subMonitor.newChild(1));
			}
			stream.close();
		} catch (final Exception e) {
			LOGGER.error(e.getMessage(), e);
		} finally {
			subMonitor.done();
		}
		return file;
	}

	/**
	 * 
	 * Shortcut method to be used with Xtend rich strings
	 * 
	 * @since 2.3
	 */
	protected IFile writeToFile(CharSequence chrSeq, String fileName, IProject project, IProgressMonitor progrMonitor) {
		return createFile(fileName, project, chrSeq.toString(), progrMonitor);
	}

	protected void createRecursive(final IContainer resource) {
		if (!resource.exists()) {
			if (!resource.getParent().exists()) {
				createRecursive(resource.getParent());
			}
			if (resource instanceof IFolder) {
				try {
					((IFolder) resource).create(false, true, new NullProgressMonitor());
				} catch (CoreException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
		}
	}
}
