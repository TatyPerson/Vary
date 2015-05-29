package vary.pseudocodigo.dsl.c.resources import com.google.inject.Inject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.emf.ecore.EClass
import diagramapseudocodigo.DiagramapseudocodigoPackage

class VaryGrammarIndex {
  @Inject ResourceDescriptionsProvider rdp
  @Inject IContainer.Manager cm
  
  def getVisibleEObjectDescriptions(EObject o) {
    o.getVisibleContainers.map[ container |
      container.getExportedObjects
    ].flatten
  }

  def getVisibleEObjectDescriptions(EObject o, EClass type) {
    o.getVisibleContainers.map[ container |
      container.getExportedObjectsByType(type)
    ].flatten
  }

  def getVisibleClassesDescriptions(EObject o) {
    o.getVisibleEObjectDescriptions
      (DiagramapseudocodigoPackage::eINSTANCE.getModulo())
  }

  def getVisibleContainers(EObject o) {
    val index = rdp.getResourceDescriptions(o.eResource)
    val rd = index.getResourceDescription(o.eResource.URI)
    cm.getVisibleContainers(rd, index)
  }
  
  def  getResourceDescription(EObject o) {
    val index = rdp.getResourceDescriptions(o.eResource)
    index.getResourceDescription(o.eResource.URI)
  }

  def getExportedEObjectDescriptions(EObject o) {
    o.getResourceDescription.getExportedObjects
  }
}