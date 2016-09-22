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

public class ModuloExampleWizard extends Wizard implements INewWizard {
	private ModuloExampleWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SampleNewWizard.
	 */
	public ModuloExampleWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new ModuloExampleWizardPage(selection);
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
					"Modulo " + fileName + '\n' +
					"importa" + '\n' +
					"fin_importa" + '\n' + '\n' +
					"exporta" + '\n' +
					'\t' + "const" + '\n' +
					'\t' + '\t' + "DIM" + '\n' +
					'\t' + "tipo" + '\n' +
					'\t' + '\t' + "tVect" + '\n' +
					'\t' + "procedimiento leerVector(S tVect: v, E entero: n)" + '\n' +
					"fin_exporta" + '\n' + '\n' +

					"implementacion" + '\n' +
					"const" + '\n' +	
					'\t' + "//Ejemplo de declaracion de una constante:" + '\n' +
					'\t' + "DIM = 10" + '\n' + '\n' +

					"//Seccion de definicion de tipos (opcional)" + '\n' +
					"tipo" +
					'\t' + "//Ejemplo de vector de tipo entero" + '\n' +
					'\t' + "vector [DIM] de entero:  tVect" + '\n' + '\n' +
					'\t'+ "//Precondicion: v es una variable de tipo tVect, vector de elementos de tipo entero." + '\n' +
					'\t' + "//n es una variable entera que debe estar inicializada n>=0." + '\n' +
					'\t' + "//Postcondicion: v es inicializado" + '\n' +
					"procedimiento leerVector(S tVect: v, E entero: n)" + '\n' +
						'\t' + "var" + '\n' +
				    	'\t' + '\t' + "entero: i" + '\n' +
						'\t' + "inicio" + '\n' +
				   			'\t' + '\t' + "desde i <- 1 hasta n hacer" + '\n' +
				      		'\t' + '\t' + '\t' + "leerElemento(v,i)" + '\n' +
				   			'\t' + '\t' + "fin_desde" + '\n' +
				   		'\t' + "fin_inicio" + '\n' +
				   	"fin_procedimiento" + '\n' + '\n' +
				   	
				   	"procedimiento leerElemento(E tVect: v, E entero: i)" + '\n' +
				   	'\t' + "var" + '\n' +
				   	'\t' + "inicio" + '\n' +
				   	'\t' + '\t' + "leer(v[i])" + '\n' +
				   	'\t' + "fin_inicio" + '\n' +
				   	"fin_procedimiento" + '\n' +
				   	"fin_implementacion" + '\n' + '\n' +
				   	"fin_modulo";
		} else if(page.getExtensionFile().equals("ep")) {
			fileName = fileName.replaceAll("\\.ep","");
			contents =
					"Module " + fileName + '\n' +
					"import" + '\n' +
					"end_import" + '\n' + '\n' +
					"export" + '\n' +
					'\t' + "const" + '\n' +
					'\t' + '\t' + "DIM" + '\n' +
					'\t' + "type" + '\n' +
					'\t' + '\t' + "tVect" + '\n' +
					'\t' + "procedure readVector(S tVect: v, E integer: n)" + '\n' +
					"end_export" + '\n' + '\n' +

					"implementation" + '\n' +
					"const" + '\n' +	
					'\t' + "///Example of declaration of a constant:" + '\n' +
					'\t' + "DIM = 10" + '\n' + '\n' +

					"//Section type definition (optional)" + '\n' +
					"type" +
					'\t' + "//Example integer vector" + '\n' +
					'\t' + "vector [DIM] of integer:  tVect" + '\n' + '\n' +
					'\t'+ "//Precondition: v is a variable of type tVect, vector integer elements." + '\n' +
					'\t' + "//n is an integer variable that must be initialized n>= 0." + '\n' +
					'\t' + "//Postcondition: v is initialized" + '\n' +
					"procedure readVector(S tVect: v, E integer: n)" + '\n' +
						'\t' + "var" + '\n' +
				    	'\t' + '\t' + "integer: i" + '\n' +
						'\t' + "start" + '\n' +
				   			'\t' + '\t' + "for i <- 1 to n do" + '\n' +
				      		'\t' + '\t' + '\t' + "readElement(v,i)" + '\n' +
				   			'\t' + '\t' + "end_for" + '\n' +
				   	"end_procedure" + '\n' + '\n' +
				   	
				   	"procedure readElement(E tVect: v, E integer: i)" + '\n' +
				   	'\t' + "var" + '\n' +
				   	'\t' + "start" + '\n' +
				   	'\t' + '\t' + "read(v[i])" + '\n' +
				   	"end_procedure" + '\n' +
				   	"end_implementation" + '\n' + '\n' +
				   	"end_module";
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