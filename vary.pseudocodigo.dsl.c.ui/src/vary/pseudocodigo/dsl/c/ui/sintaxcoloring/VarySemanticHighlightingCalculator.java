package vary.pseudocodigo.dsl.c.ui.sintaxcoloring;

import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class VarySemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;
		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getGrammarElement() instanceof CrossReference) {
				CrossReference ref = (CrossReference) node.getGrammarElement();
				RuleCall r = (RuleCall) ref.getTerminal();
				colorRule(acceptor, node, r.getRule());
			}
			if(node.getGrammarElement() instanceof RuleCall){
				RuleCall r = (RuleCall) node.getGrammarElement();
				colorRule(acceptor, node, r.getRule());
			}
		}
	}
	
	private void colorRule(IHighlightedPositionAcceptor acceptor, INode node, AbstractRule rule) {
		String name = rule.getName();
		if(name.equals("DeclaracionDefinida")) {
			INode leafNode = null;
			int contNodos = 0;
			for(INode nodoAux: node.getLeafNodes()) {
				if(contNodos == 1) { //Cogemos el segundo que es el tipo
					leafNode = nodoAux;
				}
				contNodos++;
			}
			setNodeColor(acceptor, leafNode, VaryHighLightingConfiguration.DECLARACIONES_ID);
		} else if(name.equals("CampoRegistro")) {
			setNodeColor(acceptor, node, VaryHighLightingConfiguration.CAMPOREGISTRO_ID);
		} else if(name.equals("Escribir") || name.equals("Leer") || name.equals("FuncionInterna")) {
			INode leafNode = null;
			for(INode nodoAux: node.getLeafNodes()) {
				if(nodoAux.getText().equals(")")) {
					leafNode = nodoAux;
				}
			}
			setNodeColor(acceptor, leafNode, VaryHighLightingConfiguration.TIPOS_ID);
		}
	}
	
	private void setNodeColor(IHighlightedPositionAcceptor acceptor, INode node, String colorId) {
		acceptor.addPosition(node.getOffset(), node.getLength(), colorId);
	}

}
