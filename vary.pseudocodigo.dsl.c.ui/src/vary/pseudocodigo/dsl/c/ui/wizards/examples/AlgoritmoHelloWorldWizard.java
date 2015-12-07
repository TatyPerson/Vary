package vary.pseudocodigo.dsl.c.ui.wizards.examples;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "vyc". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class AlgoritmoHelloWorldWizard extends Wizard implements INewWizard {
	private AlgoritmoHelloWorldWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SampleNewWizard.
	 */
	public AlgoritmoHelloWorldWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new AlgoritmoHelloWorldWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		System.out.println("La path del wizard creation es:" +container.getProjectRelativePath().toOSString());
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream(fileName);
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream(String fileName) {
		String contents = new String();
		if(page.getExtensionFile().equals("p")) {
			fileName = fileName.replaceAll("\\.p","");
			contents =
					"Algoritmo " + fileName + '\n' + '\n' +
					"importa" + '\n' +
					"fin_importa" + '\n' + '\n' +
				 
					"//Seccion de definicion de constantes (opcional)" + '\n' +
					"const" + '\n' +	

					"//Seccion de definicion de tipos (opcional)" + '\n' +
					"tipo" + '\n' +
					
					"//Seccion de definicion de subalgoritmos: funciones y procedimientos" + '\n' +	'\n' +


					"//Comienzo del algoritmo (Obligatorio)" + '\n' +
					"principal" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "cadena: saludo" + '\n' +
				    '\t' + "inicio //Cuerpo del algoritmo principal" + '\n' +
				    '\t' + '\t' + "saludo <- \"Hola!\"" + '\n' +
					'\t' + '\t' + "escribir(saludo)" + '\n' +
					"fin_principal" + '\n' + '\n' +
					
					"fin_algoritmo";
		} else if(page.getExtensionFile().equals("ep")) {
			fileName = fileName.replaceAll("\\.ep","");
			contents = "Algorithm " + fileName + '\n' + '\n' +
					"import" + '\n' +
					"end_import" + '\n' + '\n' +
				 
					"//Constant definition section (optional)" + '\n' +
					"const" + '\n' +	

					"//Section type definition (optional)" + '\n' +
					"type" + '\n' +
					
					"//Subalgorithms definition section: functions and procedures" + '\n' +	'\n' +

					"//Start of algorithm (Required)" + '\n' +
					"main" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "string: greeting" + '\n' +
				    '\t' + "initiation //Body main algorithm" + '\n' +
				    '\t' + '\t' + "greeting <- \"Hello!\"" + '\n' +
					'\t' + '\t' + "write(greeting)" + '\n' +
					"end_main" + '\n' + '\n' +
					
					"end_algorithm";
		}
		return new ByteArrayInputStream(contents.getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "vary.pseudocodigo.dsl.c.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}