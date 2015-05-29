/**
 */
package diagramapseudocodigo.tests;

import diagramapseudocodigo.DiagramapseudocodigoFactory;
import diagramapseudocodigo.VariableID;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable ID</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableIDTest extends OperadorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableIDTest.class);
	}

	/**
	 * Constructs a new Variable ID test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableIDTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable ID test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableID getFixture() {
		return (VariableID)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DiagramapseudocodigoFactory.eINSTANCE.createVariableID());
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

} //VariableIDTest
