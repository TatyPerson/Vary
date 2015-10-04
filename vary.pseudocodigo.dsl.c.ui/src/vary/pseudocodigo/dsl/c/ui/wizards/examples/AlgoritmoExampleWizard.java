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

public class AlgoritmoExampleWizard extends Wizard implements INewWizard {
	private AlgoritmoExampleWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for SampleNewWizard.
	 */
	public AlgoritmoExampleWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new AlgoritmoExampleWizardPage(selection);
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
					'\t' + "moduloEjemplo" + '\n' +
					"fin_importa" + '\n' + '\n' +
				 
					"//Seccion de definicion de constantes (opcional)" + '\n' +
					"const" + '\n' +	
					'\t' + "//Ejemplo de declaracion de una constante:" + '\n' +
					'\t' + "DIM = 10" + '\n' + '\n' +

					"//Seccion de definicion de tipos (opcional)" + '\n' +
					"tipo" +
					'\t' + "//Ejemplo de vector de tipo entero" + '\n' +
					'\t' + "vector [DIM] de entero:  tVect" + '\n' + '\n' +
					
					"//Seccion de definicion de subalgoritmos: funciones y procedimientos" + '\n' +	'\n' +

					"//Ejemplo de funcion para realizar la suma de dos numeros" + '\n' + '\n' +

					"//Precondicion: a, b>=0 (enteros inicializados)" + '\n' +
					"//Postcondicion: devuelve a + b" + '\n' +
					"entero funcion sumaFun(E entero: a, E entero:  b)" + '\n' +
					'\t' + "var //Declaracion de variables" + '\n' +
					'\t' + '\t' + "entero:  resultado" + '\n' +
					'\t' + "inicio //Cuerpo de la funcion" + '\n' +
					'\t' + '\t' + "resultado <- a + b" + '\n' +
					'\t' + '\t' + "devolver resultado" + '\n' +
					'\t' + "fin_inicio" + '\n' +
					"fin_funcion" + '\n' + '\n' +

					"//Ejemplo de procedimiento para realizar la suma de dos numeros" + '\n' + '\n' +
					
					"//Precondicion: a, b>=0 (enteros inicializados)" + '\n' +
					"//Postcondicion: devuelve a + b" + '\n' +
					"procedimiento sumaProc(E entero: a, E entero: b, S entero: res)" + '\n' +
					'\t' + "var" + '\n' +
					'\t' + "inicio //Cuerpo del procedimiento" + '\n' +
					'\t' + '\t' + "res <- a + b" + '\n' +
					'\t' + "fin_inicio" + '\n' +
					"fin_procedimiento" + '\n' + '\n' +

					"//Precondicion: v es una variable de tipo tVect, vector de elementos de tipo entero." + '\n' +
					"//n es una variable entera que debe estar inicializada n>=0." + '\n' + 
					"//Postcondicion: v es inicializado" + '\n' +
					"procedimiento leerVector(S tVect: v, E entero: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "entero: i" + '\n' +
				    '\t' + "inicio" + '\n' + '\n' +
				    '\t' + '\t' + "desde i <- 1 hasta n hacer" + '\n' +
				    '\t' + '\t' + '\t' + "leer(v[i])" + '\n' +
				   	'\t' + '\t' + "fin_desde" + '\n' +
				   	'\t' + "fin_inicio" + '\n' +
				   	"fin_procedimiento" + '\n' + '\n' +

				   	"//Precondicion: v es una variable de tipo tVect, vector de elementos de tipo entero." + '\n' +
				   	"//n es una variable entera que debe estar inicializada n>=0." + '\n' +
				   	"//Postcondicion: devuelve el producto escalar del vector v" + '\n' +
				   	"entero funcion productoEscalar(E tVect: v, E entero: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "entero: res, i" + '\n' +
				    '\t' + "inicio" + '\n' +
				    '\t' + '\t' + "i <- 1" + '\n' +
				    '\t' + '\t' + "res <- 0" + '\n' +
				    '\t' + '\t' + "//Ejemplo de bucle mientras." + '\n' +
				    '\t' + '\t' + "mientras i <=n hacer" + '\n' +
				    '\t' + '\t' + '\t' + "res <- res + v[i]" + '\n' +
				    '\t' + '\t' + "fin_mientras" + '\n' +
				    '\t' + '\t' + "devolver res" + '\n' +
				    '\t' + "fin_inicio" + '\n' +
				    "fin_funcion" + '\n' + '\n' +

