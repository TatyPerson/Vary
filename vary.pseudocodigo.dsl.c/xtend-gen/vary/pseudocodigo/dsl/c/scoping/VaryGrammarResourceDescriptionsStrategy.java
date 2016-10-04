package vary.pseudocodigo.dsl.c.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Constante;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.DeclaracionBasica;
import diagramapseudocodigo.DeclaracionDefinida;
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
          Inicio _inicio = algoritmo.getInicio();
          EList<Declaracion> _declaraciones = _inicio.getDeclaraciones();
          for (final Declaracion declaracion : _declaraciones) {
            if ((declaracion instanceof DeclaracionBasica)) {
              DeclaracionBasica dec = ((DeclaracionBasica) declaracion);
              EList<Variable> _variables = dec.getVariables();
              for (final Variable variable : _variables) {
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
              if ((declaracion instanceof DeclaracionDefinida)) {
                DeclaracionDefinida dec_1 = ((DeclaracionDefinida) declaracion);
                EList<Variable> _variables_1 = dec_1.getVariables();
                for (final Variable variable_1 : _variables_1) {
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
        if ((eObject instanceof DeclaracionBasica)) {
          boolean _xblockexpression_2 = false;
          {
            DeclaracionBasica dec = ((DeclaracionBasica) eObject);
            EList<Variable> _variables = dec.getVariables();
            for (final Variable variable : _variables) {
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
          if ((eObject instanceof DeclaracionDefinida)) {
            boolean _xblockexpression_3 = false;
            {
              DeclaracionDefinida dec = ((DeclaracionDefinida) eObject);
              EList<Variable> _variables = dec.getVariables();
              for (final Variable variable : _variables) {
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
            if ((eObject instanceof Constante)) {
              boolean _xblockexpression_4 = false;
              {
                Constante constante = ((Constante) eObject);
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
