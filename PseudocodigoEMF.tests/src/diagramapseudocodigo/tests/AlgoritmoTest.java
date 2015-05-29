/**
 */
package diagramapseudocodigo.tests;

import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.DiagramapseudocodigoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Algoritmo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgoritmoTest extends CodigoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlgoritmoTest.class);
	}

	/**
	 * Constructs a new Algoritmo test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgoritmoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Algoritmo test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Algoritmo getFixture() {
		return (Algoritmo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramapseudocodigoFactory.eINSTANCE.createAlgoritmo());
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

} //AlgoritmoTest
