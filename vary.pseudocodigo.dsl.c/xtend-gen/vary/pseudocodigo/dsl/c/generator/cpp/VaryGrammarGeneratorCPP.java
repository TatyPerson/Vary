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
import diagramapseudocodigo.ModoApertura;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Multiplicacion;
import diagramapseudocodigo.Negacion;
import diagramapseudocodigo.Negativa;
import diagramapseudocodigo.NombreInterna;
import diagramapseudocodigo.NumeroDecimal;
import diagramapseudocodigo.NumeroEntero;
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
import diagramapseudocodigo.impl.ModuloImpl;
import diagramapseudocodigo.impl.MultiplicacionImpl;
import diagramapseudocodigo.impl.NegacionImpl;
import diagramapseudocodigo.impl.NegativaImpl;
import diagramapseudocodigo.impl.NumeroDecimalImpl;
import diagramapseudocodigo.impl.NumeroEnteroImpl;
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
import diagramapseudocodigo.impl.unariaImpl;
import diagramapseudocodigo.mientras;
import diagramapseudocodigo.operacion;
import diagramapseudocodigo.repetir;
import diagramapseudocodigo.segun;
import diagramapseudocodigo.signo;
import diagramapseudocodigo.unaria;
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
  
  public Object generate(final CabeceraProcedimiento myCabecera) {
    return null;
  }
  
  public Object generate(final CabeceraFuncion myFuncion) {
    return null;
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
                        boolean _and = false;
                        String _nombre_11 = cabecera.getNombre();
                        String _nombre_12 = procedimiento.getNombre();
                        boolean _equals_8 = _nombre_11.equals(_nombre_12);
                        if (!_equals_8) {
                          _and = false;
                        } else {
                          EList<ParametroFuncion> _parametrofuncion = procedimiento.getParametrofuncion();
                          int _size = _parametrofuncion.size();
                          EList<ParametroFuncion> _parametrofuncion_1 = cabecera.getParametrofuncion();
                          int _size_1 = _parametrofuncion_1.size();
                          boolean _equals_9 = (_size == _size_1);
                          _and = _equals_9;
                        }
                        if (_and) {
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
            boolean _equals_10 = _name_8.equals("CabeceraFuncion");
            if (_equals_10) {
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
                    boolean _equals_11 = _name_9.equals("Funcion");
                    if (_equals_11) {
                      _builder.append("\t\t");
                      Funcion funcion = ((Funcion) mySubproceso_1);
                      _builder.newLineIfNotEmpty();
                      {
                        boolean _and_1 = false;
                        String _nombre_13 = cabecera_1.getNombre();
                        String _nombre_14 = funcion.getNombre();
                        boolean _equals_12 = _nombre_13.equals(_nombre_14);
                        if (!_equals_12) {
                          _and_1 = false;
                        } else {
                          EList<ParametroFuncion> _parametrofuncion_2 = funcion.getParametrofuncion();
                          int _size_2 = _parametrofuncion_2.size();
                          EList<ParametroFuncion> _parametrofuncion_3 = cabecera_1.getParametrofuncion();
                          int _size_3 = _parametrofuncion_3.size();
                          boolean _equals_13 = (_size_2 == _size_3);
                          _and_1 = _equals_13;
                        }
                        if (_and_1) {
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
            boolean _equals_14 = _name_10.equals("Procedimiento");
            if (_equals_14) {
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
            boolean _equals_15 = _name_11.equals("Funcion");
            if (_equals_15) {
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
      String _nombre_15 = myModulo.getNombre();
      String _upperCase_2 = _nombre_15.toUpperCase();
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
      String _plus_1 = (_plus + _nombre);
      String cabecera = (_plus_1 + "(");
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
        String _plus_2 = (("void" + " ") + _nombre_1);
        String cabecera_1 = (_plus_2 + "(");
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
      String _plus_2 = (_plus_1 + _nombre);
      String cabecera = (_plus_2 + "(");
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
        String _plus_3 = (("static void" + " ") + _nombre_1);
        String cabecera_1 = (_plus_3 + "(");
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
          boolean _and = false;
          String _paso_1 = p.getPaso();
          ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
          String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
          boolean _equals_1 = _paso_1.equals(_string_1);
          if (!_equals_1) {
            _and = false;
          } else {
            Tipo _tipo_1 = p.getTipo();
            _and = (_tipo_1 instanceof TipoExistente);
          }
          if (_and) {
            Tipo _tipo_2 = p.getTipo();
            CharSequence _generate_1 = this.generate(_tipo_2);
            String _plus_1 = (total + _generate_1);
            String _plus_2 = (_plus_1 + "*");
            total = _plus_2;
          } else {
            Tipo _tipo_3 = p.getTipo();
            CharSequence _generate_2 = this.generate(_tipo_3);
            String _plus_3 = (total + _generate_2);
            total = _plus_3;
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
              boolean _and = false;
              String _paso = parametro.getPaso();
              ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
              String _string = _bundle.getString("TIPO_PASO_SALIDA");
              boolean _equals_1 = _paso.equals(_string);
              if (!_equals_1) {
                _and = false;
              } else {
                Tipo _tipo_1 = parametro.getTipo();
                _and = (_tipo_1 instanceof TipoExistente);
              }
              if (_and) {
                String _nombre_6 = funcion.getNombre();
                ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_6);
                _get_1.add(Integer.valueOf(numParametro));
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
                boolean _and = false;
                String _paso = parametro_1.getPaso();
                ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                String _string = _bundle.getString("TIPO_PASO_SALIDA");
                boolean _equals_2 = _paso.equals(_string);
                if (!_equals_2) {
                  _and = false;
                } else {
                  Tipo _tipo_1 = parametro_1.getTipo();
                  _and = (_tipo_1 instanceof TipoExistente);
                }
                if (_and) {
                  String _nombre_8 = procedimiento.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_8);
                  _get_1.add(Integer.valueOf(numParametro_1));
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
                boolean _and = false;
                String _paso = parametro_2.getPaso();
                ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                String _string = _bundle.getString("TIPO_PASO_SALIDA");
                boolean _equals_3 = _paso.equals(_string);
                if (!_equals_3) {
                  _and = false;
                } else {
                  Tipo _tipo_2 = parametro_2.getTipo();
                  _and = (_tipo_2 instanceof TipoExistente);
                }
                if (_and) {
                  String _nombre_10 = cabeceraFuncion.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_10);
                  _get_1.add(Integer.valueOf(numParametro_2));
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
                  boolean _and = false;
                  String _paso = parametro_3.getPaso();
                  ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                  String _string = _bundle.getString("TIPO_PASO_SALIDA");
                  boolean _equals_4 = _paso.equals(_string);
                  if (!_equals_4) {
                    _and = false;
                  } else {
                    Tipo _tipo_2 = parametro_3.getTipo();
                    _and = (_tipo_2 instanceof TipoExistente);
                  }
                  if (_and) {
                    String _nombre_12 = cabeceraProcedimiento.getNombre();
                    ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_12);
                    _get_1.add(Integer.valueOf(numParametro_3));
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
      String _nombre_21 = myModulo.getNombre();
      _builder.append(_nombre_21, "");
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
          String _nombre_22 = myRefModulo.getNombre();
          _builder.append(_nombre_22, "");
          _builder.append(" ref");
          String _nombre_23 = myRefModulo.getNombre();
          _builder.append(_nombre_23, "");
          _builder.append(" = ");
          String _nombre_24 = myRefModulo.getNombre();
          _builder.append(_nombre_24, "");
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
            String _nombre_25 = _variable_3.getNombre();
            boolean _contains = _exporta_constantes.contains(_nombre_25);
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
            EClass _eClass_11 = myTipo.eClass();
            String _name_11 = _eClass_11.getName();
            boolean _equals_11 = _name_11.equals("Vector");
            if (_equals_11) {
              Vector vector = ((Vector) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos = myModulo.getExporta_tipos();
                String _nombre_26 = vector.getNombre();
                boolean _contains_1 = _exporta_tipos.contains(_nombre_26);
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
            EClass _eClass_12 = myTipo.eClass();
            String _name_12 = _eClass_12.getName();
            boolean _equals_12 = _name_12.equals("Matriz");
            if (_equals_12) {
              Matriz matriz = ((Matriz) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_1 = myModulo.getExporta_tipos();
                String _nombre_27 = matriz.getNombre();
                boolean _contains_2 = _exporta_tipos_1.contains(_nombre_27);
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
            EClass _eClass_13 = myTipo.eClass();
            String _name_13 = _eClass_13.getName();
            boolean _equals_13 = _name_13.equals("Registro");
            if (_equals_13) {
              Registro registro = ((Registro) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_2 = myModulo.getExporta_tipos();
                String _nombre_28 = registro.getNombre();
                boolean _contains_3 = _exporta_tipos_2.contains(_nombre_28);
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
            EClass _eClass_14 = myTipo.eClass();
            String _name_14 = _eClass_14.getName();
            boolean _equals_14 = _name_14.equals("Archivo");
            if (_equals_14) {
              Archivo archivo = ((Archivo) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_3 = myModulo.getExporta_tipos();
                String _nombre_29 = archivo.getNombre();
                boolean _contains_4 = _exporta_tipos_3.contains(_nombre_29);
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
            EClass _eClass_15 = myTipo.eClass();
            String _name_15 = _eClass_15.getName();
            boolean _equals_15 = _name_15.equals("Enumerado");
            if (_equals_15) {
              Enumerado enumerado_1 = ((Enumerado) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_4 = myModulo.getExporta_tipos();
                String _nombre_30 = enumerado_1.getNombre();
                boolean _contains_5 = _exporta_tipos_4.contains(_nombre_30);
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
            EClass _eClass_16 = myTipo.eClass();
            String _name_16 = _eClass_16.getName();
            boolean _equals_16 = _name_16.equals("Subrango");
            if (_equals_16) {
              Subrango subrango = ((Subrango) myTipo);
              _builder.newLineIfNotEmpty();
              {
                EList<String> _exporta_tipos_5 = myModulo.getExporta_tipos();
                String _nombre_31 = subrango.getNombre();
                boolean _contains_6 = _exporta_tipos_5.contains(_nombre_31);
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
                EClass _eClass_17 = mySubproceso.eClass();
                String _name_17 = _eClass_17.getName();
                boolean _equals_17 = _name_17.equals("Procedimiento");
                if (_equals_17) {
                  Procedimiento procedimiento_1 = ((Procedimiento) mySubproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _and = false;
                    EList<CabeceraSubproceso> _exporta_funciones_2 = myModulo.getExporta_funciones();
                    String _nombre_32 = procedimiento_1.getNombre();
                    boolean _contains_7 = _exporta_funciones_2.contains(_nombre_32);
                    if (!_contains_7) {
                      _and = false;
                    } else {
                      EList<ParametroFuncion> _parametrofuncion_4 = procedimiento_1.getParametrofuncion();
                      int _size = _parametrofuncion_4.size();
                      EList<ParametroFuncion> _parametrofuncion_5 = exportaCabecera.getParametrofuncion();
                      int _size_1 = _parametrofuncion_5.size();
                      boolean _equals_18 = (_size == _size_1);
                      _and = _equals_18;
                    }
                    if (_and) {
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
                EClass _eClass_18 = mySubproceso.eClass();
                String _name_18 = _eClass_18.getName();
                boolean _equals_19 = _name_18.equals("Funcion");
                if (_equals_19) {
                  Funcion funcion_1 = ((Funcion) mySubproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    boolean _and_1 = false;
                    EList<CabeceraSubproceso> _exporta_funciones_3 = myModulo.getExporta_funciones();
                    String _nombre_34 = funcion_1.getNombre();
                    boolean _contains_8 = _exporta_funciones_3.contains(_nombre_34);
                    if (!_contains_8) {
                      _and_1 = false;
                    } else {
                      EList<ParametroFuncion> _parametrofuncion_6 = funcion_1.getParametrofuncion();
                      int _size_2 = _parametrofuncion_6.size();
                      EList<ParametroFuncion> _parametrofuncion_7 = exportaCabecera.getParametrofuncion();
                      int _size_3 = _parametrofuncion_7.size();
                      boolean _equals_20 = (_size_2 == _size_3);
                      _and_1 = _equals_20;
                    }
                    if (_and_1) {
                      String _nombre_35 = this.modulo.getNombre();
                      String _generate_8 = this.generate(funcion_1, _nombre_35);
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
            EClass _eClass_19 = mySubproceso_1.eClass();
            String _name_19 = _eClass_19.getName();
            boolean _equals_21 = _name_19.equals("Procedimiento");
            if (_equals_21) {
              Procedimiento procedimiento_2 = ((Procedimiento) mySubproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_9 = procedimientosUsados.contains(procedimiento_2);
                boolean _not_7 = (!_contains_9);
                if (_not_7) {
                  String _nombre_36 = this.modulo.getNombre();
                  String _generateStatic = this.generateStatic(procedimiento_2, _nombre_36);
                  _builder.append(_generateStatic, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_20 = mySubproceso_1.eClass();
            String _name_20 = _eClass_20.getName();
            boolean _equals_22 = _name_20.equals("Funcion");
            if (_equals_22) {
              Funcion funcion_2 = ((Funcion) mySubproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_10 = funcionesUsadas.contains(funcion_2);
                boolean _not_8 = (!_contains_10);
                if (_not_8) {
                  String _nombre_37 = this.modulo.getNombre();
                  String _generateStatic_1 = this.generateStatic(funcion_2, _nombre_37);
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
              boolean _and = false;
              String _paso = parametro.getPaso();
              ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
              String _string = _bundle.getString("TIPO_PASO_SALIDA");
              boolean _equals_1 = _paso.equals(_string);
              if (!_equals_1) {
                _and = false;
              } else {
                Tipo _tipo_1 = parametro.getTipo();
                _and = (_tipo_1 instanceof TipoExistente);
              }
              if (_and) {
                String _nombre_6 = funcion.getNombre();
                ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_6);
                _get_1.add(Integer.valueOf(numParametro));
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
                boolean _and = false;
                String _paso = parametro_1.getPaso();
                ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                String _string = _bundle.getString("TIPO_PASO_SALIDA");
                boolean _equals_2 = _paso.equals(_string);
                if (!_equals_2) {
                  _and = false;
                } else {
                  Tipo _tipo_1 = parametro_1.getTipo();
                  _and = (_tipo_1 instanceof TipoExistente);
                }
                if (_and) {
                  String _nombre_8 = procedimiento.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_8);
                  _get_1.add(Integer.valueOf(numParametro_1));
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
                boolean _and = false;
                String _paso = parametro_2.getPaso();
                ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                String _string = _bundle.getString("TIPO_PASO_SALIDA");
                boolean _equals_3 = _paso.equals(_string);
                if (!_equals_3) {
                  _and = false;
                } else {
                  Tipo _tipo_2 = parametro_2.getTipo();
                  _and = (_tipo_2 instanceof TipoExistente);
                }
                if (_and) {
                  String _nombre_10 = cabeceraFuncion.getNombre();
                  ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_10);
                  _get_1.add(Integer.valueOf(numParametro_2));
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
                  boolean _and = false;
                  String _paso = parametro_3.getPaso();
                  ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
                  String _string = _bundle.getString("TIPO_PASO_SALIDA");
                  boolean _equals_4 = _paso.equals(_string);
                  if (!_equals_4) {
                    _and = false;
                  } else {
                    Tipo _tipo_2 = parametro_3.getTipo();
                    _and = (_tipo_2 instanceof TipoExistente);
                  }
                  if (_and) {
                    String _nombre_12 = cabeceraProcedimiento.getNombre();
                    ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_12);
                    _get_1.add(Integer.valueOf(numParametro_3));
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
          String _nombre_23 = this.algoritmo.getNombre();
          _builder.append(_nombre_23, "");
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
              String _nombre_24 = myRefModulo.getNombre();
              _builder.append(_nombre_24, "");
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
          String _nombre_25 = myRefModulo_1.getNombre();
          _builder.append(_nombre_25, "");
          _builder.append(" ref");
          String _nombre_26 = myRefModulo_1.getNombre();
          _builder.append(_nombre_26, "");
          _builder.append(" = ");
          String _nombre_27 = myRefModulo_1.getNombre();
          _builder.append(_nombre_27, "");
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
    _builder.append("\")");
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
    _builder.append(")");
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
      boolean _and = false;
      ArrayList<String> _get = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
      boolean _contains = _get.contains(limite_inf);
      if (!_contains) {
        _and = false;
      } else {
        ArrayList<String> _get_1 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        boolean _contains_1 = _get_1.contains(limite_sup);
        _and = _contains_1;
      }
      if (_and) {
        ArrayList<String> _get_2 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        int index_limite_inf = _get_2.indexOf(limite_inf);
        ArrayList<String> _get_3 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        int index_limite_sup = _get_3.indexOf(limite_sup);
        ArrayList<String> _get_4 = VaryGrammarGeneratorCPP.variablesEnumerados.get(nombre);
        List<String> sublista = _get_4.subList(index_limite_inf, index_limite_sup);
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
          boolean _and = false;
          String _paso_1 = p.getPaso();
          ResourceBundle _bundle_1 = VaryGrammarGeneratorCPP.readerMessages.getBundle();
          String _string_1 = _bundle_1.getString("TIPO_PASO_SALIDA");
          boolean _equals_1 = _paso_1.equals(_string_1);
          if (!_equals_1) {
            _and = false;
          } else {
            Tipo _tipo_1 = p.getTipo();
            _and = (_tipo_1 instanceof TipoExistente);
          }
          if (_and) {
            Tipo _tipo_2 = p.getTipo();
            CharSequence _generate_1 = this.generate(_tipo_2);
            String _plus_3 = (total + _generate_1);
            String _plus_4 = (_plus_3 + " *");
            Variable _variable_1 = p.getVariable();
            String _nombre_1 = _variable_1.getNombre();
            String _plus_5 = (_plus_4 + _nombre_1);
            total = _plus_5;
          } else {
            Tipo _tipo_3 = p.getTipo();
            CharSequence _generate_2 = this.generate(_tipo_3);
            String _plus_6 = (total + _generate_2);
            String _plus_7 = (_plus_6 + " ");
            Variable _variable_2 = p.getVariable();
            String _nombre_2 = _variable_2.getNombre();
            String _plus_8 = (_plus_7 + _nombre_2);
            total = _plus_8;
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
    String _plus_2 = (_plus_1 + "(");
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_3 = (_plus_2 + _generate);
    String _plus_4 = (_plus_3 + "){");
    String funcionDeclarada = (_plus_4 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      boolean _and = false;
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (!_equals) {
        _and = false;
      } else {
        Tipo _tipo_1 = parametroFuncion.getTipo();
        _and = (_tipo_1 instanceof TipoExistente);
      }
      if (_and) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_5 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_6 = (_plus_5 + "\n");
      funcionDeclarada = _plus_6;
    }
    int _size = punteros.size();
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_7 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_8 = (_plus_7 + "\n");
        funcionDeclarada = _plus_8;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_9 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_10 = (_plus_9 + "\n");
        funcionDeclarada = _plus_10;
      }
    }
    Devolver _devuelve = myFun.getDevuelve();
    boolean _notEquals = (!Objects.equal(_devuelve, null));
    if (_notEquals) {
      Devolver _devuelve_1 = myFun.getDevuelve();
      CharSequence _generate_3 = this.generate(_devuelve_1);
      String _plus_11 = ((funcionDeclarada + "\t") + _generate_3);
      String _plus_12 = (_plus_11 + "\n");
      funcionDeclarada = _plus_12;
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
    String _plus_4 = (_plus_3 + "(");
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_5 = (_plus_4 + _generate);
    String _plus_6 = (_plus_5 + "){");
    String funcionDeclarada = (_plus_6 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      boolean _and = false;
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (!_equals) {
        _and = false;
      } else {
        Tipo _tipo_1 = parametroFuncion.getTipo();
        _and = (_tipo_1 instanceof TipoExistente);
      }
      if (_and) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_7 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_8 = (_plus_7 + "\n");
      funcionDeclarada = _plus_8;
    }
    int _size = punteros.size();
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_9 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_10 = (_plus_9 + "\n");
        funcionDeclarada = _plus_10;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_11 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_12 = (_plus_11 + "\n");
        funcionDeclarada = _plus_12;
      }
    }
    Devolver _devuelve = myFun.getDevuelve();
    boolean _notEquals = (!Objects.equal(_devuelve, null));
    if (_notEquals) {
      Devolver _devuelve_1 = myFun.getDevuelve();
      CharSequence _generate_3 = this.generate(_devuelve_1);
      String _plus_13 = ((funcionDeclarada + "\t") + _generate_3);
      String _plus_14 = (_plus_13 + "\n");
      funcionDeclarada = _plus_14;
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
    String _plus_4 = (_plus_3 + "(");
    EList<ParametroFuncion> _parametrofuncion = myFun.getParametrofuncion();
    CharSequence _generate = this.generate(_parametrofuncion);
    String _plus_5 = (_plus_4 + _generate);
    String _plus_6 = (_plus_5 + "){");
    String funcionDeclarada = (_plus_6 + "\n");
    ArrayList<String> punteros = new ArrayList<String>();
    EList<ParametroFuncion> _parametrofuncion_1 = myFun.getParametrofuncion();
    for (final ParametroFuncion parametroFuncion : _parametrofuncion_1) {
      String _paso = parametroFuncion.getPaso();
      ResourceBundle _bundle = VaryGrammarGeneratorCPP.readerMessages.getBundle();
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
      }
    }
    EList<Declaracion> _declaracion = myFun.getDeclaracion();
    for (final Declaracion myVariable : _declaracion) {
      CharSequence _generate_1 = this.generate(myVariable);
      String _plus_7 = ((funcionDeclarada + "\t") + _generate_1);
      String _plus_8 = (_plus_7 + "\n");
      funcionDeclarada = _plus_8;
    }
    int _size = punteros.size();
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
      EList<Sentencias> _sentencias = myFun.getSentencias();
      for (final Sentencias mySentencia : _sentencias) {
        CharSequence _generate_2 = this.generate(mySentencia);
        String _plus_9 = ((funcionDeclarada + "\t") + _generate_2);
        String _plus_10 = (_plus_9 + "\n");
        funcionDeclarada = _plus_10;
      }
    } else {
      EList<Sentencias> _sentencias_1 = myFun.getSentencias();
      for (final Sentencias mySentencia_1 : _sentencias_1) {
        CharSequence _generatePunteros = this.generatePunteros(mySentencia_1, punteros);
        String _plus_11 = ((funcionDeclarada + "\t") + _generatePunteros);
        String _plus_12 = (_plus_11 + "\n");
        funcionDeclarada = _plus_12;
      }
    }
    Devolver _devuelve = myFun.getDevuelve();
    boolean _notEquals = (!Objects.equal(_devuelve, null));
    if (_notEquals) {
      Devolver _devuelve_1 = myFun.getDevuelve();
      CharSequence _generate_3 = this.generate(_devuelve_1);
      String _plus_13 = ((funcionDeclarada + "\t") + _generate_3);
      String _plus_14 = (_plus_13 + "\n");
      funcionDeclarada = _plus_14;
    }
    funcionDeclarada = ((funcionDeclarada + "\n") + "}");
    return funcionDeclarada;
  }
  
  @Override
  public CharSequence generate(final Procedimiento myProc) {
    String _nombre = myProc.getNombre();
    String _plus = ("void " + _nombre);
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
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
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
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
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
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
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
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
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
      String _string = _bundle.getString("TIPO_PASO_SALIDA");
      boolean _equals = _paso.equals(_string);
      if (_equals) {
        Variable _variable = parametroFuncion.getVariable();
        String _nombre_1 = _variable.getNombre();
        punteros.add(_nombre_1);
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
    boolean _equals_1 = (_size == 0);
    if (_equals_1) {
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
                        CharSequence _xblockexpression_9 = null;
                        {
                          Negacion prueba = new NegacionImpl();
                          prueba = ((Negacion) mySent);
                          _xblockexpression_9 = this.generate(prueba);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = mySent.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Leer");
                        if (_equals_10) {
                          String _xblockexpression_10 = null;
                          {
                            Leer prueba = new LeerImpl();
                            prueba = ((Leer) mySent);
                            _xblockexpression_10 = this.generateLeerPunteros(prueba, punteros);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = mySent.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Escribir");
                          if (_equals_11) {
                            CharSequence _xblockexpression_11 = null;
                            {
                              Escribir prueba = new EscribirImpl();
                              prueba = ((Escribir) mySent);
                              _xblockexpression_11 = this.generateEscribirPunteros(prueba, punteros);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = mySent.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("FuncionFicheroAbrir");
                            if (_equals_12) {
                              CharSequence _xblockexpression_12 = null;
                              {
                                FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl();
                                prueba = ((FuncionFicheroAbrir) mySent);
                                _xblockexpression_12 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_12;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = mySent.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("FuncionFicheroCerrar");
                              if (_equals_13) {
                                CharSequence _xblockexpression_13 = null;
                                {
                                  FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl();
                                  prueba = ((FuncionFicheroCerrar) mySent);
                                  _xblockexpression_13 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_13;
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
                        CharSequence _xblockexpression_9 = null;
                        {
                          Negacion prueba = new NegacionImpl();
                          prueba = ((Negacion) mySent);
                          _xblockexpression_9 = this.generate(prueba);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = mySent.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("Leer");
                        if (_equals_10) {
                          CharSequence _xblockexpression_10 = null;
                          {
                            Leer prueba = new LeerImpl();
                            prueba = ((Leer) mySent);
                            _xblockexpression_10 = this.generate(prueba);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = mySent.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("Escribir");
                          if (_equals_11) {
                            CharSequence _xblockexpression_11 = null;
                            {
                              Escribir prueba = new EscribirImpl();
                              prueba = ((Escribir) mySent);
                              _xblockexpression_11 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = mySent.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("FuncionFicheroAbrir");
                            if (_equals_12) {
                              CharSequence _xblockexpression_12 = null;
                              {
                                FuncionFicheroAbrir prueba = new FuncionFicheroAbrirImpl();
                                prueba = ((FuncionFicheroAbrir) mySent);
                                _xblockexpression_12 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_12;
                            } else {
                              CharSequence _xifexpression_13 = null;
                              EClass _eClass_13 = mySent.eClass();
                              String _name_13 = _eClass_13.getName();
                              boolean _equals_13 = _name_13.equals("FuncionFicheroCerrar");
                              if (_equals_13) {
                                CharSequence _xblockexpression_13 = null;
                                {
                                  FuncionFicheroCerrar prueba = new FuncionFicheroCerrarImpl();
                                  prueba = ((FuncionFicheroCerrar) mySent);
                                  _xblockexpression_13 = this.generate(prueba);
                                }
                                _xifexpression_13 = _xblockexpression_13;
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
      String _plus = ("*" + _valor_asignacion_1);
      String _plus_1 = (_plus + "");
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
    CharSequence _generate = this.generate(_operador);
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
      CharSequence _generate = this.generate(myVariable);
      String _string_1 = _generate.toString();
      String _plus_1 = (concat + _string_1);
      concat = _plus_1;
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
    return myCampo.getNombre_campo();
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
                        _xblockexpression_8 = this.generate(prueba);
                      }
                      _xifexpression_8 = _xblockexpression_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      EClass _eClass_9 = myVal.eClass();
                      String _name_9 = _eClass_9.getName();
                      boolean _equals_9 = _name_9.equals("unaria");
                      if (_equals_9) {
                        CharSequence _xblockexpression_9 = null;
                        {
                          unaria prueba = new unariaImpl();
                          prueba = ((unaria) myVal);
                          _xblockexpression_9 = this.generate(prueba);
                        }
                        _xifexpression_9 = _xblockexpression_9;
                      } else {
                        CharSequence _xifexpression_10 = null;
                        EClass _eClass_10 = myVal.eClass();
                        String _name_10 = _eClass_10.getName();
                        boolean _equals_10 = _name_10.equals("ValorRegistro");
                        if (_equals_10) {
                          CharSequence _xblockexpression_10 = null;
                          {
                            ValorRegistro prueba = new ValorRegistroImpl();
                            prueba = ((ValorRegistro) myVal);
                            _xblockexpression_10 = this.generate(prueba);
                          }
                          _xifexpression_10 = _xblockexpression_10;
                        } else {
                          CharSequence _xifexpression_11 = null;
                          EClass _eClass_11 = myVal.eClass();
                          String _name_11 = _eClass_11.getName();
                          boolean _equals_11 = _name_11.equals("ValorVector");
                          if (_equals_11) {
                            CharSequence _xblockexpression_11 = null;
                            {
                              ValorVector prueba = new ValorVectorImpl();
                              prueba = ((ValorVector) myVal);
                              _xblockexpression_11 = this.generate(prueba);
                            }
                            _xifexpression_11 = _xblockexpression_11;
                          } else {
                            CharSequence _xifexpression_12 = null;
                            EClass _eClass_12 = myVal.eClass();
                            String _name_12 = _eClass_12.getName();
                            boolean _equals_12 = _name_12.equals("ValorMatriz");
                            if (_equals_12) {
                              CharSequence _xblockexpression_12 = null;
                              {
                                ValorMatriz prueba = new ValorMatrizImpl();
                                prueba = ((ValorMatriz) myVal);
                                _xblockexpression_12 = this.generate(prueba);
                              }
                              _xifexpression_12 = _xblockexpression_12;
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
  
  @Override
  public CharSequence generate(final unaria myUnaria) {
    valor _variable = myUnaria.getVariable();
    CharSequence _generate = this.generate(_variable);
    return ("!" + _generate);
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
    leer = "cin >> ";
    operacion _variable = l.getVariable();
    EClass _eClass = _variable.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("VariableID");
    if (_equals) {
      VariableID prueba = new VariableIDImpl();
      operacion _variable_1 = l.getVariable();
      prueba = ((VariableID) _variable_1);
      String _nombre = prueba.getNombre();
      boolean _contains = punteros.contains(_nombre);
      if (_contains) {
        CharSequence _generate = this.generate(prueba);
        String _plus = ((leer + "*") + _generate);
        String _plus_1 = (_plus + ";");
        leer = _plus_1;
      }
    } else {
      operacion _variable_2 = l.getVariable();
      EClass _eClass_1 = _variable_2.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("ValorVector");
      if (_equals_1) {
        ValorVector prueba_1 = new ValorVectorImpl();
        operacion _variable_3 = l.getVariable();
        prueba_1 = ((ValorVector) _variable_3);
        String _nombre_vector = prueba_1.getNombre_vector();
        boolean _contains_1 = punteros.contains(_nombre_vector);
        if (_contains_1) {
          CharSequence _generate_1 = this.generate(prueba_1);
          String _plus_2 = ((leer + "*") + _generate_1);
          String _plus_3 = (_plus_2 + ";");
          leer = _plus_3;
        }
      } else {
        operacion _variable_4 = l.getVariable();
        EClass _eClass_2 = _variable_4.eClass();
        String _name_2 = _eClass_2.getName();
        boolean _equals_2 = _name_2.equals("ValorMatriz");
        if (_equals_2) {
          ValorMatriz prueba_2 = new ValorMatrizImpl();
          operacion _variable_5 = l.getVariable();
          prueba_2 = ((ValorMatriz) _variable_5);
          String _nombre_matriz = prueba_2.getNombre_matriz();
          boolean _contains_2 = punteros.contains(_nombre_matriz);
          if (_contains_2) {
            CharSequence _generate_2 = this.generate(prueba_2);
            String _plus_4 = ((leer + "*") + _generate_2);
            String _plus_5 = (_plus_4 + ";");
            leer = _plus_5;
          }
        } else {
          operacion _variable_6 = l.getVariable();
          CharSequence _generate_3 = this.generate(_variable_6);
          String _plus_6 = (leer + _generate_3);
          String _plus_7 = (_plus_6 + ";");
          leer = _plus_7;
        }
      }
    }
    return leer;
  }
  
  @Override
  public CharSequence generate(final Leer l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cin >> ");
    operacion _variable = l.getVariable();
    CharSequence _generate = this.generate(_variable);
    _builder.append(_generate, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
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
  public CharSequence generate(final Internas i) {
    CharSequence _xifexpression = null;
    NombreInterna _nombre = i.getNombre();
    boolean _equals = Objects.equal(_nombre, NombreInterna.COS);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("cos(");
      EList<operacion> _operadores = i.getOperadores();
      operacion _get = _operadores.get(0);
      CharSequence _generate = this.generate(_get);
      _builder.append(_generate, "");
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      NombreInterna _nombre_1 = i.getNombre();
      boolean _equals_1 = Objects.equal(_nombre_1, NombreInterna.SEN);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("sin(");
        EList<operacion> _operadores_1 = i.getOperadores();
        operacion _get_1 = _operadores_1.get(0);
        CharSequence _generate_1 = this.generate(_get_1);
        _builder_1.append(_generate_1, "");
        _builder_1.append(")");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        NombreInterna _nombre_2 = i.getNombre();
        boolean _equals_2 = Objects.equal(_nombre_2, NombreInterna.CUADRADO);
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
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          NombreInterna _nombre_3 = i.getNombre();
          boolean _equals_3 = Objects.equal(_nombre_3, NombreInterna.EXP);
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("exp2(");
            EList<operacion> _operadores_3 = i.getOperadores();
            operacion _get_3 = _operadores_3.get(0);
            CharSequence _generate_3 = this.generate(_get_3);
            _builder_3.append(_generate_3, "");
            _builder_3.append(")");
            _xifexpression_3 = _builder_3;
          } else {
            CharSequence _xifexpression_4 = null;
            NombreInterna _nombre_4 = i.getNombre();
            boolean _equals_4 = Objects.equal(_nombre_4, NombreInterna.LN);
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("log(");
              EList<operacion> _operadores_4 = i.getOperadores();
              operacion _get_4 = _operadores_4.get(0);
              CharSequence _generate_4 = this.generate(_get_4);
              _builder_4.append(_generate_4, "");
              _builder_4.append(")");
              _xifexpression_4 = _builder_4;
            } else {
              CharSequence _xifexpression_5 = null;
              NombreInterna _nombre_5 = i.getNombre();
              boolean _equals_5 = Objects.equal(_nombre_5, NombreInterna.LOG);
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("log10(");
                EList<operacion> _operadores_5 = i.getOperadores();
                operacion _get_5 = _operadores_5.get(0);
                CharSequence _generate_5 = this.generate(_get_5);
                _builder_5.append(_generate_5, "");
                _builder_5.append(")");
                _xifexpression_5 = _builder_5;
              } else {
                CharSequence _xifexpression_6 = null;
                NombreInterna _nombre_6 = i.getNombre();
                boolean _equals_6 = Objects.equal(_nombre_6, NombreInterna.SQRT);
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("sqrt(");
                  EList<operacion> _operadores_6 = i.getOperadores();
                  operacion _get_6 = _operadores_6.get(0);
                  CharSequence _generate_6 = this.generate(_get_6);
                  _builder_6.append(_generate_6, "");
                  _builder_6.append(")");
                  _xifexpression_6 = _builder_6;
                } else {
                  CharSequence _xifexpression_7 = null;
                  NombreInterna _nombre_7 = i.getNombre();
                  boolean _equals_7 = Objects.equal(_nombre_7, NombreInterna.LONGITUD);
                  if (_equals_7) {
                    StringConcatenation _builder_7 = new StringConcatenation();
                    _builder_7.append("strlen(");
                    EList<operacion> _operadores_7 = i.getOperadores();
                    operacion _get_7 = _operadores_7.get(0);
                    CharSequence _generate_7 = this.generate(_get_7);
                    _builder_7.append(_generate_7, "");
                    _builder_7.append(")");
                    _xifexpression_7 = _builder_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    NombreInterna _nombre_8 = i.getNombre();
                    boolean _equals_8 = Objects.equal(_nombre_8, NombreInterna.CONCATENA);
                    if (_equals_8) {
                      StringConcatenation _builder_8 = new StringConcatenation();
                      _builder_8.append("strcat(");
                      EList<operacion> _operadores_8 = i.getOperadores();
                      operacion _get_8 = _operadores_8.get(0);
                      CharSequence _generate_8 = this.generate(_get_8);
                      _builder_8.append(_generate_8, "");
                      _builder_8.append(",");
                      EList<operacion> _operadores_9 = i.getOperadores();
                      operacion _get_9 = _operadores_9.get(1);
                      CharSequence _generate_9 = this.generate(_get_9);
                      _builder_8.append(_generate_9, "");
                      _builder_8.append(")");
                      _xifexpression_8 = _builder_8;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cout");
    EList<operacion> _operador = a.getOperador();
    String _coutOperadores = this.coutOperadores(_operador);
    _builder.append(_coutOperadores, "");
    _builder.append(" << endl;");
    _builder.newLineIfNotEmpty();
    return _builder;
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
              boolean _and = false;
              String _nombre = fun.getNombre();
              String _nombre_1 = cabeceraProc.getNombre();
              boolean _equals = _nombre.equals(_nombre_1);
              if (!_equals) {
                _and = false;
              } else {
                EList<operacion> _operadores = fun.getOperadores();
                int _size = _operadores.size();
                EList<ParametroFuncion> _parametrofuncion = cabeceraProc.getParametrofuncion();
                int _size_1 = _parametrofuncion.size();
                boolean _equals_1 = (_size == _size_1);
                _and = _equals_1;
              }
              if (_and) {
                String _nombre_2 = m.getNombre();
                nombreModulo = _nombre_2;
              }
            } else {
              if ((cabecera instanceof CabeceraFuncion)) {
                CabeceraFuncion cabeceraFun = ((CabeceraFuncion) cabecera);
                boolean _and_1 = false;
                String _nombre_3 = fun.getNombre();
                String _nombre_4 = cabeceraFun.getNombre();
                boolean _equals_2 = _nombre_3.equals(_nombre_4);
                if (!_equals_2) {
                  _and_1 = false;
                } else {
                  EList<operacion> _operadores_1 = fun.getOperadores();
                  int _size_2 = _operadores_1.size();
                  EList<ParametroFuncion> _parametrofuncion_1 = cabeceraFun.getParametrofuncion();
                  int _size_3 = _parametrofuncion_1.size();
                  boolean _equals_3 = (_size_2 == _size_3);
                  _and_1 = _equals_3;
                }
                if (_and_1) {
                  String _nombre_5 = m.getNombre();
                  nombreModulo = _nombre_5;
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
                boolean _and_2 = false;
                String _nombre_6 = fun.getNombre();
                String _nombre_7 = cabeceraProc_1.getNombre();
                boolean _equals_4 = _nombre_6.equals(_nombre_7);
                if (!_equals_4) {
                  _and_2 = false;
                } else {
                  EList<operacion> _operadores_2 = fun.getOperadores();
                  int _size_4 = _operadores_2.size();
                  EList<ParametroFuncion> _parametrofuncion_2 = cabeceraProc_1.getParametrofuncion();
                  int _size_5 = _parametrofuncion_2.size();
                  boolean _equals_5 = (_size_4 == _size_5);
                  _and_2 = _equals_5;
                }
                if (_and_2) {
                  String _nombre_8 = m_1.getNombre();
                  nombreModulo = _nombre_8;
                }
              } else {
                if ((cabecera_1 instanceof CabeceraFuncion)) {
                  CabeceraFuncion cabeceraFun_1 = ((CabeceraFuncion) cabecera_1);
                  boolean _and_3 = false;
                  String _nombre_9 = fun.getNombre();
                  String _nombre_10 = cabeceraFun_1.getNombre();
                  boolean _equals_6 = _nombre_9.equals(_nombre_10);
                  if (!_equals_6) {
                    _and_3 = false;
                  } else {
                    EList<operacion> _operadores_3 = fun.getOperadores();
                    int _size_6 = _operadores_3.size();
                    EList<ParametroFuncion> _parametrofuncion_3 = cabeceraFun_1.getParametrofuncion();
                    int _size_7 = _parametrofuncion_3.size();
                    boolean _equals_7 = (_size_6 == _size_7);
                    _and_3 = _equals_7;
                  }
                  if (_and_3) {
                    String _nombre_11 = m_1.getNombre();
                    nombreModulo = _nombre_11;
                  }
                }
              }
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _equals_8 = nombreModulo.equals("");
        boolean _not = (!_equals_8);
        if (_not) {
          _builder.newLineIfNotEmpty();
          _builder.append("ref");
          _builder.append(nombreModulo, "");
          _builder.append(".");
          String _nombre_12 = fun.getNombre();
          _builder.append(_nombre_12, "");
          _builder.append("(");
          {
            String _nombre_13 = fun.getNombre();
            ArrayList<Integer> _get = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_13);
            int _size_8 = _get.size();
            boolean _equals_9 = (_size_8 == 0);
            if (_equals_9) {
              EList<operacion> _operadores_4 = fun.getOperadores();
              String _generaParametros = this.generaParametros(_operadores_4);
              _builder.append(_generaParametros, "");
            } else {
              EList<operacion> _operadores_5 = fun.getOperadores();
              String _nombre_14 = fun.getNombre();
              String _generaParametrosPunteros = this.generaParametrosPunteros(_operadores_5, _nombre_14);
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
          String _nombre_15 = fun.getNombre();
          _builder.append(_nombre_15, "");
          _builder.append("(");
          {
            String _nombre_16 = fun.getNombre();
            ArrayList<Integer> _get_1 = VaryGrammarGeneratorCPP.subprocesosConPunteros.get(_nombre_16);
            int _size_9 = _get_1.size();
            boolean _equals_10 = (_size_9 == 0);
            if (_equals_10) {
              EList<operacion> _operadores_6 = fun.getOperadores();
              String _generaParametros_1 = this.generaParametros(_operadores_6);
              _builder.append(_generaParametros_1, "");
            } else {
              EList<operacion> _operadores_7 = fun.getOperadores();
              String _nombre_17 = fun.getNombre();
              String _generaParametrosPunteros_1 = this.generaParametrosPunteros(_operadores_7, _nombre_17);
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
                            _xblockexpression_10 = this.generate(prueba);
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
                                  boolean _equals_15 = _name_15.equals("Or");
                                  if (_equals_15) {
                                    CharSequence _xblockexpression_15 = null;
                                    {
                                      Or prueba = new OrImpl();
                                      prueba = ((Or) op);
                                      _xblockexpression_15 = this.generate(prueba);
                                    }
                                    _xifexpression_15 = _xblockexpression_15;
                                  } else {
                                    CharSequence _xifexpression_16 = null;
                                    EClass _eClass_16 = op.eClass();
                                    String _name_16 = _eClass_16.getName();
                                    boolean _equals_16 = _name_16.equals("And");
                                    if (_equals_16) {
                                      CharSequence _xblockexpression_16 = null;
                                      {
                                        And prueba = new AndImpl();
                                        prueba = ((And) op);
                                        _xblockexpression_16 = this.generate(prueba);
                                      }
                                      _xifexpression_16 = _xblockexpression_16;
                                    } else {
                                      CharSequence _xifexpression_17 = null;
                                      EClass _eClass_17 = op.eClass();
                                      String _name_17 = _eClass_17.getName();
                                      boolean _equals_17 = _name_17.equals("Comparacion");
                                      if (_equals_17) {
                                        CharSequence _xblockexpression_17 = null;
                                        {
                                          Comparacion prueba = new ComparacionImpl();
                                          prueba = ((Comparacion) op);
                                          _xblockexpression_17 = this.generate(prueba);
                                        }
                                        _xifexpression_17 = _xblockexpression_17;
                                      } else {
                                        CharSequence _xifexpression_18 = null;
                                        EClass _eClass_18 = op.eClass();
                                        String _name_18 = _eClass_18.getName();
                                        boolean _equals_18 = _name_18.equals("Igualdad");
                                        if (_equals_18) {
                                          CharSequence _xblockexpression_18 = null;
                                          {
                                            Igualdad prueba = new IgualdadImpl();
                                            prueba = ((Igualdad) op);
                                            _xblockexpression_18 = this.generate(prueba);
                                          }
                                          _xifexpression_18 = _xblockexpression_18;
                                        } else {
                                          CharSequence _xifexpression_19 = null;
                                          EClass _eClass_19 = op.eClass();
                                          String _name_19 = _eClass_19.getName();
                                          boolean _equals_19 = _name_19.equals("Negativa");
                                          if (_equals_19) {
                                            CharSequence _xblockexpression_19 = null;
                                            {
                                              Negativa prueba = new NegativaImpl();
                                              prueba = ((Negativa) op);
                                              _xblockexpression_19 = this.generate(prueba);
                                            }
                                            _xifexpression_19 = _xblockexpression_19;
                                          } else {
                                            CharSequence _xifexpression_20 = null;
                                            EClass _eClass_20 = op.eClass();
                                            String _name_20 = _eClass_20.getName();
                                            boolean _equals_20 = _name_20.equals("Negacion");
                                            if (_equals_20) {
                                              CharSequence _xblockexpression_20 = null;
                                              {
                                                Negacion prueba = new NegacionImpl();
                                                prueba = ((Negacion) op);
                                                _xblockexpression_20 = this.generate(prueba);
                                              }
                                              _xifexpression_20 = _xblockexpression_20;
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
                            _xblockexpression_10 = this.generate(prueba);
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
                                  boolean _equals_15 = _name_15.equals("Or");
                                  if (_equals_15) {
                                    CharSequence _xblockexpression_15 = null;
                                    {
                                      Or prueba = new OrImpl();
                                      prueba = ((Or) op);
                                      _xblockexpression_15 = this.generate(prueba);
                                    }
                                    _xifexpression_15 = _xblockexpression_15;
                                  } else {
                                    CharSequence _xifexpression_16 = null;
                                    EClass _eClass_16 = op.eClass();
                                    String _name_16 = _eClass_16.getName();
                                    boolean _equals_16 = _name_16.equals("And");
                                    if (_equals_16) {
                                      CharSequence _xblockexpression_16 = null;
                                      {
                                        And prueba = new AndImpl();
                                        prueba = ((And) op);
                                        _xblockexpression_16 = this.generate(prueba);
                                      }
                                      _xifexpression_16 = _xblockexpression_16;
                                    } else {
                                      CharSequence _xifexpression_17 = null;
                                      EClass _eClass_17 = op.eClass();
                                      String _name_17 = _eClass_17.getName();
                                      boolean _equals_17 = _name_17.equals("Comparacion");
                                      if (_equals_17) {
                                        CharSequence _xblockexpression_17 = null;
                                        {
                                          Comparacion prueba = new ComparacionImpl();
                                          prueba = ((Comparacion) op);
                                          _xblockexpression_17 = this.generate(prueba);
                                        }
                                        _xifexpression_17 = _xblockexpression_17;
                                      } else {
                                        CharSequence _xifexpression_18 = null;
                                        EClass _eClass_18 = op.eClass();
                                        String _name_18 = _eClass_18.getName();
                                        boolean _equals_18 = _name_18.equals("Igualdad");
                                        if (_equals_18) {
                                          CharSequence _xblockexpression_18 = null;
                                          {
                                            Igualdad prueba = new IgualdadImpl();
                                            prueba = ((Igualdad) op);
                                            _xblockexpression_18 = this.generate(prueba);
                                          }
                                          _xifexpression_18 = _xblockexpression_18;
                                        } else {
                                          CharSequence _xifexpression_19 = null;
                                          EClass _eClass_19 = op.eClass();
                                          String _name_19 = _eClass_19.getName();
                                          boolean _equals_19 = _name_19.equals("Negativa");
                                          if (_equals_19) {
                                            CharSequence _xblockexpression_19 = null;
                                            {
                                              Negativa prueba = new NegativaImpl();
                                              prueba = ((Negativa) op);
                                              _xblockexpression_19 = this.generate(prueba);
                                            }
                                            _xifexpression_19 = _xblockexpression_19;
                                          } else {
                                            CharSequence _xifexpression_20 = null;
                                            EClass _eClass_20 = op.eClass();
                                            String _name_20 = _eClass_20.getName();
                                            boolean _equals_20 = _name_20.equals("Negacion");
                                            if (_equals_20) {
                                              CharSequence _xblockexpression_20 = null;
                                              {
                                                Negacion prueba = new NegacionImpl();
                                                prueba = ((Negacion) op);
                                                _xblockexpression_20 = this.generate(prueba);
                                              }
                                              _xifexpression_20 = _xblockexpression_20;
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
    operacion _right = mySuma.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Resta myResta) {
    operacion _left = myResta.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myResta.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myResta.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Multiplicacion myMulti) {
    operacion _left = myMulti.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myMulti.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myMulti.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Division myDivi) {
    operacion _left = myDivi.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myDivi.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myDivi.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Or myOr) {
    operacion _left = myOr.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "||");
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myOr.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final And myAnd) {
    operacion _left = myAnd.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    String _plus_1 = (_plus + "&&");
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myAnd.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Comparacion myComparacion) {
    operacion _left = myComparacion.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myComparacion.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myComparacion.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Igualdad myIgualdad) {
    operacion _left = myIgualdad.getLeft();
    CharSequence _generate = this.generate(_left);
    String _plus = (_generate + " ");
    signo _signo_op = myIgualdad.getSigno_op();
    String _plus_1 = (_plus + _signo_op);
    String _plus_2 = (_plus_1 + " ");
    operacion _right = myIgualdad.getRight();
    CharSequence _generate_1 = this.generate(_right);
    return (_plus_2 + _generate_1);
  }
  
  @Override
  public CharSequence generate(final Negativa myNegativa) {
    operacion _valor_operacion = myNegativa.getValor_operacion();
    CharSequence _generate = this.generate(_valor_operacion);
    String _plus = ("( - " + _generate);
    return (_plus + ")");
  }
  
  @Override
  public CharSequence generate(final Negacion myNegacion) {
    operacion _valor_operacion = myNegacion.getValor_operacion();
    CharSequence _generate = this.generate(_valor_operacion);
    return ("!" + _generate);
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
        CharSequence _generate_1 = this.generate(_devuelve_1);
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
        CharSequence _generate_1 = this.generate(_devuelve_1);
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
        CharSequence _generate_2 = this.generate(_devuelve_1);
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
        CharSequence _generate = this.generate(_devuelve_1);
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
    _builder.append("}while(");
    operacion _valor = m.getValor();
    CharSequence _generate = this.generate(_valor);
    _builder.append(_generate, "");
    _builder.append(");");
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
    _builder.append("}while(");
    operacion _valor = m.getValor();
    CharSequence _generate_1 = this.generate(_valor);
    _builder.append(_generate_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
