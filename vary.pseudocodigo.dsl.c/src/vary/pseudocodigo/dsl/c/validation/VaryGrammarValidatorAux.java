package vary.pseudocodigo.dsl.c.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.CabeceraFuncion;
import diagramapseudocodigo.CabeceraSubproceso;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.CadenaCaracteres;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionDefinida;
import diagramapseudocodigo.DeclaracionBasica;
import diagramapseudocodigo.DivisionReal;
import diagramapseudocodigo.DivisionEntera;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.FuncionInterna;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Mod;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Real;
import diagramapseudocodigo.Entero;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.OperacionCompleta;
import diagramapseudocodigo.OperacionParentesis;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.Parametro;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoFuncion;
import diagramapseudocodigo.TipoProcedimiento;
import diagramapseudocodigo.Logico;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.Valor;

public class VaryGrammarValidatorAux extends AbstractVaryGrammarValidator {
	
	/* 1) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar todas las variables declaradas en un algoritmo o modulo.
	 * @param locales, parametros, globales, complejos, modulosImportados, readerMessages
	 */
	protected Map<String, String> getVariablesDefinidasTipadas(List<Declaracion> locales, List<Parametro> parametros, List<Declaracion> globales, List<Modulo> modulosImportados) {
		Map<String, String> variablesDefinidasTipadas = new HashMap<String,String>();
		variablesDefinidasTipadas.putAll(getVariablesExportadasTipadas(modulosImportados));
		if(parametros != null) {
			variablesDefinidasTipadas = getParametrosTipadosAux(parametros, variablesDefinidasTipadas);
		}
		variablesDefinidasTipadas = getVariablesDefinidasTipadasAux(locales, variablesDefinidasTipadas);
		variablesDefinidasTipadas = getVariablesDefinidasTipadasAux(globales, variablesDefinidasTipadas);
		return variablesDefinidasTipadas;
	}
	
