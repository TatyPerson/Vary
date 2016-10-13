/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.c.ui.outline

import diagramapseudocodigo.DeclaracionBasica
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.Procedimiento
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Vector
import diagramapseudocodigo.Matriz
import diagramapseudocodigo.Registro
import diagramapseudocodigo.Subrango
import diagramapseudocodigo.SubrangoEnumerado
import diagramapseudocodigo.VariableID
import diagramapseudocodigo.Constante
import diagramapseudocodigo.Modulo
import diagramapseudocodigo.Implementacion
import diagramapseudocodigo.Archivo

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class VaryGrammarOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider {
	
	//def protected _createChildren(IOutlineNode parentNode, DeclaracionVariable modelElement) {}
	
	def protected _createChildren(IOutlineNode parentNode, Inicio modelElement) {
		for(declaracion: modelElement.declaraciones) {
			super._createChildren(parentNode, declaracion)
		}
	}
	
	def protected _createChildren(IOutlineNode parentNode, Procedimiento modelElement) {
		for(declaracion: modelElement.declaraciones) {
			super._createChildren(parentNode, declaracion)
		}
	}
	
	def protected _createChildren(IOutlineNode parentNode, Funcion modelElement) {
		for(declaracion: modelElement.declaraciones) {
			super._createChildren(parentNode, declaracion)
		}
	}
	
	def protected _createChildren(IOutlineNode parentNode, Vector modelElement) {}
	
	def protected _createChildren(IOutlineNode parentNode, Matriz modelElement) {}
	
	def protected _createChildren(IOutlineNode parentNode, Registro modelElement) {
		for(declaracion: modelElement.campos) {
			super._createChildren(parentNode, declaracion)
		}
	}
	
	def protected _createChildren(IOutlineNode parentNode, Constante modelElement) {}
	
	def protected _createChildren(IOutlineNode parentNode, Archivo modelElement) {}
	
	def protected _createChildren(IOutlineNode parentNode, Algoritmo modelElement) {
		for(modulo: modelElement.importaciones) {
			super._createNode(parentNode, modulo)
		}
		for(constante: modelElement.constantes) {
			super._createNode(parentNode, constante)
		}
		for(tipoComplejo: modelElement.complejos) {
			super._createNode(parentNode, tipoComplejo)
		}
		for(declaracion: modelElement.globales) {
			super._createChildren(parentNode, declaracion)
		}
		for(subproceso: modelElement.subprocesos) {
			super._createNode(parentNode, subproceso)
		}
		if(modelElement.inicio != null) {
			super._createNode(parentNode, modelElement.inicio)
		}
	}
	
	def protected _createChildren(IOutlineNode parentNode, Modulo modelElement) {
		for(modulo: modelElement.importaciones) {
			super._createNode(parentNode, modulo)
		}
		for(constante: modelElement.implementacion.constantes) {
			super._createNode(parentNode, constante)
		}
		for(tipoComplejo: modelElement.implementacion.complejos) {
			super._createNode(parentNode, tipoComplejo)
		}
		for(declaracion: modelElement.implementacion.globales) {
			super._createChildren(parentNode, declaracion)
		}
		for(subproceso: modelElement.implementacion.subprocesos) {
			super._createNode(parentNode, subproceso)
		}
	}
	
}
