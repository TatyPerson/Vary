package vary.pseudocodigo.dsl.c.ui.sintaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class VaryHighLightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String ALGORITMO_ID = "Algoritmo";
	public static final String PRINCIPALES_ID = "Keywords_Principales";
	public static final String TIPOS_ID = "Keywords_Tipos";
	public static final String DECLARACIONES_ID = "Keywords_Tipos_Declaraciones";
	public static final String GENERAL_ID = "Keywords_Generales";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ALGORITMO_ID, "Algoritmo", algoritmoTextStyle());
		acceptor.acceptDefaultHighlighting(PRINCIPALES_ID, "Keywords_Principales", principalesTextStyle());
		acceptor.acceptDefaultHighlighting(TIPOS_ID, "Keywords_Tipos", tiposTextStyle());
		acceptor.acceptDefaultHighlighting(DECLARACIONES_ID, "Keywords_Tipos_Declaraciones", declaracionesTextStyle());
		acceptor.acceptDefaultHighlighting(GENERAL_ID, "Keywords_Generales", generalTextStyle());
	}
	
	public TextStyle algoritmoTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(220, 20, 60));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle principalesTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 139));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle tiposTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(139, 0, 139));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle declaracionesTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(205, 155, 29));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle generalTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(139, 69, 19));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
}
