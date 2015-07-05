
package vary.pseudocodigo.dsl.c

import diagramapseudocodigo.Constantes
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.DiagramapseudocodigoFactory
import diagramapseudocodigo.Implementacion
import diagramapseudocodigo.VariableID
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.Variable
import java.util.List
import diagramapseudocodigo.Declaracion
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface
import diagramapseudocodigo.TipoVariable
import diagramapseudocodigo.Subproceso

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
	
	def static addVariable(Inicio inicio, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = inicio
		System.out.println("Estoy en la funcion del quixfix")
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			System.out.println("Es tipo nativo")
			model.declaracion.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionVariable() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = TipoVariable::ENTERO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = TipoVariable::LOGICO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = TipoVariable::REAL
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = TipoVariable::CADENA
				}
				else {
					tipo = TipoVariable::CARACTER
				}
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.declaracion.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionPropia() => [
				tipo = nombreTipo
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
	
	def static addVariable(Subproceso subproceso, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = subproceso
		System.out.println("Estoy en la funcion del quixfix")
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			System.out.println("Es tipo nativo")
			model.declaracion.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionVariable() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = TipoVariable::ENTERO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = TipoVariable::LOGICO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = TipoVariable::REAL
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = TipoVariable::CADENA
				}
				else {
					tipo = TipoVariable::CARACTER
				}
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.declaracion.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionPropia() => [
				tipo = nombreTipo
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
	
	def static addVariable(Implementacion implementacion, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = implementacion
		System.out.println("Estoy en la funcion del quixfix")
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			System.out.println("Es tipo nativo")
			model.global.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionVariable() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = TipoVariable::ENTERO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = TipoVariable::LOGICO
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = TipoVariable::REAL
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = TipoVariable::CADENA
				}
				else {
					tipo = TipoVariable::CARACTER
				}
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.global.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionPropia() => [
				tipo = nombreTipo
				variable.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
}