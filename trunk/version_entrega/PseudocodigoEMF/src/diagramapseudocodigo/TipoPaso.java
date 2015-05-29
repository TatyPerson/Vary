/**
 */
package diagramapseudocodigo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Paso</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getTipoPaso()
 * @model
 * @generated
 */
public enum TipoPaso implements Enumerator {
	/**
	 * The '<em><b>Entrada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRADA_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRADA(0, "Entrada", "E"),

	/**
	 * The '<em><b>Entrada Salida</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRADA_SALIDA_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRADA_SALIDA(1, "EntradaSalida", "E/S"), /**
	 * The '<em><b>Salida</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALIDA_VALUE
	 * @generated
	 * @ordered
	 */
	SALIDA(2, "Salida", "S");

	/**
	 * The '<em><b>Entrada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entrada</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRADA
	 * @model name="Entrada" literal="E"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRADA_VALUE = 0;

	/**
	 * The '<em><b>Entrada Salida</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entrada Salida</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTRADA_SALIDA
	 * @model name="EntradaSalida" literal="E/S"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRADA_SALIDA_VALUE = 1;

	/**
	 * The '<em><b>Salida</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Salida</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SALIDA
	 * @model name="Salida" literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int SALIDA_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tipo Paso</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPaso[] VALUES_ARRAY =
		new TipoPaso[] {
			ENTRADA,
			ENTRADA_SALIDA,
			SALIDA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Paso</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPaso> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Paso</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPaso get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPaso result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Paso</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPaso getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPaso result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Paso</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPaso get(int value) {
		switch (value) {
			case ENTRADA_VALUE: return ENTRADA;
			case ENTRADA_SALIDA_VALUE: return ENTRADA_SALIDA;
			case SALIDA_VALUE: return SALIDA;
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
	private TipoPaso(int value, String name, String literal) {
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
	
} //TipoPaso
