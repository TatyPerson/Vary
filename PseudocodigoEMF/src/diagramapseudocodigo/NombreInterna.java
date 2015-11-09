/**
 */
package diagramapseudocodigo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nombre Interna</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diagramapseudocodigo.DiagramapseudocodigoPackage#getNombreInterna()
 * @model
 * @generated
 */
public enum NombreInterna implements Enumerator {
	/**
	 * The '<em><b>Cos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COS_VALUE
	 * @generated
	 * @ordered
	 */
	COS(0, "cos", "cos"),

	/**
	 * The '<em><b>Cuadrado</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUADRADO_VALUE
	 * @generated
	 * @ordered
	 */
	CUADRADO(1, "cuadrado", "cuadrado"),

	/**
	 * The '<em><b>Exp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXP_VALUE
	 * @generated
	 * @ordered
	 */
	EXP(2, "exp", "exp"),

	/**
	 * The '<em><b>Ln</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LN_VALUE
	 * @generated
	 * @ordered
	 */
	LN(3, "ln", "ln"), /**
	 * The '<em><b>Log</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_VALUE
	 * @generated
	 * @ordered
	 */
	LOG(4, "log", "log"),

	/**
	 * The '<em><b>Sen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEN_VALUE
	 * @generated
	 * @ordered
	 */
	SEN(5, "sen", "sen"),

	/**
	 * The '<em><b>Sqrt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQRT_VALUE
	 * @generated
	 * @ordered
	 */
	SQRT(6, "sqrt", "sqrt"), /**
	 * The '<em><b>Longitud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONGITUD_VALUE
	 * @generated
	 * @ordered
	 */
	LONGITUD(7, "longitud", "longitud"), /**
	 * The '<em><b>Concatena</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCATENA_VALUE
	 * @generated
	 * @ordered
	 */
	CONCATENA(8, "concatena", "concatena");

	/**
	 * The '<em><b>Cos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COS
	 * @model name="cos"
	 * @generated
	 * @ordered
	 */
	public static final int COS_VALUE = 0;

	/**
	 * The '<em><b>Cuadrado</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cuadrado</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUADRADO
	 * @model name="cuadrado"
	 * @generated
	 * @ordered
	 */
	public static final int CUADRADO_VALUE = 1;

	/**
	 * The '<em><b>Exp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exp</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXP
	 * @model name="exp"
	 * @generated
	 * @ordered
	 */
	public static final int EXP_VALUE = 2;

	/**
	 * The '<em><b>Ln</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ln</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LN
	 * @model name="ln"
	 * @generated
	 * @ordered
	 */
	public static final int LN_VALUE = 3;

	/**
	 * The '<em><b>Log</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Log</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOG
	 * @model name="log"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_VALUE = 4;

	/**
	 * The '<em><b>Sen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEN
	 * @model name="sen"
	 * @generated
	 * @ordered
	 */
	public static final int SEN_VALUE = 5;

	/**
	 * The '<em><b>Sqrt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sqrt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQRT
	 * @model name="sqrt"
	 * @generated
	 * @ordered
	 */
	public static final int SQRT_VALUE = 6;

	/**
	 * The '<em><b>Longitud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Longitud</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONGITUD
	 * @model name="longitud"
	 * @generated
	 * @ordered
	 */
	public static final int LONGITUD_VALUE = 7;

	/**
	 * The '<em><b>Concatena</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concatena</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCATENA
	 * @model name="concatena"
	 * @generated
	 * @ordered
	 */
	public static final int CONCATENA_VALUE = 8;

	/**
	 * An array of all the '<em><b>Nombre Interna</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NombreInterna[] VALUES_ARRAY =
		new NombreInterna[] {
			COS,
			CUADRADO,
			EXP,
			LN,
			LOG,
			SEN,
			SQRT,
			LONGITUD,
			CONCATENA,
		};

	/**
	 * A public read-only list of all the '<em><b>Nombre Interna</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NombreInterna> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nombre Interna</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreInterna get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreInterna result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Interna</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreInterna getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreInterna result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Interna</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NombreInterna get(int value) {
		switch (value) {
			case COS_VALUE: return COS;
			case CUADRADO_VALUE: return CUADRADO;
			case EXP_VALUE: return EXP;
			case LN_VALUE: return LN;
			case LOG_VALUE: return LOG;
			case SEN_VALUE: return SEN;
			case SQRT_VALUE: return SQRT;
			case LONGITUD_VALUE: return LONGITUD;
			case CONCATENA_VALUE: return CONCATENA;
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
	private NombreInterna(int value, String name, String literal) {
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
	
} //NombreInterna