	/*
	 * Función auxiliar de getVariablesDefinidasTipadas // Principio DRY. (1)
	 * Función encargada de registrar las variables exportadas por todos los módulos importados.
	 */
	private Map<String, String> getVariablesExportadasTipadas(List<Modulo> modulosImportados) {
		 Map<String, String> variablesExportadasTipadas = new HashMap<String, String>();
		 for(Modulo modulo: modulosImportados) {
			 for(Declaracion declaracion: modulo.getExporta_globales()) {
				 if(declaracion instanceof DeclaracionBasica) {
						DeclaracionBasica declaracionBasica = (DeclaracionBasica) declaracion;
						for(Variable variable: declaracionBasica.getVariables()) {
							if(!variablesExportadasTipadas.containsKey(variable.getNombre())) {
								variablesExportadasTipadas.put(variable.getNombre(), declaracionBasica.getTipo());
							}
						}
				} else if(declaracion instanceof DeclaracionDefinida) {
					DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida) declaracion;
					for(Variable variable: declaracionDefinida.getVariables()) {
						if(!variablesExportadasTipadas.containsKey(variable.getNombre())) {
							variablesExportadasTipadas.put(variable.getNombre(), declaracionDefinida.getTipo());
						}
					}
				}
			 }
		 }
		 return variablesExportadasTipadas;
	 }
	
	/*
	 * Función auxiliar de getVariablesDefinidasTipadas // Principio DRY. (2)
	 * Función encargada de registrar los variables definidas junto a su respectivo tipo.
	 */
	private Map<String, String> getVariablesDefinidasTipadasAux(List<Declaracion> declaraciones, Map<String, String> variablesDefinidasTipadas) {
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionBasica) {
				DeclaracionBasica declaracionBasica = (DeclaracionBasica) declaracion;
				for(Variable variable: declaracionBasica.getVariables()) {
					if(!variablesDefinidasTipadas.containsKey(variable.getNombre())) {
						variablesDefinidasTipadas.put(variable.getNombre(), declaracionBasica.getTipo());
					}
				}
			} else if(declaracion instanceof DeclaracionDefinida) {
				DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida) declaracion;
				for(Variable variable: declaracionDefinida.getVariables()) {
					if(!variablesDefinidasTipadas.containsKey(variable.getNombre())) {
						variablesDefinidasTipadas.put(variable.getNombre(), declaracionDefinida.getTipo());
					}
				}
			}
		}
		return variablesDefinidasTipadas;
	}
	
	/*
	 * Función auxiliar de getVariablesDefinidasTipadas // Principio DRY. (3)
	 * Función encargada de registrar los parámetros junto a su respectivo tipo.
	 */
	private Map<String,String> getParametrosTipadosAux(List<Parametro> parametros, Map<String, String> variablesDefinidasTipadas) {
		for(Parametro parametro: parametros) {
			if(!variablesDefinidasTipadas.containsKey(parametro.getVariable().getNombre())) {
				variablesDefinidasTipadas.put(parametro.getVariable().getNombre(), parametro.getTipo().getNombre());
			}
		}
		return variablesDefinidasTipadas;
	}
	
	/* 2) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar todos los registros definidos junto a sus respectivos campos tipados.
	 * @param complejos, modulosImportados
	 */
	protected Map<String,HashMap<String, String>> getRegistrosTipados(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		Map<String,HashMap<String, String>> registrosTipados =  getRegistrosTipadosAux(modulosImportados);
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Registro) {
				Registro registro = (Registro) complejo;
				if(!registrosTipados.containsKey(registro.getNombre())) {
					registrosTipados.put(registro.getNombre(), getCamposRegistro(registro.getCampos()));
				}
			}
		}
		return registrosTipados;
	}
	
	/*
	 * Función auxiliar de getRegistrosTipados // Principio DRY. (1)
	 * Función encargada de registrar todos los registros exportados por los modulos importados.
	 */
	private Map<String,HashMap<String, String>> getRegistrosTipadosAux(List<Modulo> modulosImportados) {
		Map<String,HashMap<String, String>> registrosTipados =  new HashMap<String,HashMap<String, String>>();
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				if(complejo instanceof Registro) {
					Registro registro = (Registro) complejo;
					if(modulo.getExporta_tipos().contains(registro.getNombre())) {
						registrosTipados.put(registro.getNombre(), getCamposRegistro(registro.getCampos()));
					}
				}
			}
		}
		return registrosTipados;
	}
	
	/*
	 * Función auxiliar de getRegistrosTipados // Principio DRY. (1)
	 * Función encargada de registrar todos los campos definidos en un determinado registro.
	 */
	private HashMap<String,String> getCamposRegistro(List<Declaracion> declaraciones) {
		HashMap<String,String> campos = new HashMap<String,String>();
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionDefinida) {
				DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida) declaracion;
				for(Variable variable: declaracionDefinida.getVariables()) {
					campos.put(variable.getNombre(), declaracionDefinida.getTipo());
				}
			}
			else {
				DeclaracionBasica declaracionBasica = (DeclaracionBasica) declaracion;
				for(Variable variable: declaracionBasica.getVariables()) {
					campos.put(variable.getNombre(), declaracionBasica.getTipo());
				}
			}
		}
		return campos;
	}
	
	/* 3) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los nombres de todos los ficheros definidos.
	 * @param complejos, modulosImportados
	 */
	protected List<String> getNombresFicherosDefinidos(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		List<String> nombresFicherosDefinidos = getNombresFicherosDefinidosAux(modulosImportados);
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Archivo) {
				Archivo archivo = (Archivo) complejo;
				nombresFicherosDefinidos.add(archivo.getNombre());
			}
		}
		return nombresFicherosDefinidos;
	}
	
	/*
	 * Función auxiliar de getNombresFicherosDefinidos // Principio DRY. (1)
	 * Función encargada de registrar el nombre de todos los ficheros exportados por los modulos importados.
	 */
	private List<String> getNombresFicherosDefinidosAux(List<Modulo> modulosImportados) {
		List<String> nombresFicherosDefinidos = new ArrayList<String>();
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				if(complejo instanceof Archivo) {
					Archivo archivo = (Archivo) complejo;
					if(!nombresFicherosDefinidos.contains(archivo.getNombre())) {
						nombresFicherosDefinidos.add(archivo.getNombre());
					}
				}
			}
		}
		return nombresFicherosDefinidos;
	}
	
	/* 4) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los nombres de todos las constantes definidas.
	 * (sólo las constantes definidas en el fichero actual).
	 * @param constantes
	 */
	protected List<String> getNombresConstantes(List<Constante> constantes) {
		List<String> nombresConstantes = new ArrayList<String>();
		for(Constante constante: constantes) {
			nombresConstantes.add(constante.getVariable().getNombre());
		}
		return nombresConstantes;
	}
	
	/* 5) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar las constantes definidas con su respectivo tipo 
	 * (la gramática no admite operaciones para las constantes).
	 * @param constantes, readerMessages
	 */		
	protected Map<String,String> getConstantesTipadas(List<Constante> constantes, List<Modulo> modulosImportados, ReadMessagesValidatorInterface readerMessages) {
		Map<String,String> constantesTipadas = new HashMap<String,String>();
		constantesTipadas.putAll(getConstantesTipadasAux(modulosImportados, readerMessages));
		for(Constante constante: constantes) {
			if(!constantesTipadas.containsKey(constante.getVariable().getNombre())) {
				if(constante.getValor() instanceof Entero) {
					constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_ENTERO"));
				} else if(constante.getValor() instanceof Real) {
					constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_REAL"));
				} else if(constante.getValor() instanceof CadenaCaracteres) {
					constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_CADENA"));
				} else if(constante.getValor() instanceof Caracter) {
					constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_CARACTER"));
				} else if(constante.getValor() instanceof Logico) {
					constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_LOGICO"));
				}
			}
		}
		return constantesTipadas;
	}
	
	/*
	 * Función auxiliar de getConstantesTipadas // Principio DRY. (1)
	 * Función encargada de registrar el nombre de todas las constantes exportadas por los modulos importados.
	 */
	private Map<String,String> getConstantesTipadasAux(List<Modulo> modulosImportados, ReadMessagesValidatorInterface readerMessages) {
		Map<String,String> constantesTipadas = new HashMap<String,String>();
		for(Modulo modulo: modulosImportados) {
			for(Constante constante: modulo.getImplementacion().getConstantes()) {
				if(modulo.getExporta_constantes().contains(constante.getVariable().getNombre())) {
					if(constante.getValor() instanceof Entero) {
						constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_ENTERO"));
					} else if(constante.getValor() instanceof Real) {
						constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_REAL"));
					} else if(constante.getValor() instanceof CadenaCaracteres) {
						constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_CADENA"));
					} else if(constante.getValor() instanceof Caracter) {
						constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_CARACTER"));
					} else if(constante.getValor() instanceof Logico) {
						constantesTipadas.put(constante.getVariable().getNombre(), readerMessages.getBundle().getString("TIPO_LOGICO"));
					}
				}
			}
		}
		return constantesTipadas;
	}
	
	/* 6) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los parametros definidos con su respectivo tipo
	 * @param parametros
	 */	
	protected Map<String,String> getParametrosTipados(List<Parametro> parametros) {
		Map<String,String> parametrosTipados = new HashMap<String,String>();
		for(Parametro parametro: parametros) {
			parametrosTipados.put(parametro.getVariable().getNombre(), parametro.getTipo().getNombre());
		}
		return parametrosTipados;
	}
	
	/* 7) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar el nombre de los tipos complejos definidos.
	 * @param complejos
	 */	
	protected List<String> getNombresTiposComplejos(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		List<String> nombresTiposComplejos = new ArrayList<String>();
		if(modulosImportados != null) {
			nombresTiposComplejos.addAll(getNombresTiposComplejosAux(modulosImportados));
		}
		for(TipoComplejo complejo: complejos) {
			if(!nombresTiposComplejos.contains(complejo.getNombre())) {
				nombresTiposComplejos.add(complejo.getNombre());
			}
		}
		return nombresTiposComplejos;
	}
	
	/*
	 * Función auxiliar de getNombresTiposComplejos // Principio DRY. (1)
	 * Función encargada de registrar el nombre de todas los tipos complejos exportados por los modulos importados.
	 */
	private List<String> getNombresTiposComplejosAux(List<Modulo> modulosImportados) {
		List<String> nombresTiposComplejos = new ArrayList<String>();
		for(Modulo modulo: modulosImportados) {
			for(String nombreComplejoExportado: modulo.getExporta_tipos()) {
				if(!nombresTiposComplejos.contains(nombreComplejoExportado)) {
					nombresTiposComplejos.add(nombreComplejoExportado);
				}
			}
		}
		return nombresTiposComplejos;
	}
	
	/* 8) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los nombres de las variables recogidas en las declaraciones 
	 * @param declaraciones
	 */
	protected List<String> getNombresVariables(List<Declaracion> declaraciones) {
		List<String> nombresLocales = new ArrayList<String>();
		for(Declaracion declaracion: declaraciones) {
			if(declaracion instanceof DeclaracionBasica) {
				DeclaracionBasica declaracionBasica = (DeclaracionBasica) declaracion;
				for(Variable v: declaracionBasica.getVariables()) {
					nombresLocales.add(v.getNombre());
				}
			} else {
				DeclaracionDefinida declaracionDefinida = (DeclaracionDefinida) declaracion;
				for(Variable v: declaracionDefinida.getVariables()) {
					nombresLocales.add(v.getNombre());
				}
			}
		}
		return nombresLocales;
	}
	
	/* 9) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los vectores definidos
	 * @param complejos, modulosImportados
	 */
	protected Map<String, String> getVectoresTipados(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		Map<String, String> vectoresTipados = getVectoresTipadosAux(modulosImportados);
		
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Vector) {
				if(!vectoresTipados.containsKey(complejo.getNombre())) {
					Vector vector = (Vector) complejo;
					vectoresTipados.put(complejo.getNombre(), vector.getTipo().getNombre());
				}
			} 
		}
		return vectoresTipados;
	}
	
	/*
	 * Función auxiliar de getVectoresTipados // Principio DRY. (1)
	 * Función encargada de registrar todos los vectores exportados por los modulos importados.
	 */
	private Map<String, String> getVectoresTipadosAux(List<Modulo> modulosImportados) {
		Map<String, String> vectoresTipados = new HashMap<String,String>();
		
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				if(complejo instanceof Vector && modulo.getExporta_tipos().contains(complejo.getNombre())) {
					if(!vectoresTipados.containsKey(complejo.getNombre())) {
						Vector vector = (Vector) complejo;
						vectoresTipados.put(complejo.getNombre(), vector.getTipo().getNombre());
					}
				} 
			}
		}
		
		return vectoresTipados;
	}
	
	/* 10) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar las matrices definidos
	 * @param complejos, modulosImportados
	 */
	protected Map<String, String> getMatricesTipadas(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		Map<String, String> matricesTipadas = getMatricesTipadasAux(modulosImportados);
		
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Matriz) {
				if(!matricesTipadas.containsKey(complejo.getNombre())) {
					Matriz matriz = (Matriz) complejo;
					matricesTipadas.put(complejo.getNombre(), matriz.getTipo().getNombre());
				}
			}
		}
		return matricesTipadas;
	}
	
	/*
	 * Función auxiliar de getMatricesTipadas // Principio DRY. (1)
	 * Función encargada de registrar todas las matrices exportadas por los modulos importados.
	 */
	private Map<String, String> getMatricesTipadasAux(List<Modulo> modulosImportados) {
		Map<String, String> matricesTipadas = new HashMap<String, String>();
		
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				if(complejo instanceof Matriz && modulo.getExporta_tipos().contains(complejo.getNombre())) {
					if(!matricesTipadas.containsKey(complejo.getNombre())) {
						Matriz matriz = (Matriz) complejo;
						matricesTipadas.put(complejo.getNombre(), matriz.getTipo().getNombre());
					}
				} 
			}
		}
		
		return matricesTipadas;
	}
	
	
	/* 11) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar las funciones definidas
	 * @param subprocesos
	 */
	protected Map<String,HashMap<Integer,String>> getFuncionesTipadas(List<Subproceso> subprocesos, List<Modulo> modulosImportados) {
		Map<String,HashMap<Integer,String>> funcionesTipadas = getFuncionesTipadasAux(modulosImportados);
		
		for(Subproceso subproceso: subprocesos) {
			if(subproceso instanceof Funcion) {
				Funcion funcion = (Funcion) subproceso;
				HashMap<Integer,String> aux = new HashMap<Integer,String>();
				aux.put(funcion.getParametros().size(), funcion.getTipo());
				funcionesTipadas.put(funcion.getNombre(), aux);
			}
		}
		return funcionesTipadas;
	}
	
	/*
	 * Función auxiliar de getFuncionesTipadas // Principio DRY. (1)
	 * Función encargada de registrar todas las funciones exportadas por los modulos importados.
	 */
	private Map<String,HashMap<Integer,String>> getFuncionesTipadasAux(List<Modulo> modulosImportados) {
		Map<String,HashMap<Integer,String>> funcionesTipadas = new HashMap<String,HashMap<Integer,String>>();
		
		for(Modulo modulo: modulosImportados) {
			for(CabeceraSubproceso cabeceraSubproceso: modulo.getExporta_subprocesos()) {
				if(cabeceraSubproceso instanceof CabeceraFuncion) {
					CabeceraFuncion cabeceraFuncion = (CabeceraFuncion) cabeceraSubproceso;
					HashMap<Integer,String> aux = new HashMap<Integer,String>();
					aux.put(cabeceraFuncion.getParametros().size(), cabeceraFuncion.getTipo());
					funcionesTipadas.put(cabeceraFuncion.getNombre(), aux);
				}
			}
		}
		return funcionesTipadas;
	}
	
	/* 12) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los tipos de los parametros participantes en una operacion
	 * @param operaciones, nombresVariables, nombresVariablesCampos, tiposNativos, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresValoresComplejos, readerMessages
	 */
	protected void getParametrosOperacion(List<Operacion> operaciones, List<String> nombresVariables, Map<String,String> nombresVariablesCampos, List<String> tiposNativos, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, List<String> nombresValoresComplejos, ReadMessagesValidatorInterface readerMessages) {
		for(Operacion operacion: operaciones) { 
			if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				nombresVariables.add(v.getNombre());	
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				nombresVariables.add(v.getNombre_vector());
				nombresValoresComplejos.add(v.getNombre_vector());
				if(v.getCampos().size() != 0) {
					nombresVariablesCampos.put(v.getNombre_vector(), v.getCampos().get(v.getCampos().size()-1).getNombre_campo());
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				nombresVariables.add(m.getNombre_matriz());
				nombresValoresComplejos.add(m.getNombre_matriz());
				if(m.getCampos().size() != 0) {
					nombresVariablesCampos.put(m.getNombre_matriz(), m.getCampos().get(m.getCampos().size()-1).getNombre_campo());
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro r = (ValorRegistro) operacion;
				nombresVariables.add(r.getNombre_registro());
				nombresValoresComplejos.add(r.getNombre_registro());
				String campo = r.getCampos().get(r.getCampos().size()-1).getNombre_campo();
				nombresVariablesCampos.put(r.getNombre_registro(), campo);
			} else if(operacion instanceof Entero) {
				nombresVariables.add("tipoNativo");
				tiposNativos.add(readerMessages.getBundle().getString("TIPO_ENTERO"));
			} else if(operacion instanceof Real) {
				nombresVariables.add("tipoNativo");
				tiposNativos.add(readerMessages.getBundle().getString("TIPO_REAL"));
			} else if(operacion instanceof Logico) {
				nombresVariables.add("tipoNativo");
				tiposNativos.add(readerMessages.getBundle().getString("TIPO_LOGICO"));
			} else if(operacion instanceof CadenaCaracteres) {
				nombresVariables.add("tipoNativo");
				tiposNativos.add(readerMessages.getBundle().getString("TIPO_CADENA"));
			} else if(operacion instanceof Caracter) {
				nombresVariables.add("tipoNativo");
				tiposNativos.add(readerMessages.getBundle().getString("TIPO_CARACTER"));
			}
			else if(esOperacion(operacion)) {
				ArrayList<Valor> valoresAux = getValoresOperacion(operacion);
				String tipoOperacion = getValorTotalOperacion(valoresAux, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, readerMessages);
				nombresVariables.add("tipoNativo");
				tiposNativos.add(tipoOperacion);
			}
		}
	}
	
	/*
	 * Función auxiliar de getParametrosOperacion // Principio DRY. (1)
	 * Función encargada de registrar el valor total de una operacion.
	 */
	private String getValorTotalOperacion(List<Valor> valores, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, ReadMessagesValidatorInterface readerMessages) {
		List<String> tiposOperacion = new ArrayList<String>();
		for(Valor valor: valores) {
			if(valor instanceof Operador) {
				Operador operador = (Operador) valor;
				if(operador instanceof VariableID) {
					VariableID variable = (VariableID) operador;
					tiposOperacion.add(variablesDeclaradas.get(variable.getNombre()));
				} else if(operador instanceof ValorVector) {
					ValorVector valorVector = (ValorVector) operador;
					if(valorVector.getCampos().size() == 0) {
						tiposOperacion.add(tiposVectoresMatrices.get(variablesDeclaradas.get(valorVector.getNombre_vector())));
					} else {
						//Cogemos el último campo:
						tiposOperacion.add(tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(valorVector.getNombre_vector()))).get(valorVector.getCampos().get(valorVector.getCampos().size()-1)));
					}
				} else if(operador instanceof ValorMatriz) {
					ValorMatriz valorMatriz = (ValorMatriz) operador;
					if(valorMatriz.getCampos().size() == 0) {
						tiposOperacion.add(tiposVectoresMatrices.get(variablesDeclaradas.get(valorMatriz.getNombre_matriz())));
					} else {
						//Cogemos el último campo:
						tiposOperacion.add(tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(valorMatriz.getNombre_matriz()))).get(valorMatriz.getCampos().get(valorMatriz.getCampos().size()-1)));
					}
				} else if(operador instanceof ValorRegistro) {
					ValorRegistro registro = (ValorRegistro) operador;
					tiposOperacion.add(tiposRegistros.get(variablesDeclaradas.get(registro.getNombre_registro())).get(registro.getCampos().get(registro.getCampos().size()-1).getNombre_campo()));
				} else if(operador instanceof Entero) {
					tiposOperacion.add(readerMessages.getBundle().getString("TIPO_ENTERO"));
				} else if(operador instanceof Real) {
					tiposOperacion.add(readerMessages.getBundle().getString("TIPO_REAL"));
				} else if(operador instanceof Logico) {
					tiposOperacion.add(readerMessages.getBundle().getString("TIPO_LOGICO"));
				} else if(operador instanceof CadenaCaracteres) {
					tiposOperacion.add(readerMessages.getBundle().getString("TIPO_CADENA"));
				} else if(operador instanceof Caracter) {
					tiposOperacion.add(readerMessages.getBundle().getString("TIPO_CARACTER"));
				}
			}
		}
		return getPrioridadTipoOperacion(tiposOperacion, readerMessages);
	}
	
	/*
	 * Función auxiliar de getParametrosOperacion // Principio DRY. (2)
	 * Función encargada de devolver el tipo de la operacion por prioridades.
	 */
	private String getPrioridadTipoOperacion(List<String> tipos, ReadMessagesValidatorInterface readerMessages) {
		if(Collections.frequency(tipos, readerMessages.getBundle().getString("TIPO_ENTERO")) == tipos.size()) {
			return readerMessages.getBundle().getString("TIPO_ENTERO");
		} else if(Collections.frequency(tipos, readerMessages.getBundle().getString("TIPO_REAL")) == tipos.size()) {
			return readerMessages.getBundle().getString("TIPO_REAL");
		} else if(Collections.frequency(tipos, readerMessages.getBundle().getString("TIPO_LOGICO")) == tipos.size()) {
			return readerMessages.getBundle().getString("TIPO_LOGICO");
		} else if(Collections.frequency(tipos, readerMessages.getBundle().getString("TIPO_CADENA")) == tipos.size()) {
			return readerMessages.getBundle().getString("TIPO_CADENA");
		} else if(Collections.frequency(tipos, readerMessages.getBundle().getString("TIPO_CARACTER")) == tipos.size()) {
			return readerMessages.getBundle().getString("TIPO_CARACTER");
		} else {
			//En otro caso, devolvemos por prioridades
			if(tipos.contains(readerMessages.getBundle().getString("TIPO_CADENA"))) {
				return readerMessages.getBundle().getString("TIPO_CADENA");
			} else if(tipos.contains(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
				return readerMessages.getBundle().getString("TIPO_LOGICO");
			} else if(tipos.contains(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
				return readerMessages.getBundle().getString("TIPO_CARACTER");
			} else if(tipos.contains(readerMessages.getBundle().getString("TIPO_REAL"))) {
				return readerMessages.getBundle().getString("TIPO_REAL");
			} else if(tipos.contains(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
				return readerMessages.getBundle().getString("TIPO_ENTERO");
			} else {
				return tipos.get(0);
			}
		}
	}
	
	/* 13) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar todos los valores presentes en una operacion
	 * @param operacion
	 */
	protected ArrayList<Valor> getValoresOperacion(Operacion operacion) {
		ArrayList<Valor> valoresOperacion = new ArrayList<Valor>();
		if(operacion instanceof OperacionParentesis) {
			OperacionParentesis opParentesis = (OperacionParentesis) operacion;
			if(esOperacion(opParentesis.getValor_operacion())) {
				valoresOperacion.addAll(getValoresOperacion(opParentesis.getValor_operacion()));
			} else {
				valoresOperacion.add(opParentesis.getValor_operacion());
			}
		}else if(operacion instanceof OperacionCompleta) {
			OperacionCompleta opCompleta = (OperacionCompleta) operacion;
			if(esOperacion(opCompleta.getValor_operacion())) {
				valoresOperacion.addAll(getValoresOperacion(opCompleta.getValor_operacion()));
			} else {
				valoresOperacion.add(opCompleta.getValor_operacion());
			}
		} else if(operacion instanceof VariableID || operacion instanceof ValorRegistro || operacion instanceof ValorVector || operacion instanceof ValorMatriz
				|| operacion instanceof LlamadaFuncion || operacion instanceof FuncionInterna) {
			valoresOperacion.add(operacion);
		} else {
			if(esOperacion(operacion.getLeft()) && esOperacion(operacion.getRight())) {
				valoresOperacion.addAll(getValoresOperacion(operacion.getLeft()));
				valoresOperacion.addAll(getValoresOperacion(operacion.getRight()));
			} else if(!esOperacion(operacion.getLeft()) && esOperacion(operacion.getRight())) {
				valoresOperacion.addAll(getValoresOperacion(operacion.getRight()));
				valoresOperacion.add(operacion.getLeft());
			} else if(esOperacion(operacion.getLeft()) && !esOperacion(operacion.getRight())) {
				valoresOperacion.addAll(getValoresOperacion(operacion.getLeft()));
				valoresOperacion.add(operacion.getRight());
			} else {
				valoresOperacion.add(operacion.getLeft());
				valoresOperacion.add(operacion.getRight());
			}
		}
		return valoresOperacion;
	}
	
	/*
	 * Función auxiliar de getValoresOperacion // Principio DRY. (1)
	 * Función encargada de comprobar si es una operacion real
	 */
	protected boolean esOperacion(Operacion operacion) {
		return (operacion instanceof OperacionCompleta || operacion instanceof Suma || operacion instanceof Resta || operacion instanceof Multiplicacion || operacion instanceof DivisionEntera || 
				operacion instanceof Or || operacion instanceof And || operacion instanceof Comparacion || operacion instanceof Igualdad || operacion instanceof Mod || operacion instanceof DivisionReal || 
				operacion instanceof OperacionParentesis);
	}
	
	/*
	 * Función auxiliar de getValoresOperacion // Principio DRY. (2)
	 * Función encargada de comprobar si es una operacion real
	 */
	protected boolean esOperacion(Valor valor) {
		return (valor instanceof OperacionCompleta || valor instanceof Suma || valor instanceof Resta || valor instanceof Multiplicacion || valor instanceof DivisionEntera || valor instanceof DivisionReal 
				|| valor instanceof Or || valor instanceof And || valor instanceof Comparacion || valor instanceof Igualdad || valor instanceof Mod || valor instanceof OperacionParentesis);
	}
	
	
	/* 14) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de obtener la salida correcta (llamadas a funciones)
	 * @param tipos
	 */
	protected String getSalidaTiposCorrectos(List<String> tipos) {
		String salidaCorrecta = "";
		for(int i=0; i < tipos.size()-1; i++) {
			salidaCorrecta += tipos.get(i) + ", ";
		}
		salidaCorrecta += tipos.get(tipos.size()-1);
		return salidaCorrecta;
	}
	
	/* 15) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de obtener la salida real (llamadas a funciones)
	 * @param nombresVariables, variablesDeclaradas, tiposVectoresMatrices, tiposRegistros, nombresVariablesCampos, tiposNativos, nombresValoresComplejos
	 */
	protected String getSalidaTiposReales(List<String> nombresVariables, Map<String,String> variablesDeclaradas, Map<String,String> tiposVectoresMatrices, Map<String,HashMap<String,String>> tiposRegistros, Map<String,String> nombresVariablesCampos, List<String> tiposNativos, List<String> nombresValoresComplejos) {
		String salidaReal = "";
		int tiposNativosUsados = 0;
		for(int i=0; i < nombresVariables.size()-1; i++) {
			if(nombresVariables.get(i) == "tipoNativo") {
				salidaReal += tiposNativos.get(tiposNativosUsados) + ", ";
				tiposNativosUsados++;
			} else if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariables.get(i))) && nombresValoresComplejos.contains(nombresVariables.get(i))) {
				//Si lo que contiene es un vector o una matriz
				if(!nombresVariablesCampos.containsKey(nombresVariables.get(i))) {
					salidaReal += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariables.get(i))) + ", ";
				}
				else {
					//Cogemos el último campo:
					salidaReal += tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(i))).get(nombresVariablesCampos.get(nombresVariables.get(i))) + ", ";
				}
			} else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariables.get(i))) && nombresVariablesCampos.get(nombresVariables.get(i)) != null && nombresValoresComplejos.contains(nombresVariables.get(i))) {
				//Si lo que contiene es un registro y si además tiene un campo es que es del tipo nombreRegistro.campo, por lo tanto debemos averiguar de que tipo es ese campo.
				salidaReal += tiposRegistros.get(variablesDeclaradas.get(nombresVariables.get(i))).get(nombresVariablesCampos.get(nombresVariables.get(i))) + ", ";

			} else {
				salidaReal += variablesDeclaradas.get(nombresVariables.get(i)) + ", ";
			}
		}
		
		if(nombresVariables.get(nombresVariables.size()-1) == "tipoNativo") {
			salidaReal += tiposNativos.get(tiposNativosUsados);
		} else if(tiposVectoresMatrices.containsKey(variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1))) && nombresValoresComplejos.contains(nombresVariables.get(nombresVariables.size()-1))) {
			if(!nombresVariablesCampos.containsKey(nombresVariables.get(nombresVariables.size()-1))) {
				salidaReal += tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1)));
			} else {
				salidaReal += tiposRegistros.get(tiposVectoresMatrices.get(variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1)))).get(nombresVariablesCampos.get(nombresVariables.get(nombresVariables.size()-1)));
			}
		} else if(tiposRegistros.containsKey(variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1))) && nombresVariablesCampos.get(nombresVariables.get(nombresVariables.size()-1)) != null && nombresValoresComplejos.contains(nombresVariables.get(nombresVariables.size()-1))) {
			salidaReal += tiposRegistros.get(variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1))).get(nombresVariablesCampos.get(nombresVariables.get(nombresVariables.size()-1)));

		} else {
			salidaReal += variablesDeclaradas.get(nombresVariables.get(nombresVariables.size()-1));
		}
		
		return salidaReal;
	}
	
	/* 16) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los tipos pertenecientes a una cabecera de un subproceso
	 * @param parametros
	 */
	protected List<String> getTiposCabeceraSubproceso(List<Parametro> parametros) {
		List<String> tiposCabecera = new ArrayList<String>();
		for(Parametro parametro: parametros) {
			tiposCabecera.add(parametro.getTipo().getNombre());
		}
		return tiposCabecera;
	}
	
	/* 17) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los subprocesos definidos junto a su correspondiente numero de parametros
	 * @param subprocesos, modulosImportados
	 */
	protected Map<String, ArrayList<Integer>> getSubprocesosNumeroParametros(List<Subproceso> subprocesos, List<Modulo> modulosImportados) {
		Map<String, ArrayList<Integer>> funcionesNumeroParametros = getSubprocesosNumeroParametrosAux(modulosImportados);
		for(Subproceso subproceso: subprocesos) {
			if(!funcionesNumeroParametros.containsKey(subproceso.getNombre())) {
				funcionesNumeroParametros.put(subproceso.getNombre(), new ArrayList<Integer>());
				funcionesNumeroParametros.get(subproceso.getNombre()).add(subproceso.getParametros().size());
			} else {
				funcionesNumeroParametros.get(subproceso.getNombre()).add(subproceso.getParametros().size());
			}
		}
		return funcionesNumeroParametros;
	}
	
	/*
	 * Función auxiliar de getSubprocesosNumeroParametros // Principio DRY. (1)
	 * Función encargada de registrar todos los subprocesos exportados por los modulos importados.
	 */
	private Map<String, ArrayList<Integer>> getSubprocesosNumeroParametrosAux(List<Modulo> modulosImportados) {
		Map<String, ArrayList<Integer>> funcionesNumeroParametros = new HashMap<String, ArrayList<Integer>>();
		
		for(Modulo modulo: modulosImportados) {
			for(CabeceraSubproceso cabeceraSubproceso: modulo.getExporta_subprocesos()) {
				if(!funcionesNumeroParametros.containsKey(cabeceraSubproceso.getNombre())) {
					funcionesNumeroParametros.put(cabeceraSubproceso.getNombre(), new ArrayList<Integer>());
					funcionesNumeroParametros.get(cabeceraSubproceso.getNombre()).add(cabeceraSubproceso.getParametros().size());
				} else {
					funcionesNumeroParametros.get(cabeceraSubproceso.getNombre()).add(cabeceraSubproceso.getParametros().size());
				}
			}
		}
		return funcionesNumeroParametros;
	}
	
	/* 18) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los subprocesos exportados por los modulos importados
	 * @param modulosImportados
	 */
	protected List<Subproceso> getSubprocesosExportados(List<Modulo> modulosImportados) {
		List<Subproceso> subprocesosExportados = new ArrayList<Subproceso>();
		for(Modulo modulo: modulosImportados) {
			for(CabeceraSubproceso cabecera: modulo.getExporta_subprocesos()) {
				for(Subproceso subproceso: modulo.getImplementacion().getSubprocesos()) {
					if(cabecera.getNombre().equals(subproceso.getNombre()) && cabecera.getParametros().size() == subproceso.getParametros().size()) {
						subprocesosExportados.add(subproceso);
					}
				}
			}
		}
		return subprocesosExportados;
	}
	
	/* 19) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar si hay almenos una operacion logica en las condiciones de los bloques
	 * @param operacion
	 */
	protected boolean checkOperacionLogica(Operacion operacion) {
		if(operacion instanceof  Suma) {
			Suma suma = (Suma) operacion;
			return checkOperacionLogica(suma.getLeft()) || checkOperacionLogica(suma.getRight());
		}
		else if(operacion instanceof Resta) {
			Resta resta = (Resta) operacion;
			return checkOperacionLogica(resta.getLeft()) || checkOperacionLogica(resta.getRight());
		}
		else if(operacion instanceof Multiplicacion) {
			Multiplicacion multiplicacion = (Multiplicacion) operacion;
			return checkOperacionLogica(multiplicacion.getLeft()) || checkOperacionLogica(multiplicacion.getRight());
		}
		else if(operacion instanceof DivisionEntera) {
			DivisionEntera division = (DivisionEntera) operacion;
			return checkOperacionLogica(division.getLeft()) || checkOperacionLogica(division.getRight());
		}
		else if(operacion instanceof DivisionReal) {
			DivisionReal division = (DivisionReal) operacion;
			return checkOperacionLogica(division.getLeft()) || checkOperacionLogica(division.getRight());
		}
		else if(operacion instanceof Or || operacion instanceof And || operacion instanceof Comparacion || operacion instanceof Igualdad) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/* 20) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de comprobar que los valores que se intentan asignar sean compatibles con la variable donde se quiere almacenar el valor.
	 * 3 = error, 2 = perdida de precision, 1 = nada
	 * @param tipo, variables, registros, nombresRegistros, funcionesTipadas, vectores, matrices, readerMessages
	 */
	protected int checkValoresAsignacion(String tipo, Operacion operacion, Map<String,String> variables, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, Map<String,HashMap<Integer,String>> funcionesTipadas, Map<String,String> vectores, Map<String,String> matrices, ReadMessagesValidatorInterface readerMessages) {
		final int PERDIDA_PRECISION = 2; final int ERROR = 3; final int OK = 1;
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && !(operacion instanceof Entero)) {
			if(operacion instanceof Real) {
				return PERDIDA_PRECISION;
			} else if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				//Primero buscamos las dificultades en la operación
				List<Valor> problemasOperacion = getProblemasOperacion(readerMessages.getBundle().getString("TIPO_ENTERO"), valores, readerMessages);
				//Preparamos los tipos validos
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_ENTERO")); 
				tiposValidos.add(1, readerMessages.getBundle().getString("TIPO_REAL"));
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 ||
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				} else if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 2 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 2 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 2 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 2 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 2) {
					return PERDIDA_PRECISION;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				} else if(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_REAL")) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return PERDIDA_PRECISION;
				}
			} else if(operacion instanceof FuncionInterna) {
				FuncionInterna interna = (FuncionInterna) operacion;
				if(interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO") + '(') || interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SQRT") + '(') || interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COS") + '(') 
						|| interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SEN") + '(') || interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_EXP") + '(') || interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LN") + '(') || interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LOG") + '(')) {
					return PERDIDA_PRECISION;
				} else {
					return ERROR;
				}
			} else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && variables.containsKey(v.getNombre())) {
					return ERROR;
					
				} else if(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL")) && variables.containsKey(v.getNombre())) {
					return PERDIDA_PRECISION;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				//Buscamos el registro del que proviene esa variable
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
							return ERROR;
						} else if(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							return PERDIDA_PRECISION;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
					return ERROR;
				} else if(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					return PERDIDA_PRECISION;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
					return ERROR;
				} else {
					return PERDIDA_PRECISION;
				}
			} else {
				return ERROR;
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO")) && !(operacion instanceof Logico)) {
			if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				List<Valor> problemasOperacion = getProblemasOperacion(readerMessages.getBundle().getString("TIPO_LOGICO"), valores, readerMessages);
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_LOGICO")); 
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				}
			} else if(operacion instanceof FuncionInterna) {
				return ERROR;
			} else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) && variables.containsKey(v.getNombre())) {
					return ERROR;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
							return ERROR;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
					return ERROR;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_LOGICO")))) {
					return ERROR;
				}
			} else {
				return ERROR;
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL")) && !(operacion instanceof Entero) && !(operacion instanceof Real)) {
			if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				List<Valor> problemasOperacion = getProblemasOperacion(readerMessages.getBundle().getString("TIPO_REAL"), valores, readerMessages);
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_REAL")); 
				tiposValidos.add(1, readerMessages.getBundle().getString("TIPO_ENTERO"));
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && !(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				}
			} else if(operacion instanceof FuncionInterna) {
				FuncionInterna interna = (FuncionInterna) operacion;
				if(!interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO") + '(') && !interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SQRT") + '(') && !interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COS") + '(') &&
						!interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SEN") + '(') && !interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_EXP") + '(') && !interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LN") + '(') && !interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LOG") + '(')) {
					return ERROR;
				} 
			 } else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_REAL"))) && !(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && variables.containsKey(v.getNombre())) {
					return ERROR;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
							return ERROR;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
					return ERROR;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) && !(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_REAL")))) {
					return ERROR;
				}
			} else {
				return ERROR;
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) || (tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA")) &&
				!(operacion instanceof CadenaCaracteres))) {
			if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				List<Valor> problemasOperacion = getProblemasOperacion(readerMessages.getBundle().getString("TIPO_CADENA"), valores, readerMessages);
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_CADENA")); 
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_CADENA"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				}
			} else if(operacion instanceof FuncionInterna) {
				FuncionInterna interna = (FuncionInterna) operacion;
				if(!interna.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA") + '(')) {
					return ERROR;
				} 
			 } else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_CADENA"))) && variables.containsKey(v.getNombre())) {
					return ERROR;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
							return ERROR;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
					return ERROR;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_CADENA")))) {
					return ERROR;
				}
			} else {
				return ERROR;
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) && !(operacion instanceof Caracter)) {
			if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				List<Valor> problemasOperacion = getProblemasOperacion(readerMessages.getBundle().getString("TIPO_CARACTER"), valores, readerMessages);
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, readerMessages.getBundle().getString("TIPO_CARACTER")); 
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				}
			} else if(operacion instanceof FuncionInterna) {
				return ERROR;
			} else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) && variables.containsKey(v.getNombre())) {
					return ERROR;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
							return ERROR;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
					return ERROR;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(readerMessages.getBundle().getString("TIPO_CARACTER")))) {
					return ERROR;
				}
			} else {
				return ERROR;
			}		
		} else if(!tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && !tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO")) && !tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))
				&& !tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER")) && !tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
			if(esOperacion(operacion)) {
				ArrayList<Valor> valores = getValoresOperacion(operacion);
				List<Valor> problemasOperacion = getProblemasOperacion(tipo, valores, readerMessages);
				ArrayList<String> tiposValidos = new ArrayList<String>();
				tiposValidos.add(0, tipo); 
				if(checkOperacionBasica(problemasOperacion, variables, tiposValidos, readerMessages) == 3 || 
						checkOperacionFuncion(problemasOperacion, variables, tiposValidos, funcionesTipadas, readerMessages) == 3 || 
						checkOperacionRegistro(problemasOperacion, variables, tiposValidos, registros, nombresRegistros, readerMessages) == 3 || 
						checkOperacionVector(problemasOperacion, variables, tiposValidos, vectores, readerMessages) == 3 || 
						checkOperacionMatriz(problemasOperacion, variables, tiposValidos, matrices, readerMessages) == 3) {
					return ERROR;
				}
			} else if(operacion instanceof LlamadaFuncion) {
				LlamadaFuncion f = (LlamadaFuncion) operacion;
				if(!(funcionesTipadas.get(f.getNombre()).get(f.getParametros().size()).equals(tipo)) && funcionesTipadas.containsKey(f.getNombre()) && funcionesTipadas.get(f.getNombre()).containsKey(f.getParametros().size())) {
					return ERROR;
				}
			} else if(operacion instanceof FuncionInterna) {
				return ERROR;
			} else if(operacion instanceof VariableID) {
				VariableID v = (VariableID) operacion;
				if(!(variables.get(v.getNombre()).equals(tipo)) && variables.containsKey(v.getNombre())) {
					return ERROR;
				}
			} else if(operacion instanceof ValorRegistro) {
				ValorRegistro vr = (ValorRegistro) operacion;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(vr.getNombre_registro()))) {
						if(!(registros.get(nombre).get(vr.getCampos().get(0).getNombre_campo()).equals(tipo))) {
							return ERROR;
						}
					}
				}
			} else if(operacion instanceof ValorVector) {
				ValorVector v = (ValorVector) operacion;
				if(!(vectores.get(variables.get(v.getNombre_vector())).equals(tipo))) {
					return ERROR;
				}
			} else if(operacion instanceof ValorMatriz) {
				ValorMatriz m = (ValorMatriz) operacion;
				if(!(matrices.get(variables.get(m.getNombre_matriz())).equals(tipo))) {
					return ERROR;
				}
			} else {
				return ERROR;
			}
		}
		return OK;
	}
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (1)
	 * Función encargada de notificar errores o warnings en funcion de las variables de registro utilizadas
	 */
	private int checkOperacionRegistro(List<Valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<String,String>> registros, List<String> nombresRegistros, ReadMessagesValidatorInterface readerMessages) {
		int check = 1;
		for(Valor valor: valoresProblem) {
			if(valor instanceof ValorRegistro) {
				ValorRegistro valorRegistro = (ValorRegistro) valor;
				for(String nombre: nombresRegistros) {
					if(nombre.equals(variables.get(valorRegistro.getNombre_registro()))) {
						if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
							if(!(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(0))) && !(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(1)))) {
								return 3;
							} else if(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(1))) {
								check = 2;
							}
						} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
							if(!(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(0))) && !(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(1)))) {
								return 3;
							}
						} else {
							if(!(registros.get(nombre).get(valorRegistro.getCampos().get(0).getNombre_campo()).equals(tiposValidos.get(0)))) {
								return 3;
							}
						}
					}
				}
			}
		}
		return check;
	}
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (2)
	 * Función encargada de notificar errores o warnings en funcion de las funciones utilizadas
	 */
	private int checkOperacionFuncion(List<Valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,HashMap<Integer,String>> funcionesTipadas, ReadMessagesValidatorInterface readerMessages) {
		int check = 1;
		for(Valor valor: valoresProblem) {
			if(valor instanceof LlamadaFuncion) {
				LlamadaFuncion llamadaFuncion = (LlamadaFuncion) valor;
				if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(!(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(0))) && !(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(1))) && funcionesTipadas.containsKey(llamadaFuncion.getNombre()) && funcionesTipadas.get(llamadaFuncion.getNombre()).containsKey(llamadaFuncion.getParametros().size())) {
						return 3;
					} else if(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(1)) &&  funcionesTipadas.get(llamadaFuncion.getNombre()).containsKey(llamadaFuncion.getParametros().size())) {
						check = 2;
					}
				}
				else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(!(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(0))) && !(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(1))) && funcionesTipadas.containsKey(llamadaFuncion.getNombre()) && funcionesTipadas.get(llamadaFuncion.getNombre()).containsKey(llamadaFuncion.getParametros().size())) {
						return 3;
					}
				}
				else {
					if(!(funcionesTipadas.get(llamadaFuncion.getNombre()).get(llamadaFuncion.getParametros().size()).equals(tiposValidos.get(0))) && funcionesTipadas.containsKey(llamadaFuncion.getNombre()) && funcionesTipadas.get(llamadaFuncion.getNombre()).containsKey(llamadaFuncion.getParametros().size())) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (3)
	 * Función encargada de notificar errores o warnings en funcion de los vectores utilizados
	 */
	private int checkOperacionVector(List<Valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> vectores, ReadMessagesValidatorInterface readerMessages) {
		int check = 1;
		for(Valor valor: valoresProblem) {
			if(valor instanceof ValorVector) {
				ValorVector valorVector = (ValorVector) valor;
				if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(!(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(0))) && !(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(1))) && vectores.containsKey(variables.get(valorVector.getNombre_vector()))) {
						return 3;
					} else if(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(1))) {
						check = 2;
					}
				} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(!(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(0))) && !(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(1))) && vectores.containsKey(variables.get(valorVector.getNombre_vector()))) {
						return 3;
					}
				} else {
					if(!(vectores.get(variables.get(valorVector.getNombre_vector())).equals(tiposValidos.get(0))) && vectores.containsKey(variables.get(valorVector.getNombre_vector()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (4)
	 * Función encargada de notificar errores o warnings en funcion de las matrices utilizadas
	 */
	private int checkOperacionMatriz(List<Valor> valoresProblem, Map<String,String> variables, List<String> tiposValidos, Map<String,String> matrices, ReadMessagesValidatorInterface readerMessages) {
		int check = 1;
		for(Valor valor: valoresProblem) {
			if(valor instanceof ValorMatriz) {
				ValorMatriz valorMatriz = (ValorMatriz) valor;
				if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
					if(!(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(0))) && !(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(1))) && matrices.containsKey(variables.get(valorMatriz.getNombre_matriz()))) {
						return 3;
					} else if(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(1))) {
						check = 2;
					}
				} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
					if(!(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(0))) && !(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(1))) && matrices.containsKey(variables.get(valorMatriz.getNombre_matriz()))) {
						return 3;
					}
				} else {
					if(!(matrices.get(variables.get(valorMatriz.getNombre_matriz())).equals(tiposValidos.get(0))) && matrices.containsKey(variables.get(valorMatriz.getNombre_matriz()))) {
						return 3;
					}
				}
			}
		}
		return check;
	}
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (5)
	 * Función encargada de notificar errores o warnings en funcion de las variables utilizadas
	 */
	private int checkOperacionBasica(List<Valor> problemasOperacion, Map<String,String> variables, List<String> tiposValidos, ReadMessagesValidatorInterface readerMessages) {
		int check = 1;
			for(Valor valor: problemasOperacion) {
				if(valor instanceof Real && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && esValorBasico(valor)) {
					check = 2;
				} else if(!(valor instanceof Entero) && !(valor instanceof Real) && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO")) && esValorBasico(valor)) {
					return 3;
				} else if(!(valor instanceof Logico) && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_LOGICO")) && esValorBasico(valor)) {
					return 3;
				} else if(!(valor instanceof CadenaCaracteres) && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_CADENA")) && esValorBasico(valor)) {
					return 3;
				} else if(!(valor instanceof Caracter) && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_CARACTER")) && esValorBasico(valor)) {
					return 3;
				} else if(!(valor instanceof Entero) && !(valor instanceof Real) && tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL")) && esValorBasico(valor)) {
					return 3;
				} else if(valor instanceof VariableID) {
					VariableID variable = (VariableID) valor;
					if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(!(variables.get(variable.getNombre()).equals(tiposValidos.get(0))) && !(variables.get(variable.getNombre()).equals(tiposValidos.get(1))) && variables.containsKey(variable.getNombre())) {
							return 3;
						} else if(variables.get(variable.getNombre()).equals(tiposValidos.get(1))) {
							check = 2;
						}
					} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(!(variables.get(variable.getNombre()).equals(tiposValidos.get(0))) && !(variables.get(variable.getNombre()).equals(tiposValidos.get(1))) && variables.containsKey(variable.getNombre())) {
							return 3;
						}
					} else {
						if(!(variables.get(variable.getNombre()).equals(tiposValidos.get(0))) && variables.containsKey(variable.getNombre())) {
							return 3;
						}
					}
				} else if(valor instanceof FuncionInterna) {
					FuncionInterna internas = (FuncionInterna) valor;
					if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
						if(internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SQRT") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COS") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SEN") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_EXP") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LN") + '(') || 
								internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LOG") + '(')) {
							check = 2;
						} else {
							return 3;
						}
					} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
						if(!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CUADRADO") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SQRT") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_COS") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_SEN") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_EXP") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LN") + '(') && 
								!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_LOG") + '(')) {
							return 3;
						}
					} else if(tiposValidos.get(0).equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
						if(!internas.getNombre().equals(readerMessages.getBundle().getString("INTERNAS_CONCATENA") + '(')) {
							return 3;
						}
					} else {
						return 3;
					}
				}
			}
		return check;
	}
	
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (6)
	 * Función encargada de comprorar si es un valor simple (no es una operacion).
	 */
	private boolean esValorBasico(Valor v) {
		return !(v instanceof VariableID) && !(v instanceof LlamadaFuncion) && !(v instanceof ValorRegistro) && !(v instanceof ValorVector) && !(v instanceof ValorMatriz) && !esOperacion(v) && !(v instanceof FuncionInterna);
	}
	
	
	/*
	 * Función auxiliar de checkValoresAsignacion // Principio DRY. (7)
	 * Función encargada de registrar los valores erroneos que hay en una operacion segun su tipo
	 */
	private List<Valor> getProblemasOperacion(String tipo, List<Valor> valores, ReadMessagesValidatorInterface readerMessages) {
		List<Valor> problemasOperacion = new ArrayList<Valor>();
		if(tipo.equals(readerMessages.getBundle().getString("TIPO_ENTERO"))) {
			for(Valor valor: valores) {
				if(!(valor instanceof Entero)) {
					problemasOperacion.add(valor);
				}
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_REAL"))) {
			for(Valor valor: valores) {
				if(!(valor instanceof Real) && !(valor instanceof Entero)) {
					problemasOperacion.add(valor);
				}
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_LOGICO"))) {
			for(Valor valor: valores) {
				if(!(valor instanceof Logico)) {
					problemasOperacion.add(valor);
				}
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CADENA"))) {
			for(Valor valor: valores) {
				if(!(valor instanceof CadenaCaracteres)) {
					problemasOperacion.add(valor);
				}
			}
		} else if(tipo.equals(readerMessages.getBundle().getString("TIPO_CARACTER"))) {
			for(Valor valor: valores) {
				if(!(valor instanceof Caracter)) {
					problemasOperacion.add(valor);
				}
			}
		} else {
			for(Valor valor: valores) {
				problemasOperacion.add(valor);
			}
		}
		return problemasOperacion;
	}
	
	/* 21) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los valores pertenecientes a los enumerados definidos.
	 * @param complejos, modulosImportados
	 */
	protected Map<String, String> getValoresEnumeradoTipados(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		Map<String, String> valoresEnumeradoTipados = getValoresEnumeradoTipadosAux(modulosImportados);
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof Enumerado) {
				Enumerado enumerado = (Enumerado) complejo;
				for(Operacion operacion: enumerado.getPosiblesValores()) {
					if(operacion instanceof VariableID) {
						VariableID valor = (VariableID) operacion;
						valoresEnumeradoTipados.put(valor.getNombre(), enumerado.getNombre());
					}
				}
			}
		}
		return valoresEnumeradoTipados;
	}
	
	/*
	 * Función auxiliar de getVariablesDefinidasTipadas // Principio DRY. (1)
	 * Función encargada de registrar los valores pertenecientes a los enumerados exportados por todos los módulos importados.
	 */
	private Map<String, String> getValoresEnumeradoTipadosAux(List<Modulo> modulosImportados) {
		Map<String, String> valoresEnumeradoTipados = new HashMap<String, String>();
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				 if(complejo instanceof Enumerado && modulo.getExporta_tipos().contains(complejo.getNombre())) {
					Enumerado enumerado = (Enumerado) complejo;
					for(Operacion operacion: enumerado.getPosiblesValores()) {
						if(operacion instanceof VariableID) {
							VariableID valor = (VariableID) operacion;
							valoresEnumeradoTipados.put(valor.getNombre(), enumerado.getNombre());
						}
					}
				 }
			 }
		}
		return valoresEnumeradoTipados;
	}
	
	/* 22) /* -------------------------------------------------------------------------------------------------------------------- */
	/**
	 * Función encargada de registrar los tipos complejos creados de subprocesos.
	 * @param complejos, modulosImportados
	 */
	protected Map<String, String> getTiposSubprocesosTipados(List<TipoComplejo> complejos, List<Modulo> modulosImportados) {
		Map<String, String> tiposSubprocesosTipados = getTiposSubprocesosTipadosAux(modulosImportados);
		for(TipoComplejo complejo: complejos) {
			if(complejo instanceof TipoFuncion) {
				TipoFuncion tipoFuncion = (TipoFuncion) complejo;
				tiposSubprocesosTipados.put(tipoFuncion.getNombre(), tipoFuncion.getTipo());
			} else if(complejo instanceof TipoProcedimiento) {
				TipoProcedimiento tipoProcedimiento = (TipoProcedimiento) complejo;
				tiposSubprocesosTipados.put(tipoProcedimiento.getNombre(), "void");
			}
		}
		return tiposSubprocesosTipados;
	}
	
	/*
	 * Función auxiliar de getTiposSubprocesosTipados // Principio DRY. (1)
	 * Función encargada de registrar los tipos complejos creados de subprocesos exportados por todos los módulos importados.
	 */
	private Map<String, String> getTiposSubprocesosTipadosAux(List<Modulo> modulosImportados) {
		Map<String, String> tiposSubprocesosTipados = new HashMap<String, String>();
		for(Modulo modulo: modulosImportados) {
			for(TipoComplejo complejo: modulo.getImplementacion().getComplejos()) {
				if(modulo.getExporta_tipos().equals(complejo.getNombre())) {
					if(complejo instanceof TipoFuncion) {
						TipoFuncion tipoFuncion = (TipoFuncion) complejo;
						tiposSubprocesosTipados.put(tipoFuncion.getNombre(), tipoFuncion.getTipo());
					} else if(complejo instanceof TipoProcedimiento) {
						TipoProcedimiento tipoProcedimiento = (TipoProcedimiento) complejo;
						tiposSubprocesosTipados.put(tipoProcedimiento.getNombre(), "void");
					}
				}
			}
		}
		return tiposSubprocesosTipados;
	}
}
