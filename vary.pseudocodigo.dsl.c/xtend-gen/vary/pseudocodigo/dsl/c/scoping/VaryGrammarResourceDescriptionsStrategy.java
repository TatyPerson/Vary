package vary.pseudocodigo.dsl.c.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionPropia;
import diagramapseudocodigo.DeclaracionVariable;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Variable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class VaryGrammarResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof Modulo)) {
      boolean _xblockexpression = false;
      {
        Modulo modulo = ((Modulo) eObject);
        String _nombre = modulo.getNombre();
        final QualifiedName fullyQualifiedName = QualifiedName.create(_nombre);
        System.out.println(("fullyQualifiedName Modulo " + fullyQualifiedName));
        boolean _notEquals = (!Objects.equal(fullyQualifiedName, null));
        if (_notEquals) {
          IEObjectDescription _create = EObjectDescription.create(fullyQualifiedName, modulo);
          acceptor.accept(_create);
        }
        _xblockexpression = true;
      }
      _xifexpression = _xblockexpression;
    } else {
      boolean _xifexpression_1 = false;
      if ((eObject instanceof Algoritmo)) {
        boolean _xblockexpression_1 = false;
        {
          Algoritmo algoritmo = ((Algoritmo) eObject);
          String _nombre = algoritmo.getNombre();
          final QualifiedName fullyQualifiedName = QualifiedName.create(_nombre);
          System.out.println(("fullyQualifiedName Algoritmo " + fullyQualifiedName));
          boolean _notEquals = (!Objects.equal(fullyQualifiedName, null));
          if (_notEquals) {
            IEObjectDescription _create = EObjectDescription.create(fullyQualifiedName, algoritmo);
            acceptor.accept(_create);
          }
          Inicio _tiene = algoritmo.getTiene();
          EList<Declaracion> _declaracion = _tiene.getDeclaracion();
          for (final Declaracion declaracion : _declaracion) {
            if ((declaracion instanceof DeclaracionVariable)) {
              DeclaracionVariable dec = ((DeclaracionVariable) declaracion);
              EList<Variable> _variable = dec.getVariable();
              for (final Variable variable : _variable) {
                {
                  String _nombre_1 = variable.getNombre();
                  final QualifiedName fullyQualifiedNameVar = QualifiedName.create(_nombre_1);
                  System.out.println(("Variable de Algoritmo - DeclaracionVariable " + fullyQualifiedNameVar));
                  boolean _notEquals_1 = (!Objects.equal(fullyQualifiedNameVar, null));
                  if (_notEquals_1) {
                    IEObjectDescription _create_1 = EObjectDescription.create(fullyQualifiedNameVar, variable);
                    acceptor.accept(_create_1);
                  }
                }
              }
            } else {
              if ((declaracion instanceof DeclaracionPropia)) {
                DeclaracionPropia dec_1 = ((DeclaracionPropia) declaracion);
                EList<Variable> _variable_1 = dec_1.getVariable();
                for (final Variable variable_1 : _variable_1) {
                  {
                    String _nombre_1 = variable_1.getNombre();
                    final QualifiedName fullyQualifiedNameVar = QualifiedName.create(_nombre_1);
                    System.out.println(("Variable de Algoritmo - DeclaracionPropia " + fullyQualifiedNameVar));
                    boolean _notEquals_1 = (!Objects.equal(fullyQualifiedNameVar, null));
                    if (_notEquals_1) {
                      IEObjectDescription _create_1 = EObjectDescription.create(fullyQualifiedNameVar, variable_1);
                      acceptor.accept(_create_1);
                    }
                  }
                }
              }
            }
          }
          _xblockexpression_1 = true;
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        boolean _xifexpression_2 = false;
        if ((eObject instanceof DeclaracionVariable)) {
          boolean _xblockexpression_2 = false;
          {
            DeclaracionVariable dec = ((DeclaracionVariable) eObject);
            EList<Variable> _variable = dec.getVariable();
            for (final Variable variable : _variable) {
              {
                String _nombre = variable.getNombre();
                final QualifiedName fullyQualifiedNameVar = QualifiedName.create(_nombre);
                System.out.println(("Variable de DeclaracionVariable " + fullyQualifiedNameVar));
                boolean _notEquals = (!Objects.equal(fullyQualifiedNameVar, null));
                if (_notEquals) {
                  IEObjectDescription _create = EObjectDescription.create(fullyQualifiedNameVar, variable);
                  acceptor.accept(_create);
                }
              }
            }
            _xblockexpression_2 = true;
          }
          _xifexpression_2 = _xblockexpression_2;
        } else {
          boolean _xifexpression_3 = false;
          if ((eObject instanceof DeclaracionPropia)) {
            boolean _xblockexpression_3 = false;
            {
              DeclaracionPropia dec = ((DeclaracionPropia) eObject);
              EList<Variable> _variable = dec.getVariable();
              for (final Variable variable : _variable) {
                {
                  String _nombre = variable.getNombre();
                  final QualifiedName fullyQualifiedNameVar = QualifiedName.create(_nombre);
                  System.out.println(("Variable de DeclaracionPropia " + fullyQualifiedNameVar));
                  boolean _notEquals = (!Objects.equal(fullyQualifiedNameVar, null));
                  if (_notEquals) {
                    IEObjectDescription _create = EObjectDescription.create(fullyQualifiedNameVar, variable);
                    acceptor.accept(_create);
                  }
                }
              }
              _xblockexpression_3 = true;
            }
            _xifexpression_3 = _xblockexpression_3;
          } else {
            boolean _xifexpression_4 = false;
            if ((eObject instanceof Constantes)) {
              boolean _xblockexpression_4 = false;
              {
                Constantes constante = ((Constantes) eObject);
                Variable _variable = constante.getVariable();
                String _nombre = _variable.getNombre();
                final QualifiedName fullyQualifiedName = QualifiedName.create(_nombre);
                System.out.println(("fullyQualifiedName Constante " + fullyQualifiedName));
                boolean _notEquals = (!Objects.equal(fullyQualifiedName, null));
                if (_notEquals) {
                  IEObjectDescription _create = EObjectDescription.create(fullyQualifiedName, constante);
                  acceptor.accept(_create);
                }
                _xblockexpression_4 = true;
              }
              _xifexpression_4 = _xblockexpression_4;
            } else {
              _xifexpression_4 = false;
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
}
