package vary.pseudocodigo.dsl.c.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

public class VaryGrammarResourceDescription extends DefaultResourceDescription implements IResourceDescription {
	
	private final DefaultResourceDescriptionStrategy strategy;

    public VaryGrammarResourceDescription(final Resource resource,
            final DefaultResourceDescriptionStrategy strategy,
            final IResourceScopeCache cache) {
        super(resource, strategy, cache);
        this.strategy = strategy;
        this.strategy.setQualifiedNameProvider(new VaryGrammarQualifiedNameProvider());
    }

    @Override
    protected List<IEObjectDescription> computeExportedObjects() {

        if (!getResource().isLoaded()) {
            try {
                getResource().load(null);
            } catch (final IOException e) {
                return Collections.<IEObjectDescription> emptyList();
            }
        }
        final List<IEObjectDescription> exportedEObjects = new ArrayList<IEObjectDescription>();
        final IAcceptor<IEObjectDescription> acceptor = new IAcceptor<IEObjectDescription>() {

            @Override
            public void accept(final IEObjectDescription eObjectDescription) {
                exportedEObjects.add(eObjectDescription);
            }
        };
        final TreeIterator<EObject> allProperContents = EcoreUtil.getAllProperContents(getResource(), false);
        while (allProperContents.hasNext()) {
            final EObject content = allProperContents.next();
            if (!strategy.createEObjectDescriptions(content, acceptor)) {
                allProperContents.prune();
            }
        }
        return exportedEObjects;
    }

    @Override
    public Resource getResource() {
        Resource resource = super.getResource();
        if (resource != null && PlatformUI.isWorkbenchRunning() && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null
                && PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() != null) {
            final IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
            if (part != null && part instanceof DiagramEditor) {
               final Resource activeResource = ((DiagramEditor) part).getDiagramEditPart().resolveSemanticElement().eResource();
               if (activeResource != null && resource.getURI().equals(activeResource.getURI())) {
                  resource = activeResource;
               }
            }
        }
        return resource;
    }
	
}
