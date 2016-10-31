package vary.pseudocodigo.dsl.c.generator.cpp;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.CabeceraFuncion;
import diagramapseudocodigo.CabeceraProcedimiento;
import diagramapseudocodigo.CabeceraSubproceso;
import diagramapseudocodigo.Codigo;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionBasica;
import diagramapseudocodigo.DeclaracionDefinida;
import diagramapseudocodigo.Devolver;
import diagramapseudocodigo.Escribir;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.FuncionInterna;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Leer;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Operacion;
import diagramapseudocodigo.Parametro;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Sentencia;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.Variable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import vary.pseudocodigo.dsl.c.generator.VaryGrammarAbstractGeneratorCCPP;
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder;
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class VaryGrammarGeneratorCPP extends VaryGrammarAbstractGeneratorCCPP implements IGenerator {
  private static ReadFileProperties readerFileProperties = new ReadFileProperties();
  
  public VaryGrammarGeneratorCPP(final ReadMessagesValidatorInterface readerMessages) {
    VaryGrammarAbstractGeneratorCCPP.readerMessages = readerMessages;
  }
  
  /**
   * Función principal encargada de generar los ficheros resultantes de la transformación.
   * @param resource, sourceFile
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess sourceFile) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Codigo> _filter = Iterables.<Codigo>filter(_iterable, Codigo.class);
    for (final Codigo elemento : _filter) {
      {
        ProjectLocationFolder.setResource(resource);
        String contenidoFichero = new String();
        try {
          String _oS = ProjectLocationFolder.getOS();
          boolean _equals = _oS.equals("WIN32");
          if (_equals) {
            String _path = ProjectLocationFolder.getPath();
            String _plus = (_path + ".varyproject");
            String _readFilePropertiesWindows = VaryGrammarGeneratorCPP.readerFileProperties.readFilePropertiesWindows(_plus, 1);
            contenidoFichero = _readFilePropertiesWindows;
          } else {
            String _path_1 = ProjectLocationFolder.getPath();
            String _plus_1 = ("file:" + _path_1);
            String _readFilePropertiesUnix = VaryGrammarGeneratorCPP.readerFileProperties.readFilePropertiesUnix(_plus_1, 1);
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
        String tipoProyecto = contenidoFichero.replaceAll("ficheroCabeceras=", "");
        boolean _equals_1 = Objects.equal(tipoProyecto, "false");
        if (_equals_1) {
          VaryGrammarAbstractGeneratorCCPP.cabeceras = false;
          if ((elemento instanceof Algoritmo)) {
            String _nombre = ((Algoritmo)elemento).getNombre();
            String _plus_2 = (_nombre + ".cpp");
            CharSequence _generate = this.generate(((Algoritmo)elemento));
            sourceFile.generateFile(_plus_2, _generate);
          } else {
            String _nombre_1 = this.getNombre(elemento);
            String _plus_3 = (_nombre_1 + ".cpp");
            CharSequence _generate_1 = this.generate(elemento);
            sourceFile.generateFile(_plus_3, _generate_1);
            String _nombre_2 = this.getNombre(elemento);
            String _plus_4 = (_nombre_2 + ".h");
            CharSequence _generateCabeceras = this.generateCabeceras(elemento);
            sourceFile.generateFile(_plus_4, _generateCabeceras);
          }
        } else {
          VaryGrammarAbstractGeneratorCCPP.cabeceras = true;
          String _nombre_3 = this.getNombre(elemento);
          String _plus_5 = (_nombre_3 + ".cpp");
          CharSequence _generate_2 = this.generate(elemento);
          sourceFile.generateFile(_plus_5, _generate_2);
          String _nombre_4 = this.getNombre(elemento);
          String _plus_6 = (_nombre_4 + ".h");
          CharSequence _generateCabeceras_1 = this.generateCabeceras(elemento);
          sourceFile.generateFile(_plus_6, _generateCabeceras_1);
        }
      }
    }
  }
  
  /**
   * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Modulo.
   */
  @Override
  public CharSequence generateCabeceras(final Modulo modulo) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Procedimiento> procedimientosUsados = new ArrayList<Procedimiento>();
      ArrayList<Funcion> funcionesUsadas = new ArrayList<Funcion>();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#ifndef ");
      String _nombre = modulo.getNombre();
      String _upperCase = _nombre.toUpperCase();
      _builder.append(_upperCase, "");
      _builder.append("_H");
      _builder.newLineIfNotEmpty();
      _builder.append("#define ");
      String _nombre_1 = modulo.getNombre();
      String _upperCase_1 = _nombre_1.toUpperCase();
      _builder.append(_upperCase_1, "");
      _builder.append("_H");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Modulo> _importaciones = modulo.getImportaciones();
        for(final Modulo moduloRef : _importaciones) {
          _builder.append("#include \"");
          String _nombre_2 = moduloRef.getNombre();
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
        Implementacion _implementacion = modulo.getImplementacion();
        EList<Constante> _constantes = _implementacion.getConstantes();
        for(final Constante constante : _constantes) {
          {
            EList<String> _exporta_constantes = modulo.getExporta_constantes();
            Variable _variable = constante.getVariable();
            String _nombre_3 = _variable.getNombre();
            boolean _contains = _exporta_constantes.contains(_nombre_3);
            if (_contains) {
              CharSequence _generate = this.generate(constante);
              _builder.append(_generate, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      {
        Implementacion _implementacion_1 = modulo.getImplementacion();
        EList<TipoComplejo> _complejos = _implementacion_1.getComplejos();
        for(final TipoComplejo complejo : _complejos) {
          CharSequence _generate_1 = this.generate(complejo);
          _builder.append(_generate_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      ArrayList<String> variablesPublicas = new ArrayList<String>();
      _builder.newLineIfNotEmpty();
      _builder.append("class  ");
      String _nombre_4 = modulo.getNombre();
      _builder.append(_nombre_4, "");
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
        EList<Declaracion> _exporta_globales = modulo.getExporta_globales();
        for(final Declaracion declaracion : _exporta_globales) {
          _builder.append("\t\t");
          _builder.append("\t");
          this.addVariable(variablesPublicas, declaracion);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          CharSequence _generate_2 = this.generate(declaracion);
          _builder.append(_generate_2, "\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("//Métodos (funciones) a exportar");
      _builder.newLine();
      {
        EList<CabeceraSubproceso> _exporta_subprocesos = modulo.getExporta_subprocesos();
        for(final CabeceraSubproceso exportaCabecera : _exporta_subprocesos) {
          {
            EClass _eClass = exportaCabecera.eClass();
            String _name = _eClass.getName();
            boolean _equals = _name.equals("CabeceraProcedimiento");
            if (_equals) {
              _builder.append("\t\t");
              CabeceraProcedimiento cabecera = ((CabeceraProcedimiento) exportaCabecera);
              _builder.newLineIfNotEmpty();
              {
                Implementacion _implementacion_2 = modulo.getImplementacion();
                EList<Subproceso> _subprocesos = _implementacion_2.getSubprocesos();
                for(final Subproceso subproceso : _subprocesos) {
                  {
                    EClass _eClass_1 = subproceso.eClass();
                    String _name_1 = _eClass_1.getName();
                    boolean _equals_1 = _name_1.equals("Procedimiento");
                    if (_equals_1) {
                      _builder.append("\t\t");
                      Procedimiento procedimiento = ((Procedimiento) subproceso);
                      _builder.newLineIfNotEmpty();
                      {
                        if ((cabecera.getNombre().equals(procedimiento.getNombre()) && (procedimiento.getParametros().size() == cabecera.getParametros().size()))) {
                          String _generateCabeceras = this.generateCabeceras(subproceso);
                          _builder.append(_generateCabeceras, "");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t\t");
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
            EClass _eClass_2 = exportaCabecera.eClass();
            String _name_2 = _eClass_2.getName();
            boolean _equals_2 = _name_2.equals("CabeceraFuncion");
            if (_equals_2) {
              _builder.append("\t\t");
              CabeceraFuncion cabecera_1 = ((CabeceraFuncion) exportaCabecera);
              _builder.newLineIfNotEmpty();
              {
                Implementacion _implementacion_3 = modulo.getImplementacion();
                EList<Subproceso> _subprocesos_1 = _implementacion_3.getSubprocesos();
                for(final Subproceso subproceso_1 : _subprocesos_1) {
                  {
                    EClass _eClass_3 = subproceso_1.eClass();
                    String _name_3 = _eClass_3.getName();
                    boolean _equals_3 = _name_3.equals("Funcion");
                    if (_equals_3) {
                      _builder.append("\t\t");
                      Funcion funcion = ((Funcion) subproceso_1);
                      _builder.newLineIfNotEmpty();
                      {
                        if ((cabecera_1.getNombre().equals(funcion.getNombre()) && (funcion.getParametros().size() == cabecera_1.getParametros().size()))) {
                          String _generateCabeceras_1 = this.generateCabeceras(subproceso_1);
                          _builder.append(_generateCabeceras_1, "");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t\t\t");
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
        Implementacion _implementacion_4 = modulo.getImplementacion();
        EList<Declaracion> _globales = _implementacion_4.getGlobales();
        for(final Declaracion variable : _globales) {
          _builder.append("\t\t");
          CharSequence _generate_3 = this.generate(variable);
          _builder.append(_generate_3, "\t\t");
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
        Implementacion _implementacion_5 = modulo.getImplementacion();
        EList<Subproceso> _subprocesos_2 = _implementacion_5.getSubprocesos();
        for(final Subproceso subproceso_2 : _subprocesos_2) {
          {
            EClass _eClass_4 = subproceso_2.eClass();
            String _name_4 = _eClass_4.getName();
            boolean _equals_4 = _name_4.equals("Procedimiento");
            if (_equals_4) {
              _builder.append("\t\t");
              Procedimiento procedimiento_1 = ((Procedimiento) subproceso_2);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_1 = procedimientosUsados.contains(procedimiento_1);
                boolean _not = (!_contains_1);
                if (_not) {
                  String _generateCabecerasStatic = this.generateCabecerasStatic(subproceso_2);
                  _builder.append(_generateCabecerasStatic, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_5 = subproceso_2.eClass();
            String _name_5 = _eClass_5.getName();
            boolean _equals_5 = _name_5.equals("Funcion");
            if (_equals_5) {
              _builder.append("\t\t");
              Funcion funcion_1 = ((Funcion) subproceso_2);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_2 = funcionesUsadas.contains(funcion_1);
                boolean _not_1 = (!_contains_2);
                if (_not_1) {
                  String _generateCabecerasStatic_1 = this.generateCabecerasStatic(subproceso_2);
                  _builder.append(_generateCabecerasStatic_1, "");
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
      String _nombre_5 = modulo.getNombre();
      String _upperCase_2 = _nombre_5.toUpperCase();
      _builder.append(_upperCase_2, "");
      _builder.append("_H */");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Función auxiliar de generateCabeceras(Modulo) que se encarga de registrar las variables ya utilizadas.
   */
  public void addVariable(final List<String> variablesPublicas, final Declaracion declaracion) {
    if ((declaracion instanceof DeclaracionBasica)) {
      DeclaracionBasica declaracionBasica = ((DeclaracionBasica) declaracion);
      EList<Variable> _variables = declaracionBasica.getVariables();
      for (final Variable variable : _variables) {
        String _nombre = variable.getNombre();
        variablesPublicas.add(_nombre);
      }
    } else {
      DeclaracionDefinida declaracionDefinida = ((DeclaracionDefinida) declaracion);
      EList<Variable> _variables_1 = declaracionDefinida.getVariables();
      for (final Variable variable_1 : _variables_1) {
        String _nombre_1 = variable_1.getNombre();
        variablesPublicas.add(_nombre_1);
      }
    }
  }
  
  /**
   * Función auxiliar de doGenerate para generar los respectivos ficheros de cabecera (.h) - Algoritmo.
   */
  @Override
  public CharSequence generateCabeceras(final Algoritmo algoritmo) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("#ifndef ");
    String _nombre = algoritmo.getNombre();
    String _upperCase = _nombre.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.append("#define ");
    String _nombre_1 = algoritmo.getNombre();
    String _upperCase_1 = _nombre_1.toUpperCase();
    _builder.append(_upperCase_1, "");
    _builder.append("_H");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Modulo> _importaciones = algoritmo.getImportaciones();
      for(final Modulo moduloRef : _importaciones) {
        _builder.append("#include \"");
        String _nombre_2 = moduloRef.getNombre();
        _builder.append(_nombre_2, "");
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Constante> _constantes = algoritmo.getConstantes();
      for(final Constante constante : _constantes) {
        CharSequence _generate = this.generate(constante);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<TipoComplejo> _complejos = algoritmo.getComplejos();
      for(final TipoComplejo compleja : _complejos) {
        CharSequence _generate_1 = this.generate(compleja);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Subproceso> _subprocesos = algoritmo.getSubprocesos();
      for(final Subproceso funcion : _subprocesos) {
        String _generateCabeceras = this.generateCabeceras(funcion);
        _builder.append(_generateCabeceras, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("#endif /* ");
    String _nombre_3 = algoritmo.getNombre();
    String _upperCase_2 = _nombre_3.toUpperCase();
    _builder.append(_upperCase_2, "");
    _builder.append("_H */");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Función auxiliar de generateCabeceras(Modulo) para generar las cabeceras de las funciones con el prefijo static (.h).
   */
  public String generateCabecerasStatic(final Subproceso subproceso) {
    EClass _eClass = subproceso.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Funcion");
    if (_equals) {
      Funcion funcion = ((Funcion) subproceso);
      EList<Parametro> _parametros = funcion.getParametros();
      String _tipo = funcion.getTipo();
      String _tipoVariable = this.getTipoVariable(_tipo);
      String _plus = ("static " + _tipoVariable);
      String _plus_1 = (_plus + " ");
      String _nombre = funcion.getNombre();
      String _plus_2 = (_plus_1 + _nombre);
      return this.generateCabecerasAux(_parametros, _plus_2);
    } else {
      EClass _eClass_1 = subproceso.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Procedimiento");
      if (_equals_1) {
        Procedimiento procedimiento = ((Procedimiento) subproceso);
        EList<Parametro> _parametros_1 = procedimiento.getParametros();
        String _nombre_1 = procedimiento.getNombre();
        String _plus_3 = (("static void" + " ") + _nombre_1);
        return this.generateCabecerasAux(_parametros_1, _plus_3);
      }
    }
    return null;
  }
  
  /**
   * Función encargada de generar la entidad Algoritmo.
   * @param algoritmo
   */
  @Override
  public CharSequence generate(final Algoritmo algoritmo) {
    CharSequence _xblockexpression = null;
    {
      this.algoritmoActual = algoritmo;
      EList<TipoComplejo> _complejos = algoritmo.getComplejos();
      EList<Subproceso> _subprocesos = algoritmo.getSubprocesos();
      Inicio _inicio = algoritmo.getInicio();
      EList<Declaracion> _declaraciones = _inicio.getDeclaraciones();
      this.registrarInformacion(_complejos, _subprocesos, _declaraciones);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#include <iostream>");
      _builder.newLine();
      _builder.append("#include <string>");
      _builder.newLine();
      _builder.append("#include <cmath>");
      _builder.newLine();
      {
        if (VaryGrammarAbstractGeneratorCCPP.cabeceras) {
          _builder.append("#include \"");
          String _nombre = algoritmo.getNombre();
          _builder.append(_nombre, "");
          _builder.append(".h\"\t\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        if ((!VaryGrammarAbstractGeneratorCCPP.cabeceras)) {
          {
            EList<Modulo> _importaciones = algoritmo.getImportaciones();
            for(final Modulo moduloRef : _importaciones) {
              _builder.append("#include \"");
              String _nombre_1 = moduloRef.getNombre();
              _builder.append(_nombre_1, "");
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
        EList<Modulo> _importaciones_1 = algoritmo.getImportaciones();
        for(final Modulo moduloRef_1 : _importaciones_1) {
          String _nombre_2 = moduloRef_1.getNombre();
          _builder.append(_nombre_2, "");
          _builder.append(" ref");
          String _nombre_3 = moduloRef_1.getNombre();
          _builder.append(_nombre_3, "");
          _builder.append(" = ");
          String _nombre_4 = moduloRef_1.getNombre();
          _builder.append(_nombre_4, "");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        if ((!VaryGrammarAbstractGeneratorCCPP.cabeceras)) {
          {
            EList<Constante> _constantes = algoritmo.getConstantes();
            for(final Constante constante : _constantes) {
              CharSequence _generate = this.generate(constante);
              _builder.append(_generate, "");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            EList<TipoComplejo> _complejos_1 = algoritmo.getComplejos();
            for(final TipoComplejo complejo : _complejos_1) {
              CharSequence _generate_1 = this.generate(complejo);
              _builder.append(_generate_1, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      {
        EList<Declaracion> _globales = algoritmo.getGlobales();
        for(final Declaracion variable : _globales) {
          CharSequence _generate_2 = this.generate(variable);
          _builder.append(_generate_2, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<Subproceso> _subprocesos_1 = algoritmo.getSubprocesos();
        for(final Subproceso funcion : _subprocesos_1) {
          CharSequence _generate_3 = this.generate(funcion);
          _builder.append(_generate_3, "");
          _builder.newLineIfNotEmpty();
        }
      }
      Inicio _inicio_1 = algoritmo.getInicio();
      CharSequence _generate_4 = this.generate(_inicio_1);
      _builder.append(_generate_4, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * Función encargada de generar la entidad Modulo.
   * @param modulo
   */
  @Override
  public CharSequence generate(final Modulo modulo) {
    CharSequence _xblockexpression = null;
    {
      this.moduloActual = modulo;
      Implementacion _implementacion = modulo.getImplementacion();
      EList<TipoComplejo> _complejos = _implementacion.getComplejos();
      Implementacion _implementacion_1 = modulo.getImplementacion();
      EList<Subproceso> _subprocesos = _implementacion_1.getSubprocesos();
      this.registrarInformacion(_complejos, _subprocesos, null);
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
      String _nombre = modulo.getNombre();
      _builder.append(_nombre, "");
      _builder.append(".h\"");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("using namespace std;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Instanciamos los modulos que vamos a usar");
      _builder.newLine();
      {
        EList<Modulo> _importaciones = modulo.getImportaciones();
        for(final Modulo moduloRef : _importaciones) {
          String _nombre_1 = moduloRef.getNombre();
          _builder.append(_nombre_1, "");
          _builder.append(" ref");
          String _nombre_2 = moduloRef.getNombre();
          _builder.append(_nombre_2, "");
          _builder.append(" = ");
          String _nombre_3 = moduloRef.getNombre();
          _builder.append(_nombre_3, "");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        Implementacion _implementacion_2 = modulo.getImplementacion();
        EList<Constante> _constantes = _implementacion_2.getConstantes();
        for(final Constante constante : _constantes) {
          {
            EList<String> _exporta_constantes = modulo.getExporta_constantes();
            Variable _variable = constante.getVariable();
            String _nombre_4 = _variable.getNombre();
            boolean _contains = _exporta_constantes.contains(_nombre_4);
            boolean _not = (!_contains);
            if (_not) {
              CharSequence _generate = this.generate(constante);
              _builder.append(_generate, "");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.newLine();
      {
        Implementacion _implementacion_3 = modulo.getImplementacion();
        EList<TipoComplejo> _complejos_1 = _implementacion_3.getComplejos();
        for(final TipoComplejo complejo : _complejos_1) {
          CharSequence _generate_1 = this.generate(complejo);
          _builder.append(_generate_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("//Metodos publicos");
      _builder.newLine();
      _builder.newLine();
      {
        EList<CabeceraSubproceso> _exporta_subprocesos = modulo.getExporta_subprocesos();
        for(final CabeceraSubproceso exportaCabecera : _exporta_subprocesos) {
          {
            Implementacion _implementacion_4 = modulo.getImplementacion();
            EList<Subproceso> _subprocesos_1 = _implementacion_4.getSubprocesos();
            for(final Subproceso subproceso : _subprocesos_1) {
              {
                EClass _eClass = subproceso.eClass();
                String _name = _eClass.getName();
                boolean _equals = _name.equals("Procedimiento");
                if (_equals) {
                  Procedimiento procedimiento = ((Procedimiento) subproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    if ((modulo.getExporta_subprocesos().contains(procedimiento.getNombre()) && (procedimiento.getParametros().size() == exportaCabecera.getParametros().size()))) {
                      String _nombre_5 = modulo.getNombre();
                      String _generate_2 = this.generate(procedimiento, _nombre_5);
                      _builder.append(_generate_2, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t\t");
                      this.addProcedimiento(procedimiento, procedimientosUsados);
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
              {
                EClass _eClass_1 = subproceso.eClass();
                String _name_1 = _eClass_1.getName();
                boolean _equals_1 = _name_1.equals("Funcion");
                if (_equals_1) {
                  Funcion funcion = ((Funcion) subproceso);
                  _builder.newLineIfNotEmpty();
                  {
                    if ((modulo.getExporta_subprocesos().contains(funcion.getNombre()) && (funcion.getParametros().size() == exportaCabecera.getParametros().size()))) {
                      String _nombre_6 = modulo.getNombre();
                      String _generate_3 = this.generate(funcion, _nombre_6);
                      _builder.append(_generate_3, "");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t\t");
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
      _builder.newLine();
      _builder.append("//Metodos privados");
      _builder.newLine();
      _builder.newLine();
      {
        Implementacion _implementacion_5 = modulo.getImplementacion();
        EList<Subproceso> _subprocesos_2 = _implementacion_5.getSubprocesos();
        for(final Subproceso subproceso_1 : _subprocesos_2) {
          {
            EClass _eClass_2 = subproceso_1.eClass();
            String _name_2 = _eClass_2.getName();
            boolean _equals_2 = _name_2.equals("Procedimiento");
            if (_equals_2) {
              Procedimiento procedimiento_1 = ((Procedimiento) subproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_1 = procedimientosUsados.contains(procedimiento_1);
                boolean _not_1 = (!_contains_1);
                if (_not_1) {
                  String _nombre_7 = modulo.getNombre();
                  String _generate_4 = this.generate(procedimiento_1, _nombre_7);
                  _builder.append(_generate_4, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          {
            EClass _eClass_3 = subproceso_1.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("Funcion");
            if (_equals_3) {
              Funcion funcion_1 = ((Funcion) subproceso_1);
              _builder.newLineIfNotEmpty();
              {
                boolean _contains_2 = funcionesUsadas.contains(funcion_1);
                boolean _not_2 = (!_contains_2);
                if (_not_2) {
                  String _nombre_8 = modulo.getNombre();
                  String _generate_5 = this.generate(funcion_1, _nombre_8);
                  _builder.append(_generate_5, "");
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
  
  /**
   * Función auxiliar de generate(Modulo) que se encarga de registrar los procedimientos ya utilizados.
   */
  public void addProcedimiento(final Procedimiento procedimiento, final List<Procedimiento> procedimientos) {
    procedimientos.add(procedimiento);
  }
  
  /**
   * Función auxiliar de generate(Modulo) que se encarga de registrar las funciones ya registradas.
   */
  public void addFuncion(final Funcion funcion, final List<Funcion> funciones) {
    funciones.add(funcion);
  }
  
  /**
   * Función auxiliar de generate(TipoExistente) que se encarga de obtener los tipos de datos correspondientes en C.
   */
  @Override
  public String getTipoVariable(final String tipo) {
    ResourceBundle _bundle = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string = _bundle.getString("TIPO_ENTERO");
    boolean _equals = tipo.equals(_string);
    if (_equals) {
      return "int";
    }
    ResourceBundle _bundle_1 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string_1 = _bundle_1.getString("TIPO_CARACTER");
    boolean _equals_1 = tipo.equals(_string_1);
    if (_equals_1) {
      return "char";
    }
    ResourceBundle _bundle_2 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string_2 = _bundle_2.getString("TIPO_REAL");
    boolean _equals_2 = tipo.equals(_string_2);
    if (_equals_2) {
      return "float";
    }
    ResourceBundle _bundle_3 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string_3 = _bundle_3.getString("TIPO_LOGICO");
    boolean _equals_3 = tipo.equals(_string_3);
    if (_equals_3) {
      return "bool";
    }
    ResourceBundle _bundle_4 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string_4 = _bundle_4.getString("TIPO_CADENA");
    boolean _equals_4 = tipo.equals(_string_4);
    if (_equals_4) {
      return "string";
    }
    return null;
  }
  
  /**
   * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Funcion para uso en Modulo (static).
   */
  public String generate(final Funcion funcion, final String nombreModulo) {
    String _tipo = funcion.getTipo();
    String _tipoVariable = this.getTipoVariable(_tipo);
    String _plus = (_tipoVariable + " ");
    String _plus_1 = (_plus + nombreModulo);
    String _plus_2 = (_plus_1 + "::");
    String _nombre = funcion.getNombre();
    EList<Parametro> _parametros = funcion.getParametros();
    EList<Declaracion> _declaraciones = funcion.getDeclaraciones();
    EList<Sentencia> _sentencias = funcion.getSentencias();
    Devolver _devuelve = funcion.getDevuelve();
    return this.generateSubprocesoAux(_plus_2, _nombre, _parametros, _declaraciones, _sentencias, _devuelve);
  }
  
  /**
   * Función auxiliar de generate(Subproceso) que se encarga de generar la entidad Procedimiento para uso en Modulo (static).
   */
  public String generate(final Procedimiento procedimiento, final String nombreModulo) {
    String _nombre = procedimiento.getNombre();
    EList<Parametro> _parametros = procedimiento.getParametros();
    EList<Declaracion> _declaraciones = procedimiento.getDeclaraciones();
    EList<Sentencia> _sentencias = procedimiento.getSentencias();
    return this.generateSubprocesoAux((("void " + nombreModulo) + "::"), _nombre, _parametros, _declaraciones, _sentencias, null);
  }
  
  /**
   * Función encargada de generar la entidad FuncionInterna.
   * @param interna, sentencia
   */
  @Override
  public CharSequence generate(final FuncionInterna interna, final boolean sentencia, final List<String> punteros) {
    CharSequence _xifexpression = null;
    String _nombre = interna.getNombre();
    ResourceBundle _bundle = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
    String _string = _bundle.getString("INTERNAS_COS");
    String _plus = (_string + "(");
    boolean _equals = _nombre.equals(_plus);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("cos(");
      EList<Operacion> _parametros = interna.getParametros();
      Operacion _get = _parametros.get(0);
      CharSequence _generate = this.generate(_get, punteros);
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
      String _nombre_1 = interna.getNombre();
      ResourceBundle _bundle_1 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
      String _string_1 = _bundle_1.getString("INTERNAS_SEN");
      String _plus_1 = (_string_1 + "(");
      boolean _equals_1 = _nombre_1.equals(_plus_1);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("sin(");
        EList<Operacion> _parametros_1 = interna.getParametros();
        Operacion _get_1 = _parametros_1.get(0);
        CharSequence _generate_1 = this.generate(_get_1, punteros);
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
        String _nombre_2 = interna.getNombre();
        ResourceBundle _bundle_2 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
        String _string_2 = _bundle_2.getString("INTERNAS_CUADRADO");
        String _plus_2 = (_string_2 + "(");
        boolean _equals_2 = _nombre_2.equals(_plus_2);
        if (_equals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("pow(");
          EList<Operacion> _parametros_2 = interna.getParametros();
          Operacion _get_2 = _parametros_2.get(0);
          CharSequence _generate_2 = this.generate(_get_2, punteros);
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
          String _nombre_3 = interna.getNombre();
          ResourceBundle _bundle_3 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
          String _string_3 = _bundle_3.getString("INTERNAS_EXP");
          String _plus_3 = (_string_3 + "(");
          boolean _equals_3 = _nombre_3.equals(_plus_3);
          if (_equals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("exp2(");
            EList<Operacion> _parametros_3 = interna.getParametros();
            Operacion _get_3 = _parametros_3.get(0);
            CharSequence _generate_3 = this.generate(_get_3, punteros);
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
            String _nombre_4 = interna.getNombre();
            ResourceBundle _bundle_4 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
            String _string_4 = _bundle_4.getString("INTERNAS_LN");
            String _plus_4 = (_string_4 + "(");
            boolean _equals_4 = _nombre_4.equals(_plus_4);
            if (_equals_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("log(");
              EList<Operacion> _parametros_4 = interna.getParametros();
              Operacion _get_4 = _parametros_4.get(0);
              CharSequence _generate_4 = this.generate(_get_4, punteros);
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
              String _nombre_5 = interna.getNombre();
              ResourceBundle _bundle_5 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
              String _string_5 = _bundle_5.getString("INTERNAS_LOG");
              String _plus_5 = (_string_5 + "(");
              boolean _equals_5 = _nombre_5.equals(_plus_5);
              if (_equals_5) {
                StringConcatenation _builder_5 = new StringConcatenation();
                _builder_5.append("log10(");
                EList<Operacion> _parametros_5 = interna.getParametros();
                Operacion _get_5 = _parametros_5.get(0);
                CharSequence _generate_5 = this.generate(_get_5, punteros);
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
                String _nombre_6 = interna.getNombre();
                ResourceBundle _bundle_6 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                String _string_6 = _bundle_6.getString("INTERNAS_SQRT");
                String _plus_6 = (_string_6 + "(");
                boolean _equals_6 = _nombre_6.equals(_plus_6);
                if (_equals_6) {
                  StringConcatenation _builder_6 = new StringConcatenation();
                  _builder_6.append("sqrt(");
                  EList<Operacion> _parametros_6 = interna.getParametros();
                  Operacion _get_6 = _parametros_6.get(0);
                  CharSequence _generate_6 = this.generate(_get_6, punteros);
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
                  String _nombre_7 = interna.getNombre();
                  ResourceBundle _bundle_7 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                  String _string_7 = _bundle_7.getString("INTERNAS_CONCATENA");
                  String _plus_7 = (_string_7 + "(");
                  boolean _equals_7 = _nombre_7.equals(_plus_7);
                  if (_equals_7) {
                    StringConcatenation _builder_7 = new StringConcatenation();
                    EList<Operacion> _parametros_7 = interna.getParametros();
                    Operacion _get_7 = _parametros_7.get(0);
                    CharSequence _generate_7 = this.generate(_get_7, punteros);
                    _builder_7.append(_generate_7, "");
                    _builder_7.append(" = ");
                    EList<Operacion> _parametros_8 = interna.getParametros();
                    Operacion _get_8 = _parametros_8.get(0);
                    CharSequence _generate_8 = this.generate(_get_8, punteros);
                    _builder_7.append(_generate_8, "");
                    _builder_7.append(" + ");
                    EList<Operacion> _parametros_9 = interna.getParametros();
                    Operacion _get_9 = _parametros_9.get(1);
                    CharSequence _generate_9 = this.generate(_get_9, punteros);
                    _builder_7.append(_generate_9, "");
                    {
                      if (sentencia) {
                        _builder_7.append(";");
                      }
                    }
                    _xifexpression_7 = _builder_7;
                  } else {
                    CharSequence _xifexpression_8 = null;
                    String _nombre_8 = interna.getNombre();
                    ResourceBundle _bundle_8 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                    String _string_8 = _bundle_8.getString("INTERNAS_COPIAR");
                    String _plus_8 = (_string_8 + "(");
                    boolean _equals_8 = _nombre_8.equals(_plus_8);
                    if (_equals_8) {
                      StringConcatenation _builder_8 = new StringConcatenation();
                      EList<Operacion> _parametros_10 = interna.getParametros();
                      Operacion _get_10 = _parametros_10.get(0);
                      CharSequence _generate_10 = this.generate(_get_10, punteros);
                      _builder_8.append(_generate_10, "");
                      _builder_8.append(" = ");
                      EList<Operacion> _parametros_11 = interna.getParametros();
                      Operacion _get_11 = _parametros_11.get(1);
                      CharSequence _generate_11 = this.generate(_get_11, punteros);
                      _builder_8.append(_generate_11, "");
                      {
                        if (sentencia) {
                          _builder_8.append(";");
                        }
                      }
                      _xifexpression_8 = _builder_8;
                    } else {
                      CharSequence _xifexpression_9 = null;
                      String _nombre_9 = interna.getNombre();
                      ResourceBundle _bundle_9 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                      String _string_9 = _bundle_9.getString("INTERNAS_LONGITUD");
                      String _plus_9 = (_string_9 + "(");
                      boolean _equals_9 = _nombre_9.equals(_plus_9);
                      if (_equals_9) {
                        StringConcatenation _builder_9 = new StringConcatenation();
                        _builder_9.append("strlen(");
                        EList<Operacion> _parametros_12 = interna.getParametros();
                        Operacion _get_12 = _parametros_12.get(0);
                        CharSequence _generate_12 = this.generate(_get_12, punteros);
                        _builder_9.append(_generate_12, "");
                        _builder_9.append(")");
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
  
  /**
   * Función encargada de generar la entidad LlamadaFuncion.
   * @param llamadaFuncion, sentencia
   */
  @Override
  public CharSequence generate(final LlamadaFuncion llamadaFuncion, final boolean a, final List<String> punteros) {
    CharSequence _xblockexpression = null;
    {
      String nombreModulo = new String();
      boolean _notEquals = (!Objects.equal(this.algoritmoActual, null));
      if (_notEquals) {
        String _nombre = llamadaFuncion.getNombre();
        EList<Modulo> _importaciones = this.algoritmoActual.getImportaciones();
        EList<Operacion> _parametros = llamadaFuncion.getParametros();
        int _size = _parametros.size();
        String _nombreModulo = this.getNombreModulo(_nombre, _importaciones, _size);
        nombreModulo = _nombreModulo;
      } else {
        boolean _notEquals_1 = (!Objects.equal(this.moduloActual, null));
        if (_notEquals_1) {
          String _nombre_1 = llamadaFuncion.getNombre();
          EList<Modulo> _importaciones_1 = this.moduloActual.getImportaciones();
          EList<Operacion> _parametros_1 = llamadaFuncion.getParametros();
          int _size_1 = _parametros_1.size();
          String _nombreModulo_1 = this.getNombreModulo(_nombre_1, _importaciones_1, _size_1);
          nombreModulo = _nombreModulo_1;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isEmpty = nombreModulo.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.newLineIfNotEmpty();
          _builder.append("ref");
          _builder.append(nombreModulo, "");
          _builder.append(".");
          String _nombre_2 = llamadaFuncion.getNombre();
          _builder.append(_nombre_2, "");
          {
            String _nombre_3 = llamadaFuncion.getNombre();
            boolean _containsKey = VaryGrammarAbstractGeneratorCCPP.subprocesosConPunteros.containsKey(_nombre_3);
            if (_containsKey) {
              {
                String _nombre_4 = llamadaFuncion.getNombre();
                ArrayList<Integer> _get = VaryGrammarAbstractGeneratorCCPP.subprocesosConPunteros.get(_nombre_4);
                int _size_2 = _get.size();
                boolean _equals = (_size_2 == 0);
                if (_equals) {
                  EList<Operacion> _parametros_2 = llamadaFuncion.getParametros();
                  String _nombre_5 = llamadaFuncion.getNombre();
                  String _parametros_3 = this.getParametros(_parametros_2, _nombre_5, punteros);
                  _builder.append(_parametros_3, "");
                } else {
                  EList<Operacion> _parametros_4 = llamadaFuncion.getParametros();
                  String _nombre_6 = llamadaFuncion.getNombre();
                  String _parametros_5 = this.getParametros(_parametros_4, _nombre_6, punteros);
                  _builder.append(_parametros_5, "");
                }
              }
            } else {
              EList<Operacion> _parametros_6 = llamadaFuncion.getParametros();
              String _nombre_7 = llamadaFuncion.getNombre();
              String _parametros_7 = this.getParametros(_parametros_6, _nombre_7, punteros);
              _builder.append(_parametros_7, "");
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
          String _nombre_8 = llamadaFuncion.getNombre();
          _builder.append(_nombre_8, "");
          {
            String _nombre_9 = llamadaFuncion.getNombre();
            boolean _containsKey_1 = VaryGrammarAbstractGeneratorCCPP.subprocesosConPunteros.containsKey(_nombre_9);
            if (_containsKey_1) {
              {
                String _nombre_10 = llamadaFuncion.getNombre();
                ArrayList<Integer> _get_1 = VaryGrammarAbstractGeneratorCCPP.subprocesosConPunteros.get(_nombre_10);
                int _size_3 = _get_1.size();
                boolean _equals_1 = (_size_3 == 0);
                if (_equals_1) {
                  EList<Operacion> _parametros_8 = llamadaFuncion.getParametros();
                  String _nombre_11 = llamadaFuncion.getNombre();
                  String _parametros_9 = this.getParametros(_parametros_8, _nombre_11, punteros);
                  _builder.append(_parametros_9, "");
                } else {
                  EList<Operacion> _parametros_10 = llamadaFuncion.getParametros();
                  String _nombre_12 = llamadaFuncion.getNombre();
                  String _parametros_11 = this.getParametros(_parametros_10, _nombre_12, punteros);
                  _builder.append(_parametros_11, "");
                }
              }
            } else {
              EList<Operacion> _parametros_12 = llamadaFuncion.getParametros();
              String _nombre_13 = llamadaFuncion.getNombre();
              String _parametros_13 = this.getParametros(_parametros_12, _nombre_13, punteros);
              _builder.append(_parametros_13, "");
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
  
  /**
   * Función auxiliar de generate(LlamadaFuncion) que se encarga de comprobar el nombre del Modulo al que pertenece la función (si lo tiene).
   */
  public String getNombreModulo(final String nombreFuncion, final List<Modulo> modulosImportados, final int numeroParametros) {
    String nombreModulo = new String();
    for (final Modulo modulo : modulosImportados) {
      EList<CabeceraSubproceso> _exporta_subprocesos = modulo.getExporta_subprocesos();
      for (final CabeceraSubproceso cabecera : _exporta_subprocesos) {
        if ((cabecera instanceof CabeceraProcedimiento)) {
          CabeceraProcedimiento cabeceraProcedimiento = ((CabeceraProcedimiento) cabecera);
          if ((nombreFuncion.equals(cabeceraProcedimiento.getNombre()) && (numeroParametros == cabeceraProcedimiento.getParametros().size()))) {
            String _nombre = modulo.getNombre();
            nombreModulo = _nombre;
          }
        } else {
          if ((cabecera instanceof CabeceraFuncion)) {
            CabeceraFuncion cabeceraFuncion = ((CabeceraFuncion) cabecera);
            if ((nombreFuncion.equals(cabeceraFuncion.getNombre()) && (numeroParametros == cabeceraFuncion.getParametros().size()))) {
              String _nombre_1 = modulo.getNombre();
              nombreModulo = _nombre_1;
            }
          }
        }
      }
    }
    return nombreModulo;
  }
  
  /**
   * Función encargada de generar la entidad Escribir.
   * @param escribir, punteros
   */
  @Override
  public CharSequence generate(final Escribir escribir, final List<String> punteros, final List<Sentencia> sentencias, final List<Subproceso> subprocesos, final boolean inicio) {
    CharSequence _xifexpression = null;
    if (inicio) {
      EList<Operacion> _operador = escribir.getOperador();
      Operacion _get = _operador.get(0);
      String _tipoOperador = this.getTipoOperador(_get, inicio, "");
      boolean _contains = VaryGrammarAbstractGeneratorCCPP.archivos.contains(_tipoOperador);
      if (_contains) {
        String cadena = "";
        EList<Operacion> _operador_1 = escribir.getOperador();
        Operacion _get_1 = _operador_1.get(0);
        CharSequence _generate = this.generate(_get_1, punteros);
        String _plus = (cadena + _generate);
        String _plus_1 = (_plus + ", \"");
        cadena = _plus_1;
        EList<Operacion> _operador_2 = escribir.getOperador();
        for (final Operacion operador : _operador_2) {
          if (((((escribir.getOperador().indexOf(operador) != 0) && (!operador.eClass().getName().equals("CadenaCaracteres"))) && (!VaryGrammarAbstractGeneratorCCPP.archivos.contains(this.getTipoOperador(escribir.getOperador().get(0), inicio, "")))) || (escribir.getOperador().indexOf(operador) != 0))) {
            String tipo = this.getTipoOperador(operador, inicio, "");
            if ((tipo.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass().getName().equals("Entero"))) {
              EList<Operacion> _operador_3 = escribir.getOperador();
              int _indexOf = _operador_3.indexOf(operador);
              EList<Operacion> _operador_4 = escribir.getOperador();
              int _size = _operador_4.size();
              int _minus = (_size - 1);
              boolean _equals = (_indexOf == _minus);
              if (_equals) {
                cadena = (cadena + " %i \\n \"");
              } else {
                cadena = (cadena + " %i");
              }
            } else {
              if ((tipo.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")) || operador.eClass().getName().equals("Caracter"))) {
                EList<Operacion> _operador_5 = escribir.getOperador();
                int _indexOf_1 = _operador_5.indexOf(operador);
                EList<Operacion> _operador_6 = escribir.getOperador();
                int _size_1 = _operador_6.size();
                int _minus_1 = (_size_1 - 1);
                boolean _equals_1 = (_indexOf_1 == _minus_1);
                if (_equals_1) {
                  cadena = (cadena + " %c \\n \"");
                } else {
                  cadena = (cadena + " %c");
                }
              } else {
                if ((tipo.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || operador.eClass().getName().equals("CadenaCaracteres"))) {
                  EList<Operacion> _operador_7 = escribir.getOperador();
                  int _indexOf_2 = _operador_7.indexOf(operador);
                  EList<Operacion> _operador_8 = escribir.getOperador();
                  int _size_2 = _operador_8.size();
                  int _minus_2 = (_size_2 - 1);
                  boolean _equals_2 = (_indexOf_2 == _minus_2);
                  if (_equals_2) {
                    cadena = (cadena + " %s \\n \"");
                  } else {
                    cadena = (cadena + " %s");
                  }
                } else {
                  if ((tipo.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_REAL")) || operador.eClass().getName().equals("Real"))) {
                    EList<Operacion> _operador_9 = escribir.getOperador();
                    int _indexOf_3 = _operador_9.indexOf(operador);
                    EList<Operacion> _operador_10 = escribir.getOperador();
                    int _size_3 = _operador_10.size();
                    int _minus_3 = (_size_3 - 1);
                    boolean _equals_3 = (_indexOf_3 == _minus_3);
                    if (_equals_3) {
                      cadena = (cadena + " %f \\n \"");
                    } else {
                      cadena = (cadena + " %f");
                    }
                  } else {
                    boolean _containsKey = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.containsKey(tipo);
                    if (_containsKey) {
                      String tipoAux = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.get(tipo);
                      if ((tipoAux.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || operador.eClass().getName().equals("Entero"))) {
                        EList<Operacion> _operador_11 = escribir.getOperador();
                        int _indexOf_4 = _operador_11.indexOf(operador);
                        EList<Operacion> _operador_12 = escribir.getOperador();
                        int _size_4 = _operador_12.size();
                        int _minus_4 = (_size_4 - 1);
                        boolean _equals_4 = (_indexOf_4 == _minus_4);
                        if (_equals_4) {
                          cadena = (cadena + " %i \\n \"");
                        } else {
                          cadena = (cadena + " %i");
                        }
                      } else {
                        if ((tipoAux.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                          EList<Operacion> _operador_13 = escribir.getOperador();
                          int _indexOf_5 = _operador_13.indexOf(operador);
                          EList<Operacion> _operador_14 = escribir.getOperador();
                          int _size_5 = _operador_14.size();
                          int _minus_5 = (_size_5 - 1);
                          boolean _equals_5 = (_indexOf_5 == _minus_5);
                          if (_equals_5) {
                            cadena = (cadena + " %s \\n \"");
                          } else {
                            cadena = (cadena + " %s");
                          }
                        } else {
                          ResourceBundle _bundle = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                          String _string = _bundle.getString("TIPO_REAL");
                          boolean _equals_6 = tipoAux.equals(_string);
                          if (_equals_6) {
                            EList<Operacion> _operador_15 = escribir.getOperador();
                            int _indexOf_6 = _operador_15.indexOf(operador);
                            EList<Operacion> _operador_16 = escribir.getOperador();
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
        if (((escribir.getOperador().size() > 1) || ((escribir.getOperador().size() == 1) && (!escribir.getOperador().get(0).eClass().getName().equals("CadenaCaracteres"))))) {
          EList<Operacion> _operador_17 = escribir.getOperador();
          String _operadoresFormatoC = this.getOperadoresFormatoC(_operador_17, true, punteros, inicio, "");
          String _plus_2 = ((cadena + ", ") + _operadoresFormatoC);
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
        EList<Operacion> _operador_18 = escribir.getOperador();
        String _operadoresFormatoCpp = this.getOperadoresFormatoCpp(_operador_18, punteros);
        String _plus_3 = ("cout" + _operadoresFormatoCpp);
        return (_plus_3 + " << endl;");
      }
    } else {
      for (final Subproceso subproceso : subprocesos) {
        EList<Operacion> _operador_19 = escribir.getOperador();
        Operacion _get_2 = _operador_19.get(0);
        String _nombre = subproceso.getNombre();
        String _tipoOperador_1 = this.getTipoOperador(_get_2, inicio, _nombre);
        boolean _contains_1 = VaryGrammarAbstractGeneratorCCPP.archivos.contains(_tipoOperador_1);
        if (_contains_1) {
          String cadena_1 = "";
          EList<Operacion> _operador_20 = escribir.getOperador();
          Operacion _get_3 = _operador_20.get(0);
          CharSequence _generate_1 = this.generate(_get_3, punteros);
          String _plus_4 = (cadena_1 + _generate_1);
          String _plus_5 = (_plus_4 + ", \"");
          cadena_1 = _plus_5;
          EList<Operacion> _operador_21 = escribir.getOperador();
          for (final Operacion operador_1 : _operador_21) {
            if (((((escribir.getOperador().indexOf(operador_1) != 0) && (!operador_1.eClass().getName().equals("CadenaCaracteres"))) && (!VaryGrammarAbstractGeneratorCCPP.archivos.contains(this.getTipoOperador(escribir.getOperador().get(0), inicio, "")))) || (escribir.getOperador().indexOf(operador_1) != 0))) {
              String _nombre_1 = subproceso.getNombre();
              String tipo_1 = this.getTipoOperador(operador_1, inicio, _nombre_1);
              if ((tipo_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || operador_1.eClass().getName().equals("Entero"))) {
                EList<Operacion> _operador_22 = escribir.getOperador();
                int _indexOf_7 = _operador_22.indexOf(operador_1);
                EList<Operacion> _operador_23 = escribir.getOperador();
                int _size_7 = _operador_23.size();
                int _minus_7 = (_size_7 - 1);
                boolean _equals_8 = (_indexOf_7 == _minus_7);
                if (_equals_8) {
                  cadena_1 = (cadena_1 + " %i \\n \"");
                } else {
                  cadena_1 = (cadena_1 + " %i");
                }
              } else {
                if ((tipo_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")) || operador_1.eClass().getName().equals("Caracter"))) {
                  EList<Operacion> _operador_24 = escribir.getOperador();
                  int _indexOf_8 = _operador_24.indexOf(operador_1);
                  EList<Operacion> _operador_25 = escribir.getOperador();
                  int _size_8 = _operador_25.size();
                  int _minus_8 = (_size_8 - 1);
                  boolean _equals_9 = (_indexOf_8 == _minus_8);
                  if (_equals_9) {
                    cadena_1 = (cadena_1 + " %c \\n \"");
                  } else {
                    cadena_1 = (cadena_1 + " %c");
                  }
                } else {
                  if ((tipo_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || operador_1.eClass().getName().equals("CadenaCaracteres"))) {
                    EList<Operacion> _operador_26 = escribir.getOperador();
                    int _indexOf_9 = _operador_26.indexOf(operador_1);
                    EList<Operacion> _operador_27 = escribir.getOperador();
                    int _size_9 = _operador_27.size();
                    int _minus_9 = (_size_9 - 1);
                    boolean _equals_10 = (_indexOf_9 == _minus_9);
                    if (_equals_10) {
                      cadena_1 = (cadena_1 + " %s \\n \"");
                    } else {
                      cadena_1 = (cadena_1 + " %s");
                    }
                  } else {
                    if ((tipo_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_REAL")) || operador_1.eClass().getName().equals("Real"))) {
                      EList<Operacion> _operador_28 = escribir.getOperador();
                      int _indexOf_10 = _operador_28.indexOf(operador_1);
                      EList<Operacion> _operador_29 = escribir.getOperador();
                      int _size_10 = _operador_29.size();
                      int _minus_10 = (_size_10 - 1);
                      boolean _equals_11 = (_indexOf_10 == _minus_10);
                      if (_equals_11) {
                        cadena_1 = (cadena_1 + " %f \\n \"");
                      } else {
                        cadena_1 = (cadena_1 + " %f");
                      }
                    } else {
                      boolean _containsKey_1 = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.containsKey(tipo_1);
                      if (_containsKey_1) {
                        String tipoAux_1 = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.get(tipo_1);
                        if ((tipoAux_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_ENTERO")) || operador_1.eClass().getName().equals("Entero"))) {
                          EList<Operacion> _operador_30 = escribir.getOperador();
                          int _indexOf_11 = _operador_30.indexOf(operador_1);
                          EList<Operacion> _operador_31 = escribir.getOperador();
                          int _size_11 = _operador_31.size();
                          int _minus_11 = (_size_11 - 1);
                          boolean _equals_12 = (_indexOf_11 == _minus_11);
                          if (_equals_12) {
                            cadena_1 = (cadena_1 + " %i \\n \"");
                          } else {
                            cadena_1 = (cadena_1 + " %i");
                          }
                        } else {
                          if ((tipoAux_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                            EList<Operacion> _operador_32 = escribir.getOperador();
                            int _indexOf_12 = _operador_32.indexOf(operador_1);
                            EList<Operacion> _operador_33 = escribir.getOperador();
                            int _size_12 = _operador_33.size();
                            int _minus_12 = (_size_12 - 1);
                            boolean _equals_13 = (_indexOf_12 == _minus_12);
                            if (_equals_13) {
                              cadena_1 = (cadena_1 + " %s \\n \"");
                            } else {
                              cadena_1 = (cadena_1 + " %s");
                            }
                          } else {
                            ResourceBundle _bundle_1 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                            String _string_1 = _bundle_1.getString("TIPO_REAL");
                            boolean _equals_14 = tipoAux_1.equals(_string_1);
                            if (_equals_14) {
                              EList<Operacion> _operador_34 = escribir.getOperador();
                              int _indexOf_13 = _operador_34.indexOf(operador_1);
                              EList<Operacion> _operador_35 = escribir.getOperador();
                              int _size_13 = _operador_35.size();
                              int _minus_13 = (_size_13 - 1);
                              boolean _equals_15 = (_indexOf_13 == _minus_13);
                              if (_equals_15) {
                                cadena_1 = (cadena_1 + " %f \\n \"");
                              } else {
                                cadena_1 = (cadena_1 + " %f");
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
          if (((escribir.getOperador().size() > 1) || ((escribir.getOperador().size() == 1) && (!escribir.getOperador().get(0).eClass().getName().equals("CadenaCaracteres"))))) {
            EList<Operacion> _operador_36 = escribir.getOperador();
            String _nombre_2 = subproceso.getNombre();
            String _operadoresFormatoC_1 = this.getOperadoresFormatoC(_operador_36, true, punteros, inicio, _nombre_2);
            String _plus_6 = ((cadena_1 + ", ") + _operadoresFormatoC_1);
            cadena_1 = _plus_6;
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("fprintf(");
            _builder_2.append(cadena_1, "");
            _builder_2.append(");");
            return _builder_2;
          } else {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("fprintf(");
            _builder_3.append(cadena_1, "");
            _builder_3.append(");");
            return _builder_3;
          }
        } else {
          EList<Operacion> _operador_37 = escribir.getOperador();
          String _operadoresFormatoCpp_1 = this.getOperadoresFormatoCpp(_operador_37, punteros);
          String _plus_7 = ("cout" + _operadoresFormatoCpp_1);
          return (_plus_7 + " << endl;");
        }
      }
    }
    return _xifexpression;
  }
  
  /**
   * Función auxiliar de generate(Escribir) que se encarga de generar los operadores utilizados en la función Escribir (formato C).
   */
  public String getOperadoresFormatoC(final EList<Operacion> operaciones, final boolean saltarPrimero, final List<String> punteros, final boolean inicio, final String nombreActual) {
    String descripcionOperadores = "";
    for (final Operacion operacion : operaciones) {
      if ((((operaciones.indexOf(operacion) < (operaciones.size() - 1)) && (!saltarPrimero)) || (((operaciones.indexOf(operacion) < (operaciones.size() - 1)) && saltarPrimero) && (operaciones.indexOf(operacion) != 0)))) {
        if ((this.getTipoOperador(operacion, inicio, nombreActual).equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) && (!this.generate(operacion, punteros).toString().contains("\"")))) {
          CharSequence _generate = this.generate(operacion, punteros);
          String _plus = (descripcionOperadores + _generate);
          String _plus_1 = (_plus + ".c_str() , ");
          descripcionOperadores = _plus_1;
        } else {
          CharSequence _generate_1 = this.generate(operacion, punteros);
          String _plus_2 = (descripcionOperadores + _generate_1);
          String _plus_3 = (_plus_2 + " , ");
          descripcionOperadores = _plus_3;
        }
      } else {
        if (((operaciones.indexOf(operacion) != 0) || ((operaciones.size() == 1) && (!saltarPrimero)))) {
          if ((this.getTipoOperador(operacion, inicio, nombreActual).equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) && (!this.generate(operacion, punteros).toString().contains("\"")))) {
            CharSequence _generate_2 = this.generate(operacion, punteros);
            String _plus_4 = (descripcionOperadores + _generate_2);
            String _plus_5 = (_plus_4 + ".c_str()");
            descripcionOperadores = _plus_5;
          } else {
            CharSequence _generate_3 = this.generate(operacion, punteros);
            String _plus_6 = (descripcionOperadores + _generate_3);
            descripcionOperadores = _plus_6;
          }
        }
      }
    }
    return descripcionOperadores;
  }
  
  /**
   * Función auxiliar de generate(Escribir) que se encarga de generar los operadores utilizados en la función Escribir (formato C++).
   */
  public String getOperadoresFormatoCpp(final EList<Operacion> operaciones, final List<String> punteros) {
    String descripcionOperadores = "";
    for (final Operacion operacion : operaciones) {
      CharSequence _generate = this.generate(operacion, punteros);
      String _plus = ((descripcionOperadores + " << ") + _generate);
      descripcionOperadores = _plus;
    }
    return descripcionOperadores;
  }
  
  /**
   * Función encargada de generar la entidad Leer.
   * @param leer, sentencias, subprocesos, algoritmo
   */
  @Override
  public CharSequence generate(final Leer leer, final List<Sentencia> sentencias, final List<Subproceso> subprocesos, final boolean inicio) {
    CharSequence _xblockexpression = null;
    {
      String tipo = new String();
      String descripcionLeer = new String();
      CharSequence _xifexpression = null;
      if (inicio) {
        EList<Operacion> _variable = leer.getVariable();
        Operacion _get = _variable.get(0);
        String _tipoOperador = this.getTipoOperador(_get, inicio, "");
        tipo = _tipoOperador;
        boolean _contains = VaryGrammarAbstractGeneratorCCPP.archivos.contains(tipo);
        if (_contains) {
          EList<Operacion> _variable_1 = leer.getVariable();
          Operacion _get_1 = _variable_1.get(0);
          CharSequence _generate = this.generate(_get_1, null);
          String variableArchivo = _generate.toString();
          EList<Operacion> _variable_2 = leer.getVariable();
          Operacion _get_2 = _variable_2.get(1);
          String _tipoOperador_1 = this.getTipoOperador(_get_2, inicio, "");
          tipo = _tipoOperador_1;
          ResourceBundle _bundle = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
          String _string = _bundle.getString("TIPO_ENTERO");
          boolean _equals = tipo.equals(_string);
          if (_equals) {
            boolean _isEmpty = descripcionLeer.isEmpty();
            if (_isEmpty) {
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("fscanf(");
              _builder.append(variableArchivo, "");
              _builder.append(",\"%i\", &");
              EList<Operacion> _variable_3 = leer.getVariable();
              Operacion _get_3 = _variable_3.get(1);
              CharSequence _generate_1 = this.generate(_get_3, null);
              _builder.append(_generate_1, "");
              _builder.append(");");
              descripcionLeer = _builder.toString();
            } else {
              descripcionLeer = (descripcionLeer + "\n");
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("fscanf(");
              _builder_1.append(variableArchivo, "");
              _builder_1.append(",\"%i\", &");
              EList<Operacion> _variable_4 = leer.getVariable();
              Operacion _get_4 = _variable_4.get(1);
              CharSequence _generate_2 = this.generate(_get_4, null);
              _builder_1.append(_generate_2, "");
              _builder_1.append(");");
              String _plus = (descripcionLeer + _builder_1);
              descripcionLeer = _plus;
            }
          } else {
            ResourceBundle _bundle_1 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
            String _string_1 = _bundle_1.getString("TIPO_CARACTER");
            boolean _equals_1 = tipo.equals(_string_1);
            if (_equals_1) {
              boolean _isEmpty_1 = descripcionLeer.isEmpty();
              if (_isEmpty_1) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("fscanf(");
                _builder_2.append(variableArchivo, "");
                _builder_2.append(",\"%c\", &");
                EList<Operacion> _variable_5 = leer.getVariable();
                Operacion _get_5 = _variable_5.get(1);
                CharSequence _generate_3 = this.generate(_get_5, null);
                _builder_2.append(_generate_3, "");
                _builder_2.append(");");
                descripcionLeer = _builder_2.toString();
              } else {
                descripcionLeer = (descripcionLeer + "\n");
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("fscanf(");
                _builder_3.append(variableArchivo, "");
                _builder_3.append(",\"%c\", &");
                EList<Operacion> _variable_6 = leer.getVariable();
                Operacion _get_6 = _variable_6.get(1);
                CharSequence _generate_4 = this.generate(_get_6, null);
                _builder_3.append(_generate_4, "");
                _builder_3.append(");");
                String _plus_1 = (descripcionLeer + _builder_3);
                descripcionLeer = _plus_1;
              }
            } else {
              ResourceBundle _bundle_2 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
              String _string_2 = _bundle_2.getString("TIPO_CADENA");
              boolean _equals_2 = tipo.equals(_string_2);
              if (_equals_2) {
                boolean _isEmpty_2 = descripcionLeer.isEmpty();
                if (_isEmpty_2) {
                  StringConcatenation _builder_4 = new StringConcatenation();
                  _builder_4.append("fscanf(");
                  _builder_4.append(variableArchivo, "");
                  _builder_4.append(",\"%s\", &");
                  EList<Operacion> _variable_7 = leer.getVariable();
                  Operacion _get_7 = _variable_7.get(1);
                  CharSequence _generate_5 = this.generate(_get_7, null);
                  _builder_4.append(_generate_5, "");
                  _builder_4.append(");");
                  descripcionLeer = _builder_4.toString();
                } else {
                  descripcionLeer = (descripcionLeer + "\n");
                  StringConcatenation _builder_5 = new StringConcatenation();
                  _builder_5.append("fscanf(");
                  _builder_5.append(variableArchivo, "");
                  _builder_5.append(",\"%s\", &");
                  EList<Operacion> _variable_8 = leer.getVariable();
                  Operacion _get_8 = _variable_8.get(1);
                  CharSequence _generate_6 = this.generate(_get_8, null);
                  _builder_5.append(_generate_6, "");
                  _builder_5.append(");");
                  String _plus_2 = (descripcionLeer + _builder_5);
                  descripcionLeer = _plus_2;
                }
              } else {
                ResourceBundle _bundle_3 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                String _string_3 = _bundle_3.getString("TIPO_REAL");
                boolean _equals_3 = tipo.equals(_string_3);
                if (_equals_3) {
                  boolean _isEmpty_3 = descripcionLeer.isEmpty();
                  if (_isEmpty_3) {
                    StringConcatenation _builder_6 = new StringConcatenation();
                    _builder_6.append("fscanf(");
                    _builder_6.append(variableArchivo, "");
                    _builder_6.append(",\"%f\", &");
                    EList<Operacion> _variable_9 = leer.getVariable();
                    Operacion _get_9 = _variable_9.get(1);
                    CharSequence _generate_7 = this.generate(_get_9, null);
                    _builder_6.append(_generate_7, "");
                    _builder_6.append(");");
                    descripcionLeer = _builder_6.toString();
                  } else {
                    descripcionLeer = (descripcionLeer + "\n");
                    StringConcatenation _builder_7 = new StringConcatenation();
                    _builder_7.append("fscanf(");
                    _builder_7.append(variableArchivo, "");
                    _builder_7.append(",\"%f\", &");
                    EList<Operacion> _variable_10 = leer.getVariable();
                    Operacion _get_10 = _variable_10.get(1);
                    CharSequence _generate_8 = this.generate(_get_10, null);
                    _builder_7.append(_generate_8, "");
                    _builder_7.append(");");
                    String _plus_3 = (descripcionLeer + _builder_7);
                    descripcionLeer = _plus_3;
                  }
                } else {
                  boolean _containsKey = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.containsKey(tipo);
                  if (_containsKey) {
                    String tipoAux = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.get(tipo);
                    ResourceBundle _bundle_4 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                    String _string_4 = _bundle_4.getString("TIPO_ENTERO");
                    boolean _equals_4 = tipoAux.equals(_string_4);
                    if (_equals_4) {
                      boolean _isEmpty_4 = descripcionLeer.isEmpty();
                      if (_isEmpty_4) {
                        StringConcatenation _builder_8 = new StringConcatenation();
                        _builder_8.append("fscanf(");
                        _builder_8.append(variableArchivo, "");
                        _builder_8.append(",\"%i\", &");
                        EList<Operacion> _variable_11 = leer.getVariable();
                        Operacion _get_11 = _variable_11.get(1);
                        CharSequence _generate_9 = this.generate(_get_11, null);
                        _builder_8.append(_generate_9, "");
                        _builder_8.append(");");
                        descripcionLeer = _builder_8.toString();
                      } else {
                        descripcionLeer = (descripcionLeer + "\n");
                        StringConcatenation _builder_9 = new StringConcatenation();
                        _builder_9.append("fscanf(");
                        _builder_9.append(variableArchivo, "");
                        _builder_9.append(",\"%i\", &");
                        EList<Operacion> _variable_12 = leer.getVariable();
                        Operacion _get_12 = _variable_12.get(1);
                        CharSequence _generate_10 = this.generate(_get_12, null);
                        _builder_9.append(_generate_10, "");
                        _builder_9.append(");");
                        String _plus_4 = (descripcionLeer + _builder_9);
                        descripcionLeer = _plus_4;
                      }
                    } else {
                      if ((tipoAux.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                        boolean _isEmpty_5 = descripcionLeer.isEmpty();
                        if (_isEmpty_5) {
                          StringConcatenation _builder_10 = new StringConcatenation();
                          _builder_10.append("fscanf(");
                          _builder_10.append(variableArchivo, "");
                          _builder_10.append(",\"%s\", &");
                          EList<Operacion> _variable_13 = leer.getVariable();
                          Operacion _get_13 = _variable_13.get(1);
                          CharSequence _generate_11 = this.generate(_get_13, null);
                          _builder_10.append(_generate_11, "");
                          _builder_10.append(");");
                          descripcionLeer = _builder_10.toString();
                        } else {
                          descripcionLeer = (descripcionLeer + "\n");
                          StringConcatenation _builder_11 = new StringConcatenation();
                          _builder_11.append("fscanf(");
                          _builder_11.append(variableArchivo, "");
                          _builder_11.append(",\"%s\", &");
                          EList<Operacion> _variable_14 = leer.getVariable();
                          Operacion _get_14 = _variable_14.get(1);
                          CharSequence _generate_12 = this.generate(_get_14, null);
                          _builder_11.append(_generate_12, "");
                          _builder_11.append(");");
                          String _plus_5 = (descripcionLeer + _builder_11);
                          descripcionLeer = _plus_5;
                        }
                      } else {
                        ResourceBundle _bundle_5 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                        String _string_5 = _bundle_5.getString("TIPO_REAL");
                        boolean _equals_5 = tipoAux.equals(_string_5);
                        if (_equals_5) {
                          boolean _isEmpty_6 = descripcionLeer.isEmpty();
                          if (_isEmpty_6) {
                            StringConcatenation _builder_12 = new StringConcatenation();
                            _builder_12.append("fscanf(");
                            _builder_12.append(variableArchivo, "");
                            _builder_12.append(",\"%f\", &");
                            EList<Operacion> _variable_15 = leer.getVariable();
                            Operacion _get_15 = _variable_15.get(1);
                            CharSequence _generate_13 = this.generate(_get_15, null);
                            _builder_12.append(_generate_13, "");
                            _builder_12.append(");");
                            descripcionLeer = _builder_12.toString();
                          } else {
                            descripcionLeer = (descripcionLeer + "\n");
                            StringConcatenation _builder_13 = new StringConcatenation();
                            _builder_13.append("fscanf(");
                            _builder_13.append(variableArchivo, "");
                            _builder_13.append(",\"%f\", &");
                            EList<Operacion> _variable_16 = leer.getVariable();
                            Operacion _get_16 = _variable_16.get(1);
                            CharSequence _generate_14 = this.generate(_get_16, null);
                            _builder_13.append(_generate_14, "");
                            _builder_13.append(");");
                            String _plus_6 = (descripcionLeer + _builder_13);
                            descripcionLeer = _plus_6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return descripcionLeer;
        } else {
          EList<Operacion> _variable_17 = leer.getVariable();
          for (final Operacion operador : _variable_17) {
            CharSequence _generate_15 = this.generate(operador, null);
            String _plus_7 = ((descripcionLeer + "cin >> ") + _generate_15);
            String _plus_8 = (_plus_7 + ";");
            String _plus_9 = (_plus_8 + "\n");
            descripcionLeer = _plus_9;
          }
          return descripcionLeer;
        }
      } else {
        for (final Subproceso subproceso : subprocesos) {
          {
            EList<Operacion> _variable_18 = leer.getVariable();
            Operacion _get_17 = _variable_18.get(0);
            String _nombre = subproceso.getNombre();
            String _tipoOperador_2 = this.getTipoOperador(_get_17, inicio, _nombre);
            tipo = _tipoOperador_2;
            boolean _contains_1 = VaryGrammarAbstractGeneratorCCPP.archivos.contains(tipo);
            if (_contains_1) {
              EList<Operacion> _variable_19 = leer.getVariable();
              Operacion _get_18 = _variable_19.get(0);
              CharSequence _generate_16 = this.generate(_get_18, null);
              String variableArchivo_1 = _generate_16.toString();
              EList<Operacion> _variable_20 = leer.getVariable();
              Operacion _get_19 = _variable_20.get(1);
              String _nombre_1 = subproceso.getNombre();
              String _tipoOperador_3 = this.getTipoOperador(_get_19, inicio, _nombre_1);
              tipo = _tipoOperador_3;
              ResourceBundle _bundle_6 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
              String _string_6 = _bundle_6.getString("TIPO_ENTERO");
              boolean _equals_6 = tipo.equals(_string_6);
              if (_equals_6) {
                boolean _isEmpty_7 = descripcionLeer.isEmpty();
                if (_isEmpty_7) {
                  StringConcatenation _builder_14 = new StringConcatenation();
                  _builder_14.append("fscanf(");
                  _builder_14.append(variableArchivo_1, "");
                  _builder_14.append(",\"%i\", &");
                  EList<Operacion> _variable_21 = leer.getVariable();
                  Operacion _get_20 = _variable_21.get(1);
                  CharSequence _generate_17 = this.generate(_get_20, null);
                  _builder_14.append(_generate_17, "");
                  _builder_14.append(");");
                  descripcionLeer = _builder_14.toString();
                } else {
                  descripcionLeer = (descripcionLeer + "\n");
                  StringConcatenation _builder_15 = new StringConcatenation();
                  _builder_15.append("fscanf(");
                  _builder_15.append(variableArchivo_1, "");
                  _builder_15.append(",\"%i\", &");
                  EList<Operacion> _variable_22 = leer.getVariable();
                  Operacion _get_21 = _variable_22.get(1);
                  CharSequence _generate_18 = this.generate(_get_21, null);
                  _builder_15.append(_generate_18, "");
                  _builder_15.append(");");
                  String _plus_10 = (descripcionLeer + _builder_15);
                  descripcionLeer = _plus_10;
                }
              } else {
                ResourceBundle _bundle_7 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                String _string_7 = _bundle_7.getString("TIPO_CARACTER");
                boolean _equals_7 = tipo.equals(_string_7);
                if (_equals_7) {
                  boolean _isEmpty_8 = descripcionLeer.isEmpty();
                  if (_isEmpty_8) {
                    StringConcatenation _builder_16 = new StringConcatenation();
                    _builder_16.append("fscanf(");
                    _builder_16.append(variableArchivo_1, "");
                    _builder_16.append(",\"%c\", &");
                    EList<Operacion> _variable_23 = leer.getVariable();
                    Operacion _get_22 = _variable_23.get(1);
                    CharSequence _generate_19 = this.generate(_get_22, null);
                    _builder_16.append(_generate_19, "");
                    _builder_16.append(");");
                    descripcionLeer = _builder_16.toString();
                  } else {
                    descripcionLeer = (descripcionLeer + "\n");
                    StringConcatenation _builder_17 = new StringConcatenation();
                    _builder_17.append("fscanf(");
                    _builder_17.append(variableArchivo_1, "");
                    _builder_17.append(",\"%c\", &");
                    EList<Operacion> _variable_24 = leer.getVariable();
                    Operacion _get_23 = _variable_24.get(1);
                    CharSequence _generate_20 = this.generate(_get_23, null);
                    _builder_17.append(_generate_20, "");
                    _builder_17.append(");");
                    String _plus_11 = (descripcionLeer + _builder_17);
                    descripcionLeer = _plus_11;
                  }
                } else {
                  ResourceBundle _bundle_8 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                  String _string_8 = _bundle_8.getString("TIPO_CADENA");
                  boolean _equals_8 = tipo.equals(_string_8);
                  if (_equals_8) {
                    boolean _isEmpty_9 = descripcionLeer.isEmpty();
                    if (_isEmpty_9) {
                      StringConcatenation _builder_18 = new StringConcatenation();
                      _builder_18.append("fscanf(");
                      _builder_18.append(variableArchivo_1, "");
                      _builder_18.append(",\"%s\", &");
                      EList<Operacion> _variable_25 = leer.getVariable();
                      Operacion _get_24 = _variable_25.get(1);
                      CharSequence _generate_21 = this.generate(_get_24, null);
                      _builder_18.append(_generate_21, "");
                      _builder_18.append(");");
                      descripcionLeer = _builder_18.toString();
                    } else {
                      descripcionLeer = (descripcionLeer + "\n");
                      StringConcatenation _builder_19 = new StringConcatenation();
                      _builder_19.append("fscanf(");
                      _builder_19.append(variableArchivo_1, "");
                      _builder_19.append(",\"%s\", &");
                      EList<Operacion> _variable_26 = leer.getVariable();
                      Operacion _get_25 = _variable_26.get(1);
                      CharSequence _generate_22 = this.generate(_get_25, null);
                      _builder_19.append(_generate_22, "");
                      _builder_19.append(");");
                      String _plus_12 = (descripcionLeer + _builder_19);
                      descripcionLeer = _plus_12;
                    }
                  } else {
                    ResourceBundle _bundle_9 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                    String _string_9 = _bundle_9.getString("TIPO_REAL");
                    boolean _equals_9 = tipo.equals(_string_9);
                    if (_equals_9) {
                      boolean _isEmpty_10 = descripcionLeer.isEmpty();
                      if (_isEmpty_10) {
                        StringConcatenation _builder_20 = new StringConcatenation();
                        _builder_20.append("fscanf(");
                        _builder_20.append(variableArchivo_1, "");
                        _builder_20.append(",\"%f\", &");
                        EList<Operacion> _variable_27 = leer.getVariable();
                        Operacion _get_26 = _variable_27.get(1);
                        CharSequence _generate_23 = this.generate(_get_26, null);
                        _builder_20.append(_generate_23, "");
                        _builder_20.append(");");
                        descripcionLeer = _builder_20.toString();
                      } else {
                        descripcionLeer = (descripcionLeer + "\n");
                        StringConcatenation _builder_21 = new StringConcatenation();
                        _builder_21.append("fscanf(");
                        _builder_21.append(variableArchivo_1, "");
                        _builder_21.append(",\"%f\", &");
                        EList<Operacion> _variable_28 = leer.getVariable();
                        Operacion _get_27 = _variable_28.get(1);
                        CharSequence _generate_24 = this.generate(_get_27, null);
                        _builder_21.append(_generate_24, "");
                        _builder_21.append(");");
                        String _plus_13 = (descripcionLeer + _builder_21);
                        descripcionLeer = _plus_13;
                      }
                    } else {
                      boolean _containsKey_1 = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.containsKey(tipo);
                      if (_containsKey_1) {
                        String tipoAux_1 = VaryGrammarAbstractGeneratorCCPP.vectoresMatrices.get(tipo);
                        ResourceBundle _bundle_10 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                        String _string_10 = _bundle_10.getString("TIPO_ENTERO");
                        boolean _equals_10 = tipoAux_1.equals(_string_10);
                        if (_equals_10) {
                          boolean _isEmpty_11 = descripcionLeer.isEmpty();
                          if (_isEmpty_11) {
                            StringConcatenation _builder_22 = new StringConcatenation();
                            _builder_22.append("fscanf(");
                            _builder_22.append(variableArchivo_1, "");
                            _builder_22.append(",\"%i\", &");
                            EList<Operacion> _variable_29 = leer.getVariable();
                            Operacion _get_28 = _variable_29.get(1);
                            CharSequence _generate_25 = this.generate(_get_28, null);
                            _builder_22.append(_generate_25, "");
                            _builder_22.append(");");
                            descripcionLeer = _builder_22.toString();
                          } else {
                            descripcionLeer = (descripcionLeer + "\n");
                            StringConcatenation _builder_23 = new StringConcatenation();
                            _builder_23.append("fscanf(");
                            _builder_23.append(variableArchivo_1, "");
                            _builder_23.append(",\"%i\", &");
                            EList<Operacion> _variable_30 = leer.getVariable();
                            Operacion _get_29 = _variable_30.get(1);
                            CharSequence _generate_26 = this.generate(_get_29, null);
                            _builder_23.append(_generate_26, "");
                            _builder_23.append(");");
                            String _plus_14 = (descripcionLeer + _builder_23);
                            descripcionLeer = _plus_14;
                          }
                        } else {
                          if ((tipoAux_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CADENA")) || tipoAux_1.equals(VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle().getString("TIPO_CARACTER")))) {
                            boolean _isEmpty_12 = descripcionLeer.isEmpty();
                            if (_isEmpty_12) {
                              StringConcatenation _builder_24 = new StringConcatenation();
                              _builder_24.append("fscanf(");
                              _builder_24.append(variableArchivo_1, "");
                              _builder_24.append(",\"%s\", &");
                              EList<Operacion> _variable_31 = leer.getVariable();
                              Operacion _get_30 = _variable_31.get(1);
                              CharSequence _generate_27 = this.generate(_get_30, null);
                              _builder_24.append(_generate_27, "");
                              _builder_24.append(");");
                              descripcionLeer = _builder_24.toString();
                            } else {
                              descripcionLeer = (descripcionLeer + "\n");
                              StringConcatenation _builder_25 = new StringConcatenation();
                              _builder_25.append("fscanf(");
                              _builder_25.append(variableArchivo_1, "");
                              _builder_25.append(",\"%s\", &");
                              EList<Operacion> _variable_32 = leer.getVariable();
                              Operacion _get_31 = _variable_32.get(1);
                              CharSequence _generate_28 = this.generate(_get_31, null);
                              _builder_25.append(_generate_28, "");
                              _builder_25.append(");");
                              String _plus_15 = (descripcionLeer + _builder_25);
                              descripcionLeer = _plus_15;
                            }
                          } else {
                            ResourceBundle _bundle_11 = VaryGrammarAbstractGeneratorCCPP.readerMessages.getBundle();
                            String _string_11 = _bundle_11.getString("TIPO_REAL");
                            boolean _equals_11 = tipoAux_1.equals(_string_11);
                            if (_equals_11) {
                              boolean _isEmpty_13 = descripcionLeer.isEmpty();
                              if (_isEmpty_13) {
                                StringConcatenation _builder_26 = new StringConcatenation();
                                _builder_26.append("fscanf(");
                                _builder_26.append(variableArchivo_1, "");
                                _builder_26.append(",\"%f\", &");
                                EList<Operacion> _variable_33 = leer.getVariable();
                                Operacion _get_32 = _variable_33.get(1);
                                CharSequence _generate_29 = this.generate(_get_32, null);
                                _builder_26.append(_generate_29, "");
                                _builder_26.append(");");
                                descripcionLeer = _builder_26.toString();
                              } else {
                                descripcionLeer = (descripcionLeer + "\n");
                                StringConcatenation _builder_27 = new StringConcatenation();
                                _builder_27.append("fscanf(");
                                _builder_27.append(variableArchivo_1, "");
                                _builder_27.append(",\"%f\", &");
                                EList<Operacion> _variable_34 = leer.getVariable();
                                Operacion _get_33 = _variable_34.get(1);
                                CharSequence _generate_30 = this.generate(_get_33, null);
                                _builder_27.append(_generate_30, "");
                                _builder_27.append(");");
                                String _plus_16 = (descripcionLeer + _builder_27);
                                descripcionLeer = _plus_16;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return descripcionLeer;
            } else {
              EList<Operacion> _variable_35 = leer.getVariable();
              for (final Operacion operador_1 : _variable_35) {
                CharSequence _generate_31 = this.generate(operador_1, null);
                String _plus_17 = ((descripcionLeer + "cin >> ") + _generate_31);
                String _plus_18 = (_plus_17 + ";");
                String _plus_19 = (_plus_18 + "\n");
                descripcionLeer = _plus_19;
              }
              return descripcionLeer;
            }
          }
        }
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
