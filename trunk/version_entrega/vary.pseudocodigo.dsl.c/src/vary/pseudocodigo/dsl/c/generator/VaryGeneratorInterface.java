package vary.pseudocodigo.dsl.c.generator;

import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Modulo;

public interface VaryGeneratorInterface {
	String obtenerNombre(Codigo myCodigo);
	String generarCabeceras(Modulo myModulo);
}
