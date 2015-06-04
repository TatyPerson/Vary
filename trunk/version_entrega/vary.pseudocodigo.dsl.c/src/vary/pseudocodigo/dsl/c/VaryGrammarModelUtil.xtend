
package vary.pseudocodigo.dsl.c

import diagramapseudocodigo.Constantes
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.DiagramapseudocodigoFactory
import diagramapseudocodigo.Implementacion
import diagramapseudocodigo.VariableID

class VaryGrammarModelUtil {
	def static addConstante(Algoritmo algoritmo, Constantes constante, String nameOfEntityToAdd) {
		val model = algoritmo
			DiagramapseudocodigoFactory::eINSTANCE.createConstantes() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			valor = DiagramapseudocodigoFactory::eINSTANCE.createNumeroEntero() => [
				valor = 10
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
		/*if(constante.eContainer instanceof Algoritmo) {
			val model = constante.eContainer as Algoritmo
			DiagramapseudocodigoFactory::eINSTANCE.createConstantes() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
		} else if(constante.eContainer instanceof Modulo) {
			val model = constante.eContainer as Algoritmo
			DiagramapseudocodigoFactory::eINSTANCE.createConstantes() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
		}*/
	}
	
	def static addConstante(Implementacion implementacion, Constantes constante, String nameOfEntityToAdd) {
		val model = implementacion
			DiagramapseudocodigoFactory::eINSTANCE.createConstantes() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			valor = DiagramapseudocodigoFactory::eINSTANCE.createNumeroEntero() => [
				valor = 10
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
	}
}