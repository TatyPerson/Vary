/**
 */
package diagramapseudocodigo.tests;

import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.Negativa;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negativa</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegativaTest extends operacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegativaTest.class);
	}

	/**
	 * Constructs a new Negativa test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negativa test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Negativa getFixture() {
		return (Negativa)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramapseudocodigoFactory.eINSTANCE.createNegativa());
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

} //NegativaTest
