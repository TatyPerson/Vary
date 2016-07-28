package vary.pseudocodigo.dsl.c.generator.cpp;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.And;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.AsignacionCompleja;
import diagramapseudocodigo.AsignacionNormal;
import diagramapseudocodigo.CabeceraFuncion;
import diagramapseudocodigo.CabeceraProcedimiento;
import diagramapseudocodigo.CabeceraSubproceso;
import diagramapseudocodigo.CampoRegistro;
import diagramapseudocodigo.Caracter;
import diagramapseudocodigo.Caso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Comentario;
import diagramapseudocodigo.Comparacion;
import diagramapseudocodigo.ConstCadena;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.Div;
import diagramapseudocodigo.Division;
import diagramapseudocodigo.Enumerado;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionFicheroAbrir;
import diagramapseudocodigo.FuncionFicheroCerrar;
import diagramapseudocodigo.Igualdad;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Internas;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Mod;
import diagramapseudocodigo.ModoApertura;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
import diagramapseudocodigo.OperacionCompleta;
import diagramapseudocodigo.OperacionParentesis;
import diagramapseudocodigo.Operador;
import diagramapseudocodigo.Or;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Resta;
import diagramapseudocodigo.Sentencias;
import diagramapseudocodigo.Si;
import diagramapseudocodigo.Sino;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.Subrango;
import diagramapseudocodigo.SubrangoEnumerado;
import diagramapseudocodigo.SubrangoNumerico;
import diagramapseudocodigo.Suma;
import diagramapseudocodigo.Tipo;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.TipoDefinido;
import diagramapseudocodigo.TipoExistente;
import diagramapseudocodigo.ValorBooleano;
import diagramapseudocodigo.ValorComplejo;
import diagramapseudocodigo.ValorMatriz;
import diagramapseudocodigo.ValorRegistro;
import diagramapseudocodigo.ValorVector;
import diagramapseudocodigo.Variable;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.Vector;
import diagramapseudocodigo.desde;
import diagramapseudocodigo.impl.AlgoritmoImpl;
import diagramapseudocodigo.impl.AndImpl;
import diagramapseudocodigo.impl.ArchivoImpl;
import diagramapseudocodigo.impl.AsignacionComplejaImpl;
import diagramapseudocodigo.impl.AsignacionNormalImpl;
import diagramapseudocodigo.impl.CabeceraFuncionImpl;
import diagramapseudocodigo.impl.CabeceraProcedimientoImpl;
import diagramapseudocodigo.impl.CaracterImpl;
import diagramapseudocodigo.impl.CasoImpl;
import diagramapseudocodigo.impl.ComparacionImpl;
import diagramapseudocodigo.impl.ConstCadenaImpl;
import diagramapseudocodigo.impl.DeclaracionPropiaImpl;
import diagramapseudocodigo.impl.DeclaracionVariableImpl;
import diagramapseudocodigo.impl.DivImpl;
import diagramapseudocodigo.impl.DivisionImpl;
import diagramapseudocodigo.impl.EnumeradoImpl;
import diagramapseudocodigo.impl.EscribirImpl;
import diagramapseudocodigo.impl.FuncionFicheroAbrirImpl;
import diagramapseudocodigo.impl.FuncionFicheroCerrarImpl;
import diagramapseudocodigo.impl.FuncionImpl;
import diagramapseudocodigo.impl.IgualdadImpl;
import diagramapseudocodigo.impl.InternasImpl;
import diagramapseudocodigo.impl.LeerImpl;
import diagramapseudocodigo.impl.LlamadaFuncionImpl;
import diagramapseudocodigo.impl.MatrizImpl;
import diagramapseudocodigo.impl.ModImpl;
import diagramapseudocodigo.impl.ModuloImpl;
import diagramapseudocodigo.impl.MultiplicacionImpl;
import diagramapseudocodigo.impl.NumeroDecimalImpl;
import diagramapseudocodigo.impl.NumeroEnteroImpl;
import diagramapseudocodigo.impl.OperacionCompletaImpl;
import diagramapseudocodigo.impl.OperacionParentesisImpl;
import diagramapseudocodigo.impl.OrImpl;
import diagramapseudocodigo.impl.ProcedimientoImpl;
import diagramapseudocodigo.impl.RegistroImpl;
import diagramapseudocodigo.impl.RestaImpl;
import diagramapseudocodigo.impl.SiImpl;
import diagramapseudocodigo.impl.SubrangoEnumeradoImpl;
import diagramapseudocodigo.impl.SubrangoNumericoImpl;
import diagramapseudocodigo.impl.SumaImpl;
import diagramapseudocodigo.impl.TipoDefinidoImpl;
import diagramapseudocodigo.impl.TipoExistenteImpl;
import diagramapseudocodigo.impl.ValorBooleanoImpl;
import diagramapseudocodigo.impl.ValorMatrizImpl;
import diagramapseudocodigo.impl.ValorRegistroImpl;
import diagramapseudocodigo.impl.ValorVectorImpl;
import diagramapseudocodigo.impl.VariableIDImpl;
import diagramapseudocodigo.impl.VectorImpl;
import diagramapseudocodigo.impl.desdeImpl;
import diagramapseudocodigo.impl.mientrasImpl;
import diagramapseudocodigo.impl.operacionImpl;
import diagramapseudocodigo.impl.repetirImpl;
import diagramapseudocodigo.impl.segunImpl;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import diagramapseudocodigo.signo;
import diagramapseudocodigo.valor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import vary.pseudocodigo.dsl.c.generator.VaryGeneratorInterface;
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder;
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class VaryGrammarGeneratorCPP implements IGenerator, VaryGeneratorInterface {
  private static Map<String, String> variablesInicio = new HashMap<String, String>();
  
  private static Map<String, Map<String, String>> variablesSubprocesos = new HashMap<String, Map<String, String>>();
  
  private static Map<String, String> vectoresMatrices = new HashMap<String, String>();
  
  private static List<String> archivos = new ArrayList<String>();
  
  private static Map<String, Map<String, String>> registros = new HashMap<String, Map<String, String>>();
  
  private static Map<String, ArrayList<String>> variablesEnumerados = new HashMap<String, ArrayList<String>>();
  
  private static ArrayList<String> enumerados = new ArrayList<String>();
  
  private Algoritmo algoritmo;
  
  private Modulo modulo;
  
  private static boolean cabeceras;
  
  private static Map<String, String> funciones = new HashMap<String, String>();
  
  private static ReadFileProperties readerFileProperties = new ReadFileProperties();
  
  private static Map<String, ArrayList<Integer>> subprocesosConPunteros = new HashMap<String, ArrayList<Integer>>();
  
  private static ReadMessagesValidatorInterface readerMessages;
  
  public VaryGrammarGeneratorCPP(final ReadMessagesValidatorInterface readerMessages) {
    VaryGrammarGeneratorCPP.readerMessages = readerMessages;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess myCFile) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Codigo> _filter = Iterables.<Codigo>filter(_iterable, Codigo.class);
    for (final Codigo myPseudo : _filter) {
      {
        this.algoritmo = null;
        this.modulo = null;
        ProjectLocationFolder.setResource(resource);
        String _path = ProjectLocationFolder.getPath();
        String _plus = ("La uri cogida es:" + _path);
        System.out.println(_plus);
        String contenidoFichero = new String();
        try {
          String _oS = ProjectLocationFolder.getOS();
          boolean _equals = _oS.equals("WIN32");
          if (_equals) {
            String _path_1 = ProjectLocationFolder.getPath();
            String _plus_1 = (_path_1 + ".varyproject");
            String _readFilePropertiesWindows = VaryGrammarGeneratorCPP.readerFileProperties.readFilePropertiesWindows(_plus_1, 1);
            contenidoFichero = _readFilePropertiesWindows;
          } else {
            String _path_2 = ProjectLocationFolder.getPath();
            String _plus_2 = ("file:" + _path_2);
            String _readFilePropertiesUnix = VaryGrammarGeneratorCPP.readerFileProperties.readFilePropertiesUnix(_plus_2, 1);
            contenidoFichero = _readFilePropertiesUnix;
          }
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        Logger _logger = ProjectLocationFolder.getLogger();
        _logger.error("El contenido del fichero es:");
        Logger _logger_1 = ProjectLocationFolder.getLogger();
        _logger_1.error(contenidoFichero);
        String tipoProyecto = contenidoFichero.replaceAll("ficheroCabeceras=", "");
        boolean _equals_1 = Objects.equal(tipoProyecto, "false");
        if (_equals_1) {
          VaryGrammarGeneratorCPP.cabeceras = false;
          if ((myPseudo instanceof Algoritmo)) {
            String _obtenerNombre = this.obtenerNombre(myPseudo);
            String _plus_3 = (_obtenerNombre + ".cpp");
            CharSequence _generate = this.generate(((Algoritmo)myPseudo));
            myCFile.generateFile(_plus_3, _generate);
          } else {
            String _obtenerNombre_1 = this.obtenerNombre(myPseudo);
            String _plus_4 = (_obtenerNombre_1 + ".cpp");
            CharSequence _generate_1 = this.generate(myPseudo);
            myCFile.generateFile(_plus_4, _generate_1);
            String _obtenerNombre_2 = this.obtenerNombre(myPseudo);
            String _plus_5 = (_obtenerNombre_2 + ".h");
            CharSequence _generarCabeceras = this.generarCabeceras(myPseudo);
            myCFile.generateFile(_plus_5, _generarCabeceras);
          }
        } else {
          VaryGrammarGeneratorCPP.cabeceras = true;
          String _obtenerNombre_3 = this.obtenerNombre(myPseudo);
          String _plus_6 = (_obtenerNombre_3 + ".cpp");
          CharSequence _generate_2 = this.generate(myPseudo);
          myCFile.generateFile(_plus_6, _generate_2);
          String _obtenerNombre_4 = this.obtenerNombre(myPseudo);
          String _plus_7 = (_obtenerNombre_4 + ".h");
          CharSequence _generarCabeceras_1 = this.generarCabeceras(myPseudo);
          myCFile.generateFile(_plus_7, _generarCabeceras_1);
        }
      }
    }
  }
  
  public String obtenerNombre(final Codigo myCodigo) {
    EClass _eClass = myCodigo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Algoritmo");
    if (_equals) {
      Algoritmo algoritmo = new AlgoritmoImpl();
      algoritmo = ((Algoritmo) myCodigo);
      return algoritmo.getNombre();
    } else {
      EClass _eClass_1 = myCodigo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Modulo");
      if (_equals_1) {
        Modulo modulo = new ModuloImpl();
        modulo = ((Modulo) myCodigo);
        return modulo.getNombre();
      }
    }
    return null;
  }
  
  public CharSequence generarCabeceras(final Codigo myCodigo) {
    CharSequence _xifexpression = null;
    EClass _eClass = myCodigo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Algoritmo");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        Algoritmo algoritmo = new AlgoritmoImpl();
        algoritmo = ((Algoritmo) myCodigo);
        _xblockexpression = this.generarCabeceras(algoritmo);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myCodigo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Modulo");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          Modulo modulo = new ModuloImpl();
          modulo = ((Modulo) myCodigo);
          _xblockexpression_1 = this.generarCabeceras(modulo);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public void addProcedimiento(final Procedimiento procedimiento, final List<Procedimiento> procedimientos) {
    procedimientos.add(procedimiento);
  }
  
  public void addFuncion(final Funcion funcion, final List<Funcion> funciones) {
    funciones.add(funcion);
  }
  
  public void addVariable(final List<String> variablesPublicas, final Declaracion declaracion) {
    if ((declaracion instanceof DeclaracionVariable)) {
      DeclaracionVariable decVar = ((DeclaracionVariable) declaracion);
      EList<Variable> _variable = decVar.getVariable();
      for (final Variable myVariable : _variable) {
        String _nombre = myVariable.getNombre();
        variablesPublicas.add(_nombre);
      }
    } else {
      DeclaracionPropia decPropia = ((DeclaracionPropia) declaracion);
      EList<Variable> _variable_1 = decPropia.getVariable();
      for (final Variable myVariable_1 : _variable_1) {
        String _nombre_1 = myVariable_1.getNombre();
        variablesPublicas.add(_nombre_1);
      }
    }
  }
  
  public CharSequence generarCabeceras(final Modulo myModulo) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Procedimiento> procedimientosUsados = new ArrayList<Procedimiento>();
      ArrayList<Funcion> funcionesUsadas = new ArrayList<Funcion>();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#ifndef ");
      String _nombre = myModulo.getNombre();
      String _upperCase = _nombre.toUpperCase();
      _builder.append(_upperCase, "");
      _builder.append("_H");
      _builder.newLineIfNotEmpty();
      _builder.append("#define ");
      String _nombre_1 = myModulo.getNombre();
      String _upperCase_1 = _nombre_1.toUpperCase();
      _builder.append(_upperCase_1, "");
      _builder.append("_H");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Modulo> _importaciones = myModulo.getImportaciones();
        for(final Modulo myRefModulo : _importaciones) {
          _builder.append("#include \"");
          String _nombre_2 = myRefModulo.getNombre();
          _builder.append(_nombre_2, "");
          _builder.append(".h\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("using namespace std;");
      _builder.newLine();
      _builder.newLine();
      {
        Implementacion _implementacion = myModulo.getImplementacion();
        EList<Constantes> _constantes = _implementacion.getConstantes();
        for(final Constantes myConstante : _constantes) {
          {
            EList<String> _exporta_constantes = myModulo.getExporta_constantes();
            Variable _variable = myConstante.getVariable();
            String _nombre_3 = _variable.getNombre();
            boolean _contains = _exporta_constantes.contains(_nombre_3);
            if (_contains) {
              CharSequence _generate = this.generate(myConstante);
              _builder.append(_generate, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        Implementacion _implementacion_1 = myModulo.getImplementacion();
        EList<TipoComplejo> _tipocomplejo = _implementacion_1.getTipocomplejo();
        for(final TipoComplejo myTipo : _tipocomplejo) {
          {
            EClass _eClass = myTipo.eClass();
            String _name = _eClass.getName();
            boolean _equals = _name.equals("Vector");
            if (_equals) {
              Vector vector = ((Vector) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos = myModulo.getExporta_tipos();
                String _nombre_4 = vector.getNombre();
                boolean _contains_1 = _exporta_tipos.contains(_nombre_4);
                if (_contains_1) {
                  CharSequence _generate_1 = this.generate(vector);
                  _builder.append(_generate_1, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_1 = myTipo.eClass();
            String _name_1 = _eClass_1.getName();
            boolean _equals_1 = _name_1.equals("Matriz");
            if (_equals_1) {
              Matriz matriz = ((Matriz) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_1 = myModulo.getExporta_tipos();
                String _nombre_5 = matriz.getNombre();
                boolean _contains_2 = _exporta_tipos_1.contains(_nombre_5);
                if (_contains_2) {
                  CharSequence _generate_2 = this.generate(matriz);
                  _builder.append(_generate_2, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_2 = myTipo.eClass();
            String _name_2 = _eClass_2.getName();
            boolean _equals_2 = _name_2.equals("Registro");
            if (_equals_2) {
              Registro registro = ((Registro) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_2 = myModulo.getExporta_tipos();
                String _nombre_6 = registro.getNombre();
                boolean _contains_3 = _exporta_tipos_2.contains(_nombre_6);
                if (_contains_3) {
                  CharSequence _generate_3 = this.generate(registro);
                  _builder.append(_generate_3, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_3 = myTipo.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("Archivo");
            if (_equals_3) {
              Archivo archivo = ((Archivo) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_3 = myModulo.getExporta_tipos();
                String _nombre_7 = archivo.getNombre();
                boolean _contains_4 = _exporta_tipos_3.contains(_nombre_7);
                if (_contains_4) {
                  CharSequence _generate_4 = this.generate(archivo);
                  _builder.append(_generate_4, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_4 = myTipo.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Enumerado");
            if (_equals_4) {
              Enumerado enumerado = ((Enumerado) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_4 = myModulo.getExporta_tipos();
                String _nombre_8 = enumerado.getNombre();
                boolean _contains_5 = _exporta_tipos_4.contains(_nombre_8);
                if (_contains_5) {
                  CharSequence _generate_5 = this.generate(enumerado);
                  _builder.append(_generate_5, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_5 = myTipo.eClass();
            String _name_5 = _eClass_5.getName();
            boolean _equals_5 = _name_5.equals("Subrango");
            if (_equals_5) {
              Subrango subrango = ((Subrango) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_5 = myModulo.getExporta_tipos();
                String _nombre_9 = subrango.getNombre();
                boolean _contains_6 = _exporta_tipos_5.contains(_nombre_9);
                if (_contains_6) {
                  CharSequence _generate_6 = this.generate(subrango);
                  _builder.append(_generate_6, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      ArrayList<String> variablesPublicas = new ArrayList<String>();
      _builder.newLineIfNotEmpty();
      _builder.append("class  ");
      String _nombre_10 = myModulo.getNombre();
      _builder.append(_nombre_10, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//Variables a exportar");
      _builder.newLine();
      {
        EList<Declaracion> _exporta_global = this.modulo.getExporta_global();
        for(final Declaracion myDeclaracion : _exporta_global) {
          _builder.append("\t\t");
          this.addVariable(variablesPublicas, myDeclaracion);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          CharSequence _generate_7 = this.generate(myDeclaracion);
          _builder.append(_generate_7, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//Métodos (funciones) a exportar");
      _builder.newLine();
      {
        EList<CabeceraSubproceso> _exporta_funciones = myModulo.getExporta_funciones();
        for(final CabeceraSubproceso exportaCabecera : _exporta_funciones) {
          {
            EClass _eClass_6 = exportaCabecera.eClass();
            String _name_6 = _eClass_6.getName();
            boolean _equals_6 = _name_6.equals("CabeceraProcedimiento");
            if (_equals_6) {
              _builder.append("\t\t");
              CabeceraProcedimiento cabecera = ((CabeceraProcedimiento) exportaCabecera);
              _builder.newLineIfNotEmpty();
              {
                Implementacion _implementacion_2 = myModulo.getImplementacion();
                EList<Subproceso> _funcion = _implementacion_2.getFuncion();
                for(final Subproceso mySubproceso : _funcion) {
                  {
                    EClass _eClass_7 = mySubproceso.eClass();
                    String _name_7 = _eClass_7.getName();
                    boolean _equals_7 = _name_7.equals("Procedimiento");
                    if (_equals_7) {
                      _builder.append("\t\t");
                      Procedimiento procedimiento = ((Procedimiento) mySubproceso);
                      _builder.newLineIfNotEmpty();
                      {
                        if ((cabecera.getNombre().equals(procedimiento.getNombre()) && (procedimiento.getParametrofuncion().size() == cabecera.getParametrofuncion().size()))) {
                          _builder.append("\t\t");
                          String _cabecerasFuncion = this.cabecerasFuncion(mySubproceso);
                          _builder.append(_cabecerasFuncion, "\t\t");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          this.addProcedimiento(procedimiento, procedimientosUsados);
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            EClass _eClass_8 = exportaCabecera.eClass();
            String _name_8 = _eClass_8.getName();
            boolean _equals_8 = _name_8.equals("CabeceraFuncion");
            if (_equals_8) {
              _builder.append("\t\t");
              CabeceraFuncion cabecera_1 = ((CabeceraFuncion) exportaCabecera);
              _builder.newLineIfNotEmpty();
              {
                Implementacion _implementacion_3 = myModulo.getImplementacion();
                EList<Subproceso> _funcion_1 = _implementacion_3.getFuncion();
                for(final Subproceso mySubproceso_1 : _funcion_1) {
                  {
                    EClass _eClass_9 = mySubproceso_1.eClass();
                    String _name_9 = _eClass_9.getName();
                    boolean _equals_9 = _name_9.equals("Funcion");
                    if (_equals_9) {
                      _builder.append("\t\t");
                      Funcion funcion = ((Funcion) mySubproceso_1);
                      _builder.newLineIfNotEmpty();
                      {
                        if ((cabecera_1.getNombre().equals(funcion.getNombre()) && (funcion.getParametrofuncion().size() == cabecera_1.getParametrofuncion().size()))) {
                          _builder.append("\t\t");
                          String _cabecerasFuncion_1 = this.cabecerasFuncion(mySubproceso_1);
                          _builder.append(_cabecerasFuncion_1, "\t\t");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t");
                          this.addFuncion(funcion, funcionesUsadas);
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private:");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//Variables privadas");
      _builder.newLine();
      {
        Implementacion _implementacion_4 = this.modulo.getImplementacion();
        EList<Declaracion> _global = _implementacion_4.getGlobal();
        for(final Declaracion myVariable : _global) {
          _builder.append("\t\t");
          CharSequence _generate_8 = this.generate(myVariable);
          _builder.append(_generate_8, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//Métodos (funciones) privadas de la clase");
      _builder.newLine();
      {
        Implementacion _implementacion_5 = myModulo.getImplementacion();
        EList<Subproceso> _funcion_2 = _implementacion_5.getFuncion();
        for(final Subproceso mySubproceso_2 : _funcion_2) {
          {
            EClass _eClass_10 = mySubproceso_2.eClass();
            String _name_10 = _eClass_10.getName();
            boolean _equals_10 = _name_10.equals("Procedimiento");
            if (_equals_10) {
              _builder.append("\t\t");
              Procedimiento procedimiento_1 = ((Procedimiento) mySubproceso_2);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_7 = procedimientosUsados.contains(procedimiento_1);
                boolean _not = (!_contains_7);
                if (_not) {
                  _builder.append("\t\t");
                  String _cabecerasFuncionStatic = this.cabecerasFuncionStatic(mySubproceso_2);
                  _builder.append(_cabecerasFuncionStatic, "\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_11 = mySubproceso_2.eClass();
            String _name_11 = _eClass_11.getName();
            boolean _equals_11 = _name_11.equals("Funcion");
            if (_equals_11) {
              _builder.append("\t\t");
              Funcion funcion_1 = ((Funcion) mySubproceso_2);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_8 = funcionesUsadas.contains(funcion_1);
                boolean _not_1 = (!_contains_8);
                if (_not_1) {
                  _builder.append("\t\t");
                  String _cabecerasFuncionStatic_1 = this.cabecerasFuncionStatic(mySubproceso_2);
                  _builder.append(_cabecerasFuncionStatic_1, "\t\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.append("};");
      _builder.newLine();
      _builder.newLine();
      _builder.append("#endif /* ");
      String _nombre_11 = myModulo.getNombre();
      String _upperCase_2 = _nombre_11.toUpperCase();
      _builder.append(_upperCase_2, "");
      _builder.append("_H */");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generarCabeceras(final Algoritmo myAlgoritmo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("#ifndef CABECERAS_H");
    _builder.newLine();
    _builder.append("#define CABECERAS_H");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Modulo> _importaciones = this.algoritmo.getImportaciones();
      for(final Modulo myRefModulo : _importaciones) {
        _builder.append("#include \"");
        String _nombre = myRefModulo.getNombre();
        _builder.append(_nombre, "");
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Constantes> _constantes = myAlgoritmo.getConstantes();
      for(final Constantes myConstante : _constantes) {
        CharSequence _generate = this.generate(myConstante);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<TipoComplejo> _tipocomplejo = myAlgoritmo.getTipocomplejo();
      for(final TipoComplejo myComplejo : _tipocomplejo) {
        CharSequence _generate_1 = this.generate(myComplejo);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Subproceso> _funcion = myAlgoritmo.getFuncion();
      for(final Subproceso funcion : _funcion) {
        String _cabecerasFuncion = this.cabecerasFuncion(funcion);
        _builder.append(_cabecerasFuncion, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("#endif /* CABECERAS_H */");
    _builder.newLine();
    return _builder;
  }
  
  public String cabecerasFuncion(final Subproceso s) {
    EClass _eClass = s.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Funcion");
    if (_equals) {
      Funcion funcion = new FuncionImpl();
      funcion = ((Funcion) s);
      String _tipo = funcion.getTipo();
      String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
      String _plus = (_tipoVariableCpp + " ");
      String _nombre = funcion.getNombre();
      String cabecera = (_plus + _nombre);
      EList<ParametroFuncion> _parametrofuncion = funcion.getParametrofuncion();
      return this.variablesCabecerasSubproceso(_parametrofuncion, cabecera);
    } else {
      EClass _eClass_1 = s.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Procedimiento");
      if (_equals_1) {
        Procedimiento procedimiento = new ProcedimientoImpl();
        procedimiento = ((Procedimiento) s);
        String _nombre_1 = procedimiento.getNombre();
        String cabecera_1 = (("void" + " ") + _nombre_1);
        EList<ParametroFuncion> _parametrofuncion_1 = procedimiento.getParametrofuncion();
        return this.variablesCabecerasSubproceso(_parametrofuncion_1, cabecera_1);
      }
    }
    return null;
  }
  
  public String cabecerasFuncionStatic(final Subproceso s) {
    EClass _eClass = s.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Funcion");
    if (_equals) {
      Funcion funcion = new FuncionImpl();
      funcion = ((Funcion) s);
      String _tipo = funcion.getTipo();
      String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
      String _plus = ("static " + _tipoVariableCpp);
      String _plus_1 = (_plus + " ");
      String _nombre = funcion.getNombre();
      String cabecera = (_plus_1 + _nombre);
      EList<ParametroFuncion> _parametrofuncion = funcion.getParametrofuncion();
      return this.variablesCabecerasSubproceso(_parametrofuncion, cabecera);
    } else {
      EClass _eClass_1 = s.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Procedimiento");
      if (_equals_1) {
        Procedimiento procedimiento = new ProcedimientoImpl();
        procedimiento = ((Procedimiento) s);
        String _nombre_1 = procedimiento.getNombre();
        String cabecera_1 = (("static void" + " ") + _nombre_1);
        EList<ParametroFuncion> _parametrofuncion_1 = procedimiento.getParametrofuncion();
        return this.variablesCabecerasSubproceso(_parametrofuncion_1, cabecera_1);
      }
    }
    return null;
  }
  
  public String variablesCabecerasSubproceso(final EList<ParametroFuncion> parametros, final String cabecera) {
    String total = cabecera;
    int actual = 1;
    for (final ParametroFuncion p : parametros) {
      {
        if ((actual != 1)) {
          total = (total + ", ");
        }
        String _paso = p.getPaso();
        ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string = _bundle.getString("TIPO_PASO_ENTRADA");
        boolean _equals = _paso.equals(_string);
        if (_equals) {
          Tipo _tipo = p.getTipo();
          CharSequence _generate = this.generate(_tipo);
          String _plus = ((total + "const ") + _generate);
          total = _plus;
        } else {
          if ((p.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (p.getTipo() instanceof TipoExistente))) {
            Tipo _tipo_1 = p.getTipo();
            CharSequence _generate_1 = this.generate(_tipo_1);
            String _plus_1 = (total + _generate_1);
            String _plus_2 = (_plus_1 + "*");
            total = _plus_2;
          } else {
            if ((p.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (p.getTipo() instanceof TipoExistente))) {
              Tipo _tipo_2 = p.getTipo();
              CharSequence _generate_2 = this.generate(_tipo_2);
              String _plus_3 = (total + _generate_2);
              String _plus_4 = (_plus_3 + "*");
              total = _plus_4;
            } else {
              Tipo _tipo_3 = p.getTipo();
              CharSequence _generate_3 = this.generate(_tipo_3);
              String _plus_5 = (total + _generate_3);
              total = _plus_5;
            }
          }
        }
        actual = (actual + 1);
      }
    }
    total = (total + ");");
    return total;
  }
  
  @Override
  public CharSequence generate(final Codigo myCodigo) {
    CharSequence _xifexpression = null;
    EClass _eClass = myCodigo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Algoritmo");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        Algoritmo algoritmo = new AlgoritmoImpl();
        algoritmo = ((Algoritmo) myCodigo);
        _xblockexpression = this.generate(algoritmo);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myCodigo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Modulo");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          Modulo modulo = new ModuloImpl();
          modulo = ((Modulo) myCodigo);
          _xblockexpression_1 = this.generate(modulo);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final Modulo myModulo) {
    CharSequence _xblockexpression = null;
    {
      this.modulo = myModulo;
      Implementacion _implementacion = this.modulo.getImplementacion();
      EList<TipoComplejo> _tipocomplejo = _implementacion.getTipocomplejo();
      for (final TipoComplejo t : _tipocomplejo) {
        if ((t instanceof Enumerado)) {
          Enumerado enumerado = ((Enumerado) t);
          String _nombre = enumerado.getNombre();
          ArrayList<String> _arrayList = new ArrayList<String>();
          VaryGrammarGeneratorCPP.variablesEnumerados.put(_nombre, _arrayList);
          String _nombre_1 = enumerado.getNombre();
          VaryGrammarGeneratorCPP.enumerados.add(_nombre_1);
          EList<operacion> _valor = enumerado.getValor();
          for (final valor v : _valor) {
            if ((v instanceof Operador)) {
              Operador v2 = ((Operador) v);
              if ((v2 instanceof VariableID)) {
                VariableID aux = ((VariableID) v2);
                String _nombre_2 = enumerado.getNombre();
                ArrayList<String> _get = VaryGrammarGeneratorCPP.variablesEnumerados.get(_nombre_2);
                String _nombre_3 = aux.getNombre();
                _get.add(_nombre_3);
              }
            }
          }
        }
      }
      Implementacion _implementacion_1 = this.modulo.getImplementacion();
      EList<Subproceso> _funcion = _implementacion_1.getFuncion();
      for (final Subproceso s : _funcion) {
        EClass _eClass = s.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Funcion");
        if (_equals) {
          Funcion funcion = new FuncionImpl();
          funcion = ((Funcion) s);
          String _nombre_4 = funcion.getNombre();
          String _tipo = funcion.getTipo();
          VaryGrammarGeneratorCPP.funciones.put(_nombre_4, _tipo);
          String _nombre_5 = funcion.getNombre();
          ArrayList<Integer> _arrayList_1 = new ArrayList<Integer>();
          VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_5, _arrayList_1);
          int numParametro = 1;
          EList<ParametroFuncion> _parametrofuncion = funcion.getParametrofuncion();
          for (final ParametroFuncion parametro : _parametrofuncion) {
            {
              if ((parametro.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro.getTipo() instanceof TipoExistente))) {
                String _nombre_6 = funcion.getNombre();
                ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_6);
                _get_1.add(Integer.valueOf(numParametro));
              } else {
                if ((parametro.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro.getTipo() instanceof TipoExistente))) {
                  String _nombre_7 = funcion.getNombre();
                  ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_7);
                  _get_2.add(Integer.valueOf(numParametro));
                }
              }
              numParametro = (numParametro + 1);
            }
          }
        } else {
          EClass _eClass_1 = s.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Procedimiento");
          if (_equals_1) {
            Procedimiento procedimiento = new ProcedimientoImpl();
            procedimiento = ((Procedimiento) s);
            String _nombre_6 = procedimiento.getNombre();
            VaryGrammarGeneratorCPP.funciones.put(_nombre_6, "void");
            String _nombre_7 = procedimiento.getNombre();
            ArrayList<Integer> _arrayList_2 = new ArrayList<Integer>();
            VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_7, _arrayList_2);
            int numParametro_1 = 1;
            EList<ParametroFuncion> _parametrofuncion_1 = procedimiento.getParametrofuncion();
            for (final ParametroFuncion parametro_1 : _parametrofuncion_1) {
              {
                if ((parametro_1.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_1.getTipo() instanceof TipoExistente))) {
                  String _nombre_8 = procedimiento.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_8);
                  _get_1.add(Integer.valueOf(numParametro_1));
                } else {
                  if ((parametro_1.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_1.getTipo() instanceof TipoExistente))) {
                    String _nombre_9 = procedimiento.getNombre();
                    ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_9);
                    _get_2.add(Integer.valueOf(numParametro_1));
                  }
                }
                numParametro_1 = (numParametro_1 + 1);
              }
            }
          }
        }
      }
      EList<Modulo> _importaciones = this.modulo.getImportaciones();
      for (final Modulo m : _importaciones) {
        EList<CabeceraSubproceso> _exporta_funciones = m.getExporta_funciones();
        for (final CabeceraSubproceso cabecera : _exporta_funciones) {
          EClass _eClass_2 = cabecera.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_2 = _name_2.equals("CabeceraFuncion");
          if (_equals_2) {
            CabeceraFuncion cabeceraFuncion = new CabeceraFuncionImpl();
            cabeceraFuncion = ((CabeceraFuncion) cabecera);
            String _nombre_8 = cabeceraFuncion.getNombre();
            String _tipo_1 = cabeceraFuncion.getTipo();
            VaryGrammarGeneratorCPP.funciones.put(_nombre_8, _tipo_1);
            String _nombre_9 = cabeceraFuncion.getNombre();
            ArrayList<Integer> _arrayList_3 = new ArrayList<Integer>();
            VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_9, _arrayList_3);
            int numParametro_2 = 1;
            EList<ParametroFuncion> _parametrofuncion_2 = cabeceraFuncion.getParametrofuncion();
            for (final ParametroFuncion parametro_2 : _parametrofuncion_2) {
              {
                if ((parametro_2.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_2.getTipo() instanceof TipoExistente))) {
                  String _nombre_10 = cabeceraFuncion.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_10);
                  _get_1.add(Integer.valueOf(numParametro_2));
                } else {
                  if ((parametro_2.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_2.getTipo() instanceof TipoExistente))) {
                    String _nombre_11 = cabeceraFuncion.getNombre();
                    ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_11);
                    _get_2.add(Integer.valueOf(numParametro_2));
                  }
                }
                numParametro_2 = (numParametro_2 + 1);
              }
            }
          } else {
            EClass _eClass_3 = cabecera.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("CabeceraProcedimiento");
            if (_equals_3) {
              CabeceraProcedimiento cabeceraProcedimiento = new CabeceraProcedimientoImpl();
              cabeceraProcedimiento = ((CabeceraProcedimiento) cabecera);
              String _nombre_10 = cabeceraProcedimiento.getNombre();
              VaryGrammarGeneratorCPP.funciones.put(_nombre_10, "void");
              String _nombre_11 = cabeceraProcedimiento.getNombre();
              ArrayList<Integer> _arrayList_4 = new ArrayList<Integer>();
              VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_11, _arrayList_4);
              int numParametro_3 = 1;
              EList<ParametroFuncion> _parametrofuncion_3 = cabeceraProcedimiento.getParametrofuncion();
              for (final ParametroFuncion parametro_3 : _parametrofuncion_3) {
                {
                  if ((parametro_3.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_3.getTipo() instanceof TipoExistente))) {
                    String _nombre_12 = cabeceraProcedimiento.getNombre();
                    ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_12);
                    _get_1.add(Integer.valueOf(numParametro_3));
                  }
                  if ((parametro_3.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_3.getTipo() instanceof TipoExistente))) {
                    String _nombre_13 = cabeceraProcedimiento.getNombre();
                    ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_13);
                    _get_2.add(Integer.valueOf(numParametro_3));
                  }
                  numParametro_3 = (numParametro_3 + 1);
                }
              }
            }
          }
        }
      }
      Implementacion _implementacion_2 = this.modulo.getImplementacion();
      EList<Subproceso> _funcion_1 = _implementacion_2.getFuncion();
      for (final Subproceso s_1 : _funcion_1) {
        {
          String _nombre_12 = s_1.getNombre();
          HashMap<String, String> _hashMap = new HashMap<String, String>();
          VaryGrammarGeneratorCPP.variablesSubprocesos.put(_nombre_12, _hashMap);
          EList<Declaracion> _declaracion = s_1.getDeclaracion();
          for (final Declaracion d : _declaracion) {
            if ((d instanceof DeclaracionVariable)) {
              DeclaracionVariable dec = ((DeclaracionVariable) d);
              EList<Variable> _variable = dec.getVariable();
              for (final Variable v_1 : _variable) {
                String _nombre_13 = s_1.getNombre();
                Map<String, String> _get_1 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_13);
                String _nombre_14 = v_1.getNombre();
                String _tipo_2 = dec.getTipo();
                _get_1.put(_nombre_14, _tipo_2);
              }
            } else {
              if ((d instanceof DeclaracionPropia)) {
                DeclaracionPropia dec_1 = ((DeclaracionPropia) d);
                EList<Variable> _variable_1 = dec_1.getVariable();
                for (final Variable v_2 : _variable_1) {
                  String _nombre_15 = s_1.getNombre();
                  Map<String, String> _get_2 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_15);
                  String _nombre_16 = v_2.getNombre();
                  String _tipo_3 = dec_1.getTipo();
                  _get_2.put(_nombre_16, _tipo_3);
                }
              }
            }
          }
          EList<ParametroFuncion> _parametrofuncion_4 = s_1.getParametrofuncion();
          for (final ParametroFuncion p : _parametrofuncion_4) {
            Tipo _tipo_4 = p.getTipo();
            EClass _eClass_4 = _tipo_4.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("TipoExistente");
            if (_equals_4) {
              Tipo _tipo_5 = p.getTipo();
              TipoExistente tipo = ((TipoExistente) _tipo_5);
              String _nombre_17 = s_1.getNombre();
              Map<String, String> _get_3 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_17);
              Variable _variable_2 = p.getVariable();
              String _nombre_18 = _variable_2.getNombre();
              String _tipo_6 = tipo.getTipo();
              _get_3.put(_nombre_18, _tipo_6);
            } else {
              Tipo _tipo_7 = p.getTipo();
              EClass _eClass_5 = _tipo_7.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("TipoDefinido");
              if (_equals_5) {
                Tipo _tipo_8 = p.getTipo();
                TipoDefinido tipo_1 = ((TipoDefinido) _tipo_8);
                String _nombre_19 = s_1.getNombre();
                Map<String, String> _get_4 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_19);
                Variable _variable_3 = p.getVariable();
                String _nombre_20 = _variable_3.getNombre();
                String _tipo_9 = tipo_1.getTipo();
                _get_4.put(_nombre_20, _tipo_9);
              }
            }
          }
        }
      }
      Implementacion _implementacion_3 = this.modulo.getImplementacion();
      EList<TipoComplejo> _tipocomplejo_1 = _implementacion_3.getTipocomplejo();
      for (final TipoComplejo t_1 : _tipocomplejo_1) {
        EClass _eClass_4 = t_1.eClass();
        String _name_4 = _eClass_4.getName();
        boolean _equals_4 = _name_4.equals("Vector");
        if (_equals_4) {
          Vector v_1 = ((Vector) t_1);
          Tipo _tipo_2 = v_1.getTipo();
          EClass _eClass_5 = _tipo_2.eClass();
          String _name_5 = _eClass_5.getName();
          boolean _equals_5 = _name_5.equals("TipoExistente");
          if (_equals_5) {
            Tipo _tipo_3 = v_1.getTipo();
            TipoExistente tipo = ((TipoExistente) _tipo_3);
            String _nombre_12 = v_1.getNombre();
            String _tipo_4 = tipo.getTipo();
            VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_12, _tipo_4);
          } else {
            Tipo _tipo_5 = v_1.getTipo();
            EClass _eClass_6 = _tipo_5.eClass();
            String _name_6 = _eClass_6.getName();
            boolean _equals_6 = _name_6.equals("TipoDefinido");
            if (_equals_6) {
              Tipo _tipo_6 = v_1.getTipo();
              TipoDefinido tipo_1 = ((TipoDefinido) _tipo_6);
              String _nombre_13 = v_1.getNombre();
              String _tipo_7 = tipo_1.getTipo();
              VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_13, _tipo_7);
            }
          }
        } else {
          EClass _eClass_7 = t_1.eClass();
          String _name_7 = _eClass_7.getName();
          boolean _equals_7 = _name_7.equals("Matriz");
          if (_equals_7) {
            Matriz m_1 = ((Matriz) t_1);
            Tipo _tipo_8 = m_1.getTipo();
            EClass _eClass_8 = _tipo_8.eClass();
            String _name_8 = _eClass_8.getName();
            boolean _equals_8 = _name_8.equals("TipoExistente");
            if (_equals_8) {
              Tipo _tipo_9 = m_1.getTipo();
              TipoExistente tipo_2 = ((TipoExistente) _tipo_9);
              String _nombre_14 = m_1.getNombre();
              String _tipo_10 = tipo_2.getTipo();
              VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_14, _tipo_10);
            } else {
              Tipo _tipo_11 = m_1.getTipo();
              EClass _eClass_9 = _tipo_11.eClass();
              String _name_9 = _eClass_9.getName();
              boolean _equals_9 = _name_9.equals("TipoDefinido");
              if (_equals_9) {
                Tipo _tipo_12 = m_1.getTipo();
                TipoDefinido tipo_3 = ((TipoDefinido) _tipo_12);
                String _nombre_15 = m_1.getNombre();
                String _tipo_13 = tipo_3.getTipo();
                VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_15, _tipo_13);
              }
            }
          } else {
            EClass _eClass_10 = t_1.eClass();
            String _name_10 = _eClass_10.getName();
            boolean _equals_10 = _name_10.equals("Registro");
            if (_equals_10) {
              Registro r = ((Registro) t_1);
              String _nombre_16 = r.getNombre();
              HashMap<String, String> _hashMap = new HashMap<String, String>();
              VaryGrammarGeneratorCPP.registros.put(_nombre_16, _hashMap);
              EList<Declaracion> _variable = r.getVariable();
              for (final Declaracion d : _variable) {
                if ((d instanceof DeclaracionVariable)) {
                  DeclaracionVariable dec = ((DeclaracionVariable) d);
                  EList<Variable> _variable_1 = dec.getVariable();
                  for (final Variable v_2 : _variable_1) {
                    String _nombre_17 = r.getNombre();
                    Map<String, String> _get_1 = VaryGrammarGeneratorCPP.registros.get(_nombre_17);
                    String _nombre_18 = v_2.getNombre();
                    String _tipo_14 = dec.getTipo();
                    _get_1.put(_nombre_18, _tipo_14);
                  }
                } else {
                  if ((d instanceof DeclaracionPropia)) {
                    DeclaracionPropia dec_1 = ((DeclaracionPropia) d);
                    EList<Variable> _variable_2 = dec_1.getVariable();
                    for (final Variable v_3 : _variable_2) {
                      String _nombre_19 = r.getNombre();
                      Map<String, String> _get_2 = VaryGrammarGeneratorCPP.registros.get(_nombre_19);
                      String _nombre_20 = v_3.getNombre();
                      String _tipo_15 = dec_1.getTipo();
                      _get_2.put(_nombre_20, _tipo_15);
                    }
                  }
                }
              }
            } else {
              EClass _eClass_11 = t_1.eClass();
              String _name_11 = _eClass_11.getName();
              boolean _equals_11 = _name_11.equals("Archivo");
              if (_equals_11) {
                Archivo a = ((Archivo) t_1);
                String _nombre_21 = a.getNombre();
                VaryGrammarGeneratorCPP.archivos.add(_nombre_21);
              }
            }
          }
        }
      }
      ArrayList<Procedimiento> procedimientosUsados = new ArrayList<Procedimiento>();
      ArrayList<Funcion> funcionesUsadas = new ArrayList<Funcion>();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include <iostream>");
      _builder.newLine();
      _builder.append("#include <string>");
      _builder.newLine();
      _builder.append("#include <cmath>");
      _builder.newLine();
      _builder.append("#include \"");
      String _nombre_22 = myModulo.getNombre();
      _builder.append(_nombre_22, "");
      _builder.append(".h\"");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("using namespace std;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Instanciamos los modulos que vamos a usar");
      _builder.newLine();
      {
        EList<Modulo> _importaciones_1 = myModulo.getImportaciones();
        for(final Modulo myRefModulo : _importaciones_1) {
          String _nombre_23 = myRefModulo.getNombre();
          _builder.append(_nombre_23, "");
          _builder.append(" ref");
          String _nombre_24 = myRefModulo.getNombre();
          _builder.append(_nombre_24, "");
          _builder.append(" = ");
          String _nombre_25 = myRefModulo.getNombre();
          _builder.append(_nombre_25, "");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        Implementacion _implementacion_4 = myModulo.getImplementacion();
        EList<Constantes> _constantes = _implementacion_4.getConstantes();
        for(final Constantes myConstante : _constantes) {
          {
            EList<String> _exporta_constantes = myModulo.getExporta_constantes();
            Variable _variable_3 = myConstante.getVariable();
            String _nombre_26 = _variable_3.getNombre();
            boolean _contains = _exporta_constantes.contains(_nombre_26);
            boolean _not = (!_contains);
            if (_not) {
              CharSequence _generate = this.generate(myConstante);
              _builder.append(_generate, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      {
        Implementacion _implementacion_5 = myModulo.getImplementacion();
        EList<TipoComplejo> _tipocomplejo_2 = _implementacion_5.getTipocomplejo();
        for(final TipoComplejo myTipo : _tipocomplejo_2) {
          {
            EClass _eClass_12 = myTipo.eClass();
            String _name_12 = _eClass_12.getName();
            boolean _equals_12 = _name_12.equals("Vector");
            if (_equals_12) {
              Vector vector = ((Vector) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos = myModulo.getExporta_tipos();
                String _nombre_27 = vector.getNombre();
                boolean _contains_1 = _exporta_tipos.contains(_nombre_27);
                boolean _not_1 = (!_contains_1);
                if (_not_1) {
                  CharSequence _generate_1 = this.generate(vector);
                  _builder.append(_generate_1, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_13 = myTipo.eClass();
            String _name_13 = _eClass_13.getName();
            boolean _equals_13 = _name_13.equals("Matriz");
            if (_equals_13) {
              Matriz matriz = ((Matriz) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_1 = myModulo.getExporta_tipos();
                String _nombre_28 = matriz.getNombre();
                boolean _contains_2 = _exporta_tipos_1.contains(_nombre_28);
                boolean _not_2 = (!_contains_2);
                if (_not_2) {
                  CharSequence _generate_2 = this.generate(matriz);
                  _builder.append(_generate_2, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_14 = myTipo.eClass();
            String _name_14 = _eClass_14.getName();
            boolean _equals_14 = _name_14.equals("Registro");
            if (_equals_14) {
              Registro registro = ((Registro) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_2 = myModulo.getExporta_tipos();
                String _nombre_29 = registro.getNombre();
                boolean _contains_3 = _exporta_tipos_2.contains(_nombre_29);
                boolean _not_3 = (!_contains_3);
                if (_not_3) {
                  CharSequence _generate_3 = this.generate(registro);
                  _builder.append(_generate_3, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_15 = myTipo.eClass();
            String _name_15 = _eClass_15.getName();
            boolean _equals_15 = _name_15.equals("Archivo");
            if (_equals_15) {
              Archivo archivo = ((Archivo) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_3 = myModulo.getExporta_tipos();
                String _nombre_30 = archivo.getNombre();
                boolean _contains_4 = _exporta_tipos_3.contains(_nombre_30);
                boolean _not_4 = (!_contains_4);
                if (_not_4) {
                  CharSequence _generate_4 = this.generate(archivo);
                  _builder.append(_generate_4, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_16 = myTipo.eClass();
            String _name_16 = _eClass_16.getName();
            boolean _equals_16 = _name_16.equals("Enumerado");
            if (_equals_16) {
              Enumerado enumerado_1 = ((Enumerado) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_4 = myModulo.getExporta_tipos();
                String _nombre_31 = enumerado_1.getNombre();
                boolean _contains_5 = _exporta_tipos_4.contains(_nombre_31);
                boolean _not_5 = (!_contains_5);
                if (_not_5) {
                  CharSequence _generate_5 = this.generate(enumerado_1);
                  _builder.append(_generate_5, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_17 = myTipo.eClass();
            String _name_17 = _eClass_17.getName();
            boolean _equals_17 = _name_17.equals("Subrango");
            if (_equals_17) {
              Subrango subrango = ((Subrango) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_5 = myModulo.getExporta_tipos();
                String _nombre_32 = subrango.getNombre();
                boolean _contains_6 = _exporta_tipos_5.contains(_nombre_32);
                boolean _not_6 = (!_contains_6);
                if (_not_6) {
                  CharSequence _generate_6 = this.generate(subrango);
                  _builder.append(_generate_6, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("//Metodos publicos");
      _builder.newLine();
      _builder.newLine();
      {
        EList<CabeceraSubproceso> _exporta_funciones_1 = myModulo.getExporta_funciones();
        for(final CabeceraSubproceso exportaCabecera : _exporta_funciones_1) {
          {
            Implementacion _implementacion_6 = myModulo.getImplementacion();
            EList<Subproceso> _funcion_2 = _implementacion_6.getFuncion();
            for(final Subproceso mySubproceso : _funcion_2) {
              {
                EClass _eClass_18 = mySubproceso.eClass();
                String _name_18 = _eClass_18.getName();
                boolean _equals_18 = _name_18.equals("Procedimiento");
                if (_equals_18) {
                  Procedimiento procedimiento_1 = ((Procedimiento) mySubproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    if ((myModulo.getExporta_funciones().contains(procedimiento_1.getNombre()) && (procedimiento_1.getParametrofuncion().size() == exportaCabecera.getParametrofuncion().size()))) {
                      String _nombre_33 = this.modulo.getNombre();
                      String _generate_7 = this.generate(procedimiento_1, _nombre_33);
                      _builder.append(_generate_7, "");
                      _builder.newLineIfNotEmpty();
                      this.addProcedimiento(procedimiento_1, procedimientosUsados);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              {
                EClass _eClass_19 = mySubproceso.eClass();
                String _name_19 = _eClass_19.getName();
                boolean _equals_19 = _name_19.equals("Funcion");
                if (_equals_19) {
                  Funcion funcion_1 = ((Funcion) mySubproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    if ((myModulo.getExporta_funciones().contains(funcion_1.getNombre()) && (funcion_1.getParametrofuncion().size() == exportaCabecera.getParametrofuncion().size()))) {
                      String _nombre_34 = this.modulo.getNombre();
                      String _generate_8 = this.generate(funcion_1, _nombre_34);
                      _builder.append(_generate_8, "");
                      _builder.newLineIfNotEmpty();
                      this.addFuncion(funcion_1, funcionesUsadas);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
          }
        }
      }
      _builder.newLine();
      _builder.append("//Metodos privados");
      _builder.newLine();
      _builder.newLine();
      {
        Implementacion _implementacion_7 = myModulo.getImplementacion();
        EList<Subproceso> _funcion_3 = _implementacion_7.getFuncion();
        for(final Subproceso mySubproceso_1 : _funcion_3) {
          {
            EClass _eClass_20 = mySubproceso_1.eClass();
            String _name_20 = _eClass_20.getName();
            boolean _equals_20 = _name_20.equals("Procedimiento");
            if (_equals_20) {
              Procedimiento procedimiento_2 = ((Procedimiento) mySubproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_7 = procedimientosUsados.contains(procedimiento_2);
                boolean _not_7 = (!_contains_7);
                if (_not_7) {
                  String _nombre_35 = this.modulo.getNombre();
                  String _generateStatic = this.generateStatic(procedimiento_2, _nombre_35);
                  _builder.append(_generateStatic, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_21 = mySubproceso_1.eClass();
            String _name_21 = _eClass_21.getName();
            boolean _equals_21 = _name_21.equals("Funcion");
            if (_equals_21) {
              Funcion funcion_2 = ((Funcion) mySubproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_8 = funcionesUsadas.contains(funcion_2);
                boolean _not_8 = (!_contains_8);
                if (_not_8) {
                  String _nombre_36 = this.modulo.getNombre();
                  String _generateStatic_1 = this.generateStatic(funcion_2, _nombre_36);
                  _builder.append(_generateStatic_1, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generate(final Algoritmo myAlgoritmo) {
    CharSequence _xblockexpression = null;
    {
      this.algoritmo = myAlgoritmo;
      EList<TipoComplejo> _tipocomplejo = this.algoritmo.getTipocomplejo();
      for (final TipoComplejo t : _tipocomplejo) {
        if ((t instanceof Enumerado)) {
          Enumerado enumerado = ((Enumerado) t);
          String _nombre = enumerado.getNombre();
          ArrayList<String> _arrayList = new ArrayList<String>();
          VaryGrammarGeneratorCPP.variablesEnumerados.put(_nombre, _arrayList);
          String _nombre_1 = enumerado.getNombre();
          VaryGrammarGeneratorCPP.enumerados.add(_nombre_1);
          EList<operacion> _valor = enumerado.getValor();
          for (final valor v : _valor) {
            if ((v instanceof Operador)) {
              Operador v2 = ((Operador) v);
              if ((v2 instanceof VariableID)) {
                VariableID aux = ((VariableID) v2);
                String _nombre_2 = enumerado.getNombre();
                ArrayList<String> _get = VaryGrammarGeneratorCPP.variablesEnumerados.get(_nombre_2);
                String _nombre_3 = aux.getNombre();
                _get.add(_nombre_3);
              }
            }
          }
        }
      }
      EList<Subproceso> _funcion = this.algoritmo.getFuncion();
      for (final Subproceso s : _funcion) {
        EClass _eClass = s.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Funcion");
        if (_equals) {
          Funcion funcion = new FuncionImpl();
          funcion = ((Funcion) s);
          String _nombre_4 = funcion.getNombre();
          String _tipo = funcion.getTipo();
          VaryGrammarGeneratorCPP.funciones.put(_nombre_4, _tipo);
          String _nombre_5 = funcion.getNombre();
          ArrayList<Integer> _arrayList_1 = new ArrayList<Integer>();
          VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_5, _arrayList_1);
          int numParametro = 1;
          EList<ParametroFuncion> _parametrofuncion = funcion.getParametrofuncion();
          for (final ParametroFuncion parametro : _parametrofuncion) {
            {
              if ((parametro.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro.getTipo() instanceof TipoExistente))) {
                String _nombre_6 = funcion.getNombre();
                ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_6);
                _get_1.add(Integer.valueOf(numParametro));
              } else {
                if ((parametro.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro.getTipo() instanceof TipoExistente))) {
                  String _nombre_7 = funcion.getNombre();
                  ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_7);
                  _get_2.add(Integer.valueOf(numParametro));
                }
              }
              numParametro = (numParametro + 1);
            }
          }
        } else {
          EClass _eClass_1 = s.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Procedimiento");
          if (_equals_1) {
            Procedimiento procedimiento = new ProcedimientoImpl();
            procedimiento = ((Procedimiento) s);
            String _nombre_6 = procedimiento.getNombre();
            VaryGrammarGeneratorCPP.funciones.put(_nombre_6, "void");
            String _nombre_7 = procedimiento.getNombre();
            ArrayList<Integer> _arrayList_2 = new ArrayList<Integer>();
            VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_7, _arrayList_2);
            int numParametro_1 = 1;
            EList<ParametroFuncion> _parametrofuncion_1 = procedimiento.getParametrofuncion();
            for (final ParametroFuncion parametro_1 : _parametrofuncion_1) {
              {
                if ((parametro_1.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_1.getTipo() instanceof TipoExistente))) {
                  String _nombre_8 = procedimiento.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_8);
                  _get_1.add(Integer.valueOf(numParametro_1));
                } else {
                  if ((parametro_1.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_1.getTipo() instanceof TipoExistente))) {
                    String _nombre_9 = procedimiento.getNombre();
                    ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_9);
                    _get_2.add(Integer.valueOf(numParametro_1));
                  }
                }
                numParametro_1 = (numParametro_1 + 1);
              }
            }
          }
        }
      }
      EList<Modulo> _importaciones = this.algoritmo.getImportaciones();
      for (final Modulo m : _importaciones) {
        EList<CabeceraSubproceso> _exporta_funciones = m.getExporta_funciones();
        for (final CabeceraSubproceso cabecera : _exporta_funciones) {
          EClass _eClass_2 = cabecera.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_2 = _name_2.equals("CabeceraFuncion");
          if (_equals_2) {
            CabeceraFuncion cabeceraFuncion = new CabeceraFuncionImpl();
            cabeceraFuncion = ((CabeceraFuncion) cabecera);
            String _nombre_8 = cabeceraFuncion.getNombre();
            String _tipo_1 = cabeceraFuncion.getTipo();
            VaryGrammarGeneratorCPP.funciones.put(_nombre_8, _tipo_1);
            String _nombre_9 = cabeceraFuncion.getNombre();
            ArrayList<Integer> _arrayList_3 = new ArrayList<Integer>();
            VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_9, _arrayList_3);
            int numParametro_2 = 1;
            EList<ParametroFuncion> _parametrofuncion_2 = cabeceraFuncion.getParametrofuncion();
            for (final ParametroFuncion parametro_2 : _parametrofuncion_2) {
              {
                if ((parametro_2.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_2.getTipo() instanceof TipoExistente))) {
                  String _nombre_10 = cabeceraFuncion.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_10);
                  _get_1.add(Integer.valueOf(numParametro_2));
                }
                if ((parametro_2.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_2.getTipo() instanceof TipoExistente))) {
                  String _nombre_11 = cabeceraFuncion.getNombre();
                  ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_11);
                  _get_2.add(Integer.valueOf(numParametro_2));
                }
                numParametro_2 = (numParametro_2 + 1);
              }
            }
          } else {
            EClass _eClass_3 = cabecera.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("CabeceraProcedimiento");
            if (_equals_3) {
              CabeceraProcedimiento cabeceraProcedimiento = new CabeceraProcedimientoImpl();
              cabeceraProcedimiento = ((CabeceraProcedimiento) cabecera);
              String _nombre_10 = cabeceraProcedimiento.getNombre();
              VaryGrammarGeneratorCPP.funciones.put(_nombre_10, "void");
              String _nombre_11 = cabeceraProcedimiento.getNombre();
              ArrayList<Integer> _arrayList_4 = new ArrayList<Integer>();
              VaryGrammarGeneratorCPP.subprocesosConPunteros.put(_nombre_11, _arrayList_4);
              int numParametro_3 = 1;
              EList<ParametroFuncion> _parametrofuncion_3 = cabeceraProcedimiento.getParametrofuncion();
              for (final ParametroFuncion parametro_3 : _parametrofuncion_3) {
                {
                  if ((parametro_3.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametro_3.getTipo() instanceof TipoExistente))) {
                    String _nombre_12 = cabeceraProcedimiento.getNombre();
                    ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_12);
                    _get_1.add(Integer.valueOf(numParametro_3));
                  } else {
                    if ((parametro_3.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametro_3.getTipo() instanceof TipoExistente))) {
                      String _nombre_13 = cabeceraProcedimiento.getNombre();
                      ArrayList<Integer> _get_2 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_13);
                      _get_2.add(Integer.valueOf(numParametro_3));
                    }
                  }
                  numParametro_3 = (numParametro_3 + 1);
                }
              }
            }
          }
        }
      }
      Inicio _tiene = this.algoritmo.getTiene();
      EList<Declaracion> _declaracion = _tiene.getDeclaracion();
      for (final Declaracion d : _declaracion) {
        if ((d instanceof DeclaracionVariable)) {
          DeclaracionVariable dec = ((DeclaracionVariable) d);
          EList<Variable> _variable = dec.getVariable();
          for (final Variable v_1 : _variable) {
            String _nombre_12 = v_1.getNombre();
            String _tipo_2 = dec.getTipo();
            VaryGrammarGeneratorCPP.variablesInicio.put(_nombre_12, _tipo_2);
          }
        } else {
          if ((d instanceof DeclaracionPropia)) {
            DeclaracionPropia dec_1 = ((DeclaracionPropia) d);
            EList<Variable> _variable_1 = dec_1.getVariable();
            for (final Variable v_2 : _variable_1) {
              String _nombre_13 = v_2.getNombre();
              String _tipo_3 = dec_1.getTipo();
              VaryGrammarGeneratorCPP.variablesInicio.put(_nombre_13, _tipo_3);
            }
          }
        }
      }
      EList<Subproceso> _funcion_1 = this.algoritmo.getFuncion();
      for (final Subproceso s_1 : _funcion_1) {
        {
          String _nombre_14 = s_1.getNombre();
          HashMap<String, String> _hashMap = new HashMap<String, String>();
          VaryGrammarGeneratorCPP.variablesSubprocesos.put(_nombre_14, _hashMap);
          EList<Declaracion> _declaracion_1 = s_1.getDeclaracion();
          for (final Declaracion d_1 : _declaracion_1) {
            if ((d_1 instanceof DeclaracionVariable)) {
              DeclaracionVariable dec_2 = ((DeclaracionVariable) d_1);
              EList<Variable> _variable_2 = dec_2.getVariable();
              for (final Variable v_3 : _variable_2) {
                String _nombre_15 = s_1.getNombre();
                Map<String, String> _get_1 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_15);
                String _nombre_16 = v_3.getNombre();
                String _tipo_4 = dec_2.getTipo();
                _get_1.put(_nombre_16, _tipo_4);
              }
            } else {
              if ((d_1 instanceof DeclaracionPropia)) {
                DeclaracionPropia dec_3 = ((DeclaracionPropia) d_1);
                EList<Variable> _variable_3 = dec_3.getVariable();
                for (final Variable v_4 : _variable_3) {
                  String _nombre_17 = s_1.getNombre();
                  Map<String, String> _get_2 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_17);
                  String _nombre_18 = v_4.getNombre();
                  String _tipo_5 = dec_3.getTipo();
                  _get_2.put(_nombre_18, _tipo_5);
                }
              }
            }
          }
          EList<ParametroFuncion> _parametrofuncion_4 = s_1.getParametrofuncion();
          for (final ParametroFuncion p : _parametrofuncion_4) {
            Tipo _tipo_6 = p.getTipo();
            EClass _eClass_4 = _tipo_6.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("TipoExistente");
            if (_equals_4) {
              Tipo _tipo_7 = p.getTipo();
              TipoExistente tipo = ((TipoExistente) _tipo_7);
              String _nombre_19 = s_1.getNombre();
              Map<String, String> _get_3 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_19);
              Variable _variable_4 = p.getVariable();
              String _nombre_20 = _variable_4.getNombre();
              String _tipo_8 = tipo.getTipo();
              _get_3.put(_nombre_20, _tipo_8);
            } else {
              Tipo _tipo_9 = p.getTipo();
              EClass _eClass_5 = _tipo_9.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("TipoDefinido");
              if (_equals_5) {
                Tipo _tipo_10 = p.getTipo();
                TipoDefinido tipo_1 = ((TipoDefinido) _tipo_10);
                String _nombre_21 = s_1.getNombre();
                Map<String, String> _get_4 = VaryGrammarGeneratorCPP.variablesSubprocesos.get(_nombre_21);
                Variable _variable_5 = p.getVariable();
                String _nombre_22 = _variable_5.getNombre();
                String _tipo_11 = tipo_1.getTipo();
                _get_4.put(_nombre_22, _tipo_11);
              }
            }
          }
        }
      }
      EList<TipoComplejo> _tipocomplejo_1 = this.algoritmo.getTipocomplejo();
      for (final TipoComplejo t_1 : _tipocomplejo_1) {
        EClass _eClass_4 = t_1.eClass();
        String _name_4 = _eClass_4.getName();
        boolean _equals_4 = _name_4.equals("Vector");
        if (_equals_4) {
          Vector v_3 = ((Vector) t_1);
          Tipo _tipo_4 = v_3.getTipo();
          EClass _eClass_5 = _tipo_4.eClass();
          String _name_5 = _eClass_5.getName();
          boolean _equals_5 = _name_5.equals("TipoExistente");
          if (_equals_5) {
            Tipo _tipo_5 = v_3.getTipo();
            TipoExistente tipo = ((TipoExistente) _tipo_5);
            String _nombre_14 = v_3.getNombre();
            String _tipo_6 = tipo.getTipo();
            VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_14, _tipo_6);
          } else {
            Tipo _tipo_7 = v_3.getTipo();
            EClass _eClass_6 = _tipo_7.eClass();
            String _name_6 = _eClass_6.getName();
            boolean _equals_6 = _name_6.equals("TipoDefinido");
            if (_equals_6) {
              Tipo _tipo_8 = v_3.getTipo();
              TipoDefinido tipo_1 = ((TipoDefinido) _tipo_8);
              String _nombre_15 = v_3.getNombre();
              String _tipo_9 = tipo_1.getTipo();
              VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_15, _tipo_9);
            }
          }
        } else {
          EClass _eClass_7 = t_1.eClass();
          String _name_7 = _eClass_7.getName();
          boolean _equals_7 = _name_7.equals("Matriz");
          if (_equals_7) {
            Matriz m_1 = ((Matriz) t_1);
            Tipo _tipo_10 = m_1.getTipo();
            EClass _eClass_8 = _tipo_10.eClass();
            String _name_8 = _eClass_8.getName();
            boolean _equals_8 = _name_8.equals("TipoExistente");
            if (_equals_8) {
              Tipo _tipo_11 = m_1.getTipo();
              TipoExistente tipo_2 = ((TipoExistente) _tipo_11);
              String _nombre_16 = m_1.getNombre();
              String _tipo_12 = tipo_2.getTipo();
              VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_16, _tipo_12);
            } else {
              Tipo _tipo_13 = m_1.getTipo();
              EClass _eClass_9 = _tipo_13.eClass();
              String _name_9 = _eClass_9.getName();
              boolean _equals_9 = _name_9.equals("TipoDefinido");
              if (_equals_9) {
                Tipo _tipo_14 = m_1.getTipo();
                TipoDefinido tipo_3 = ((TipoDefinido) _tipo_14);
                String _nombre_17 = m_1.getNombre();
                String _tipo_15 = tipo_3.getTipo();
                VaryGrammarGeneratorCPP.vectoresMatrices.put(_nombre_17, _tipo_15);
              }
            }
          } else {
            EClass _eClass_10 = t_1.eClass();
            String _name_10 = _eClass_10.getName();
            boolean _equals_10 = _name_10.equals("Registro");
            if (_equals_10) {
              Registro r = ((Registro) t_1);
              String _nombre_18 = r.getNombre();
              HashMap<String, String> _hashMap = new HashMap<String, String>();
              VaryGrammarGeneratorCPP.registros.put(_nombre_18, _hashMap);
              EList<Declaracion> _variable_2 = r.getVariable();
              for (final Declaracion d_1 : _variable_2) {
                if ((d_1 instanceof DeclaracionVariable)) {
                  DeclaracionVariable dec_2 = ((DeclaracionVariable) d_1);
                  EList<Variable> _variable_3 = dec_2.getVariable();
                  for (final Variable v_4 : _variable_3) {
                    String _nombre_19 = r.getNombre();
                    Map<String, String> _get_1 = VaryGrammarGeneratorCPP.registros.get(_nombre_19);
                    String _nombre_20 = v_4.getNombre();
                    String _tipo_16 = dec_2.getTipo();
                    _get_1.put(_nombre_20, _tipo_16);
                  }
                } else {
                  if ((d_1 instanceof DeclaracionPropia)) {
                    DeclaracionPropia dec_3 = ((DeclaracionPropia) d_1);
                    EList<Variable> _variable_4 = dec_3.getVariable();
                    for (final Variable v_5 : _variable_4) {
                      String _nombre_21 = r.getNombre();
                      Map<String, String> _get_2 = VaryGrammarGeneratorCPP.registros.get(_nombre_21);
                      String _nombre_22 = v_5.getNombre();
                      String _tipo_17 = dec_3.getTipo();
                      _get_2.put(_nombre_22, _tipo_17);
                    }
                  }
                }
              }
            } else {
              EClass _eClass_11 = t_1.eClass();
              String _name_11 = _eClass_11.getName();
              boolean _equals_11 = _name_11.equals("Archivo");
              if (_equals_11) {
                Archivo a = ((Archivo) t_1);
                String _nombre_23 = a.getNombre();
                VaryGrammarGeneratorCPP.archivos.add(_nombre_23);
              }
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include <iostream>");
      _builder.newLine();
      _builder.append("#include <string>");
      _builder.newLine();
      _builder.append("#include <cmath>");
      _builder.newLine();
      {
        if (VaryGrammarGeneratorCPP.cabeceras) {
          _builder.append("#include \"");
          String _nombre_24 = this.algoritmo.getNombre();
          _builder.append(_nombre_24, "");
          _builder.append(".h\"\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        if ((!VaryGrammarGeneratorCPP.cabeceras)) {
          {
            EList<Modulo> _importaciones_1 = this.algoritmo.getImportaciones();
            for(final Modulo myRefModulo : _importaciones_1) {
              _builder.append("#include \"");
              String _nombre_25 = myRefModulo.getNombre();
              _builder.append(_nombre_25, "");
              _builder.append(".h\"");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("using namespace std;");
          _builder.newLine();
        }
      }
      _builder.newLine();
      _builder.append("//Instanciamos los modulos que vamos a usar");
      _builder.newLine();
      {
        EList<Modulo> _importaciones_2 = this.algoritmo.getImportaciones();
        for(final Modulo myRefModulo_1 : _importaciones_2) {
          String _nombre_26 = myRefModulo_1.getNombre();
          _builder.append(_nombre_26, "");
          _builder.append(" ref");
          String _nombre_27 = myRefModulo_1.getNombre();
          _builder.append(_nombre_27, "");
          _builder.append(" = ");
          String _nombre_28 = myRefModulo_1.getNombre();
          _builder.append(_nombre_28, "");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<Comentario> _comentarios = myAlgoritmo.getComentarios();
        for(final Comentario myComentario : _comentarios) {
          CharSequence _generate = this.generate(myComentario);
          _builder.append(_generate, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if ((!VaryGrammarGeneratorCPP.cabeceras)) {
          {
            EList<Constantes> _constantes = myAlgoritmo.getConstantes();
            for(final Constantes myConstante : _constantes) {
              CharSequence _generate_1 = this.generate(myConstante);
              _builder.append(_generate_1, "");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            EList<TipoComplejo> _tipocomplejo_2 = myAlgoritmo.getTipocomplejo();
            for(final TipoComplejo myComplejo : _tipocomplejo_2) {
              CharSequence _generate_2 = this.generate(myComplejo);
              _builder.append(_generate_2, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        EList<Declaracion> _global = myAlgoritmo.getGlobal();
        for(final Declaracion myVariable : _global) {
          CharSequence _generate_3 = this.generate(myVariable);
          _builder.append(_generate_3, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<Subproceso> _funcion_2 = myAlgoritmo.getFuncion();
        for(final Subproceso funcion_1 : _funcion_2) {
          CharSequence _generate_4 = this.generate(funcion_1);
          _builder.append(_generate_4, "");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      Inicio _tiene_1 = myAlgoritmo.getTiene();
      CharSequence _generate_5 = this.generate(_tiene_1);
      _builder.append(_generate_5, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generate(final TipoComplejo myComplejo) {
    CharSequence _xifexpression = null;
    EClass _eClass = myComplejo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Vector");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        Vector prueba = new VectorImpl();
        prueba = ((Vector) myComplejo);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myComplejo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Matriz");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          Matriz prueba = new MatrizImpl();
          prueba = ((Matriz) myComplejo);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = myComplejo.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("Registro");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            Registro prueba = new RegistroImpl();
            prueba = ((Registro) myComplejo);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = myComplejo.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("Archivo");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              Archivo prueba = new ArchivoImpl();
              prueba = ((Archivo) myComplejo);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = myComplejo.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Enumerado");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Enumerado prueba = new EnumeradoImpl();
                prueba = ((Enumerado) myComplejo);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = myComplejo.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("SubrangoNumerico");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  SubrangoNumerico prueba = new SubrangoNumericoImpl();
                  prueba = ((SubrangoNumerico) myComplejo);
                  _xblockexpression_5 = this.generate(prueba);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = myComplejo.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("SubrangoEnumerado");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    SubrangoEnumerado prueba = new SubrangoEnumeradoImpl();
                    prueba = ((SubrangoEnumerado) myComplejo);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final Tipo myTipo) {
    CharSequence _xifexpression = null;
    EClass _eClass = myTipo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("TipoDefinido");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        TipoDefinido prueba = new TipoDefinidoImpl();
        prueba = ((TipoDefinido) myTipo);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myTipo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("TipoExistente");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          TipoExistente prueba = new TipoExistenteImpl();
          prueba = ((TipoExistente) myTipo);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final TipoExistente myTipo) {
    String _tipo = myTipo.getTipo();
    return this.tipoVariableCpp(_tipo);
  }
  
  @Override
  public CharSequence generate(final Comentario myComentario) {
    StringConcatenation _builder = new StringConcatenation();
    String _mensaje = myComentario.getMensaje();
    _builder.append(_mensaje, "");
    return _builder;
  }
  
  @Override
  public CharSequence generate(final TipoDefinido myTipo) {
    return myTipo.getTipo();
  }
  
  @Override
  public CharSequence generate(final Constantes myConstante) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#define ");
    Variable _variable = myConstante.getVariable();
    String _nombre = _variable.getNombre();
    _builder.append(_nombre, "");
    _builder.append("  ");
    operacion _valor = myConstante.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Vector myVector) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef ");
    Tipo _tipo = myVector.getTipo();
    CharSequence _generate = this.generate(_tipo);
    _builder.append(_generate, "");
    _builder.append(" ");
    String _nombre = myVector.getNombre();
    _builder.append(_nombre, "");
    _builder.append("[");
    operacion _valor = myVector.getValor();
    CharSequence _generate_1 = this.generate(_valor);
    _builder.append(_generate_1, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Matriz myMatriz) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef ");
    Tipo _tipo = myMatriz.getTipo();
    CharSequence _generate = this.generate(_tipo);
    _builder.append(_generate, "");
    _builder.append(" ");
    String _nombre = myMatriz.getNombre();
    _builder.append(_nombre, "");
    _builder.append("[");
    EList<operacion> _valor = myMatriz.getValor();
    operacion _get = _valor.get(0);
    CharSequence _generate_1 = this.generate(_get);
    _builder.append(_generate_1, "");
    _builder.append("][");
    EList<operacion> _valor_1 = myMatriz.getValor();
    operacion _get_1 = _valor_1.get(1);
    CharSequence _generate_2 = this.generate(_get_1);
    _builder.append(_generate_2, "");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Registro myRegistro) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef struct {");
    _builder.newLine();
    {
      EList<Declaracion> _variable = myRegistro.getVariable();
      for(final Declaracion myVariable : _variable) {
        _builder.append("\t");
        CharSequence _generate = this.generate(myVariable);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("} ");
    String _nombre = myRegistro.getNombre();
    _builder.append(_nombre, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Archivo myArchivo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef FILE *");
    String _nombre = myArchivo.getNombre();
    _builder.append(_nombre, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Enumerado myEnumerado) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef enum {");
    {
      EList<operacion> _valor = myEnumerado.getValor();
      for(final operacion myVariable : _valor) {
        {
          EList<operacion> _valor_1 = myEnumerado.getValor();
          EList<operacion> _valor_2 = myEnumerado.getValor();
          int _size = _valor_2.size();
          int _minus = (_size - 1);
          operacion _get = _valor_1.get(_minus);
          boolean _equals = Objects.equal(myVariable, _get);
          if (_equals) {
            CharSequence _generate = this.generate(myVariable);
            _builder.append(_generate, "");
          } else {
            CharSequence _generate_1 = this.generate(myVariable);
            _builder.append(_generate_1, "");
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append("} ");
    String _nombre = myEnumerado.getNombre();
    _builder.append(_nombre, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final SubrangoNumerico mySubrango) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef enum {");
    int _limite_inf = mySubrango.getLimite_inf();
    int _limite_sup = mySubrango.getLimite_sup();
    String _generaSubrango = this.generaSubrango(_limite_inf, _limite_sup);
    _builder.append(_generaSubrango, "");
    _builder.append("} ");
    String _nombre = mySubrango.getNombre();
    _builder.append(_nombre, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final SubrangoEnumerado mySubrango) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("typedef enum {");
    String _limite_inf = mySubrango.getLimite_inf();
    String _limite_sup = mySubrango.getLimite_sup();
    String _generaSubrangoEnumerado = this.generaSubrangoEnumerado(_limite_inf, _limite_sup);
    _builder.append(_generaSubrangoEnumerado, "");
    _builder.append("} ");
    String _nombre = mySubrango.getNombre();
    _builder.append(_nombre, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String obtenerModo(final String modo) {
    boolean _equals = Objects.equal(modo, "escritura");
    if (_equals) {
      return "w";
    } else {
      boolean _equals_1 = Objects.equal(modo, "lectura");
      if (_equals_1) {
        return "r";
      }
    }
    return null;
  }
  
  @Override
  public CharSequence generate(final FuncionFicheroAbrir myFuncionFicheroAbrir) {
    StringConcatenation _builder = new StringConcatenation();
    EList<operacion> _variable = myFuncionFicheroAbrir.getVariable();
    operacion _get = _variable.get(0);
    CharSequence _generate = this.generate(_get);
    _builder.append(_generate, "");
    _builder.append(" = fopen(");
    EList<operacion> _variable_1 = myFuncionFicheroAbrir.getVariable();
    operacion _get_1 = _variable_1.get(1);
    CharSequence _generate_1 = this.generate(_get_1);
    _builder.append(_generate_1, "");
    _builder.append(",\"");
    ModoApertura _modo = myFuncionFicheroAbrir.getModo();
    String _name = _modo.getName();
    String _obtenerModo = this.obtenerModo(_name);
    _builder.append(_obtenerModo, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final FuncionFicheroCerrar myFuncionFicheroCerrar) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fclose(");
    operacion _variable = myFuncionFicheroCerrar.getVariable();
    CharSequence _generate = this.generate(_variable);
    _builder.append(_generate, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generaSubrango(final int limite_inf, final int limite_sup) {
    String concat = new String();
    int i = limite_inf;
    while ((i < limite_sup)) {
      {
        concat = (((concat + "numero") + Integer.valueOf(i)) + ", ");
        i = (i + 1);
      }
    }
    concat = ((concat + "numero") + Integer.valueOf(i));
    return concat;
  }
  
  public String generaSubrangoEnumerado(final String limite_inf, final String limite_sup) {
    String concat = new String();
    for (final String nombre : VaryGrammarGeneratorCPP.enumerados) {
      if ((VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre).contains(limite_inf) && VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre).contains(limite_sup))) {
        ArrayList<String> _get = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        int index_limite_inf = _get.indexOf(limite_inf);
        ArrayList<String> _get_1 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        int index_limite_sup = _get_1.indexOf(limite_sup);
        ArrayList<String> _get_2 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        List<String> sublista = _get_2.subList(index_limite_inf, index_limite_sup);
        for (final String aux : sublista) {
          concat = ((concat + aux) + ", ");
        }
        concat = (concat + limite_sup);
        return concat;
      }
    }
    return null;
  }
  
  @Override
  public CharSequence generate(final Inicio myInicio) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("int main(){");
    _builder.newLine();
    {
      EList<Declaracion> _declaracion = myInicio.getDeclaracion();
      for(final Declaracion myVariable : _declaracion) {
        _builder.append("\t");
        CharSequence _generate = this.generate(myVariable);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Sentencias> _tiene = myInicio.getTiene();
      for(final Sentencias mySentencia : _tiene) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(mySentencia);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Subproceso subp) {
    CharSequence _xifexpression = null;
    EClass _eClass = subp.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Funcion");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        Funcion prueba = new FuncionImpl();
        prueba = ((Funcion) subp);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = subp.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Procedimiento");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          Procedimiento prueba = new ProcedimientoImpl();
          prueba = ((Procedimiento) subp);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String tipoVariableCpp(final String tipo) {
    ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string = _bundle.getString("TIPO_ENTERO");
    boolean _equals = tipo.equals(_string);
    if (_equals) {
      return "int";
    }
    ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string_1 = _bundle_1.getString("TIPO_CARACTER");
    boolean _equals_1 = tipo.equals(_string_1);
    if (_equals_1) {
      return "char";
    }
    ResourceBundle _bundle_2 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string_2 = _bundle_2.getString("TIPO_REAL");
    boolean _equals_2 = tipo.equals(_string_2);
    if (_equals_2) {
      return "float";
    }
    ResourceBundle _bundle_3 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string_3 = _bundle_3.getString("TIPO_LOGICO");
    boolean _equals_3 = tipo.equals(_string_3);
    if (_equals_3) {
      return "bool";
    }
    ResourceBundle _bundle_4 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string_4 = _bundle_4.getString("TIPO_CADENA");
    boolean _equals_4 = tipo.equals(_string_4);
    if (_equals_4) {
      return "string";
    }
    return null;
  }
  
  @Override
  public CharSequence generate(final EList<ParametroFuncion> parametros) {
    String total = "";
    int actual = 1;
    for (final ParametroFuncion p : parametros) {
      {
        if ((actual != 1)) {
          total = (total + ", ");
        }
        String _paso = p.getPaso();
        ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string = _bundle.getString("TIPO_PASO_ENTRADA");
        boolean _equals = _paso.equals(_string);
        if (_equals) {
          Tipo _tipo = p.getTipo();
          CharSequence _generate = this.generate(_tipo);
          String _plus = ((total + "const ") + _generate);
          String _plus_1 = (_plus + " ");
          Variable _variable = p.getVariable();
          String _nombre = _variable.getNombre();
          String _plus_2 = (_plus_1 + _nombre);
          total = _plus_2;
        } else {
          if ((p.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (p.getTipo() instanceof TipoExistente))) {
            Tipo _tipo_1 = p.getTipo();
            CharSequence _generate_1 = this.generate(_tipo_1);
            String _plus_3 = (total + _generate_1);
            String _plus_4 = (_plus_3 + "* ");
            Variable _variable_1 = p.getVariable();
            String _nombre_1 = _variable_1.getNombre();
            String _plus_5 = (_plus_4 + _nombre_1);
            total = _plus_5;
          } else {
            if ((p.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (p.getTipo() instanceof TipoExistente))) {
              Tipo _tipo_2 = p.getTipo();
              CharSequence _generate_2 = this.generate(_tipo_2);
              String _plus_6 = (total + _generate_2);
              String _plus_7 = (_plus_6 + " *");
              Variable _variable_2 = p.getVariable();
              String _nombre_2 = _variable_2.getNombre();
              String _plus_8 = (_plus_7 + _nombre_2);
              total = _plus_8;
            } else {
              Tipo _tipo_3 = p.getTipo();
              CharSequence _generate_3 = this.generate(_tipo_3);
              String _plus_9 = (total + _generate_3);
              String _plus_10 = (_plus_9 + " ");
              Variable _variable_3 = p.getVariable();
              String _nombre_3 = _variable_3.getNombre();
              String _plus_11 = (_plus_10 + _nombre_3);
              total = _plus_11;
            }
          }
        }
        actual = (actual + 1);
      }
    }
    return total;
  }
  
  @Override
  public CharSequence generate(final Funcion myFun) {
    String _tipo = myFun.getTipo();
    String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
    String _plus = (_tipoVariableCpp + " ");
    String _nombre = myFun.getNombre();
    String _plus_1 = (_plus + _nombre);
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_2 = (_plus_1 + _generate);
    String _plus_3 = (_plus_2 + "){");
    String funcionDeclarada = (_plus_3 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      if ((parametroFuncion.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametroFuncion.getTipo() instanceof TipoExistente))) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        if ((parametroFuncion.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametroFuncion.getTipo() instanceof TipoExistente))) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_4 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_5 = (_plus_4 + "\n");
      funcionDeclarada = _plus_5;
    }
    int _size = punteros.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_6 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_7 = (_plus_6 + "\n");
        funcionDeclarada = _plus_7;
      }
      Devolver _devuelve = myFun.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        Devolver _devuelve_1 = myFun.getDevuelve();
        CharSequence _generate_3 = this.generate(_devuelve_1);
        String _plus_8 = ((funcionDeclarada + "\t") + _generate_3);
        String _plus_9 = (_plus_8 + "\n");
        funcionDeclarada = _plus_9;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_10 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_11 = (_plus_10 + "\n");
        funcionDeclarada = _plus_11;
      }
      Devolver _devuelve_2 = myFun.getDevuelve();
      boolean _notEquals_1 = (!Objects.equal(_devuelve_2, null));
      if (_notEquals_1) {
        Devolver _devuelve_3 = myFun.getDevuelve();
        CharSequence _generate_4 = this.generate(_devuelve_3, punteros);
        String _plus_12 = ((funcionDeclarada + "\t") + _generate_4);
        String _plus_13 = (_plus_12 + "\n");
        funcionDeclarada = _plus_13;
      }
    }
    funcionDeclarada = ((funcionDeclarada + "\n") + "}");
    return funcionDeclarada;
  }
  
  public String generate(final Funcion myFun, final String nombreModulo) {
    String _tipo = myFun.getTipo();
    String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
    String _plus = (_tipoVariableCpp + " ");
    String _plus_1 = (_plus + nombreModulo);
    String _plus_2 = (_plus_1 + "::");
    String _nombre = myFun.getNombre();
    String _plus_3 = (_plus_2 + _nombre);
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_4 = (_plus_3 + _generate);
    String _plus_5 = (_plus_4 + "){");
    String funcionDeclarada = (_plus_5 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      if ((parametroFuncion.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_ENTRADA_SALIDA")) && (parametroFuncion.getTipo() instanceof TipoExistente))) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        if ((parametroFuncion.getPaso().equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_PASO_SALIDA")) && (parametroFuncion.getTipo() instanceof TipoExistente))) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_6 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_7 = (_plus_6 + "\n");
      funcionDeclarada = _plus_7;
    }
    int _size = punteros.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_8 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_9 = (_plus_8 + "\n");
        funcionDeclarada = _plus_9;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_10 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_11 = (_plus_10 + "\n");
        funcionDeclarada = _plus_11;
      }
    }
    Devolver _devuelve = myFun.getDevuelve();
    boolean _notEquals = (!Objects.equal(_devuelve, null));
    if (_notEquals) {
      Devolver _devuelve_1 = myFun.getDevuelve();
      CharSequence _generate_3 = this.generate(_devuelve_1);
      String _plus_12 = ((funcionDeclarada + "\t") + _generate_3);
      String _plus_13 = (_plus_12 + "\n");
      funcionDeclarada = _plus_13;
    }
    funcionDeclarada = ((funcionDeclarada + "\n") + "}");
    return funcionDeclarada;
  }
  
  public String generateStatic(final Funcion myFun, final String nombreModulo) {
    String _tipo = myFun.getTipo();
    String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
    String _plus = (_tipoVariableCpp + " ");
    String _plus_1 = (_plus + nombreModulo);
    String _plus_2 = (_plus_1 + "::");
    String _nombre = myFun.getNombre();
    String _plus_3 = (_plus_2 + _nombre);
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_4 = (_plus_3 + _generate);
    String _plus_5 = (_plus_4 + "){");
    String funcionDeclarada = (_plus_5 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_ENTRADA_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        String _paso_1 = parametroFuncion.getPaso();
        ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
        boolean _equals_1 = _paso_1.equals(_string_1);
        if (_equals_1) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_6 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_7 = (_plus_6 + "\n");
      funcionDeclarada = _plus_7;
    }
    int _size = punteros.size();
    boolean _equals_2 = (_size == 0);
    if (_equals_2) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_8 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_9 = (_plus_8 + "\n");
        funcionDeclarada = _plus_9;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_10 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_11 = (_plus_10 + "\n");
        funcionDeclarada = _plus_11;
      }
    }
    Devolver _devuelve = myFun.getDevuelve();
    boolean _notEquals = (!Objects.equal(_devuelve, null));
    if (_notEquals) {
      Devolver _devuelve_1 = myFun.getDevuelve();
      CharSequence _generate_3 = this.generate(_devuelve_1);
      String _plus_12 = ((funcionDeclarada + "\t") + _generate_3);
      String _plus_13 = (_plus_12 + "\n");
      funcionDeclarada = _plus_13;
    }
    funcionDeclarada = ((funcionDeclarada + "\n") + "}");
    return funcionDeclarada;
  }
  
  @Override
  public CharSequence generate(final Procedimiento myProc) {
    String _nombre = myProc.getNombre();
    String _plus = ("void " + _nombre);
    EList<ParametroFuncion> _parametrofuncion = myProc.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_1 = (_plus + _generate);
    String _plus_2 = (_plus_1 + "){");
    String procedimientoDeclarado = (_plus_2 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myProc.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_ENTRADA_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        String _paso_1 = parametroFuncion.getPaso();
        ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
        boolean _equals_1 = _paso_1.equals(_string_1);
        if (_equals_1) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myProc.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_3 = ((procedimientoDeclarado + "\t") + _generate_1);
      String _plus_4 = (_plus_3 + "\n");
      procedimientoDeclarado = _plus_4;
    }
    int _size = punteros.size();
    boolean _equals_2 = (_size == 0);
    if (_equals_2) {
      EList<Sentencias> _sentencias = myProc.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_5 = ((procedimientoDeclarado + "\t") + _generate_2);
        String _plus_6 = (_plus_5 + "\n");
        procedimientoDeclarado = _plus_6;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myProc.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_7 = ((procedimientoDeclarado + "\t") + _generatePunteros);
        String _plus_8 = (_plus_7 + "\n");
        procedimientoDeclarado = _plus_8;
      }
    }
    procedimientoDeclarado = ((procedimientoDeclarado + "\n") + "}");
    return procedimientoDeclarado;
  }
  
  public String generate(final Procedimiento myProc, final String nombreModulo) {
    String _nombre = myProc.getNombre();
    String _plus = ((("void " + nombreModulo) + "::") + _nombre);
    String _plus_1 = (_plus + "(");
    EList<ParametroFuncion> _parametrofuncion = myProc.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_2 = (_plus_1 + _generate);
    String _plus_3 = (_plus_2 + "){");
    String procedimientoDeclarado = (_plus_3 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myProc.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_ENTRADA_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        String _paso_1 = parametroFuncion.getPaso();
        ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
        boolean _equals_1 = _paso_1.equals(_string_1);
        if (_equals_1) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myProc.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_4 = ((procedimientoDeclarado + "\t") + _generate_1);
      String _plus_5 = (_plus_4 + "\n");
      procedimientoDeclarado = _plus_5;
    }
    int _size = punteros.size();
    boolean _equals_2 = (_size == 0);
    if (_equals_2) {
      EList<Sentencias> _sentencias = myProc.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_6 = ((procedimientoDeclarado + "\t") + _generate_2);
        String _plus_7 = (_plus_6 + "\n");
        procedimientoDeclarado = _plus_7;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myProc.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_8 = ((procedimientoDeclarado + "\t") + _generatePunteros);
        String _plus_9 = (_plus_8 + "\n");
        procedimientoDeclarado = _plus_9;
      }
    }
    procedimientoDeclarado = ((procedimientoDeclarado + "\n") + "}");
    return procedimientoDeclarado;
  }
  
  public String generateStatic(final Procedimiento myProc, final String nombreModulo) {
    String _nombre = myProc.getNombre();
    String _plus = ((("void " + nombreModulo) + "::") + _nombre);
    String _plus_1 = (_plus + "(");
    EList<ParametroFuncion> _parametrofuncion = myProc.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_2 = (_plus_1 + _generate);
    String _plus_3 = (_plus_2 + "){");
    String procedimientoDeclarado = (_plus_3 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myProc.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_ENTRADA_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      } else {
        String _paso_1 = parametroFuncion.getPaso();
        ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
        String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
        boolean _equals_1 = _paso_1.equals(_string_1);
        if (_equals_1) {
          Variable _variable_1 = parametroFuncion.getVariable();
          String _nombre_2 = _variable_1.getNombre();
          punteros.add(_nombre_2);
        }
      }
    }
    EList<Declaracion> _declaracion = myProc.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_4 = ((procedimientoDeclarado + "\t") + _generate_1);
      String _plus_5 = (_plus_4 + "\n");
      procedimientoDeclarado = _plus_5;
    }
    int _size = punteros.size();
    boolean _equals_2 = (_size == 0);
    if (_equals_2) {
      EList<Sentencias> _sentencias = myProc.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_6 = ((procedimientoDeclarado + "\t") + _generate_2);
        String _plus_7 = (_plus_6 + "\n");
        procedimientoDeclarado = _plus_7;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myProc.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_8 = ((procedimientoDeclarado + "\t") + _generatePunteros);
        String _plus_9 = (_plus_8 + "\n");
        procedimientoDeclarado = _plus_9;
      }
    }
    procedimientoDeclarado = ((procedimientoDeclarado + "\n") + "}");
    return procedimientoDeclarado;
  }
  
  public CharSequence generatePunteros(final Sentencias mySent, final List<String> punteros) {
    CharSequence _xifexpression = null;
    EClass _eClass = mySent.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("AsignacionNormal");
    if (_equals) {
      String _xblockexpression = null;
      {
        AsignacionNormal prueba = new AsignacionNormalImpl();
        prueba = ((AsignacionNormal) mySent);
        _xblockexpression = this.generateAsignacionPunteros(prueba, punteros);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = mySent.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("AsignacionCompleja");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          AsignacionCompleja prueba = new AsignacionComplejaImpl();
          prueba = ((AsignacionCompleja) mySent);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = mySent.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("LlamadaFuncion");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            LlamadaFuncion prueba = new LlamadaFuncionImpl();
            prueba = ((LlamadaFuncion) mySent);
            _xblockexpression_2 = this.generate(prueba, true);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = mySent.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("Si");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              Si prueba = new SiImpl();
              prueba = ((Si) mySent);
              _xblockexpression_3 = this.generateSiPunteros(prueba, punteros);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = mySent.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("segun");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                segun prueba = new segunImpl();
                prueba = ((segun) mySent);
                _xblockexpression_4 = this.generateSegunPunteros(prueba, punteros);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = mySent.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("Caso");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  Caso prueba = new CasoImpl();
                  prueba = ((Caso) mySent);
                  _xblockexpression_5 = this.generateCasoPunteros(prueba, punteros);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = mySent.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("mientras");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    mientras prueba = new mientrasImpl();
                    prueba = ((mientras) mySent);
                    _xblockexpression_6 = this.generateMientrasPunteros(prueba, punteros);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = mySent.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("repetir");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      repetir prueba = new repetirImpl();
                      prueba = ((repetir) mySent);
                      _xblockexpression_7 = this.generateRepetirPunteros(prueba, punteros);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = mySent.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("desde");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        desde prueba = new desdeImpl();
                        prueba = ((desde) mySent);
                        _xblockexpression_8 = this.generateDesdePunteros(prueba, punteros);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = mySent.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("negacion");
                      if (_equals_9) {
                        _xifexpression_9 = null;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = mySent.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Leer");
                        if (_equals_10) {
                          String _xblockexpression_9 = null;
                          {
                            Leer prueba = new LeerImpl();
                            prueba = ((Leer) mySent);
                            _xblockexpression_9 = this.generateLeerPunteros(prueba, punteros);
                          }
                          _xifexpression_10 = _xblockexpression_9;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = mySent.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Escribir");
                          if (_equals_11) {
                            CharSequence _xblockexpression_10 = null;
                            {
                              Escribir prueba = new EscribirImpl();
                              prueba = ((Escribir) mySent);
                              _xblockexpression_10 = this.generateEscribirPunteros(prueba, punteros);
                            }
                            _xifexpression_11 = _xblockexpression_10;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = mySent.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("FuncionFicheroAbrir");
                            if (_equals_12) {
                              CharSequence _xblockexpression_11 = null;
                              {
                                FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl();
                                prueba = ((FuncionFicheroAbrir) mySent);
                                _xblockexpression_11 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_11;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = mySent.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("FuncionFicheroCerrar");
                              if (_equals_13) {
                                CharSequence _xblockexpression_12 = null;
                                {
                                  FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl();
                                  prueba = ((FuncionFicheroCerrar) mySent);
                                  _xblockexpression_12 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_12;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final Sentencias mySent) {
    CharSequence _xifexpression = null;
    EClass _eClass = mySent.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("AsignacionNormal");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        AsignacionNormal prueba = new AsignacionNormalImpl();
        prueba = ((AsignacionNormal) mySent);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = mySent.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("AsignacionCompleja");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          AsignacionCompleja prueba = new AsignacionComplejaImpl();
          prueba = ((AsignacionCompleja) mySent);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = mySent.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("LlamadaFuncion");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            LlamadaFuncion prueba = new LlamadaFuncionImpl();
            prueba = ((LlamadaFuncion) mySent);
            _xblockexpression_2 = this.generate(prueba, true);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = mySent.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("Si");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              Si prueba = new SiImpl();
              prueba = ((Si) mySent);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = mySent.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("segun");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                segun prueba = new segunImpl();
                prueba = ((segun) mySent);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = mySent.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("Caso");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  Caso prueba = new CasoImpl();
                  prueba = ((Caso) mySent);
                  _xblockexpression_5 = this.generate(prueba);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = mySent.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("mientras");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    mientras prueba = new mientrasImpl();
                    prueba = ((mientras) mySent);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = mySent.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("repetir");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      repetir prueba = new repetirImpl();
                      prueba = ((repetir) mySent);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = mySent.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("desde");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        desde prueba = new desdeImpl();
                        prueba = ((desde) mySent);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = mySent.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("Negacion");
                      if (_equals_9) {
                        _xifexpression_9 = null;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = mySent.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Leer");
                        if (_equals_10) {
                          CharSequence _xblockexpression_9 = null;
                          {
                            Leer prueba = new LeerImpl();
                            prueba = ((Leer) mySent);
                            _xblockexpression_9 = this.generate(prueba);
                          }
                          _xifexpression_10 = _xblockexpression_9;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = mySent.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Escribir");
                          if (_equals_11) {
                            CharSequence _xblockexpression_10 = null;
                            {
                              Escribir prueba = new EscribirImpl();
                              prueba = ((Escribir) mySent);
                              _xblockexpression_10 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_10;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = mySent.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("FuncionFicheroAbrir");
                            if (_equals_12) {
                              CharSequence _xblockexpression_11 = null;
                              {
                                FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl();
                                prueba = ((FuncionFicheroAbrir) mySent);
                                _xblockexpression_11 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_11;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = mySent.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("FuncionFicheroCerrar");
                              if (_equals_13) {
                                CharSequence _xblockexpression_12 = null;
                                {
                                  FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl();
                                  prueba = ((FuncionFicheroCerrar) mySent);
                                  _xblockexpression_12 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_12;
                              } else {
                                CharSequence _xifexpression_14 = null;
                                EClass _eClass_14 = mySent.eClass();
                                String _name_14 = _eClass_14.getName();
                                boolean _equals_14 = _name_14.equals("Internas");
                                if (_equals_14) {
                                  CharSequence _xblockexpression_13 = null;
                                  {
                                    Internas prueba = new InternasImpl();
                                    prueba = ((Internas) mySent);
                                    _xblockexpression_13 = this.generate(prueba, true);
                                  }
                                  _xifexpression_14 = _xblockexpression_13;
                                }
                                _xifexpression_13 = _xifexpression_14;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence pintarVariables(final EList<Variable> v) {
    StringConcatenation _builder = new StringConcatenation();
    Variable _get = v.get(0);
    String _nombre = _get.getNombre();
    _builder.append(_nombre, "");
    {
      Variable _get_1 = v.get(0);
      EList<String> _mat = _get_1.getMat();
      for(final String matri : _mat) {
        String _string = matri.toString();
        _builder.append(_string, "");
      }
    }
    {
      for(final Variable id : v) {
        {
          String _nombre_1 = id.getNombre();
          Variable _get_2 = v.get(0);
          String _nombre_2 = _get_2.getNombre();
          boolean _notEquals = (!Objects.equal(_nombre_1, _nombre_2));
          if (_notEquals) {
            _builder.append(", ");
            String _nombre_3 = id.getNombre();
            _builder.append(_nombre_3, "");
            {
              EList<String> _mat_1 = id.getMat();
              for(final String matri2 : _mat_1) {
                String _string_1 = matri2.toString();
                _builder.append(_string_1, "");
              }
            }
          }
        }
      }
    }
    _builder.append(";\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String pintarVariablesCadena(final EList<Variable> v) {
    Variable _get = v.get(0);
    String resultado = _get.getNombre();
    Variable _get_1 = v.get(0);
    EList<String> _mat = _get_1.getMat();
    for (final String matri : _mat) {
      String _string = matri.toString();
      String _plus = (resultado + _string);
      resultado = _plus;
    }
    for (final Variable id : v) {
      String _nombre = id.getNombre();
      Variable _get_2 = v.get(0);
      String _nombre_1 = _get_2.getNombre();
      boolean _notEquals = (!Objects.equal(_nombre, _nombre_1));
      if (_notEquals) {
        String _nombre_2 = id.getNombre();
        String _plus_1 = ((resultado + " ,") + _nombre_2);
        resultado = _plus_1;
        EList<String> _mat_1 = id.getMat();
        for (final String matri2 : _mat_1) {
          String _string_1 = matri2.toString();
          String _plus_2 = (resultado + _string_1);
          resultado = _plus_2;
        }
      }
    }
    return resultado;
  }
  
  @Override
  public CharSequence generate(final Declaracion myDec) {
    CharSequence _xifexpression = null;
    EClass _eClass = myDec.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("DeclaracionVariable");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        DeclaracionVariable prueba = new DeclaracionVariableImpl();
        prueba = ((DeclaracionVariable) myDec);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myDec.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("DeclaracionPropia");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          DeclaracionPropia prueba = new DeclaracionPropiaImpl();
          prueba = ((DeclaracionPropia) myDec);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final DeclaracionPropia myDec) {
    StringConcatenation _builder = new StringConcatenation();
    String _tipo = myDec.getTipo();
    _builder.append(_tipo, "");
    _builder.append(" ");
    EList<Variable> _variable = myDec.getVariable();
    CharSequence _pintarVariables = this.pintarVariables(_variable);
    _builder.append(_pintarVariables, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final DeclaracionVariable myDec) {
    StringConcatenation _builder = new StringConcatenation();
    String _tipo = myDec.getTipo();
    String _tipoVariableCpp = this.tipoVariableCpp(_tipo);
    _builder.append(_tipoVariableCpp, "");
    _builder.append(" ");
    EList<Variable> _variable = myDec.getVariable();
    CharSequence _pintarVariables = this.pintarVariables(_variable);
    _builder.append(_pintarVariables, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateAsignacionPunteros(final AsignacionNormal asig, final List<String> punteros) {
    String asignacion = new String();
    String _valor_asignacion = asig.getValor_asignacion();
    boolean _contains = punteros.contains(_valor_asignacion);
    if (_contains) {
      String _valor_asignacion_1 = asig.getValor_asignacion();
      String _plus = ("*(" + _valor_asignacion_1);
      String _plus_1 = (_plus + ")");
      asignacion = _plus_1;
    } else {
      String _valor_asignacion_2 = asig.getValor_asignacion();
      asignacion = _valor_asignacion_2;
    }
    EList<String> _mat = asig.getMat();
    for (final String matri : _mat) {
      String _string = matri.toString();
      String _plus_2 = (asignacion + _string);
      asignacion = _plus_2;
    }
    operacion _operador = asig.getOperador();
    Object _generate = this.generate(_operador, punteros);
    String _plus_3 = ((asignacion + " = ") + _generate);
    String _plus_4 = (_plus_3 + ";");
    asignacion = _plus_4;
    return asignacion;
  }
  
  @Override
  public CharSequence generate(final AsignacionNormal asig) {
    StringConcatenation _builder = new StringConcatenation();
    String _valor_asignacion = asig.getValor_asignacion();
    _builder.append(_valor_asignacion, "");
    {
      EList<String> _mat = asig.getMat();
      for(final String matri : _mat) {
        String _string = matri.toString();
        _builder.append(_string, "");
      }
    }
    _builder.append(" = ");
    operacion _operador = asig.getOperador();
    CharSequence _generate = this.generate(_operador);
    _builder.append(_generate, "");
    _builder.append(";");
    return _builder;
  }
  
  @Override
  public CharSequence generate(final AsignacionCompleja asig) {
    StringConcatenation _builder = new StringConcatenation();
    operacion _valor_asignacion = asig.getValor_asignacion();
    CharSequence _generate = this.generate(_valor_asignacion);
    String _string = _generate.toString();
    _builder.append(_string, "");
    _builder.append(" = ");
    operacion _operador = asig.getOperador();
    CharSequence _generate_1 = this.generate(_operador);
    String _string_1 = _generate_1.toString();
    _builder.append(_string_1, "");
    _builder.append(";");
    return _builder;
  }
  
  @Override
  public CharSequence generate(final ValorComplejo myComplejo) {
    CharSequence _xifexpression = null;
    EClass _eClass = myComplejo.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("ValorRegistro");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        ValorRegistro prueba = new ValorRegistroImpl();
        prueba = ((ValorRegistro) myComplejo);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myComplejo.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("ValorVector");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          ValorVector prueba = new ValorVectorImpl();
          prueba = ((ValorVector) myComplejo);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = myComplejo.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorMatriz");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorMatriz prueba = new ValorMatrizImpl();
            prueba = ((ValorMatriz) myComplejo);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final ValorRegistro myValor) {
    String concat = new String();
    String _nombre_registro = myValor.getNombre_registro();
    String _string = _nombre_registro.toString();
    String _plus = (_string + ".");
    concat = _plus;
    EList<CampoRegistro> _campo = myValor.getCampo();
    for (final CampoRegistro myVariable : _campo) {
      EList<CampoRegistro> _campo_1 = myValor.getCampo();
      int _indexOf = _campo_1.indexOf(myVariable);
      EList<CampoRegistro> _campo_2 = myValor.getCampo();
      int _size = _campo_2.size();
      int _minus = (_size - 1);
      boolean _equals = (_indexOf == _minus);
      if (_equals) {
        CharSequence _generate = this.generate(myVariable);
        String _string_1 = _generate.toString();
        String _plus_1 = (concat + _string_1);
        concat = _plus_1;
      } else {
        CharSequence _generate_1 = this.generate(myVariable);
        String _string_2 = _generate_1.toString();
        String _plus_2 = (concat + _string_2);
        String _plus_3 = (_plus_2 + ".");
        concat = _plus_3;
      }
    }
    return concat;
  }
  
  @Override
  public CharSequence generate(final ValorVector myValor) {
    String concat = new String();
    EList<CampoRegistro> _campo = myValor.getCampo();
    int _size = _campo.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _nombre_vector = myValor.getNombre_vector();
      String _string = _nombre_vector.toString();
      String _plus = (_string + "[");
      operacion _indice = myValor.getIndice();
      CharSequence _generate = this.generate(_indice);
      String _plus_1 = (_plus + _generate);
      String _plus_2 = (_plus_1 + "]");
      concat = _plus_2;
    } else {
      String _nombre_vector_1 = myValor.getNombre_vector();
      String _string_1 = _nombre_vector_1.toString();
      String _plus_3 = (_string_1 + "[");
      operacion _indice_1 = myValor.getIndice();
      CharSequence _generate_1 = this.generate(_indice_1);
      String _plus_4 = (_plus_3 + _generate_1);
      String _plus_5 = (_plus_4 + "]");
      String _plus_6 = (_plus_5 + ".");
      EList<CampoRegistro> _campo_1 = myValor.getCampo();
      CampoRegistro _get = _campo_1.get(0);
      String _nombre_campo = _get.getNombre_campo();
      String _plus_7 = (_plus_6 + _nombre_campo);
      concat = _plus_7;
    }
    return concat;
  }
  
  @Override
  public CharSequence generate(final CampoRegistro myCampo) {
    operacion _primerIndice = myCampo.getPrimerIndice();
    boolean _notEquals = (!Objects.equal(_primerIndice, null));
    if (_notEquals) {
      String _nombre_campo = myCampo.getNombre_campo();
      String _plus = (_nombre_campo + "[");
      operacion _primerIndice_1 = myCampo.getPrimerIndice();
      CharSequence _generate = this.generate(_primerIndice_1);
      String _plus_1 = (_plus + _generate);
      return (_plus_1 + "]");
    } else {
      if (((!Objects.equal(myCampo.getPrimerIndice(), null)) && (!Objects.equal(myCampo.getSegundoIndice(), null)))) {
        String _nombre_campo_1 = myCampo.getNombre_campo();
        String _plus_2 = (_nombre_campo_1 + "[");
        operacion _primerIndice_2 = myCampo.getPrimerIndice();
        CharSequence _generate_1 = this.generate(_primerIndice_2);
        String _plus_3 = (_plus_2 + _generate_1);
        String _plus_4 = (_plus_3 + "][");
        operacion _segundoIndice = myCampo.getSegundoIndice();
        CharSequence _generate_2 = this.generate(_segundoIndice);
        String _plus_5 = (_plus_4 + _generate_2);
        return (_plus_5 + "]");
      } else {
        return myCampo.getNombre_campo();
      }
    }
  }
  
  @Override
  public CharSequence generate(final ValorMatriz myValor) {
    String concat = new String();
    EList<CampoRegistro> _campo = myValor.getCampo();
    int _size = _campo.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      String _nombre_matriz = myValor.getNombre_matriz();
      String _string = _nombre_matriz.toString();
      String _plus = (_string + "[");
      operacion _primerIndice = myValor.getPrimerIndice();
      CharSequence _generate = this.generate(_primerIndice);
      String _plus_1 = (_plus + _generate);
      String _plus_2 = (_plus_1 + "][");
      operacion _segundoIndice = myValor.getSegundoIndice();
      CharSequence _generate_1 = this.generate(_segundoIndice);
      String _plus_3 = (_plus_2 + _generate_1);
      String _plus_4 = (_plus_3 + "]");
      concat = _plus_4;
    } else {
      String _nombre_matriz_1 = myValor.getNombre_matriz();
      String _string_1 = _nombre_matriz_1.toString();
      String _plus_5 = (_string_1 + "[");
      operacion _primerIndice_1 = myValor.getPrimerIndice();
      CharSequence _generate_2 = this.generate(_primerIndice_1);
      String _plus_6 = (_plus_5 + _generate_2);
      String _plus_7 = (_plus_6 + "][");
      operacion _segundoIndice_1 = myValor.getSegundoIndice();
      CharSequence _generate_3 = this.generate(_segundoIndice_1);
      String _plus_8 = (_plus_7 + _generate_3);
      String _plus_9 = (_plus_8 + "]");
      String _plus_10 = (_plus_9 + ".");
      EList<CampoRegistro> _campo_1 = myValor.getCampo();
      CampoRegistro _get = _campo_1.get(0);
      String _nombre_campo = _get.getNombre_campo();
      String _plus_11 = (_plus_10 + _nombre_campo);
      concat = _plus_11;
    }
    return concat;
  }
  
  @Override
  public CharSequence generate(final valor myVal) {
    CharSequence _xifexpression = null;
    EClass _eClass = myVal.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) myVal);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = myVal.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) myVal);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = myVal.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) myVal);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = myVal.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) myVal);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = myVal.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) myVal);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = myVal.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) myVal);
                  _xblockexpression_5 = this.generate(prueba);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = myVal.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("LlamadaFuncion");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    LlamadaFuncion prueba = new LlamadaFuncionImpl();
                    prueba = ((LlamadaFuncion) myVal);
                    _xblockexpression_6 = this.generate(prueba, false);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = myVal.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("operacion");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      operacion prueba = new operacionImpl();
                      prueba = ((operacion) myVal);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = myVal.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("Internas");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        Internas prueba = new InternasImpl();
                        prueba = ((Internas) myVal);
                        _xblockexpression_8 = this.generate(prueba, false);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = myVal.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("unaria");
                      if (_equals_9) {
                        _xifexpression_9 = null;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = myVal.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("ValorRegistro");
                        if (_equals_10) {
                          CharSequence _xblockexpression_9 = null;
                          {
                            ValorRegistro prueba = new ValorRegistroImpl();
                            prueba = ((ValorRegistro) myVal);
                            _xblockexpression_9 = this.generate(prueba);
                          }
                          _xifexpression_10 = _xblockexpression_9;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = myVal.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("ValorVector");
                          if (_equals_11) {
                            CharSequence _xblockexpression_10 = null;
                            {
                              ValorVector prueba = new ValorVectorImpl();
                              prueba = ((ValorVector) myVal);
                              _xblockexpression_10 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_10;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = myVal.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("ValorMatriz");
                            if (_equals_12) {
                              CharSequence _xblockexpression_11 = null;
                              {
                                ValorMatriz prueba = new ValorMatrizImpl();
                                prueba = ((ValorMatriz) myVal);
                                _xblockexpression_11 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_11;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final NumeroEntero numero) {
    int _valor = numero.getValor();
    return Integer.valueOf(_valor).toString();
  }
  
  @Override
  public CharSequence generate(final NumeroDecimal numero) {
    float _valor = numero.getValor();
    return Float.valueOf(_valor).toString();
  }
  
  @Override
  public CharSequence generate(final ValorBooleano valBool) {
    String _valor = valBool.getValor();
    ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
    String _string = _bundle.getString("VERDADERO");
    boolean _equals = _valor.equals(_string);
    if (_equals) {
      return "true";
    } else {
      return "false";
    }
  }
  
  @Override
  public CharSequence generate(final ConstCadena cadena) {
    String _contenido = cadena.getContenido();
    return InputOutput.<CharSequence>print(_contenido);
  }
  
  @Override
  public CharSequence generate(final Caracter caract) {
    String _contenido = caract.getContenido();
    return InputOutput.<CharSequence>print(_contenido);
  }
  
  @Override
  public CharSequence generate(final VariableID variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _nombre = variable.getNombre();
    _builder.append(_nombre, "");
    {
      EList<String> _mat = variable.getMat();
      for(final String matri : _mat) {
        String _string = matri.toString();
        _builder.append(_string, "");
      }
    }
    return _builder;
  }
  
  public CharSequence generatePunteros(final VariableID variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*");
    String _nombre = variable.getNombre();
    _builder.append(_nombre, "");
    {
      EList<String> _mat = variable.getMat();
      for(final String matri : _mat) {
        String _string = matri.toString();
        _builder.append(_string, "");
      }
    }
    return _builder;
  }
  
  public CharSequence generateEscribirPunteros(final Escribir a, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cout");
    EList<operacion> _operador = a.getOperador();
    String _coutOperadoresPunteros = this.coutOperadoresPunteros(_operador, punteros);
    _builder.append(_coutOperadoresPunteros, "");
    _builder.append(" << endl;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String coutOperadoresPunteros(final EList<operacion> operaciones, final List<String> punteros) {
    String resultado = "";
    for (final operacion op : operaciones) {
      CharSequence _generatePunteros = this.generatePunteros(op, punteros);
      String _plus = ((resultado + " << ") + _generatePunteros);
      resultado = _plus;
    }
    return resultado;
  }
  
  public String generateLeerPunteros(final Leer l, final List<String> punteros) {
    String leer = new String();
    EList<operacion> _variable = l.getVariable();
    for (final operacion op : _variable) {
      {
        boolean _equals = Objects.equal(leer, "");
        if (_equals) {
          leer = "cin >> ";
        } else {
          leer = (leer + "\n");
          leer = (leer + "cin >> ");
        }
        EClass _eClass = op.eClass();
        String _name = _eClass.getName();
        boolean _equals_1 = _name.equals("VariableID");
        if (_equals_1) {
          VariableID prueba = new VariableIDImpl();
          prueba = ((VariableID) op);
          String _nombre = prueba.getNombre();
          boolean _contains = punteros.contains(_nombre);
          if (_contains) {
            CharSequence _generate = this.generate(prueba);
            String _plus = (leer + _generate);
            String _plus_1 = (_plus + ";");
            leer = _plus_1;
          }
        } else {
          EClass _eClass_1 = op.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_2 = _name_1.equals("ValorVector");
          if (_equals_2) {
            ValorVector prueba_1 = new ValorVectorImpl();
            prueba_1 = ((ValorVector) op);
            String _nombre_vector = prueba_1.getNombre_vector();
            boolean _contains_1 = punteros.contains(_nombre_vector);
            if (_contains_1) {
              CharSequence _generate_1 = this.generate(prueba_1);
              String _plus_2 = (leer + _generate_1);
              String _plus_3 = (_plus_2 + ";");
              leer = _plus_3;
            }
          } else {
            EClass _eClass_2 = op.eClass();
            String _name_2 = _eClass_2.getName();
            boolean _equals_3 = _name_2.equals("ValorMatriz");
            if (_equals_3) {
              ValorMatriz prueba_2 = new ValorMatrizImpl();
              prueba_2 = ((ValorMatriz) op);
              String _nombre_matriz = prueba_2.getNombre_matriz();
              boolean _contains_2 = punteros.contains(_nombre_matriz);
              if (_contains_2) {
                CharSequence _generate_2 = this.generate(prueba_2);
                String _plus_4 = (leer + _generate_2);
                String _plus_5 = (_plus_4 + ";");
                leer = _plus_5;
              }
            } else {
              CharSequence _generate_3 = this.generate(op);
              String _plus_6 = (leer + _generate_3);
              String _plus_7 = (_plus_6 + ";");
              leer = _plus_7;
            }
          }
        }
      }
    }
    return leer;
  }
  
  @Override
  public CharSequence generate(final Leer l) {
    EList<operacion> _variable = l.getVariable();
    operacion _get = _variable.get(0);
    String _tipoOperador = this.getTipoOperador(_get);
    boolean _contains = VaryGrammarGeneratorCPP.archivos.contains(_tipoOperador);
    if (_contains) {
      String tipo = "";
      String resultado = "";
      String variableArchivo = "";
      EList<operacion> _variable_1 = l.getVariable();
      for (final operacion op : _variable_1) {
        {
          EClass _eClass = op.eClass();
          String _name = _eClass.getName();
          boolean _equals = _name.equals("VariableID");
          if (_equals) {
            VariableID varID = ((VariableID) op);
            String _nombre = varID.getNombre();
            String _get_1 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre);
            tipo = _get_1;
          } else {
            EClass _eClass_1 = op.eClass();
            String _name_1 = _eClass_1.getName();
            boolean _equals_1 = _name_1.equals("ValorVector");
            if (_equals_1) {
              ValorVector vector = ((ValorVector) op);
              EList<CampoRegistro> _campo = vector.getCampo();
              int _size = _campo.size();
              boolean _equals_2 = (_size == 0);
              if (_equals_2) {
                String _nombre_vector = vector.getNombre_vector();
                String _get_2 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector);
                String _get_3 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_2);
                tipo = _get_3;
              } else {
                String _nombre_vector_1 = vector.getNombre_vector();
                String _get_4 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector_1);
                String _get_5 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_4);
                Map<String, String> _get_6 = VaryGrammarGeneratorCPP.registros.get(_get_5);
                EList<CampoRegistro> _campo_1 = vector.getCampo();
                CampoRegistro _get_7 = _campo_1.get(0);
                String _nombre_campo = _get_7.getNombre_campo();
                String _get_8 = _get_6.get(_nombre_campo);
                tipo = _get_8;
              }
            } else {
              EClass _eClass_2 = op.eClass();
              String _name_2 = _eClass_2.getName();
              boolean _equals_3 = _name_2.equals("ValorMatriz");
              if (_equals_3) {
                ValorMatriz matriz = ((ValorMatriz) op);
                EList<CampoRegistro> _campo_2 = matriz.getCampo();
                int _size_1 = _campo_2.size();
                boolean _equals_4 = (_size_1 == 0);
                if (_equals_4) {
                  String _nombre_matriz = matriz.getNombre_matriz();
                  String _get_9 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz);
                  String _get_10 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_9);
                  tipo = _get_10;
                } else {
                  String _nombre_matriz_1 = matriz.getNombre_matriz();
                  String _get_11 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz_1);
                  String _get_12 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_11);
                  Map<String, String> _get_13 = VaryGrammarGeneratorCPP.registros.get(_get_12);
                  EList<CampoRegistro> _campo_3 = matriz.getCampo();
                  CampoRegistro _get_14 = _campo_3.get(0);
                  String _nombre_campo_1 = _get_14.getNombre_campo();
                  String _get_15 = _get_13.get(_nombre_campo_1);
                  tipo = _get_15;
                }
              } else {
                EClass _eClass_3 = op.eClass();
                String _name_3 = _eClass_3.getName();
                boolean _equals_5 = _name_3.equals("ValorRegistro");
                if (_equals_5) {
                  ValorRegistro registro = ((ValorRegistro) op);
                  EList<CampoRegistro> _campo_4 = registro.getCampo();
                  int _size_2 = _campo_4.size();
                  boolean _equals_6 = (_size_2 == 1);
                  if (_equals_6) {
                    String _nombre_registro = registro.getNombre_registro();
                    String _get_16 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro);
                    Map<String, String> _get_17 = VaryGrammarGeneratorCPP.registros.get(_get_16);
                    EList<CampoRegistro> _campo_5 = registro.getCampo();
                    CampoRegistro _get_18 = _campo_5.get(0);
                    String _nombre_campo_2 = _get_18.getNombre_campo();
                    String _get_19 = _get_17.get(_nombre_campo_2);
                    tipo = _get_19;
                  } else {
                    String _nombre_registro_1 = registro.getNombre_registro();
                    String _get_20 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro_1);
                    Map<String, String> _get_21 = VaryGrammarGeneratorCPP.registros.get(_get_20);
                    EList<CampoRegistro> _campo_6 = registro.getCampo();
                    EList<CampoRegistro> _campo_7 = registro.getCampo();
                    int _size_3 = _campo_7.size();
                    int _minus = (_size_3 - 2);
                    CampoRegistro _get_22 = _campo_6.get(_minus);
                    String _nombre_campo_3 = _get_22.getNombre_campo();
                    String tipoRegistro = _get_21.get(_nombre_campo_3);
                    Map<String, String> _get_23 = VaryGrammarGeneratorCPP.registros.get(tipoRegistro);
                    EList<CampoRegistro> _campo_8 = registro.getCampo();
                    EList<CampoRegistro> _campo_9 = registro.getCampo();
                    int _size_4 = _campo_9.size();
                    int _minus_1 = (_size_4 - 1);
                    CampoRegistro _get_24 = _campo_8.get(_minus_1);
                    String _nombre_campo_4 = _get_24.getNombre_campo();
                    String _get_25 = _get_23.get(_nombre_campo_4);
                    tipo = _get_25;
                  }
                }
              }
            }
          }
          boolean _contains_1 = VaryGrammarGeneratorCPP.archivos.contains(tipo);
          if (_contains_1) {
            CharSequence _generate = this.generate(op);
            String _string = _generate.toString();
            variableArchivo = _string;
          } else {
            ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
            String _string_1 = _bundle.getString("TIPO_ENTERO");
            boolean _equals_7 = tipo.equals(_string_1);
            if (_equals_7) {
              boolean _equals_8 = Objects.equal(resultado, "");
              if (_equals_8) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("fscanf(");
                _builder.append(variableArchivo, "");
                _builder.append(",\"%i\", &");
                CharSequence _generate_1 = this.generate(op);
                _builder.append(_generate_1, "");
                _builder.append(");");
                resultado = _builder.toString();
              } else {
                resultado = (resultado + "\n");
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("fscanf(");
                _builder_1.append(variableArchivo, "");
                _builder_1.append(",\"%i\", &");
                CharSequence _generate_2 = this.generate(op);
                _builder_1.append(_generate_2, "");
                _builder_1.append(");");
                resultado = _builder_1.toString();
              }
            } else {
              ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
              String _string_2 = _bundle_1.getString("TIPO_CARACTER");
              boolean _equals_9 = tipo.equals(_string_2);
              if (_equals_9) {
                boolean _equals_10 = Objects.equal(resultado, "");
                if (_equals_10) {
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("fscanf(");
                  _builder_2.append(variableArchivo, "");
                  _builder_2.append(",\"%c\", &");
                  CharSequence _generate_3 = this.generate(op);
                  _builder_2.append(_generate_3, "");
                  _builder_2.append(");");
                  resultado = _builder_2.toString();
                } else {
                  resultado = (resultado + "\n");
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("fscanf(");
                  _builder_3.append(variableArchivo, "");
                  _builder_3.append(",\"%c\", &");
                  CharSequence _generate_4 = this.generate(op);
                  _builder_3.append(_generate_4, "");
                  _builder_3.append(");");
                  resultado = _builder_3.toString();
                }
              } else {
                ResourceBundle _bundle_2 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                String _string_3 = _bundle_2.getString("TIPO_CADENA");
                boolean _equals_11 = tipo.equals(_string_3);
                if (_equals_11) {
                  boolean _equals_12 = Objects.equal(resultado, "");
                  if (_equals_12) {
                    StringConcatenation _builder_4 = new StringConcatenation();
                    _builder_4.append("fscanf(");
                    _builder_4.append(variableArchivo, "");
                    _builder_4.append(",\"%s\", &");
                    CharSequence _generate_5 = this.generate(op);
                    _builder_4.append(_generate_5, "");
                    _builder_4.append(");");
                    resultado = _builder_4.toString();
                  } else {
                    resultado = (resultado + "\n");
                    StringConcatenation _builder_5 = new StringConcatenation();
                    _builder_5.append("fscanf(");
                    _builder_5.append(variableArchivo, "");
                    _builder_5.append(",\"%s\", &");
                    CharSequence _generate_6 = this.generate(op);
                    _builder_5.append(_generate_6, "");
                    _builder_5.append(");");
                    resultado = _builder_5.toString();
                  }
                } else {
                  ResourceBundle _bundle_3 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                  String _string_4 = _bundle_3.getString("TIPO_REAL");
                  boolean _equals_13 = tipo.equals(_string_4);
                  if (_equals_13) {
                    boolean _equals_14 = Objects.equal(resultado, "");
                    if (_equals_14) {
                      StringConcatenation _builder_6 = new StringConcatenation();
                      _builder_6.append("fscanf(");
                      _builder_6.append(variableArchivo, "");
                      _builder_6.append(",\"%f\", &");
                      CharSequence _generate_7 = this.generate(op);
                      _builder_6.append(_generate_7, "");
                      _builder_6.append(");");
                      resultado = _builder_6.toString();
                    } else {
                      resultado = (resultado + "\n");
                      StringConcatenation _builder_7 = new StringConcatenation();
                      _builder_7.append("fscanf(");
                      _builder_7.append(variableArchivo, "");
                      _builder_7.append(",\"%f\", &");
                      CharSequence _generate_8 = this.generate(op);
                      _builder_7.append(_generate_8, "");
                      _builder_7.append(");");
                      resultado = _builder_7.toString();
                    }
                  } else {
                    boolean _containsKey = VaryGrammarGeneratorCPP.vectoresMatrices.containsKey(tipo);
                    if (_containsKey) {
                      String tipoAux = VaryGrammarGeneratorCPP.vectoresMatrices.get(tipo);
                      ResourceBundle _bundle_4 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                      String _string_5 = _bundle_4.getString("TIPO_ENTERO");
                      boolean _equals_15 = tipoAux.equals(_string_5);
                      if (_equals_15) {
                        boolean _equals_16 = Objects.equal(resultado, "");
                        if (_equals_16) {
                          StringConcatenation _builder_8 = new StringConcatenation();
                          _builder_8.append("fscanf(");
                          _builder_8.append(variableArchivo, "");
                          _builder_8.append(",\"%i\", &");
                          CharSequence _generate_9 = this.generate(op);
                          _builder_8.append(_generate_9, "");
                          _builder_8.append(");");
                          resultado = _builder_8.toString();
                        } else {
                          resultado = (resultado + "\n");
                          StringConcatenation _builder_9 = new StringConcatenation();
                          _builder_9.append("fscanf(");
                          _builder_9.append(variableArchivo, "");
                          _builder_9.append(",\"%i\", &");
                          CharSequence _generate_10 = this.generate(op);
                          _builder_9.append(_generate_10, "");
                          _builder_9.append(");");
                          resultado = _builder_9.toString();
                        }
                      } else {
                        if ((tipoAux.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                          boolean _equals_17 = Objects.equal(resultado, "");
                          if (_equals_17) {
                            StringConcatenation _builder_10 = new StringConcatenation();
                            _builder_10.append("fscanf(");
                            _builder_10.append(variableArchivo, "");
                            _builder_10.append(",\"%s\", &");
                            CharSequence _generate_11 = this.generate(op);
                            _builder_10.append(_generate_11, "");
                            _builder_10.append(");");
                            resultado = _builder_10.toString();
                          } else {
                            resultado = (resultado + "\n");
                            StringConcatenation _builder_11 = new StringConcatenation();
                            _builder_11.append("fscanf(");
                            _builder_11.append(variableArchivo, "");
                            _builder_11.append(",\"%s\", &");
                            CharSequence _generate_12 = this.generate(op);
                            _builder_11.append(_generate_12, "");
                            _builder_11.append(");");
                            resultado = _builder_11.toString();
                          }
                        } else {
                          ResourceBundle _bundle_5 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                          String _string_6 = _bundle_5.getString("TIPO_REAL");
                          boolean _equals_18 = tipoAux.equals(_string_6);
                          if (_equals_18) {
                            boolean _equals_19 = Objects.equal(resultado, "");
                            if (_equals_19) {
                              StringConcatenation _builder_12 = new StringConcatenation();
                              _builder_12.append("fscanf(");
                              _builder_12.append(variableArchivo, "");
                              _builder_12.append(",\"%f\", &");
                              CharSequence _generate_13 = this.generate(op);
                              _builder_12.append(_generate_13, "");
                              _builder_12.append(");");
                              resultado = _builder_12.toString();
                            } else {
                              resultado = (resultado + "\n");
                              StringConcatenation _builder_13 = new StringConcatenation();
                              _builder_13.append("fscanf(");
                              _builder_13.append(variableArchivo, "");
                              _builder_13.append(",\"%f\", &");
                              CharSequence _generate_14 = this.generate(op);
                              _builder_13.append(_generate_14, "");
                              _builder_13.append(");");
                              resultado = _builder_13.toString();
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return resultado;
    } else {
      String resultado_1 = "";
      EList<operacion> _variable_2 = l.getVariable();
      for (final operacion op_1 : _variable_2) {
        CharSequence _generate = this.generate(op_1);
        String _plus = ((resultado_1 + "cin >> ") + _generate);
        String _plus_1 = (_plus + ";");
        String _plus_2 = (_plus_1 + "\n");
        resultado_1 = _plus_2;
      }
      return resultado_1;
    }
  }
  
  public Object contienenExpresionLeer(final EList<Sentencias> sentencias, final Leer l) {
    boolean _contains = sentencias.contains(l);
    if (_contains) {
      return Boolean.valueOf(true);
    }
    for (final Sentencias s : sentencias) {
      EClass _eClass = s.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("mientras");
      if (_equals) {
        mientras mientras = ((diagramapseudocodigo.mientras) s);
        EList<Sentencias> _sentencias = mientras.getSentencias();
        boolean _contains_1 = _sentencias.contains(l);
        if (_contains_1) {
          return Boolean.valueOf(true);
        } else {
          EList<Sentencias> _sentencias_1 = mientras.getSentencias();
          Object _contienenExpresionLeer = this.contienenExpresionLeer(_sentencias_1, l);
          boolean _equals_1 = Objects.equal(_contienenExpresionLeer, Boolean.valueOf(true));
          if (_equals_1) {
            return Boolean.valueOf(true);
          }
        }
      } else {
        EClass _eClass_1 = s.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_2 = _name_1.equals("repetir");
        if (_equals_2) {
          repetir repetir = ((diagramapseudocodigo.repetir) s);
          EList<Sentencias> _sentencias_2 = repetir.getSentencias();
          boolean _contains_2 = _sentencias_2.contains(l);
          if (_contains_2) {
            return Boolean.valueOf(true);
          } else {
            EList<Sentencias> _sentencias_3 = repetir.getSentencias();
            Object _contienenExpresionLeer_1 = this.contienenExpresionLeer(_sentencias_3, l);
            boolean _equals_3 = Objects.equal(_contienenExpresionLeer_1, Boolean.valueOf(true));
            if (_equals_3) {
              return Boolean.valueOf(true);
            }
          }
        } else {
          EClass _eClass_2 = s.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_4 = _name_2.equals("desde");
          if (_equals_4) {
            desde desde = ((diagramapseudocodigo.desde) s);
            EList<Sentencias> _sentencias_4 = desde.getSentencias();
            boolean _contains_3 = _sentencias_4.contains(l);
            if (_contains_3) {
              return Boolean.valueOf(true);
            } else {
              EList<Sentencias> _sentencias_5 = desde.getSentencias();
              Object _contienenExpresionLeer_2 = this.contienenExpresionLeer(_sentencias_5, l);
              boolean _equals_5 = Objects.equal(_contienenExpresionLeer_2, Boolean.valueOf(true));
              if (_equals_5) {
                return Boolean.valueOf(true);
              }
            }
          } else {
            EClass _eClass_3 = s.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_6 = _name_3.equals("Si");
            if (_equals_6) {
              Si si = ((Si) s);
              EList<Sentencias> _sentencias_6 = si.getSentencias();
              boolean _contains_4 = _sentencias_6.contains(l);
              if (_contains_4) {
                return Boolean.valueOf(true);
              } else {
                Sino _sino = si.getSino();
                boolean _notEquals = (!Objects.equal(_sino, null));
                if (_notEquals) {
                  Sino _sino_1 = si.getSino();
                  EList<Sentencias> _sentencias_7 = _sino_1.getSentencias();
                  boolean _contains_5 = _sentencias_7.contains(l);
                  if (_contains_5) {
                    return Boolean.valueOf(true);
                  } else {
                    Sino _sino_2 = si.getSino();
                    EList<Sentencias> _sentencias_8 = _sino_2.getSentencias();
                    Object _contienenExpresionLeer_3 = this.contienenExpresionLeer(_sentencias_8, l);
                    boolean _equals_7 = Objects.equal(_contienenExpresionLeer_3, Boolean.valueOf(true));
                    if (_equals_7) {
                      return Boolean.valueOf(true);
                    }
                  }
                } else {
                  EList<Sentencias> _sentencias_9 = si.getSentencias();
                  Object _contienenExpresionLeer_4 = this.contienenExpresionLeer(_sentencias_9, l);
                  boolean _equals_8 = Objects.equal(_contienenExpresionLeer_4, Boolean.valueOf(true));
                  if (_equals_8) {
                    return Boolean.valueOf(true);
                  }
                }
              }
            } else {
              EClass _eClass_4 = s.eClass();
              String _name_4 = _eClass_4.getName();
              boolean _equals_9 = _name_4.equals("segun");
              if (_equals_9) {
                segun segun = ((diagramapseudocodigo.segun) s);
                EList<Caso> _caso = segun.getCaso();
                for (final Caso c : _caso) {
                  EList<Sentencias> _sentencias_10 = c.getSentencias();
                  boolean _contains_6 = _sentencias_10.contains(l);
                  if (_contains_6) {
                    return Boolean.valueOf(true);
                  } else {
                    EList<Sentencias> _sentencias_11 = c.getSentencias();
                    Object _contienenExpresionLeer_5 = this.contienenExpresionLeer(_sentencias_11, l);
                    boolean _equals_10 = Objects.equal(_contienenExpresionLeer_5, Boolean.valueOf(true));
                    if (_equals_10) {
                      return Boolean.valueOf(true);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Boolean.valueOf(false);
  }
  
  @Override
  public CharSequence generate(final Internas i, final boolean sentencia) {
    CharSequence _xifexpression = null;
    String _nombre = i.getNombre();
    boolean _equals = _nombre.equals("cos(");
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("cos(");
      EList<operacion> _operadores = i.getOperadores();
      operacion _get = _operadores.get(0);
      CharSequence _generate = this.generate(_get);
      _builder.append(_generate, "");
      _builder.append(")");
      {
        if (sentencia) {
          _builder.append(";");
        }
      }
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _nombre_1 = i.getNombre();
      boolean _equals_1 = _nombre_1.equals("sen(");
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("sin(");
        EList<operacion> _operadores_1 = i.getOperadores();
        operacion _get_1 = _operadores_1.get(0);
        CharSequence _generate_1 = this.generate(_get_1);
        _builder_1.append(_generate_1, "");
        _builder_1.append(")");
        {
          if (sentencia) {
            _builder_1.append(";");
          }
        }
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        String _nombre_2 = i.getNombre();
        boolean _equals_2 = _nombre_2.equals("cuadrado(");
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("pow(");
          EList<operacion> _operadores_2 = i.getOperadores();
          operacion _get_2 = _operadores_2.get(0);
          CharSequence _generate_2 = this.generate(_get_2);
          _builder_2.append(_generate_2, "");
          _builder_2.append(",");
          _builder_2.append(2.0, "");
          _builder_2.append(")");
          {
            if (sentencia) {
              _builder_2.append(";");
            }
          }
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _nombre_3 = i.getNombre();
          boolean _equals_3 = _nombre_3.equals("exp(");
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("exp2(");
            EList<operacion> _operadores_3 = i.getOperadores();
            operacion _get_3 = _operadores_3.get(0);
            CharSequence _generate_3 = this.generate(_get_3);
            _builder_3.append(_generate_3, "");
            _builder_3.append(")");
            {
              if (sentencia) {
                _builder_3.append(";");
              }
            }
            _xifexpression_3 = _builder_3;
          } else {
            CharSequence _xifexpression_4 = null;
            String _nombre_4 = i.getNombre();
            boolean _equals_4 = _nombre_4.equals("ln(");
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("log(");
              EList<operacion> _operadores_4 = i.getOperadores();
              operacion _get_4 = _operadores_4.get(0);
              CharSequence _generate_4 = this.generate(_get_4);
              _builder_4.append(_generate_4, "");
              _builder_4.append(")");
              {
                if (sentencia) {
                  _builder_4.append(";");
                }
              }
              _xifexpression_4 = _builder_4;
            } else {
              CharSequence _xifexpression_5 = null;
              String _nombre_5 = i.getNombre();
              boolean _equals_5 = _nombre_5.equals("log(");
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("log10(");
                EList<operacion> _operadores_5 = i.getOperadores();
                operacion _get_5 = _operadores_5.get(0);
                CharSequence _generate_5 = this.generate(_get_5);
                _builder_5.append(_generate_5, "");
                _builder_5.append(")");
                {
                  if (sentencia) {
                    _builder_5.append(";");
                  }
                }
                _xifexpression_5 = _builder_5;
              } else {
                CharSequence _xifexpression_6 = null;
                String _nombre_6 = i.getNombre();
                boolean _equals_6 = _nombre_6.equals("sqrt(");
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("sqrt(");
                  EList<operacion> _operadores_6 = i.getOperadores();
                  operacion _get_6 = _operadores_6.get(0);
                  CharSequence _generate_6 = this.generate(_get_6);
                  _builder_6.append(_generate_6, "");
                  _builder_6.append(")");
                  {
                    if (sentencia) {
                      _builder_6.append(";");
                    }
                  }
                  _xifexpression_6 = _builder_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  String _nombre_7 = i.getNombre();
                  boolean _equals_7 = _nombre_7.equals("sqrt(");
                  if (_equals_7) {
                    StringConcatenation _builder_7 = new StringConcatenation();
                    _builder_7.append("strlen(");
                    EList<operacion> _operadores_7 = i.getOperadores();
                    operacion _get_7 = _operadores_7.get(0);
                    CharSequence _generate_7 = this.generate(_get_7);
                    _builder_7.append(_generate_7, "");
                    _builder_7.append(")");
                    {
                      if (sentencia) {
                        _builder_7.append(";");
                      }
                    }
                    _xifexpression_7 = _builder_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    String _nombre_8 = i.getNombre();
                    boolean _equals_8 = _nombre_8.equals("concatena(");
                    if (_equals_8) {
                      StringConcatenation _builder_8 = new StringConcatenation();
                      EList<operacion> _operadores_8 = i.getOperadores();
                      operacion _get_8 = _operadores_8.get(0);
                      CharSequence _generate_8 = this.generate(_get_8);
                      _builder_8.append(_generate_8, "");
                      _builder_8.append(" = ");
                      EList<operacion> _operadores_9 = i.getOperadores();
                      operacion _get_9 = _operadores_9.get(0);
                      CharSequence _generate_9 = this.generate(_get_9);
                      _builder_8.append(_generate_9, "");
                      _builder_8.append(" + ");
                      EList<operacion> _operadores_10 = i.getOperadores();
                      operacion _get_10 = _operadores_10.get(1);
                      CharSequence _generate_10 = this.generate(_get_10);
                      _builder_8.append(_generate_10, "");
                      {
                        if (sentencia) {
                          _builder_8.append(";");
                        }
                      }
                      _xifexpression_8 = _builder_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      String _nombre_9 = i.getNombre();
                      boolean _equals_9 = _nombre_9.equals("copiar(");
                      if (_equals_9) {
                        StringConcatenation _builder_9 = new StringConcatenation();
                        EList<operacion> _operadores_11 = i.getOperadores();
                        operacion _get_11 = _operadores_11.get(0);
                        CharSequence _generate_11 = this.generate(_get_11);
                        _builder_9.append(_generate_11, "");
                        _builder_9.append(" = ");
                        EList<operacion> _operadores_12 = i.getOperadores();
                        operacion _get_12 = _operadores_12.get(1);
                        CharSequence _generate_12 = this.generate(_get_12);
                        _builder_9.append(_generate_12, "");
                        {
                          if (sentencia) {
                            _builder_9.append(";");
                          }
                        }
                        _xifexpression_9 = _builder_9;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String coutOperadores(final EList<operacion> operaciones) {
    String resultado = "";
    for (final operacion op : operaciones) {
      CharSequence _generate = this.generate(op);
      String _plus = ((resultado + " << ") + _generate);
      resultado = _plus;
    }
    return resultado;
  }
  
  public Object contienenExpresionEscribir(final EList<Sentencias> sentencias, final Escribir e) {
    boolean _contains = sentencias.contains(e);
    if (_contains) {
      return Boolean.valueOf(true);
    }
    for (final Sentencias s : sentencias) {
      EClass _eClass = s.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("mientras");
      if (_equals) {
        mientras mientras = ((diagramapseudocodigo.mientras) s);
        EList<Sentencias> _sentencias = mientras.getSentencias();
        boolean _contains_1 = _sentencias.contains(e);
        if (_contains_1) {
          return Boolean.valueOf(true);
        } else {
          EList<Sentencias> _sentencias_1 = mientras.getSentencias();
          Object _contienenExpresionEscribir = this.contienenExpresionEscribir(_sentencias_1, e);
          boolean _equals_1 = Objects.equal(_contienenExpresionEscribir, Boolean.valueOf(true));
          if (_equals_1) {
            return Boolean.valueOf(true);
          }
        }
      } else {
        EClass _eClass_1 = s.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_2 = _name_1.equals("repetir");
        if (_equals_2) {
          repetir repetir = ((diagramapseudocodigo.repetir) s);
          EList<Sentencias> _sentencias_2 = repetir.getSentencias();
          boolean _contains_2 = _sentencias_2.contains(e);
          if (_contains_2) {
            return Boolean.valueOf(true);
          } else {
            EList<Sentencias> _sentencias_3 = repetir.getSentencias();
            Object _contienenExpresionEscribir_1 = this.contienenExpresionEscribir(_sentencias_3, e);
            boolean _equals_3 = Objects.equal(_contienenExpresionEscribir_1, Boolean.valueOf(true));
            if (_equals_3) {
              return Boolean.valueOf(true);
            }
          }
        } else {
          EClass _eClass_2 = s.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_4 = _name_2.equals("desde");
          if (_equals_4) {
            desde desde = ((diagramapseudocodigo.desde) s);
            EList<Sentencias> _sentencias_4 = desde.getSentencias();
            boolean _contains_3 = _sentencias_4.contains(e);
            if (_contains_3) {
              return Boolean.valueOf(true);
            } else {
              EList<Sentencias> _sentencias_5 = desde.getSentencias();
              Object _contienenExpresionEscribir_2 = this.contienenExpresionEscribir(_sentencias_5, e);
              boolean _equals_5 = Objects.equal(_contienenExpresionEscribir_2, Boolean.valueOf(true));
              if (_equals_5) {
                return Boolean.valueOf(true);
              }
            }
          } else {
            EClass _eClass_3 = s.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_6 = _name_3.equals("Si");
            if (_equals_6) {
              Si si = ((Si) s);
              EList<Sentencias> _sentencias_6 = si.getSentencias();
              boolean _contains_4 = _sentencias_6.contains(e);
              if (_contains_4) {
                return Boolean.valueOf(true);
              } else {
                Sino _sino = si.getSino();
                boolean _notEquals = (!Objects.equal(_sino, null));
                if (_notEquals) {
                  Sino _sino_1 = si.getSino();
                  EList<Sentencias> _sentencias_7 = _sino_1.getSentencias();
                  boolean _contains_5 = _sentencias_7.contains(e);
                  if (_contains_5) {
                    return Boolean.valueOf(true);
                  } else {
                    Sino _sino_2 = si.getSino();
                    EList<Sentencias> _sentencias_8 = _sino_2.getSentencias();
                    Object _contienenExpresionEscribir_3 = this.contienenExpresionEscribir(_sentencias_8, e);
                    boolean _equals_7 = Objects.equal(_contienenExpresionEscribir_3, Boolean.valueOf(true));
                    if (_equals_7) {
                      return Boolean.valueOf(true);
                    }
                  }
                } else {
                  EList<Sentencias> _sentencias_9 = si.getSentencias();
                  Object _contienenExpresionEscribir_4 = this.contienenExpresionEscribir(_sentencias_9, e);
                  boolean _equals_8 = Objects.equal(_contienenExpresionEscribir_4, Boolean.valueOf(true));
                  if (_equals_8) {
                    return Boolean.valueOf(true);
                  }
                }
              }
            } else {
              EClass _eClass_4 = s.eClass();
              String _name_4 = _eClass_4.getName();
              boolean _equals_9 = _name_4.equals("segun");
              if (_equals_9) {
                segun segun = ((diagramapseudocodigo.segun) s);
                EList<Caso> _caso = segun.getCaso();
                for (final Caso c : _caso) {
                  EList<Sentencias> _sentencias_10 = c.getSentencias();
                  boolean _contains_6 = _sentencias_10.contains(e);
                  if (_contains_6) {
                    return Boolean.valueOf(true);
                  } else {
                    EList<Sentencias> _sentencias_11 = c.getSentencias();
                    Object _contienenExpresionEscribir_5 = this.contienenExpresionEscribir(_sentencias_11, e);
                    boolean _equals_10 = Objects.equal(_contienenExpresionEscribir_5, Boolean.valueOf(true));
                    if (_equals_10) {
                      return Boolean.valueOf(true);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Boolean.valueOf(false);
  }
  
  @Override
  public CharSequence generate(final Escribir a) {
    EList<operacion> _operador = a.getOperador();
    operacion _get = _operador.get(0);
    String _tipoOperador = this.getTipoOperador(_get);
    boolean _contains = VaryGrammarGeneratorCPP.archivos.contains(_tipoOperador);
    if (_contains) {
      String cadena = "";
      EList<operacion> _operador_1 = a.getOperador();
      operacion _get_1 = _operador_1.get(0);
      CharSequence _generate = this.generate(_get_1);
      String _plus = (cadena + _generate);
      String _plus_1 = (_plus + ", \"");
      cadena = _plus_1;
      EList<operacion> _operador_2 = a.getOperador();
      for (final operacion o : _operador_2) {
        if (((((a.getOperador().indexOf(o) == 0) && (!o.eClass().getName().equals("ConstCadena"))) && (!VaryGrammarGeneratorCPP.archivos.contains(this.getTipoOperador(a.getOperador().get(0))))) || (a.getOperador().indexOf(o) != 0))) {
          String tipo = this.getTipoOperador(o);
          if ((tipo.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass().getName().equals("NumeroEntero"))) {
            EList<operacion> _operador_3 = a.getOperador();
            int _indexOf = _operador_3.indexOf(o);
            EList<operacion> _operador_4 = a.getOperador();
            int _size = _operador_4.size();
            int _minus = (_size - 1);
            boolean _equals = (_indexOf == _minus);
            if (_equals) {
              cadena = (cadena + " %i \\n \"");
            } else {
              cadena = (cadena + " %i");
            }
          } else {
            if ((tipo.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CARACTER")) || o.eClass().getName().equals("Caracter"))) {
              EList<operacion> _operador_5 = a.getOperador();
              int _indexOf_1 = _operador_5.indexOf(o);
              EList<operacion> _operador_6 = a.getOperador();
              int _size_1 = _operador_6.size();
              int _minus_1 = (_size_1 - 1);
              boolean _equals_1 = (_indexOf_1 == _minus_1);
              if (_equals_1) {
                cadena = (cadena + " %c \\n \"");
              } else {
                cadena = (cadena + " %c");
              }
            } else {
              if ((tipo.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || o.eClass().getName().equals("ConstCadena"))) {
                EList<operacion> _operador_7 = a.getOperador();
                int _indexOf_2 = _operador_7.indexOf(o);
                EList<operacion> _operador_8 = a.getOperador();
                int _size_2 = _operador_8.size();
                int _minus_2 = (_size_2 - 1);
                boolean _equals_2 = (_indexOf_2 == _minus_2);
                if (_equals_2) {
                  cadena = (cadena + " %s \\n \"");
                } else {
                  cadena = (cadena + " %s");
                }
              } else {
                if ((tipo.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || o.eClass().getName().equals("NumeroDecimal"))) {
                  EList<operacion> _operador_9 = a.getOperador();
                  int _indexOf_3 = _operador_9.indexOf(o);
                  EList<operacion> _operador_10 = a.getOperador();
                  int _size_3 = _operador_10.size();
                  int _minus_3 = (_size_3 - 1);
                  boolean _equals_3 = (_indexOf_3 == _minus_3);
                  if (_equals_3) {
                    cadena = (cadena + " %f \\n \"");
                  } else {
                    cadena = (cadena + " %f");
                  }
                } else {
                  boolean _containsKey = VaryGrammarGeneratorCPP.vectoresMatrices.containsKey(tipo);
                  if (_containsKey) {
                    String tipoAux = VaryGrammarGeneratorCPP.vectoresMatrices.get(tipo);
                    if ((tipoAux.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || o.eClass().getName().equals("NumeroEntero"))) {
                      EList<operacion> _operador_11 = a.getOperador();
                      int _indexOf_4 = _operador_11.indexOf(o);
                      EList<operacion> _operador_12 = a.getOperador();
                      int _size_4 = _operador_12.size();
                      int _minus_4 = (_size_4 - 1);
                      boolean _equals_4 = (_indexOf_4 == _minus_4);
                      if (_equals_4) {
                        cadena = (cadena + " %i \\n \"");
                      } else {
                        cadena = (cadena + " %i");
                      }
                    } else {
                      if ((tipoAux.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                        EList<operacion> _operador_13 = a.getOperador();
                        int _indexOf_5 = _operador_13.indexOf(o);
                        EList<operacion> _operador_14 = a.getOperador();
                        int _size_5 = _operador_14.size();
                        int _minus_5 = (_size_5 - 1);
                        boolean _equals_5 = (_indexOf_5 == _minus_5);
                        if (_equals_5) {
                          cadena = (cadena + " %s \\n \"");
                        } else {
                          cadena = (cadena + " %s");
                        }
                      } else {
                        ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                        String _string = _bundle.getString("TIPO_REAL");
                        boolean _equals_6 = tipoAux.equals(_string);
                        if (_equals_6) {
                          EList<operacion> _operador_15 = a.getOperador();
                          int _indexOf_6 = _operador_15.indexOf(o);
                          EList<operacion> _operador_16 = a.getOperador();
                          int _size_6 = _operador_16.size();
                          int _minus_6 = (_size_6 - 1);
                          boolean _equals_7 = (_indexOf_6 == _minus_6);
                          if (_equals_7) {
                            cadena = (cadena + " %f \\n \"");
                          } else {
                            cadena = (cadena + " %f");
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      if (((a.getOperador().size() > 1) || ((a.getOperador().size() == 1) && (!a.getOperador().get(0).eClass().getName().equals("ConstCadena"))))) {
        EList<operacion> _operador_17 = a.getOperador();
        String _coutOperadoresC = this.coutOperadoresC(_operador_17);
        String _plus_2 = ((cadena + ", ") + _coutOperadoresC);
        cadena = _plus_2;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("fprintf(");
        _builder.append(cadena, "");
        _builder.append(");");
        return _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("fprintf(");
        _builder_1.append(cadena, "");
        _builder_1.append(");");
        return _builder_1;
      }
    } else {
      EList<operacion> _operador_18 = a.getOperador();
      String _coutOperadores = this.coutOperadores(_operador_18);
      String _plus_3 = ("cout" + _coutOperadores);
      return (_plus_3 + " << endl;");
    }
  }
  
  public String coutOperadoresC(final EList<operacion> operaciones) {
    String resultado = "";
    int numero = 1;
    for (final operacion op : operaciones) {
      {
        if ((((operaciones.size() > 1) && (numero < operaciones.size())) && (numero != 1))) {
          if ((this.getTipoOperador(op).equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) && (!this.generate(op).toString().contains("\"")))) {
            CharSequence _generate = this.generate(op);
            String _plus = (resultado + _generate);
            String _plus_1 = (_plus + ".c_str() , ");
            resultado = _plus_1;
          } else {
            CharSequence _generate_1 = this.generate(op);
            String _plus_2 = (resultado + _generate_1);
            String _plus_3 = (_plus_2 + " , ");
            resultado = _plus_3;
          }
        } else {
          if (((numero != 1) || (operaciones.size() == 1))) {
            if ((this.getTipoOperador(op).equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) && (!this.generate(op).toString().contains("\"")))) {
              CharSequence _generate_2 = this.generate(op);
              String _plus_4 = (resultado + _generate_2);
              String _plus_5 = (_plus_4 + ".c_str()");
              resultado = _plus_5;
            } else {
              CharSequence _generate_3 = this.generate(op);
              String _plus_6 = (resultado + _generate_3);
              resultado = _plus_6;
            }
          }
        }
        numero = (numero + 1);
      }
    }
    return resultado;
  }
  
  public String getTipoOperador(final operacion o) {
    EClass _eClass = o.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("OperacionCompleta");
    if (_equals) {
      OperacionCompleta operacionCompleta = ((OperacionCompleta) o);
      operacion op = operacionCompleta.getValor_operacion();
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("VariableID");
      if (_equals_1) {
        VariableID varID = ((VariableID) op);
        String _nombre = varID.getNombre();
        return VaryGrammarGeneratorCPP.variablesInicio.get(_nombre);
      } else {
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorVector");
        if (_equals_2) {
          ValorVector vector = ((ValorVector) op);
          EList<CampoRegistro> _campo = vector.getCampo();
          int _size = _campo.size();
          boolean _equals_3 = (_size == 0);
          if (_equals_3) {
            String _nombre_vector = vector.getNombre_vector();
            String _get = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector);
            return VaryGrammarGeneratorCPP.vectoresMatrices.get(_get);
          } else {
            String _nombre_vector_1 = vector.getNombre_vector();
            String _get_1 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector_1);
            String _get_2 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_1);
            Map<String, String> _get_3 = VaryGrammarGeneratorCPP.registros.get(_get_2);
            EList<CampoRegistro> _campo_1 = vector.getCampo();
            CampoRegistro _get_4 = _campo_1.get(0);
            String _nombre_campo = _get_4.getNombre_campo();
            return _get_3.get(_nombre_campo);
          }
        } else {
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_4 = _name_3.equals("ValorMatriz");
          if (_equals_4) {
            ValorMatriz matriz = ((ValorMatriz) op);
            EList<CampoRegistro> _campo_2 = matriz.getCampo();
            int _size_1 = _campo_2.size();
            boolean _equals_5 = (_size_1 == 0);
            if (_equals_5) {
              String _nombre_matriz = matriz.getNombre_matriz();
              String _get_5 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz);
              return VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_5);
            } else {
              String _nombre_matriz_1 = matriz.getNombre_matriz();
              String _get_6 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz_1);
              String _get_7 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_6);
              Map<String, String> _get_8 = VaryGrammarGeneratorCPP.registros.get(_get_7);
              EList<CampoRegistro> _campo_3 = matriz.getCampo();
              CampoRegistro _get_9 = _campo_3.get(0);
              String _nombre_campo_1 = _get_9.getNombre_campo();
              return _get_8.get(_nombre_campo_1);
            }
          } else {
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_6 = _name_4.equals("ValorRegistro");
            if (_equals_6) {
              ValorRegistro registro = ((ValorRegistro) op);
              EList<CampoRegistro> _campo_4 = registro.getCampo();
              int _size_2 = _campo_4.size();
              boolean _equals_7 = (_size_2 == 1);
              if (_equals_7) {
                String _nombre_registro = registro.getNombre_registro();
                String _get_10 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro);
                Map<String, String> _get_11 = VaryGrammarGeneratorCPP.registros.get(_get_10);
                EList<CampoRegistro> _campo_5 = registro.getCampo();
                CampoRegistro _get_12 = _campo_5.get(0);
                String _nombre_campo_2 = _get_12.getNombre_campo();
                return _get_11.get(_nombre_campo_2);
              } else {
                String _nombre_registro_1 = registro.getNombre_registro();
                String _get_13 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro_1);
                Map<String, String> _get_14 = VaryGrammarGeneratorCPP.registros.get(_get_13);
                EList<CampoRegistro> _campo_6 = registro.getCampo();
                EList<CampoRegistro> _campo_7 = registro.getCampo();
                int _size_3 = _campo_7.size();
                int _minus = (_size_3 - 2);
                CampoRegistro _get_15 = _campo_6.get(_minus);
                String _nombre_campo_3 = _get_15.getNombre_campo();
                String tipoRegistro = _get_14.get(_nombre_campo_3);
                Map<String, String> _get_16 = VaryGrammarGeneratorCPP.registros.get(tipoRegistro);
                EList<CampoRegistro> _campo_8 = registro.getCampo();
                EList<CampoRegistro> _campo_9 = registro.getCampo();
                int _size_4 = _campo_9.size();
                int _minus_1 = (_size_4 - 1);
                CampoRegistro _get_17 = _campo_8.get(_minus_1);
                String _nombre_campo_4 = _get_17.getNombre_campo();
                return _get_16.get(_nombre_campo_4);
              }
            } else {
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_8 = _name_5.equals("LlamadaFuncion");
              if (_equals_8) {
                LlamadaFuncion llamadaFuncion = ((LlamadaFuncion) op);
                String _nombre_1 = llamadaFuncion.getNombre();
                return VaryGrammarGeneratorCPP.funciones.get(_nombre_1);
              } else {
                if ((op.eClass().getName().equals("NumeroEntero") || op.eClass().getName().equals("ValorBooleano"))) {
                  ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                  return _bundle.getString("TIPO_ENTERO");
                } else {
                  EClass _eClass_6 = op.eClass();
                  String _name_6 = _eClass_6.getName();
                  boolean _equals_9 = _name_6.equals("ConstCadena");
                  if (_equals_9) {
                    ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                    return _bundle_1.getString("TIPO_CADENA");
                  } else {
                    EClass _eClass_7 = op.eClass();
                    String _name_7 = _eClass_7.getName();
                    boolean _equals_10 = _name_7.equals("Caracter");
                    if (_equals_10) {
                      ResourceBundle _bundle_2 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                      return _bundle_2.getString("TIPO_CARACTER");
                    } else {
                      EClass _eClass_8 = op.eClass();
                      String _name_8 = _eClass_8.getName();
                      boolean _equals_11 = _name_8.equals("NumeroDecimal");
                      if (_equals_11) {
                        ResourceBundle _bundle_3 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                        return _bundle_3.getString("TIPO_REAL");
                      } else {
                        EClass _eClass_9 = op.eClass();
                        String _name_9 = _eClass_9.getName();
                        boolean _equals_12 = _name_9.equals("Suma");
                        if (_equals_12) {
                          Suma suma = ((Suma) op);
                          operacion _right = suma.getRight();
                          String tipoRight = this.getTipoOperador(_right);
                          operacion _left = suma.getLeft();
                          String tipoLeft = this.getTipoOperador(_left);
                          boolean _equals_13 = tipoRight.equals(tipoLeft);
                          if (_equals_13) {
                            return tipoRight;
                          } else {
                            if ((tipoRight.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                              ResourceBundle _bundle_4 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                              return _bundle_4.getString("TIPO_CADENA");
                            } else {
                              if ((tipoRight.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                ResourceBundle _bundle_5 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                return _bundle_5.getString("TIPO_REAL");
                              }
                            }
                          }
                        } else {
                          EClass _eClass_10 = op.eClass();
                          String _name_10 = _eClass_10.getName();
                          boolean _equals_14 = _name_10.equals("Resta");
                          if (_equals_14) {
                            Resta resta = ((Resta) op);
                            operacion _right_1 = resta.getRight();
                            String tipoRight_1 = this.getTipoOperador(_right_1);
                            operacion _left_1 = resta.getLeft();
                            String tipoLeft_1 = this.getTipoOperador(_left_1);
                            boolean _equals_15 = tipoRight_1.equals(tipoLeft_1);
                            if (_equals_15) {
                              return tipoRight_1;
                            } else {
                              if ((tipoRight_1.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_1.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                ResourceBundle _bundle_6 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                return _bundle_6.getString("TIPO_CADENA");
                              } else {
                                if ((tipoRight_1.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_1.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                  ResourceBundle _bundle_7 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                  return _bundle_7.getString("TIPO_REAL");
                                }
                              }
                            }
                          } else {
                            EClass _eClass_11 = op.eClass();
                            String _name_11 = _eClass_11.getName();
                            boolean _equals_16 = _name_11.equals("Multiplicacion");
                            if (_equals_16) {
                              Multiplicacion multiplicacion = ((Multiplicacion) op);
                              operacion _right_2 = multiplicacion.getRight();
                              String tipoRight_2 = this.getTipoOperador(_right_2);
                              operacion _left_2 = multiplicacion.getLeft();
                              String tipoLeft_2 = this.getTipoOperador(_left_2);
                              boolean _equals_17 = tipoRight_2.equals(tipoLeft_2);
                              if (_equals_17) {
                                return tipoRight_2;
                              } else {
                                if ((tipoRight_2.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_2.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                  ResourceBundle _bundle_8 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                  return _bundle_8.getString("TIPO_CADENA");
                                } else {
                                  if ((tipoRight_2.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_2.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                    ResourceBundle _bundle_9 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                    return _bundle_9.getString("TIPO_REAL");
                                  }
                                }
                              }
                            } else {
                              EClass _eClass_12 = op.eClass();
                              String _name_12 = _eClass_12.getName();
                              boolean _equals_18 = _name_12.equals("Division");
                              if (_equals_18) {
                                Division division = ((Division) op);
                                operacion _right_3 = division.getRight();
                                String tipoRight_3 = this.getTipoOperador(_right_3);
                                operacion _left_3 = division.getLeft();
                                String tipoLeft_3 = this.getTipoOperador(_left_3);
                                boolean _equals_19 = tipoRight_3.equals(tipoLeft_3);
                                if (_equals_19) {
                                  return tipoRight_3;
                                } else {
                                  if ((tipoRight_3.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_3.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                    ResourceBundle _bundle_10 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                    return _bundle_10.getString("TIPO_CADENA");
                                  } else {
                                    if ((tipoRight_3.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_3.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                      ResourceBundle _bundle_11 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                      return _bundle_11.getString("TIPO_REAL");
                                    }
                                  }
                                }
                              } else {
                                EClass _eClass_13 = op.eClass();
                                String _name_13 = _eClass_13.getName();
                                boolean _equals_20 = _name_13.equals("Div");
                                if (_equals_20) {
                                  Div div = ((Div) op);
                                  operacion _right_4 = div.getRight();
                                  String tipoRight_4 = this.getTipoOperador(_right_4);
                                  operacion _left_4 = div.getLeft();
                                  String tipoLeft_4 = this.getTipoOperador(_left_4);
                                  boolean _equals_21 = tipoRight_4.equals(tipoLeft_4);
                                  if (_equals_21) {
                                    return tipoRight_4;
                                  } else {
                                    if ((tipoRight_4.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_4.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                      ResourceBundle _bundle_12 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                      return _bundle_12.getString("TIPO_CADENA");
                                    } else {
                                      if ((tipoRight_4.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_4.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                        ResourceBundle _bundle_13 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                        return _bundle_13.getString("TIPO_REAL");
                                      }
                                    }
                                  }
                                } else {
                                  EClass _eClass_14 = op.eClass();
                                  String _name_14 = _eClass_14.getName();
                                  boolean _equals_22 = _name_14.equals("Mod");
                                  if (_equals_22) {
                                    Mod mod = ((Mod) op);
                                    operacion _right_5 = mod.getRight();
                                    String tipoRight_5 = this.getTipoOperador(_right_5);
                                    operacion _left_5 = mod.getLeft();
                                    String tipoLeft_5 = this.getTipoOperador(_left_5);
                                    boolean _equals_23 = tipoRight_5.equals(tipoLeft_5);
                                    if (_equals_23) {
                                      return tipoRight_5;
                                    } else {
                                      if ((tipoRight_5.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_5.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                        ResourceBundle _bundle_14 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                        return _bundle_14.getString("TIPO_CADENA");
                                      } else {
                                        if ((tipoRight_5.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_5.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                          ResourceBundle _bundle_15 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                          return _bundle_15.getString("TIPO_REAL");
                                        }
                                      }
                                    }
                                  } else {
                                    EClass _eClass_15 = op.eClass();
                                    String _name_15 = _eClass_15.getName();
                                    boolean _equals_24 = _name_15.equals("Or");
                                    if (_equals_24) {
                                      Or or = ((Or) op);
                                      operacion _right_6 = or.getRight();
                                      String tipoRight_6 = this.getTipoOperador(_right_6);
                                      operacion _left_6 = or.getLeft();
                                      String tipoLeft_6 = this.getTipoOperador(_left_6);
                                      boolean _equals_25 = tipoRight_6.equals(tipoLeft_6);
                                      if (_equals_25) {
                                        return tipoRight_6;
                                      } else {
                                        if ((tipoRight_6.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_6.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                          ResourceBundle _bundle_16 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                          return _bundle_16.getString("TIPO_CADENA");
                                        } else {
                                          if ((tipoRight_6.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_6.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                            ResourceBundle _bundle_17 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                            return _bundle_17.getString("TIPO_REAL");
                                          }
                                        }
                                      }
                                    } else {
                                      EClass _eClass_16 = op.eClass();
                                      String _name_16 = _eClass_16.getName();
                                      boolean _equals_26 = _name_16.equals("And");
                                      if (_equals_26) {
                                        And and = ((And) op);
                                        operacion _right_7 = and.getRight();
                                        String tipoRight_7 = this.getTipoOperador(_right_7);
                                        operacion _left_7 = and.getLeft();
                                        String tipoLeft_7 = this.getTipoOperador(_left_7);
                                        boolean _equals_27 = tipoRight_7.equals(tipoLeft_7);
                                        if (_equals_27) {
                                          return tipoRight_7;
                                        } else {
                                          if ((tipoRight_7.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_7.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                            ResourceBundle _bundle_18 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                            return _bundle_18.getString("TIPO_CADENA");
                                          } else {
                                            if ((tipoRight_7.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_7.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                              ResourceBundle _bundle_19 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                              return _bundle_19.getString("TIPO_REAL");
                                            }
                                          }
                                        }
                                      } else {
                                        EClass _eClass_17 = op.eClass();
                                        String _name_17 = _eClass_17.getName();
                                        boolean _equals_28 = _name_17.equals("Comparacion");
                                        if (_equals_28) {
                                          Comparacion comparacion = ((Comparacion) op);
                                          operacion _right_8 = comparacion.getRight();
                                          String tipoRight_8 = this.getTipoOperador(_right_8);
                                          operacion _left_8 = comparacion.getLeft();
                                          String tipoLeft_8 = this.getTipoOperador(_left_8);
                                          boolean _equals_29 = tipoRight_8.equals(tipoLeft_8);
                                          if (_equals_29) {
                                            return tipoRight_8;
                                          } else {
                                            if ((tipoRight_8.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_8.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                              ResourceBundle _bundle_20 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                              return _bundle_20.getString("TIPO_CADENA");
                                            } else {
                                              if ((tipoRight_8.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_8.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                                ResourceBundle _bundle_21 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                return _bundle_21.getString("TIPO_REAL");
                                              }
                                            }
                                          }
                                        } else {
                                          EClass _eClass_18 = op.eClass();
                                          String _name_18 = _eClass_18.getName();
                                          boolean _equals_30 = _name_18.equals("Igualdad");
                                          if (_equals_30) {
                                            Igualdad igualdad = ((Igualdad) op);
                                            operacion _right_9 = igualdad.getRight();
                                            String tipoRight_9 = this.getTipoOperador(_right_9);
                                            operacion _left_9 = igualdad.getLeft();
                                            String tipoLeft_9 = this.getTipoOperador(_left_9);
                                            boolean _equals_31 = tipoRight_9.equals(tipoLeft_9);
                                            if (_equals_31) {
                                              return tipoRight_9;
                                            } else {
                                              if ((tipoRight_9.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_9.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                                ResourceBundle _bundle_22 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                return _bundle_22.getString("TIPO_CADENA");
                                              } else {
                                                if ((tipoRight_9.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_9.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                                  ResourceBundle _bundle_23 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                  return _bundle_23.getString("TIPO_REAL");
                                                }
                                              }
                                            }
                                          } else {
                                            EClass _eClass_19 = op.eClass();
                                            String _name_19 = _eClass_19.getName();
                                            boolean _equals_32 = _name_19.equals("OperacionParentesis");
                                            if (_equals_32) {
                                              OperacionParentesis operacionParentesis = ((OperacionParentesis) op);
                                              operacion _valor_operacion = operacionParentesis.getValor_operacion();
                                              return this.getTipoOperador(_valor_operacion);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    } else {
      EClass _eClass_20 = o.eClass();
      String _name_20 = _eClass_20.getName();
      boolean _equals_33 = _name_20.equals("VariableID");
      if (_equals_33) {
        VariableID varID_1 = ((VariableID) o);
        String _nombre_2 = varID_1.getNombre();
        return VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_2);
      } else {
        EClass _eClass_21 = o.eClass();
        String _name_21 = _eClass_21.getName();
        boolean _equals_34 = _name_21.equals("ValorVector");
        if (_equals_34) {
          ValorVector vector_1 = ((ValorVector) o);
          EList<CampoRegistro> _campo_10 = vector_1.getCampo();
          int _size_5 = _campo_10.size();
          boolean _equals_35 = (_size_5 == 0);
          if (_equals_35) {
            String _nombre_vector_2 = vector_1.getNombre_vector();
            String _get_18 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector_2);
            return VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_18);
          } else {
            String _nombre_vector_3 = vector_1.getNombre_vector();
            String _get_19 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_vector_3);
            String _get_20 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_19);
            Map<String, String> _get_21 = VaryGrammarGeneratorCPP.registros.get(_get_20);
            EList<CampoRegistro> _campo_11 = vector_1.getCampo();
            CampoRegistro _get_22 = _campo_11.get(0);
            String _nombre_campo_5 = _get_22.getNombre_campo();
            return _get_21.get(_nombre_campo_5);
          }
        } else {
          EClass _eClass_22 = o.eClass();
          String _name_22 = _eClass_22.getName();
          boolean _equals_36 = _name_22.equals("ValorMatriz");
          if (_equals_36) {
            ValorMatriz matriz_1 = ((ValorMatriz) o);
            EList<CampoRegistro> _campo_12 = matriz_1.getCampo();
            int _size_6 = _campo_12.size();
            boolean _equals_37 = (_size_6 == 0);
            if (_equals_37) {
              String _nombre_matriz_2 = matriz_1.getNombre_matriz();
              String _get_23 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz_2);
              return VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_23);
            } else {
              String _nombre_matriz_3 = matriz_1.getNombre_matriz();
              String _get_24 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_matriz_3);
              String _get_25 = VaryGrammarGeneratorCPP.vectoresMatrices.get(_get_24);
              Map<String, String> _get_26 = VaryGrammarGeneratorCPP.registros.get(_get_25);
              EList<CampoRegistro> _campo_13 = matriz_1.getCampo();
              CampoRegistro _get_27 = _campo_13.get(0);
              String _nombre_campo_6 = _get_27.getNombre_campo();
              return _get_26.get(_nombre_campo_6);
            }
          } else {
            EClass _eClass_23 = o.eClass();
            String _name_23 = _eClass_23.getName();
            boolean _equals_38 = _name_23.equals("ValorRegistro");
            if (_equals_38) {
              ValorRegistro registro_1 = ((ValorRegistro) o);
              EList<CampoRegistro> _campo_14 = registro_1.getCampo();
              int _size_7 = _campo_14.size();
              boolean _equals_39 = (_size_7 == 1);
              if (_equals_39) {
                String _nombre_registro_2 = registro_1.getNombre_registro();
                String _get_28 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro_2);
                Map<String, String> _get_29 = VaryGrammarGeneratorCPP.registros.get(_get_28);
                EList<CampoRegistro> _campo_15 = registro_1.getCampo();
                CampoRegistro _get_30 = _campo_15.get(0);
                String _nombre_campo_7 = _get_30.getNombre_campo();
                return _get_29.get(_nombre_campo_7);
              } else {
                String _nombre_registro_3 = registro_1.getNombre_registro();
                String _get_31 = VaryGrammarGeneratorCPP.variablesInicio.get(_nombre_registro_3);
                Map<String, String> _get_32 = VaryGrammarGeneratorCPP.registros.get(_get_31);
                EList<CampoRegistro> _campo_16 = registro_1.getCampo();
                EList<CampoRegistro> _campo_17 = registro_1.getCampo();
                int _size_8 = _campo_17.size();
                int _minus_2 = (_size_8 - 2);
                CampoRegistro _get_33 = _campo_16.get(_minus_2);
                String _nombre_campo_8 = _get_33.getNombre_campo();
                String tipoRegistro_1 = _get_32.get(_nombre_campo_8);
                Map<String, String> _get_34 = VaryGrammarGeneratorCPP.registros.get(tipoRegistro_1);
                EList<CampoRegistro> _campo_18 = registro_1.getCampo();
                EList<CampoRegistro> _campo_19 = registro_1.getCampo();
                int _size_9 = _campo_19.size();
                int _minus_3 = (_size_9 - 1);
                CampoRegistro _get_35 = _campo_18.get(_minus_3);
                String _nombre_campo_9 = _get_35.getNombre_campo();
                return _get_34.get(_nombre_campo_9);
              }
            } else {
              EClass _eClass_24 = o.eClass();
              String _name_24 = _eClass_24.getName();
              boolean _equals_40 = _name_24.equals("LlamadaFuncion");
              if (_equals_40) {
                LlamadaFuncion llamadaFuncion_1 = ((LlamadaFuncion) o);
                String _nombre_3 = llamadaFuncion_1.getNombre();
                return VaryGrammarGeneratorCPP.funciones.get(_nombre_3);
              } else {
                if ((o.eClass().getName().equals("NumeroEntero") || o.eClass().getName().equals("ValorBooleano"))) {
                  ResourceBundle _bundle_24 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                  return _bundle_24.getString("TIPO_ENTERO");
                } else {
                  EClass _eClass_25 = o.eClass();
                  String _name_25 = _eClass_25.getName();
                  boolean _equals_41 = _name_25.equals("ConstCadena");
                  if (_equals_41) {
                    ResourceBundle _bundle_25 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                    return _bundle_25.getString("TIPO_CADENA");
                  } else {
                    EClass _eClass_26 = o.eClass();
                    String _name_26 = _eClass_26.getName();
                    boolean _equals_42 = _name_26.equals("Caracter");
                    if (_equals_42) {
                      ResourceBundle _bundle_26 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                      return _bundle_26.getString("TIPO_CARACTER");
                    } else {
                      EClass _eClass_27 = o.eClass();
                      String _name_27 = _eClass_27.getName();
                      boolean _equals_43 = _name_27.equals("NumeroDecimal");
                      if (_equals_43) {
                        ResourceBundle _bundle_27 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                        return _bundle_27.getString("TIPO_REAL");
                      } else {
                        EClass _eClass_28 = o.eClass();
                        String _name_28 = _eClass_28.getName();
                        boolean _equals_44 = _name_28.equals("Suma");
                        if (_equals_44) {
                          Suma suma_1 = ((Suma) o);
                          operacion _right_10 = suma_1.getRight();
                          String tipoRight_10 = this.getTipoOperador(_right_10);
                          operacion _left_10 = suma_1.getLeft();
                          String tipoLeft_10 = this.getTipoOperador(_left_10);
                          boolean _equals_45 = tipoRight_10.equals(tipoLeft_10);
                          if (_equals_45) {
                            return tipoRight_10;
                          } else {
                            if ((tipoRight_10.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_10.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                              ResourceBundle _bundle_28 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                              return _bundle_28.getString("TIPO_CADENA");
                            } else {
                              if ((tipoRight_10.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_10.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                ResourceBundle _bundle_29 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                return _bundle_29.getString("TIPO_REAL");
                              }
                            }
                          }
                        } else {
                          EClass _eClass_29 = o.eClass();
                          String _name_29 = _eClass_29.getName();
                          boolean _equals_46 = _name_29.equals("Resta");
                          if (_equals_46) {
                            Resta resta_1 = ((Resta) o);
                            operacion _right_11 = resta_1.getRight();
                            String tipoRight_11 = this.getTipoOperador(_right_11);
                            operacion _left_11 = resta_1.getLeft();
                            String tipoLeft_11 = this.getTipoOperador(_left_11);
                            boolean _equals_47 = tipoRight_11.equals(tipoLeft_11);
                            if (_equals_47) {
                              return tipoRight_11;
                            } else {
                              if ((tipoRight_11.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_11.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                ResourceBundle _bundle_30 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                return _bundle_30.getString("TIPO_CADENA");
                              } else {
                                if ((tipoRight_11.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_11.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                  ResourceBundle _bundle_31 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                  return _bundle_31.getString("TIPO_REAL");
                                }
                              }
                            }
                          } else {
                            EClass _eClass_30 = o.eClass();
                            String _name_30 = _eClass_30.getName();
                            boolean _equals_48 = _name_30.equals("Multiplicacion");
                            if (_equals_48) {
                              Multiplicacion multiplicacion_1 = ((Multiplicacion) o);
                              operacion _right_12 = multiplicacion_1.getRight();
                              String tipoRight_12 = this.getTipoOperador(_right_12);
                              operacion _left_12 = multiplicacion_1.getLeft();
                              String tipoLeft_12 = this.getTipoOperador(_left_12);
                              boolean _equals_49 = tipoRight_12.equals(tipoLeft_12);
                              if (_equals_49) {
                                return tipoRight_12;
                              } else {
                                if ((tipoRight_12.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_12.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                  ResourceBundle _bundle_32 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                  return _bundle_32.getString("TIPO_CADENA");
                                } else {
                                  if ((tipoRight_12.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_12.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                    ResourceBundle _bundle_33 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                    return _bundle_33.getString("TIPO_REAL");
                                  }
                                }
                              }
                            } else {
                              EClass _eClass_31 = o.eClass();
                              String _name_31 = _eClass_31.getName();
                              boolean _equals_50 = _name_31.equals("Division");
                              if (_equals_50) {
                                Division division_1 = ((Division) o);
                                operacion _right_13 = division_1.getRight();
                                String tipoRight_13 = this.getTipoOperador(_right_13);
                                operacion _left_13 = division_1.getLeft();
                                String tipoLeft_13 = this.getTipoOperador(_left_13);
                                boolean _equals_51 = tipoRight_13.equals(tipoLeft_13);
                                if (_equals_51) {
                                  return tipoRight_13;
                                } else {
                                  if ((tipoRight_13.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_13.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                    ResourceBundle _bundle_34 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                    return _bundle_34.getString("TIPO_CADENA");
                                  } else {
                                    if ((tipoRight_13.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_13.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                      ResourceBundle _bundle_35 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                      return _bundle_35.getString("TIPO_REAL");
                                    }
                                  }
                                }
                              } else {
                                EClass _eClass_32 = o.eClass();
                                String _name_32 = _eClass_32.getName();
                                boolean _equals_52 = _name_32.equals("Div");
                                if (_equals_52) {
                                  Div div_1 = ((Div) o);
                                  operacion _right_14 = div_1.getRight();
                                  String tipoRight_14 = this.getTipoOperador(_right_14);
                                  operacion _left_14 = div_1.getLeft();
                                  String tipoLeft_14 = this.getTipoOperador(_left_14);
                                  boolean _equals_53 = tipoRight_14.equals(tipoLeft_14);
                                  if (_equals_53) {
                                    return tipoRight_14;
                                  } else {
                                    if ((tipoRight_14.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_14.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                      ResourceBundle _bundle_36 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                      return _bundle_36.getString("TIPO_CADENA");
                                    } else {
                                      if ((tipoRight_14.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_14.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                        ResourceBundle _bundle_37 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                        return _bundle_37.getString("TIPO_REAL");
                                      }
                                    }
                                  }
                                } else {
                                  EClass _eClass_33 = o.eClass();
                                  String _name_33 = _eClass_33.getName();
                                  boolean _equals_54 = _name_33.equals("Mod");
                                  if (_equals_54) {
                                    Mod mod_1 = ((Mod) o);
                                    operacion _right_15 = mod_1.getRight();
                                    String tipoRight_15 = this.getTipoOperador(_right_15);
                                    operacion _left_15 = mod_1.getLeft();
                                    String tipoLeft_15 = this.getTipoOperador(_left_15);
                                    boolean _equals_55 = tipoRight_15.equals(tipoLeft_15);
                                    if (_equals_55) {
                                      return tipoRight_15;
                                    } else {
                                      if ((tipoRight_15.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_15.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                        ResourceBundle _bundle_38 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                        return _bundle_38.getString("TIPO_CADENA");
                                      } else {
                                        if ((tipoRight_15.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_15.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                          ResourceBundle _bundle_39 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                          return _bundle_39.getString("TIPO_REAL");
                                        }
                                      }
                                    }
                                  } else {
                                    EClass _eClass_34 = o.eClass();
                                    String _name_34 = _eClass_34.getName();
                                    boolean _equals_56 = _name_34.equals("Or");
                                    if (_equals_56) {
                                      Or or_1 = ((Or) o);
                                      operacion _right_16 = or_1.getRight();
                                      String tipoRight_16 = this.getTipoOperador(_right_16);
                                      operacion _left_16 = or_1.getLeft();
                                      String tipoLeft_16 = this.getTipoOperador(_left_16);
                                      boolean _equals_57 = tipoRight_16.equals(tipoLeft_16);
                                      if (_equals_57) {
                                        return tipoRight_16;
                                      } else {
                                        if ((tipoRight_16.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_16.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                          ResourceBundle _bundle_40 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                          return _bundle_40.getString("TIPO_CADENA");
                                        } else {
                                          if ((tipoRight_16.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_16.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                            ResourceBundle _bundle_41 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                            return _bundle_41.getString("TIPO_REAL");
                                          }
                                        }
                                      }
                                    } else {
                                      EClass _eClass_35 = o.eClass();
                                      String _name_35 = _eClass_35.getName();
                                      boolean _equals_58 = _name_35.equals("And");
                                      if (_equals_58) {
                                        And and_1 = ((And) o);
                                        operacion _right_17 = and_1.getRight();
                                        String tipoRight_17 = this.getTipoOperador(_right_17);
                                        operacion _left_17 = and_1.getLeft();
                                        String tipoLeft_17 = this.getTipoOperador(_left_17);
                                        boolean _equals_59 = tipoRight_17.equals(tipoLeft_17);
                                        if (_equals_59) {
                                          return tipoRight_17;
                                        } else {
                                          if ((tipoRight_17.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_17.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                            ResourceBundle _bundle_42 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                            return _bundle_42.getString("TIPO_CADENA");
                                          } else {
                                            if ((tipoRight_17.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_17.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                              ResourceBundle _bundle_43 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                              return _bundle_43.getString("TIPO_REAL");
                                            }
                                          }
                                        }
                                      } else {
                                        EClass _eClass_36 = o.eClass();
                                        String _name_36 = _eClass_36.getName();
                                        boolean _equals_60 = _name_36.equals("Comparacion");
                                        if (_equals_60) {
                                          Comparacion comparacion_1 = ((Comparacion) o);
                                          operacion _right_18 = comparacion_1.getRight();
                                          String tipoRight_18 = this.getTipoOperador(_right_18);
                                          operacion _left_18 = comparacion_1.getLeft();
                                          String tipoLeft_18 = this.getTipoOperador(_left_18);
                                          boolean _equals_61 = tipoRight_18.equals(tipoLeft_18);
                                          if (_equals_61) {
                                            return tipoRight_18;
                                          } else {
                                            if ((tipoRight_18.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_18.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                              ResourceBundle _bundle_44 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                              return _bundle_44.getString("TIPO_CADENA");
                                            } else {
                                              if ((tipoRight_18.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_18.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                                ResourceBundle _bundle_45 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                return _bundle_45.getString("TIPO_REAL");
                                              }
                                            }
                                          }
                                        } else {
                                          EClass _eClass_37 = o.eClass();
                                          String _name_37 = _eClass_37.getName();
                                          boolean _equals_62 = _name_37.equals("Igualdad");
                                          if (_equals_62) {
                                            Igualdad igualdad_1 = ((Igualdad) o);
                                            operacion _right_19 = igualdad_1.getRight();
                                            String tipoRight_19 = this.getTipoOperador(_right_19);
                                            operacion _left_19 = igualdad_1.getLeft();
                                            String tipoLeft_19 = this.getTipoOperador(_left_19);
                                            boolean _equals_63 = tipoRight_19.equals(tipoLeft_19);
                                            if (_equals_63) {
                                              return tipoRight_19;
                                            } else {
                                              if ((tipoRight_19.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoLeft_19.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_CADENA")))) {
                                                ResourceBundle _bundle_46 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                return _bundle_46.getString("TIPO_CADENA");
                                              } else {
                                                if ((tipoRight_19.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")) || tipoLeft_19.equals(VaryGrammarGeneratorCPP.readerMessages.getBundle().getString("TIPO_REAL")))) {
                                                  ResourceBundle _bundle_47 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                                                  return _bundle_47.getString("TIPO_REAL");
                                                }
                                              }
                                            }
                                          } else {
                                            EClass _eClass_38 = o.eClass();
                                            String _name_38 = _eClass_38.getName();
                                            boolean _equals_64 = _name_38.equals("OperacionParentesis");
                                            if (_equals_64) {
                                              OperacionParentesis operacionParentesis_1 = ((OperacionParentesis) o);
                                              operacion _valor_operacion_1 = operacionParentesis_1.getValor_operacion();
                                              return this.getTipoOperador(_valor_operacion_1);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public String generaParametros(final EList<operacion> operaciones) {
    String total = "";
    int actual = 1;
    for (final operacion op : operaciones) {
      {
        if ((actual != 1)) {
          total = (total + ", ");
        }
        CharSequence _generate = this.generate(op);
        String _plus = (total + _generate);
        total = _plus;
        actual = (actual + 1);
      }
    }
    return total;
  }
  
  public String generaParametrosPunteros(final EList<operacion> operaciones, final String nombreSubproceso) {
    String total = "";
    int actual = 1;
    for (final operacion op : operaciones) {
      {
        if ((actual != 1)) {
          total = (total + ", ");
        }
        ArrayList<Integer> _get = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(nombreSubproceso);
        boolean _contains = _get.contains(Integer.valueOf(actual));
        if (_contains) {
          CharSequence _generate = this.generate(op);
          String _plus = ((total + "&") + _generate);
          total = _plus;
          actual = (actual + 1);
        } else {
          CharSequence _generate_1 = this.generate(op);
          String _plus_1 = (total + _generate_1);
          total = _plus_1;
          actual = (actual + 1);
        }
      }
    }
    return total;
  }
  
  @Override
  public CharSequence generate(final LlamadaFuncion fun, final boolean a) {
    CharSequence _xblockexpression = null;
    {
      String nombreModulo = new String();
      nombreModulo = "";
      boolean _notEquals = (!Objects.equal(this.algoritmo, null));
      if (_notEquals) {
        EList<Modulo> _importaciones = this.algoritmo.getImportaciones();
        for (final Modulo m : _importaciones) {
          EList<CabeceraSubproceso> _exporta_funciones = m.getExporta_funciones();
          for (final CabeceraSubproceso cabecera : _exporta_funciones) {
            if ((cabecera instanceof CabeceraProcedimiento)) {
              CabeceraProcedimiento cabeceraProc = ((CabeceraProcedimiento) cabecera);
              if ((fun.getNombre().equals(cabeceraProc.getNombre()) && (fun.getOperadores().size() == cabeceraProc.getParametrofuncion().size()))) {
                String _nombre = m.getNombre();
                nombreModulo = _nombre;
              }
            } else {
              if ((cabecera instanceof CabeceraFuncion)) {
                CabeceraFuncion cabeceraFun = ((CabeceraFuncion) cabecera);
                if ((fun.getNombre().equals(cabeceraFun.getNombre()) && (fun.getOperadores().size() == cabeceraFun.getParametrofuncion().size()))) {
                  String _nombre_1 = m.getNombre();
                  nombreModulo = _nombre_1;
                }
              }
            }
          }
        }
      } else {
        boolean _notEquals_1 = (!Objects.equal(this.modulo, null));
        if (_notEquals_1) {
          EList<Modulo> _importaciones_1 = this.modulo.getImportaciones();
          for (final Modulo m_1 : _importaciones_1) {
            EList<CabeceraSubproceso> _exporta_funciones_1 = m_1.getExporta_funciones();
            for (final CabeceraSubproceso cabecera_1 : _exporta_funciones_1) {
              if ((cabecera_1 instanceof CabeceraProcedimiento)) {
                CabeceraProcedimiento cabeceraProc_1 = ((CabeceraProcedimiento) cabecera_1);
                if ((fun.getNombre().equals(cabeceraProc_1.getNombre()) && (fun.getOperadores().size() == cabeceraProc_1.getParametrofuncion().size()))) {
                  String _nombre_2 = m_1.getNombre();
                  nombreModulo = _nombre_2;
                }
              } else {
                if ((cabecera_1 instanceof CabeceraFuncion)) {
                  CabeceraFuncion cabeceraFun_1 = ((CabeceraFuncion) cabecera_1);
                  if ((fun.getNombre().equals(cabeceraFun_1.getNombre()) && (fun.getOperadores().size() == cabeceraFun_1.getParametrofuncion().size()))) {
                    String _nombre_3 = m_1.getNombre();
                    nombreModulo = _nombre_3;
                  }
                }
              }
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _equals = nombreModulo.equals("");
        boolean _not = (!_equals);
        if (_not) {
          _builder.newLineIfNotEmpty();
          _builder.append("ref");
          _builder.append(nombreModulo, "");
          _builder.append(".");
          String _nombre_4 = fun.getNombre();
          _builder.append(_nombre_4, "");
          {
            String _nombre_5 = fun.getNombre();
            ArrayList<Integer> _get = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_5);
            int _size = _get.size();
            boolean _equals_1 = (_size == 0);
            if (_equals_1) {
              EList<operacion> _operadores = fun.getOperadores();
              String _generaParametros = this.generaParametros(_operadores);
              _builder.append(_generaParametros, "");
            } else {
              EList<operacion> _operadores_1 = fun.getOperadores();
              String _nombre_6 = fun.getNombre();
              String _generaParametrosPunteros = this.generaParametrosPunteros(_operadores_1, _nombre_6);
              _builder.append(_generaParametrosPunteros, "");
            }
          }
          _builder.append(")");
          {
            if (a) {
              _builder.append(";");
            }
          }
          _builder.newLineIfNotEmpty();
        } else {
          String _nombre_7 = fun.getNombre();
          _builder.append(_nombre_7, "");
          {
            String _nombre_8 = fun.getNombre();
            ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_8);
            int _size_1 = _get_1.size();
            boolean _equals_2 = (_size_1 == 0);
            if (_equals_2) {
              EList<operacion> _operadores_2 = fun.getOperadores();
              String _generaParametros_1 = this.generaParametros(_operadores_2);
              _builder.append(_generaParametros_1, "");
            } else {
              EList<operacion> _operadores_3 = fun.getOperadores();
              String _nombre_9 = fun.getNombre();
              String _generaParametrosPunteros_1 = this.generaParametrosPunteros(_operadores_3, _nombre_9);
              _builder.append(_generaParametrosPunteros_1, "");
            }
          }
          _builder.append(")");
          {
            if (a) {
              _builder.append(";");
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generate(final Operador op) {
    CharSequence _xifexpression = null;
    EClass _eClass = op.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) op);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) op);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) op);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) op);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) op);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) op);
                  _xblockexpression_5 = this.generate(prueba);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = op.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("ValorRegistro");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    ValorRegistro prueba = new ValorRegistroImpl();
                    prueba = ((ValorRegistro) op);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = op.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("ValorVector");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      ValorVector prueba = new ValorVectorImpl();
                      prueba = ((ValorVector) op);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = op.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("ValorMatriz");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        ValorMatriz prueba = new ValorMatrizImpl();
                        prueba = ((ValorMatriz) op);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generatePunteros(final Operador op, final List<String> punteros) {
    CharSequence _xifexpression = null;
    EClass _eClass = op.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) op);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) op);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) op);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) op);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) op);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) op);
                  CharSequence _xifexpression_6 = null;
                  String _nombre = prueba.getNombre();
                  boolean _contains = punteros.contains(_nombre);
                  if (_contains) {
                    _xifexpression_6 = this.generatePunteros(prueba);
                  } else {
                    _xifexpression_6 = this.generate(prueba);
                  }
                  _xblockexpression_5 = _xifexpression_6;
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = op.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("ValorRegistro");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    ValorRegistro prueba = new ValorRegistroImpl();
                    prueba = ((ValorRegistro) op);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = op.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("ValorVector");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      ValorVector prueba = new ValorVectorImpl();
                      prueba = ((ValorVector) op);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = op.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("ValorMatriz");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        ValorMatriz prueba = new ValorMatrizImpl();
                        prueba = ((ValorMatriz) op);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final operacion op) {
    CharSequence _xifexpression = null;
    EClass _eClass = op.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) op);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) op);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) op);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) op);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) op);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) op);
                  _xblockexpression_5 = this.generate(prueba);
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = op.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("ValorRegistro");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    ValorRegistro prueba = new ValorRegistroImpl();
                    prueba = ((ValorRegistro) op);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = op.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("ValorVector");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      ValorVector prueba = new ValorVectorImpl();
                      prueba = ((ValorVector) op);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = op.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("ValorMatriz");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        ValorMatriz prueba = new ValorMatrizImpl();
                        prueba = ((ValorMatriz) op);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = op.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("LlamadaFuncion");
                      if (_equals_9) {
                        CharSequence _xblockexpression_9 = null;
                        {
                          LlamadaFuncion prueba = new LlamadaFuncionImpl();
                          prueba = ((LlamadaFuncion) op);
                          _xblockexpression_9 = this.generate(prueba, false);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = op.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Internas");
                        if (_equals_10) {
                          CharSequence _xblockexpression_10 = null;
                          {
                            Internas prueba = new InternasImpl();
                            prueba = ((Internas) op);
                            _xblockexpression_10 = this.generate(prueba, false);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = op.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Suma");
                          if (_equals_11) {
                            CharSequence _xblockexpression_11 = null;
                            {
                              Suma prueba = new SumaImpl();
                              prueba = ((Suma) op);
                              _xblockexpression_11 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = op.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("Resta");
                            if (_equals_12) {
                              CharSequence _xblockexpression_12 = null;
                              {
                                Resta prueba = new RestaImpl();
                                prueba = ((Resta) op);
                                _xblockexpression_12 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_12;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = op.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("Multiplicacion");
                              if (_equals_13) {
                                CharSequence _xblockexpression_13 = null;
                                {
                                  Multiplicacion prueba = new MultiplicacionImpl();
                                  prueba = ((Multiplicacion) op);
                                  _xblockexpression_13 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_13;
                              } else {
                                CharSequence _xifexpression_14 = null;
                                EClass _eClass_14 = op.eClass();
                                String _name_14 = _eClass_14.getName();
                                boolean _equals_14 = _name_14.equals("Division");
                                if (_equals_14) {
                                  CharSequence _xblockexpression_14 = null;
                                  {
                                    Division prueba = new DivisionImpl();
                                    prueba = ((Division) op);
                                    _xblockexpression_14 = this.generate(prueba);
                                  }
                                  _xifexpression_14 = _xblockexpression_14;
                                } else {
                                  CharSequence _xifexpression_15 = null;
                                  EClass _eClass_15 = op.eClass();
                                  String _name_15 = _eClass_15.getName();
                                  boolean _equals_15 = _name_15.equals("Div");
                                  if (_equals_15) {
                                    String _xblockexpression_15 = null;
                                    {
                                      Div prueba = new DivImpl();
                                      prueba = ((Div) op);
                                      _xblockexpression_15 = this.generate(prueba);
                                    }
                                    _xifexpression_15 = _xblockexpression_15;
                                  } else {
                                    CharSequence _xifexpression_16 = null;
                                    EClass _eClass_16 = op.eClass();
                                    String _name_16 = _eClass_16.getName();
                                    boolean _equals_16 = _name_16.equals("Mod");
                                    if (_equals_16) {
                                      String _xblockexpression_16 = null;
                                      {
                                        Mod prueba = new ModImpl();
                                        prueba = ((Mod) op);
                                        _xblockexpression_16 = this.generate(prueba);
                                      }
                                      _xifexpression_16 = _xblockexpression_16;
                                    } else {
                                      CharSequence _xifexpression_17 = null;
                                      EClass _eClass_17 = op.eClass();
                                      String _name_17 = _eClass_17.getName();
                                      boolean _equals_17 = _name_17.equals("OperacionParentesis");
                                      if (_equals_17) {
                                        String _xblockexpression_17 = null;
                                        {
                                          OperacionParentesis prueba = new OperacionParentesisImpl();
                                          prueba = ((OperacionParentesis) op);
                                          _xblockexpression_17 = this.generate(prueba);
                                        }
                                        _xifexpression_17 = _xblockexpression_17;
                                      } else {
                                        CharSequence _xifexpression_18 = null;
                                        EClass _eClass_18 = op.eClass();
                                        String _name_18 = _eClass_18.getName();
                                        boolean _equals_18 = _name_18.equals("Or");
                                        if (_equals_18) {
                                          CharSequence _xblockexpression_18 = null;
                                          {
                                            Or prueba = new OrImpl();
                                            prueba = ((Or) op);
                                            _xblockexpression_18 = this.generate(prueba);
                                          }
                                          _xifexpression_18 = _xblockexpression_18;
                                        } else {
                                          CharSequence _xifexpression_19 = null;
                                          EClass _eClass_19 = op.eClass();
                                          String _name_19 = _eClass_19.getName();
                                          boolean _equals_19 = _name_19.equals("And");
                                          if (_equals_19) {
                                            CharSequence _xblockexpression_19 = null;
                                            {
                                              And prueba = new AndImpl();
                                              prueba = ((And) op);
                                              _xblockexpression_19 = this.generate(prueba);
                                            }
                                            _xifexpression_19 = _xblockexpression_19;
                                          } else {
                                            CharSequence _xifexpression_20 = null;
                                            EClass _eClass_20 = op.eClass();
                                            String _name_20 = _eClass_20.getName();
                                            boolean _equals_20 = _name_20.equals("Comparacion");
                                            if (_equals_20) {
                                              CharSequence _xblockexpression_20 = null;
                                              {
                                                Comparacion prueba = new ComparacionImpl();
                                                prueba = ((Comparacion) op);
                                                _xblockexpression_20 = this.generate(prueba);
                                              }
                                              _xifexpression_20 = _xblockexpression_20;
                                            } else {
                                              CharSequence _xifexpression_21 = null;
                                              EClass _eClass_21 = op.eClass();
                                              String _name_21 = _eClass_21.getName();
                                              boolean _equals_21 = _name_21.equals("Igualdad");
                                              if (_equals_21) {
                                                CharSequence _xblockexpression_21 = null;
                                                {
                                                  Igualdad prueba = new IgualdadImpl();
                                                  prueba = ((Igualdad) op);
                                                  _xblockexpression_21 = this.generate(prueba);
                                                }
                                                _xifexpression_21 = _xblockexpression_21;
                                              } else {
                                                String _xifexpression_22 = null;
                                                EClass _eClass_22 = op.eClass();
                                                String _name_22 = _eClass_22.getName();
                                                boolean _equals_22 = _name_22.equals("OperacionCompleta");
                                                if (_equals_22) {
                                                  String _xblockexpression_22 = null;
                                                  {
                                                    OperacionCompleta prueba = new OperacionCompletaImpl();
                                                    prueba = ((OperacionCompleta) op);
                                                    _xblockexpression_22 = this.generate(prueba);
                                                  }
                                                  _xifexpression_22 = _xblockexpression_22;
                                                }
                                                _xifexpression_21 = _xifexpression_22;
                                              }
                                              _xifexpression_20 = _xifexpression_21;
                                            }
                                            _xifexpression_19 = _xifexpression_20;
                                          }
                                          _xifexpression_18 = _xifexpression_19;
                                        }
                                        _xifexpression_17 = _xifexpression_18;
                                      }
                                      _xifexpression_16 = _xifexpression_17;
                                    }
                                    _xifexpression_15 = _xifexpression_16;
                                  }
                                  _xifexpression_14 = _xifexpression_15;
                                }
                                _xifexpression_13 = _xifexpression_14;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Object generate(final operacion op, final List<String> punteros) {
    Object _xifexpression = null;
    EClass _eClass = op.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) op);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      Object _xifexpression_1 = null;
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) op);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        Object _xifexpression_2 = null;
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) op);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          Object _xifexpression_3 = null;
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) op);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            Object _xifexpression_4 = null;
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) op);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              Object _xifexpression_5 = null;
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) op);
                  CharSequence _xifexpression_6 = null;
                  String _nombre = prueba.getNombre();
                  boolean _contains = punteros.contains(_nombre);
                  if (_contains) {
                    CharSequence _generate = this.generate(prueba);
                    String _plus = ("*(" + _generate);
                    return (_plus + ")");
                  } else {
                    _xifexpression_6 = this.generate(prueba);
                  }
                  _xblockexpression_5 = _xifexpression_6;
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                Object _xifexpression_6 = null;
                EClass _eClass_6 = op.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("ValorRegistro");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    ValorRegistro prueba = new ValorRegistroImpl();
                    prueba = ((ValorRegistro) op);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  Object _xifexpression_7 = null;
                  EClass _eClass_7 = op.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("ValorVector");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      ValorVector prueba = new ValorVectorImpl();
                      prueba = ((ValorVector) op);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    Object _xifexpression_8 = null;
                    EClass _eClass_8 = op.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("ValorMatriz");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        ValorMatriz prueba = new ValorMatrizImpl();
                        prueba = ((ValorMatriz) op);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      Object _xifexpression_9 = null;
                      EClass _eClass_9 = op.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("LlamadaFuncion");
                      if (_equals_9) {
                        CharSequence _xblockexpression_9 = null;
                        {
                          LlamadaFuncion prueba = new LlamadaFuncionImpl();
                          prueba = ((LlamadaFuncion) op);
                          _xblockexpression_9 = this.generate(prueba, false);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        Object _xifexpression_10 = null;
                        EClass _eClass_10 = op.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Internas");
                        if (_equals_10) {
                          CharSequence _xblockexpression_10 = null;
                          {
                            Internas prueba = new InternasImpl();
                            prueba = ((Internas) op);
                            _xblockexpression_10 = this.generate(prueba, false);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          Object _xifexpression_11 = null;
                          EClass _eClass_11 = op.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Suma");
                          if (_equals_11) {
                            String _xblockexpression_11 = null;
                            {
                              Suma prueba = new SumaImpl();
                              prueba = ((Suma) op);
                              _xblockexpression_11 = this.generate(prueba, punteros);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            Object _xifexpression_12 = null;
                            EClass _eClass_12 = op.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("Resta");
                            if (_equals_12) {
                              String _xblockexpression_12 = null;
                              {
                                Resta prueba = new RestaImpl();
                                prueba = ((Resta) op);
                                _xblockexpression_12 = this.generate(prueba, punteros);
                              }
                              _xifexpression_12 = _xblockexpression_12;
                            } else {
                              Object _xifexpression_13 = null;
                              EClass _eClass_13 = op.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("Multiplicacion");
                              if (_equals_13) {
                                String _xblockexpression_13 = null;
                                {
                                  Multiplicacion prueba = new MultiplicacionImpl();
                                  prueba = ((Multiplicacion) op);
                                  _xblockexpression_13 = this.generate(prueba, punteros);
                                }
                                _xifexpression_13 = _xblockexpression_13;
                              } else {
                                Object _xifexpression_14 = null;
                                EClass _eClass_14 = op.eClass();
                                String _name_14 = _eClass_14.getName();
                                boolean _equals_14 = _name_14.equals("Division");
                                if (_equals_14) {
                                  String _xblockexpression_14 = null;
                                  {
                                    Division prueba = new DivisionImpl();
                                    prueba = ((Division) op);
                                    _xblockexpression_14 = this.generate(prueba, punteros);
                                  }
                                  _xifexpression_14 = _xblockexpression_14;
                                } else {
                                  Object _xifexpression_15 = null;
                                  EClass _eClass_15 = op.eClass();
                                  String _name_15 = _eClass_15.getName();
                                  boolean _equals_15 = _name_15.equals("Div");
                                  if (_equals_15) {
                                    String _xblockexpression_15 = null;
                                    {
                                      Div prueba = new DivImpl();
                                      prueba = ((Div) op);
                                      _xblockexpression_15 = this.generate(prueba, punteros);
                                    }
                                    _xifexpression_15 = _xblockexpression_15;
                                  } else {
                                    Object _xifexpression_16 = null;
                                    EClass _eClass_16 = op.eClass();
                                    String _name_16 = _eClass_16.getName();
                                    boolean _equals_16 = _name_16.equals("Mod");
                                    if (_equals_16) {
                                      String _xblockexpression_16 = null;
                                      {
                                        Mod prueba = new ModImpl();
                                        prueba = ((Mod) op);
                                        _xblockexpression_16 = this.generate(prueba, punteros);
                                      }
                                      _xifexpression_16 = _xblockexpression_16;
                                    } else {
                                      Object _xifexpression_17 = null;
                                      EClass _eClass_17 = op.eClass();
                                      String _name_17 = _eClass_17.getName();
                                      boolean _equals_17 = _name_17.equals("OperacionParentesis");
                                      if (_equals_17) {
                                        Object _xblockexpression_17 = null;
                                        {
                                          OperacionParentesis prueba = new OperacionParentesisImpl();
                                          prueba = ((OperacionParentesis) op);
                                          _xblockexpression_17 = this.generate(prueba, punteros);
                                        }
                                        _xifexpression_17 = _xblockexpression_17;
                                      } else {
                                        String _xifexpression_18 = null;
                                        EClass _eClass_18 = op.eClass();
                                        String _name_18 = _eClass_18.getName();
                                        boolean _equals_18 = _name_18.equals("Or");
                                        if (_equals_18) {
                                          String _xblockexpression_18 = null;
                                          {
                                            Or prueba = new OrImpl();
                                            prueba = ((Or) op);
                                            _xblockexpression_18 = this.generate(prueba, punteros);
                                          }
                                          _xifexpression_18 = _xblockexpression_18;
                                        } else {
                                          String _xifexpression_19 = null;
                                          EClass _eClass_19 = op.eClass();
                                          String _name_19 = _eClass_19.getName();
                                          boolean _equals_19 = _name_19.equals("And");
                                          if (_equals_19) {
                                            String _xblockexpression_19 = null;
                                            {
                                              And prueba = new AndImpl();
                                              prueba = ((And) op);
                                              _xblockexpression_19 = this.generate(prueba, punteros);
                                            }
                                            _xifexpression_19 = _xblockexpression_19;
                                          } else {
                                            String _xifexpression_20 = null;
                                            EClass _eClass_20 = op.eClass();
                                            String _name_20 = _eClass_20.getName();
                                            boolean _equals_20 = _name_20.equals("Comparacion");
                                            if (_equals_20) {
                                              String _xblockexpression_20 = null;
                                              {
                                                Comparacion prueba = new ComparacionImpl();
                                                prueba = ((Comparacion) op);
                                                _xblockexpression_20 = this.generate(prueba, punteros);
                                              }
                                              _xifexpression_20 = _xblockexpression_20;
                                            } else {
                                              String _xifexpression_21 = null;
                                              EClass _eClass_21 = op.eClass();
                                              String _name_21 = _eClass_21.getName();
                                              boolean _equals_21 = _name_21.equals("Igualdad");
                                              if (_equals_21) {
                                                String _xblockexpression_21 = null;
                                                {
                                                  Igualdad prueba = new IgualdadImpl();
                                                  prueba = ((Igualdad) op);
                                                  _xblockexpression_21 = this.generate(prueba, punteros);
                                                }
                                                _xifexpression_21 = _xblockexpression_21;
                                              } else {
                                                String _xifexpression_22 = null;
                                                EClass _eClass_22 = op.eClass();
                                                String _name_22 = _eClass_22.getName();
                                                boolean _equals_22 = _name_22.equals("OperacionCompleta");
                                                if (_equals_22) {
                                                  String _xblockexpression_22 = null;
                                                  {
                                                    OperacionCompleta prueba = new OperacionCompletaImpl();
                                                    prueba = ((OperacionCompleta) op);
                                                    _xblockexpression_22 = this.generate(prueba, punteros);
                                                  }
                                                  _xifexpression_22 = _xblockexpression_22;
                                                }
                                                _xifexpression_21 = _xifexpression_22;
                                              }
                                              _xifexpression_20 = _xifexpression_21;
                                            }
                                            _xifexpression_19 = _xifexpression_20;
                                          }
                                          _xifexpression_18 = _xifexpression_19;
                                        }
                                        _xifexpression_17 = _xifexpression_18;
                                      }
                                      _xifexpression_16 = _xifexpression_17;
                                    }
                                    _xifexpression_15 = _xifexpression_16;
                                  }
                                  _xifexpression_14 = _xifexpression_15;
                                }
                                _xifexpression_13 = _xifexpression_14;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generatePunteros(final operacion op, final List<String> punteros) {
    CharSequence _xifexpression = null;
    EClass _eClass = op.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("NumeroEntero");
    if (_equals) {
      CharSequence _xblockexpression = null;
      {
        NumeroEntero prueba = new NumeroEnteroImpl();
        prueba = ((NumeroEntero) op);
        _xblockexpression = this.generate(prueba);
      }
      _xifexpression = _xblockexpression;
    } else {
      CharSequence _xifexpression_1 = null;
      EClass _eClass_1 = op.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("NumeroDecimal");
      if (_equals_1) {
        CharSequence _xblockexpression_1 = null;
        {
          NumeroDecimal prueba = new NumeroDecimalImpl();
          prueba = ((NumeroDecimal) op);
          _xblockexpression_1 = this.generate(prueba);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        EClass _eClass_2 = op.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorBooleano");
        if (_equals_2) {
          CharSequence _xblockexpression_2 = null;
          {
            ValorBooleano prueba = new ValorBooleanoImpl();
            prueba = ((ValorBooleano) op);
            _xblockexpression_2 = this.generate(prueba);
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          CharSequence _xifexpression_3 = null;
          EClass _eClass_3 = op.eClass();
          String _name_3 = _eClass_3.getName();
          boolean _equals_3 = _name_3.equals("ConstCadena");
          if (_equals_3) {
            CharSequence _xblockexpression_3 = null;
            {
              ConstCadena prueba = new ConstCadenaImpl();
              prueba = ((ConstCadena) op);
              _xblockexpression_3 = this.generate(prueba);
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            CharSequence _xifexpression_4 = null;
            EClass _eClass_4 = op.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Caracter");
            if (_equals_4) {
              CharSequence _xblockexpression_4 = null;
              {
                Caracter prueba = new CaracterImpl();
                prueba = ((Caracter) op);
                _xblockexpression_4 = this.generate(prueba);
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              CharSequence _xifexpression_5 = null;
              EClass _eClass_5 = op.eClass();
              String _name_5 = _eClass_5.getName();
              boolean _equals_5 = _name_5.equals("VariableID");
              if (_equals_5) {
                CharSequence _xblockexpression_5 = null;
                {
                  VariableID prueba = new VariableIDImpl();
                  prueba = ((VariableID) op);
                  CharSequence _xifexpression_6 = null;
                  String _nombre = prueba.getNombre();
                  boolean _contains = punteros.contains(_nombre);
                  if (_contains) {
                    _xifexpression_6 = this.generatePunteros(prueba);
                  } else {
                    _xifexpression_6 = this.generate(prueba);
                  }
                  _xblockexpression_5 = _xifexpression_6;
                }
                _xifexpression_5 = _xblockexpression_5;
              } else {
                CharSequence _xifexpression_6 = null;
                EClass _eClass_6 = op.eClass();
                String _name_6 = _eClass_6.getName();
                boolean _equals_6 = _name_6.equals("ValorRegistro");
                if (_equals_6) {
                  CharSequence _xblockexpression_6 = null;
                  {
                    ValorRegistro prueba = new ValorRegistroImpl();
                    prueba = ((ValorRegistro) op);
                    _xblockexpression_6 = this.generate(prueba);
                  }
                  _xifexpression_6 = _xblockexpression_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  EClass _eClass_7 = op.eClass();
                  String _name_7 = _eClass_7.getName();
                  boolean _equals_7 = _name_7.equals("ValorVector");
                  if (_equals_7) {
                    CharSequence _xblockexpression_7 = null;
                    {
                      ValorVector prueba = new ValorVectorImpl();
                      prueba = ((ValorVector) op);
                      _xblockexpression_7 = this.generate(prueba);
                    }
                    _xifexpression_7 = _xblockexpression_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    EClass _eClass_8 = op.eClass();
                    String _name_8 = _eClass_8.getName();
                    boolean _equals_8 = _name_8.equals("ValorMatriz");
                    if (_equals_8) {
                      CharSequence _xblockexpression_8 = null;
                      {
                        ValorMatriz prueba = new ValorMatrizImpl();
                        prueba = ((ValorMatriz) op);
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = op.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("LlamadaFuncion");
                      if (_equals_9) {
                        CharSequence _xblockexpression_9 = null;
                        {
                          LlamadaFuncion prueba = new LlamadaFuncionImpl();
                          prueba = ((LlamadaFuncion) op);
                          _xblockexpression_9 = this.generate(prueba, false);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = op.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Internas");
                        if (_equals_10) {
                          CharSequence _xblockexpression_10 = null;
                          {
                            Internas prueba = new InternasImpl();
                            prueba = ((Internas) op);
                            _xblockexpression_10 = this.generate(prueba, false);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = op.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Suma");
                          if (_equals_11) {
                            CharSequence _xblockexpression_11 = null;
                            {
                              Suma prueba = new SumaImpl();
                              prueba = ((Suma) op);
                              _xblockexpression_11 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = op.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("Resta");
                            if (_equals_12) {
                              CharSequence _xblockexpression_12 = null;
                              {
                                Resta prueba = new RestaImpl();
                                prueba = ((Resta) op);
                                _xblockexpression_12 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_12;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = op.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("Multiplicacion");
                              if (_equals_13) {
                                CharSequence _xblockexpression_13 = null;
                                {
                                  Multiplicacion prueba = new MultiplicacionImpl();
                                  prueba = ((Multiplicacion) op);
                                  _xblockexpression_13 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_13;
                              } else {
                                CharSequence _xifexpression_14 = null;
                                EClass _eClass_14 = op.eClass();
                                String _name_14 = _eClass_14.getName();
                                boolean _equals_14 = _name_14.equals("Division");
                                if (_equals_14) {
                                  CharSequence _xblockexpression_14 = null;
                                  {
                                    Division prueba = new DivisionImpl();
                                    prueba = ((Division) op);
                                    _xblockexpression_14 = this.generate(prueba);
                                  }
                                  _xifexpression_14 = _xblockexpression_14;
                                } else {
                                  CharSequence _xifexpression_15 = null;
                                  EClass _eClass_15 = op.eClass();
                                  String _name_15 = _eClass_15.getName();
                                  boolean _equals_15 = _name_15.equals("Div");
                                  if (_equals_15) {
                                    String _xblockexpression_15 = null;
                                    {
                                      Div prueba = new DivImpl();
                                      prueba = ((Div) op);
                                      _xblockexpression_15 = this.generate(prueba);
                                    }
                                    _xifexpression_15 = _xblockexpression_15;
                                  } else {
                                    CharSequence _xifexpression_16 = null;
                                    EClass _eClass_16 = op.eClass();
                                    String _name_16 = _eClass_16.getName();
                                    boolean _equals_16 = _name_16.equals("Mod");
                                    if (_equals_16) {
                                      String _xblockexpression_16 = null;
                                      {
                                        Mod prueba = new ModImpl();
                                        prueba = ((Mod) op);
                                        _xblockexpression_16 = this.generate(prueba);
                                      }
                                      _xifexpression_16 = _xblockexpression_16;
                                    } else {
                                      CharSequence _xifexpression_17 = null;
                                      EClass _eClass_17 = op.eClass();
                                      String _name_17 = _eClass_17.getName();
                                      boolean _equals_17 = _name_17.equals("OperacionParentesis");
                                      if (_equals_17) {
                                        String _xblockexpression_17 = null;
                                        {
                                          OperacionParentesis prueba = new OperacionParentesisImpl();
                                          prueba = ((OperacionParentesis) op);
                                          _xblockexpression_17 = this.generate(prueba);
                                        }
                                        _xifexpression_17 = _xblockexpression_17;
                                      } else {
                                        CharSequence _xifexpression_18 = null;
                                        EClass _eClass_18 = op.eClass();
                                        String _name_18 = _eClass_18.getName();
                                        boolean _equals_18 = _name_18.equals("Or");
                                        if (_equals_18) {
                                          CharSequence _xblockexpression_18 = null;
                                          {
                                            Or prueba = new OrImpl();
                                            prueba = ((Or) op);
                                            _xblockexpression_18 = this.generate(prueba);
                                          }
                                          _xifexpression_18 = _xblockexpression_18;
                                        } else {
                                          CharSequence _xifexpression_19 = null;
                                          EClass _eClass_19 = op.eClass();
                                          String _name_19 = _eClass_19.getName();
                                          boolean _equals_19 = _name_19.equals("And");
                                          if (_equals_19) {
                                            CharSequence _xblockexpression_19 = null;
                                            {
                                              And prueba = new AndImpl();
                                              prueba = ((And) op);
                                              _xblockexpression_19 = this.generate(prueba);
                                            }
                                            _xifexpression_19 = _xblockexpression_19;
                                          } else {
                                            CharSequence _xifexpression_20 = null;
                                            EClass _eClass_20 = op.eClass();
                                            String _name_20 = _eClass_20.getName();
                                            boolean _equals_20 = _name_20.equals("Comparacion");
                                            if (_equals_20) {
                                              CharSequence _xblockexpression_20 = null;
                                              {
                                                Comparacion prueba = new ComparacionImpl();
                                                prueba = ((Comparacion) op);
                                                _xblockexpression_20 = this.generate(prueba);
                                              }
                                              _xifexpression_20 = _xblockexpression_20;
                                            } else {
                                              CharSequence _xifexpression_21 = null;
                                              EClass _eClass_21 = op.eClass();
                                              String _name_21 = _eClass_21.getName();
                                              boolean _equals_21 = _name_21.equals("Igualdad");
                                              if (_equals_21) {
                                                CharSequence _xblockexpression_21 = null;
                                                {
                                                  Igualdad prueba = new IgualdadImpl();
                                                  prueba = ((Igualdad) op);
                                                  _xblockexpression_21 = this.generate(prueba);
                                                }
                                                _xifexpression_21 = _xblockexpression_21;
                                              } else {
                                                Object _xifexpression_22 = null;
                                                EClass _eClass_22 = op.eClass();
                                                String _name_22 = _eClass_22.getName();
                                                boolean _equals_22 = _name_22.equals("Negativa");
                                                if (_equals_22) {
                                                  _xifexpression_22 = null;
                                                } else {
                                                  Object _xifexpression_23 = null;
                                                  EClass _eClass_23 = op.eClass();
                                                  String _name_23 = _eClass_23.getName();
                                                  boolean _equals_23 = _name_23.equals("Negacion");
                                                  if (_equals_23) {
                                                    _xifexpression_23 = null;
                                                  }
                                                  _xifexpression_22 = _xifexpression_23;
                                                }
                                                _xifexpression_21 = ((CharSequence)_xifexpression_22);
                                              }
                                              _xifexpression_20 = _xifexpression_21;
                                            }
                                            _xifexpression_19 = _xifexpression_20;
                                          }
                                          _xifexpression_18 = _xifexpression_19;
                                        }
                                        _xifexpression_17 = _xifexpression_18;
                                      }
                                      _xifexpression_16 = _xifexpression_17;
                                    }
                                    _xifexpression_15 = _xifexpression_16;
                                  }
                                  _xifexpression_14 = _xifexpression_15;
                                }
                                _xifexpression_13 = _xifexpression_14;
                              }
                              _xifexpression_12 = _xifexpression_13;
                            }
                            _xifexpression_11 = _xifexpression_12;
                          }
                          _xifexpression_10 = _xifexpression_11;
                        }
                        _xifexpression_9 = _xifexpression_10;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public CharSequence generate(final Suma mySuma) {
    operacion _left = mySuma.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = mySuma.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = mySuma.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = mySuma.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Suma mySuma, final List<String> punteros) {
    operacion _left = mySuma.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    signo _signo_op = mySuma.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = mySuma.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = mySuma.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Resta myResta) {
    operacion _left = myResta.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myResta.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myResta.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myResta.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Resta myResta, final List<String> punteros) {
    operacion _left = myResta.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    signo _signo_op = myResta.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myResta.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myResta.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Multiplicacion myMulti) {
    operacion _left = myMulti.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myMulti.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myMulti.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myMulti.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Multiplicacion myMulti, final List<String> punteros) {
    operacion _left = myMulti.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    signo _signo_op = myMulti.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myMulti.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myMulti.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Division myDivi) {
    operacion _left = myDivi.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myDivi.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myDivi.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myDivi.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final OperacionParentesis op) {
    EList<String> _negacionesIniciales = op.getNegacionesIniciales();
    String _generate = this.generate(_negacionesIniciales);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "(");
    EList<String> _negacionesFinales = op.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_2 = (_plus_1 + _generate_1);
    operacion _valor_operacion = op.getValor_operacion();
    CharSequence _generate_2 = this.generate(_valor_operacion);
    String _plus_3 = (_plus_2 + _generate_2);
    return (_plus_3 + ")");
  }
  
  public String generate(final OperacionParentesis op, final EList<String> punteros) {
    EList<String> _negacionesFinales = op.getNegacionesFinales();
    String _generate = this.generate(_negacionesFinales);
    String _plus = ("(" + _generate);
    String _plus_1 = (_plus + " ");
    operacion _valor_operacion = op.getValor_operacion();
    Object _generate_1 = this.generate(_valor_operacion, punteros);
    String _plus_2 = (_plus_1 + _generate_1);
    return (_plus_2 + ")");
  }
  
  public String generate(final Div myDivi) {
    operacion _left = myDivi.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " / ");
    EList<String> _negacionesFinales = myDivi.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_1 = (_plus + _generate_1);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myDivi.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_2 + _generate_2);
  }
  
  public String generate(final Div myDivi, final List<String> punteros) {
    operacion _left = myDivi.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " / ");
    EList<String> _negacionesFinales = myDivi.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_1 = (_plus + _generate_1);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myDivi.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_2 + _generate_2);
  }
  
  public String generate(final Mod myMod) {
    operacion _left = myMod.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "%");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myMod.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myMod.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Mod myMod, final List<String> punteros) {
    operacion _left = myMod.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "%");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myMod.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myMod.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Division myDivi, final List<String> punteros) {
    operacion _left = myDivi.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    signo _signo_op = myDivi.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myDivi.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myDivi.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Or myOr) {
    operacion _left = myOr.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "||");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myOr.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myOr.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Or myOr, final List<String> punteros) {
    operacion _left = myOr.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "||");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myOr.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myOr.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final And myAnd) {
    operacion _left = myAnd.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "&&");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myAnd.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myAnd.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final And myAnd, final List<String> punteros) {
    operacion _left = myAnd.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "&&");
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myAnd.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myAnd.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Comparacion myComparacion) {
    operacion _left = myComparacion.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myComparacion.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myComparacion.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myComparacion.getRight();
    CharSequence _generate_2 = this.generate(_right);
    return (_plus_4 + _generate_2);
  }
  
  public String generate(final Comparacion myComparacion, final List<String> punteros) {
    operacion _left = myComparacion.getLeft();
    Object _generate = this.generate(_left, punteros);
    String _plus = (_generate + " ");
    signo _signo_op = myComparacion.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    EList<String> _negacionesFinales = myComparacion.getNegacionesFinales();
    String _generate_1 = this.generate(_negacionesFinales);
    String _plus_3 = (_plus_2 + _generate_1);
    String _plus_4 = (_plus_3 + " ");
    operacion _right = myComparacion.getRight();
    Object _generate_2 = this.generate(_right, punteros);
    return (_plus_4 + _generate_2);
  }
  
  @Override
  public CharSequence generate(final Igualdad myIgualdad) {
    signo _signo_op = myIgualdad.getSigno_op();
    String _literal = _signo_op.getLiteral();
    boolean _equals = _literal.equals("=");
    if (_equals) {
      operacion _left = myIgualdad.getLeft();
      CharSequence _generate = this.generate(_left);
      String _plus = (_generate + " ");
      String _plus_1 = (_plus + "==");
      String _plus_2 = (_plus_1 + " ");
      EList<String> _negacionesFinales = myIgualdad.getNegacionesFinales();
      String _generate_1 = this.generate(_negacionesFinales);
      String _plus_3 = (_plus_2 + _generate_1);
      String _plus_4 = (_plus_3 + " ");
      operacion _right = myIgualdad.getRight();
      CharSequence _generate_2 = this.generate(_right);
      return (_plus_4 + _generate_2);
    } else {
      operacion _left_1 = myIgualdad.getLeft();
      CharSequence _generate_3 = this.generate(_left_1);
      String _plus_5 = (_generate_3 + " ");
      String _plus_6 = (_plus_5 + "!=");
      String _plus_7 = (_plus_6 + " ");
      EList<String> _negacionesFinales_1 = myIgualdad.getNegacionesFinales();
      String _generate_4 = this.generate(_negacionesFinales_1);
      String _plus_8 = (_plus_7 + _generate_4);
      String _plus_9 = (_plus_8 + " ");
      operacion _right_1 = myIgualdad.getRight();
      CharSequence _generate_5 = this.generate(_right_1);
      return (_plus_9 + _generate_5);
    }
  }
  
  public String generate(final Igualdad myIgualdad, final List<String> punteros) {
    signo _signo_op = myIgualdad.getSigno_op();
    String _literal = _signo_op.getLiteral();
    boolean _equals = _literal.equals("=");
    if (_equals) {
      operacion _left = myIgualdad.getLeft();
      Object _generate = this.generate(_left, punteros);
      String _plus = (_generate + " ");
      String _plus_1 = (_plus + "==");
      String _plus_2 = (_plus_1 + " ");
      EList<String> _negacionesFinales = myIgualdad.getNegacionesFinales();
      String _generate_1 = this.generate(_negacionesFinales);
      String _plus_3 = (_plus_2 + _generate_1);
      String _plus_4 = (_plus_3 + " ");
      operacion _right = myIgualdad.getRight();
      Object _generate_2 = this.generate(_right, punteros);
      return (_plus_4 + _generate_2);
    } else {
      operacion _left_1 = myIgualdad.getLeft();
      Object _generate_3 = this.generate(_left_1, punteros);
      String _plus_5 = (_generate_3 + " ");
      String _plus_6 = (_plus_5 + "!=");
      String _plus_7 = (_plus_6 + " ");
      EList<String> _negacionesFinales_1 = myIgualdad.getNegacionesFinales();
      String _generate_4 = this.generate(_negacionesFinales_1);
      String _plus_8 = (_plus_7 + _generate_4);
      String _plus_9 = (_plus_8 + " ");
      operacion _right_1 = myIgualdad.getRight();
      Object _generate_5 = this.generate(_right_1, punteros);
      return (_plus_9 + _generate_5);
    }
  }
  
  public String generate(final List<String> negaciones) {
    String negacionesString = "";
    for (final String negacion : negaciones) {
      boolean _equals = negacion.equals("no");
      if (_equals) {
        negacionesString = (negacionesString + "!");
      } else {
        negacionesString = (negacionesString + negacion);
      }
    }
    return negacionesString;
  }
  
  public String generate(final OperacionCompleta operacion) {
    EList<String> _negacionesIniciales = operacion.getNegacionesIniciales();
    String _generate = this.generate(_negacionesIniciales);
    String _plus = (_generate + " ");
    diagramapseudocodigo.operacion _valor_operacion = operacion.getValor_operacion();
    CharSequence _generate_1 = this.generate(_valor_operacion);
    return (_plus + _generate_1);
  }
  
  public String generate(final OperacionCompleta operacion, final List<String> punteros) {
    EList<String> _negacionesIniciales = operacion.getNegacionesIniciales();
    String _generate = this.generate(_negacionesIniciales);
    String _plus = (_generate + " ");
    diagramapseudocodigo.operacion _valor_operacion = operacion.getValor_operacion();
    Object _generate_1 = this.generate(_valor_operacion, punteros);
    return (_plus + _generate_1);
  }
  
  public CharSequence generateSiPunteros(final Si mySi, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    operacion _valor = mySi.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = mySi.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySi.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = mySi.getDevuelve();
        CharSequence _generate_1 = this.generate(_devuelve_1, punteros);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    {
      Sino _sino = mySi.getSino();
      boolean _notEquals_1 = (!Objects.equal(_sino, null));
      if (_notEquals_1) {
        Sino _sino_1 = mySi.getSino();
        CharSequence _generateSinoPunteros = this.generateSinoPunteros(_sino_1, punteros);
        _builder.append(_generateSinoPunteros, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Si mySi) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    operacion _valor = mySi.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = mySi.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(sent);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySi.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = mySi.getDevuelve();
        CharSequence _generate_2 = this.generate(_devuelve_1);
        _builder.append(_generate_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    {
      Sino _sino = mySi.getSino();
      boolean _notEquals_1 = (!Objects.equal(_sino, null));
      if (_notEquals_1) {
        Sino _sino_1 = mySi.getSino();
        CharSequence _generate_3 = this.generate(_sino_1);
        _builder.append(_generate_3, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateCasoPunteros(final Caso myCaso, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case ");
    operacion _operador = myCaso.getOperador();
    CharSequence _generate = this.generate(_operador);
    _builder.append(_generate, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = myCaso.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = myCaso.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = myCaso.getDevuelve();
        CharSequence _generate_1 = this.generate(_devuelve_1, punteros);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("break;");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Caso myCaso) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case ");
    operacion _operador = myCaso.getOperador();
    CharSequence _generate = this.generate(_operador);
    _builder.append(_generate, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = myCaso.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(sent);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = myCaso.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = myCaso.getDevuelve();
        CharSequence _generate_2 = this.generate(_devuelve_1);
        _builder.append(_generate_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("break;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSegunPunteros(final segun mySegun, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch(");
    operacion _valor = mySegun.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Caso> _caso = mySegun.getCaso();
      for(final Caso cas : _caso) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(cas);
        _builder.append(_generate_1, "\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = mySegun.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySegun.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t\t");
        Devolver _devuelve_1 = mySegun.getDevuelve();
        CharSequence _generate_2 = this.generate(_devuelve_1, punteros);
        _builder.append(_generate_2, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final segun mySegun) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch(");
    operacion _valor = mySegun.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Caso> _caso = mySegun.getCaso();
      for(final Caso cas : _caso) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(cas);
        _builder.append(_generate_1, "\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = mySegun.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t\t");
        CharSequence _generate_2 = this.generate(sent);
        _builder.append(_generate_2, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySegun.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t\t");
        Devolver _devuelve_1 = mySegun.getDevuelve();
        CharSequence _generate_3 = this.generate(_devuelve_1);
        _builder.append(_generate_3, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Devolver myDevuelve) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return ");
    operacion _devuelve = myDevuelve.getDevuelve();
    CharSequence _generate = this.generate(_devuelve);
    _builder.append(_generate, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generate(final Devolver myDevuelve, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return ");
    operacion _devuelve = myDevuelve.getDevuelve();
    Object _generate = this.generate(_devuelve, punteros);
    _builder.append(_generate, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateSinoPunteros(final Sino mySino, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("else{");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = mySino.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySino.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = mySino.getDevuelve();
        CharSequence _generate = this.generate(_devuelve_1, punteros);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final Sino mySino) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("else{");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = mySino.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate = this.generate(sent);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Devolver _devuelve = mySino.getDevuelve();
      boolean _notEquals = (!Objects.equal(_devuelve, null));
      if (_notEquals) {
        _builder.append("\t");
        Devolver _devuelve_1 = mySino.getDevuelve();
        CharSequence _generate_1 = this.generate(_devuelve_1);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMientrasPunteros(final mientras m, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while(");
    operacion _valor = m.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = m.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final mientras m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while(");
    operacion _valor = m.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = m.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate_1 = this.generate(sent);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateDesdePunteros(final desde d, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(");
    AsignacionNormal _asignacion = d.getAsignacion();
    CharSequence _generate = this.generate(_asignacion);
    _builder.append(_generate, "");
    _builder.append(" ");
    AsignacionNormal _asignacion_1 = d.getAsignacion();
    String _valor_asignacion = _asignacion_1.getValor_asignacion();
    String _string = _valor_asignacion.toString();
    _builder.append(_string, "");
    _builder.append(" <= ");
    operacion _valor = d.getValor();
    CharSequence _generate_1 = this.generate(_valor);
    _builder.append(_generate_1, "");
    _builder.append("; ");
    AsignacionNormal _asignacion_2 = d.getAsignacion();
    String _valor_asignacion_1 = _asignacion_2.getValor_asignacion();
    String _string_1 = _valor_asignacion_1.toString();
    _builder.append(_string_1, "");
    _builder.append("++){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = d.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final desde d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for(");
    AsignacionNormal _asignacion = d.getAsignacion();
    CharSequence _generate = this.generate(_asignacion);
    _builder.append(_generate, "");
    _builder.append(" ");
    AsignacionNormal _asignacion_1 = d.getAsignacion();
    String _valor_asignacion = _asignacion_1.getValor_asignacion();
    String _string = _valor_asignacion.toString();
    _builder.append(_string, "");
    _builder.append(" <= ");
    operacion _valor = d.getValor();
    CharSequence _generate_1 = this.generate(_valor);
    _builder.append(_generate_1, "");
    _builder.append("; ");
    AsignacionNormal _asignacion_2 = d.getAsignacion();
    String _valor_asignacion_1 = _asignacion_2.getValor_asignacion();
    String _string_1 = _valor_asignacion_1.toString();
    _builder.append(_string_1, "");
    _builder.append("++){");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencias> _sentencias = d.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate_2 = this.generate(sent);
        _builder.append(_generate_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateRepetirPunteros(final repetir m, final List<String> punteros) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("do{");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = m.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        Object _generatePunteros = this.generatePunteros(sent, punteros);
        _builder.append(_generatePunteros, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}while(!(");
    operacion _valor = m.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence generate(final repetir m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("do{");
    _builder.newLine();
    {
      EList<Sentencias> _sentencias = m.getSentencias();
      for(final Sentencias sent : _sentencias) {
        _builder.append("\t");
        CharSequence _generate = this.generate(sent);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}while(!(");
    operacion _valor = m.getValor();
    CharSequence _generate_1 = this.generate(_valor);
    _builder.append(_generate_1, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
