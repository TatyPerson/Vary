package vary.pseudocodigo.dsl.c.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;

public class VaryGrammarScopeProvider extends AbstractDeclarativeScopeProvider {
	
	/*public IScope scope_Modulo_importaciones(Modulo m, EReference r) {
		List<Variable> variables= EcoreUtil2.getAllContentsOfType(m, Variable.class);
		for(Variable v: variables) {
			System.out.println("Soy una variable del modulo "+m.getNombre() + " y me llamo: " +v.getNombre());
			Modulo m2 = EcoreUtil2.getContainerOfType(v, Modulo.class);
			System.out.println("El container de "+v.getNombre() + " es " +m2.getNombre());
		}
		//List<Modulo> allModules = EcoreUtil2.getAllContentsOfType(model, Modulo.class);
		//return Scopes.scopeFor(allModules);
		
		return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(m, Modulo.class));
	}
	
	/*public IScope scope_Algoritmo_importaciones(Algoritmo a, EReference r) {
		return IScope.NULLSCOPE;
	}*/
	
	/*public IScope scope_VariableID_nombre(VariableID v, EReference r) {
		//Primero cogemos el Modulo, Algoritmo o Subproceso al que pertenece
		
		Modulo m = EcoreUtil2.getContainerOfType(v, Modulo.class);
		Algoritmo a = EcoreUtil2.getContainerOfType(v, Algoritmo.class);
		Procedimiento p = EcoreUtil2.getContainerOfType(v, Procedimiento.class);
		Funcion f = EcoreUtil2.getContainerOfType(v, Funcion.class);
		
		if(f == null && p == null) {
			if(m != null) {
				System.out.println("Soy del modulo "+m.getNombre());
				List<Variable> variablesDeclaradas = new ArrayList<Variable>();
				variablesDeclaradas = getAllVariables(m.getImplementacion().getGlobal());
				for(Modulo modulo: m.getImportaciones()) {
					variablesDeclaradas = getAllVariables(modulo.getImplementacion().getGlobal());
				}
				return Scopes.scopeFor(variablesDeclaradas);
			}
			else if(a != null) {
				System.out.println("Soy del algoritmo "+a.getNombre());
				List<Variable> variablesDeclaradas = new ArrayList<Variable>();
				variablesDeclaradas = getAllVariables(a.getGlobal());
				variablesDeclaradas.addAll(getAllVariables(a.getTiene().getDeclaracion()));
				for(Modulo modulo: a.getImportaciones()) {
					variablesDeclaradas = getAllVariables(modulo.getImplementacion().getGlobal());
				}
				return Scopes.scopeFor(variablesDeclaradas);
			}
		}
		else {
			if(f != null) {
				System.out.println("Soy de la funcion "+f.getNombre());
				List<Variable> variablesDeclaradas = new ArrayList<Variable>();
				variablesDeclaradas = getAllVariables(f.getDeclaracion());
				Algoritmo algoritmo = EcoreUtil2.getContainerOfType(f, Algoritmo.class);
				if(algoritmo != null) {
					variablesDeclaradas.addAll(getAllVariables(algoritmo.getGlobal()));
					for(Modulo modulo: a.getImportaciones()) {
						variablesDeclaradas = getAllVariables(modulo.getImplementacion().getGlobal());
					}
				}
				return Scopes.scopeFor(variablesDeclaradas);
			}
			else {
				System.out.println("Soy del procedimiento "+p.getNombre());
				List<Variable> variablesDeclaradas = new ArrayList<Variable>();
				variablesDeclaradas = getAllVariables(p.getDeclaracion());
				Algoritmo algoritmo = EcoreUtil2.getContainerOfType(p, Algoritmo.class);
				if(algoritmo != null) {
					variablesDeclaradas.addAll(getAllVariables(algoritmo.getGlobal()));
					for(Modulo modulo: a.getImportaciones()) {
						variablesDeclaradas = getAllVariables(modulo.getImplementacion().getGlobal());
					}
				}
				return Scopes.scopeFor(variablesDeclaradas);
			}
		}
		
		return IScope.NULLSCOPE;
		
	}
	
	private List<Variable> getAllVariables(List<Declaracion> declaraciones) {
		List<Variable> variablesDeclaradas = new ArrayList<Variable>();
		
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionVariable) {
				DeclaracionVariable declaracionVar = (DeclaracionVariable) declaracion;
				for(Variable var: declaracionVar.getVariable()) {
					variablesDeclaradas.add(var);
				}
			} else {
				DeclaracionPropia declaracionProp = (DeclaracionPropia) declaracion;
				for(Variable var: declaracionProp.getVariable()) {
					variablesDeclaradas.add(var);
				}
			}
		}
		
		return variablesDeclaradas;
	}*/
	
}
