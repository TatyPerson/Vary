/**
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.ui.quickfix;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Asignacion;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.LlamadaFuncion;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.ParametroFuncion;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.VariableID;
import diagramapseudocodigo.segun;
import java.util.ResourceBundle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import vary.pseudocodigo.dsl.c.VaryGrammarModelUtil;
import vary.pseudocodigo.dsl.c.keywords.ReadKeywords;
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface;
import vary.pseudocodigo.dsl.c.ui.quickfix.util.VaryGrammarQuickfixProviderUtil;
import vary.pseudocodigo.dsl.c.validation.VaryGrammarValidator;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidator;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;

/**
 * Custom quickfixes.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
@SuppressWarnings("all")
public class VaryGrammarQuickfixProvider extends DefaultQuickfixProvider {
  protected final ReadKeywordsInterface readerKeywords;
  
  protected final ReadMessagesValidatorInterface readerMessages;
  
  @Inject
  public VaryGrammarQuickfixProvider() {
    super();
    ReadKeywords _readKeywords = new ReadKeywords();
    this.readerKeywords = _readKeywords;
    ReadMessagesValidator _readMessagesValidator = new ReadMessagesValidator();
    this.readerMessages = _readMessagesValidator;
  }
  
  public VaryGrammarQuickfixProvider(final String language) {
    vary.pseudocodigo.dsl.c.english.keywords.ReadKeywords _readKeywords = new vary.pseudocodigo.dsl.c.english.keywords.ReadKeywords();
    this.readerKeywords = _readKeywords;
    vary.pseudocodigo.dsl.c.validation.english.messages.ReadMessagesValidator _readMessagesValidator = new vary.pseudocodigo.dsl.c.validation.english.messages.ReadMessagesValidator();
    this.readerMessages = _readMessagesValidator;
  }
  
  @Fix(VaryGrammarValidator.CONSTANTE_NO_DEFINIDA)
  public void ofrecerConstante(final Issue issue, final IssueResolutionAcceptor acceptor) {
    ResourceBundle _bundle = this.readerMessages.getBundle();
    String _string = _bundle.getString("QUICKFIX_CONSTANTE_NO_DEFINIDA");
    ResourceBundle _bundle_1 = this.readerMessages.getBundle();
    String _string_1 = _bundle_1.getString("QUICKFIX_CONSTANTE_NO_DEFINIDA");
    final ISemanticModification _function = new ISemanticModification() {
      @Override
      public void apply(final EObject element, final IModificationContext context) throws Exception {
        IXtextDocument _xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
        String indice = VaryGrammarQuickfixProviderUtil.buscarIndiceVector(_get);
        if ((element instanceof Algoritmo)) {
          Constantes _containerOfType = EcoreUtil2.<Constantes>getContainerOfType(element, Constantes.class);
          VaryGrammarModelUtil.addConstante(
            ((Algoritmo) element), _containerOfType, indice);
        } else {
          if ((element instanceof Implementacion)) {
            Constantes _containerOfType_1 = EcoreUtil2.<Constantes>getContainerOfType(element, Constantes.class);
            VaryGrammarModelUtil.addConstante(
              ((Implementacion) element), _containerOfType_1, indice);
          }
        }
      }
    };
    acceptor.accept(issue, _string, _string_1, "compare_field_private.gif", _function);
  }
  
  @Fix(VaryGrammarValidator.VARIABLE_NO_DEFINIDA)
  public void ofrecerVariable(final Issue issue, final IssueResolutionAcceptor acceptor) {
    ResourceBundle _bundle = this.readerMessages.getBundle();
    String _string = _bundle.getString("QUICKFIX_VARIABLE_NO_DEFINIDA");
    String _plus = ("Quickfix es: " + _string);
    System.out.println(_plus);
    ResourceBundle _bundle_1 = this.readerMessages.getBundle();
    String _string_1 = _bundle_1.getString("QUICKFIX_VARIABLE_NO_DEFINIDA");
    ResourceBundle _bundle_2 = this.readerMessages.getBundle();
    String _string_2 = _bundle_2.getString("QUICKFIX_VARIABLE_NO_DEFINIDA");
    final ISemanticModification _function = new ISemanticModification() {
      @Override
      public void apply(final EObject element, final IModificationContext context) throws Exception {
        String tipo = "";
        IXtextDocument _xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        String _get = _xtextDocument.get((_offset).intValue(), (_length).intValue());
        String _plus = ("CadenaError= " + _get);
        System.out.println(_plus);
        Algoritmo _containerOfType = EcoreUtil2.<Algoritmo>getContainerOfType(element, Algoritmo.class);
        boolean _notEquals = (!Objects.equal(_containerOfType, null));
        if (_notEquals) {
          Algoritmo algoritmo = EcoreUtil2.<Algoritmo>getContainerOfType(element, Algoritmo.class);
          Inicio _containerOfType_1 = EcoreUtil2.<Inicio>getContainerOfType(element, Inicio.class);
          boolean _notEquals_1 = (!Objects.equal(_containerOfType_1, null));
          if (_notEquals_1) {
            Inicio inicio = EcoreUtil2.<Inicio>getContainerOfType(element, Inicio.class);
            if ((element instanceof Asignacion)) {
              IXtextDocument _xtextDocument_1 = context.getXtextDocument();
              Integer _offset_1 = issue.getOffset();
              Integer _length_1 = issue.getLength();
              String _get_1 = _xtextDocument_1.get((_offset_1).intValue(), (_length_1).intValue());
              EList<Declaracion> _declaracion = inicio.getDeclaracion();
              EList<Declaracion> _global = algoritmo.getGlobal();
              EList<TipoComplejo> _tipocomplejo = algoritmo.getTipocomplejo();
              EList<Subproceso> _funcion = algoritmo.getFuncion();
              String _buscarTipoVariable = VaryGrammarQuickfixProviderUtil.buscarTipoVariable(((Asignacion) element), _get_1, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion, _global, _tipocomplejo, _funcion);
              tipo = _buscarTipoVariable;
            } else {
              if ((element instanceof VariableID)) {
                Asignacion _containerOfType_2 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                boolean _notEquals_2 = (!Objects.equal(_containerOfType_2, null));
                if (_notEquals_2) {
                  Asignacion _containerOfType_3 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                  IXtextDocument _xtextDocument_2 = context.getXtextDocument();
                  Integer _offset_2 = issue.getOffset();
                  Integer _length_2 = issue.getLength();
                  String _get_2 = _xtextDocument_2.get((_offset_2).intValue(), (_length_2).intValue());
                  EList<Declaracion> _declaracion_1 = inicio.getDeclaracion();
                  EList<Declaracion> _global_1 = algoritmo.getGlobal();
                  EList<TipoComplejo> _tipocomplejo_1 = algoritmo.getTipocomplejo();
                  EList<Subproceso> _funcion_1 = algoritmo.getFuncion();
                  String _buscarTipoVariable_1 = VaryGrammarQuickfixProviderUtil.buscarTipoVariable(_containerOfType_3, _get_2, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_1, _global_1, _tipocomplejo_1, _funcion_1);
                  tipo = _buscarTipoVariable_1;
                } else {
                  LlamadaFuncion _containerOfType_4 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                  boolean _notEquals_3 = (!Objects.equal(_containerOfType_4, null));
                  if (_notEquals_3) {
                    LlamadaFuncion _containerOfType_5 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                    IXtextDocument _xtextDocument_3 = context.getXtextDocument();
                    Integer _offset_3 = issue.getOffset();
                    Integer _length_3 = issue.getLength();
                    String _get_3 = _xtextDocument_3.get((_offset_3).intValue(), (_length_3).intValue());
                    EList<Subproceso> _funcion_2 = algoritmo.getFuncion();
                    String _buscarTipoParametroLlamada = VaryGrammarQuickfixProviderUtil.buscarTipoParametroLlamada(_containerOfType_5, _get_3, _funcion_2);
                    tipo = _buscarTipoParametroLlamada;
                  } else {
                    segun _containerOfType_6 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                    boolean _notEquals_4 = (!Objects.equal(_containerOfType_6, null));
                    if (_notEquals_4) {
                      segun _containerOfType_7 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                      String _buscarTipoVariableSegun = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSegun(_containerOfType_7, VaryGrammarQuickfixProvider.this.readerKeywords);
                      tipo = _buscarTipoVariableSegun;
                    }
                  }
                }
              }
            }
          } else {
            Subproceso _containerOfType_8 = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
            boolean _notEquals_5 = (!Objects.equal(_containerOfType_8, null));
            if (_notEquals_5) {
              Subproceso subproceso = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
              if ((subproceso instanceof Funcion)) {
                Funcion funcion = ((Funcion) subproceso);
                if ((element instanceof Asignacion)) {
                  IXtextDocument _xtextDocument_4 = context.getXtextDocument();
                  Integer _offset_4 = issue.getOffset();
                  Integer _length_4 = issue.getLength();
                  String _get_4 = _xtextDocument_4.get((_offset_4).intValue(), (_length_4).intValue());
                  EList<Declaracion> _declaracion_2 = funcion.getDeclaracion();
                  EList<ParametroFuncion> _parametrofuncion = funcion.getParametrofuncion();
                  EList<Declaracion> _global_2 = algoritmo.getGlobal();
                  EList<TipoComplejo> _tipocomplejo_2 = algoritmo.getTipocomplejo();
                  EList<Subproceso> _funcion_3 = algoritmo.getFuncion();
                  String _buscarTipoVariableSubproceso = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(((Asignacion) element), _get_4, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_2, _parametrofuncion, _global_2, _tipocomplejo_2, _funcion_3);
                  tipo = _buscarTipoVariableSubproceso;
                } else {
                  if ((element instanceof VariableID)) {
                    Asignacion _containerOfType_9 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                    boolean _notEquals_6 = (!Objects.equal(_containerOfType_9, null));
                    if (_notEquals_6) {
                      Asignacion _containerOfType_10 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                      IXtextDocument _xtextDocument_5 = context.getXtextDocument();
                      Integer _offset_5 = issue.getOffset();
                      Integer _length_5 = issue.getLength();
                      String _get_5 = _xtextDocument_5.get((_offset_5).intValue(), (_length_5).intValue());
                      EList<Declaracion> _declaracion_3 = funcion.getDeclaracion();
                      EList<ParametroFuncion> _parametrofuncion_1 = funcion.getParametrofuncion();
                      EList<Declaracion> _global_3 = algoritmo.getGlobal();
                      EList<TipoComplejo> _tipocomplejo_3 = algoritmo.getTipocomplejo();
                      EList<Subproceso> _funcion_4 = algoritmo.getFuncion();
                      String _buscarTipoVariableSubproceso_1 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(_containerOfType_10, _get_5, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_3, _parametrofuncion_1, _global_3, _tipocomplejo_3, _funcion_4);
                      tipo = _buscarTipoVariableSubproceso_1;
                    } else {
                      LlamadaFuncion _containerOfType_11 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                      boolean _notEquals_7 = (!Objects.equal(_containerOfType_11, null));
                      if (_notEquals_7) {
                        LlamadaFuncion _containerOfType_12 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                        IXtextDocument _xtextDocument_6 = context.getXtextDocument();
                        Integer _offset_6 = issue.getOffset();
                        Integer _length_6 = issue.getLength();
                        String _get_6 = _xtextDocument_6.get((_offset_6).intValue(), (_length_6).intValue());
                        EList<Subproceso> _funcion_5 = algoritmo.getFuncion();
                        String _buscarTipoParametroLlamada_1 = VaryGrammarQuickfixProviderUtil.buscarTipoParametroLlamada(_containerOfType_12, _get_6, _funcion_5);
                        tipo = _buscarTipoParametroLlamada_1;
                      } else {
                        segun _containerOfType_13 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                        boolean _notEquals_8 = (!Objects.equal(_containerOfType_13, null));
                        if (_notEquals_8) {
                          segun _containerOfType_14 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                          String _buscarTipoVariableSegun_1 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSegun(_containerOfType_14, VaryGrammarQuickfixProvider.this.readerKeywords);
                          tipo = _buscarTipoVariableSegun_1;
                        }
                      }
                    }
                  }
                }
              } else {
                Procedimiento procedimiento = ((Procedimiento) subproceso);
                if ((element instanceof Asignacion)) {
                  IXtextDocument _xtextDocument_7 = context.getXtextDocument();
                  Integer _offset_7 = issue.getOffset();
                  Integer _length_7 = issue.getLength();
                  String _get_7 = _xtextDocument_7.get((_offset_7).intValue(), (_length_7).intValue());
                  EList<Declaracion> _declaracion_4 = procedimiento.getDeclaracion();
                  EList<ParametroFuncion> _parametrofuncion_2 = procedimiento.getParametrofuncion();
                  EList<Declaracion> _global_4 = algoritmo.getGlobal();
                  EList<TipoComplejo> _tipocomplejo_4 = algoritmo.getTipocomplejo();
                  EList<Subproceso> _funcion_6 = algoritmo.getFuncion();
                  String _buscarTipoVariableSubproceso_2 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(((Asignacion) element), _get_7, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_4, _parametrofuncion_2, _global_4, _tipocomplejo_4, _funcion_6);
                  tipo = _buscarTipoVariableSubproceso_2;
                } else {
                  if ((element instanceof VariableID)) {
                    Asignacion _containerOfType_15 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                    boolean _notEquals_9 = (!Objects.equal(_containerOfType_15, null));
                    if (_notEquals_9) {
                      Asignacion _containerOfType_16 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                      IXtextDocument _xtextDocument_8 = context.getXtextDocument();
                      Integer _offset_8 = issue.getOffset();
                      Integer _length_8 = issue.getLength();
                      String _get_8 = _xtextDocument_8.get((_offset_8).intValue(), (_length_8).intValue());
                      EList<Declaracion> _declaracion_5 = procedimiento.getDeclaracion();
                      EList<ParametroFuncion> _parametrofuncion_3 = procedimiento.getParametrofuncion();
                      EList<Declaracion> _global_5 = algoritmo.getGlobal();
                      EList<TipoComplejo> _tipocomplejo_5 = algoritmo.getTipocomplejo();
                      EList<Subproceso> _funcion_7 = algoritmo.getFuncion();
                      String _buscarTipoVariableSubproceso_3 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(_containerOfType_16, _get_8, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_5, _parametrofuncion_3, _global_5, _tipocomplejo_5, _funcion_7);
                      tipo = _buscarTipoVariableSubproceso_3;
                    } else {
                      LlamadaFuncion _containerOfType_17 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                      boolean _notEquals_10 = (!Objects.equal(_containerOfType_17, null));
                      if (_notEquals_10) {
                        LlamadaFuncion _containerOfType_18 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                        IXtextDocument _xtextDocument_9 = context.getXtextDocument();
                        Integer _offset_9 = issue.getOffset();
                        Integer _length_9 = issue.getLength();
                        String _get_9 = _xtextDocument_9.get((_offset_9).intValue(), (_length_9).intValue());
                        EList<Subproceso> _funcion_8 = algoritmo.getFuncion();
                        String _buscarTipoParametroLlamada_2 = VaryGrammarQuickfixProviderUtil.buscarTipoParametroLlamada(_containerOfType_18, _get_9, _funcion_8);
                        tipo = _buscarTipoParametroLlamada_2;
                      } else {
                        segun _containerOfType_19 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                        boolean _notEquals_11 = (!Objects.equal(_containerOfType_19, null));
                        if (_notEquals_11) {
                          segun _containerOfType_20 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                          String _buscarTipoVariableSegun_2 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSegun(_containerOfType_20, VaryGrammarQuickfixProvider.this.readerKeywords);
                          tipo = _buscarTipoVariableSegun_2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          Modulo _containerOfType_21 = EcoreUtil2.<Modulo>getContainerOfType(element, Modulo.class);
          boolean _notEquals_12 = (!Objects.equal(_containerOfType_21, null));
          if (_notEquals_12) {
            Modulo modulo = EcoreUtil2.<Modulo>getContainerOfType(element, Modulo.class);
            Subproceso _containerOfType_22 = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
            boolean _notEquals_13 = (!Objects.equal(_containerOfType_22, null));
            if (_notEquals_13) {
              Subproceso subproceso_1 = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
              if ((subproceso_1 instanceof Funcion)) {
                Funcion funcion_1 = ((Funcion) subproceso_1);
                if ((element instanceof Asignacion)) {
                  IXtextDocument _xtextDocument_10 = context.getXtextDocument();
                  Integer _offset_10 = issue.getOffset();
                  Integer _length_10 = issue.getLength();
                  String _get_10 = _xtextDocument_10.get((_offset_10).intValue(), (_length_10).intValue());
                  EList<Declaracion> _declaracion_6 = funcion_1.getDeclaracion();
                  EList<ParametroFuncion> _parametrofuncion_4 = funcion_1.getParametrofuncion();
                  Implementacion _implementacion = modulo.getImplementacion();
                  EList<Declaracion> _global_6 = _implementacion.getGlobal();
                  Implementacion _implementacion_1 = modulo.getImplementacion();
                  EList<TipoComplejo> _tipocomplejo_6 = _implementacion_1.getTipocomplejo();
                  Implementacion _implementacion_2 = modulo.getImplementacion();
                  EList<Subproceso> _funcion_9 = _implementacion_2.getFuncion();
                  String _buscarTipoVariableSubproceso_4 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(((Asignacion) element), _get_10, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_6, _parametrofuncion_4, _global_6, _tipocomplejo_6, _funcion_9);
                  tipo = _buscarTipoVariableSubproceso_4;
                } else {
                  if ((element instanceof VariableID)) {
                    Asignacion _containerOfType_23 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                    boolean _notEquals_14 = (!Objects.equal(_containerOfType_23, null));
                    if (_notEquals_14) {
                      Asignacion _containerOfType_24 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                      IXtextDocument _xtextDocument_11 = context.getXtextDocument();
                      Integer _offset_11 = issue.getOffset();
                      Integer _length_11 = issue.getLength();
                      String _get_11 = _xtextDocument_11.get((_offset_11).intValue(), (_length_11).intValue());
                      EList<Declaracion> _declaracion_7 = funcion_1.getDeclaracion();
                      EList<ParametroFuncion> _parametrofuncion_5 = funcion_1.getParametrofuncion();
                      Implementacion _implementacion_3 = modulo.getImplementacion();
                      EList<Declaracion> _global_7 = _implementacion_3.getGlobal();
                      Implementacion _implementacion_4 = modulo.getImplementacion();
                      EList<TipoComplejo> _tipocomplejo_7 = _implementacion_4.getTipocomplejo();
                      Implementacion _implementacion_5 = modulo.getImplementacion();
                      EList<Subproceso> _funcion_10 = _implementacion_5.getFuncion();
                      String _buscarTipoVariableSubproceso_5 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(_containerOfType_24, _get_11, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_7, _parametrofuncion_5, _global_7, _tipocomplejo_7, _funcion_10);
                      tipo = _buscarTipoVariableSubproceso_5;
                    } else {
                      LlamadaFuncion _containerOfType_25 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                      boolean _notEquals_15 = (!Objects.equal(_containerOfType_25, null));
                      if (_notEquals_15) {
                        LlamadaFuncion _containerOfType_26 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                        IXtextDocument _xtextDocument_12 = context.getXtextDocument();
                        Integer _offset_12 = issue.getOffset();
                        Integer _length_12 = issue.getLength();
                        String _get_12 = _xtextDocument_12.get((_offset_12).intValue(), (_length_12).intValue());
                        Implementacion _implementacion_6 = modulo.getImplementacion();
                        EList<Subproceso> _funcion_11 = _implementacion_6.getFuncion();
                        String _buscarTipoParametroLlamada_3 = VaryGrammarQuickfixProviderUtil.buscarTipoParametroLlamada(_containerOfType_26, _get_12, _funcion_11);
                        tipo = _buscarTipoParametroLlamada_3;
                      } else {
                        segun _containerOfType_27 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                        boolean _notEquals_16 = (!Objects.equal(_containerOfType_27, null));
                        if (_notEquals_16) {
                          segun _containerOfType_28 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                          String _buscarTipoVariableSegun_3 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSegun(_containerOfType_28, VaryGrammarQuickfixProvider.this.readerKeywords);
                          tipo = _buscarTipoVariableSegun_3;
                        }
                      }
                    }
                  }
                }
              } else {
                Procedimiento procedimiento_1 = ((Procedimiento) subproceso_1);
                if ((element instanceof Asignacion)) {
                  IXtextDocument _xtextDocument_13 = context.getXtextDocument();
                  Integer _offset_13 = issue.getOffset();
                  Integer _length_13 = issue.getLength();
                  String _get_13 = _xtextDocument_13.get((_offset_13).intValue(), (_length_13).intValue());
                  EList<Declaracion> _declaracion_8 = procedimiento_1.getDeclaracion();
                  EList<ParametroFuncion> _parametrofuncion_6 = procedimiento_1.getParametrofuncion();
                  Implementacion _implementacion_7 = modulo.getImplementacion();
                  EList<Declaracion> _global_8 = _implementacion_7.getGlobal();
                  Implementacion _implementacion_8 = modulo.getImplementacion();
                  EList<TipoComplejo> _tipocomplejo_8 = _implementacion_8.getTipocomplejo();
                  Implementacion _implementacion_9 = modulo.getImplementacion();
                  EList<Subproceso> _funcion_12 = _implementacion_9.getFuncion();
                  String _buscarTipoVariableSubproceso_6 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(((Asignacion) element), _get_13, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_8, _parametrofuncion_6, _global_8, _tipocomplejo_8, _funcion_12);
                  tipo = _buscarTipoVariableSubproceso_6;
                } else {
                  if ((element instanceof VariableID)) {
                    Asignacion _containerOfType_29 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                    boolean _notEquals_17 = (!Objects.equal(_containerOfType_29, null));
                    if (_notEquals_17) {
                      Asignacion _containerOfType_30 = EcoreUtil2.<Asignacion>getContainerOfType(element, Asignacion.class);
                      IXtextDocument _xtextDocument_14 = context.getXtextDocument();
                      Integer _offset_14 = issue.getOffset();
                      Integer _length_14 = issue.getLength();
                      String _get_14 = _xtextDocument_14.get((_offset_14).intValue(), (_length_14).intValue());
                      EList<Declaracion> _declaracion_9 = procedimiento_1.getDeclaracion();
                      EList<ParametroFuncion> _parametrofuncion_7 = procedimiento_1.getParametrofuncion();
                      Implementacion _implementacion_10 = modulo.getImplementacion();
                      EList<Declaracion> _global_9 = _implementacion_10.getGlobal();
                      Implementacion _implementacion_11 = modulo.getImplementacion();
                      EList<TipoComplejo> _tipocomplejo_9 = _implementacion_11.getTipocomplejo();
                      Implementacion _implementacion_12 = modulo.getImplementacion();
                      EList<Subproceso> _funcion_13 = _implementacion_12.getFuncion();
                      String _buscarTipoVariableSubproceso_7 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSubproceso(_containerOfType_30, _get_14, VaryGrammarQuickfixProvider.this.readerKeywords, _declaracion_9, _parametrofuncion_7, _global_9, _tipocomplejo_9, _funcion_13);
                      tipo = _buscarTipoVariableSubproceso_7;
                    } else {
                      LlamadaFuncion _containerOfType_31 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                      boolean _notEquals_18 = (!Objects.equal(_containerOfType_31, null));
                      if (_notEquals_18) {
                        LlamadaFuncion _containerOfType_32 = EcoreUtil2.<LlamadaFuncion>getContainerOfType(element, LlamadaFuncion.class);
                        IXtextDocument _xtextDocument_15 = context.getXtextDocument();
                        Integer _offset_15 = issue.getOffset();
                        Integer _length_15 = issue.getLength();
                        String _get_15 = _xtextDocument_15.get((_offset_15).intValue(), (_length_15).intValue());
                        Implementacion _implementacion_13 = modulo.getImplementacion();
                        EList<Subproceso> _funcion_14 = _implementacion_13.getFuncion();
                        String _buscarTipoParametroLlamada_4 = VaryGrammarQuickfixProviderUtil.buscarTipoParametroLlamada(_containerOfType_32, _get_15, _funcion_14);
                        tipo = _buscarTipoParametroLlamada_4;
                      } else {
                        segun _containerOfType_33 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                        boolean _notEquals_19 = (!Objects.equal(_containerOfType_33, null));
                        if (_notEquals_19) {
                          segun _containerOfType_34 = EcoreUtil2.<segun>getContainerOfType(element, segun.class);
                          String _buscarTipoVariableSegun_4 = VaryGrammarQuickfixProviderUtil.buscarTipoVariableSegun(_containerOfType_34, VaryGrammarQuickfixProvider.this.readerKeywords);
                          tipo = _buscarTipoVariableSegun_4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        Class<? extends EObject> _class = element.getClass();
        String _plus_1 = ("el elemento es: " + _class);
        System.out.println(_plus_1);
        Inicio _containerOfType_35 = EcoreUtil2.<Inicio>getContainerOfType(element, Inicio.class);
        boolean _notEquals_20 = (!Objects.equal(_containerOfType_35, null));
        if (_notEquals_20) {
          Inicio _containerOfType_36 = EcoreUtil2.<Inicio>getContainerOfType(element, Inicio.class);
          IXtextDocument _xtextDocument_16 = context.getXtextDocument();
          Integer _offset_16 = issue.getOffset();
          Integer _length_16 = issue.getLength();
          String _get_16 = _xtextDocument_16.get((_offset_16).intValue(), (_length_16).intValue());
          Declaracion _containerOfType_37 = EcoreUtil2.<Declaracion>getContainerOfType(element, Declaracion.class);
          VaryGrammarModelUtil.addVariable(_containerOfType_36, _get_16, _containerOfType_37, tipo, 
            VaryGrammarQuickfixProvider.this.readerKeywords);
        } else {
          Subproceso _containerOfType_38 = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
          boolean _notEquals_21 = (!Objects.equal(_containerOfType_38, null));
          if (_notEquals_21) {
            Subproceso _containerOfType_39 = EcoreUtil2.<Subproceso>getContainerOfType(element, Subproceso.class);
            IXtextDocument _xtextDocument_17 = context.getXtextDocument();
            Integer _offset_17 = issue.getOffset();
            Integer _length_17 = issue.getLength();
            String _get_17 = _xtextDocument_17.get((_offset_17).intValue(), (_length_17).intValue());
            Declaracion _containerOfType_40 = EcoreUtil2.<Declaracion>getContainerOfType(element, Declaracion.class);
            VaryGrammarModelUtil.addVariable(_containerOfType_39, _get_17, _containerOfType_40, tipo, 
              VaryGrammarQuickfixProvider.this.readerKeywords);
          } else {
            Implementacion _containerOfType_41 = EcoreUtil2.<Implementacion>getContainerOfType(element, Implementacion.class);
            boolean _notEquals_22 = (!Objects.equal(_containerOfType_41, null));
            if (_notEquals_22) {
              Implementacion _containerOfType_42 = EcoreUtil2.<Implementacion>getContainerOfType(element, Implementacion.class);
              IXtextDocument _xtextDocument_18 = context.getXtextDocument();
              Integer _offset_18 = issue.getOffset();
              Integer _length_18 = issue.getLength();
              String _get_18 = _xtextDocument_18.get((_offset_18).intValue(), (_length_18).intValue());
              Declaracion _containerOfType_43 = EcoreUtil2.<Declaracion>getContainerOfType(element, Declaracion.class);
              VaryGrammarModelUtil.addVariable(_containerOfType_42, _get_18, _containerOfType_43, tipo, 
                VaryGrammarQuickfixProvider.this.readerKeywords);
            }
          }
        }
      }
    };
    acceptor.accept(issue, _string_1, _string_2, "Entity.gif", _function);
  }
}