				    "//Precondicion: v es una variable de tipo tVect, vector de elementos de tipo entero." + '\n' +
				    "//n es una variable entera que debe estar inicializada n>=0." + '\n' +
				    "//Postcondicion: escribe los valores del vector por la salida estandar" + '\n' +
				    "procedimiento escribirVector(E tVect: v, E entero: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "entero: i" + '\n' +
				    '\t' + "inicio" + '\n' +
				    '\t' + '\t' + "desde i <- 1 hasta n hacer" + '\n' +
				    '\t' + '\t' + '\t' + "escribir(v[i])" + '\n' +
				    '\t' + '\t' + "fin_desde" + '\n' +
				    '\t' + "fin_inicio" + '\n' +
				    "fin_procedimiento" + '\n' + '\n' +


				    "//Precondicion: funcion para comenzar el calculo del producto escalar de un vector" + '\n' +
				    "//Postcondicion: llama a los procedimientos y funciones para inicializar un vector, escribirlo y calcular su producto escalar." + '\n' +
				    "procedimiento calculo_productoEscalar()" + '\n' +
					'\t' + "var" + '\n' +
				    '\t'+ '\t' + "tVect: v" + '\n' +  
				    '\t' + "inicio" + '\n' +
					'\t' + '\t' + "escribir(\"Introduzca los elementos del vector: \")" + '\n' +
					'\t' + '\t' + "leerVector(v, DIM)" + '\n' +
					'\t' + '\t' + "escribir(\"El producto escalar del vector: \")" + '\n' +
					'\t' + '\t' + "escribirVector(v, DIM)" + '\n' +
				    '\t' + '\t' + "escribir(\"es: \", productoEscalar(v,DIM))" + '\n' +
				    '\t' + "fin_inicio" + '\n' +
				    "fin_procedimiento" + '\n' + '\n' +


				    "//Precondicion: funcion menu, no recibe ningun parametro" + '\n' +
				    "//Postcondicion: visualiza menu de operaciones en pantalla" + '\n' +
				    "entero funcion menu()" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "entero: valor" + '\n' +
				    '\t' + "inicio" + '\n' + 
				    '\t' + '\t' + "repetir" + '\n' +
				    '\t' + '\t' + '\t' + "escribir(\"Elija una opcion: \")" + '\n' +
				    '\t' + '\t' + '\t' + "escribir(\"1: Sumar dos operandos con una funcion.\")" + '\n' +
				    '\t' + '\t' + '\t' + "escribir(\"2: Sumar dos operandos con un procedimiento.\")" + '\n' +
				    '\t' + '\t' + '\t' + "escribir(\"3: Calcular el producto escalar de un vector.\")" + '\n' +
				    '\t' + '\t' + "hasta_que valor>0 y valor<=3" + '\n' +
				    '\t' + '\t' + "devolver valor" + '\n' +
				    '\t' + "fin_inicio" + '\n' +
				    "fin_funcion" + '\n' + '\n' +
					
				    "procedimiento operacion(E entero: opcion)" + '\n' +
				    '\t' + "var" + '\n' +
				    '\t' + '\t' + "tVect: vect" + '\n' +
					'\t' + '\t' + "entero: a, b, resultado" + '\n' +
					'\t' + "inicio" + '\n' +
				    '\t' + '\t' + "escribir(\"Introduce el valor del sumando a\")" + '\n' +
					'\t' + '\t' + "leer(a)" + '\n' +
					'\t' + '\t' + "escribir(\"Introduce el valor del sumando b\")" + '\n' +
					'\t' + '\t' + "leer(b)" + '\n' +
					'\t' + '\t' + "segun_sea(opcion) hacer" + '\n' +
					'\t' + '\t' + '\t' + "caso 1:  escribir(\"La suma de ambos valores calculado con la funcion es: \", sumaFun(a,b))" + '\n' +
					'\t' + '\t' + '\t' + "caso 2: sumaProc(a,b, resultado)" + '\n' +
					'\t' + '\t' + '\t' + '\t' + "escribir(\"La suma de ambos valores calculdo con el procedimiento es: \", resultado)" + '\n' +
				    '\t' + '\t' + '\t' + "caso 3:  //Llamadas a los subalgoritmos para calcular el producto escalar de un vector" + '\n' +
				    '\t' + '\t' + '\t' + '\t' + "calculo_productoEscalar()" + '\n' +
				    '\t' + '\t' + '\t' + "en_otro_caso: escribir(\"Opcion no valida.\")" + '\n' +
					'\t' + '\t' + "fin_segun" + '\n' +
					'\t' + "fin_inicio" + '\n' +
					"fin_procedimiento" + '\n' + '\n' +


