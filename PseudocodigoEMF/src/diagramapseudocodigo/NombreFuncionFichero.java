/**
 */
package diagramapseudocodigo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nombre Funcion Fichero</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNombreFuncionFichero()
 * @model
 * @generated
 */
public enum NombreFuncionFichero implements Enumerator {
	/**
	 * The '<em><b>Abrir</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABRIR_VALUE
	 * @generated
	 * @ordered
	 */
	ABRIR(0, "abrir", "abrir"),

	/**
	 * The '<em><b>Cerrar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERRAR_VALUE
	 * @generated
	 * @ordered
	 */
	CERRAR(1, "cerrar", "cerrar");

	/**
	 * The '<em><b>Abrir</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abrir</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABRIR
	 * @model name="abrir"
	 * @generated
	 * @ordered
	 */
	public static final int ABRIR_VALUE = 0;

	/**
	 * The '<em><b>Cerrar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cerrar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERRAR
	 * @model name="cerrar"
	 * @generated
	 * @ordered
	 */
	public static final int CERRAR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Nombre Funcion Fichero</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NombreFuncionFichero[] VALUES_ARRAY =
		new NombreFuncionFichero[] {
			ABRIR,
			CERRAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Nombre Funcion Fichero</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NombreFuncionFichero> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nombre Funcion Fichero</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreFuncionFichero get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreFuncionFichero result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Funcion Fichero</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreFuncionFichero getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreFuncionFichero result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Funcion Fichero</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreFuncionFichero get(int value) {
		switch (value) {
			case ABRIR_VALUE: return ABRIR;
			case CERRAR_VALUE: return CERRAR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NombreFuncionFichero(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NombreFuncionFichero
