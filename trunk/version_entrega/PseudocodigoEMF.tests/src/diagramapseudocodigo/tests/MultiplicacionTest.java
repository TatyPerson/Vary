/**
 */
package diagramapseudocodigo.tests;

import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.Multiplicacion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiplicacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplicacionTest extends operacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiplicacionTest.class);
	}

	/**
	 * Constructs a new Multiplicacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicacionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multiplicacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Multiplicacion getFixture() {
		return (Multiplicacion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramapseudocodigoFactory.eINSTANCE.createMultiplicacion());
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

} //MultiplicacionTest