					"//Comienzo del algoritmo (Obligatorio)" + '\n' +
					"principal" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "entero: opcion" + '\n' +
				    '\t' + "inicio //Cuerpo del algoritmo principal" + '\n' +
					"//Llamadas a los subalgoritmos para comenzar la traza del algoritmo" + '\n' +
					"//En este ejemplo se realiza la llamada al menu y posteriormente a operacion" + '\n' +
					'\t' + '\t' + "opcion <- menu()" + '\n' +
					'\t' + '\t' + "operacion(opcion)" + '\n' +
					"fin_inicio" + '\n' + '\n' +
					
					"fin_algoritmo";
		} else if(page.getExtensionFile().equals("ep")) {
			fileName = fileName.replaceAll("\\.ep","");
			contents = "Algorithm " + fileName + '\n' + '\n' +
					"import" + '\n' +
					'\t' + "moduleExample" + '\n' +
					"end_import" + '\n' + '\n' +
				 
					"//Constant definition section (optional)" + '\n' +
					"const" + '\n' +	
					'\t' + "//Example of declaration of a constant:" + '\n' +
					'\t' + "DIM = 10" + '\n' + '\n' +

					"//Section type definition (optional)" + '\n' +
					"type" +
					'\t' + "//Example integer vector" + '\n' +
					'\t' + "vector [DIM] of integer:  tVect" + '\n' + '\n' +
					
					"//Subalgorithms definition section: functions and procedures" + '\n' +	'\n' +

					"//Example function for the sum of two numbers" + '\n' + '\n' +

					"//Precondition: a, b>= 0 (integer initialized)" + '\n' +
					"//Postcondition: returns a + b" + '\n' +
					"integer function sumFun(E integer: a, E integer:  b)" + '\n' +
					'\t' + "var //Declaration of variables" + '\n' +
					'\t' + '\t' + "integer:  result" + '\n' +
					'\t' + "initiation //Body Function" + '\n' +
					'\t' + '\t' + "result <- a + b" + '\n' +
					'\t' + '\t' + "return result" + '\n' +
					'\t' + "end_initiation" + '\n' +
					"end_function" + '\n' + '\n' +

					"//Example of the procedure for adding two numbers" + '\n' + '\n' +
					
					"//Precondition: a, b>= 0 (integer initialized)" + '\n' +
					"//Postcondition: returns a + b" + '\n' +
					"procedure sumProc(E integer: a, E integer: b, S integer: res)" + '\n' +
					'\t' + "var" + '\n' +
					'\t' + "initiation //Body Procedure" + '\n' +
					'\t' + '\t' + "res <- a + b" + '\n' +
					'\t' + "end_initiation" + '\n' +
					"end_procedure" + '\n' + '\n' +

					"//Precondition: v is a variable of type tVect, vector integer elements." + '\n' +
					"//n is an integer variable that must be initialized n>= 0." + '\n' + 
					"//Postcondition: v is initialized" + '\n' +
					"procedure readVector(S tVect: v, E integer: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "integer: i" + '\n' +
				    '\t' + "initiation" + '\n' + '\n' +
				    '\t' + '\t' + "for i <- 1 to n do" + '\n' +
				    '\t' + '\t' + '\t' + "read(v[i])" + '\n' +
				   	'\t' + '\t' + "end_for" + '\n' +
				   	'\t' + "end_initiation" + '\n' +
				   	"end_procedure" + '\n' + '\n' +

				   	"//Precondition: v is a variable of type tVect, vector integer elements." + '\n' +
				   	"//n is an integer variable that must be initialized n>= 0. " + '\n' +
				   	"//Postcondition: returns the scalar product of the vector v" + '\n' +
				   	"integer function scalarProduct(E tVect: v, E integer: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "integer: res, i" + '\n' +
				    '\t' + "initiation" + '\n' +
				    '\t' + '\t' + "i <- 1" + '\n' +
				    '\t' + '\t' + "res <- 0" + '\n' +
				    '\t' + '\t' + "//While loop example." + '\n' +
				    '\t' + '\t' + "while i <=n do" + '\n' +
				    '\t' + '\t' + '\t' + "res <- res + v[i]" + '\n' +
				    '\t' + '\t' + "end_while" + '\n' +
				    '\t' + '\t' + "return res" + '\n' +
				    '\t' + "end_initiation" + '\n' +
				    "end_function" + '\n' + '\n' +

				    "//Precondition: v is a variable of type tVect, vector integer elements. " + '\n' +
				    "//n is an integer variable that must be initialized n>= 0." + '\n' +
				    "//Postcondition: vector values writes to stdout" + '\n' +
				    "procedure writeVector(E tVect: v, E integer: n)" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "integer: i" + '\n' +
				    '\t' + "initiation" + '\n' +
				    '\t' + '\t' + "for i <- 1 to n do" + '\n' +
				    '\t' + '\t' + '\t' + "write(v[i])" + '\n' +
				    '\t' + '\t' + "end_for" + '\n' +
				    '\t' + "end_initiation" + '\n' +
				    "end_procedure" + '\n' + '\n' +


				    "//Precondition: function to start calculating the scalar product of a vector" + '\n' +
				    "//Postcondition: calls to procedures and functions to initialize a vector, write and calculate their scalar product." + '\n' +
				    "procedure calculation_scalarProduct()" + '\n' +
					'\t' + "var" + '\n' +
				    '\t'+ '\t' + "tVect: v" + '\n' +  
				    '\t' + "initiation" + '\n' +
					'\t' + '\t' + "write(\"Enter the vector elements: \")" + '\n' +
					'\t' + '\t' + "readVector(v, DIM)" + '\n' +
					'\t' + '\t' + "write(\"The scalar product of the vector: \")" + '\n' +
					'\t' + '\t' + "writeVector(v, DIM)" + '\n' +
				    '\t' + '\t' + "write(\"is: \", scalarProduct(v,DIM))" + '\n' +
				    '\t' + "end_initiation" + '\n' +
				    "end_procedure" + '\n' + '\n' +


				    "//Precondition: Menu function receives no parameter" + '\n' +
				    "//Postcondition: Operation menu displayed on screen" + '\n' +
				    "integer function menu()" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "integer: value" + '\n' +
				    '\t' + "initiation" + '\n' + 
				    '\t' + '\t' + "repeat" + '\n' +
				    '\t' + '\t' + '\t' + "write(\"Choose one: \")" + '\n' +
				    '\t' + '\t' + '\t' + "write(\"1: Add two operands to a function.\")" + '\n' +
				    '\t' + '\t' + '\t' + "write(\"2: Add two operands with a procedure.\")" + '\n' +
				    '\t' + '\t' + '\t' + "write(\"3: Calculate the scalar product of a vector.\")" + '\n' +
				    '\t' + '\t' + "until value>0 and value<=3" + '\n' +
				    '\t' + '\t' + "return value" + '\n' +
				    '\t' + "end_initiation" + '\n' +
				    "end_function" + '\n' + '\n' +
					
				    "procedure operation(E integer: option)" + '\n' +
				    '\t' + "var" + '\n' +
				    '\t' + '\t' + "tVect: vect" + '\n' +
					'\t' + '\t' + "integer: a, b, result" + '\n' +
					'\t' + "initiation" + '\n' +
				    '\t' + '\t' + "write(\"Enter the value of adding a\")" + '\n' +
					'\t' + '\t' + "read(a)" + '\n' +
					'\t' + '\t' + "write(\"Enter the value of adding b\")" + '\n' +
					'\t' + '\t' + "read(b)" + '\n' +
					'\t' + '\t' + "according_to(option) do" + '\n' +
					'\t' + '\t' + '\t' + "case 1:  write(\"The sum of both values is calculated with the function: \", sumFun(a,b))" + '\n' +
					'\t' + '\t' + '\t' + "case 2: sumProc(a,b, result)" + '\n' +
					'\t' + '\t' + '\t' + '\t' + "write(\"The sum of both values calculated with the procedure is: \", result)" + '\n' +
				    '\t' + '\t' + '\t' + "case 3:  //Call the sub-algorithms to calculate the scalar product of a vector" + '\n' +
				    '\t' + '\t' + '\t' + '\t' + "calculation_scalarProduct()" + '\n' +
				    '\t' + '\t' + '\t' + "otherwise: write(\"Invalid option.\")" + '\n' +
					'\t' + '\t' + "end_according_to" + '\n' +
					'\t' + "end_initiation" + '\n' +
					"end_procedure" + '\n' + '\n' +


					"//Start of algorithm (Required)" + '\n' +
					"main" + '\n' +
					'\t' + "var" + '\n' +
				    '\t' + '\t' + "integer: option" + '\n' +
				    '\t' + "initiation //Body main algorithm" + '\n' +
					"//Calls to subalgorithms to start the trace of the algorithm" + '\n' +
					"//In this example the menu call operation is performed subsequently." + '\n' +
					'\t' + '\t' + "option <- menu()" + '\n' +
					'\t' + '\t' + "operation(option)" + '\n' +
					"end_initiation" + '\n' + '\n' +
					
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