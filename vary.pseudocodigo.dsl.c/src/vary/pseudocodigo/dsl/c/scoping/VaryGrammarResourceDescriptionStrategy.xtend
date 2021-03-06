package vary.pseudocodigo.dsl.c.scoping

import com.google.inject.Singleton
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import diagramapseudocodigo.Modulo
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.Constante
import diagramapseudocodigo.Declaracion
import diagramapseudocodigo.DeclaracionBasica
import diagramapseudocodigo.Variable
import diagramapseudocodigo.DeclaracionDefinida

@Singleton
class VaryGrammarResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
	
	@Inject extension IQualifiedNameProvider
	
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Modulo) {
			var modulo = eObject as Modulo
			//var modulo2 = modulo.eContainer as Modulo
			val fullyQualifiedName = QualifiedName.create(modulo.getNombre)
			System.out.println("fullyQualifiedName Modulo "+fullyQualifiedName)
			if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, modulo
						)
					)
			/*for(CabeceraSubproceso cabecera: modulo.exporta_funciones) {
				if(cabecera instanceof CabeceraProcedimiento) {
					var cabeceraProc = cabecera as CabeceraProcedimiento
					var cabeceraTexto = cabeceraProc.nombre + "("
					for(ParametroFuncion parametro: cabeceraProc.parametrofuncion) {
						cabeceraTexto = cabeceraTexto + parametro.paso.name + parametro.variable.nombre
						if(cabeceraProc.parametrofuncion.indexOf(parametro) != cabeceraProc.parametrofuncion.size()-1) {
							cabeceraTexto = cabeceraTexto + " , ";
						}
					}
					cabeceraTexto = cabeceraTexto + ")"
					val fullyQualifiedNameProc = QualifiedName.create(cabeceraTexto)
					System.out.println("fullyQualifiedName Proc "+fullyQualifiedNameProc)
					if (fullyQualifiedNameProc != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedNameProc, cabecera
						)
					)
				}
			}*/
		true
		}
		else if(eObject instanceof Algoritmo) {
			var algoritmo = eObject as Algoritmo
			//var modulo2 = modulo.eContainer as Modulo
			val fullyQualifiedName = QualifiedName.create(algoritmo.getNombre)
			System.out.println("fullyQualifiedName Algoritmo "+fullyQualifiedName)
			if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, algoritmo
						)
					)
			for(Declaracion declaracion: algoritmo.inicio.declaraciones) {
				if(declaracion instanceof DeclaracionBasica) {
					var dec = declaracion as DeclaracionBasica
					for(Variable variable: dec.variables) {
						val fullyQualifiedNameVar = QualifiedName.create(variable.nombre)
						System.out.println("Variable de Algoritmo - DeclaracionVariable "+fullyQualifiedNameVar)
						if (fullyQualifiedNameVar != null)
							acceptor.accept(
							EObjectDescription::create(
							fullyQualifiedNameVar, variable
								)
							)
						}
				}else if(declaracion instanceof DeclaracionDefinida) {
					var dec = declaracion as DeclaracionDefinida
					for(Variable variable: dec.variables) {
						val fullyQualifiedNameVar = QualifiedName.create(variable.nombre)
						System.out.println("Variable de Algoritmo - DeclaracionPropia "+fullyQualifiedNameVar)
						if (fullyQualifiedNameVar != null)
							acceptor.accept(
							EObjectDescription::create(
							fullyQualifiedNameVar, variable
								)
							)
						}
				}
			} 
			/*for(Modulo modulo: algoritmo.importaciones) {
				for(Declaracion dec: modulo.exporta_globales) {
					if(dec instanceof DeclaracionVariable) {
						var decVariable = dec as DeclaracionVariable
						for(Variable variable: decVariable.variable) {
							val fullyQualifiedNameVar = QualifiedName.create(variable.nombre)
							System.out.println("fullyQualifiedName Variable "+fullyQualifiedNameVar)
							if (fullyQualifiedNameVar != null)
								acceptor.accept(
									EObjectDescription::create(
									fullyQualifiedNameVar, variable
								)
							)
						}
					}
				}
			}*/
		true
		}else if(eObject instanceof DeclaracionBasica) {
			var dec = eObject as DeclaracionBasica
			for(Variable variable: dec.variables) {
				val fullyQualifiedNameVar = QualifiedName.create(variable.nombre)
					System.out.println("Variable de DeclaracionVariable "+fullyQualifiedNameVar)
						if (fullyQualifiedNameVar != null)
							acceptor.accept(
							EObjectDescription::create(
							fullyQualifiedNameVar, variable
								)
							)
			}
			true
		}else if(eObject instanceof DeclaracionDefinida) {
			var dec = eObject as DeclaracionDefinida
			for(Variable variable: dec.variables) {
				val fullyQualifiedNameVar = QualifiedName.create(variable.nombre)
					System.out.println("Variable de DeclaracionPropia "+fullyQualifiedNameVar)
						if (fullyQualifiedNameVar != null)
							acceptor.accept(
							EObjectDescription::create(
							fullyQualifiedNameVar, variable
								)
							)
			}
			true
		}else if(eObject instanceof Constante) {
			var constante = eObject as Constante
			val fullyQualifiedName = QualifiedName.create(constante.variable.nombre)
			System.out.println("fullyQualifiedName Constante "+fullyQualifiedName)
			if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, constante
						)
					)
			true
		} else
			false
	}
}