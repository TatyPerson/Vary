
package vary.pseudocodigo.dsl.c

import diagramapseudocodigo.Constante
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.DiagramapseudocodigoFactory
import diagramapseudocodigo.Implementacion
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.Declaracion
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface
import diagramapseudocodigo.Subproceso

class VaryGrammarModelUtil {
	def static addConstante(Algoritmo algoritmo, Constante constante, String nameOfEntityToAdd) {
		val model = algoritmo
			DiagramapseudocodigoFactory::eINSTANCE.createConstante() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			valor = DiagramapseudocodigoFactory::eINSTANCE.createEntero() => [
				valor = 10
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
	}
	
	def static addConstante(Implementacion implementacion, Constante constante, String nameOfEntityToAdd) {
		val model = implementacion
			DiagramapseudocodigoFactory::eINSTANCE.createConstante() => [
			variable = DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nameOfEntityToAdd
			]
			valor = DiagramapseudocodigoFactory::eINSTANCE.createEntero() => [
				valor = 10
			]
			model.constantes.add(model.constantes.indexOf(constante)+1, it)
			]
	}
	
	def static addVariable(Inicio inicio, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = inicio
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			System.out.println("Es tipo nativo")
			model.declaraciones.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionBasica() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_ENTERO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_LOGICO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_REAL")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CADENA")
				}
				else {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CARACTER")
				}
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.declaraciones.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionDefinida() => [
				tipo = nombreTipo
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
	
	def static addVariable(Subproceso subproceso, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = subproceso
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			model.declaraciones.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionBasica() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_ENTERO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_LOGICO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_REAL")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CADENA")
				}
				else {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CARACTER")
				}
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.declaraciones.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionDefinida() => [
				tipo = nombreTipo
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
	
	def static addVariable(Implementacion implementacion, String nombreVariable, Declaracion declaracion, String nombreTipo, ReadKeywordsInterface readerKeywords) {
		val model = implementacion
		if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA")) || nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CARACTER"))) {
			model.globales.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionBasica() => [
				if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_ENTERO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_ENTERO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_LOGICO"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_LOGICO")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_REAL"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_REAL")
				}
				else if(nombreTipo.equals(readerKeywords.getBundle.getString("KEYWORD_CADENA"))) {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CADENA")
				}
				else {
					tipo = readerKeywords.getBundle.getString("KEYWORD_CARACTER")
				}
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])	
		}
		else {
			model.globales.add(DiagramapseudocodigoFactory::eINSTANCE.createDeclaracionDefinida() => [
				tipo = nombreTipo
				variables.add(DiagramapseudocodigoFactory::eINSTANCE.createVariable() => [
				nombre = nombreVariable
				])
			])
		}
	}
}