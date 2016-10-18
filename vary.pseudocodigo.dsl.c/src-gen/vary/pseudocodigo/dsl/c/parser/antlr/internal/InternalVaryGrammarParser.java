package vary.pseudocodigo.dsl.c.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import vary.pseudocodigo.dsl.c.services.VaryGrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVaryGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NOMBRE_FUN", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algoritmo'", "'importa'", "'fin_importa'", "'const'", "'tipo'", "'var'", "'fin_algoritmo'", "'Modulo'", "'exporta'", "'fin_exporta'", "'fin_modulo'", "'implementacion'", "'fin_implementacion'", "'procedimiento'", "','", "')'", "'funcion'", "'('", "': '", "'abrir('", "'cerrar('", "'escritura'", "'lectura'", "'cos('", "'cuadrado('", "'exp('", "'ln('", "'log('", "'sen('", "'sqrt('", "'longitud('", "'concatena('", "'copiar('", "'.'", "'E'", "'e'", "'='", "'vector'", "'['", "']'", "'de'", "'matriz'", "']['", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'principal'", "'inicio'", "'fin_principal'", "'<-'", "'escribir('", "'leer('", "'si'", "'si('", "'entonces'", "'fin_si'", "'mientras'", "'mientras('", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'hasta_que('", "'desde'", "'hasta'", "'fin_desde'", "'caso'", "'segun_sea'", "'segun_sea('", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'o'", "'y'", "'!='", "'<'", "'>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'mod'", "'div'", "'no'", "'si_no'", "'devolver'", "'fin_funcion'", "'fin_procedimiento'", "'E/S'", "'S'", "'verdadero'", "'falso'"
    };
    public static final int RULE_NOMBRE_FUN=5;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=7;
    public static final int RULE_CAR=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int RULE_CAD=8;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalVaryGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaryGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaryGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVaryGrammar.g"; }



     	private VaryGrammarGrammarAccess grammarAccess;
     	
        public InternalVaryGrammarParser(TokenStream input, VaryGrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Codigo";	
       	}
       	
       	@Override
       	protected VaryGrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCodigo"
    // InternalVaryGrammar.g:67:1: entryRuleCodigo returns [EObject current=null] : iv_ruleCodigo= ruleCodigo EOF ;
    public final EObject entryRuleCodigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodigo = null;


        try {
            // InternalVaryGrammar.g:68:2: (iv_ruleCodigo= ruleCodigo EOF )
            // InternalVaryGrammar.g:69:2: iv_ruleCodigo= ruleCodigo EOF
            {
             newCompositeNode(grammarAccess.getCodigoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCodigo=ruleCodigo();

            state._fsp--;

             current =iv_ruleCodigo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodigo"


    // $ANTLR start "ruleCodigo"
    // InternalVaryGrammar.g:76:1: ruleCodigo returns [EObject current=null] : (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        EObject this_Algoritmo_0 = null;

        EObject this_Modulo_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:79:28: ( (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) )
            // InternalVaryGrammar.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
            {
            // InternalVaryGrammar.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVaryGrammar.g:81:5: this_Algoritmo_0= ruleAlgoritmo
                    {
                     
                            newCompositeNode(grammarAccess.getCodigoAccess().getAlgoritmoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Algoritmo_0=ruleAlgoritmo();

                    state._fsp--;

                     
                            current = this_Algoritmo_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:91:5: this_Modulo_1= ruleModulo
                    {
                     
                            newCompositeNode(grammarAccess.getCodigoAccess().getModuloParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Modulo_1=ruleModulo();

                    state._fsp--;

                     
                            current = this_Modulo_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodigo"


    // $ANTLR start "entryRuleAlgoritmo"
    // InternalVaryGrammar.g:107:1: entryRuleAlgoritmo returns [EObject current=null] : iv_ruleAlgoritmo= ruleAlgoritmo EOF ;
    public final EObject entryRuleAlgoritmo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoritmo = null;


        try {
            // InternalVaryGrammar.g:108:2: (iv_ruleAlgoritmo= ruleAlgoritmo EOF )
            // InternalVaryGrammar.g:109:2: iv_ruleAlgoritmo= ruleAlgoritmo EOF
            {
             newCompositeNode(grammarAccess.getAlgoritmoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlgoritmo=ruleAlgoritmo();

            state._fsp--;

             current =iv_ruleAlgoritmo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgoritmo"


    // $ANTLR start "ruleAlgoritmo"
    // InternalVaryGrammar.g:116:1: ruleAlgoritmo returns [EObject current=null] : (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )? (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_11_0= ruleSubproceso ) )* ( (lv_inicio_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' ) ;
    public final EObject ruleAlgoritmo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_constantes_6_0 = null;

        EObject lv_complejos_8_0 = null;

        EObject lv_globales_10_0 = null;

        EObject lv_subprocesos_11_0 = null;

        EObject lv_inicio_12_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:119:28: ( (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )? (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_11_0= ruleSubproceso ) )* ( (lv_inicio_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' ) )
            // InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )? (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_11_0= ruleSubproceso ) )* ( (lv_inicio_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' )
            {
            // InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )? (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_11_0= ruleSubproceso ) )* ( (lv_inicio_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' )
            // InternalVaryGrammar.g:120:3: otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )? (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_11_0= ruleSubproceso ) )* ( (lv_inicio_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getAlgoritmoAccess().getAlgoritmoKeyword_0());
                
            // InternalVaryGrammar.g:124:1: ( (lv_nombre_1_0= ruleEString ) )
            // InternalVaryGrammar.g:125:1: (lv_nombre_1_0= ruleEString )
            {
            // InternalVaryGrammar.g:125:1: (lv_nombre_1_0= ruleEString )
            // InternalVaryGrammar.g:126:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:142:2: (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVaryGrammar.g:142:4: otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa'
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getAlgoritmoAccess().getImportaKeyword_2_0());
                        
                    // InternalVaryGrammar.g:146:1: ( (otherlv_3= RULE_ID ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:147:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalVaryGrammar.g:147:1: (otherlv_3= RULE_ID )
                    	    // InternalVaryGrammar.g:148:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_4); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlgoritmoAccess().getFin_importaKeyword_2_2());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:163:3: (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVaryGrammar.g:163:5: otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstante ) )*
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getAlgoritmoAccess().getConstKeyword_3_0());
                        
                    // InternalVaryGrammar.g:167:1: ( (lv_constantes_6_0= ruleConstante ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:168:1: (lv_constantes_6_0= ruleConstante )
                    	    {
                    	    // InternalVaryGrammar.g:168:1: (lv_constantes_6_0= ruleConstante )
                    	    // InternalVaryGrammar.g:169:3: lv_constantes_6_0= ruleConstante
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstanteParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_constantes_6_0=ruleConstante();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constantes",
                    	            		lv_constantes_6_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Constante");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:185:5: (otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVaryGrammar.g:185:7: otherlv_7= 'tipo' ( (lv_complejos_8_0= ruleTipoComplejo ) )*
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getTipoKeyword_4_0());
                        
                    // InternalVaryGrammar.g:189:1: ( (lv_complejos_8_0= ruleTipoComplejo ) )*
                    loop6:
                    do {
                        int alt6=2;
                        alt6 = dfa6.predict(input);
                        switch (alt6) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:190:1: (lv_complejos_8_0= ruleTipoComplejo )
                    	    {
                    	    // InternalVaryGrammar.g:190:1: (lv_complejos_8_0= ruleTipoComplejo )
                    	    // InternalVaryGrammar.g:191:3: lv_complejos_8_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getComplejosTipoComplejoParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_complejos_8_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"complejos",
                    	            		lv_complejos_8_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoComplejo");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:207:5: (otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVaryGrammar.g:207:7: otherlv_9= 'var' ( (lv_globales_10_0= ruleDeclaracion ) )*
                    {
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_9, grammarAccess.getAlgoritmoAccess().getVarKeyword_5_0());
                        
                    // InternalVaryGrammar.g:211:1: ( (lv_globales_10_0= ruleDeclaracion ) )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==32) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==32) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA8_3 = input.LA(2);

                            if ( (LA8_3==32) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA8_4 = input.LA(2);

                            if ( (LA8_4==32) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA8_5 = input.LA(2);

                            if ( (LA8_5==32) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:212:1: (lv_globales_10_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:212:1: (lv_globales_10_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:213:3: lv_globales_10_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalesDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_globales_10_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"globales",
                    	            		lv_globales_10_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:229:5: ( (lv_subprocesos_11_0= ruleSubproceso ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||(LA10_0>=88 && LA10_0<=92)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVaryGrammar.g:230:1: (lv_subprocesos_11_0= ruleSubproceso )
            	    {
            	    // InternalVaryGrammar.g:230:1: (lv_subprocesos_11_0= ruleSubproceso )
            	    // InternalVaryGrammar.g:231:3: lv_subprocesos_11_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getSubprocesosSubprocesoParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_subprocesos_11_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subprocesos",
            	            		lv_subprocesos_11_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Subproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVaryGrammar.g:247:3: ( (lv_inicio_12_0= ruleInicio ) )
            // InternalVaryGrammar.g:248:1: (lv_inicio_12_0= ruleInicio )
            {
            // InternalVaryGrammar.g:248:1: (lv_inicio_12_0= ruleInicio )
            // InternalVaryGrammar.g:249:3: lv_inicio_12_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getInicioInicioParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            lv_inicio_12_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"inicio",
                    		lv_inicio_12_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getAlgoritmoAccess().getFin_algoritmoKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgoritmo"


    // $ANTLR start "entryRuleModulo"
    // InternalVaryGrammar.g:277:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalVaryGrammar.g:278:2: (iv_ruleModulo= ruleModulo EOF )
            // InternalVaryGrammar.g:279:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalVaryGrammar.g:286:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_exporta_constantes_7_0 = null;

        AntlrDatatypeRuleToken lv_exporta_tipos_9_0 = null;

        EObject lv_exporta_globales_11_0 = null;

        EObject lv_exporta_subprocesos_12_0 = null;

        EObject lv_implementacion_14_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:289:28: ( (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' ) )
            // InternalVaryGrammar.g:290:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' )
            {
            // InternalVaryGrammar.g:290:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' )
            // InternalVaryGrammar.g:290:3: otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_9); 

                	newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getModuloKeyword_0());
                
            // InternalVaryGrammar.g:294:1: ( (lv_nombre_1_0= RULE_ID ) )
            // InternalVaryGrammar.g:295:1: (lv_nombre_1_0= RULE_ID )
            {
            // InternalVaryGrammar.g:295:1: (lv_nombre_1_0= RULE_ID )
            // InternalVaryGrammar.g:296:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getModuloAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuloRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getImportaKeyword_2());
                
            // InternalVaryGrammar.g:316:1: ( (otherlv_3= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVaryGrammar.g:317:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalVaryGrammar.g:317:1: (otherlv_3= RULE_ID )
            	    // InternalVaryGrammar.g:318:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModuloRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            	    		newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_4, grammarAccess.getModuloAccess().getFin_importaKeyword_4());
                
            // InternalVaryGrammar.g:333:1: (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' )
            // InternalVaryGrammar.g:333:3: otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta'
            {
            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getExportaKeyword_5_0());
                
            // InternalVaryGrammar.g:337:1: (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVaryGrammar.g:337:3: otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )*
                    {
                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuloAccess().getConstKeyword_5_1_0());
                        
                    // InternalVaryGrammar.g:341:1: ( (lv_exporta_constantes_7_0= ruleEString ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:342:1: (lv_exporta_constantes_7_0= ruleEString )
                    	    {
                    	    // InternalVaryGrammar.g:342:1: (lv_exporta_constantes_7_0= ruleEString )
                    	    // InternalVaryGrammar.g:343:3: lv_exporta_constantes_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_exporta_constantes_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_constantes",
                    	            		lv_exporta_constantes_7_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:359:5: (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVaryGrammar.g:359:7: otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )*
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_8, grammarAccess.getModuloAccess().getTipoKeyword_5_2_0());
                        
                    // InternalVaryGrammar.g:363:1: ( (lv_exporta_tipos_9_0= ruleEString ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:364:1: (lv_exporta_tipos_9_0= ruleEString )
                    	    {
                    	    // InternalVaryGrammar.g:364:1: (lv_exporta_tipos_9_0= ruleEString )
                    	    // InternalVaryGrammar.g:365:3: lv_exporta_tipos_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_exporta_tipos_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_tipos",
                    	            		lv_exporta_tipos_9_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:381:5: (otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVaryGrammar.g:381:7: otherlv_10= 'var' ( (lv_exporta_globales_11_0= ruleDeclaracion ) )*
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_15); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuloAccess().getVarKeyword_5_3_0());
                        
                    // InternalVaryGrammar.g:385:1: ( (lv_exporta_globales_11_0= ruleDeclaracion ) )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==32) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA16_3 = input.LA(2);

                            if ( (LA16_3==32) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA16_4 = input.LA(2);

                            if ( (LA16_4==32) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA16_5 = input.LA(2);

                            if ( (LA16_5==32) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA16_6 = input.LA(2);

                            if ( (LA16_6==32) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:386:1: (lv_exporta_globales_11_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:386:1: (lv_exporta_globales_11_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:387:3: lv_exporta_globales_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalesDeclaracionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_15);
                    	    lv_exporta_globales_11_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_globales",
                    	            		lv_exporta_globales_11_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:403:5: ( (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27||(LA18_0>=88 && LA18_0<=92)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVaryGrammar.g:404:1: (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso )
            	    {
            	    // InternalVaryGrammar.g:404:1: (lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso )
            	    // InternalVaryGrammar.g:405:3: lv_exporta_subprocesos_12_0= ruleCabeceraSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_subprocesosCabeceraSubprocesoParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_exporta_subprocesos_12_0=ruleCabeceraSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exporta_subprocesos",
            	            		lv_exporta_subprocesos_12_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CabeceraSubproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_17); 

                	newLeafNode(otherlv_13, grammarAccess.getModuloAccess().getFin_exportaKeyword_5_5());
                

            }

            // InternalVaryGrammar.g:425:2: ( (lv_implementacion_14_0= ruleImplementacion ) )
            // InternalVaryGrammar.g:426:1: (lv_implementacion_14_0= ruleImplementacion )
            {
            // InternalVaryGrammar.g:426:1: (lv_implementacion_14_0= ruleImplementacion )
            // InternalVaryGrammar.g:427:3: lv_implementacion_14_0= ruleImplementacion
            {
             
            	        newCompositeNode(grammarAccess.getModuloAccess().getImplementacionImplementacionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_implementacion_14_0=ruleImplementacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	        }
                   		set(
                   			current, 
                   			"implementacion",
                    		lv_implementacion_14_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Implementacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,24,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_15, grammarAccess.getModuloAccess().getFin_moduloKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRuleImplementacion"
    // InternalVaryGrammar.g:455:1: entryRuleImplementacion returns [EObject current=null] : iv_ruleImplementacion= ruleImplementacion EOF ;
    public final EObject entryRuleImplementacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementacion = null;


        try {
            // InternalVaryGrammar.g:456:2: (iv_ruleImplementacion= ruleImplementacion EOF )
            // InternalVaryGrammar.g:457:2: iv_ruleImplementacion= ruleImplementacion EOF
            {
             newCompositeNode(grammarAccess.getImplementacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImplementacion=ruleImplementacion();

            state._fsp--;

             current =iv_ruleImplementacion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementacion"


    // $ANTLR start "ruleImplementacion"
    // InternalVaryGrammar.g:464:1: ruleImplementacion returns [EObject current=null] : ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) ) ;
    public final EObject ruleImplementacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_constantes_3_0 = null;

        EObject lv_complejos_5_0 = null;

        EObject lv_globales_7_0 = null;

        EObject lv_subprocesos_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:467:28: ( ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) ) )
            // InternalVaryGrammar.g:468:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) )
            {
            // InternalVaryGrammar.g:468:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) )
            // InternalVaryGrammar.g:468:2: () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' )
            {
            // InternalVaryGrammar.g:468:2: ()
            // InternalVaryGrammar.g:469:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplementacionAccess().getImplementacionAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:474:2: (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' )
            // InternalVaryGrammar.g:474:4: otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )? (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )? ( (lv_subprocesos_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion'
            {
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementacionKeyword_1_0());
                
            // InternalVaryGrammar.g:478:1: (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVaryGrammar.g:478:3: otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstante ) )*
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplementacionAccess().getConstKeyword_1_1_0());
                        
                    // InternalVaryGrammar.g:482:1: ( (lv_constantes_3_0= ruleConstante ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:483:1: (lv_constantes_3_0= ruleConstante )
                    	    {
                    	    // InternalVaryGrammar.g:483:1: (lv_constantes_3_0= ruleConstante )
                    	    // InternalVaryGrammar.g:484:3: lv_constantes_3_0= ruleConstante
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstanteParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_constantes_3_0=ruleConstante();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constantes",
                    	            		lv_constantes_3_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Constante");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:500:5: (otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVaryGrammar.g:500:7: otherlv_4= 'tipo' ( (lv_complejos_5_0= ruleTipoComplejo ) )*
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_21); 

                        	newLeafNode(otherlv_4, grammarAccess.getImplementacionAccess().getTipoKeyword_1_2_0());
                        
                    // InternalVaryGrammar.g:504:1: ( (lv_complejos_5_0= ruleTipoComplejo ) )*
                    loop21:
                    do {
                        int alt21=2;
                        alt21 = dfa21.predict(input);
                        switch (alt21) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:505:1: (lv_complejos_5_0= ruleTipoComplejo )
                    	    {
                    	    // InternalVaryGrammar.g:505:1: (lv_complejos_5_0= ruleTipoComplejo )
                    	    // InternalVaryGrammar.g:506:3: lv_complejos_5_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getComplejosTipoComplejoParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_complejos_5_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"complejos",
                    	            		lv_complejos_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoComplejo");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:522:5: (otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVaryGrammar.g:522:7: otherlv_6= 'var' ( (lv_globales_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_6, grammarAccess.getImplementacionAccess().getVarKeyword_1_3_0());
                        
                    // InternalVaryGrammar.g:526:1: ( (lv_globales_7_0= ruleDeclaracion ) )*
                    loop23:
                    do {
                        int alt23=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==32) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==32) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA23_3 = input.LA(2);

                            if ( (LA23_3==32) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA23_4 = input.LA(2);

                            if ( (LA23_4==32) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA23_5 = input.LA(2);

                            if ( (LA23_5==32) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt23=1;
                            }
                            break;

                        }

                        switch (alt23) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:527:1: (lv_globales_7_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:527:1: (lv_globales_7_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:528:3: lv_globales_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalesDeclaracionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_globales_7_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"globales",
                    	            		lv_globales_7_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaryGrammar.g:544:5: ( (lv_subprocesos_8_0= ruleSubproceso ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27||(LA25_0>=88 && LA25_0<=92)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVaryGrammar.g:545:1: (lv_subprocesos_8_0= ruleSubproceso )
            	    {
            	    // InternalVaryGrammar.g:545:1: (lv_subprocesos_8_0= ruleSubproceso )
            	    // InternalVaryGrammar.g:546:3: lv_subprocesos_8_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getSubprocesosSubprocesoParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_subprocesos_8_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subprocesos",
            	            		lv_subprocesos_8_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Subproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getImplementacionAccess().getFin_implementacionKeyword_1_5());
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementacion"


    // $ANTLR start "entryRuleCabeceraSubproceso"
    // InternalVaryGrammar.g:574:1: entryRuleCabeceraSubproceso returns [EObject current=null] : iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF ;
    public final EObject entryRuleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraSubproceso = null;


        try {
            // InternalVaryGrammar.g:575:2: (iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF )
            // InternalVaryGrammar.g:576:2: iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF
            {
             newCompositeNode(grammarAccess.getCabeceraSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCabeceraSubproceso=ruleCabeceraSubproceso();

            state._fsp--;

             current =iv_ruleCabeceraSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCabeceraSubproceso"


    // $ANTLR start "ruleCabeceraSubproceso"
    // InternalVaryGrammar.g:583:1: ruleCabeceraSubproceso returns [EObject current=null] : (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) ;
    public final EObject ruleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_CabeceraProcedimiento_0 = null;

        EObject this_CabeceraFuncion_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:586:28: ( (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) )
            // InternalVaryGrammar.g:587:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            {
            // InternalVaryGrammar.g:587:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=88 && LA26_0<=92)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalVaryGrammar.g:588:5: this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraProcedimientoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CabeceraProcedimiento_0=ruleCabeceraProcedimiento();

                    state._fsp--;

                     
                            current = this_CabeceraProcedimiento_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:598:5: this_CabeceraFuncion_1= ruleCabeceraFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraFuncionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CabeceraFuncion_1=ruleCabeceraFuncion();

                    state._fsp--;

                     
                            current = this_CabeceraFuncion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCabeceraSubproceso"


    // $ANTLR start "entryRuleCabeceraProcedimiento"
    // InternalVaryGrammar.g:614:1: entryRuleCabeceraProcedimiento returns [EObject current=null] : iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF ;
    public final EObject entryRuleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraProcedimiento = null;


        try {
            // InternalVaryGrammar.g:615:2: (iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF )
            // InternalVaryGrammar.g:616:2: iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getCabeceraProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCabeceraProcedimiento=ruleCabeceraProcedimiento();

            state._fsp--;

             current =iv_ruleCabeceraProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCabeceraProcedimiento"


    // $ANTLR start "ruleCabeceraProcedimiento"
    // InternalVaryGrammar.g:623:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parametros_2_0 = null;

        EObject lv_parametros_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:626:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' ) )
            // InternalVaryGrammar.g:627:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' )
            {
            // InternalVaryGrammar.g:627:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' )
            // InternalVaryGrammar.g:627:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_0, grammarAccess.getCabeceraProcedimientoAccess().getProcedimientoKeyword_0());
                
            // InternalVaryGrammar.g:631:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:632:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:632:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:633:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_25); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getCabeceraProcedimientoAccess().getNombreNOMBRE_FUNTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCabeceraProcedimientoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.NOMBRE_FUN");
            	    

            }


            }

            // InternalVaryGrammar.g:649:2: ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48||(LA28_0>=111 && LA28_0<=112)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVaryGrammar.g:649:3: ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:649:3: ( (lv_parametros_2_0= ruleParametro ) )
                    // InternalVaryGrammar.g:650:1: (lv_parametros_2_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:650:1: (lv_parametros_2_0= ruleParametro )
                    // InternalVaryGrammar.g:651:3: lv_parametros_2_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrosParametroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_2_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_2_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:667:2: (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==28) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:667:4: otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalVaryGrammar.g:671:1: ( (lv_parametros_4_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:672:1: (lv_parametros_4_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:672:1: (lv_parametros_4_0= ruleParametro )
                    	    // InternalVaryGrammar.g:673:3: lv_parametros_4_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrosParametroParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_4_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_4_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getCabeceraProcedimientoAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCabeceraProcedimiento"


    // $ANTLR start "entryRuleCabeceraFuncion"
    // InternalVaryGrammar.g:701:1: entryRuleCabeceraFuncion returns [EObject current=null] : iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF ;
    public final EObject entryRuleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraFuncion = null;


        try {
            // InternalVaryGrammar.g:702:2: (iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF )
            // InternalVaryGrammar.g:703:2: iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF
            {
             newCompositeNode(grammarAccess.getCabeceraFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCabeceraFuncion=ruleCabeceraFuncion();

            state._fsp--;

             current =iv_ruleCabeceraFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCabeceraFuncion"


    // $ANTLR start "ruleCabeceraFuncion"
    // InternalVaryGrammar.g:710:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_parametros_3_0 = null;

        EObject lv_parametros_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:713:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' ) )
            // InternalVaryGrammar.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' )
            // InternalVaryGrammar.g:714:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')'
            {
            // InternalVaryGrammar.g:714:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:715:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:715:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:716:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_28);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_1, grammarAccess.getCabeceraFuncionAccess().getFuncionKeyword_1());
                
            // InternalVaryGrammar.g:736:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:737:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:737:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:738:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_25); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getCabeceraFuncionAccess().getNombreNOMBRE_FUNTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCabeceraFuncionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.NOMBRE_FUN");
            	    

            }


            }

            // InternalVaryGrammar.g:754:2: ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48||(LA30_0>=111 && LA30_0<=112)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVaryGrammar.g:754:3: ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:754:3: ( (lv_parametros_3_0= ruleParametro ) )
                    // InternalVaryGrammar.g:755:1: (lv_parametros_3_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:755:1: (lv_parametros_3_0= ruleParametro )
                    // InternalVaryGrammar.g:756:3: lv_parametros_3_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrosParametroParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_3_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:772:2: (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:772:4: otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalVaryGrammar.g:776:1: ( (lv_parametros_5_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:777:1: (lv_parametros_5_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:777:1: (lv_parametros_5_0= ruleParametro )
                    	    // InternalVaryGrammar.g:778:3: lv_parametros_5_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrosParametroParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_5_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getCabeceraFuncionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCabeceraFuncion"


    // $ANTLR start "entryRuleTipoComplejo"
    // InternalVaryGrammar.g:806:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // InternalVaryGrammar.g:807:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // InternalVaryGrammar.g:808:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoComplejo"


    // $ANTLR start "ruleTipoComplejo"
    // InternalVaryGrammar.g:815:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango | this_TipoSubproceso_6= ruleTipoSubproceso ) ;
    public final EObject ruleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_Vector_0 = null;

        EObject this_Matriz_1 = null;

        EObject this_Registro_2 = null;

        EObject this_Archivo_3 = null;

        EObject this_Enumerado_4 = null;

        EObject this_Subrango_5 = null;

        EObject this_TipoSubproceso_6 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:818:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango | this_TipoSubproceso_6= ruleTipoSubproceso ) )
            // InternalVaryGrammar.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango | this_TipoSubproceso_6= ruleTipoSubproceso )
            {
            // InternalVaryGrammar.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango | this_TipoSubproceso_6= ruleTipoSubproceso )
            int alt31=7;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalVaryGrammar.g:820:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:830:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:840:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:850:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:860:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:870:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Subrango_5=ruleSubrango();

                    state._fsp--;

                     
                            current = this_Subrango_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalVaryGrammar.g:880:5: this_TipoSubproceso_6= ruleTipoSubproceso
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getTipoSubprocesoParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoSubproceso_6=ruleTipoSubproceso();

                    state._fsp--;

                     
                            current = this_TipoSubproceso_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoComplejo"


    // $ANTLR start "entryRuleTipoSubproceso"
    // InternalVaryGrammar.g:896:1: entryRuleTipoSubproceso returns [EObject current=null] : iv_ruleTipoSubproceso= ruleTipoSubproceso EOF ;
    public final EObject entryRuleTipoSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoSubproceso = null;


        try {
            // InternalVaryGrammar.g:897:2: (iv_ruleTipoSubproceso= ruleTipoSubproceso EOF )
            // InternalVaryGrammar.g:898:2: iv_ruleTipoSubproceso= ruleTipoSubproceso EOF
            {
             newCompositeNode(grammarAccess.getTipoSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoSubproceso=ruleTipoSubproceso();

            state._fsp--;

             current =iv_ruleTipoSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoSubproceso"


    // $ANTLR start "ruleTipoSubproceso"
    // InternalVaryGrammar.g:905:1: ruleTipoSubproceso returns [EObject current=null] : (this_TipoFuncion_0= ruleTipoFuncion | this_TipoProcedimiento_1= ruleTipoProcedimiento ) ;
    public final EObject ruleTipoSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_TipoFuncion_0 = null;

        EObject this_TipoProcedimiento_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:908:28: ( (this_TipoFuncion_0= ruleTipoFuncion | this_TipoProcedimiento_1= ruleTipoProcedimiento ) )
            // InternalVaryGrammar.g:909:1: (this_TipoFuncion_0= ruleTipoFuncion | this_TipoProcedimiento_1= ruleTipoProcedimiento )
            {
            // InternalVaryGrammar.g:909:1: (this_TipoFuncion_0= ruleTipoFuncion | this_TipoProcedimiento_1= ruleTipoProcedimiento )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=88 && LA32_0<=92)) ) {
                alt32=1;
            }
            else if ( (LA32_0==27) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalVaryGrammar.g:910:5: this_TipoFuncion_0= ruleTipoFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getTipoSubprocesoAccess().getTipoFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoFuncion_0=ruleTipoFuncion();

                    state._fsp--;

                     
                            current = this_TipoFuncion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:920:5: this_TipoProcedimiento_1= ruleTipoProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getTipoSubprocesoAccess().getTipoProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoProcedimiento_1=ruleTipoProcedimiento();

                    state._fsp--;

                     
                            current = this_TipoProcedimiento_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoSubproceso"


    // $ANTLR start "entryRuleTipoFuncion"
    // InternalVaryGrammar.g:936:1: entryRuleTipoFuncion returns [EObject current=null] : iv_ruleTipoFuncion= ruleTipoFuncion EOF ;
    public final EObject entryRuleTipoFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoFuncion = null;


        try {
            // InternalVaryGrammar.g:937:2: (iv_ruleTipoFuncion= ruleTipoFuncion EOF )
            // InternalVaryGrammar.g:938:2: iv_ruleTipoFuncion= ruleTipoFuncion EOF
            {
             newCompositeNode(grammarAccess.getTipoFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoFuncion=ruleTipoFuncion();

            state._fsp--;

             current =iv_ruleTipoFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoFuncion"


    // $ANTLR start "ruleTipoFuncion"
    // InternalVaryGrammar.g:945:1: ruleTipoFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' otherlv_2= '(' ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) ) ;
    public final EObject ruleTipoFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_parametros_3_0 = null;

        EObject lv_parametros_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:948:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' otherlv_2= '(' ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:949:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' otherlv_2= '(' ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:949:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' otherlv_2= '(' ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) ) )
            // InternalVaryGrammar.g:949:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' otherlv_2= '(' ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' otherlv_7= ': ' ( (lv_nombre_8_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:949:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:950:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:950:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:951:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_28);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_1, grammarAccess.getTipoFuncionAccess().getFuncionKeyword_1());
                
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_25); 

                	newLeafNode(otherlv_2, grammarAccess.getTipoFuncionAccess().getLeftParenthesisKeyword_2());
                
            // InternalVaryGrammar.g:975:1: ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48||(LA34_0>=111 && LA34_0<=112)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVaryGrammar.g:975:2: ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:975:2: ( (lv_parametros_3_0= ruleParametro ) )
                    // InternalVaryGrammar.g:976:1: (lv_parametros_3_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:976:1: (lv_parametros_3_0= ruleParametro )
                    // InternalVaryGrammar.g:977:3: lv_parametros_3_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getTipoFuncionAccess().getParametrosParametroParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_3_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTipoFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:993:2: (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==28) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:993:4: otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTipoFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalVaryGrammar.g:997:1: ( (lv_parametros_5_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:998:1: (lv_parametros_5_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:998:1: (lv_parametros_5_0= ruleParametro )
                    	    // InternalVaryGrammar.g:999:3: lv_parametros_5_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTipoFuncionAccess().getParametrosParametroParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_5_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTipoFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_30); 

                	newLeafNode(otherlv_6, grammarAccess.getTipoFuncionAccess().getRightParenthesisKeyword_4());
                
            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_7, grammarAccess.getTipoFuncionAccess().getColonSpaceKeyword_5());
                
            // InternalVaryGrammar.g:1023:1: ( (lv_nombre_8_0= ruleEString ) )
            // InternalVaryGrammar.g:1024:1: (lv_nombre_8_0= ruleEString )
            {
            // InternalVaryGrammar.g:1024:1: (lv_nombre_8_0= ruleEString )
            // InternalVaryGrammar.g:1025:3: lv_nombre_8_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoFuncionAccess().getNombreEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_8_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_8_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoFuncion"


    // $ANTLR start "entryRuleTipoProcedimiento"
    // InternalVaryGrammar.g:1049:1: entryRuleTipoProcedimiento returns [EObject current=null] : iv_ruleTipoProcedimiento= ruleTipoProcedimiento EOF ;
    public final EObject entryRuleTipoProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoProcedimiento = null;


        try {
            // InternalVaryGrammar.g:1050:2: (iv_ruleTipoProcedimiento= ruleTipoProcedimiento EOF )
            // InternalVaryGrammar.g:1051:2: iv_ruleTipoProcedimiento= ruleTipoProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getTipoProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoProcedimiento=ruleTipoProcedimiento();

            state._fsp--;

             current =iv_ruleTipoProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoProcedimiento"


    // $ANTLR start "ruleTipoProcedimiento"
    // InternalVaryGrammar.g:1058:1: ruleTipoProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' otherlv_1= '(' ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
    public final EObject ruleTipoProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parametros_2_0 = null;

        EObject lv_parametros_4_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1061:28: ( (otherlv_0= 'procedimiento' otherlv_1= '(' ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:1062:1: (otherlv_0= 'procedimiento' otherlv_1= '(' ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:1062:1: (otherlv_0= 'procedimiento' otherlv_1= '(' ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1062:3: otherlv_0= 'procedimiento' otherlv_1= '(' ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getTipoProcedimientoAccess().getProcedimientoKeyword_0());
                
            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_25); 

                	newLeafNode(otherlv_1, grammarAccess.getTipoProcedimientoAccess().getLeftParenthesisKeyword_1());
                
            // InternalVaryGrammar.g:1070:1: ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48||(LA36_0>=111 && LA36_0<=112)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVaryGrammar.g:1070:2: ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:1070:2: ( (lv_parametros_2_0= ruleParametro ) )
                    // InternalVaryGrammar.g:1071:1: (lv_parametros_2_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:1071:1: (lv_parametros_2_0= ruleParametro )
                    // InternalVaryGrammar.g:1072:3: lv_parametros_2_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getTipoProcedimientoAccess().getParametrosParametroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_2_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTipoProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_2_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:1088:2: (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:1088:4: otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTipoProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalVaryGrammar.g:1092:1: ( (lv_parametros_4_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:1093:1: (lv_parametros_4_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:1093:1: (lv_parametros_4_0= ruleParametro )
                    	    // InternalVaryGrammar.g:1094:3: lv_parametros_4_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTipoProcedimientoAccess().getParametrosParametroParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_4_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTipoProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_4_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_30); 

                	newLeafNode(otherlv_5, grammarAccess.getTipoProcedimientoAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getTipoProcedimientoAccess().getColonSpaceKeyword_4());
                
            // InternalVaryGrammar.g:1118:1: ( (lv_nombre_7_0= ruleEString ) )
            // InternalVaryGrammar.g:1119:1: (lv_nombre_7_0= ruleEString )
            {
            // InternalVaryGrammar.g:1119:1: (lv_nombre_7_0= ruleEString )
            // InternalVaryGrammar.g:1120:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoProcedimientoAccess().getNombreEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoProcedimientoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_7_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoProcedimiento"


    // $ANTLR start "entryRuleSubproceso"
    // InternalVaryGrammar.g:1144:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // InternalVaryGrammar.g:1145:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // InternalVaryGrammar.g:1146:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubproceso"


    // $ANTLR start "ruleSubproceso"
    // InternalVaryGrammar.g:1153:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1156:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // InternalVaryGrammar.g:1157:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // InternalVaryGrammar.g:1157:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=88 && LA37_0<=92)) ) {
                alt37=1;
            }
            else if ( (LA37_0==27) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalVaryGrammar.g:1158:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1168:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Procedimiento_1=ruleProcedimiento();

                    state._fsp--;

                     
                            current = this_Procedimiento_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubproceso"


    // $ANTLR start "entryRuleSentencia"
    // InternalVaryGrammar.g:1186:1: entryRuleSentencia returns [EObject current=null] : iv_ruleSentencia= ruleSentencia EOF ;
    public final EObject entryRuleSentencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencia = null;


        try {
            // InternalVaryGrammar.g:1187:2: (iv_ruleSentencia= ruleSentencia EOF )
            // InternalVaryGrammar.g:1188:2: iv_ruleSentencia= ruleSentencia EOF
            {
             newCompositeNode(grammarAccess.getSentenciaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSentencia=ruleSentencia();

            state._fsp--;

             current =iv_ruleSentencia; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentencia"


    // $ANTLR start "ruleSentencia"
    // InternalVaryGrammar.g:1195:1: ruleSentencia returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
    public final EObject ruleSentencia() throws RecognitionException {
        EObject current = null;

        EObject this_Escribir_0 = null;

        EObject this_Leer_1 = null;

        EObject this_Bloque_2 = null;

        EObject this_FuncionFicheroAbrir_3 = null;

        EObject this_FuncionFicheroCerrar_4 = null;

        EObject this_Asignacion_5 = null;

        EObject this_Funciones_6 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1198:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // InternalVaryGrammar.g:1199:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // InternalVaryGrammar.g:1199:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt38=7;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt38=1;
                }
                break;
            case 68:
                {
                alt38=2;
                }
                break;
            case 69:
            case 70:
            case 73:
            case 74:
            case 77:
            case 80:
            case 84:
            case 85:
                {
                alt38=3;
                }
                break;
            case 33:
                {
                alt38=4;
                }
                break;
            case 34:
                {
                alt38=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt38=6;
                }
                break;
            case RULE_NOMBRE_FUN:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalVaryGrammar.g:1200:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1210:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:1220:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:1230:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:1240:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:1250:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalVaryGrammar.g:1260:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciaAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Funciones_6=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentencia"


    // $ANTLR start "entryRuleBloque"
    // InternalVaryGrammar.g:1276:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // InternalVaryGrammar.g:1277:2: (iv_ruleBloque= ruleBloque EOF )
            // InternalVaryGrammar.g:1278:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBloque"


    // $ANTLR start "ruleBloque"
    // InternalVaryGrammar.g:1285:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_Mientras_1= ruleMientras | this_Repetir_2= ruleRepetir | this_Desde_3= ruleDesde | this_Segun_4= ruleSegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_Mientras_1 = null;

        EObject this_Repetir_2 = null;

        EObject this_Desde_3 = null;

        EObject this_Segun_4 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1288:28: ( (this_Si_0= ruleSi | this_Mientras_1= ruleMientras | this_Repetir_2= ruleRepetir | this_Desde_3= ruleDesde | this_Segun_4= ruleSegun ) )
            // InternalVaryGrammar.g:1289:1: (this_Si_0= ruleSi | this_Mientras_1= ruleMientras | this_Repetir_2= ruleRepetir | this_Desde_3= ruleDesde | this_Segun_4= ruleSegun )
            {
            // InternalVaryGrammar.g:1289:1: (this_Si_0= ruleSi | this_Mientras_1= ruleMientras | this_Repetir_2= ruleRepetir | this_Desde_3= ruleDesde | this_Segun_4= ruleSegun )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 69:
            case 70:
                {
                alt39=1;
                }
                break;
            case 73:
            case 74:
                {
                alt39=2;
                }
                break;
            case 77:
                {
                alt39=3;
                }
                break;
            case 80:
                {
                alt39=4;
                }
                break;
            case 84:
            case 85:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalVaryGrammar.g:1290:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1300:5: this_Mientras_1= ruleMientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Mientras_1=ruleMientras();

                    state._fsp--;

                     
                            current = this_Mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:1310:5: this_Repetir_2= ruleRepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Repetir_2=ruleRepetir();

                    state._fsp--;

                     
                            current = this_Repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:1320:5: this_Desde_3= ruleDesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Desde_3=ruleDesde();

                    state._fsp--;

                     
                            current = this_Desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:1330:5: this_Segun_4= ruleSegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Segun_4=ruleSegun();

                    state._fsp--;

                     
                            current = this_Segun_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBloque"


    // $ANTLR start "entryRuleDeclaracion"
    // InternalVaryGrammar.g:1346:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // InternalVaryGrammar.g:1347:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // InternalVaryGrammar.g:1348:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracion"


    // $ANTLR start "ruleDeclaracion"
    // InternalVaryGrammar.g:1355:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionBasica_0= ruleDeclaracionBasica | this_DeclaracionDefinida_1= ruleDeclaracionDefinida ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionBasica_0 = null;

        EObject this_DeclaracionDefinida_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1358:28: ( (this_DeclaracionBasica_0= ruleDeclaracionBasica | this_DeclaracionDefinida_1= ruleDeclaracionDefinida ) )
            // InternalVaryGrammar.g:1359:1: (this_DeclaracionBasica_0= ruleDeclaracionBasica | this_DeclaracionDefinida_1= ruleDeclaracionDefinida )
            {
            // InternalVaryGrammar.g:1359:1: (this_DeclaracionBasica_0= ruleDeclaracionBasica | this_DeclaracionDefinida_1= ruleDeclaracionDefinida )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=88 && LA40_0<=92)) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID||LA40_0==RULE_STRING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalVaryGrammar.g:1360:5: this_DeclaracionBasica_0= ruleDeclaracionBasica
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionBasicaParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DeclaracionBasica_0=ruleDeclaracionBasica();

                    state._fsp--;

                     
                            current = this_DeclaracionBasica_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1370:5: this_DeclaracionDefinida_1= ruleDeclaracionDefinida
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionDefinidaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DeclaracionDefinida_1=ruleDeclaracionDefinida();

                    state._fsp--;

                     
                            current = this_DeclaracionDefinida_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracion"


    // $ANTLR start "entryRuleFuncionFicheroAbrir"
    // InternalVaryGrammar.g:1386:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // InternalVaryGrammar.g:1387:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // InternalVaryGrammar.g:1388:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncionFicheroAbrir"


    // $ANTLR start "ruleFuncionFicheroAbrir"
    // InternalVaryGrammar.g:1395:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variable_1_0 = null;

        AntlrDatatypeRuleToken lv_modo_3_0 = null;

        EObject lv_variable_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1398:28: ( (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' ) )
            // InternalVaryGrammar.g:1399:1: (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:1399:1: (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' )
            // InternalVaryGrammar.g:1399:3: otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            // InternalVaryGrammar.g:1403:1: ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) )
            // InternalVaryGrammar.g:1403:2: ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) )
            {
            // InternalVaryGrammar.g:1403:2: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1404:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1404:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:1405:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_variable_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_33); 

                	newLeafNode(otherlv_2, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_1_1());
                
            // InternalVaryGrammar.g:1425:1: ( (lv_modo_3_0= ruleModoApertura ) )
            // InternalVaryGrammar.g:1426:1: (lv_modo_3_0= ruleModoApertura )
            {
            // InternalVaryGrammar.g:1426:1: (lv_modo_3_0= ruleModoApertura )
            // InternalVaryGrammar.g:1427:3: lv_modo_3_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_1_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_modo_3_0=ruleModoApertura();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		set(
                   			current, 
                   			"modo",
                    		lv_modo_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.ModoApertura");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_4, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_1_3());
                
            // InternalVaryGrammar.g:1447:1: ( (lv_variable_5_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1448:1: (lv_variable_5_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1448:1: (lv_variable_5_0= rulePrimaria )
            // InternalVaryGrammar.g:1449:3: lv_variable_5_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_1_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_variable_5_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_5_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getFuncionFicheroAbrirAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncionFicheroAbrir"


    // $ANTLR start "entryRuleFuncionFicheroCerrar"
    // InternalVaryGrammar.g:1477:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // InternalVaryGrammar.g:1478:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // InternalVaryGrammar.g:1479:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncionFicheroCerrar"


    // $ANTLR start "ruleFuncionFicheroCerrar"
    // InternalVaryGrammar.g:1486:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1489:28: ( (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' ) )
            // InternalVaryGrammar.g:1490:1: (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' )
            {
            // InternalVaryGrammar.g:1490:1: (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' )
            // InternalVaryGrammar.g:1490:3: otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            // InternalVaryGrammar.g:1494:1: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1495:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1495:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:1496:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_variable_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroCerrarRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getFuncionFicheroCerrarAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncionFicheroCerrar"


    // $ANTLR start "entryRuleModoApertura"
    // InternalVaryGrammar.g:1524:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // InternalVaryGrammar.g:1525:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // InternalVaryGrammar.g:1526:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModoApertura"


    // $ANTLR start "ruleModoApertura"
    // InternalVaryGrammar.g:1533:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1536:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // InternalVaryGrammar.g:1537:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // InternalVaryGrammar.g:1537:1: (kw= 'escritura' | kw= 'lectura' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            else if ( (LA41_0==36) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalVaryGrammar.g:1538:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1545:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getLecturaKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModoApertura"


    // $ANTLR start "entryRuleNombreInterna"
    // InternalVaryGrammar.g:1558:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // InternalVaryGrammar.g:1559:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // InternalVaryGrammar.g:1560:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombreInterna"


    // $ANTLR start "ruleNombreInterna"
    // InternalVaryGrammar.g:1567:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1570:28: ( (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' ) )
            // InternalVaryGrammar.g:1571:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' )
            {
            // InternalVaryGrammar.g:1571:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' )
            int alt42=10;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt42=1;
                }
                break;
            case 38:
                {
                alt42=2;
                }
                break;
            case 39:
                {
                alt42=3;
                }
                break;
            case 40:
                {
                alt42=4;
                }
                break;
            case 41:
                {
                alt42=5;
                }
                break;
            case 42:
                {
                alt42=6;
                }
                break;
            case 43:
                {
                alt42=7;
                }
                break;
            case 44:
                {
                alt42=8;
                }
                break;
            case 45:
                {
                alt42=9;
                }
                break;
            case 46:
                {
                alt42=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalVaryGrammar.g:1572:2: kw= 'cos('
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1579:2: kw= 'cuadrado('
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:1586:2: kw= 'exp('
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:1593:2: kw= 'ln('
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:1600:2: kw= 'log('
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:1607:2: kw= 'sen('
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // InternalVaryGrammar.g:1614:2: kw= 'sqrt('
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // InternalVaryGrammar.g:1621:2: kw= 'longitud('
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // InternalVaryGrammar.g:1628:2: kw= 'concatena('
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getConcatenaKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // InternalVaryGrammar.g:1635:2: kw= 'copiar('
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCopiarKeyword_9()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombreInterna"


    // $ANTLR start "entryRuleEInt"
    // InternalVaryGrammar.g:1648:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVaryGrammar.g:1649:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalVaryGrammar.g:1650:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalVaryGrammar.g:1657:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1660:28: (this_INT_0= RULE_INT )
            // InternalVaryGrammar.g:1661:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalVaryGrammar.g:1676:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalVaryGrammar.g:1677:2: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalVaryGrammar.g:1678:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalVaryGrammar.g:1685:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1688:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) )
            // InternalVaryGrammar.g:1689:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            {
            // InternalVaryGrammar.g:1689:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            // InternalVaryGrammar.g:1689:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_35); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,47,FollowSets000.FOLLOW_36); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_37); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // InternalVaryGrammar.g:1709:1: ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=48 && LA44_0<=49)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVaryGrammar.g:1709:2: (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT
                    {
                    // InternalVaryGrammar.g:1709:2: (kw= 'E' | kw= 'e' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==48) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==49) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalVaryGrammar.g:1710:2: kw= 'E'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_36); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // InternalVaryGrammar.g:1717:2: kw= 'e'
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_36); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    		current.merge(this_INT_5);
                        
                     
                        newLeafNode(this_INT_5, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleTipo"
    // InternalVaryGrammar.g:1737:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalVaryGrammar.g:1738:2: (iv_ruleTipo= ruleTipo EOF )
            // InternalVaryGrammar.g:1739:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalVaryGrammar.g:1746:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoBasico_1= ruleTipoBasico ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoBasico_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1749:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoBasico_1= ruleTipoBasico ) )
            // InternalVaryGrammar.g:1750:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoBasico_1= ruleTipoBasico )
            {
            // InternalVaryGrammar.g:1750:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoBasico_1= ruleTipoBasico )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ID||LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=88 && LA45_0<=92)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalVaryGrammar.g:1751:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1761:5: this_TipoBasico_1= ruleTipoBasico
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoBasicoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoBasico_1=ruleTipoBasico();

                    state._fsp--;

                     
                            current = this_TipoBasico_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleTipoDefinido"
    // InternalVaryGrammar.g:1777:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // InternalVaryGrammar.g:1778:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // InternalVaryGrammar.g:1779:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoDefinido"


    // $ANTLR start "ruleTipoDefinido"
    // InternalVaryGrammar.g:1786:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_nombre_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1789:28: ( ( (lv_nombre_0_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1790:1: ( (lv_nombre_0_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:1790:1: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:1791:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:1791:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:1792:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getNombreEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoDefinidoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDefinido"


    // $ANTLR start "entryRuleTipoBasico"
    // InternalVaryGrammar.g:1816:1: entryRuleTipoBasico returns [EObject current=null] : iv_ruleTipoBasico= ruleTipoBasico EOF ;
    public final EObject entryRuleTipoBasico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoBasico = null;


        try {
            // InternalVaryGrammar.g:1817:2: (iv_ruleTipoBasico= ruleTipoBasico EOF )
            // InternalVaryGrammar.g:1818:2: iv_ruleTipoBasico= ruleTipoBasico EOF
            {
             newCompositeNode(grammarAccess.getTipoBasicoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoBasico=ruleTipoBasico();

            state._fsp--;

             current =iv_ruleTipoBasico; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoBasico"


    // $ANTLR start "ruleTipoBasico"
    // InternalVaryGrammar.g:1825:1: ruleTipoBasico returns [EObject current=null] : ( (lv_nombre_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoBasico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1828:28: ( ( (lv_nombre_0_0= ruleTipoVariable ) ) )
            // InternalVaryGrammar.g:1829:1: ( (lv_nombre_0_0= ruleTipoVariable ) )
            {
            // InternalVaryGrammar.g:1829:1: ( (lv_nombre_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:1830:1: (lv_nombre_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:1830:1: (lv_nombre_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:1831:3: lv_nombre_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoBasicoAccess().getNombreTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoBasicoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoBasico"


    // $ANTLR start "entryRuleConstante"
    // InternalVaryGrammar.g:1855:1: entryRuleConstante returns [EObject current=null] : iv_ruleConstante= ruleConstante EOF ;
    public final EObject entryRuleConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstante = null;


        try {
            // InternalVaryGrammar.g:1856:2: (iv_ruleConstante= ruleConstante EOF )
            // InternalVaryGrammar.g:1857:2: iv_ruleConstante= ruleConstante EOF
            {
             newCompositeNode(grammarAccess.getConstanteRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstante=ruleConstante();

            state._fsp--;

             current =iv_ruleConstante; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalVaryGrammar.g:1864:1: ruleConstante returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstante() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1867:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // InternalVaryGrammar.g:1868:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // InternalVaryGrammar.g:1868:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // InternalVaryGrammar.g:1868:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // InternalVaryGrammar.g:1868:2: ( (lv_variable_0_0= ruleVariable ) )
            // InternalVaryGrammar.g:1869:1: (lv_variable_0_0= ruleVariable )
            {
            // InternalVaryGrammar.g:1869:1: (lv_variable_0_0= ruleVariable )
            // InternalVaryGrammar.g:1870:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstanteAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstanteRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_1, grammarAccess.getConstanteAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:1890:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1891:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1891:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:1892:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstanteAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstanteRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRuleVector"
    // InternalVaryGrammar.g:1916:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalVaryGrammar.g:1917:2: (iv_ruleVector= ruleVector EOF )
            // InternalVaryGrammar.g:1918:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalVaryGrammar.g:1925:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_valor_2_0 = null;

        EObject lv_tipo_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1928:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:1929:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:1929:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1929:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_39); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // InternalVaryGrammar.g:1937:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1938:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1938:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:1939:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_40);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_41); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_42); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // InternalVaryGrammar.g:1963:1: ( (lv_tipo_5_0= ruleTipo ) )
            // InternalVaryGrammar.g:1964:1: (lv_tipo_5_0= ruleTipo )
            {
            // InternalVaryGrammar.g:1964:1: (lv_tipo_5_0= ruleTipo )
            // InternalVaryGrammar.g:1965:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_5_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_5_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // InternalVaryGrammar.g:1985:1: ( (lv_nombre_7_0= ruleEString ) )
            // InternalVaryGrammar.g:1986:1: (lv_nombre_7_0= ruleEString )
            {
            // InternalVaryGrammar.g:1986:1: (lv_nombre_7_0= ruleEString )
            // InternalVaryGrammar.g:1987:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_7_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleMatriz"
    // InternalVaryGrammar.g:2011:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // InternalVaryGrammar.g:2012:2: (iv_ruleMatriz= ruleMatriz EOF )
            // InternalVaryGrammar.g:2013:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatriz"


    // $ANTLR start "ruleMatriz"
    // InternalVaryGrammar.g:2020:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
    public final EObject ruleMatriz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_valor_2_0 = null;

        EObject lv_valor_4_0 = null;

        EObject lv_tipo_7_0 = null;

        AntlrDatatypeRuleToken lv_nombre_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2023:28: ( (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:2024:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:2024:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // InternalVaryGrammar.g:2024:3: otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,55,FollowSets000.FOLLOW_39); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // InternalVaryGrammar.g:2032:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2033:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2033:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:2034:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_43);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // InternalVaryGrammar.g:2054:1: ( (lv_valor_4_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2055:1: (lv_valor_4_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2055:1: (lv_valor_4_0= rulePrimaria )
            // InternalVaryGrammar.g:2056:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_40);
            lv_valor_4_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_41); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_42); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // InternalVaryGrammar.g:2080:1: ( (lv_tipo_7_0= ruleTipo ) )
            // InternalVaryGrammar.g:2081:1: (lv_tipo_7_0= ruleTipo )
            {
            // InternalVaryGrammar.g:2081:1: (lv_tipo_7_0= ruleTipo )
            // InternalVaryGrammar.g:2082:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_7_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_7_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // InternalVaryGrammar.g:2102:1: ( (lv_nombre_9_0= ruleEString ) )
            // InternalVaryGrammar.g:2103:1: (lv_nombre_9_0= ruleEString )
            {
            // InternalVaryGrammar.g:2103:1: (lv_nombre_9_0= ruleEString )
            // InternalVaryGrammar.g:2104:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_9_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatriz"


    // $ANTLR start "entryRuleRegistro"
    // InternalVaryGrammar.g:2128:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalVaryGrammar.g:2129:2: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalVaryGrammar.g:2130:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // InternalVaryGrammar.g:2137:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_campos_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_campos_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2140:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_campos_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' ) )
            // InternalVaryGrammar.g:2141:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_campos_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' )
            {
            // InternalVaryGrammar.g:2141:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_campos_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' )
            // InternalVaryGrammar.g:2141:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_campos_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // InternalVaryGrammar.g:2145:1: ( (lv_nombre_1_0= ruleEString ) )
            // InternalVaryGrammar.g:2146:1: (lv_nombre_1_0= ruleEString )
            {
            // InternalVaryGrammar.g:2146:1: (lv_nombre_1_0= ruleEString )
            // InternalVaryGrammar.g:2147:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_42);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2163:2: ( (lv_campos_2_0= ruleDeclaracion ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID||LA46_0==RULE_STRING||(LA46_0>=88 && LA46_0<=92)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalVaryGrammar.g:2164:1: (lv_campos_2_0= ruleDeclaracion )
            	    {
            	    // InternalVaryGrammar.g:2164:1: (lv_campos_2_0= ruleDeclaracion )
            	    // InternalVaryGrammar.g:2165:3: lv_campos_2_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getCamposDeclaracionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_campos_2_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"campos",
            	            		lv_campos_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getRegistroAccess().getFin_registroKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleArchivo"
    // InternalVaryGrammar.g:2193:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // InternalVaryGrammar.g:2194:2: (iv_ruleArchivo= ruleArchivo EOF )
            // InternalVaryGrammar.g:2195:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchivo"


    // $ANTLR start "ruleArchivo"
    // InternalVaryGrammar.g:2202:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2205:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:2206:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:2206:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // InternalVaryGrammar.g:2206:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_42); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // InternalVaryGrammar.g:2210:1: ( (lv_tipo_1_0= ruleTipo ) )
            // InternalVaryGrammar.g:2211:1: (lv_tipo_1_0= ruleTipo )
            {
            // InternalVaryGrammar.g:2211:1: (lv_tipo_1_0= ruleTipo )
            // InternalVaryGrammar.g:2212:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:2232:1: ( (lv_nombre_3_0= ruleEString ) )
            // InternalVaryGrammar.g:2233:1: (lv_nombre_3_0= ruleEString )
            {
            // InternalVaryGrammar.g:2233:1: (lv_nombre_3_0= ruleEString )
            // InternalVaryGrammar.g:2234:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchivo"


    // $ANTLR start "entryRuleEnumerado"
    // InternalVaryGrammar.g:2258:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // InternalVaryGrammar.g:2259:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // InternalVaryGrammar.g:2260:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerado"


    // $ANTLR start "ruleEnumerado"
    // InternalVaryGrammar.g:2267:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_posiblesValores_3_0 = null;

        EObject lv_posiblesValores_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2270:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // InternalVaryGrammar.g:2271:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // InternalVaryGrammar.g:2271:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // InternalVaryGrammar.g:2271:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // InternalVaryGrammar.g:2271:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2272:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2272:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2273:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_45); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalVaryGrammar.g:2297:1: ( ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )* )
            // InternalVaryGrammar.g:2297:2: ( (lv_posiblesValores_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )*
            {
            // InternalVaryGrammar.g:2297:2: ( (lv_posiblesValores_3_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2298:1: (lv_posiblesValores_3_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2298:1: (lv_posiblesValores_3_0= rulePrimaria )
            // InternalVaryGrammar.g:2299:3: lv_posiblesValores_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getPosiblesValoresPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
            lv_posiblesValores_3_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		add(
                   			current, 
                   			"posiblesValores",
                    		lv_posiblesValores_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2315:2: (otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==28) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalVaryGrammar.g:2315:4: otherlv_4= ',' ( (lv_posiblesValores_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_31); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // InternalVaryGrammar.g:2319:1: ( (lv_posiblesValores_5_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:2320:1: (lv_posiblesValores_5_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:2320:1: (lv_posiblesValores_5_0= rulePrimaria )
            	    // InternalVaryGrammar.g:2321:3: lv_posiblesValores_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getPosiblesValoresPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    lv_posiblesValores_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"posiblesValores",
            	            		lv_posiblesValores_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,61,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumeradoAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerado"


    // $ANTLR start "entryRuleSubrango"
    // InternalVaryGrammar.g:2349:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // InternalVaryGrammar.g:2350:2: (iv_ruleSubrango= ruleSubrango EOF )
            // InternalVaryGrammar.g:2351:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrango"


    // $ANTLR start "ruleSubrango"
    // InternalVaryGrammar.g:2358:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2361:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // InternalVaryGrammar.g:2362:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // InternalVaryGrammar.g:2362:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==50) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_INT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==RULE_ID||LA48_3==RULE_STRING) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==RULE_ID) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==50) ) {
                    int LA48_3 = input.LA(3);

                    if ( (LA48_3==RULE_INT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_3==RULE_ID||LA48_3==RULE_STRING) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalVaryGrammar.g:2363:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:2373:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SubrangoEnumerado_1=ruleSubrangoEnumerado();

                    state._fsp--;

                     
                            current = this_SubrangoEnumerado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrango"


    // $ANTLR start "entryRuleSubrangoNumerico"
    // InternalVaryGrammar.g:2389:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // InternalVaryGrammar.g:2390:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // InternalVaryGrammar.g:2391:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrangoNumerico"


    // $ANTLR start "ruleSubrangoNumerico"
    // InternalVaryGrammar.g:2398:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2401:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // InternalVaryGrammar.g:2402:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // InternalVaryGrammar.g:2402:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // InternalVaryGrammar.g:2402:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // InternalVaryGrammar.g:2402:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2403:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2403:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2404:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_36); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:2424:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // InternalVaryGrammar.g:2424:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // InternalVaryGrammar.g:2424:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // InternalVaryGrammar.g:2425:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // InternalVaryGrammar.g:2425:1: (lv_limite_inf_2_0= ruleEInt )
            // InternalVaryGrammar.g:2426:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_47);
            lv_limite_inf_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,62,FollowSets000.FOLLOW_36); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // InternalVaryGrammar.g:2446:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // InternalVaryGrammar.g:2447:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // InternalVaryGrammar.g:2447:1: (lv_limite_sup_4_0= ruleEInt )
            // InternalVaryGrammar.g:2448:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_limite_sup_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrangoNumerico"


    // $ANTLR start "entryRuleSubrangoEnumerado"
    // InternalVaryGrammar.g:2472:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // InternalVaryGrammar.g:2473:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // InternalVaryGrammar.g:2474:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrangoEnumerado"


    // $ANTLR start "ruleSubrangoEnumerado"
    // InternalVaryGrammar.g:2481:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2484:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:2485:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:2485:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:2485:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:2485:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2486:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2486:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2487:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:2507:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // InternalVaryGrammar.g:2507:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:2507:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // InternalVaryGrammar.g:2508:1: (lv_limite_inf_2_0= ruleEString )
            {
            // InternalVaryGrammar.g:2508:1: (lv_limite_inf_2_0= ruleEString )
            // InternalVaryGrammar.g:2509:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_47);
            lv_limite_inf_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,62,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // InternalVaryGrammar.g:2529:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // InternalVaryGrammar.g:2530:1: (lv_limite_sup_4_0= ruleEString )
            {
            // InternalVaryGrammar.g:2530:1: (lv_limite_sup_4_0= ruleEString )
            // InternalVaryGrammar.g:2531:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_limite_sup_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrangoEnumerado"


    // $ANTLR start "entryRuleInicio"
    // InternalVaryGrammar.g:2555:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // InternalVaryGrammar.g:2556:2: (iv_ruleInicio= ruleInicio EOF )
            // InternalVaryGrammar.g:2557:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInicio"


    // $ANTLR start "ruleInicio"
    // InternalVaryGrammar.g:2564:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaraciones_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_principal' ) ;
    public final EObject ruleInicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaraciones_3_0 = null;

        EObject lv_sentencias_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2567:28: ( (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaraciones_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_principal' ) )
            // InternalVaryGrammar.g:2568:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaraciones_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_principal' )
            {
            // InternalVaryGrammar.g:2568:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaraciones_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_principal' )
            // InternalVaryGrammar.g:2568:3: otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaraciones_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_principal'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_48); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getPrincipalKeyword_0());
                
            // InternalVaryGrammar.g:2572:1: ()
            // InternalVaryGrammar.g:2573:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_49); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // InternalVaryGrammar.g:2582:1: ( (lv_declaraciones_3_0= ruleDeclaracion ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID||LA49_0==RULE_STRING||(LA49_0>=88 && LA49_0<=92)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalVaryGrammar.g:2583:1: (lv_declaraciones_3_0= ruleDeclaracion )
            	    {
            	    // InternalVaryGrammar.g:2583:1: (lv_declaraciones_3_0= ruleDeclaracion )
            	    // InternalVaryGrammar.g:2584:3: lv_declaraciones_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionesDeclaracionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_declaraciones_3_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaraciones",
            	            		lv_declaraciones_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,64,FollowSets000.FOLLOW_50); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_4());
                
            // InternalVaryGrammar.g:2604:1: ( (lv_sentencias_5_0= ruleSentencia ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_NOMBRE_FUN)||LA50_0==RULE_STRING||(LA50_0>=33 && LA50_0<=34)||(LA50_0>=37 && LA50_0<=46)||(LA50_0>=67 && LA50_0<=70)||(LA50_0>=73 && LA50_0<=74)||LA50_0==77||LA50_0==80||(LA50_0>=84 && LA50_0<=85)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalVaryGrammar.g:2605:1: (lv_sentencias_5_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:2605:1: (lv_sentencias_5_0= ruleSentencia )
            	    // InternalVaryGrammar.g:2606:3: lv_sentencias_5_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getSentenciasSentenciaParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_sentencias_5_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_6=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getInicioAccess().getFin_principalKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInicio"


    // $ANTLR start "entryRuleEString"
    // InternalVaryGrammar.g:2634:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVaryGrammar.g:2635:2: (iv_ruleEString= ruleEString EOF )
            // InternalVaryGrammar.g:2636:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVaryGrammar.g:2643:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2646:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVaryGrammar.g:2647:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVaryGrammar.g:2647:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalVaryGrammar.g:2647:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:2655:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDeclaracionBasica"
    // InternalVaryGrammar.g:2670:1: entryRuleDeclaracionBasica returns [EObject current=null] : iv_ruleDeclaracionBasica= ruleDeclaracionBasica EOF ;
    public final EObject entryRuleDeclaracionBasica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionBasica = null;


        try {
            // InternalVaryGrammar.g:2671:2: (iv_ruleDeclaracionBasica= ruleDeclaracionBasica EOF )
            // InternalVaryGrammar.g:2672:2: iv_ruleDeclaracionBasica= ruleDeclaracionBasica EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionBasicaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaracionBasica=ruleDeclaracionBasica();

            state._fsp--;

             current =iv_ruleDeclaracionBasica; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracionBasica"


    // $ANTLR start "ruleDeclaracionBasica"
    // InternalVaryGrammar.g:2679:1: ruleDeclaracionBasica returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionBasica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_variables_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2682:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* ) )
            // InternalVaryGrammar.g:2683:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* )
            {
            // InternalVaryGrammar.g:2683:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* )
            // InternalVaryGrammar.g:2683:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
            {
            // InternalVaryGrammar.g:2683:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:2684:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:2684:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:2685:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionBasicaAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionBasicaRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionBasicaAccess().getColonSpaceKeyword_1());
                
            // InternalVaryGrammar.g:2705:1: ( (lv_variables_2_0= ruleVariable ) )
            // InternalVaryGrammar.g:2706:1: (lv_variables_2_0= ruleVariable )
            {
            // InternalVaryGrammar.g:2706:1: (lv_variables_2_0= ruleVariable )
            // InternalVaryGrammar.g:2707:3: lv_variables_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionBasicaAccess().getVariablesVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
            lv_variables_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionBasicaRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2723:2: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalVaryGrammar.g:2723:4: otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionBasicaAccess().getCommaKeyword_3_0());
            	        
            	    // InternalVaryGrammar.g:2727:1: ( (lv_variables_4_0= ruleVariable ) )
            	    // InternalVaryGrammar.g:2728:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // InternalVaryGrammar.g:2728:1: (lv_variables_4_0= ruleVariable )
            	    // InternalVaryGrammar.g:2729:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionBasicaAccess().getVariablesVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionBasicaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracionBasica"


    // $ANTLR start "entryRuleDeclaracionDefinida"
    // InternalVaryGrammar.g:2753:1: entryRuleDeclaracionDefinida returns [EObject current=null] : iv_ruleDeclaracionDefinida= ruleDeclaracionDefinida EOF ;
    public final EObject entryRuleDeclaracionDefinida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionDefinida = null;


        try {
            // InternalVaryGrammar.g:2754:2: (iv_ruleDeclaracionDefinida= ruleDeclaracionDefinida EOF )
            // InternalVaryGrammar.g:2755:2: iv_ruleDeclaracionDefinida= ruleDeclaracionDefinida EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionDefinidaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaracionDefinida=ruleDeclaracionDefinida();

            state._fsp--;

             current =iv_ruleDeclaracionDefinida; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracionDefinida"


    // $ANTLR start "ruleDeclaracionDefinida"
    // InternalVaryGrammar.g:2762:1: ruleDeclaracionDefinida returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionDefinida() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_variables_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2765:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* ) )
            // InternalVaryGrammar.g:2766:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* )
            {
            // InternalVaryGrammar.g:2766:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )* )
            // InternalVaryGrammar.g:2766:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variables_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
            {
            // InternalVaryGrammar.g:2766:2: ( (lv_tipo_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2767:1: (lv_tipo_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2767:1: (lv_tipo_0_0= ruleEString )
            // InternalVaryGrammar.g:2768:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionDefinidaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionDefinidaRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionDefinidaAccess().getColonSpaceKeyword_1());
                
            // InternalVaryGrammar.g:2788:1: ( (lv_variables_2_0= ruleVariable ) )
            // InternalVaryGrammar.g:2789:1: (lv_variables_2_0= ruleVariable )
            {
            // InternalVaryGrammar.g:2789:1: (lv_variables_2_0= ruleVariable )
            // InternalVaryGrammar.g:2790:3: lv_variables_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionDefinidaAccess().getVariablesVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
            lv_variables_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionDefinidaRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2806:2: (otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==28) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalVaryGrammar.g:2806:4: otherlv_3= ',' ( (lv_variables_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionDefinidaAccess().getCommaKeyword_3_0());
            	        
            	    // InternalVaryGrammar.g:2810:1: ( (lv_variables_4_0= ruleVariable ) )
            	    // InternalVaryGrammar.g:2811:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // InternalVaryGrammar.g:2811:1: (lv_variables_4_0= ruleVariable )
            	    // InternalVaryGrammar.g:2812:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionDefinidaAccess().getVariablesVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_51);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionDefinidaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracionDefinida"


    // $ANTLR start "entryRuleAsignacion"
    // InternalVaryGrammar.g:2836:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // InternalVaryGrammar.g:2837:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // InternalVaryGrammar.g:2838:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacion"


    // $ANTLR start "ruleAsignacion"
    // InternalVaryGrammar.g:2845:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2848:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // InternalVaryGrammar.g:2849:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // InternalVaryGrammar.g:2849:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==47||LA54_1==52) ) {
                    alt54=2;
                }
                else if ( (LA54_1==66) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_ID) ) {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==47||LA54_2==52) ) {
                    alt54=2;
                }
                else if ( (LA54_2==66) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalVaryGrammar.g:2850:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:2860:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AsignacionCompleja_1=ruleAsignacionCompleja();

                    state._fsp--;

                     
                            current = this_AsignacionCompleja_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacion"


    // $ANTLR start "entryRuleAsignacionNormal"
    // InternalVaryGrammar.g:2876:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // InternalVaryGrammar.g:2877:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // InternalVaryGrammar.g:2878:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacionNormal"


    // $ANTLR start "ruleAsignacionNormal"
    // InternalVaryGrammar.g:2885:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2888:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:2889:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:2889:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:2889:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:2889:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2890:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2890:1: (lv_valor_asignacion_0_0= ruleEString )
            // InternalVaryGrammar.g:2891:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_52);
            lv_valor_asignacion_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"valor_asignacion",
                    		lv_valor_asignacion_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,66,FollowSets000.FOLLOW_53); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // InternalVaryGrammar.g:2911:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:2912:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:2912:1: (lv_operador_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:2913:3: lv_operador_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_operador_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacionNormal"


    // $ANTLR start "entryRuleAsignacionCompleja"
    // InternalVaryGrammar.g:2937:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // InternalVaryGrammar.g:2938:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // InternalVaryGrammar.g:2939:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacionCompleja"


    // $ANTLR start "ruleAsignacionCompleja"
    // InternalVaryGrammar.g:2946:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2949:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:2950:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:2950:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:2950:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:2950:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // InternalVaryGrammar.g:2951:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // InternalVaryGrammar.g:2951:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // InternalVaryGrammar.g:2952:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_52);
            lv_valor_asignacion_0_0=ruleVariablesComplejas();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"valor_asignacion",
                    		lv_valor_asignacion_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.VariablesComplejas");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,66,FollowSets000.FOLLOW_53); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // InternalVaryGrammar.g:2972:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:2973:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:2973:1: (lv_operador_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:2974:3: lv_operador_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_operador_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacionCompleja"


    // $ANTLR start "entryRuleEscribir"
    // InternalVaryGrammar.g:2998:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // InternalVaryGrammar.g:2999:2: (iv_ruleEscribir= ruleEscribir EOF )
            // InternalVaryGrammar.g:3000:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscribir"


    // $ANTLR start "ruleEscribir"
    // InternalVaryGrammar.g:3007:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operador_1_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3010:28: ( (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' ) )
            // InternalVaryGrammar.g:3011:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' )
            {
            // InternalVaryGrammar.g:3011:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' )
            // InternalVaryGrammar.g:3011:3: otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            // InternalVaryGrammar.g:3015:1: ( (lv_operador_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:3016:1: (lv_operador_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:3016:1: (lv_operador_1_0= rulePrimaria )
            // InternalVaryGrammar.g:3017:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_26);
            lv_operador_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:3033:2: (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==28) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalVaryGrammar.g:3033:4: otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_53); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEscribirAccess().getCommaKeyword_2_0());
            	        
            	    // InternalVaryGrammar.g:3037:1: ( (lv_operador_3_0= ruleOperacionCompleta ) )
            	    // InternalVaryGrammar.g:3038:1: (lv_operador_3_0= ruleOperacionCompleta )
            	    {
            	    // InternalVaryGrammar.g:3038:1: (lv_operador_3_0= ruleOperacionCompleta )
            	    // InternalVaryGrammar.g:3039:3: lv_operador_3_0= ruleOperacionCompleta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionCompletaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_operador_3_0=ruleOperacionCompleta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getEscribirAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscribir"


    // $ANTLR start "entryRuleLeer"
    // InternalVaryGrammar.g:3067:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // InternalVaryGrammar.g:3068:2: (iv_ruleLeer= ruleLeer EOF )
            // InternalVaryGrammar.g:3069:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeer"


    // $ANTLR start "ruleLeer"
    // InternalVaryGrammar.g:3076:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3079:28: ( (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) )
            // InternalVaryGrammar.g:3080:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            {
            // InternalVaryGrammar.g:3080:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            // InternalVaryGrammar.g:3080:3: otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            // InternalVaryGrammar.g:3084:1: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:3085:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:3085:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:3086:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_26);
            lv_variable_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:3102:2: (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==28) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalVaryGrammar.g:3102:4: otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_31); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeerAccess().getCommaKeyword_2_0());
            	        
            	    // InternalVaryGrammar.g:3106:1: ( (lv_variable_3_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:3107:1: (lv_variable_3_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:3107:1: (lv_variable_3_0= rulePrimaria )
            	    // InternalVaryGrammar.g:3108:3: lv_variable_3_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_variable_3_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getLeerAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeer"


    // $ANTLR start "entryRuleSi"
    // InternalVaryGrammar.g:3136:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // InternalVaryGrammar.g:3137:2: (iv_ruleSi= ruleSi EOF )
            // InternalVaryGrammar.g:3138:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSi"


    // $ANTLR start "ruleSi"
    // InternalVaryGrammar.g:3145:1: ruleSi returns [EObject current=null] : ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencia ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) ;
    public final EObject ruleSi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_condicion_3_0 = null;

        EObject lv_sentencias_6_0 = null;

        EObject lv_devuelve_7_0 = null;

        EObject lv_sino_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3148:28: ( ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencia ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) )
            // InternalVaryGrammar.g:3149:1: ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencia ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            {
            // InternalVaryGrammar.g:3149:1: ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencia ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            // InternalVaryGrammar.g:3149:2: ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencia ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si'
            {
            // InternalVaryGrammar.g:3149:2: ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==69) ) {
                alt57=1;
            }
            else if ( (LA57_0==70) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalVaryGrammar.g:3149:3: (otherlv_0= 'si' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:3149:3: (otherlv_0= 'si' otherlv_1= '(' )
                    // InternalVaryGrammar.g:3149:5: otherlv_0= 'si' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_29); 

                        	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_1, grammarAccess.getSiAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3158:7: otherlv_2= 'si('
                    {
                    otherlv_2=(Token)match(input,70,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getSiKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3162:2: ( (lv_condicion_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3163:1: (lv_condicion_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3163:1: (lv_condicion_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3164:3: lv_condicion_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getCondicionOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_condicion_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_54); 

                	newLeafNode(otherlv_4, grammarAccess.getSiAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,71,FollowSets000.FOLLOW_55); 

                	newLeafNode(otherlv_5, grammarAccess.getSiAccess().getEntoncesKeyword_3());
                
            // InternalVaryGrammar.g:3188:1: ( (lv_sentencias_6_0= ruleSentencia ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_NOMBRE_FUN)||LA58_0==RULE_STRING||(LA58_0>=33 && LA58_0<=34)||(LA58_0>=37 && LA58_0<=46)||(LA58_0>=67 && LA58_0<=70)||(LA58_0>=73 && LA58_0<=74)||LA58_0==77||LA58_0==80||(LA58_0>=84 && LA58_0<=85)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalVaryGrammar.g:3189:1: (lv_sentencias_6_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3189:1: (lv_sentencias_6_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3190:3: lv_sentencias_6_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciaParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_sentencias_6_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalVaryGrammar.g:3206:3: ( (lv_devuelve_7_0= ruleDevolver ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==108) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVaryGrammar.g:3207:1: (lv_devuelve_7_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:3207:1: (lv_devuelve_7_0= ruleDevolver )
                    // InternalVaryGrammar.g:3208:3: lv_devuelve_7_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_devuelve_7_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_7_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalVaryGrammar.g:3224:3: ( (lv_sino_8_0= ruleSino ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==107) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVaryGrammar.g:3225:1: (lv_sino_8_0= ruleSino )
                    {
                    // InternalVaryGrammar.g:3225:1: (lv_sino_8_0= ruleSino )
                    // InternalVaryGrammar.g:3226:3: lv_sino_8_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_57);
                    lv_sino_8_0=ruleSino();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"sino",
                            		lv_sino_8_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sino");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,72,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getSiAccess().getFin_siKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSi"


    // $ANTLR start "entryRuleMientras"
    // InternalVaryGrammar.g:3254:1: entryRuleMientras returns [EObject current=null] : iv_ruleMientras= ruleMientras EOF ;
    public final EObject entryRuleMientras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMientras = null;


        try {
            // InternalVaryGrammar.g:3255:2: (iv_ruleMientras= ruleMientras EOF )
            // InternalVaryGrammar.g:3256:2: iv_ruleMientras= ruleMientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMientras=ruleMientras();

            state._fsp--;

             current =iv_ruleMientras; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMientras"


    // $ANTLR start "ruleMientras"
    // InternalVaryGrammar.g:3263:1: ruleMientras returns [EObject current=null] : ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencia ) )* otherlv_7= 'fin_mientras' ) ;
    public final EObject ruleMientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condicion_3_0 = null;

        EObject lv_sentencias_6_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3266:28: ( ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencia ) )* otherlv_7= 'fin_mientras' ) )
            // InternalVaryGrammar.g:3267:1: ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencia ) )* otherlv_7= 'fin_mientras' )
            {
            // InternalVaryGrammar.g:3267:1: ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencia ) )* otherlv_7= 'fin_mientras' )
            // InternalVaryGrammar.g:3267:2: ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencia ) )* otherlv_7= 'fin_mientras'
            {
            // InternalVaryGrammar.g:3267:2: ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==73) ) {
                alt61=1;
            }
            else if ( (LA61_0==74) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalVaryGrammar.g:3267:3: (otherlv_0= 'mientras' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:3267:3: (otherlv_0= 'mientras' otherlv_1= '(' )
                    // InternalVaryGrammar.g:3267:5: otherlv_0= 'mientras' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_29); 

                        	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_1, grammarAccess.getMientrasAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3276:7: otherlv_2= 'mientras('
                    {
                    otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getMientrasKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3280:2: ( (lv_condicion_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3281:1: (lv_condicion_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3281:1: (lv_condicion_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3282:3: lv_condicion_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getCondicionOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_condicion_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getMientrasAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_59); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getHacerKeyword_3());
                
            // InternalVaryGrammar.g:3306:1: ( (lv_sentencias_6_0= ruleSentencia ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_NOMBRE_FUN)||LA62_0==RULE_STRING||(LA62_0>=33 && LA62_0<=34)||(LA62_0>=37 && LA62_0<=46)||(LA62_0>=67 && LA62_0<=70)||(LA62_0>=73 && LA62_0<=74)||LA62_0==77||LA62_0==80||(LA62_0>=84 && LA62_0<=85)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalVaryGrammar.g:3307:1: (lv_sentencias_6_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3307:1: (lv_sentencias_6_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3308:3: lv_sentencias_6_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciaParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_sentencias_6_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_7=(Token)match(input,76,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getMientrasAccess().getFin_mientrasKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMientras"


    // $ANTLR start "entryRuleRepetir"
    // InternalVaryGrammar.g:3336:1: entryRuleRepetir returns [EObject current=null] : iv_ruleRepetir= ruleRepetir EOF ;
    public final EObject entryRuleRepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepetir = null;


        try {
            // InternalVaryGrammar.g:3337:2: (iv_ruleRepetir= ruleRepetir EOF )
            // InternalVaryGrammar.g:3338:2: iv_ruleRepetir= ruleRepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRepetir=ruleRepetir();

            state._fsp--;

             current =iv_ruleRepetir; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepetir"


    // $ANTLR start "ruleRepetir"
    // InternalVaryGrammar.g:3345:1: ruleRepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencia ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_condicion_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) ;
    public final EObject ruleRepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_condicion_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3348:28: ( (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencia ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_condicion_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) )
            // InternalVaryGrammar.g:3349:1: (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencia ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_condicion_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:3349:1: (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencia ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_condicion_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            // InternalVaryGrammar.g:3349:3: otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencia ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_condicion_5_0= ruleOperacionCompleta ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_60); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // InternalVaryGrammar.g:3353:1: ( (lv_sentencias_1_0= ruleSentencia ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_NOMBRE_FUN)||LA63_0==RULE_STRING||(LA63_0>=33 && LA63_0<=34)||(LA63_0>=37 && LA63_0<=46)||(LA63_0>=67 && LA63_0<=70)||(LA63_0>=73 && LA63_0<=74)||LA63_0==77||LA63_0==80||(LA63_0>=84 && LA63_0<=85)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalVaryGrammar.g:3354:1: (lv_sentencias_1_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3354:1: (lv_sentencias_1_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3355:3: lv_sentencias_1_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciaParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_sentencias_1_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_1_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // InternalVaryGrammar.g:3371:3: ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==78) ) {
                alt64=1;
            }
            else if ( (LA64_0==79) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalVaryGrammar.g:3371:4: (otherlv_2= 'hasta_que' otherlv_3= '(' )
                    {
                    // InternalVaryGrammar.g:3371:4: (otherlv_2= 'hasta_que' otherlv_3= '(' )
                    // InternalVaryGrammar.g:3371:6: otherlv_2= 'hasta_que' otherlv_3= '('
                    {
                    otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_29); 

                        	newLeafNode(otherlv_2, grammarAccess.getRepetirAccess().getHasta_queKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getLeftParenthesisKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3380:7: otherlv_4= 'hasta_que('
                    {
                    otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_4, grammarAccess.getRepetirAccess().getHasta_queKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3384:2: ( (lv_condicion_5_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3385:1: (lv_condicion_5_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3385:1: (lv_condicion_5_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3386:3: lv_condicion_5_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getCondicionOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_condicion_5_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_5_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getRepetirAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepetir"


    // $ANTLR start "entryRuleDesde"
    // InternalVaryGrammar.g:3414:1: entryRuleDesde returns [EObject current=null] : iv_ruleDesde= ruleDesde EOF ;
    public final EObject entryRuleDesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesde = null;


        try {
            // InternalVaryGrammar.g:3415:2: (iv_ruleDesde= ruleDesde EOF )
            // InternalVaryGrammar.g:3416:2: iv_ruleDesde= ruleDesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDesde=ruleDesde();

            state._fsp--;

             current =iv_ruleDesde; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesde"


    // $ANTLR start "ruleDesde"
    // InternalVaryGrammar.g:3423:1: ruleDesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_desde' ) ;
    public final EObject ruleDesde() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_asignacion_1_0 = null;

        EObject lv_condicion_3_0 = null;

        EObject lv_sentencias_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3426:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_desde' ) )
            // InternalVaryGrammar.g:3427:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_desde' )
            {
            // InternalVaryGrammar.g:3427:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_desde' )
            // InternalVaryGrammar.g:3427:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencia ) )* otherlv_6= 'fin_desde'
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // InternalVaryGrammar.g:3431:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // InternalVaryGrammar.g:3432:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // InternalVaryGrammar.g:3432:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // InternalVaryGrammar.g:3433:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_61);
            lv_asignacion_1_0=ruleAsignacionNormal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"asignacion",
                    		lv_asignacion_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.AsignacionNormal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_53); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // InternalVaryGrammar.g:3453:1: ( (lv_condicion_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3454:1: (lv_condicion_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3454:1: (lv_condicion_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3455:3: lv_condicion_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getCondicionOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_58);
            lv_condicion_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_62); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // InternalVaryGrammar.g:3475:1: ( (lv_sentencias_5_0= ruleSentencia ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_NOMBRE_FUN)||LA65_0==RULE_STRING||(LA65_0>=33 && LA65_0<=34)||(LA65_0>=37 && LA65_0<=46)||(LA65_0>=67 && LA65_0<=70)||(LA65_0>=73 && LA65_0<=74)||LA65_0==77||LA65_0==80||(LA65_0>=84 && LA65_0<=85)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalVaryGrammar.g:3476:1: (lv_sentencias_5_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3476:1: (lv_sentencias_5_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3477:3: lv_sentencias_5_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciaParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_sentencias_5_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_6=(Token)match(input,82,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getDesdeAccess().getFin_desdeKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesde"


    // $ANTLR start "entryRuleCaso"
    // InternalVaryGrammar.g:3505:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // InternalVaryGrammar.g:3506:2: (iv_ruleCaso= ruleCaso EOF )
            // InternalVaryGrammar.g:3507:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaso"


    // $ANTLR start "ruleCaso"
    // InternalVaryGrammar.g:3514:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencia ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operador_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3517:28: ( (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencia ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // InternalVaryGrammar.g:3518:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencia ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // InternalVaryGrammar.g:3518:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencia ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // InternalVaryGrammar.g:3518:3: otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencia ) )* ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
                
            // InternalVaryGrammar.g:3522:1: ( (lv_operador_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:3523:1: (lv_operador_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:3523:1: (lv_operador_1_0= rulePrimaria )
            // InternalVaryGrammar.g:3524:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_operador_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_63); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:3544:1: ( (lv_sentencias_3_0= ruleSentencia ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_NOMBRE_FUN)||LA66_0==RULE_STRING||(LA66_0>=33 && LA66_0<=34)||(LA66_0>=37 && LA66_0<=46)||(LA66_0>=67 && LA66_0<=70)||(LA66_0>=73 && LA66_0<=74)||LA66_0==77||LA66_0==80||(LA66_0>=84 && LA66_0<=85)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalVaryGrammar.g:3545:1: (lv_sentencias_3_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3545:1: (lv_sentencias_3_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3546:3: lv_sentencias_3_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciaParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_sentencias_3_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // InternalVaryGrammar.g:3562:3: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==108) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalVaryGrammar.g:3563:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:3563:1: (lv_devuelve_4_0= ruleDevolver )
                    // InternalVaryGrammar.g:3564:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_devuelve_4_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_4_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRuleSegun"
    // InternalVaryGrammar.g:3588:1: entryRuleSegun returns [EObject current=null] : iv_ruleSegun= ruleSegun EOF ;
    public final EObject entryRuleSegun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSegun = null;


        try {
            // InternalVaryGrammar.g:3589:2: (iv_ruleSegun= ruleSegun EOF )
            // InternalVaryGrammar.g:3590:2: iv_ruleSegun= ruleSegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSegun=ruleSegun();

            state._fsp--;

             current =iv_ruleSegun; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSegun"


    // $ANTLR start "ruleSegun"
    // InternalVaryGrammar.g:3597:1: ruleSegun returns [EObject current=null] : ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_casos_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencia ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) ;
    public final EObject ruleSegun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_condicion_3_0 = null;

        EObject lv_casos_6_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_devuelve_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3600:28: ( ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_casos_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencia ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) )
            // InternalVaryGrammar.g:3601:1: ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_casos_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencia ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            {
            // InternalVaryGrammar.g:3601:1: ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_casos_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencia ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            // InternalVaryGrammar.g:3601:2: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_condicion_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_casos_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencia ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun'
            {
            // InternalVaryGrammar.g:3601:2: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==84) ) {
                alt68=1;
            }
            else if ( (LA68_0==85) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalVaryGrammar.g:3601:3: (otherlv_0= 'segun_sea' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:3601:3: (otherlv_0= 'segun_sea' otherlv_1= '(' )
                    // InternalVaryGrammar.g:3601:5: otherlv_0= 'segun_sea' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_29); 

                        	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3610:7: otherlv_2= 'segun_sea('
                    {
                    otherlv_2=(Token)match(input,85,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_2, grammarAccess.getSegunAccess().getSegun_seaKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3614:2: ( (lv_condicion_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3615:1: (lv_condicion_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3615:1: (lv_condicion_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3616:3: lv_condicion_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getCondicionOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_condicion_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"condicion",
                    		lv_condicion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_64); 

                	newLeafNode(otherlv_5, grammarAccess.getSegunAccess().getHacerKeyword_3());
                
            // InternalVaryGrammar.g:3640:1: ( (lv_casos_6_0= ruleCaso ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==83) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalVaryGrammar.g:3641:1: (lv_casos_6_0= ruleCaso )
            	    {
            	    // InternalVaryGrammar.g:3641:1: (lv_casos_6_0= ruleCaso )
            	    // InternalVaryGrammar.g:3642:3: lv_casos_6_0= ruleCaso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasosCasoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_casos_6_0=ruleCaso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"casos",
            	            		lv_casos_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Caso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_65); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_5());
                
            // InternalVaryGrammar.g:3662:1: ( (lv_sentencias_8_0= ruleSentencia ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_NOMBRE_FUN)||LA70_0==RULE_STRING||(LA70_0>=33 && LA70_0<=34)||(LA70_0>=37 && LA70_0<=46)||(LA70_0>=67 && LA70_0<=70)||(LA70_0>=73 && LA70_0<=74)||LA70_0==77||LA70_0==80||(LA70_0>=84 && LA70_0<=85)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalVaryGrammar.g:3663:1: (lv_sentencias_8_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:3663:1: (lv_sentencias_8_0= ruleSentencia )
            	    // InternalVaryGrammar.g:3664:3: lv_sentencias_8_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciaParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_sentencias_8_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_8_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            // InternalVaryGrammar.g:3680:3: ( (lv_devuelve_9_0= ruleDevolver ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==108) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalVaryGrammar.g:3681:1: (lv_devuelve_9_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:3681:1: (lv_devuelve_9_0= ruleDevolver )
                    // InternalVaryGrammar.g:3682:3: lv_devuelve_9_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_66);
                    lv_devuelve_9_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_9_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,87,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getSegunAccess().getFin_segunKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSegun"


    // $ANTLR start "entryRuleTipoVariable"
    // InternalVaryGrammar.g:3710:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // InternalVaryGrammar.g:3711:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // InternalVaryGrammar.g:3712:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoVariable"


    // $ANTLR start "ruleTipoVariable"
    // InternalVaryGrammar.g:3719:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3722:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // InternalVaryGrammar.g:3723:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // InternalVaryGrammar.g:3723:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt72=5;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt72=1;
                }
                break;
            case 89:
                {
                alt72=2;
                }
                break;
            case 90:
                {
                alt72=3;
                }
                break;
            case 91:
                {
                alt72=4;
                }
                break;
            case 92:
                {
                alt72=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalVaryGrammar.g:3724:2: kw= 'entero'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3731:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:3738:2: kw= 'real'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:3745:2: kw= 'logico'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:3752:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCadenaKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalVaryGrammar.g:3765:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVaryGrammar.g:3766:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalVaryGrammar.g:3767:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVaryGrammar.g:3774:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3777:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:3778:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:3778:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // InternalVaryGrammar.g:3778:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:3778:2: ()
            // InternalVaryGrammar.g:3779:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:3784:2: ( (lv_nombre_1_0= ruleEString ) )
            // InternalVaryGrammar.g:3785:1: (lv_nombre_1_0= ruleEString )
            {
            // InternalVaryGrammar.g:3785:1: (lv_nombre_1_0= ruleEString )
            // InternalVaryGrammar.g:3786:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulesignoOr"
    // InternalVaryGrammar.g:3810:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // InternalVaryGrammar.g:3811:2: (iv_rulesignoOr= rulesignoOr EOF )
            // InternalVaryGrammar.g:3812:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoOr"


    // $ANTLR start "rulesignoOr"
    // InternalVaryGrammar.g:3819:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'o' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3822:28: (kw= 'o' )
            // InternalVaryGrammar.g:3824:2: kw= 'o'
            {
            kw=(Token)match(input,93,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoOrAccess().getOKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoOr"


    // $ANTLR start "entryRulesignoAnd"
    // InternalVaryGrammar.g:3837:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // InternalVaryGrammar.g:3838:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // InternalVaryGrammar.g:3839:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoAnd"


    // $ANTLR start "rulesignoAnd"
    // InternalVaryGrammar.g:3846:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'y' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3849:28: (kw= 'y' )
            // InternalVaryGrammar.g:3851:2: kw= 'y'
            {
            kw=(Token)match(input,94,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoAndAccess().getYKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoAnd"


    // $ANTLR start "entryRulesignoIgualdad"
    // InternalVaryGrammar.g:3864:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // InternalVaryGrammar.g:3865:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // InternalVaryGrammar.g:3866:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoIgualdad"


    // $ANTLR start "rulesignoIgualdad"
    // InternalVaryGrammar.g:3873:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3876:28: ( (kw= '=' | kw= '!=' ) )
            // InternalVaryGrammar.g:3877:1: (kw= '=' | kw= '!=' )
            {
            // InternalVaryGrammar.g:3877:1: (kw= '=' | kw= '!=' )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==50) ) {
                alt73=1;
            }
            else if ( (LA73_0==95) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalVaryGrammar.g:3878:2: kw= '='
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3885:2: kw= '!='
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getExclamationMarkEqualsSignKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoIgualdad"


    // $ANTLR start "entryRulesignoComparacion"
    // InternalVaryGrammar.g:3898:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // InternalVaryGrammar.g:3899:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // InternalVaryGrammar.g:3900:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoComparacion"


    // $ANTLR start "rulesignoComparacion"
    // InternalVaryGrammar.g:3907:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3910:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // InternalVaryGrammar.g:3911:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // InternalVaryGrammar.g:3911:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt74=1;
                }
                break;
            case 97:
                {
                alt74=2;
                }
                break;
            case 98:
                {
                alt74=3;
                }
                break;
            case 99:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalVaryGrammar.g:3912:2: kw= '<'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3919:2: kw= '>'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:3926:2: kw= '>='
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:3933:2: kw= '<='
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignEqualsSignKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoComparacion"


    // $ANTLR start "entryRulesignoSuma"
    // InternalVaryGrammar.g:3946:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // InternalVaryGrammar.g:3947:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // InternalVaryGrammar.g:3948:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoSuma"


    // $ANTLR start "rulesignoSuma"
    // InternalVaryGrammar.g:3955:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3958:28: (kw= '+' )
            // InternalVaryGrammar.g:3960:2: kw= '+'
            {
            kw=(Token)match(input,100,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoSumaAccess().getPlusSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoSuma"


    // $ANTLR start "entryRulesignoResta"
    // InternalVaryGrammar.g:3973:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // InternalVaryGrammar.g:3974:2: (iv_rulesignoResta= rulesignoResta EOF )
            // InternalVaryGrammar.g:3975:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoResta"


    // $ANTLR start "rulesignoResta"
    // InternalVaryGrammar.g:3982:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3985:28: (kw= '-' )
            // InternalVaryGrammar.g:3987:2: kw= '-'
            {
            kw=(Token)match(input,101,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoRestaAccess().getHyphenMinusKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoResta"


    // $ANTLR start "entryRulesignoMultiplicacion"
    // InternalVaryGrammar.g:4000:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // InternalVaryGrammar.g:4001:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // InternalVaryGrammar.g:4002:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoMultiplicacion"


    // $ANTLR start "rulesignoMultiplicacion"
    // InternalVaryGrammar.g:4009:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4012:28: (kw= '*' )
            // InternalVaryGrammar.g:4014:2: kw= '*'
            {
            kw=(Token)match(input,102,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoMultiplicacionAccess().getAsteriskKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoMultiplicacion"


    // $ANTLR start "entryRulesignoDivision"
    // InternalVaryGrammar.g:4027:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // InternalVaryGrammar.g:4028:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // InternalVaryGrammar.g:4029:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoDivision"


    // $ANTLR start "rulesignoDivision"
    // InternalVaryGrammar.g:4036:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4039:28: (kw= '/' )
            // InternalVaryGrammar.g:4041:2: kw= '/'
            {
            kw=(Token)match(input,103,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoDivisionAccess().getSolidusKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoDivision"


    // $ANTLR start "entryRulesignoModulo"
    // InternalVaryGrammar.g:4054:1: entryRulesignoModulo returns [String current=null] : iv_rulesignoModulo= rulesignoModulo EOF ;
    public final String entryRulesignoModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoModulo = null;


        try {
            // InternalVaryGrammar.g:4055:2: (iv_rulesignoModulo= rulesignoModulo EOF )
            // InternalVaryGrammar.g:4056:2: iv_rulesignoModulo= rulesignoModulo EOF
            {
             newCompositeNode(grammarAccess.getSignoModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoModulo=rulesignoModulo();

            state._fsp--;

             current =iv_rulesignoModulo.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoModulo"


    // $ANTLR start "rulesignoModulo"
    // InternalVaryGrammar.g:4063:1: rulesignoModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken rulesignoModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4066:28: (kw= 'mod' )
            // InternalVaryGrammar.g:4068:2: kw= 'mod'
            {
            kw=(Token)match(input,104,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoModuloAccess().getModKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoModulo"


    // $ANTLR start "entryRulesignoDiv"
    // InternalVaryGrammar.g:4081:1: entryRulesignoDiv returns [String current=null] : iv_rulesignoDiv= rulesignoDiv EOF ;
    public final String entryRulesignoDiv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDiv = null;


        try {
            // InternalVaryGrammar.g:4082:2: (iv_rulesignoDiv= rulesignoDiv EOF )
            // InternalVaryGrammar.g:4083:2: iv_rulesignoDiv= rulesignoDiv EOF
            {
             newCompositeNode(grammarAccess.getSignoDivRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesignoDiv=rulesignoDiv();

            state._fsp--;

             current =iv_rulesignoDiv.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignoDiv"


    // $ANTLR start "rulesignoDiv"
    // InternalVaryGrammar.g:4090:1: rulesignoDiv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken rulesignoDiv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4093:28: (kw= 'div' )
            // InternalVaryGrammar.g:4095:2: kw= 'div'
            {
            kw=(Token)match(input,105,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoDivAccess().getDivKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignoDiv"


    // $ANTLR start "entryRuleOperacion"
    // InternalVaryGrammar.g:4110:1: entryRuleOperacion returns [EObject current=null] : iv_ruleOperacion= ruleOperacion EOF ;
    public final EObject entryRuleOperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacion = null;


        try {
            // InternalVaryGrammar.g:4111:2: (iv_ruleOperacion= ruleOperacion EOF )
            // InternalVaryGrammar.g:4112:2: iv_ruleOperacion= ruleOperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperacion=ruleOperacion();

            state._fsp--;

             current =iv_ruleOperacion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacion"


    // $ANTLR start "ruleOperacion"
    // InternalVaryGrammar.g:4119:1: ruleOperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleOperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4122:28: (this_Or_0= ruleOr )
            // InternalVaryGrammar.g:4124:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacion"


    // $ANTLR start "entryRuleOr"
    // InternalVaryGrammar.g:4140:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalVaryGrammar.g:4141:2: (iv_ruleOr= ruleOr EOF )
            // InternalVaryGrammar.g:4142:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalVaryGrammar.g:4149:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4152:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) )
            // InternalVaryGrammar.g:4153:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            {
            // InternalVaryGrammar.g:4153:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            // InternalVaryGrammar.g:4154:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_67);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4162:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==93) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalVaryGrammar.g:4162:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) )
            	    {
            	    // InternalVaryGrammar.g:4162:2: ()
            	    // InternalVaryGrammar.g:4163:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4168:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // InternalVaryGrammar.g:4169:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // InternalVaryGrammar.g:4169:1: (lv_signo_op_2_0= rulesignoOr )
            	    // InternalVaryGrammar.g:4170:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_signo_op_2_0=rulesignoOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoOr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:4186:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==101) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4187:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4187:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4188:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOrAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4201:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==106) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4202:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4202:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4203:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getOrAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4216:3: ( (lv_right_5_0= ruleAnd ) )
            	    // InternalVaryGrammar.g:4217:1: (lv_right_5_0= ruleAnd )
            	    {
            	    // InternalVaryGrammar.g:4217:1: (lv_right_5_0= ruleAnd )
            	    // InternalVaryGrammar.g:4218:3: lv_right_5_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_right_5_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalVaryGrammar.g:4242:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalVaryGrammar.g:4243:2: (iv_ruleAnd= ruleAnd EOF )
            // InternalVaryGrammar.g:4244:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalVaryGrammar.g:4251:1: ruleAnd returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Mod_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4254:28: ( (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) )
            // InternalVaryGrammar.g:4255:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            {
            // InternalVaryGrammar.g:4255:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            // InternalVaryGrammar.g:4256:5: this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getModParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_68);
            this_Mod_0=ruleMod();

            state._fsp--;

             
                    current = this_Mod_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4264:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==94) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalVaryGrammar.g:4264:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) )
            	    {
            	    // InternalVaryGrammar.g:4264:2: ()
            	    // InternalVaryGrammar.g:4265:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4270:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // InternalVaryGrammar.g:4271:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // InternalVaryGrammar.g:4271:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // InternalVaryGrammar.g:4272:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_signo_op_2_0=rulesignoAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:4288:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==101) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4289:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4289:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4290:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getAndAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4303:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==106) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4304:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4304:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4305:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getAndAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4318:3: ( (lv_right_5_0= ruleMod ) )
            	    // InternalVaryGrammar.g:4319:1: (lv_right_5_0= ruleMod )
            	    {
            	    // InternalVaryGrammar.g:4319:1: (lv_right_5_0= ruleMod )
            	    // InternalVaryGrammar.g:4320:3: lv_right_5_0= ruleMod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightModParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_68);
            	    lv_right_5_0=ruleMod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Mod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleMod"
    // InternalVaryGrammar.g:4344:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalVaryGrammar.g:4345:2: (iv_ruleMod= ruleMod EOF )
            // InternalVaryGrammar.g:4346:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalVaryGrammar.g:4353:1: ruleMod returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4356:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) )
            // InternalVaryGrammar.g:4357:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            {
            // InternalVaryGrammar.g:4357:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            // InternalVaryGrammar.g:4358:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_69);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4366:1: ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==104) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalVaryGrammar.g:4366:2: () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) )
            	    {
            	    // InternalVaryGrammar.g:4366:2: ()
            	    // InternalVaryGrammar.g:4367:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getModAccess().getModLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4372:2: ( (lv_signo_op_2_0= rulesignoModulo ) )
            	    // InternalVaryGrammar.g:4373:1: (lv_signo_op_2_0= rulesignoModulo )
            	    {
            	    // InternalVaryGrammar.g:4373:1: (lv_signo_op_2_0= rulesignoModulo )
            	    // InternalVaryGrammar.g:4374:3: lv_signo_op_2_0= rulesignoModulo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getSigno_opSignoModuloParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_signo_op_2_0=rulesignoModulo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoModulo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:4390:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==101) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4391:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4391:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4392:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getModAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4405:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==106) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4406:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4406:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4407:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getModAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop82;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4420:3: ( (lv_right_5_0= ruleIgualdad ) )
            	    // InternalVaryGrammar.g:4421:1: (lv_right_5_0= ruleIgualdad )
            	    {
            	    // InternalVaryGrammar.g:4421:1: (lv_right_5_0= ruleIgualdad )
            	    // InternalVaryGrammar.g:4422:3: lv_right_5_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getRightIgualdadParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_69);
            	    lv_right_5_0=ruleIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Igualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleIgualdad"
    // InternalVaryGrammar.g:4446:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // InternalVaryGrammar.g:4447:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // InternalVaryGrammar.g:4448:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgualdad"


    // $ANTLR start "ruleIgualdad"
    // InternalVaryGrammar.g:4455:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4458:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) )
            // InternalVaryGrammar.g:4459:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            {
            // InternalVaryGrammar.g:4459:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            // InternalVaryGrammar.g:4460:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_70);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4468:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==50||LA86_0==95) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalVaryGrammar.g:4468:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) )
            	    {
            	    // InternalVaryGrammar.g:4468:2: ()
            	    // InternalVaryGrammar.g:4469:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4474:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // InternalVaryGrammar.g:4475:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // InternalVaryGrammar.g:4475:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // InternalVaryGrammar.g:4476:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_signo_op_2_0=rulesignoIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoIgualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:4492:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==101) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4493:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4493:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4494:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop84;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4507:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==106) ) {
            	            alt85=1;
            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4508:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4508:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4509:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop85;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4522:3: ( (lv_right_5_0= ruleComparacion ) )
            	    // InternalVaryGrammar.g:4523:1: (lv_right_5_0= ruleComparacion )
            	    {
            	    // InternalVaryGrammar.g:4523:1: (lv_right_5_0= ruleComparacion )
            	    // InternalVaryGrammar.g:4524:3: lv_right_5_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_70);
            	    lv_right_5_0=ruleComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Comparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIgualdad"


    // $ANTLR start "entryRuleComparacion"
    // InternalVaryGrammar.g:4548:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalVaryGrammar.g:4549:2: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalVaryGrammar.g:4550:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // InternalVaryGrammar.g:4557:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4560:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) )
            // InternalVaryGrammar.g:4561:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            {
            // InternalVaryGrammar.g:4561:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            // InternalVaryGrammar.g:4562:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_71);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4570:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=96 && LA89_0<=99)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalVaryGrammar.g:4570:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) )
            	    {
            	    // InternalVaryGrammar.g:4570:2: ()
            	    // InternalVaryGrammar.g:4571:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4576:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // InternalVaryGrammar.g:4577:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // InternalVaryGrammar.g:4577:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // InternalVaryGrammar.g:4578:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_53);
            	    lv_signo_op_2_0=rulesignoComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoComparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:4594:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop87:
            	    do {
            	        int alt87=2;
            	        int LA87_0 = input.LA(1);

            	        if ( (LA87_0==101) ) {
            	            alt87=1;
            	        }


            	        switch (alt87) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4595:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4595:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4596:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getComparacionAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop87;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4609:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);

            	        if ( (LA88_0==106) ) {
            	            alt88=1;
            	        }


            	        switch (alt88) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4610:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4610:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4611:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getComparacionAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4624:3: ( (lv_right_5_0= ruleSumaResta ) )
            	    // InternalVaryGrammar.g:4625:1: (lv_right_5_0= ruleSumaResta )
            	    {
            	    // InternalVaryGrammar.g:4625:1: (lv_right_5_0= ruleSumaResta )
            	    // InternalVaryGrammar.g:4626:3: lv_right_5_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_71);
            	    lv_right_5_0=ruleSumaResta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.SumaResta");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleSumaResta"
    // InternalVaryGrammar.g:4650:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // InternalVaryGrammar.g:4651:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // InternalVaryGrammar.g:4652:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumaResta"


    // $ANTLR start "ruleSumaResta"
    // InternalVaryGrammar.g:4659:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_5_0=null;
        Token lv_negacionesFinales_6_0=null;
        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4662:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) )
            // InternalVaryGrammar.g:4663:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            {
            // InternalVaryGrammar.g:4663:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            // InternalVaryGrammar.g:4664:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_72);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4672:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=100 && LA93_0<=101)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalVaryGrammar.g:4672:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    {
            	    // InternalVaryGrammar.g:4672:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==100) ) {
            	        alt90=1;
            	    }
            	    else if ( (LA90_0==101) ) {
            	        alt90=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalVaryGrammar.g:4672:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // InternalVaryGrammar.g:4672:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // InternalVaryGrammar.g:4672:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // InternalVaryGrammar.g:4672:4: ()
            	            // InternalVaryGrammar.g:4673:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4678:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // InternalVaryGrammar.g:4679:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // InternalVaryGrammar.g:4679:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // InternalVaryGrammar.g:4680:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_53);
            	            lv_signo_op_2_0=rulesignoSuma();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoSuma");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalVaryGrammar.g:4697:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // InternalVaryGrammar.g:4697:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // InternalVaryGrammar.g:4697:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // InternalVaryGrammar.g:4697:7: ()
            	            // InternalVaryGrammar.g:4698:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4703:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // InternalVaryGrammar.g:4704:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // InternalVaryGrammar.g:4704:1: (lv_signo_op_4_0= rulesignoResta )
            	            // InternalVaryGrammar.g:4705:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_53);
            	            lv_signo_op_4_0=rulesignoResta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoResta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVaryGrammar.g:4721:4: ( (lv_negacionesFinales_5_0= '-' ) )*
            	    loop91:
            	    do {
            	        int alt91=2;
            	        int LA91_0 = input.LA(1);

            	        if ( (LA91_0==101) ) {
            	            alt91=1;
            	        }


            	        switch (alt91) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4722:1: (lv_negacionesFinales_5_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4722:1: (lv_negacionesFinales_5_0= '-' )
            	    	    // InternalVaryGrammar.g:4723:3: lv_negacionesFinales_5_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_5_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_5_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_5_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop91;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4736:3: ( (lv_negacionesFinales_6_0= 'no' ) )*
            	    loop92:
            	    do {
            	        int alt92=2;
            	        int LA92_0 = input.LA(1);

            	        if ( (LA92_0==106) ) {
            	            alt92=1;
            	        }


            	        switch (alt92) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4737:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4737:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    // InternalVaryGrammar.g:4738:3: lv_negacionesFinales_6_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_6_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_6_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesNoKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_6_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop92;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4751:3: ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    // InternalVaryGrammar.g:4752:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    {
            	    // InternalVaryGrammar.g:4752:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    // InternalVaryGrammar.g:4753:3: lv_right_7_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_right_7_0=ruleMultiplicacionDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.MultiplicacionDivision");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // InternalVaryGrammar.g:4777:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // InternalVaryGrammar.g:4778:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // InternalVaryGrammar.g:4779:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicacionDivision"


    // $ANTLR start "ruleMultiplicacionDivision"
    // InternalVaryGrammar.g:4786:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_7_0=null;
        Token lv_negacionesFinales_8_0=null;
        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4789:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) )
            // InternalVaryGrammar.g:4790:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            {
            // InternalVaryGrammar.g:4790:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            // InternalVaryGrammar.g:4791:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_73);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4799:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=102 && LA97_0<=103)||LA97_0==105) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalVaryGrammar.g:4799:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) )
            	    {
            	    // InternalVaryGrammar.g:4799:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt94=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt94=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt94=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt94=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 94, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt94) {
            	        case 1 :
            	            // InternalVaryGrammar.g:4799:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // InternalVaryGrammar.g:4799:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // InternalVaryGrammar.g:4799:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // InternalVaryGrammar.g:4799:4: ()
            	            // InternalVaryGrammar.g:4800:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4805:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // InternalVaryGrammar.g:4806:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // InternalVaryGrammar.g:4806:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // InternalVaryGrammar.g:4807:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_53);
            	            lv_signo_op_2_0=rulesignoMultiplicacion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoMultiplicacion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalVaryGrammar.g:4824:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // InternalVaryGrammar.g:4824:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // InternalVaryGrammar.g:4824:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // InternalVaryGrammar.g:4824:7: ()
            	            // InternalVaryGrammar.g:4825:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionEnteraLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4830:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // InternalVaryGrammar.g:4831:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // InternalVaryGrammar.g:4831:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // InternalVaryGrammar.g:4832:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_53);
            	            lv_signo_op_4_0=rulesignoDivision();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoDivision");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalVaryGrammar.g:4849:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // InternalVaryGrammar.g:4849:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // InternalVaryGrammar.g:4849:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // InternalVaryGrammar.g:4849:7: ()
            	            // InternalVaryGrammar.g:4850:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionRealLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4855:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // InternalVaryGrammar.g:4856:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // InternalVaryGrammar.g:4856:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // InternalVaryGrammar.g:4857:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_53);
            	            lv_signo_op_6_0=rulesignoDiv();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_6_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoDiv");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVaryGrammar.g:4873:4: ( (lv_negacionesFinales_7_0= '-' ) )*
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==101) ) {
            	            alt95=1;
            	        }


            	        switch (alt95) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4874:1: (lv_negacionesFinales_7_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4874:1: (lv_negacionesFinales_7_0= '-' )
            	    	    // InternalVaryGrammar.g:4875:3: lv_negacionesFinales_7_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_7_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	    	            newLeafNode(lv_negacionesFinales_7_0, grammarAccess.getMultiplicacionDivisionAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getMultiplicacionDivisionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_7_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop95;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4888:3: ( (lv_negacionesFinales_8_0= 'no' ) )*
            	    loop96:
            	    do {
            	        int alt96=2;
            	        int LA96_0 = input.LA(1);

            	        if ( (LA96_0==106) ) {
            	            alt96=1;
            	        }


            	        switch (alt96) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4889:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4889:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    // InternalVaryGrammar.g:4890:3: lv_negacionesFinales_8_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_8_0=(Token)match(input,106,FollowSets000.FOLLOW_74); 

            	    	            newLeafNode(lv_negacionesFinales_8_0, grammarAccess.getMultiplicacionDivisionAccess().getNegacionesFinalesNoKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getMultiplicacionDivisionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_8_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop96;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4903:3: ( (lv_right_9_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:4904:1: (lv_right_9_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:4904:1: (lv_right_9_0= rulePrimaria )
            	    // InternalVaryGrammar.g:4905:3: lv_right_9_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_73);
            	    lv_right_9_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRuleOperacionIndice"
    // InternalVaryGrammar.g:4929:1: entryRuleOperacionIndice returns [EObject current=null] : iv_ruleOperacionIndice= ruleOperacionIndice EOF ;
    public final EObject entryRuleOperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionIndice = null;


        try {
            // InternalVaryGrammar.g:4930:2: (iv_ruleOperacionIndice= ruleOperacionIndice EOF )
            // InternalVaryGrammar.g:4931:2: iv_ruleOperacionIndice= ruleOperacionIndice EOF
            {
             newCompositeNode(grammarAccess.getOperacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperacionIndice=ruleOperacionIndice();

            state._fsp--;

             current =iv_ruleOperacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionIndice"


    // $ANTLR start "ruleOperacionIndice"
    // InternalVaryGrammar.g:4938:1: ruleOperacionIndice returns [EObject current=null] : this_OrIndice_0= ruleOrIndice ;
    public final EObject ruleOperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_OrIndice_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4941:28: (this_OrIndice_0= ruleOrIndice )
            // InternalVaryGrammar.g:4943:5: this_OrIndice_0= ruleOrIndice
            {
             
                    newCompositeNode(grammarAccess.getOperacionIndiceAccess().getOrIndiceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrIndice_0=ruleOrIndice();

            state._fsp--;

             
                    current = this_OrIndice_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionIndice"


    // $ANTLR start "entryRuleOrIndice"
    // InternalVaryGrammar.g:4959:1: entryRuleOrIndice returns [EObject current=null] : iv_ruleOrIndice= ruleOrIndice EOF ;
    public final EObject entryRuleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrIndice = null;


        try {
            // InternalVaryGrammar.g:4960:2: (iv_ruleOrIndice= ruleOrIndice EOF )
            // InternalVaryGrammar.g:4961:2: iv_ruleOrIndice= ruleOrIndice EOF
            {
             newCompositeNode(grammarAccess.getOrIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrIndice=ruleOrIndice();

            state._fsp--;

             current =iv_ruleOrIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrIndice"


    // $ANTLR start "ruleOrIndice"
    // InternalVaryGrammar.g:4968:1: ruleOrIndice returns [EObject current=null] : (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) ;
    public final EObject ruleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject this_AndIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4971:28: ( (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) )
            // InternalVaryGrammar.g:4972:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            {
            // InternalVaryGrammar.g:4972:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            // InternalVaryGrammar.g:4973:5: this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrIndiceAccess().getAndIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_67);
            this_AndIndice_0=ruleAndIndice();

            state._fsp--;

             
                    current = this_AndIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4981:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==93) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalVaryGrammar.g:4981:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) )
            	    {
            	    // InternalVaryGrammar.g:4981:2: ()
            	    // InternalVaryGrammar.g:4982:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrIndiceAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4987:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // InternalVaryGrammar.g:4988:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // InternalVaryGrammar.g:4988:1: (lv_signo_op_2_0= rulesignoOr )
            	    // InternalVaryGrammar.g:4989:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_signo_op_2_0=rulesignoOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoOr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:5005:2: ( (lv_right_3_0= ruleAndIndice ) )
            	    // InternalVaryGrammar.g:5006:1: (lv_right_3_0= ruleAndIndice )
            	    {
            	    // InternalVaryGrammar.g:5006:1: (lv_right_3_0= ruleAndIndice )
            	    // InternalVaryGrammar.g:5007:3: lv_right_3_0= ruleAndIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getRightAndIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_67);
            	    lv_right_3_0=ruleAndIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.AndIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrIndice"


    // $ANTLR start "entryRuleAndIndice"
    // InternalVaryGrammar.g:5031:1: entryRuleAndIndice returns [EObject current=null] : iv_ruleAndIndice= ruleAndIndice EOF ;
    public final EObject entryRuleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndIndice = null;


        try {
            // InternalVaryGrammar.g:5032:2: (iv_ruleAndIndice= ruleAndIndice EOF )
            // InternalVaryGrammar.g:5033:2: iv_ruleAndIndice= ruleAndIndice EOF
            {
             newCompositeNode(grammarAccess.getAndIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndIndice=ruleAndIndice();

            state._fsp--;

             current =iv_ruleAndIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndIndice"


    // $ANTLR start "ruleAndIndice"
    // InternalVaryGrammar.g:5040:1: ruleAndIndice returns [EObject current=null] : (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) ;
    public final EObject ruleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject this_IgualdadIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5043:28: ( (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) )
            // InternalVaryGrammar.g:5044:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5044:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            // InternalVaryGrammar.g:5045:5: this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndIndiceAccess().getIgualdadIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_68);
            this_IgualdadIndice_0=ruleIgualdadIndice();

            state._fsp--;

             
                    current = this_IgualdadIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5053:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==94) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalVaryGrammar.g:5053:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5053:2: ()
            	    // InternalVaryGrammar.g:5054:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndIndiceAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:5059:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // InternalVaryGrammar.g:5060:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // InternalVaryGrammar.g:5060:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // InternalVaryGrammar.g:5061:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_signo_op_2_0=rulesignoAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:5077:2: ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    // InternalVaryGrammar.g:5078:1: (lv_right_3_0= ruleIgualdadIndice )
            	    {
            	    // InternalVaryGrammar.g:5078:1: (lv_right_3_0= ruleIgualdadIndice )
            	    // InternalVaryGrammar.g:5079:3: lv_right_3_0= ruleIgualdadIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getRightIgualdadIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_68);
            	    lv_right_3_0=ruleIgualdadIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.IgualdadIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndIndice"


    // $ANTLR start "entryRuleIgualdadIndice"
    // InternalVaryGrammar.g:5103:1: entryRuleIgualdadIndice returns [EObject current=null] : iv_ruleIgualdadIndice= ruleIgualdadIndice EOF ;
    public final EObject entryRuleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdadIndice = null;


        try {
            // InternalVaryGrammar.g:5104:2: (iv_ruleIgualdadIndice= ruleIgualdadIndice EOF )
            // InternalVaryGrammar.g:5105:2: iv_ruleIgualdadIndice= ruleIgualdadIndice EOF
            {
             newCompositeNode(grammarAccess.getIgualdadIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgualdadIndice=ruleIgualdadIndice();

            state._fsp--;

             current =iv_ruleIgualdadIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIgualdadIndice"


    // $ANTLR start "ruleIgualdadIndice"
    // InternalVaryGrammar.g:5112:1: ruleIgualdadIndice returns [EObject current=null] : (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) ;
    public final EObject ruleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject this_ComparacionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5115:28: ( (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) )
            // InternalVaryGrammar.g:5116:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5116:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            // InternalVaryGrammar.g:5117:5: this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getComparacionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_70);
            this_ComparacionIndice_0=ruleComparacionIndice();

            state._fsp--;

             
                    current = this_ComparacionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5125:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==50||LA100_0==95) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalVaryGrammar.g:5125:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5125:2: ()
            	    // InternalVaryGrammar.g:5126:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadIndiceAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:5131:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // InternalVaryGrammar.g:5132:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // InternalVaryGrammar.g:5132:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // InternalVaryGrammar.g:5133:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_signo_op_2_0=rulesignoIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoIgualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:5149:2: ( (lv_right_3_0= ruleComparacionIndice ) )
            	    // InternalVaryGrammar.g:5150:1: (lv_right_3_0= ruleComparacionIndice )
            	    {
            	    // InternalVaryGrammar.g:5150:1: (lv_right_3_0= ruleComparacionIndice )
            	    // InternalVaryGrammar.g:5151:3: lv_right_3_0= ruleComparacionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getRightComparacionIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_70);
            	    lv_right_3_0=ruleComparacionIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.ComparacionIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIgualdadIndice"


    // $ANTLR start "entryRuleComparacionIndice"
    // InternalVaryGrammar.g:5175:1: entryRuleComparacionIndice returns [EObject current=null] : iv_ruleComparacionIndice= ruleComparacionIndice EOF ;
    public final EObject entryRuleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacionIndice = null;


        try {
            // InternalVaryGrammar.g:5176:2: (iv_ruleComparacionIndice= ruleComparacionIndice EOF )
            // InternalVaryGrammar.g:5177:2: iv_ruleComparacionIndice= ruleComparacionIndice EOF
            {
             newCompositeNode(grammarAccess.getComparacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparacionIndice=ruleComparacionIndice();

            state._fsp--;

             current =iv_ruleComparacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparacionIndice"


    // $ANTLR start "ruleComparacionIndice"
    // InternalVaryGrammar.g:5184:1: ruleComparacionIndice returns [EObject current=null] : (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) ;
    public final EObject ruleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_SumaRestaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5187:28: ( (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) )
            // InternalVaryGrammar.g:5188:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5188:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            // InternalVaryGrammar.g:5189:5: this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSumaRestaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_71);
            this_SumaRestaIndice_0=ruleSumaRestaIndice();

            state._fsp--;

             
                    current = this_SumaRestaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5197:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=96 && LA101_0<=99)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalVaryGrammar.g:5197:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5197:2: ()
            	    // InternalVaryGrammar.g:5198:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionIndiceAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:5203:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // InternalVaryGrammar.g:5204:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // InternalVaryGrammar.g:5204:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // InternalVaryGrammar.g:5205:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_signo_op_2_0=rulesignoComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.signoComparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // InternalVaryGrammar.g:5221:2: ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    // InternalVaryGrammar.g:5222:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    {
            	    // InternalVaryGrammar.g:5222:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    // InternalVaryGrammar.g:5223:3: lv_right_3_0= ruleSumaRestaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getRightSumaRestaIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_71);
            	    lv_right_3_0=ruleSumaRestaIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.SumaRestaIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparacionIndice"


    // $ANTLR start "entryRuleSumaRestaIndice"
    // InternalVaryGrammar.g:5247:1: entryRuleSumaRestaIndice returns [EObject current=null] : iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF ;
    public final EObject entryRuleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaRestaIndice = null;


        try {
            // InternalVaryGrammar.g:5248:2: (iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF )
            // InternalVaryGrammar.g:5249:2: iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSumaRestaIndice=ruleSumaRestaIndice();

            state._fsp--;

             current =iv_ruleSumaRestaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumaRestaIndice"


    // $ANTLR start "ruleSumaRestaIndice"
    // InternalVaryGrammar.g:5256:1: ruleSumaRestaIndice returns [EObject current=null] : (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) ;
    public final EObject ruleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivisionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5259:28: ( (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) )
            // InternalVaryGrammar.g:5260:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5260:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            // InternalVaryGrammar.g:5261:5: this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getMultiplicacionDivisionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_72);
            this_MultiplicacionDivisionIndice_0=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             
                    current = this_MultiplicacionDivisionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5269:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( ((LA103_0>=100 && LA103_0<=101)) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalVaryGrammar.g:5269:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5269:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==100) ) {
            	        alt102=1;
            	    }
            	    else if ( (LA102_0==101) ) {
            	        alt102=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 102, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // InternalVaryGrammar.g:5269:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // InternalVaryGrammar.g:5269:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // InternalVaryGrammar.g:5269:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // InternalVaryGrammar.g:5269:4: ()
            	            // InternalVaryGrammar.g:5270:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5275:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // InternalVaryGrammar.g:5276:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // InternalVaryGrammar.g:5276:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // InternalVaryGrammar.g:5277:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_75);
            	            lv_signo_op_2_0=rulesignoSuma();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoSuma");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalVaryGrammar.g:5294:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // InternalVaryGrammar.g:5294:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // InternalVaryGrammar.g:5294:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // InternalVaryGrammar.g:5294:7: ()
            	            // InternalVaryGrammar.g:5295:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5300:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // InternalVaryGrammar.g:5301:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // InternalVaryGrammar.g:5301:1: (lv_signo_op_4_0= rulesignoResta )
            	            // InternalVaryGrammar.g:5302:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_75);
            	            lv_signo_op_4_0=rulesignoResta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoResta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVaryGrammar.g:5318:4: ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    // InternalVaryGrammar.g:5319:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    {
            	    // InternalVaryGrammar.g:5319:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    // InternalVaryGrammar.g:5320:3: lv_right_5_0= ruleMultiplicacionDivisionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getRightMultiplicacionDivisionIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_right_5_0=ruleMultiplicacionDivisionIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.MultiplicacionDivisionIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumaRestaIndice"


    // $ANTLR start "entryRuleMultiplicacionDivisionIndice"
    // InternalVaryGrammar.g:5344:1: entryRuleMultiplicacionDivisionIndice returns [EObject current=null] : iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF ;
    public final EObject entryRuleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivisionIndice = null;


        try {
            // InternalVaryGrammar.g:5345:2: (iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF )
            // InternalVaryGrammar.g:5346:2: iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicacionDivisionIndice=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             current =iv_ruleMultiplicacionDivisionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicacionDivisionIndice"


    // $ANTLR start "ruleMultiplicacionDivisionIndice"
    // InternalVaryGrammar.g:5353:1: ruleMultiplicacionDivisionIndice returns [EObject current=null] : (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) ;
    public final EObject ruleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_PrimariaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5356:28: ( (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) )
            // InternalVaryGrammar.g:5357:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5357:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            // InternalVaryGrammar.g:5358:5: this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getPrimariaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_73);
            this_PrimariaIndice_0=rulePrimariaIndice();

            state._fsp--;

             
                    current = this_PrimariaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5366:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( ((LA105_0>=102 && LA105_0<=103)||LA105_0==105) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalVaryGrammar.g:5366:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5366:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt104=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt104=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt104=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt104=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 104, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt104) {
            	        case 1 :
            	            // InternalVaryGrammar.g:5366:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // InternalVaryGrammar.g:5366:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // InternalVaryGrammar.g:5366:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // InternalVaryGrammar.g:5366:4: ()
            	            // InternalVaryGrammar.g:5367:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5372:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // InternalVaryGrammar.g:5373:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // InternalVaryGrammar.g:5373:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // InternalVaryGrammar.g:5374:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_75);
            	            lv_signo_op_2_0=rulesignoMultiplicacion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoMultiplicacion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalVaryGrammar.g:5391:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // InternalVaryGrammar.g:5391:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // InternalVaryGrammar.g:5391:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // InternalVaryGrammar.g:5391:7: ()
            	            // InternalVaryGrammar.g:5392:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionEnteraLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5397:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // InternalVaryGrammar.g:5398:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // InternalVaryGrammar.g:5398:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // InternalVaryGrammar.g:5399:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_75);
            	            lv_signo_op_4_0=rulesignoDivision();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoDivision");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalVaryGrammar.g:5416:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // InternalVaryGrammar.g:5416:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // InternalVaryGrammar.g:5416:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // InternalVaryGrammar.g:5416:7: ()
            	            // InternalVaryGrammar.g:5417:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionRealLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5422:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // InternalVaryGrammar.g:5423:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // InternalVaryGrammar.g:5423:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // InternalVaryGrammar.g:5424:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_75);
            	            lv_signo_op_6_0=rulesignoDiv();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_6_0, 
            	                    		"vary.pseudocodigo.dsl.c.VaryGrammar.signoDiv");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVaryGrammar.g:5440:4: ( (lv_right_7_0= rulePrimariaIndice ) )
            	    // InternalVaryGrammar.g:5441:1: (lv_right_7_0= rulePrimariaIndice )
            	    {
            	    // InternalVaryGrammar.g:5441:1: (lv_right_7_0= rulePrimariaIndice )
            	    // InternalVaryGrammar.g:5442:3: lv_right_7_0= rulePrimariaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getRightPrimariaIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_73);
            	    lv_right_7_0=rulePrimariaIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.PrimariaIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicacionDivisionIndice"


    // $ANTLR start "entryRulePrimariaIndice"
    // InternalVaryGrammar.g:5466:1: entryRulePrimariaIndice returns [EObject current=null] : iv_rulePrimariaIndice= rulePrimariaIndice EOF ;
    public final EObject entryRulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimariaIndice = null;


        try {
            // InternalVaryGrammar.g:5467:2: (iv_rulePrimariaIndice= rulePrimariaIndice EOF )
            // InternalVaryGrammar.g:5468:2: iv_rulePrimariaIndice= rulePrimariaIndice EOF
            {
             newCompositeNode(grammarAccess.getPrimariaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimariaIndice=rulePrimariaIndice();

            state._fsp--;

             current =iv_rulePrimariaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimariaIndice"


    // $ANTLR start "rulePrimariaIndice"
    // InternalVaryGrammar.g:5475:1: rulePrimariaIndice returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) ;
    public final EObject rulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5478:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:5479:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:5479:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_INT) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_ID||LA106_0==RULE_STRING) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalVaryGrammar.g:5479:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // InternalVaryGrammar.g:5479:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // InternalVaryGrammar.g:5479:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // InternalVaryGrammar.g:5479:3: ()
                    // InternalVaryGrammar.g:5480:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getEnteroAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5485:2: ( (lv_valor_1_0= ruleEInt ) )
                    // InternalVaryGrammar.g:5486:1: (lv_valor_1_0= ruleEInt )
                    {
                    // InternalVaryGrammar.g:5486:1: (lv_valor_1_0= ruleEInt )
                    // InternalVaryGrammar.g:5487:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valor_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaIndiceRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_1_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:5504:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:5504:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:5504:7: () ( (lv_nombre_3_0= ruleEString ) )
                    {
                    // InternalVaryGrammar.g:5504:7: ()
                    // InternalVaryGrammar.g:5505:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getVariableIDAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5510:2: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalVaryGrammar.g:5511:1: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5511:1: (lv_nombre_3_0= ruleEString )
                    // InternalVaryGrammar.g:5512:3: lv_nombre_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getNombreEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaIndiceRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimariaIndice"


    // $ANTLR start "entryRulePrimaria"
    // InternalVaryGrammar.g:5536:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // InternalVaryGrammar.g:5537:2: (iv_rulePrimaria= rulePrimaria EOF )
            // InternalVaryGrammar.g:5538:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaria"


    // $ANTLR start "rulePrimaria"
    // InternalVaryGrammar.g:5545:1: rulePrimaria returns [EObject current=null] : (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject this_VariablesBasicas_0 = null;

        EObject this_VariablesComplejas_1 = null;

        EObject this_Funciones_2 = null;

        EObject this_OperacionParentesis_3 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5548:28: ( (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) )
            // InternalVaryGrammar.g:5549:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            {
            // InternalVaryGrammar.g:5549:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            int alt107=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 113:
            case 114:
                {
                alt107=1;
                }
                break;
            case RULE_STRING:
                {
                int LA107_2 = input.LA(2);

                if ( (LA107_2==47||LA107_2==52) ) {
                    alt107=2;
                }
                else if ( (LA107_2==EOF||(LA107_2>=RULE_ID && LA107_2<=RULE_NOMBRE_FUN)||LA107_2==RULE_STRING||(LA107_2>=18 && LA107_2<=19)||(LA107_2>=26 && LA107_2<=29)||(LA107_2>=32 && LA107_2<=34)||(LA107_2>=37 && LA107_2<=46)||LA107_2==50||LA107_2==53||LA107_2==56||LA107_2==61||LA107_2==63||LA107_2==65||(LA107_2>=67 && LA107_2<=70)||(LA107_2>=72 && LA107_2<=105)||(LA107_2>=107 && LA107_2<=110)) ) {
                    alt107=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA107_3 = input.LA(2);

                if ( (LA107_3==47||LA107_3==52) ) {
                    alt107=2;
                }
                else if ( (LA107_3==EOF||(LA107_3>=RULE_ID && LA107_3<=RULE_NOMBRE_FUN)||LA107_3==RULE_STRING||(LA107_3>=18 && LA107_3<=19)||(LA107_3>=26 && LA107_3<=29)||(LA107_3>=32 && LA107_3<=34)||(LA107_3>=37 && LA107_3<=46)||LA107_3==50||LA107_3==53||LA107_3==56||LA107_3==61||LA107_3==63||LA107_3==65||(LA107_3>=67 && LA107_3<=70)||(LA107_3>=72 && LA107_3<=105)||(LA107_3>=107 && LA107_3<=110)) ) {
                    alt107=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOMBRE_FUN:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt107=3;
                }
                break;
            case 31:
                {
                alt107=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalVaryGrammar.g:5550:5: this_VariablesBasicas_0= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariablesBasicas_0=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:5560:5: this_VariablesComplejas_1= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariablesComplejas_1=ruleVariablesComplejas();

                    state._fsp--;

                     
                            current = this_VariablesComplejas_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:5570:5: this_Funciones_2= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Funciones_2=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:5580:5: this_OperacionParentesis_3= ruleOperacionParentesis
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParentesisParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperacionParentesis_3=ruleOperacionParentesis();

                    state._fsp--;

                     
                            current = this_OperacionParentesis_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaria"


    // $ANTLR start "entryRuleOperacionCompleta"
    // InternalVaryGrammar.g:5596:1: entryRuleOperacionCompleta returns [EObject current=null] : iv_ruleOperacionCompleta= ruleOperacionCompleta EOF ;
    public final EObject entryRuleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionCompleta = null;


        try {
            // InternalVaryGrammar.g:5597:2: (iv_ruleOperacionCompleta= ruleOperacionCompleta EOF )
            // InternalVaryGrammar.g:5598:2: iv_ruleOperacionCompleta= ruleOperacionCompleta EOF
            {
             newCompositeNode(grammarAccess.getOperacionCompletaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperacionCompleta=ruleOperacionCompleta();

            state._fsp--;

             current =iv_ruleOperacionCompleta; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionCompleta"


    // $ANTLR start "ruleOperacionCompleta"
    // InternalVaryGrammar.g:5605:1: ruleOperacionCompleta returns [EObject current=null] : ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleOperacion ) ) ) ;
    public final EObject ruleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesIniciales_1_0=null;
        Token lv_negacionesIniciales_2_0=null;
        EObject lv_valor_operacion_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5608:28: ( ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleOperacion ) ) ) )
            // InternalVaryGrammar.g:5609:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleOperacion ) ) )
            {
            // InternalVaryGrammar.g:5609:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleOperacion ) ) )
            // InternalVaryGrammar.g:5609:2: () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleOperacion ) )
            {
            // InternalVaryGrammar.g:5609:2: ()
            // InternalVaryGrammar.g:5610:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionCompletaAccess().getOperacionCompletaAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:5615:2: ( (lv_negacionesIniciales_1_0= '-' ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==101) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalVaryGrammar.g:5616:1: (lv_negacionesIniciales_1_0= '-' )
            	    {
            	    // InternalVaryGrammar.g:5616:1: (lv_negacionesIniciales_1_0= '-' )
            	    // InternalVaryGrammar.g:5617:3: lv_negacionesIniciales_1_0= '-'
            	    {
            	    lv_negacionesIniciales_1_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	            newLeafNode(lv_negacionesIniciales_1_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesHyphenMinusKeyword_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_1_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
                }
            } while (true);

            // InternalVaryGrammar.g:5630:3: ( (lv_negacionesIniciales_2_0= 'no' ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==106) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalVaryGrammar.g:5631:1: (lv_negacionesIniciales_2_0= 'no' )
            	    {
            	    // InternalVaryGrammar.g:5631:1: (lv_negacionesIniciales_2_0= 'no' )
            	    // InternalVaryGrammar.g:5632:3: lv_negacionesIniciales_2_0= 'no'
            	    {
            	    lv_negacionesIniciales_2_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	            newLeafNode(lv_negacionesIniciales_2_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesNoKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_2_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            // InternalVaryGrammar.g:5645:3: ( (lv_valor_operacion_3_0= ruleOperacion ) )
            // InternalVaryGrammar.g:5646:1: (lv_valor_operacion_3_0= ruleOperacion )
            {
            // InternalVaryGrammar.g:5646:1: (lv_valor_operacion_3_0= ruleOperacion )
            // InternalVaryGrammar.g:5647:3: lv_valor_operacion_3_0= ruleOperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionCompletaAccess().getValor_operacionOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_valor_operacion_3_0=ruleOperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionCompletaRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionCompleta"


    // $ANTLR start "entryRuleOperacionParentesis"
    // InternalVaryGrammar.g:5671:1: entryRuleOperacionParentesis returns [EObject current=null] : iv_ruleOperacionParentesis= ruleOperacionParentesis EOF ;
    public final EObject entryRuleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionParentesis = null;


        try {
            // InternalVaryGrammar.g:5672:2: (iv_ruleOperacionParentesis= ruleOperacionParentesis EOF )
            // InternalVaryGrammar.g:5673:2: iv_ruleOperacionParentesis= ruleOperacionParentesis EOF
            {
             newCompositeNode(grammarAccess.getOperacionParentesisRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperacionParentesis=ruleOperacionParentesis();

            state._fsp--;

             current =iv_ruleOperacionParentesis; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperacionParentesis"


    // $ANTLR start "ruleOperacionParentesis"
    // InternalVaryGrammar.g:5680:1: ruleOperacionParentesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleOperacion ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_negacionesFinales_2_0=null;
        Token lv_negacionesFinales_3_0=null;
        Token otherlv_5=null;
        EObject lv_valor_operacion_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5683:28: ( ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleOperacion ) ) otherlv_5= ')' ) )
            // InternalVaryGrammar.g:5684:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleOperacion ) ) otherlv_5= ')' )
            {
            // InternalVaryGrammar.g:5684:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleOperacion ) ) otherlv_5= ')' )
            // InternalVaryGrammar.g:5684:2: () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleOperacion ) ) otherlv_5= ')'
            {
            // InternalVaryGrammar.g:5684:2: ()
            // InternalVaryGrammar.g:5685:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionParentesisAccess().getOperacionParentesisAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_53); 

                	newLeafNode(otherlv_1, grammarAccess.getOperacionParentesisAccess().getLeftParenthesisKeyword_1());
                
            // InternalVaryGrammar.g:5694:1: ( (lv_negacionesFinales_2_0= '-' ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==101) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalVaryGrammar.g:5695:1: (lv_negacionesFinales_2_0= '-' )
            	    {
            	    // InternalVaryGrammar.g:5695:1: (lv_negacionesFinales_2_0= '-' )
            	    // InternalVaryGrammar.g:5696:3: lv_negacionesFinales_2_0= '-'
            	    {
            	    lv_negacionesFinales_2_0=(Token)match(input,101,FollowSets000.FOLLOW_53); 

            	            newLeafNode(lv_negacionesFinales_2_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesHyphenMinusKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_2_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            // InternalVaryGrammar.g:5709:3: ( (lv_negacionesFinales_3_0= 'no' ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==106) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalVaryGrammar.g:5710:1: (lv_negacionesFinales_3_0= 'no' )
            	    {
            	    // InternalVaryGrammar.g:5710:1: (lv_negacionesFinales_3_0= 'no' )
            	    // InternalVaryGrammar.g:5711:3: lv_negacionesFinales_3_0= 'no'
            	    {
            	    lv_negacionesFinales_3_0=(Token)match(input,106,FollowSets000.FOLLOW_53); 

            	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesNoKeyword_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop111;
                }
            } while (true);

            // InternalVaryGrammar.g:5724:3: ( (lv_valor_operacion_4_0= ruleOperacion ) )
            // InternalVaryGrammar.g:5725:1: (lv_valor_operacion_4_0= ruleOperacion )
            {
            // InternalVaryGrammar.g:5725:1: (lv_valor_operacion_4_0= ruleOperacion )
            // InternalVaryGrammar.g:5726:3: lv_valor_operacion_4_0= ruleOperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionParentesisAccess().getValor_operacionOperacionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_valor_operacion_4_0=ruleOperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionParentesisRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_4_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getOperacionParentesisAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperacionParentesis"


    // $ANTLR start "entryRuleFunciones"
    // InternalVaryGrammar.g:5754:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // InternalVaryGrammar.g:5755:2: (iv_ruleFunciones= ruleFunciones EOF )
            // InternalVaryGrammar.g:5756:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunciones"


    // $ANTLR start "ruleFunciones"
    // InternalVaryGrammar.g:5763:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) ) ;
    public final EObject ruleFunciones() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parametros_2_0 = null;

        EObject lv_parametros_4_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;

        EObject lv_parametros_8_0 = null;

        EObject lv_parametros_10_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5766:28: ( ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) ) )
            // InternalVaryGrammar.g:5767:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) )
            {
            // InternalVaryGrammar.g:5767:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_NOMBRE_FUN) ) {
                alt116=1;
            }
            else if ( ((LA116_0>=37 && LA116_0<=46)) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalVaryGrammar.g:5767:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalVaryGrammar.g:5767:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' )
                    // InternalVaryGrammar.g:5767:3: () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')'
                    {
                    // InternalVaryGrammar.g:5767:3: ()
                    // InternalVaryGrammar.g:5768:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5773:2: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
                    // InternalVaryGrammar.g:5774:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    {
                    // InternalVaryGrammar.g:5774:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    // InternalVaryGrammar.g:5775:3: lv_nombre_1_0= RULE_NOMBRE_FUN
                    {
                    lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_76); 

                    			newLeafNode(lv_nombre_1_0, grammarAccess.getFuncionesAccess().getNombreNOMBRE_FUNTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFuncionesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.NOMBRE_FUN");
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:5791:2: ( ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )* )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( ((LA113_0>=RULE_ID && LA113_0<=RULE_CAR)||LA113_0==31||(LA113_0>=37 && LA113_0<=46)||LA113_0==101||LA113_0==106||(LA113_0>=113 && LA113_0<=114)) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // InternalVaryGrammar.g:5791:3: ( (lv_parametros_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )*
                            {
                            // InternalVaryGrammar.g:5791:3: ( (lv_parametros_2_0= ruleOperacionCompleta ) )
                            // InternalVaryGrammar.g:5792:1: (lv_parametros_2_0= ruleOperacionCompleta )
                            {
                            // InternalVaryGrammar.g:5792:1: (lv_parametros_2_0= ruleOperacionCompleta )
                            // InternalVaryGrammar.g:5793:3: lv_parametros_2_0= ruleOperacionCompleta
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getParametrosOperacionCompletaParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_26);
                            lv_parametros_2_0=ruleOperacionCompleta();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parametros",
                                    		lv_parametros_2_0, 
                                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalVaryGrammar.g:5809:2: (otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) ) )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( (LA112_0==28) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // InternalVaryGrammar.g:5809:4: otherlv_3= ',' ( (lv_parametros_4_0= ruleOperacionCompleta ) )
                            	    {
                            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_53); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getFuncionesAccess().getCommaKeyword_0_2_1_0());
                            	        
                            	    // InternalVaryGrammar.g:5813:1: ( (lv_parametros_4_0= ruleOperacionCompleta ) )
                            	    // InternalVaryGrammar.g:5814:1: (lv_parametros_4_0= ruleOperacionCompleta )
                            	    {
                            	    // InternalVaryGrammar.g:5814:1: (lv_parametros_4_0= ruleOperacionCompleta )
                            	    // InternalVaryGrammar.g:5815:3: lv_parametros_4_0= ruleOperacionCompleta
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getParametrosOperacionCompletaParserRuleCall_0_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_parametros_4_0=ruleOperacionCompleta();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parametros",
                            	            		lv_parametros_4_0, 
                            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop112;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:5836:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' )
                    {
                    // InternalVaryGrammar.g:5836:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' )
                    // InternalVaryGrammar.g:5836:7: () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')'
                    {
                    // InternalVaryGrammar.g:5836:7: ()
                    // InternalVaryGrammar.g:5837:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getFuncionInternaAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5842:2: ( (lv_nombre_7_0= ruleNombreInterna ) )
                    // InternalVaryGrammar.g:5843:1: (lv_nombre_7_0= ruleNombreInterna )
                    {
                    // InternalVaryGrammar.g:5843:1: (lv_nombre_7_0= ruleNombreInterna )
                    // InternalVaryGrammar.g:5844:3: lv_nombre_7_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_76);
                    lv_nombre_7_0=ruleNombreInterna();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_7_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.NombreInterna");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:5860:2: ( ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )* )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( ((LA115_0>=RULE_ID && LA115_0<=RULE_CAR)||LA115_0==31||(LA115_0>=37 && LA115_0<=46)||LA115_0==101||LA115_0==106||(LA115_0>=113 && LA115_0<=114)) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // InternalVaryGrammar.g:5860:3: ( (lv_parametros_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )*
                            {
                            // InternalVaryGrammar.g:5860:3: ( (lv_parametros_8_0= ruleOperacionCompleta ) )
                            // InternalVaryGrammar.g:5861:1: (lv_parametros_8_0= ruleOperacionCompleta )
                            {
                            // InternalVaryGrammar.g:5861:1: (lv_parametros_8_0= ruleOperacionCompleta )
                            // InternalVaryGrammar.g:5862:3: lv_parametros_8_0= ruleOperacionCompleta
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getParametrosOperacionCompletaParserRuleCall_1_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_26);
                            lv_parametros_8_0=ruleOperacionCompleta();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parametros",
                                    		lv_parametros_8_0, 
                                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalVaryGrammar.g:5878:2: (otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) ) )*
                            loop114:
                            do {
                                int alt114=2;
                                int LA114_0 = input.LA(1);

                                if ( (LA114_0==28) ) {
                                    alt114=1;
                                }


                                switch (alt114) {
                            	case 1 :
                            	    // InternalVaryGrammar.g:5878:4: otherlv_9= ',' ( (lv_parametros_10_0= ruleOperacionCompleta ) )
                            	    {
                            	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_53); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getCommaKeyword_1_2_1_0());
                            	        
                            	    // InternalVaryGrammar.g:5882:1: ( (lv_parametros_10_0= ruleOperacionCompleta ) )
                            	    // InternalVaryGrammar.g:5883:1: (lv_parametros_10_0= ruleOperacionCompleta )
                            	    {
                            	    // InternalVaryGrammar.g:5883:1: (lv_parametros_10_0= ruleOperacionCompleta )
                            	    // InternalVaryGrammar.g:5884:3: lv_parametros_10_0= ruleOperacionCompleta
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getParametrosOperacionCompletaParserRuleCall_1_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_parametros_10_0=ruleOperacionCompleta();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parametros",
                            	            		lv_parametros_10_0, 
                            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop114;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunciones"


    // $ANTLR start "entryRuleCampoRegistro"
    // InternalVaryGrammar.g:5912:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // InternalVaryGrammar.g:5913:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // InternalVaryGrammar.g:5914:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCampoRegistro"


    // $ANTLR start "ruleCampoRegistro"
    // InternalVaryGrammar.g:5921:1: ruleCampoRegistro returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nombre_campo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_campo_3_0 = null;

        EObject lv_primerIndice_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_campo_8_0 = null;

        EObject lv_primerIndice_10_0 = null;

        EObject lv_segundoIndice_12_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5924:28: ( ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' ) ) )
            // InternalVaryGrammar.g:5925:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' ) )
            {
            // InternalVaryGrammar.g:5925:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' ) )
            int alt117=3;
            alt117 = dfa117.predict(input);
            switch (alt117) {
                case 1 :
                    // InternalVaryGrammar.g:5925:2: (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:5925:2: (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:5925:4: otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_0_0());
                        
                    // InternalVaryGrammar.g:5929:1: ( (lv_nombre_campo_1_0= ruleEString ) )
                    // InternalVaryGrammar.g:5930:1: (lv_nombre_campo_1_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5930:1: (lv_nombre_campo_1_0= ruleEString )
                    // InternalVaryGrammar.g:5931:3: lv_nombre_campo_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_nombre_campo_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_campo",
                            		lv_nombre_campo_1_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:5948:6: (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' )
                    {
                    // InternalVaryGrammar.g:5948:6: (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' )
                    // InternalVaryGrammar.g:5948:8: otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_1_0());
                        
                    // InternalVaryGrammar.g:5952:1: ( (lv_nombre_campo_3_0= ruleEString ) )
                    // InternalVaryGrammar.g:5953:1: (lv_nombre_campo_3_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5953:1: (lv_nombre_campo_3_0= ruleEString )
                    // InternalVaryGrammar.g:5954:3: lv_nombre_campo_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_nombre_campo_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_campo",
                            		lv_nombre_campo_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_4, grammarAccess.getCampoRegistroAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // InternalVaryGrammar.g:5974:1: ( (lv_primerIndice_5_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:5975:1: (lv_primerIndice_5_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:5975:1: (lv_primerIndice_5_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:5976:3: lv_primerIndice_5_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_primerIndice_5_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_5_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getCampoRegistroAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:5997:6: (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' )
                    {
                    // InternalVaryGrammar.g:5997:6: (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' )
                    // InternalVaryGrammar.g:5997:8: otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_7, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_2_0());
                        
                    // InternalVaryGrammar.g:6001:1: ( (lv_nombre_campo_8_0= ruleEString ) )
                    // InternalVaryGrammar.g:6002:1: (lv_nombre_campo_8_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6002:1: (lv_nombre_campo_8_0= ruleEString )
                    // InternalVaryGrammar.g:6003:3: lv_nombre_campo_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_nombre_campo_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_campo",
                            		lv_nombre_campo_8_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_9, grammarAccess.getCampoRegistroAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // InternalVaryGrammar.g:6023:1: ( (lv_primerIndice_10_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:6024:1: (lv_primerIndice_10_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:6024:1: (lv_primerIndice_10_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:6025:3: lv_primerIndice_10_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getPrimerIndiceOperacionIndiceParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_primerIndice_10_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_10_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,56,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_11, grammarAccess.getCampoRegistroAccess().getRightSquareBracketLeftSquareBracketKeyword_2_4());
                        
                    // InternalVaryGrammar.g:6045:1: ( (lv_segundoIndice_12_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:6046:1: (lv_segundoIndice_12_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:6046:1: (lv_segundoIndice_12_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:6047:3: lv_segundoIndice_12_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getSegundoIndiceOperacionIndiceParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_segundoIndice_12_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_12_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,53,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_13, grammarAccess.getCampoRegistroAccess().getRightSquareBracketKeyword_2_6());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCampoRegistro"


    // $ANTLR start "entryRuleVariablesComplejas"
    // InternalVaryGrammar.g:6075:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // InternalVaryGrammar.g:6076:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // InternalVaryGrammar.g:6077:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariablesComplejas"


    // $ANTLR start "ruleVariablesComplejas"
    // InternalVaryGrammar.g:6084:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ ) ) ;
    public final EObject ruleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_nombre_vector_1_0 = null;

        EObject lv_indice_3_0 = null;

        EObject lv_campos_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_matriz_7_0 = null;

        EObject lv_primerIndice_9_0 = null;

        EObject lv_segundoIndice_11_0 = null;

        EObject lv_campos_13_0 = null;

        AntlrDatatypeRuleToken lv_nombre_registro_15_0 = null;

        EObject lv_campos_16_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6087:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ ) ) )
            // InternalVaryGrammar.g:6088:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ ) )
            {
            // InternalVaryGrammar.g:6088:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ ) )
            int alt121=3;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // InternalVaryGrammar.g:6088:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* )
                    {
                    // InternalVaryGrammar.g:6088:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* )
                    // InternalVaryGrammar.g:6088:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )*
                    {
                    // InternalVaryGrammar.g:6088:3: ()
                    // InternalVaryGrammar.g:6089:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6094:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' )
                    // InternalVaryGrammar.g:6094:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']'
                    {
                    // InternalVaryGrammar.g:6094:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // InternalVaryGrammar.g:6095:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6095:1: (lv_nombre_vector_1_0= ruleEString )
                    // InternalVaryGrammar.g:6096:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_nombre_vector_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_vector",
                            		lv_nombre_vector_1_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // InternalVaryGrammar.g:6116:1: ( (lv_indice_3_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:6117:1: (lv_indice_3_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:6117:1: (lv_indice_3_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:6118:3: lv_indice_3_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceOperacionIndiceParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_indice_3_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_77); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // InternalVaryGrammar.g:6138:2: ( (lv_campos_5_0= ruleCampoRegistro ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==47) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6139:1: (lv_campos_5_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:6139:1: (lv_campos_5_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:6140:3: lv_campos_5_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCamposCampoRegistroParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campos_5_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campos",
                    	            		lv_campos_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:6157:6: ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* )
                    {
                    // InternalVaryGrammar.g:6157:6: ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* )
                    // InternalVaryGrammar.g:6157:7: () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )*
                    {
                    // InternalVaryGrammar.g:6157:7: ()
                    // InternalVaryGrammar.g:6158:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6163:2: ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' )
                    // InternalVaryGrammar.g:6163:3: ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']'
                    {
                    // InternalVaryGrammar.g:6163:3: ( (lv_nombre_matriz_7_0= ruleEString ) )
                    // InternalVaryGrammar.g:6164:1: (lv_nombre_matriz_7_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6164:1: (lv_nombre_matriz_7_0= ruleEString )
                    // InternalVaryGrammar.g:6165:3: lv_nombre_matriz_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_nombre_matriz_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_matriz",
                            		lv_nombre_matriz_7_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,52,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // InternalVaryGrammar.g:6185:1: ( (lv_primerIndice_9_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:6186:1: (lv_primerIndice_9_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:6186:1: (lv_primerIndice_9_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:6187:3: lv_primerIndice_9_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_43);
                    lv_primerIndice_9_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_9_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,56,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // InternalVaryGrammar.g:6207:1: ( (lv_segundoIndice_11_0= ruleOperacionIndice ) )
                    // InternalVaryGrammar.g:6208:1: (lv_segundoIndice_11_0= ruleOperacionIndice )
                    {
                    // InternalVaryGrammar.g:6208:1: (lv_segundoIndice_11_0= ruleOperacionIndice )
                    // InternalVaryGrammar.g:6209:3: lv_segundoIndice_11_0= ruleOperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceOperacionIndiceParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_40);
                    lv_segundoIndice_11_0=ruleOperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_11_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,53,FollowSets000.FOLLOW_77); 

                        	newLeafNode(otherlv_12, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // InternalVaryGrammar.g:6229:2: ( (lv_campos_13_0= ruleCampoRegistro ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==47) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6230:1: (lv_campos_13_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:6230:1: (lv_campos_13_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:6231:3: lv_campos_13_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCamposCampoRegistroParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campos_13_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campos",
                    	            		lv_campos_13_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:6248:6: ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ )
                    {
                    // InternalVaryGrammar.g:6248:6: ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ )
                    // InternalVaryGrammar.g:6248:7: () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+
                    {
                    // InternalVaryGrammar.g:6248:7: ()
                    // InternalVaryGrammar.g:6249:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6254:2: ( (lv_nombre_registro_15_0= ruleEString ) )
                    // InternalVaryGrammar.g:6255:1: (lv_nombre_registro_15_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6255:1: (lv_nombre_registro_15_0= ruleEString )
                    // InternalVaryGrammar.g:6256:3: lv_nombre_registro_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_nombre_registro_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_registro",
                            		lv_nombre_registro_15_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:6272:2: ( (lv_campos_16_0= ruleCampoRegistro ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==47) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6273:1: (lv_campos_16_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:6273:1: (lv_campos_16_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:6274:3: lv_campos_16_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCamposCampoRegistroParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campos_16_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campos",
                    	            		lv_campos_16_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariablesComplejas"


    // $ANTLR start "entryRuleVariablesBasicas"
    // InternalVaryGrammar.g:6298:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // InternalVaryGrammar.g:6299:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // InternalVaryGrammar.g:6300:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariablesBasicas"


    // $ANTLR start "ruleVariablesBasicas"
    // InternalVaryGrammar.g:6307:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_valor_5_0= RULE_CAD ) ) ) | ( () ( (lv_valor_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
    public final EObject ruleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        Token lv_valor_5_0=null;
        Token lv_valor_7_0=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_valor_3_0 = null;

        AntlrDatatypeRuleToken lv_valor_9_0 = null;

        AntlrDatatypeRuleToken lv_nombre_11_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6310:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_valor_5_0= RULE_CAD ) ) ) | ( () ( (lv_valor_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:6311:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_valor_5_0= RULE_CAD ) ) ) | ( () ( (lv_valor_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:6311:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_valor_5_0= RULE_CAD ) ) ) | ( () ( (lv_valor_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==47) ) {
                    alt122=2;
                }
                else if ( (LA122_1==EOF||(LA122_1>=RULE_ID && LA122_1<=RULE_NOMBRE_FUN)||LA122_1==RULE_STRING||(LA122_1>=18 && LA122_1<=19)||(LA122_1>=26 && LA122_1<=29)||(LA122_1>=32 && LA122_1<=34)||(LA122_1>=37 && LA122_1<=46)||LA122_1==50||LA122_1==53||LA122_1==56||LA122_1==61||LA122_1==63||LA122_1==65||(LA122_1>=67 && LA122_1<=70)||(LA122_1>=72 && LA122_1<=105)||(LA122_1>=107 && LA122_1<=110)) ) {
                    alt122=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt122=3;
                }
                break;
            case RULE_CAR:
                {
                alt122=4;
                }
                break;
            case 113:
            case 114:
                {
                alt122=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt122=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalVaryGrammar.g:6311:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // InternalVaryGrammar.g:6311:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // InternalVaryGrammar.g:6311:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // InternalVaryGrammar.g:6311:3: ()
                    // InternalVaryGrammar.g:6312:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getEnteroAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6317:2: ( (lv_valor_1_0= ruleEInt ) )
                    // InternalVaryGrammar.g:6318:1: (lv_valor_1_0= ruleEInt )
                    {
                    // InternalVaryGrammar.g:6318:1: (lv_valor_1_0= ruleEInt )
                    // InternalVaryGrammar.g:6319:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valor_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_1_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:6336:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // InternalVaryGrammar.g:6336:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // InternalVaryGrammar.g:6336:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // InternalVaryGrammar.g:6336:7: ()
                    // InternalVaryGrammar.g:6337:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getRealAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6342:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // InternalVaryGrammar.g:6343:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // InternalVaryGrammar.g:6343:1: (lv_valor_3_0= ruleEFloat )
                    // InternalVaryGrammar.g:6344:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valor_3_0=ruleEFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EFloat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:6361:6: ( () ( (lv_valor_5_0= RULE_CAD ) ) )
                    {
                    // InternalVaryGrammar.g:6361:6: ( () ( (lv_valor_5_0= RULE_CAD ) ) )
                    // InternalVaryGrammar.g:6361:7: () ( (lv_valor_5_0= RULE_CAD ) )
                    {
                    // InternalVaryGrammar.g:6361:7: ()
                    // InternalVaryGrammar.g:6362:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCadenaCaracteresAction_2_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6367:2: ( (lv_valor_5_0= RULE_CAD ) )
                    // InternalVaryGrammar.g:6368:1: (lv_valor_5_0= RULE_CAD )
                    {
                    // InternalVaryGrammar.g:6368:1: (lv_valor_5_0= RULE_CAD )
                    // InternalVaryGrammar.g:6369:3: lv_valor_5_0= RULE_CAD
                    {
                    lv_valor_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_valor_5_0, grammarAccess.getVariablesBasicasAccess().getValorCADTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valor",
                            		lv_valor_5_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.CAD");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:6386:6: ( () ( (lv_valor_7_0= RULE_CAR ) ) )
                    {
                    // InternalVaryGrammar.g:6386:6: ( () ( (lv_valor_7_0= RULE_CAR ) ) )
                    // InternalVaryGrammar.g:6386:7: () ( (lv_valor_7_0= RULE_CAR ) )
                    {
                    // InternalVaryGrammar.g:6386:7: ()
                    // InternalVaryGrammar.g:6387:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6392:2: ( (lv_valor_7_0= RULE_CAR ) )
                    // InternalVaryGrammar.g:6393:1: (lv_valor_7_0= RULE_CAR )
                    {
                    // InternalVaryGrammar.g:6393:1: (lv_valor_7_0= RULE_CAR )
                    // InternalVaryGrammar.g:6394:3: lv_valor_7_0= RULE_CAR
                    {
                    lv_valor_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_valor_7_0, grammarAccess.getVariablesBasicasAccess().getValorCARTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valor",
                            		lv_valor_7_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.CAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:6411:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    {
                    // InternalVaryGrammar.g:6411:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    // InternalVaryGrammar.g:6411:7: () ( (lv_valor_9_0= ruleBooleano ) )
                    {
                    // InternalVaryGrammar.g:6411:7: ()
                    // InternalVaryGrammar.g:6412:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getLogicoAction_4_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6417:2: ( (lv_valor_9_0= ruleBooleano ) )
                    // InternalVaryGrammar.g:6418:1: (lv_valor_9_0= ruleBooleano )
                    {
                    // InternalVaryGrammar.g:6418:1: (lv_valor_9_0= ruleBooleano )
                    // InternalVaryGrammar.g:6419:3: lv_valor_9_0= ruleBooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_valor_9_0=ruleBooleano();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_9_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Booleano");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:6436:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:6436:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:6436:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // InternalVaryGrammar.g:6436:7: ()
                    // InternalVaryGrammar.g:6437:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6442:2: ( (lv_nombre_11_0= ruleEString ) )
                    // InternalVaryGrammar.g:6443:1: (lv_nombre_11_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6443:1: (lv_nombre_11_0= ruleEString )
                    // InternalVaryGrammar.g:6444:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_nombre_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_11_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariablesBasicas"


    // $ANTLR start "entryRuleSino"
    // InternalVaryGrammar.g:6468:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // InternalVaryGrammar.g:6469:2: (iv_ruleSino= ruleSino EOF )
            // InternalVaryGrammar.g:6470:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSino"


    // $ANTLR start "ruleSino"
    // InternalVaryGrammar.g:6477:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencia ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6480:28: ( ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencia ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? ) )
            // InternalVaryGrammar.g:6481:1: ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencia ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? )
            {
            // InternalVaryGrammar.g:6481:1: ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencia ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? )
            // InternalVaryGrammar.g:6481:2: () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencia ) )* ( (lv_devuelve_3_0= ruleDevolver ) )?
            {
            // InternalVaryGrammar.g:6481:2: ()
            // InternalVaryGrammar.g:6482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_63); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSi_noKeyword_1());
                
            // InternalVaryGrammar.g:6491:1: ( (lv_sentencias_2_0= ruleSentencia ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=RULE_ID && LA123_0<=RULE_NOMBRE_FUN)||LA123_0==RULE_STRING||(LA123_0>=33 && LA123_0<=34)||(LA123_0>=37 && LA123_0<=46)||(LA123_0>=67 && LA123_0<=70)||(LA123_0>=73 && LA123_0<=74)||LA123_0==77||LA123_0==80||(LA123_0>=84 && LA123_0<=85)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalVaryGrammar.g:6492:1: (lv_sentencias_2_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:6492:1: (lv_sentencias_2_0= ruleSentencia )
            	    // InternalVaryGrammar.g:6493:3: lv_sentencias_2_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciaParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_sentencias_2_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSinoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            // InternalVaryGrammar.g:6509:3: ( (lv_devuelve_3_0= ruleDevolver ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==108) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalVaryGrammar.g:6510:1: (lv_devuelve_3_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:6510:1: (lv_devuelve_3_0= ruleDevolver )
                    // InternalVaryGrammar.g:6511:3: lv_devuelve_3_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_devuelve_3_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSino"


    // $ANTLR start "entryRuleDevolver"
    // InternalVaryGrammar.g:6535:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // InternalVaryGrammar.g:6536:2: (iv_ruleDevolver= ruleDevolver EOF )
            // InternalVaryGrammar.g:6537:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevolver"


    // $ANTLR start "ruleDevolver"
    // InternalVaryGrammar.g:6544:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6547:28: ( ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:6548:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:6548:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:6548:2: () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:6548:2: ()
            // InternalVaryGrammar.g:6549:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,108,FollowSets000.FOLLOW_53); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            // InternalVaryGrammar.g:6558:1: ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:6559:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:6559:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:6560:3: lv_devuelve_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_devuelve_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevolver"


    // $ANTLR start "entryRuleParametro"
    // InternalVaryGrammar.g:6584:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalVaryGrammar.g:6585:2: (iv_ruleParametro= ruleParametro EOF )
            // InternalVaryGrammar.g:6586:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalVaryGrammar.g:6593:1: ruleParametro returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6596:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalVaryGrammar.g:6597:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // InternalVaryGrammar.g:6597:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // InternalVaryGrammar.g:6597:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // InternalVaryGrammar.g:6597:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // InternalVaryGrammar.g:6598:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // InternalVaryGrammar.g:6598:1: (lv_paso_0_0= ruleTipoPaso )
            // InternalVaryGrammar.g:6599:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_42);
            lv_paso_0_0=ruleTipoPaso();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroRule());
            	        }
                   		set(
                   			current, 
                   			"paso",
                    		lv_paso_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoPaso");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:6615:2: ( (lv_tipo_1_0= ruleTipo ) )
            // InternalVaryGrammar.g:6616:1: (lv_tipo_1_0= ruleTipo )
            {
            // InternalVaryGrammar.g:6616:1: (lv_tipo_1_0= ruleTipo )
            // InternalVaryGrammar.g:6617:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:6637:1: ( (lv_variable_3_0= ruleVariable ) )
            // InternalVaryGrammar.g:6638:1: (lv_variable_3_0= ruleVariable )
            {
            // InternalVaryGrammar.g:6638:1: (lv_variable_3_0= ruleVariable )
            // InternalVaryGrammar.g:6639:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleFuncion"
    // InternalVaryGrammar.g:6663:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalVaryGrammar.g:6664:2: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalVaryGrammar.g:6665:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // InternalVaryGrammar.g:6672:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencia ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_parametros_3_0 = null;

        EObject lv_parametros_5_0 = null;

        EObject lv_declaraciones_8_0 = null;

        EObject lv_sentencias_10_0 = null;

        EObject lv_devuelve_11_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6675:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencia ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' ) )
            // InternalVaryGrammar.g:6676:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencia ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' )
            {
            // InternalVaryGrammar.g:6676:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencia ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' )
            // InternalVaryGrammar.g:6676:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencia ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion'
            {
            // InternalVaryGrammar.g:6676:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:6677:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:6677:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:6678:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_28);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // InternalVaryGrammar.g:6698:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:6699:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:6699:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:6700:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_25); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getFuncionAccess().getNombreNOMBRE_FUNTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFuncionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.NOMBRE_FUN");
            	    

            }


            }

            // InternalVaryGrammar.g:6716:2: ( ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )* )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==48||(LA126_0>=111 && LA126_0<=112)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalVaryGrammar.g:6716:3: ( (lv_parametros_3_0= ruleParametro ) ) (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:6716:3: ( (lv_parametros_3_0= ruleParametro ) )
                    // InternalVaryGrammar.g:6717:1: (lv_parametros_3_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:6717:1: (lv_parametros_3_0= ruleParametro )
                    // InternalVaryGrammar.g:6718:3: lv_parametros_3_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrosParametroParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_3_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:6734:2: (otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==28) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6734:4: otherlv_4= ',' ( (lv_parametros_5_0= ruleParametro ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalVaryGrammar.g:6738:1: ( (lv_parametros_5_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:6739:1: (lv_parametros_5_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:6739:1: (lv_parametros_5_0= ruleParametro )
                    	    // InternalVaryGrammar.g:6740:3: lv_parametros_5_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrosParametroParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_5_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_78); 

                	newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_4());
                
            // InternalVaryGrammar.g:6760:1: (otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==19) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalVaryGrammar.g:6760:3: otherlv_7= 'var' ( (lv_declaraciones_8_0= ruleDeclaracion ) )*
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_49); 

                        	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getVarKeyword_5_0());
                        
                    // InternalVaryGrammar.g:6764:1: ( (lv_declaraciones_8_0= ruleDeclaracion ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==RULE_ID||LA127_0==RULE_STRING||(LA127_0>=88 && LA127_0<=92)) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6765:1: (lv_declaraciones_8_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:6765:1: (lv_declaraciones_8_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:6766:3: lv_declaraciones_8_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionesDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_49);
                    	    lv_declaraciones_8_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaraciones",
                    	            		lv_declaraciones_8_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,64,FollowSets000.FOLLOW_79); 

                	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getInicioKeyword_6());
                
            // InternalVaryGrammar.g:6786:1: ( (lv_sentencias_10_0= ruleSentencia ) )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( ((LA129_0>=RULE_ID && LA129_0<=RULE_NOMBRE_FUN)||LA129_0==RULE_STRING||(LA129_0>=33 && LA129_0<=34)||(LA129_0>=37 && LA129_0<=46)||(LA129_0>=67 && LA129_0<=70)||(LA129_0>=73 && LA129_0<=74)||LA129_0==77||LA129_0==80||(LA129_0>=84 && LA129_0<=85)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // InternalVaryGrammar.g:6787:1: (lv_sentencias_10_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:6787:1: (lv_sentencias_10_0= ruleSentencia )
            	    // InternalVaryGrammar.g:6788:3: lv_sentencias_10_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciaParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_79);
            	    lv_sentencias_10_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_10_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // InternalVaryGrammar.g:6804:3: ( (lv_devuelve_11_0= ruleDevolver ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==108) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalVaryGrammar.g:6805:1: (lv_devuelve_11_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:6805:1: (lv_devuelve_11_0= ruleDevolver )
                    // InternalVaryGrammar.g:6806:3: lv_devuelve_11_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_devuelve_11_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_11_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,109,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_12, grammarAccess.getFuncionAccess().getFin_funcionKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleProcedimiento"
    // InternalVaryGrammar.g:6834:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // InternalVaryGrammar.g:6835:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // InternalVaryGrammar.g:6836:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedimiento"


    // $ANTLR start "ruleProcedimiento"
    // InternalVaryGrammar.g:6843:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencia ) )* otherlv_10= 'fin_procedimiento' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parametros_2_0 = null;

        EObject lv_parametros_4_0 = null;

        EObject lv_declaraciones_7_0 = null;

        EObject lv_sentencias_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6846:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencia ) )* otherlv_10= 'fin_procedimiento' ) )
            // InternalVaryGrammar.g:6847:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencia ) )* otherlv_10= 'fin_procedimiento' )
            {
            // InternalVaryGrammar.g:6847:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencia ) )* otherlv_10= 'fin_procedimiento' )
            // InternalVaryGrammar.g:6847:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencia ) )* otherlv_10= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // InternalVaryGrammar.g:6851:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:6852:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:6852:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:6853:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_25); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getProcedimientoAccess().getNombreNOMBRE_FUNTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedimientoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.NOMBRE_FUN");
            	    

            }


            }

            // InternalVaryGrammar.g:6869:2: ( ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==48||(LA132_0>=111 && LA132_0<=112)) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalVaryGrammar.g:6869:3: ( (lv_parametros_2_0= ruleParametro ) ) (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    {
                    // InternalVaryGrammar.g:6869:3: ( (lv_parametros_2_0= ruleParametro ) )
                    // InternalVaryGrammar.g:6870:1: (lv_parametros_2_0= ruleParametro )
                    {
                    // InternalVaryGrammar.g:6870:1: (lv_parametros_2_0= ruleParametro )
                    // InternalVaryGrammar.g:6871:3: lv_parametros_2_0= ruleParametro
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrosParametroParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametros_2_0=ruleParametro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametros",
                            		lv_parametros_2_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:6887:2: (otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==28) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6887:4: otherlv_3= ',' ( (lv_parametros_4_0= ruleParametro ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalVaryGrammar.g:6891:1: ( (lv_parametros_4_0= ruleParametro ) )
                    	    // InternalVaryGrammar.g:6892:1: (lv_parametros_4_0= ruleParametro )
                    	    {
                    	    // InternalVaryGrammar.g:6892:1: (lv_parametros_4_0= ruleParametro )
                    	    // InternalVaryGrammar.g:6893:3: lv_parametros_4_0= ruleParametro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrosParametroParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametros_4_0=ruleParametro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametros",
                    	            		lv_parametros_4_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Parametro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_78); 

                	newLeafNode(otherlv_5, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_3());
                
            // InternalVaryGrammar.g:6913:1: (otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )* )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==19) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalVaryGrammar.g:6913:3: otherlv_6= 'var' ( (lv_declaraciones_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_49); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getVarKeyword_4_0());
                        
                    // InternalVaryGrammar.g:6917:1: ( (lv_declaraciones_7_0= ruleDeclaracion ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==RULE_ID||LA133_0==RULE_STRING||(LA133_0>=88 && LA133_0<=92)) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6918:1: (lv_declaraciones_7_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:6918:1: (lv_declaraciones_7_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:6919:3: lv_declaraciones_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionesDeclaracionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_49);
                    	    lv_declaraciones_7_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaraciones",
                    	            		lv_declaraciones_7_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,64,FollowSets000.FOLLOW_81); 

                	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getInicioKeyword_5());
                
            // InternalVaryGrammar.g:6939:1: ( (lv_sentencias_9_0= ruleSentencia ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( ((LA135_0>=RULE_ID && LA135_0<=RULE_NOMBRE_FUN)||LA135_0==RULE_STRING||(LA135_0>=33 && LA135_0<=34)||(LA135_0>=37 && LA135_0<=46)||(LA135_0>=67 && LA135_0<=70)||(LA135_0>=73 && LA135_0<=74)||LA135_0==77||LA135_0==80||(LA135_0>=84 && LA135_0<=85)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalVaryGrammar.g:6940:1: (lv_sentencias_9_0= ruleSentencia )
            	    {
            	    // InternalVaryGrammar.g:6940:1: (lv_sentencias_9_0= ruleSentencia )
            	    // InternalVaryGrammar.g:6941:3: lv_sentencias_9_0= ruleSentencia
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciaParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_81);
            	    lv_sentencias_9_0=ruleSentencia();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_9_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencia");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            otherlv_10=(Token)match(input,110,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_10, grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedimiento"


    // $ANTLR start "entryRuleTipoPaso"
    // InternalVaryGrammar.g:6969:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // InternalVaryGrammar.g:6970:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // InternalVaryGrammar.g:6971:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoPaso"


    // $ANTLR start "ruleTipoPaso"
    // InternalVaryGrammar.g:6978:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6981:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // InternalVaryGrammar.g:6982:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // InternalVaryGrammar.g:6982:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt136=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt136=1;
                }
                break;
            case 111:
                {
                alt136=2;
                }
                break;
            case 112:
                {
                alt136=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalVaryGrammar.g:6983:2: kw= 'E'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:6990:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:6997:2: kw= 'S'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getSKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoPaso"


    // $ANTLR start "entryRuleBooleano"
    // InternalVaryGrammar.g:7010:1: entryRuleBooleano returns [String current=null] : iv_ruleBooleano= ruleBooleano EOF ;
    public final String entryRuleBooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleano = null;


        try {
            // InternalVaryGrammar.g:7011:2: (iv_ruleBooleano= ruleBooleano EOF )
            // InternalVaryGrammar.g:7012:2: iv_ruleBooleano= ruleBooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleano=ruleBooleano();

            state._fsp--;

             current =iv_ruleBooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleano"


    // $ANTLR start "ruleBooleano"
    // InternalVaryGrammar.g:7019:1: ruleBooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleBooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:7022:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // InternalVaryGrammar.g:7023:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // InternalVaryGrammar.g:7023:1: (kw= 'verdadero' | kw= 'falso' )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==113) ) {
                alt137=1;
            }
            else if ( (LA137_0==114) ) {
                alt137=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // InternalVaryGrammar.g:7024:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:7031:2: kw= 'falso'
                    {
                    kw=(Token)match(input,114,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getFalsoKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleano"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA117 dfa117 = new DFA117(this);
    protected DFA121 dfa121 = new DFA121(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\5\36\1\5\1\uffff\1\5";
    static final String dfa_3s = "\1\134\1\uffff\5\36\1\37\1\uffff\1\37";
    static final String dfa_4s = "\1\uffff\1\2\6\uffff\1\1\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\2\uffff\1\10\13\uffff\1\1\7\uffff\1\7\27\uffff\1\10\3\uffff\1\10\1\uffff\1\10\1\uffff\1\10\3\uffff\1\1\30\uffff\1\2\1\3\1\4\1\5\1\6",
            "",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\1\31\uffff\1\10",
            "",
            "\1\1\31\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 189:1: ( (lv_complejos_8_0= ruleTipoComplejo ) )*";
        }
    }
    static final String[] dfa_7s = {
            "\1\10\2\uffff\1\10\13\uffff\1\1\6\uffff\1\1\1\7\27\uffff\1\10\3\uffff\1\10\1\uffff\1\10\1\uffff\1\10\34\uffff\1\2\1\3\1\4\1\5\1\6",
            "",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\1\31\uffff\1\10",
            "",
            "\1\1\31\uffff\1\10"
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 504:1: ( (lv_complejos_5_0= ruleTipoComplejo ) )*";
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\1\4\4\uffff\2\62\1\uffff\1\4\2\uffff";
    static final String dfa_10s = "\1\134\4\uffff\2\62\1\uffff\1\74\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\uffff\1\6\1\5";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\6\2\uffff\1\5\23\uffff\1\7\27\uffff\1\1\3\uffff\1\2\1\uffff\1\3\1\uffff\1\4\34\uffff\5\7",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\10",
            "",
            "\1\11\1\uffff\2\11\64\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango | this_TipoSubproceso_6= ruleTipoSubproceso )";
        }
    }
    static final String dfa_14s = "\u0173\uffff";
    static final String dfa_15s = "\2\uffff\2\5\u016f\uffff";
    static final String dfa_16s = "\1\57\4\4\1\uffff\3\62\15\4\2\uffff\22\62\50\4\55\62\70\4\74\62\52\4\55\62\21\4\22\62\3\4\3\62";
    static final String dfa_17s = "\1\57\1\7\2\156\1\7\1\uffff\3\151\15\7\2\uffff\22\151\50\7\55\151\70\7\74\151\52\7\55\151\21\7\22\151\3\7\3\151";
    static final String dfa_18s = "\5\uffff\1\1\20\uffff\1\2\1\3\u015b\uffff";
    static final String dfa_19s = "\u0173\uffff}>";
    static final String[] dfa_20s = {
            "\1\1",
            "\1\3\2\uffff\1\2",
            "\2\5\1\uffff\1\5\12\uffff\2\5\6\uffff\4\5\2\uffff\3\5\2\uffff\13\5\2\uffff\1\5\1\uffff\1\4\1\5\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1\uffff\6\5\1\uffff\42\5\1\uffff\4\5",
            "\2\5\1\uffff\1\5\12\uffff\2\5\6\uffff\4\5\2\uffff\3\5\2\uffff\13\5\2\uffff\1\5\1\uffff\1\4\1\5\2\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1\uffff\6\5\1\uffff\42\5\1\uffff\4\5",
            "\1\10\1\uffff\1\6\1\7",
            "",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\32\1\uffff\1\30\1\31",
            "\1\32\1\uffff\1\30\1\31",
            "\1\32\1\uffff\1\30\1\31",
            "\1\35\1\uffff\1\33\1\34",
            "\1\35\1\uffff\1\33\1\34",
            "\1\40\1\uffff\1\36\1\37",
            "\1\40\1\uffff\1\36\1\37",
            "\1\40\1\uffff\1\36\1\37",
            "\1\40\1\uffff\1\36\1\37",
            "\1\43\1\uffff\1\41\1\42",
            "\1\43\1\uffff\1\41\1\42",
            "\1\46\1\uffff\1\44\1\45",
            "\1\51\1\uffff\1\47\1\50",
            "",
            "",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\124\1\uffff\1\122\1\123",
            "\1\124\1\uffff\1\122\1\123",
            "\1\124\1\uffff\1\122\1\123",
            "\1\127\1\uffff\1\125\1\126",
            "\1\127\1\uffff\1\125\1\126",
            "\1\127\1\uffff\1\125\1\126",
            "\1\132\1\uffff\1\130\1\131",
            "\1\132\1\uffff\1\130\1\131",
            "\1\135\1\uffff\1\133\1\134",
            "\1\135\1\uffff\1\133\1\134",
            "\1\135\1\uffff\1\133\1\134",
            "\1\140\1\uffff\1\136\1\137",
            "\1\140\1\uffff\1\136\1\137",
            "\1\143\1\uffff\1\141\1\142",
            "\1\143\1\uffff\1\141\1\142",
            "\1\143\1\uffff\1\141\1\142",
            "\1\143\1\uffff\1\141\1\142",
            "\1\146\1\uffff\1\144\1\145",
            "\1\146\1\uffff\1\144\1\145",
            "\1\146\1\uffff\1\144\1\145",
            "\1\151\1\uffff\1\147\1\150",
            "\1\151\1\uffff\1\147\1\150",
            "\1\154\1\uffff\1\152\1\153",
            "\1\154\1\uffff\1\152\1\153",
            "\1\154\1\uffff\1\152\1\153",
            "\1\154\1\uffff\1\152\1\153",
            "\1\157\1\uffff\1\155\1\156",
            "\1\157\1\uffff\1\155\1\156",
            "\1\162\1\uffff\1\160\1\161",
            "\1\162\1\uffff\1\160\1\161",
            "\1\162\1\uffff\1\160\1\161",
            "\1\165\1\uffff\1\163\1\164",
            "\1\165\1\uffff\1\163\1\164",
            "\1\170\1\uffff\1\166\1\167",
            "\1\170\1\uffff\1\166\1\167",
            "\1\170\1\uffff\1\166\1\167",
            "\1\170\1\uffff\1\166\1\167",
            "\1\173\1\uffff\1\171\1\172",
            "\1\173\1\uffff\1\171\1\172",
            "\1\176\1\uffff\1\174\1\175",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b9\1\uffff\1\u00b7\1\u00b8",
            "\1\u00b9\1\uffff\1\u00b7\1\u00b8",
            "\1\u00b9\1\uffff\1\u00b7\1\u00b8",
            "\1\u00bc\1\uffff\1\u00ba\1\u00bb",
            "\1\u00bc\1\uffff\1\u00ba\1\u00bb",
            "\1\u00bc\1\uffff\1\u00ba\1\u00bb",
            "\1\u00bf\1\uffff\1\u00bd\1\u00be",
            "\1\u00bf\1\uffff\1\u00bd\1\u00be",
            "\1\u00bf\1\uffff\1\u00bd\1\u00be",
            "\1\u00c2\1\uffff\1\u00c0\1\u00c1",
            "\1\u00c2\1\uffff\1\u00c0\1\u00c1",
            "\1\u00c5\1\uffff\1\u00c3\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c3\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c3\1\u00c4",
            "\1\u00c8\1\uffff\1\u00c6\1\u00c7",
            "\1\u00c8\1\uffff\1\u00c6\1\u00c7",
            "\1\u00c8\1\uffff\1\u00c6\1\u00c7",
            "\1\u00cb\1\uffff\1\u00c9\1\u00ca",
            "\1\u00cb\1\uffff\1\u00c9\1\u00ca",
            "\1\u00ce\1\uffff\1\u00cc\1\u00cd",
            "\1\u00ce\1\uffff\1\u00cc\1\u00cd",
            "\1\u00ce\1\uffff\1\u00cc\1\u00cd",
            "\1\u00d1\1\uffff\1\u00cf\1\u00d0",
            "\1\u00d1\1\uffff\1\u00cf\1\u00d0",
            "\1\u00d4\1\uffff\1\u00d2\1\u00d3",
            "\1\u00d4\1\uffff\1\u00d2\1\u00d3",
            "\1\u00d4\1\uffff\1\u00d2\1\u00d3",
            "\1\u00d4\1\uffff\1\u00d2\1\u00d3",
            "\1\u00d7\1\uffff\1\u00d5\1\u00d6",
            "\1\u00d7\1\uffff\1\u00d5\1\u00d6",
            "\1\u00d7\1\uffff\1\u00d5\1\u00d6",
            "\1\u00da\1\uffff\1\u00d8\1\u00d9",
            "\1\u00da\1\uffff\1\u00d8\1\u00d9",
            "\1\u00da\1\uffff\1\u00d8\1\u00d9",
            "\1\u00dd\1\uffff\1\u00db\1\u00dc",
            "\1\u00dd\1\uffff\1\u00db\1\u00dc",
            "\1\u00e0\1\uffff\1\u00de\1\u00df",
            "\1\u00e0\1\uffff\1\u00de\1\u00df",
            "\1\u00e0\1\uffff\1\u00de\1\u00df",
            "\1\u00e3\1\uffff\1\u00e1\1\u00e2",
            "\1\u00e3\1\uffff\1\u00e1\1\u00e2",
            "\1\u00e6\1\uffff\1\u00e4\1\u00e5",
            "\1\u00e6\1\uffff\1\u00e4\1\u00e5",
            "\1\u00e6\1\uffff\1\u00e4\1\u00e5",
            "\1\u00e6\1\uffff\1\u00e4\1\u00e5",
            "\1\u00e9\1\uffff\1\u00e7\1\u00e8",
            "\1\u00e9\1\uffff\1\u00e7\1\u00e8",
            "\1\u00e9\1\uffff\1\u00e7\1\u00e8",
            "\1\u00ec\1\uffff\1\u00ea\1\u00eb",
            "\1\u00ec\1\uffff\1\u00ea\1\u00eb",
            "\1\u00ef\1\uffff\1\u00ed\1\u00ee",
            "\1\u00ef\1\uffff\1\u00ed\1\u00ee",
            "\1\u00ef\1\uffff\1\u00ed\1\u00ee",
            "\1\u00ef\1\uffff\1\u00ed\1\u00ee",
            "\1\u00f2\1\uffff\1\u00f0\1\u00f1",
            "\1\u00f2\1\uffff\1\u00f0\1\u00f1",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u011f\1\uffff\1\u011d\1\u011e",
            "\1\u011f\1\uffff\1\u011d\1\u011e",
            "\1\u011f\1\uffff\1\u011d\1\u011e",
            "\1\u0122\1\uffff\1\u0120\1\u0121",
            "\1\u0122\1\uffff\1\u0120\1\u0121",
            "\1\u0122\1\uffff\1\u0120\1\u0121",
            "\1\u0125\1\uffff\1\u0123\1\u0124",
            "\1\u0125\1\uffff\1\u0123\1\u0124",
            "\1\u0125\1\uffff\1\u0123\1\u0124",
            "\1\u0128\1\uffff\1\u0126\1\u0127",
            "\1\u0128\1\uffff\1\u0126\1\u0127",
            "\1\u0128\1\uffff\1\u0126\1\u0127",
            "\1\u012b\1\uffff\1\u0129\1\u012a",
            "\1\u012b\1\uffff\1\u0129\1\u012a",
            "\1\u012e\1\uffff\1\u012c\1\u012d",
            "\1\u012e\1\uffff\1\u012c\1\u012d",
            "\1\u012e\1\uffff\1\u012c\1\u012d",
            "\1\u0131\1\uffff\1\u012f\1\u0130",
            "\1\u0131\1\uffff\1\u012f\1\u0130",
            "\1\u0131\1\uffff\1\u012f\1\u0130",
            "\1\u0134\1\uffff\1\u0132\1\u0133",
            "\1\u0134\1\uffff\1\u0132\1\u0133",
            "\1\u0134\1\uffff\1\u0132\1\u0133",
            "\1\u0137\1\uffff\1\u0135\1\u0136",
            "\1\u0137\1\uffff\1\u0135\1\u0136",
            "\1\u013a\1\uffff\1\u0138\1\u0139",
            "\1\u013a\1\uffff\1\u0138\1\u0139",
            "\1\u013a\1\uffff\1\u0138\1\u0139",
            "\1\u013d\1\uffff\1\u013b\1\u013c",
            "\1\u013d\1\uffff\1\u013b\1\u013c",
            "\1\u013d\1\uffff\1\u013b\1\u013c",
            "\1\u0140\1\uffff\1\u013e\1\u013f",
            "\1\u0140\1\uffff\1\u013e\1\u013f",
            "\1\u0143\1\uffff\1\u0141\1\u0142",
            "\1\u0143\1\uffff\1\u0141\1\u0142",
            "\1\u0143\1\uffff\1\u0141\1\u0142",
            "\1\u0146\1\uffff\1\u0144\1\u0145",
            "\1\u0146\1\uffff\1\u0144\1\u0145",
            "\1\u0149\1\uffff\1\u0147\1\u0148",
            "\1\u0149\1\uffff\1\u0147\1\u0148",
            "\1\u0149\1\uffff\1\u0147\1\u0148",
            "\1\u0149\1\uffff\1\u0147\1\u0148",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u015d\1\uffff\1\u015b\1\u015c",
            "\1\u015d\1\uffff\1\u015b\1\u015c",
            "\1\u015d\1\uffff\1\u015b\1\u015c",
            "\1\u0160\1\uffff\1\u015e\1\u015f",
            "\1\u0160\1\uffff\1\u015e\1\u015f",
            "\1\u0160\1\uffff\1\u015e\1\u015f",
            "\1\u0163\1\uffff\1\u0161\1\u0162",
            "\1\u0163\1\uffff\1\u0161\1\u0162",
            "\1\u0163\1\uffff\1\u0161\1\u0162",
            "\1\u0166\1\uffff\1\u0164\1\u0165",
            "\1\u0166\1\uffff\1\u0164\1\u0165",
            "\1\u0166\1\uffff\1\u0164\1\u0165",
            "\1\u0169\1\uffff\1\u0167\1\u0168",
            "\1\u0169\1\uffff\1\u0167\1\u0168",
            "\1\u0169\1\uffff\1\u0167\1\u0168",
            "\1\u016c\1\uffff\1\u016a\1\u016b",
            "\1\u016c\1\uffff\1\u016a\1\u016b",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\2\uffff\1\27\44\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA117 extends DFA {

        public DFA117(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 117;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "5925:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleOperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleOperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleOperacionIndice ) ) otherlv_13= ']' ) )";
        }
    }
    static final String dfa_21s = "\u0172\uffff";
    static final String dfa_22s = "\1\4\2\57\1\uffff\1\4\3\62\15\4\2\uffff\22\62\50\4\55\62\70\4\74\62\52\4\55\62\21\4\22\62\3\4\3\62";
    static final String dfa_23s = "\1\7\2\64\1\uffff\1\7\3\151\15\7\2\uffff\22\151\50\7\55\151\70\7\74\151\52\7\55\151\21\7\22\151\3\7\3\151";
    static final String dfa_24s = "\3\uffff\1\3\21\uffff\1\2\1\1\u015b\uffff";
    static final String dfa_25s = "\u0172\uffff}>";
    static final String[] dfa_26s = {
            "\1\2\2\uffff\1\1",
            "\1\3\4\uffff\1\4",
            "\1\3\4\uffff\1\4",
            "",
            "\1\7\1\uffff\1\5\1\6",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\31\1\uffff\1\27\1\30",
            "\1\31\1\uffff\1\27\1\30",
            "\1\31\1\uffff\1\27\1\30",
            "\1\34\1\uffff\1\32\1\33",
            "\1\34\1\uffff\1\32\1\33",
            "\1\37\1\uffff\1\35\1\36",
            "\1\37\1\uffff\1\35\1\36",
            "\1\37\1\uffff\1\35\1\36",
            "\1\37\1\uffff\1\35\1\36",
            "\1\42\1\uffff\1\40\1\41",
            "\1\42\1\uffff\1\40\1\41",
            "\1\45\1\uffff\1\43\1\44",
            "\1\50\1\uffff\1\46\1\47",
            "",
            "",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\123\1\uffff\1\121\1\122",
            "\1\123\1\uffff\1\121\1\122",
            "\1\123\1\uffff\1\121\1\122",
            "\1\126\1\uffff\1\124\1\125",
            "\1\126\1\uffff\1\124\1\125",
            "\1\126\1\uffff\1\124\1\125",
            "\1\131\1\uffff\1\127\1\130",
            "\1\131\1\uffff\1\127\1\130",
            "\1\134\1\uffff\1\132\1\133",
            "\1\134\1\uffff\1\132\1\133",
            "\1\134\1\uffff\1\132\1\133",
            "\1\137\1\uffff\1\135\1\136",
            "\1\137\1\uffff\1\135\1\136",
            "\1\142\1\uffff\1\140\1\141",
            "\1\142\1\uffff\1\140\1\141",
            "\1\142\1\uffff\1\140\1\141",
            "\1\142\1\uffff\1\140\1\141",
            "\1\145\1\uffff\1\143\1\144",
            "\1\145\1\uffff\1\143\1\144",
            "\1\145\1\uffff\1\143\1\144",
            "\1\150\1\uffff\1\146\1\147",
            "\1\150\1\uffff\1\146\1\147",
            "\1\153\1\uffff\1\151\1\152",
            "\1\153\1\uffff\1\151\1\152",
            "\1\153\1\uffff\1\151\1\152",
            "\1\153\1\uffff\1\151\1\152",
            "\1\156\1\uffff\1\154\1\155",
            "\1\156\1\uffff\1\154\1\155",
            "\1\161\1\uffff\1\157\1\160",
            "\1\161\1\uffff\1\157\1\160",
            "\1\161\1\uffff\1\157\1\160",
            "\1\164\1\uffff\1\162\1\163",
            "\1\164\1\uffff\1\162\1\163",
            "\1\167\1\uffff\1\165\1\166",
            "\1\167\1\uffff\1\165\1\166",
            "\1\167\1\uffff\1\165\1\166",
            "\1\167\1\uffff\1\165\1\166",
            "\1\172\1\uffff\1\170\1\171",
            "\1\172\1\uffff\1\170\1\171",
            "\1\175\1\uffff\1\173\1\174",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b8\1\uffff\1\u00b6\1\u00b7",
            "\1\u00b8\1\uffff\1\u00b6\1\u00b7",
            "\1\u00b8\1\uffff\1\u00b6\1\u00b7",
            "\1\u00bb\1\uffff\1\u00b9\1\u00ba",
            "\1\u00bb\1\uffff\1\u00b9\1\u00ba",
            "\1\u00bb\1\uffff\1\u00b9\1\u00ba",
            "\1\u00be\1\uffff\1\u00bc\1\u00bd",
            "\1\u00be\1\uffff\1\u00bc\1\u00bd",
            "\1\u00be\1\uffff\1\u00bc\1\u00bd",
            "\1\u00c1\1\uffff\1\u00bf\1\u00c0",
            "\1\u00c1\1\uffff\1\u00bf\1\u00c0",
            "\1\u00c4\1\uffff\1\u00c2\1\u00c3",
            "\1\u00c4\1\uffff\1\u00c2\1\u00c3",
            "\1\u00c4\1\uffff\1\u00c2\1\u00c3",
            "\1\u00c7\1\uffff\1\u00c5\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c5\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c5\1\u00c6",
            "\1\u00ca\1\uffff\1\u00c8\1\u00c9",
            "\1\u00ca\1\uffff\1\u00c8\1\u00c9",
            "\1\u00cd\1\uffff\1\u00cb\1\u00cc",
            "\1\u00cd\1\uffff\1\u00cb\1\u00cc",
            "\1\u00cd\1\uffff\1\u00cb\1\u00cc",
            "\1\u00d0\1\uffff\1\u00ce\1\u00cf",
            "\1\u00d0\1\uffff\1\u00ce\1\u00cf",
            "\1\u00d3\1\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d1\1\u00d2",
            "\1\u00d6\1\uffff\1\u00d4\1\u00d5",
            "\1\u00d6\1\uffff\1\u00d4\1\u00d5",
            "\1\u00d6\1\uffff\1\u00d4\1\u00d5",
            "\1\u00d9\1\uffff\1\u00d7\1\u00d8",
            "\1\u00d9\1\uffff\1\u00d7\1\u00d8",
            "\1\u00d9\1\uffff\1\u00d7\1\u00d8",
            "\1\u00dc\1\uffff\1\u00da\1\u00db",
            "\1\u00dc\1\uffff\1\u00da\1\u00db",
            "\1\u00df\1\uffff\1\u00dd\1\u00de",
            "\1\u00df\1\uffff\1\u00dd\1\u00de",
            "\1\u00df\1\uffff\1\u00dd\1\u00de",
            "\1\u00e2\1\uffff\1\u00e0\1\u00e1",
            "\1\u00e2\1\uffff\1\u00e0\1\u00e1",
            "\1\u00e5\1\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e3\1\u00e4",
            "\1\u00e8\1\uffff\1\u00e6\1\u00e7",
            "\1\u00e8\1\uffff\1\u00e6\1\u00e7",
            "\1\u00e8\1\uffff\1\u00e6\1\u00e7",
            "\1\u00eb\1\uffff\1\u00e9\1\u00ea",
            "\1\u00eb\1\uffff\1\u00e9\1\u00ea",
            "\1\u00ee\1\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\1\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\1\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\1\uffff\1\u00ec\1\u00ed",
            "\1\u00f1\1\uffff\1\u00ef\1\u00f0",
            "\1\u00f1\1\uffff\1\u00ef\1\u00f0",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u011e\1\uffff\1\u011c\1\u011d",
            "\1\u011e\1\uffff\1\u011c\1\u011d",
            "\1\u011e\1\uffff\1\u011c\1\u011d",
            "\1\u0121\1\uffff\1\u011f\1\u0120",
            "\1\u0121\1\uffff\1\u011f\1\u0120",
            "\1\u0121\1\uffff\1\u011f\1\u0120",
            "\1\u0124\1\uffff\1\u0122\1\u0123",
            "\1\u0124\1\uffff\1\u0122\1\u0123",
            "\1\u0124\1\uffff\1\u0122\1\u0123",
            "\1\u0127\1\uffff\1\u0125\1\u0126",
            "\1\u0127\1\uffff\1\u0125\1\u0126",
            "\1\u0127\1\uffff\1\u0125\1\u0126",
            "\1\u012a\1\uffff\1\u0128\1\u0129",
            "\1\u012a\1\uffff\1\u0128\1\u0129",
            "\1\u012d\1\uffff\1\u012b\1\u012c",
            "\1\u012d\1\uffff\1\u012b\1\u012c",
            "\1\u012d\1\uffff\1\u012b\1\u012c",
            "\1\u0130\1\uffff\1\u012e\1\u012f",
            "\1\u0130\1\uffff\1\u012e\1\u012f",
            "\1\u0130\1\uffff\1\u012e\1\u012f",
            "\1\u0133\1\uffff\1\u0131\1\u0132",
            "\1\u0133\1\uffff\1\u0131\1\u0132",
            "\1\u0133\1\uffff\1\u0131\1\u0132",
            "\1\u0136\1\uffff\1\u0134\1\u0135",
            "\1\u0136\1\uffff\1\u0134\1\u0135",
            "\1\u0139\1\uffff\1\u0137\1\u0138",
            "\1\u0139\1\uffff\1\u0137\1\u0138",
            "\1\u0139\1\uffff\1\u0137\1\u0138",
            "\1\u013c\1\uffff\1\u013a\1\u013b",
            "\1\u013c\1\uffff\1\u013a\1\u013b",
            "\1\u013c\1\uffff\1\u013a\1\u013b",
            "\1\u013f\1\uffff\1\u013d\1\u013e",
            "\1\u013f\1\uffff\1\u013d\1\u013e",
            "\1\u0142\1\uffff\1\u0140\1\u0141",
            "\1\u0142\1\uffff\1\u0140\1\u0141",
            "\1\u0142\1\uffff\1\u0140\1\u0141",
            "\1\u0145\1\uffff\1\u0143\1\u0144",
            "\1\u0145\1\uffff\1\u0143\1\u0144",
            "\1\u0148\1\uffff\1\u0146\1\u0147",
            "\1\u0148\1\uffff\1\u0146\1\u0147",
            "\1\u0148\1\uffff\1\u0146\1\u0147",
            "\1\u0148\1\uffff\1\u0146\1\u0147",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u015c\1\uffff\1\u015a\1\u015b",
            "\1\u015c\1\uffff\1\u015a\1\u015b",
            "\1\u015c\1\uffff\1\u015a\1\u015b",
            "\1\u015f\1\uffff\1\u015d\1\u015e",
            "\1\u015f\1\uffff\1\u015d\1\u015e",
            "\1\u015f\1\uffff\1\u015d\1\u015e",
            "\1\u0162\1\uffff\1\u0160\1\u0161",
            "\1\u0162\1\uffff\1\u0160\1\u0161",
            "\1\u0162\1\uffff\1\u0160\1\u0161",
            "\1\u0165\1\uffff\1\u0163\1\u0164",
            "\1\u0165\1\uffff\1\u0163\1\u0164",
            "\1\u0165\1\uffff\1\u0163\1\u0164",
            "\1\u0168\1\uffff\1\u0166\1\u0167",
            "\1\u0168\1\uffff\1\u0166\1\u0167",
            "\1\u0168\1\uffff\1\u0166\1\u0167",
            "\1\u016b\1\uffff\1\u0169\1\u016a",
            "\1\u016b\1\uffff\1\u0169\1\u016a",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\26\2\uffff\1\25\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "6088:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleOperacionIndice ) ) otherlv_4= ']' ) ( (lv_campos_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleOperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleOperacionIndice ) ) otherlv_12= ']' ) ( (lv_campos_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campos_16_0= ruleCampoRegistro ) )+ ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x80000000080E8000L,0x000000001F000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x80000000080E8090L,0x000000001F000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8A880000080E8090L,0x000000001F000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000088E0000L,0x000000001F000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000088C0090L,0x000000001F000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008880090L,0x000000001F000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008800090L,0x000000001F000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008800000L,0x000000001F000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C0E0000L,0x000000001F000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C0C0090L,0x000000001F000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0A8800000C080090L,0x000000001F000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L,0x000000001F000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000020000000L,0x0001800000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L,0x0001800000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00007FE0800003F0L,0x0006000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000010000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000090L,0x000000001F000001L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00007FE6000000B0L,0x000000000031267AL});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00007FE0800003F0L,0x0006042000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000180000312778L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000100L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000000000313678L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00007FE6000000B0L,0x000000000031E678L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000000000352678L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00007FE6000000B2L,0x0000100000312678L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000100000B12678L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0004000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000F00000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00007FE0800003F0L,0x0006040000000000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x00007FE0A00003F0L,0x0006042000000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000001L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000300000312678L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x00007FE6000000B0L,0x0000400000312678L});
    }


}