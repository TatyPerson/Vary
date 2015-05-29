/**
 */
package diagramapseudocodigo.tests;

import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.Funcion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuncionTest extends SubprocesoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FuncionTest.class);
	}

	/**
	 * Constructs a new Funcion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Funcion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Funcion getFixture() {
		return (Funcion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramapseudocodigoFactory.eINSTANCE.createFuncion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FuncionTest
