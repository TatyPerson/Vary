package vary.pseudocodigo.dsl.c.resources;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import diagramapseudocodigo.DiagramapseudocodigoPackage;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class VaryGrammarIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = new Function1<IContainer, Iterable<IEObjectDescription>>() {
      @Override
      public Iterable<IEObjectDescription> apply(final IContainer container) {
        return container.getExportedObjects();
      }
    };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    return Iterables.<IEObjectDescription>concat(_map);
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    List<IContainer> _visibleContainers = this.getVisibleContainers(o);
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = new Function1<IContainer, Iterable<IEObjectDescription>>() {
      @Override
      public Iterable<IEObjectDescription> apply(final IContainer container) {
        return container.getExportedObjectsByType(type);
      }
    };
    List<Iterable<IEObjectDescription>> _map = ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(_visibleContainers, _function);
    return Iterables.<IEObjectDescription>concat(_map);
  }
  
  public Iterable<IEObjectDescription> getVisibleClassesDescriptions(final EObject o) {
    EClass _modulo = DiagramapseudocodigoPackage.eINSTANCE.getModulo();
    return this.getVisibleEObjectDescriptions(o, _modulo);
  }
  
  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      final IResourceDescription rd = index.getResourceDescription(_uRI);
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      Resource _eResource = o.eResource();
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(_eResource);
      Resource _eResource_1 = o.eResource();
      URI _uRI = _eResource_1.getURI();
      _xblockexpression = index.getResourceDescription(_uRI);
    }
    return _xblockexpression;
  }
  
  public Iterable<IEObjectDescription> getExportedEObjectDescriptions(final EObject o) {
    IResourceDescription _resourceDescription = this.getResourceDescription(o);
    return _resourceDescription.getExportedObjects();
  }
}
