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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NOMBRE_FUN", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algoritmo'", "'importa'", "'fin_importa'", "'const'", "'tipo'", "'var'", "'fin_algoritmo'", "'Modulo'", "'exporta'", "'fin_exporta'", "'fin_modulo'", "'implementacion'", "'fin_implementacion'", "'procedimiento'", "','", "')'", "'funcion'", "'abrir('", "'cerrar('", "'escritura'", "'lectura'", "'cos('", "'cuadrado('", "'exp('", "'ln('", "'log('", "'sen('", "'sqrt('", "'longitud('", "'concatena('", "'copiar('", "'.'", "'E'", "'e'", "'='", "'vector'", "'['", "']'", "'de'", "': '", "'matriz'", "']['", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'principal'", "'inicio'", "'fin_principal'", "'<-'", "'escribir('", "'leer('", "'si'", "'('", "'si('", "'entonces'", "'fin_si'", "'mientras'", "'mientras('", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'hasta_que('", "'desde'", "'hasta'", "'fin_desde'", "'caso'", "'segun_sea'", "'segun_sea('", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'o'", "'y'", "'!='", "'<'", "'>'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'mod'", "'div'", "'no'", "'si_no'", "'devolver'", "'fin_funcion'", "'fin_procedimiento'", "'E/S'", "'S'", "'verdadero'", "'falso'"
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
    // InternalVaryGrammar.g:116:1: ruleAlgoritmo returns [EObject current=null] : (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' ) ;
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

        EObject lv_tipocomplejo_8_0 = null;

        EObject lv_global_10_0 = null;

        EObject lv_funcion_11_0 = null;

        EObject lv_tiene_12_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:119:28: ( (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' ) )
            // InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' )
            {
            // InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo' )
            // InternalVaryGrammar.g:120:3: otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'fin_algoritmo'
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

            // InternalVaryGrammar.g:163:3: (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVaryGrammar.g:163:5: otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )*
                    {
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getAlgoritmoAccess().getConstKeyword_3_0());
                        
                    // InternalVaryGrammar.g:167:1: ( (lv_constantes_6_0= ruleConstantes ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:168:1: (lv_constantes_6_0= ruleConstantes )
                    	    {
                    	    // InternalVaryGrammar.g:168:1: (lv_constantes_6_0= ruleConstantes )
                    	    // InternalVaryGrammar.g:169:3: lv_constantes_6_0= ruleConstantes
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_constantes_6_0=ruleConstantes();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constantes",
                    	            		lv_constantes_6_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Constantes");
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

            // InternalVaryGrammar.g:185:5: (otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVaryGrammar.g:185:7: otherlv_7= 'tipo' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )*
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getTipoKeyword_4_0());
                        
                    // InternalVaryGrammar.g:189:1: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING||LA6_0==49||LA6_0==54||LA6_0==56||LA6_0==58) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:190:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                    	    {
                    	    // InternalVaryGrammar.g:190:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                    	    // InternalVaryGrammar.g:191:3: lv_tipocomplejo_8_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_tipocomplejo_8_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tipocomplejo",
                    	            		lv_tipocomplejo_8_0, 
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

            // InternalVaryGrammar.g:207:5: (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVaryGrammar.g:207:7: otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )*
                    {
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_9, grammarAccess.getAlgoritmoAccess().getVarKeyword_5_0());
                        
                    // InternalVaryGrammar.g:211:1: ( (lv_global_10_0= ruleDeclaracion ) )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==53) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==53) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA8_3 = input.LA(2);

                            if ( (LA8_3==53) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA8_4 = input.LA(2);

                            if ( (LA8_4==53) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA8_5 = input.LA(2);

                            if ( (LA8_5==53) ) {
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
                    	    // InternalVaryGrammar.g:212:1: (lv_global_10_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:212:1: (lv_global_10_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:213:3: lv_global_10_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_global_10_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"global",
                    	            		lv_global_10_0, 
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

            // InternalVaryGrammar.g:229:5: ( (lv_funcion_11_0= ruleSubproceso ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27||(LA10_0>=88 && LA10_0<=92)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVaryGrammar.g:230:1: (lv_funcion_11_0= ruleSubproceso )
            	    {
            	    // InternalVaryGrammar.g:230:1: (lv_funcion_11_0= ruleSubproceso )
            	    // InternalVaryGrammar.g:231:3: lv_funcion_11_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_funcion_11_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funcion",
            	            		lv_funcion_11_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Subproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVaryGrammar.g:247:3: ( (lv_tiene_12_0= ruleInicio ) )
            // InternalVaryGrammar.g:248:1: (lv_tiene_12_0= ruleInicio )
            {
            // InternalVaryGrammar.g:248:1: (lv_tiene_12_0= ruleInicio )
            // InternalVaryGrammar.g:249:3: lv_tiene_12_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTieneInicioParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_8);
            lv_tiene_12_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_12_0, 
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
    // InternalVaryGrammar.g:286:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' ) ;
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

        EObject lv_exporta_global_11_0 = null;

        EObject lv_exporta_funciones_12_0 = null;

        EObject lv_implementacion_14_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:289:28: ( (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' ) )
            // InternalVaryGrammar.g:290:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' )
            {
            // InternalVaryGrammar.g:290:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo' )
            // InternalVaryGrammar.g:290:3: otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'fin_importa' (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' ) ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'fin_modulo'
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
                
            // InternalVaryGrammar.g:333:1: (otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta' )
            // InternalVaryGrammar.g:333:3: otherlv_5= 'exporta' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'tipo' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'fin_exporta'
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

            // InternalVaryGrammar.g:381:5: (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVaryGrammar.g:381:7: otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )*
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_15); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuloAccess().getVarKeyword_5_3_0());
                        
                    // InternalVaryGrammar.g:385:1: ( (lv_exporta_global_11_0= ruleDeclaracion ) )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==53) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA16_3 = input.LA(2);

                            if ( (LA16_3==53) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA16_4 = input.LA(2);

                            if ( (LA16_4==53) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA16_5 = input.LA(2);

                            if ( (LA16_5==53) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA16_6 = input.LA(2);

                            if ( (LA16_6==53) ) {
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
                    	    // InternalVaryGrammar.g:386:1: (lv_exporta_global_11_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:386:1: (lv_exporta_global_11_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:387:3: lv_exporta_global_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalDeclaracionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_15);
                    	    lv_exporta_global_11_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_global",
                    	            		lv_exporta_global_11_0, 
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

            // InternalVaryGrammar.g:403:5: ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27||(LA18_0>=88 && LA18_0<=92)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVaryGrammar.g:404:1: (lv_exporta_funciones_12_0= ruleCabeceraSubproceso )
            	    {
            	    // InternalVaryGrammar.g:404:1: (lv_exporta_funciones_12_0= ruleCabeceraSubproceso )
            	    // InternalVaryGrammar.g:405:3: lv_exporta_funciones_12_0= ruleCabeceraSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_exporta_funciones_12_0=ruleCabeceraSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exporta_funciones",
            	            		lv_exporta_funciones_12_0, 
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
    // InternalVaryGrammar.g:464:1: ruleImplementacion returns [EObject current=null] : ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) ) ;
    public final EObject ruleImplementacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_constantes_3_0 = null;

        EObject lv_tipocomplejo_5_0 = null;

        EObject lv_global_7_0 = null;

        EObject lv_funcion_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:467:28: ( ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) ) )
            // InternalVaryGrammar.g:468:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) )
            {
            // InternalVaryGrammar.g:468:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' ) )
            // InternalVaryGrammar.g:468:2: () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' )
            {
            // InternalVaryGrammar.g:468:2: ()
            // InternalVaryGrammar.g:469:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplementacionAccess().getImplementacionAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:474:2: (otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion' )
            // InternalVaryGrammar.g:474:4: otherlv_1= 'implementacion' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'fin_implementacion'
            {
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_19); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementacionKeyword_1_0());
                
            // InternalVaryGrammar.g:478:1: (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVaryGrammar.g:478:3: otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )*
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_20); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplementacionAccess().getConstKeyword_1_1_0());
                        
                    // InternalVaryGrammar.g:482:1: ( (lv_constantes_3_0= ruleConstantes ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:483:1: (lv_constantes_3_0= ruleConstantes )
                    	    {
                    	    // InternalVaryGrammar.g:483:1: (lv_constantes_3_0= ruleConstantes )
                    	    // InternalVaryGrammar.g:484:3: lv_constantes_3_0= ruleConstantes
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_constantes_3_0=ruleConstantes();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constantes",
                    	            		lv_constantes_3_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Constantes");
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

            // InternalVaryGrammar.g:500:5: (otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVaryGrammar.g:500:7: otherlv_4= 'tipo' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_21); 

                        	newLeafNode(otherlv_4, grammarAccess.getImplementacionAccess().getTipoKeyword_1_2_0());
                        
                    // InternalVaryGrammar.g:504:1: ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING||LA21_0==49||LA21_0==54||LA21_0==56||LA21_0==58) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:505:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                    	    {
                    	    // InternalVaryGrammar.g:505:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                    	    // InternalVaryGrammar.g:506:3: lv_tipocomplejo_5_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_tipocomplejo_5_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tipocomplejo",
                    	            		lv_tipocomplejo_5_0, 
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

            // InternalVaryGrammar.g:522:5: (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVaryGrammar.g:522:7: otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_6, grammarAccess.getImplementacionAccess().getVarKeyword_1_3_0());
                        
                    // InternalVaryGrammar.g:526:1: ( (lv_global_7_0= ruleDeclaracion ) )*
                    loop23:
                    do {
                        int alt23=2;
                        switch ( input.LA(1) ) {
                        case 88:
                            {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==53) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 89:
                            {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==53) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 90:
                            {
                            int LA23_3 = input.LA(2);

                            if ( (LA23_3==53) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA23_4 = input.LA(2);

                            if ( (LA23_4==53) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA23_5 = input.LA(2);

                            if ( (LA23_5==53) ) {
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
                    	    // InternalVaryGrammar.g:527:1: (lv_global_7_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:527:1: (lv_global_7_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:528:3: lv_global_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_global_7_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"global",
                    	            		lv_global_7_0, 
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

            // InternalVaryGrammar.g:544:5: ( (lv_funcion_8_0= ruleSubproceso ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27||(LA25_0>=88 && LA25_0<=92)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVaryGrammar.g:545:1: (lv_funcion_8_0= ruleSubproceso )
            	    {
            	    // InternalVaryGrammar.g:545:1: (lv_funcion_8_0= ruleSubproceso )
            	    // InternalVaryGrammar.g:546:3: lv_funcion_8_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_funcion_8_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funcion",
            	            		lv_funcion_8_0, 
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
    // InternalVaryGrammar.g:623:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parametrofuncion_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:626:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) )
            // InternalVaryGrammar.g:627:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            {
            // InternalVaryGrammar.g:627:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            // InternalVaryGrammar.g:627:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')'
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

            // InternalVaryGrammar.g:649:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46||(LA28_0>=111 && LA28_0<=112)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVaryGrammar.g:649:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // InternalVaryGrammar.g:649:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // InternalVaryGrammar.g:650:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // InternalVaryGrammar.g:650:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // InternalVaryGrammar.g:651:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametrofuncion_2_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_2_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:667:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==28) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:667:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalVaryGrammar.g:671:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // InternalVaryGrammar.g:672:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // InternalVaryGrammar.g:672:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // InternalVaryGrammar.g:673:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_4_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
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
    // InternalVaryGrammar.g:710:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:713:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) )
            // InternalVaryGrammar.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            // InternalVaryGrammar.g:714:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')'
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

            // InternalVaryGrammar.g:754:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46||(LA30_0>=111 && LA30_0<=112)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVaryGrammar.g:754:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // InternalVaryGrammar.g:754:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // InternalVaryGrammar.g:755:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // InternalVaryGrammar.g:755:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // InternalVaryGrammar.g:756:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:772:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:772:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalVaryGrammar.g:776:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // InternalVaryGrammar.g:777:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // InternalVaryGrammar.g:777:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // InternalVaryGrammar.g:778:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
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
    // InternalVaryGrammar.g:815:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
    public final EObject ruleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject this_Vector_0 = null;

        EObject this_Matriz_1 = null;

        EObject this_Registro_2 = null;

        EObject this_Archivo_3 = null;

        EObject this_Enumerado_4 = null;

        EObject this_Subrango_5 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:818:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // InternalVaryGrammar.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // InternalVaryGrammar.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt31=6;
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


    // $ANTLR start "entryRuleSubproceso"
    // InternalVaryGrammar.g:886:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // InternalVaryGrammar.g:887:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // InternalVaryGrammar.g:888:2: iv_ruleSubproceso= ruleSubproceso EOF
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
    // InternalVaryGrammar.g:895:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:898:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // InternalVaryGrammar.g:899:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // InternalVaryGrammar.g:899:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
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
                    // InternalVaryGrammar.g:900:5: this_Funcion_0= ruleFuncion
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
                    // InternalVaryGrammar.g:910:5: this_Procedimiento_1= ruleProcedimiento
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


    // $ANTLR start "entryRuleSentencias"
    // InternalVaryGrammar.g:928:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // InternalVaryGrammar.g:929:2: (iv_ruleSentencias= ruleSentencias EOF )
            // InternalVaryGrammar.g:930:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
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
    // $ANTLR end "entryRuleSentencias"


    // $ANTLR start "ruleSentencias"
    // InternalVaryGrammar.g:937:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
    public final EObject ruleSentencias() throws RecognitionException {
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
            // InternalVaryGrammar.g:940:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // InternalVaryGrammar.g:941:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // InternalVaryGrammar.g:941:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 67:
                {
                alt33=2;
                }
                break;
            case 68:
            case 70:
            case 73:
            case 74:
            case 77:
            case 80:
            case 84:
            case 85:
                {
                alt33=3;
                }
                break;
            case 31:
                {
                alt33=4;
                }
                break;
            case 32:
                {
                alt33=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt33=6;
                }
                break;
            case RULE_NOMBRE_FUN:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt33=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalVaryGrammar.g:942:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:952:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:962:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:972:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:982:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:992:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalVaryGrammar.g:1002:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
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
    // $ANTLR end "ruleSentencias"


    // $ANTLR start "entryRuleBloque"
    // InternalVaryGrammar.g:1018:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // InternalVaryGrammar.g:1019:2: (iv_ruleBloque= ruleBloque EOF )
            // InternalVaryGrammar.g:1020:2: iv_ruleBloque= ruleBloque EOF
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
    // InternalVaryGrammar.g:1027:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1030:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // InternalVaryGrammar.g:1031:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // InternalVaryGrammar.g:1031:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 68:
            case 70:
                {
                alt34=1;
                }
                break;
            case 73:
            case 74:
                {
                alt34=2;
                }
                break;
            case 77:
                {
                alt34=3;
                }
                break;
            case 80:
                {
                alt34=4;
                }
                break;
            case 84:
            case 85:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalVaryGrammar.g:1032:5: this_Si_0= ruleSi
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
                    // InternalVaryGrammar.g:1042:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:1052:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:1062:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:1072:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_segun_4=rulesegun();

                    state._fsp--;

                     
                            current = this_segun_4; 
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
    // InternalVaryGrammar.g:1088:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // InternalVaryGrammar.g:1089:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // InternalVaryGrammar.g:1090:2: iv_ruleDeclaracion= ruleDeclaracion EOF
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
    // InternalVaryGrammar.g:1097:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1100:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // InternalVaryGrammar.g:1101:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // InternalVaryGrammar.g:1101:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=88 && LA35_0<=92)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID||LA35_0==RULE_STRING) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalVaryGrammar.g:1102:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1112:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DeclaracionPropia_1=ruleDeclaracionPropia();

                    state._fsp--;

                     
                            current = this_DeclaracionPropia_1; 
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
    // InternalVaryGrammar.g:1128:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // InternalVaryGrammar.g:1129:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // InternalVaryGrammar.g:1130:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
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
    // InternalVaryGrammar.g:1137:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' ) ;
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
            // InternalVaryGrammar.g:1140:28: ( (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' ) )
            // InternalVaryGrammar.g:1141:1: (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:1141:1: (otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')' )
            // InternalVaryGrammar.g:1141:3: otherlv_0= 'abrir(' ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            // InternalVaryGrammar.g:1145:1: ( ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) ) )
            // InternalVaryGrammar.g:1145:2: ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ',' ( (lv_modo_3_0= ruleModoApertura ) ) otherlv_4= ',' ( (lv_variable_5_0= rulePrimaria ) )
            {
            // InternalVaryGrammar.g:1145:2: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1146:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1146:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:1147:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_1_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_31); 

                	newLeafNode(otherlv_2, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_1_1());
                
            // InternalVaryGrammar.g:1167:1: ( (lv_modo_3_0= ruleModoApertura ) )
            // InternalVaryGrammar.g:1168:1: (lv_modo_3_0= ruleModoApertura )
            {
            // InternalVaryGrammar.g:1168:1: (lv_modo_3_0= ruleModoApertura )
            // InternalVaryGrammar.g:1169:3: lv_modo_3_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_1_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_4, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_1_3());
                
            // InternalVaryGrammar.g:1189:1: ( (lv_variable_5_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1190:1: (lv_variable_5_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1190:1: (lv_variable_5_0= rulePrimaria )
            // InternalVaryGrammar.g:1191:3: lv_variable_5_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_1_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalVaryGrammar.g:1219:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // InternalVaryGrammar.g:1220:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // InternalVaryGrammar.g:1221:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
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
    // InternalVaryGrammar.g:1228:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1231:28: ( (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' ) )
            // InternalVaryGrammar.g:1232:1: (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' )
            {
            // InternalVaryGrammar.g:1232:1: (otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')' )
            // InternalVaryGrammar.g:1232:3: otherlv_0= 'cerrar(' ( (lv_variable_1_0= rulePrimaria ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            // InternalVaryGrammar.g:1236:1: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1237:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1237:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:1238:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalVaryGrammar.g:1266:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // InternalVaryGrammar.g:1267:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // InternalVaryGrammar.g:1268:2: iv_ruleModoApertura= ruleModoApertura EOF
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
    // InternalVaryGrammar.g:1275:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1278:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // InternalVaryGrammar.g:1279:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // InternalVaryGrammar.g:1279:1: (kw= 'escritura' | kw= 'lectura' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            else if ( (LA36_0==34) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalVaryGrammar.g:1280:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1287:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:1300:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // InternalVaryGrammar.g:1301:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // InternalVaryGrammar.g:1302:2: iv_ruleNombreInterna= ruleNombreInterna EOF
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
    // InternalVaryGrammar.g:1309:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1312:28: ( (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' ) )
            // InternalVaryGrammar.g:1313:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' )
            {
            // InternalVaryGrammar.g:1313:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' | kw= 'copiar(' )
            int alt37=10;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt37=1;
                }
                break;
            case 36:
                {
                alt37=2;
                }
                break;
            case 37:
                {
                alt37=3;
                }
                break;
            case 38:
                {
                alt37=4;
                }
                break;
            case 39:
                {
                alt37=5;
                }
                break;
            case 40:
                {
                alt37=6;
                }
                break;
            case 41:
                {
                alt37=7;
                }
                break;
            case 42:
                {
                alt37=8;
                }
                break;
            case 43:
                {
                alt37=9;
                }
                break;
            case 44:
                {
                alt37=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalVaryGrammar.g:1314:2: kw= 'cos('
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:1321:2: kw= 'cuadrado('
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:1328:2: kw= 'exp('
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:1335:2: kw= 'ln('
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:1342:2: kw= 'log('
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalVaryGrammar.g:1349:2: kw= 'sen('
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // InternalVaryGrammar.g:1356:2: kw= 'sqrt('
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // InternalVaryGrammar.g:1363:2: kw= 'longitud('
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // InternalVaryGrammar.g:1370:2: kw= 'concatena('
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getConcatenaKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // InternalVaryGrammar.g:1377:2: kw= 'copiar('
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:1390:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVaryGrammar.g:1391:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalVaryGrammar.g:1392:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalVaryGrammar.g:1399:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1402:28: (this_INT_0= RULE_INT )
            // InternalVaryGrammar.g:1403:5: this_INT_0= RULE_INT
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
    // InternalVaryGrammar.g:1418:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalVaryGrammar.g:1419:2: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalVaryGrammar.g:1420:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalVaryGrammar.g:1427:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1430:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? ) )
            // InternalVaryGrammar.g:1431:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            {
            // InternalVaryGrammar.g:1431:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )? )
            // InternalVaryGrammar.g:1431:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_33); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,45,FollowSets000.FOLLOW_34); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_35); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // InternalVaryGrammar.g:1451:1: ( (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=46 && LA39_0<=47)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVaryGrammar.g:1451:2: (kw= 'E' | kw= 'e' ) this_INT_5= RULE_INT
                    {
                    // InternalVaryGrammar.g:1451:2: (kw= 'E' | kw= 'e' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==46) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==47) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalVaryGrammar.g:1452:2: kw= 'E'
                            {
                            kw=(Token)match(input,46,FollowSets000.FOLLOW_34); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // InternalVaryGrammar.g:1459:2: kw= 'e'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_34); 

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
    // InternalVaryGrammar.g:1479:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalVaryGrammar.g:1480:2: (iv_ruleTipo= ruleTipo EOF )
            // InternalVaryGrammar.g:1481:2: iv_ruleTipo= ruleTipo EOF
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
    // InternalVaryGrammar.g:1488:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1491:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // InternalVaryGrammar.g:1492:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // InternalVaryGrammar.g:1492:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=88 && LA40_0<=92)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalVaryGrammar.g:1493:5: this_TipoDefinido_0= ruleTipoDefinido
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
                    // InternalVaryGrammar.g:1503:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TipoExistente_1=ruleTipoExistente();

                    state._fsp--;

                     
                            current = this_TipoExistente_1; 
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
    // InternalVaryGrammar.g:1519:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // InternalVaryGrammar.g:1520:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // InternalVaryGrammar.g:1521:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
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
    // InternalVaryGrammar.g:1528:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1531:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1532:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:1532:1: ( (lv_tipo_0_0= ruleEString ) )
            // InternalVaryGrammar.g:1533:1: (lv_tipo_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:1533:1: (lv_tipo_0_0= ruleEString )
            // InternalVaryGrammar.g:1534:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoDefinidoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
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


    // $ANTLR start "entryRuleTipoExistente"
    // InternalVaryGrammar.g:1558:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // InternalVaryGrammar.g:1559:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // InternalVaryGrammar.g:1560:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
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
    // $ANTLR end "entryRuleTipoExistente"


    // $ANTLR start "ruleTipoExistente"
    // InternalVaryGrammar.g:1567:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1570:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // InternalVaryGrammar.g:1571:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // InternalVaryGrammar.g:1571:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:1572:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:1572:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:1573:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoExistenteRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
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
    // $ANTLR end "ruleTipoExistente"


    // $ANTLR start "entryRuleConstantes"
    // InternalVaryGrammar.g:1597:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // InternalVaryGrammar.g:1598:2: (iv_ruleConstantes= ruleConstantes EOF )
            // InternalVaryGrammar.g:1599:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
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
    // $ANTLR end "entryRuleConstantes"


    // $ANTLR start "ruleConstantes"
    // InternalVaryGrammar.g:1606:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1609:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // InternalVaryGrammar.g:1610:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // InternalVaryGrammar.g:1610:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // InternalVaryGrammar.g:1610:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // InternalVaryGrammar.g:1610:2: ( (lv_variable_0_0= ruleVariable ) )
            // InternalVaryGrammar.g:1611:1: (lv_variable_0_0= ruleVariable )
            {
            // InternalVaryGrammar.g:1611:1: (lv_variable_0_0= ruleVariable )
            // InternalVaryGrammar.g:1612:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:1632:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1633:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1633:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:1634:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
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
    // $ANTLR end "ruleConstantes"


    // $ANTLR start "entryRuleVector"
    // InternalVaryGrammar.g:1658:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalVaryGrammar.g:1659:2: (iv_ruleVector= ruleVector EOF )
            // InternalVaryGrammar.g:1660:2: iv_ruleVector= ruleVector EOF
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
    // InternalVaryGrammar.g:1667:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // InternalVaryGrammar.g:1670:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:1671:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:1671:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1671:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_37); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // InternalVaryGrammar.g:1679:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1680:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1680:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:1681:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
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

            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_39); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_40); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // InternalVaryGrammar.g:1705:1: ( (lv_tipo_5_0= ruleTipo ) )
            // InternalVaryGrammar.g:1706:1: (lv_tipo_5_0= ruleTipo )
            {
            // InternalVaryGrammar.g:1706:1: (lv_tipo_5_0= ruleTipo )
            // InternalVaryGrammar.g:1707:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
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

            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // InternalVaryGrammar.g:1727:1: ( (lv_nombre_7_0= ruleEString ) )
            // InternalVaryGrammar.g:1728:1: (lv_nombre_7_0= ruleEString )
            {
            // InternalVaryGrammar.g:1728:1: (lv_nombre_7_0= ruleEString )
            // InternalVaryGrammar.g:1729:3: lv_nombre_7_0= ruleEString
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
    // InternalVaryGrammar.g:1753:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // InternalVaryGrammar.g:1754:2: (iv_ruleMatriz= ruleMatriz EOF )
            // InternalVaryGrammar.g:1755:2: iv_ruleMatriz= ruleMatriz EOF
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
    // InternalVaryGrammar.g:1762:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // InternalVaryGrammar.g:1765:28: ( (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:1766:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:1766:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1766:3: otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_37); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // InternalVaryGrammar.g:1774:1: ( (lv_valor_2_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1775:1: (lv_valor_2_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1775:1: (lv_valor_2_0= rulePrimaria )
            // InternalVaryGrammar.g:1776:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_42);
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

            otherlv_3=(Token)match(input,55,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // InternalVaryGrammar.g:1796:1: ( (lv_valor_4_0= rulePrimaria ) )
            // InternalVaryGrammar.g:1797:1: (lv_valor_4_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:1797:1: (lv_valor_4_0= rulePrimaria )
            // InternalVaryGrammar.g:1798:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_38);
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

            otherlv_5=(Token)match(input,51,FollowSets000.FOLLOW_39); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_40); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // InternalVaryGrammar.g:1822:1: ( (lv_tipo_7_0= ruleTipo ) )
            // InternalVaryGrammar.g:1823:1: (lv_tipo_7_0= ruleTipo )
            {
            // InternalVaryGrammar.g:1823:1: (lv_tipo_7_0= ruleTipo )
            // InternalVaryGrammar.g:1824:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
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

            otherlv_8=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // InternalVaryGrammar.g:1844:1: ( (lv_nombre_9_0= ruleEString ) )
            // InternalVaryGrammar.g:1845:1: (lv_nombre_9_0= ruleEString )
            {
            // InternalVaryGrammar.g:1845:1: (lv_nombre_9_0= ruleEString )
            // InternalVaryGrammar.g:1846:3: lv_nombre_9_0= ruleEString
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
    // InternalVaryGrammar.g:1870:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalVaryGrammar.g:1871:2: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalVaryGrammar.g:1872:2: iv_ruleRegistro= ruleRegistro EOF
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
    // InternalVaryGrammar.g:1879:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1882:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' ) )
            // InternalVaryGrammar.g:1883:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' )
            {
            // InternalVaryGrammar.g:1883:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro' )
            // InternalVaryGrammar.g:1883:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'fin_registro'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // InternalVaryGrammar.g:1887:1: ( (lv_nombre_1_0= ruleEString ) )
            // InternalVaryGrammar.g:1888:1: (lv_nombre_1_0= ruleEString )
            {
            // InternalVaryGrammar.g:1888:1: (lv_nombre_1_0= ruleEString )
            // InternalVaryGrammar.g:1889:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalVaryGrammar.g:1905:2: ( (lv_variable_2_0= ruleDeclaracion ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||LA41_0==RULE_STRING||(LA41_0>=88 && LA41_0<=92)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalVaryGrammar.g:1906:1: (lv_variable_2_0= ruleDeclaracion )
            	    {
            	    // InternalVaryGrammar.g:1906:1: (lv_variable_2_0= ruleDeclaracion )
            	    // InternalVaryGrammar.g:1907:3: lv_variable_2_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    lv_variable_2_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:1935:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // InternalVaryGrammar.g:1936:2: (iv_ruleArchivo= ruleArchivo EOF )
            // InternalVaryGrammar.g:1937:2: iv_ruleArchivo= ruleArchivo EOF
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
    // InternalVaryGrammar.g:1944:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:1947:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:1948:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:1948:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // InternalVaryGrammar.g:1948:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_40); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // InternalVaryGrammar.g:1952:1: ( (lv_tipo_1_0= ruleTipo ) )
            // InternalVaryGrammar.g:1953:1: (lv_tipo_1_0= ruleTipo )
            {
            // InternalVaryGrammar.g:1953:1: (lv_tipo_1_0= ruleTipo )
            // InternalVaryGrammar.g:1954:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
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

            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:1974:1: ( (lv_nombre_3_0= ruleEString ) )
            // InternalVaryGrammar.g:1975:1: (lv_nombre_3_0= ruleEString )
            {
            // InternalVaryGrammar.g:1975:1: (lv_nombre_3_0= ruleEString )
            // InternalVaryGrammar.g:1976:3: lv_nombre_3_0= ruleEString
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
    // InternalVaryGrammar.g:2000:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // InternalVaryGrammar.g:2001:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // InternalVaryGrammar.g:2002:2: iv_ruleEnumerado= ruleEnumerado EOF
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
    // InternalVaryGrammar.g:2009:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
    public final EObject ruleEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_valor_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2012:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // InternalVaryGrammar.g:2013:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // InternalVaryGrammar.g:2013:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // InternalVaryGrammar.g:2013:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // InternalVaryGrammar.g:2013:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2014:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2014:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2015:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_44); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalVaryGrammar.g:2039:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // InternalVaryGrammar.g:2039:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // InternalVaryGrammar.g:2039:2: ( (lv_valor_3_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2040:1: (lv_valor_3_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2040:1: (lv_valor_3_0= rulePrimaria )
            // InternalVaryGrammar.g:2041:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_45);
            lv_valor_3_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2057:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalVaryGrammar.g:2057:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_29); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // InternalVaryGrammar.g:2061:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:2062:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:2062:1: (lv_valor_5_0= rulePrimaria )
            	    // InternalVaryGrammar.g:2063:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_valor_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"valor",
            	            		lv_valor_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,60,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:2091:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // InternalVaryGrammar.g:2092:2: (iv_ruleSubrango= ruleSubrango EOF )
            // InternalVaryGrammar.g:2093:2: iv_ruleSubrango= ruleSubrango EOF
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
    // InternalVaryGrammar.g:2100:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2103:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // InternalVaryGrammar.g:2104:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // InternalVaryGrammar.g:2104:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==48) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==RULE_INT) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==RULE_ID||LA43_3==RULE_STRING) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==RULE_ID) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==48) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==RULE_INT) ) {
                        alt43=1;
                    }
                    else if ( (LA43_3==RULE_ID||LA43_3==RULE_STRING) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalVaryGrammar.g:2105:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
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
                    // InternalVaryGrammar.g:2115:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
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
    // InternalVaryGrammar.g:2131:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // InternalVaryGrammar.g:2132:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // InternalVaryGrammar.g:2133:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
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
    // InternalVaryGrammar.g:2140:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2143:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // InternalVaryGrammar.g:2144:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // InternalVaryGrammar.g:2144:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // InternalVaryGrammar.g:2144:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // InternalVaryGrammar.g:2144:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2145:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2145:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2146:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:2166:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // InternalVaryGrammar.g:2166:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // InternalVaryGrammar.g:2166:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // InternalVaryGrammar.g:2167:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // InternalVaryGrammar.g:2167:1: (lv_limite_inf_2_0= ruleEInt )
            // InternalVaryGrammar.g:2168:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
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

            otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_34); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // InternalVaryGrammar.g:2188:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // InternalVaryGrammar.g:2189:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // InternalVaryGrammar.g:2189:1: (lv_limite_sup_4_0= ruleEInt )
            // InternalVaryGrammar.g:2190:3: lv_limite_sup_4_0= ruleEInt
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
    // InternalVaryGrammar.g:2214:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // InternalVaryGrammar.g:2215:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // InternalVaryGrammar.g:2216:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
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
    // InternalVaryGrammar.g:2223:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2226:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:2227:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:2227:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:2227:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:2227:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2228:1: (lv_nombre_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2228:1: (lv_nombre_0_0= ruleEString )
            // InternalVaryGrammar.g:2229:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
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

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // InternalVaryGrammar.g:2249:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // InternalVaryGrammar.g:2249:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:2249:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // InternalVaryGrammar.g:2250:1: (lv_limite_inf_2_0= ruleEString )
            {
            // InternalVaryGrammar.g:2250:1: (lv_limite_inf_2_0= ruleEString )
            // InternalVaryGrammar.g:2251:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
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

            otherlv_3=(Token)match(input,61,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // InternalVaryGrammar.g:2271:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // InternalVaryGrammar.g:2272:1: (lv_limite_sup_4_0= ruleEString )
            {
            // InternalVaryGrammar.g:2272:1: (lv_limite_sup_4_0= ruleEString )
            // InternalVaryGrammar.g:2273:3: lv_limite_sup_4_0= ruleEString
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
    // InternalVaryGrammar.g:2297:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // InternalVaryGrammar.g:2298:2: (iv_ruleInicio= ruleInicio EOF )
            // InternalVaryGrammar.g:2299:2: iv_ruleInicio= ruleInicio EOF
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
    // InternalVaryGrammar.g:2306:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'fin_principal' ) ;
    public final EObject ruleInicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaracion_3_0 = null;

        EObject lv_tiene_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2309:28: ( (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'fin_principal' ) )
            // InternalVaryGrammar.g:2310:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'fin_principal' )
            {
            // InternalVaryGrammar.g:2310:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'fin_principal' )
            // InternalVaryGrammar.g:2310:3: otherlv_0= 'principal' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'inicio' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'fin_principal'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_47); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getPrincipalKeyword_0());
                
            // InternalVaryGrammar.g:2314:1: ()
            // InternalVaryGrammar.g:2315:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_48); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // InternalVaryGrammar.g:2324:1: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==RULE_STRING||(LA44_0>=88 && LA44_0<=92)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVaryGrammar.g:2325:1: (lv_declaracion_3_0= ruleDeclaracion )
            	    {
            	    // InternalVaryGrammar.g:2325:1: (lv_declaracion_3_0= ruleDeclaracion )
            	    // InternalVaryGrammar.g:2326:3: lv_declaracion_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    lv_declaracion_3_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaracion",
            	            		lv_declaracion_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,63,FollowSets000.FOLLOW_49); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInicioKeyword_4());
                
            // InternalVaryGrammar.g:2346:1: ( (lv_tiene_5_0= ruleSentencias ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_NOMBRE_FUN)||LA45_0==RULE_STRING||(LA45_0>=31 && LA45_0<=32)||(LA45_0>=35 && LA45_0<=44)||(LA45_0>=66 && LA45_0<=68)||LA45_0==70||(LA45_0>=73 && LA45_0<=74)||LA45_0==77||LA45_0==80||(LA45_0>=84 && LA45_0<=85)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVaryGrammar.g:2347:1: (lv_tiene_5_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:2347:1: (lv_tiene_5_0= ruleSentencias )
            	    // InternalVaryGrammar.g:2348:3: lv_tiene_5_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_49);
            	    lv_tiene_5_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tiene",
            	            		lv_tiene_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_6=(Token)match(input,64,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:2376:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVaryGrammar.g:2377:2: (iv_ruleEString= ruleEString EOF )
            // InternalVaryGrammar.g:2378:2: iv_ruleEString= ruleEString EOF
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
    // InternalVaryGrammar.g:2385:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2388:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVaryGrammar.g:2389:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVaryGrammar.g:2389:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalVaryGrammar.g:2389:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:2397:10: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleDeclaracionVariable"
    // InternalVaryGrammar.g:2412:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // InternalVaryGrammar.g:2413:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // InternalVaryGrammar.g:2414:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
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
    // $ANTLR end "entryRuleDeclaracionVariable"


    // $ANTLR start "ruleDeclaracionVariable"
    // InternalVaryGrammar.g:2421:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2424:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // InternalVaryGrammar.g:2425:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // InternalVaryGrammar.g:2425:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // InternalVaryGrammar.g:2425:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // InternalVaryGrammar.g:2425:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:2426:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:2426:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:2427:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // InternalVaryGrammar.g:2447:1: ( (lv_variable_2_0= ruleVariable ) )
            // InternalVaryGrammar.g:2448:1: (lv_variable_2_0= ruleVariable )
            {
            // InternalVaryGrammar.g:2448:1: (lv_variable_2_0= ruleVariable )
            // InternalVaryGrammar.g:2449:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_50);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2465:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==28) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalVaryGrammar.g:2465:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // InternalVaryGrammar.g:2469:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // InternalVaryGrammar.g:2470:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // InternalVaryGrammar.g:2470:1: (lv_variable_4_0= ruleVariable )
            	    // InternalVaryGrammar.g:2471:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_4_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
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
    // $ANTLR end "ruleDeclaracionVariable"


    // $ANTLR start "entryRuleDeclaracionPropia"
    // InternalVaryGrammar.g:2495:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // InternalVaryGrammar.g:2496:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // InternalVaryGrammar.g:2497:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
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
    // $ANTLR end "entryRuleDeclaracionPropia"


    // $ANTLR start "ruleDeclaracionPropia"
    // InternalVaryGrammar.g:2504:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2507:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // InternalVaryGrammar.g:2508:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // InternalVaryGrammar.g:2508:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // InternalVaryGrammar.g:2508:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // InternalVaryGrammar.g:2508:2: ( (lv_tipo_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2509:1: (lv_tipo_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2509:1: (lv_tipo_0_0= ruleEString )
            // InternalVaryGrammar.g:2510:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // InternalVaryGrammar.g:2530:1: ( (lv_variable_2_0= ruleVariable ) )
            // InternalVaryGrammar.g:2531:1: (lv_variable_2_0= ruleVariable )
            {
            // InternalVaryGrammar.g:2531:1: (lv_variable_2_0= ruleVariable )
            // InternalVaryGrammar.g:2532:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_50);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:2548:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==28) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalVaryGrammar.g:2548:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // InternalVaryGrammar.g:2552:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // InternalVaryGrammar.g:2553:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // InternalVaryGrammar.g:2553:1: (lv_variable_4_0= ruleVariable )
            	    // InternalVaryGrammar.g:2554:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_4_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleDeclaracionPropia"


    // $ANTLR start "entryRuleAsignacion"
    // InternalVaryGrammar.g:2578:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // InternalVaryGrammar.g:2579:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // InternalVaryGrammar.g:2580:2: iv_ruleAsignacion= ruleAsignacion EOF
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
    // InternalVaryGrammar.g:2587:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2590:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // InternalVaryGrammar.g:2591:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // InternalVaryGrammar.g:2591:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==45||LA49_1==50) ) {
                    alt49=2;
                }
                else if ( (LA49_1==65) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA49_0==RULE_ID) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==45||LA49_2==50) ) {
                    alt49=2;
                }
                else if ( (LA49_2==65) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalVaryGrammar.g:2592:5: this_AsignacionNormal_0= ruleAsignacionNormal
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
                    // InternalVaryGrammar.g:2602:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
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
    // InternalVaryGrammar.g:2618:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // InternalVaryGrammar.g:2619:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // InternalVaryGrammar.g:2620:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
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
    // InternalVaryGrammar.g:2627:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2630:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:2631:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:2631:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:2631:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:2631:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // InternalVaryGrammar.g:2632:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // InternalVaryGrammar.g:2632:1: (lv_valor_asignacion_0_0= ruleEString )
            // InternalVaryGrammar.g:2633:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
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

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // InternalVaryGrammar.g:2653:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:2654:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:2654:1: (lv_operador_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:2655:3: lv_operador_2_0= ruleOperacionCompleta
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
    // InternalVaryGrammar.g:2679:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // InternalVaryGrammar.g:2680:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // InternalVaryGrammar.g:2681:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
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
    // InternalVaryGrammar.g:2688:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2691:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:2692:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:2692:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:2692:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:2692:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // InternalVaryGrammar.g:2693:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // InternalVaryGrammar.g:2693:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // InternalVaryGrammar.g:2694:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
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

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // InternalVaryGrammar.g:2714:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:2715:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:2715:1: (lv_operador_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:2716:3: lv_operador_2_0= ruleOperacionCompleta
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
    // InternalVaryGrammar.g:2740:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // InternalVaryGrammar.g:2741:2: (iv_ruleEscribir= ruleEscribir EOF )
            // InternalVaryGrammar.g:2742:2: iv_ruleEscribir= ruleEscribir EOF
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
    // InternalVaryGrammar.g:2749:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operador_1_0 = null;

        EObject lv_operador_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2752:28: ( (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' ) )
            // InternalVaryGrammar.g:2753:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' )
            {
            // InternalVaryGrammar.g:2753:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')' )
            // InternalVaryGrammar.g:2753:3: otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            // InternalVaryGrammar.g:2757:1: ( (lv_operador_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2758:1: (lv_operador_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2758:1: (lv_operador_1_0= rulePrimaria )
            // InternalVaryGrammar.g:2759:3: lv_operador_1_0= rulePrimaria
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

            // InternalVaryGrammar.g:2775:2: (otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==28) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalVaryGrammar.g:2775:4: otherlv_2= ',' ( (lv_operador_3_0= ruleOperacionCompleta ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_52); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEscribirAccess().getCommaKeyword_2_0());
            	        
            	    // InternalVaryGrammar.g:2779:1: ( (lv_operador_3_0= ruleOperacionCompleta ) )
            	    // InternalVaryGrammar.g:2780:1: (lv_operador_3_0= ruleOperacionCompleta )
            	    {
            	    // InternalVaryGrammar.g:2780:1: (lv_operador_3_0= ruleOperacionCompleta )
            	    // InternalVaryGrammar.g:2781:3: lv_operador_3_0= ruleOperacionCompleta
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
            	    break loop50;
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
    // InternalVaryGrammar.g:2809:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // InternalVaryGrammar.g:2810:2: (iv_ruleLeer= ruleLeer EOF )
            // InternalVaryGrammar.g:2811:2: iv_ruleLeer= ruleLeer EOF
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
    // InternalVaryGrammar.g:2818:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2821:28: ( (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) )
            // InternalVaryGrammar.g:2822:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            {
            // InternalVaryGrammar.g:2822:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            // InternalVaryGrammar.g:2822:3: otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            // InternalVaryGrammar.g:2826:1: ( (lv_variable_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:2827:1: (lv_variable_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:2827:1: (lv_variable_1_0= rulePrimaria )
            // InternalVaryGrammar.g:2828:3: lv_variable_1_0= rulePrimaria
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

            // InternalVaryGrammar.g:2844:2: (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==28) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalVaryGrammar.g:2844:4: otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_29); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeerAccess().getCommaKeyword_2_0());
            	        
            	    // InternalVaryGrammar.g:2848:1: ( (lv_variable_3_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:2849:1: (lv_variable_3_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:2849:1: (lv_variable_3_0= rulePrimaria )
            	    // InternalVaryGrammar.g:2850:3: lv_variable_3_0= rulePrimaria
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
            	    break loop51;
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
    // InternalVaryGrammar.g:2878:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // InternalVaryGrammar.g:2879:2: (iv_ruleSi= ruleSi EOF )
            // InternalVaryGrammar.g:2880:2: iv_ruleSi= ruleSi EOF
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
    // InternalVaryGrammar.g:2887:1: ruleSi returns [EObject current=null] : ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) ;
    public final EObject ruleSi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        EObject lv_valor_3_0 = null;

        EObject lv_sentencias_6_0 = null;

        EObject lv_devuelve_7_0 = null;

        EObject lv_sino_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:2890:28: ( ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) )
            // InternalVaryGrammar.g:2891:1: ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            {
            // InternalVaryGrammar.g:2891:1: ( ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            // InternalVaryGrammar.g:2891:2: ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'entonces' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si'
            {
            // InternalVaryGrammar.g:2891:2: ( (otherlv_0= 'si' otherlv_1= '(' ) | otherlv_2= 'si(' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            else if ( (LA52_0==70) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalVaryGrammar.g:2891:3: (otherlv_0= 'si' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:2891:3: (otherlv_0= 'si' otherlv_1= '(' )
                    // InternalVaryGrammar.g:2891:5: otherlv_0= 'si' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_1, grammarAccess.getSiAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:2900:7: otherlv_2= 'si('
                    {
                    otherlv_2=(Token)match(input,70,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getSiKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:2904:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:2905:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:2905:1: (lv_valor_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:2906:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_54); 

                	newLeafNode(otherlv_4, grammarAccess.getSiAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,71,FollowSets000.FOLLOW_55); 

                	newLeafNode(otherlv_5, grammarAccess.getSiAccess().getEntoncesKeyword_3());
                
            // InternalVaryGrammar.g:2930:1: ( (lv_sentencias_6_0= ruleSentencias ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_NOMBRE_FUN)||LA53_0==RULE_STRING||(LA53_0>=31 && LA53_0<=32)||(LA53_0>=35 && LA53_0<=44)||(LA53_0>=66 && LA53_0<=68)||LA53_0==70||(LA53_0>=73 && LA53_0<=74)||LA53_0==77||LA53_0==80||(LA53_0>=84 && LA53_0<=85)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalVaryGrammar.g:2931:1: (lv_sentencias_6_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:2931:1: (lv_sentencias_6_0= ruleSentencias )
            	    // InternalVaryGrammar.g:2932:3: lv_sentencias_6_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    lv_sentencias_6_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalVaryGrammar.g:2948:3: ( (lv_devuelve_7_0= ruleDevolver ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==108) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalVaryGrammar.g:2949:1: (lv_devuelve_7_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:2949:1: (lv_devuelve_7_0= ruleDevolver )
                    // InternalVaryGrammar.g:2950:3: lv_devuelve_7_0= ruleDevolver
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

            // InternalVaryGrammar.g:2966:3: ( (lv_sino_8_0= ruleSino ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==107) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVaryGrammar.g:2967:1: (lv_sino_8_0= ruleSino )
                    {
                    // InternalVaryGrammar.g:2967:1: (lv_sino_8_0= ruleSino )
                    // InternalVaryGrammar.g:2968:3: lv_sino_8_0= ruleSino
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


    // $ANTLR start "entryRulemientras"
    // InternalVaryGrammar.g:2996:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // InternalVaryGrammar.g:2997:2: (iv_rulemientras= rulemientras EOF )
            // InternalVaryGrammar.g:2998:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
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
    // $ANTLR end "entryRulemientras"


    // $ANTLR start "rulemientras"
    // InternalVaryGrammar.g:3005:1: rulemientras returns [EObject current=null] : ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'fin_mientras' ) ;
    public final EObject rulemientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_valor_3_0 = null;

        EObject lv_sentencias_6_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3008:28: ( ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'fin_mientras' ) )
            // InternalVaryGrammar.g:3009:1: ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'fin_mientras' )
            {
            // InternalVaryGrammar.g:3009:1: ( ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'fin_mientras' )
            // InternalVaryGrammar.g:3009:2: ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'fin_mientras'
            {
            // InternalVaryGrammar.g:3009:2: ( (otherlv_0= 'mientras' otherlv_1= '(' ) | otherlv_2= 'mientras(' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==73) ) {
                alt56=1;
            }
            else if ( (LA56_0==74) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalVaryGrammar.g:3009:3: (otherlv_0= 'mientras' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:3009:3: (otherlv_0= 'mientras' otherlv_1= '(' )
                    // InternalVaryGrammar.g:3009:5: otherlv_0= 'mientras' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_1, grammarAccess.getMientrasAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3018:7: otherlv_2= 'mientras('
                    {
                    otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getMientrasKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3022:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3023:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3023:1: (lv_valor_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3024:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getMientrasAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_59); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getHacerKeyword_3());
                
            // InternalVaryGrammar.g:3048:1: ( (lv_sentencias_6_0= ruleSentencias ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_NOMBRE_FUN)||LA57_0==RULE_STRING||(LA57_0>=31 && LA57_0<=32)||(LA57_0>=35 && LA57_0<=44)||(LA57_0>=66 && LA57_0<=68)||LA57_0==70||(LA57_0>=73 && LA57_0<=74)||LA57_0==77||LA57_0==80||(LA57_0>=84 && LA57_0<=85)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalVaryGrammar.g:3049:1: (lv_sentencias_6_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:3049:1: (lv_sentencias_6_0= ruleSentencias )
            	    // InternalVaryGrammar.g:3050:3: lv_sentencias_6_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_sentencias_6_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "rulemientras"


    // $ANTLR start "entryRulerepetir"
    // InternalVaryGrammar.g:3078:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // InternalVaryGrammar.g:3079:2: (iv_rulerepetir= rulerepetir EOF )
            // InternalVaryGrammar.g:3080:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
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
    // $ANTLR end "entryRulerepetir"


    // $ANTLR start "rulerepetir"
    // InternalVaryGrammar.g:3087:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_valor_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3090:28: ( (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) )
            // InternalVaryGrammar.g:3091:1: (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            {
            // InternalVaryGrammar.g:3091:1: (otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            // InternalVaryGrammar.g:3091:3: otherlv_0= 'repetir' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_60); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // InternalVaryGrammar.g:3095:1: ( (lv_sentencias_1_0= ruleSentencias ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_NOMBRE_FUN)||LA58_0==RULE_STRING||(LA58_0>=31 && LA58_0<=32)||(LA58_0>=35 && LA58_0<=44)||(LA58_0>=66 && LA58_0<=68)||LA58_0==70||(LA58_0>=73 && LA58_0<=74)||LA58_0==77||LA58_0==80||(LA58_0>=84 && LA58_0<=85)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalVaryGrammar.g:3096:1: (lv_sentencias_1_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:3096:1: (lv_sentencias_1_0= ruleSentencias )
            	    // InternalVaryGrammar.g:3097:3: lv_sentencias_1_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_sentencias_1_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_1_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalVaryGrammar.g:3113:3: ( (otherlv_2= 'hasta_que' otherlv_3= '(' ) | otherlv_4= 'hasta_que(' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==78) ) {
                alt59=1;
            }
            else if ( (LA59_0==79) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalVaryGrammar.g:3113:4: (otherlv_2= 'hasta_que' otherlv_3= '(' )
                    {
                    // InternalVaryGrammar.g:3113:4: (otherlv_2= 'hasta_que' otherlv_3= '(' )
                    // InternalVaryGrammar.g:3113:6: otherlv_2= 'hasta_que' otherlv_3= '('
                    {
                    otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_2, grammarAccess.getRepetirAccess().getHasta_queKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,69,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getLeftParenthesisKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3122:7: otherlv_4= 'hasta_que('
                    {
                    otherlv_4=(Token)match(input,79,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_4, grammarAccess.getRepetirAccess().getHasta_queKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3126:2: ( (lv_valor_5_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3127:1: (lv_valor_5_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3127:1: (lv_valor_5_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3128:3: lv_valor_5_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_valor_5_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_5_0, 
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
    // $ANTLR end "rulerepetir"


    // $ANTLR start "entryRuledesde"
    // InternalVaryGrammar.g:3156:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // InternalVaryGrammar.g:3157:2: (iv_ruledesde= ruledesde EOF )
            // InternalVaryGrammar.g:3158:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
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
    // $ANTLR end "entryRuledesde"


    // $ANTLR start "ruledesde"
    // InternalVaryGrammar.g:3165:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'fin_desde' ) ;
    public final EObject ruledesde() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_asignacion_1_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_sentencias_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3168:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'fin_desde' ) )
            // InternalVaryGrammar.g:3169:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'fin_desde' )
            {
            // InternalVaryGrammar.g:3169:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'fin_desde' )
            // InternalVaryGrammar.g:3169:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'hacer' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'fin_desde'
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // InternalVaryGrammar.g:3173:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // InternalVaryGrammar.g:3174:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // InternalVaryGrammar.g:3174:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // InternalVaryGrammar.g:3175:3: lv_asignacion_1_0= ruleAsignacionNormal
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

            otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // InternalVaryGrammar.g:3195:1: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3196:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3196:1: (lv_valor_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3197:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_58);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_62); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // InternalVaryGrammar.g:3217:1: ( (lv_sentencias_5_0= ruleSentencias ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_ID && LA60_0<=RULE_NOMBRE_FUN)||LA60_0==RULE_STRING||(LA60_0>=31 && LA60_0<=32)||(LA60_0>=35 && LA60_0<=44)||(LA60_0>=66 && LA60_0<=68)||LA60_0==70||(LA60_0>=73 && LA60_0<=74)||LA60_0==77||LA60_0==80||(LA60_0>=84 && LA60_0<=85)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalVaryGrammar.g:3218:1: (lv_sentencias_5_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:3218:1: (lv_sentencias_5_0= ruleSentencias )
            	    // InternalVaryGrammar.g:3219:3: lv_sentencias_5_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_sentencias_5_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_5_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // $ANTLR end "ruledesde"


    // $ANTLR start "entryRuleCaso"
    // InternalVaryGrammar.g:3247:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // InternalVaryGrammar.g:3248:2: (iv_ruleCaso= ruleCaso EOF )
            // InternalVaryGrammar.g:3249:2: iv_ruleCaso= ruleCaso EOF
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
    // InternalVaryGrammar.g:3256:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operador_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3259:28: ( (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // InternalVaryGrammar.g:3260:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // InternalVaryGrammar.g:3260:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // InternalVaryGrammar.g:3260:3: otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
                
            // InternalVaryGrammar.g:3264:1: ( (lv_operador_1_0= rulePrimaria ) )
            // InternalVaryGrammar.g:3265:1: (lv_operador_1_0= rulePrimaria )
            {
            // InternalVaryGrammar.g:3265:1: (lv_operador_1_0= rulePrimaria )
            // InternalVaryGrammar.g:3266:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
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

            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_63); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:3286:1: ( (lv_sentencias_3_0= ruleSentencias ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_NOMBRE_FUN)||LA61_0==RULE_STRING||(LA61_0>=31 && LA61_0<=32)||(LA61_0>=35 && LA61_0<=44)||(LA61_0>=66 && LA61_0<=68)||LA61_0==70||(LA61_0>=73 && LA61_0<=74)||LA61_0==77||LA61_0==80||(LA61_0>=84 && LA61_0<=85)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalVaryGrammar.g:3287:1: (lv_sentencias_3_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:3287:1: (lv_sentencias_3_0= ruleSentencias )
            	    // InternalVaryGrammar.g:3288:3: lv_sentencias_3_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_sentencias_3_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_3_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            // InternalVaryGrammar.g:3304:3: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==108) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVaryGrammar.g:3305:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:3305:1: (lv_devuelve_4_0= ruleDevolver )
                    // InternalVaryGrammar.g:3306:3: lv_devuelve_4_0= ruleDevolver
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


    // $ANTLR start "entryRulesegun"
    // InternalVaryGrammar.g:3330:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // InternalVaryGrammar.g:3331:2: (iv_rulesegun= rulesegun EOF )
            // InternalVaryGrammar.g:3332:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
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
    // $ANTLR end "entryRulesegun"


    // $ANTLR start "rulesegun"
    // InternalVaryGrammar.g:3339:1: rulesegun returns [EObject current=null] : ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) ;
    public final EObject rulesegun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_valor_3_0 = null;

        EObject lv_caso_6_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_devuelve_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3342:28: ( ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' ) )
            // InternalVaryGrammar.g:3343:1: ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            {
            // InternalVaryGrammar.g:3343:1: ( ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun' )
            // InternalVaryGrammar.g:3343:2: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'hacer' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'en_otro_caso:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'fin_segun'
            {
            // InternalVaryGrammar.g:3343:2: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ) | otherlv_2= 'segun_sea(' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==84) ) {
                alt63=1;
            }
            else if ( (LA63_0==85) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalVaryGrammar.g:3343:3: (otherlv_0= 'segun_sea' otherlv_1= '(' )
                    {
                    // InternalVaryGrammar.g:3343:3: (otherlv_0= 'segun_sea' otherlv_1= '(' )
                    // InternalVaryGrammar.g:3343:5: otherlv_0= 'segun_sea' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_53); 

                        	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3352:7: otherlv_2= 'segun_sea('
                    {
                    otherlv_2=(Token)match(input,85,FollowSets000.FOLLOW_52); 

                        	newLeafNode(otherlv_2, grammarAccess.getSegunAccess().getSegun_seaKeyword_0_1());
                        

                    }
                    break;

            }

            // InternalVaryGrammar.g:3356:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:3357:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:3357:1: (lv_valor_3_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:3358:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_64); 

                	newLeafNode(otherlv_5, grammarAccess.getSegunAccess().getHacerKeyword_3());
                
            // InternalVaryGrammar.g:3382:1: ( (lv_caso_6_0= ruleCaso ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==83) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalVaryGrammar.g:3383:1: (lv_caso_6_0= ruleCaso )
            	    {
            	    // InternalVaryGrammar.g:3383:1: (lv_caso_6_0= ruleCaso )
            	    // InternalVaryGrammar.g:3384:3: lv_caso_6_0= ruleCaso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_64);
            	    lv_caso_6_0=ruleCaso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"caso",
            	            		lv_caso_6_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Caso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_7=(Token)match(input,86,FollowSets000.FOLLOW_65); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_5());
                
            // InternalVaryGrammar.g:3404:1: ( (lv_sentencias_8_0= ruleSentencias ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_ID && LA65_0<=RULE_NOMBRE_FUN)||LA65_0==RULE_STRING||(LA65_0>=31 && LA65_0<=32)||(LA65_0>=35 && LA65_0<=44)||(LA65_0>=66 && LA65_0<=68)||LA65_0==70||(LA65_0>=73 && LA65_0<=74)||LA65_0==77||LA65_0==80||(LA65_0>=84 && LA65_0<=85)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalVaryGrammar.g:3405:1: (lv_sentencias_8_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:3405:1: (lv_sentencias_8_0= ruleSentencias )
            	    // InternalVaryGrammar.g:3406:3: lv_sentencias_8_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_sentencias_8_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_8_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // InternalVaryGrammar.g:3422:3: ( (lv_devuelve_9_0= ruleDevolver ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==108) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalVaryGrammar.g:3423:1: (lv_devuelve_9_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:3423:1: (lv_devuelve_9_0= ruleDevolver )
                    // InternalVaryGrammar.g:3424:3: lv_devuelve_9_0= ruleDevolver
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
    // $ANTLR end "rulesegun"


    // $ANTLR start "entryRuleTipoVariable"
    // InternalVaryGrammar.g:3452:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // InternalVaryGrammar.g:3453:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // InternalVaryGrammar.g:3454:2: iv_ruleTipoVariable= ruleTipoVariable EOF
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
    // InternalVaryGrammar.g:3461:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3464:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // InternalVaryGrammar.g:3465:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // InternalVaryGrammar.g:3465:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt67=1;
                }
                break;
            case 89:
                {
                alt67=2;
                }
                break;
            case 90:
                {
                alt67=3;
                }
                break;
            case 91:
                {
                alt67=4;
                }
                break;
            case 92:
                {
                alt67=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalVaryGrammar.g:3466:2: kw= 'entero'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3473:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:3480:2: kw= 'real'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:3487:2: kw= 'logico'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:3494:2: kw= 'cadena'
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
    // InternalVaryGrammar.g:3507:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVaryGrammar.g:3508:2: (iv_ruleVariable= ruleVariable EOF )
            // InternalVaryGrammar.g:3509:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVaryGrammar.g:3516:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3519:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // InternalVaryGrammar.g:3520:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // InternalVaryGrammar.g:3520:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // InternalVaryGrammar.g:3520:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // InternalVaryGrammar.g:3520:2: ()
            // InternalVaryGrammar.g:3521:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:3526:2: ( (lv_nombre_1_0= ruleEString ) )
            // InternalVaryGrammar.g:3527:1: (lv_nombre_1_0= ruleEString )
            {
            // InternalVaryGrammar.g:3527:1: (lv_nombre_1_0= ruleEString )
            // InternalVaryGrammar.g:3528:3: lv_nombre_1_0= ruleEString
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
    // InternalVaryGrammar.g:3552:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // InternalVaryGrammar.g:3553:2: (iv_rulesignoOr= rulesignoOr EOF )
            // InternalVaryGrammar.g:3554:2: iv_rulesignoOr= rulesignoOr EOF
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
    // InternalVaryGrammar.g:3561:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'o' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3564:28: (kw= 'o' )
            // InternalVaryGrammar.g:3566:2: kw= 'o'
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
    // InternalVaryGrammar.g:3579:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // InternalVaryGrammar.g:3580:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // InternalVaryGrammar.g:3581:2: iv_rulesignoAnd= rulesignoAnd EOF
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
    // InternalVaryGrammar.g:3588:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'y' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3591:28: (kw= 'y' )
            // InternalVaryGrammar.g:3593:2: kw= 'y'
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
    // InternalVaryGrammar.g:3606:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // InternalVaryGrammar.g:3607:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // InternalVaryGrammar.g:3608:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
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
    // InternalVaryGrammar.g:3615:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3618:28: ( (kw= '=' | kw= '!=' ) )
            // InternalVaryGrammar.g:3619:1: (kw= '=' | kw= '!=' )
            {
            // InternalVaryGrammar.g:3619:1: (kw= '=' | kw= '!=' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==48) ) {
                alt68=1;
            }
            else if ( (LA68_0==95) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalVaryGrammar.g:3620:2: kw= '='
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3627:2: kw= '!='
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
    // InternalVaryGrammar.g:3640:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // InternalVaryGrammar.g:3641:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // InternalVaryGrammar.g:3642:2: iv_rulesignoComparacion= rulesignoComparacion EOF
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
    // InternalVaryGrammar.g:3649:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3652:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // InternalVaryGrammar.g:3653:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // InternalVaryGrammar.g:3653:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt69=1;
                }
                break;
            case 97:
                {
                alt69=2;
                }
                break;
            case 98:
                {
                alt69=3;
                }
                break;
            case 99:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalVaryGrammar.g:3654:2: kw= '<'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:3661:2: kw= '>'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:3668:2: kw= '>='
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:3675:2: kw= '<='
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
    // InternalVaryGrammar.g:3688:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // InternalVaryGrammar.g:3689:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // InternalVaryGrammar.g:3690:2: iv_rulesignoSuma= rulesignoSuma EOF
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
    // InternalVaryGrammar.g:3697:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3700:28: (kw= '+' )
            // InternalVaryGrammar.g:3702:2: kw= '+'
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
    // InternalVaryGrammar.g:3715:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // InternalVaryGrammar.g:3716:2: (iv_rulesignoResta= rulesignoResta EOF )
            // InternalVaryGrammar.g:3717:2: iv_rulesignoResta= rulesignoResta EOF
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
    // InternalVaryGrammar.g:3724:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3727:28: (kw= '-' )
            // InternalVaryGrammar.g:3729:2: kw= '-'
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
    // InternalVaryGrammar.g:3742:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // InternalVaryGrammar.g:3743:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // InternalVaryGrammar.g:3744:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
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
    // InternalVaryGrammar.g:3751:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3754:28: (kw= '*' )
            // InternalVaryGrammar.g:3756:2: kw= '*'
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
    // InternalVaryGrammar.g:3769:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // InternalVaryGrammar.g:3770:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // InternalVaryGrammar.g:3771:2: iv_rulesignoDivision= rulesignoDivision EOF
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
    // InternalVaryGrammar.g:3778:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3781:28: (kw= '/' )
            // InternalVaryGrammar.g:3783:2: kw= '/'
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
    // InternalVaryGrammar.g:3796:1: entryRulesignoModulo returns [String current=null] : iv_rulesignoModulo= rulesignoModulo EOF ;
    public final String entryRulesignoModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoModulo = null;


        try {
            // InternalVaryGrammar.g:3797:2: (iv_rulesignoModulo= rulesignoModulo EOF )
            // InternalVaryGrammar.g:3798:2: iv_rulesignoModulo= rulesignoModulo EOF
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
    // InternalVaryGrammar.g:3805:1: rulesignoModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken rulesignoModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3808:28: (kw= 'mod' )
            // InternalVaryGrammar.g:3810:2: kw= 'mod'
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
    // InternalVaryGrammar.g:3823:1: entryRulesignoDiv returns [String current=null] : iv_rulesignoDiv= rulesignoDiv EOF ;
    public final String entryRulesignoDiv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDiv = null;


        try {
            // InternalVaryGrammar.g:3824:2: (iv_rulesignoDiv= rulesignoDiv EOF )
            // InternalVaryGrammar.g:3825:2: iv_rulesignoDiv= rulesignoDiv EOF
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
    // InternalVaryGrammar.g:3832:1: rulesignoDiv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken rulesignoDiv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3835:28: (kw= 'div' )
            // InternalVaryGrammar.g:3837:2: kw= 'div'
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


    // $ANTLR start "entryRuleoperacion"
    // InternalVaryGrammar.g:3852:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // InternalVaryGrammar.g:3853:2: (iv_ruleoperacion= ruleoperacion EOF )
            // InternalVaryGrammar.g:3854:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
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
    // $ANTLR end "entryRuleoperacion"


    // $ANTLR start "ruleoperacion"
    // InternalVaryGrammar.g:3861:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3864:28: (this_Or_0= ruleOr )
            // InternalVaryGrammar.g:3866:5: this_Or_0= ruleOr
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
    // $ANTLR end "ruleoperacion"


    // $ANTLR start "entryRuleOr"
    // InternalVaryGrammar.g:3882:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalVaryGrammar.g:3883:2: (iv_ruleOr= ruleOr EOF )
            // InternalVaryGrammar.g:3884:2: iv_ruleOr= ruleOr EOF
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
    // InternalVaryGrammar.g:3891:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3894:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) )
            // InternalVaryGrammar.g:3895:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            {
            // InternalVaryGrammar.g:3895:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            // InternalVaryGrammar.g:3896:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_67);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:3904:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==93) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalVaryGrammar.g:3904:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) )
            	    {
            	    // InternalVaryGrammar.g:3904:2: ()
            	    // InternalVaryGrammar.g:3905:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:3910:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // InternalVaryGrammar.g:3911:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // InternalVaryGrammar.g:3911:1: (lv_signo_op_2_0= rulesignoOr )
            	    // InternalVaryGrammar.g:3912:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:3928:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==101) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:3929:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:3929:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:3930:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOrAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:3943:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==106) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:3944:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:3944:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:3945:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getOrAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:3958:3: ( (lv_right_5_0= ruleAnd ) )
            	    // InternalVaryGrammar.g:3959:1: (lv_right_5_0= ruleAnd )
            	    {
            	    // InternalVaryGrammar.g:3959:1: (lv_right_5_0= ruleAnd )
            	    // InternalVaryGrammar.g:3960:3: lv_right_5_0= ruleAnd
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
            	    break loop72;
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
    // InternalVaryGrammar.g:3984:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalVaryGrammar.g:3985:2: (iv_ruleAnd= ruleAnd EOF )
            // InternalVaryGrammar.g:3986:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalVaryGrammar.g:3993:1: ruleAnd returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Mod_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:3996:28: ( (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) )
            // InternalVaryGrammar.g:3997:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            {
            // InternalVaryGrammar.g:3997:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            // InternalVaryGrammar.g:3998:5: this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getModParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_68);
            this_Mod_0=ruleMod();

            state._fsp--;

             
                    current = this_Mod_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4006:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==94) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalVaryGrammar.g:4006:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) )
            	    {
            	    // InternalVaryGrammar.g:4006:2: ()
            	    // InternalVaryGrammar.g:4007:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4012:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // InternalVaryGrammar.g:4013:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // InternalVaryGrammar.g:4013:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // InternalVaryGrammar.g:4014:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4030:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==101) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4031:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4031:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4032:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getAndAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop73;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4045:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==106) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4046:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4046:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4047:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getAndAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4060:3: ( (lv_right_5_0= ruleMod ) )
            	    // InternalVaryGrammar.g:4061:1: (lv_right_5_0= ruleMod )
            	    {
            	    // InternalVaryGrammar.g:4061:1: (lv_right_5_0= ruleMod )
            	    // InternalVaryGrammar.g:4062:3: lv_right_5_0= ruleMod
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
            	    break loop75;
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
    // InternalVaryGrammar.g:4086:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalVaryGrammar.g:4087:2: (iv_ruleMod= ruleMod EOF )
            // InternalVaryGrammar.g:4088:2: iv_ruleMod= ruleMod EOF
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
    // InternalVaryGrammar.g:4095:1: ruleMod returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4098:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) )
            // InternalVaryGrammar.g:4099:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            {
            // InternalVaryGrammar.g:4099:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            // InternalVaryGrammar.g:4100:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_69);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4108:1: ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==104) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalVaryGrammar.g:4108:2: () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) )
            	    {
            	    // InternalVaryGrammar.g:4108:2: ()
            	    // InternalVaryGrammar.g:4109:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getModAccess().getModLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4114:2: ( (lv_signo_op_2_0= rulesignoModulo ) )
            	    // InternalVaryGrammar.g:4115:1: (lv_signo_op_2_0= rulesignoModulo )
            	    {
            	    // InternalVaryGrammar.g:4115:1: (lv_signo_op_2_0= rulesignoModulo )
            	    // InternalVaryGrammar.g:4116:3: lv_signo_op_2_0= rulesignoModulo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getSigno_opSignoModuloParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4132:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==101) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4133:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4133:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4134:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getModAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4147:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==106) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4148:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4148:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4149:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getModAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4162:3: ( (lv_right_5_0= ruleIgualdad ) )
            	    // InternalVaryGrammar.g:4163:1: (lv_right_5_0= ruleIgualdad )
            	    {
            	    // InternalVaryGrammar.g:4163:1: (lv_right_5_0= ruleIgualdad )
            	    // InternalVaryGrammar.g:4164:3: lv_right_5_0= ruleIgualdad
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
            	    break loop78;
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
    // InternalVaryGrammar.g:4188:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // InternalVaryGrammar.g:4189:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // InternalVaryGrammar.g:4190:2: iv_ruleIgualdad= ruleIgualdad EOF
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
    // InternalVaryGrammar.g:4197:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4200:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) )
            // InternalVaryGrammar.g:4201:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            {
            // InternalVaryGrammar.g:4201:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            // InternalVaryGrammar.g:4202:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_70);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4210:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==48||LA81_0==95) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalVaryGrammar.g:4210:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) )
            	    {
            	    // InternalVaryGrammar.g:4210:2: ()
            	    // InternalVaryGrammar.g:4211:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4216:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // InternalVaryGrammar.g:4217:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // InternalVaryGrammar.g:4217:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // InternalVaryGrammar.g:4218:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4234:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==101) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4235:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4235:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4236:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop79;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4249:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==106) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4250:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4250:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4251:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4264:3: ( (lv_right_5_0= ruleComparacion ) )
            	    // InternalVaryGrammar.g:4265:1: (lv_right_5_0= ruleComparacion )
            	    {
            	    // InternalVaryGrammar.g:4265:1: (lv_right_5_0= ruleComparacion )
            	    // InternalVaryGrammar.g:4266:3: lv_right_5_0= ruleComparacion
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
            	    break loop81;
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
    // InternalVaryGrammar.g:4290:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // InternalVaryGrammar.g:4291:2: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalVaryGrammar.g:4292:2: iv_ruleComparacion= ruleComparacion EOF
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
    // InternalVaryGrammar.g:4299:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4302:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) )
            // InternalVaryGrammar.g:4303:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            {
            // InternalVaryGrammar.g:4303:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            // InternalVaryGrammar.g:4304:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_71);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4312:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( ((LA84_0>=96 && LA84_0<=99)) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalVaryGrammar.g:4312:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) )
            	    {
            	    // InternalVaryGrammar.g:4312:2: ()
            	    // InternalVaryGrammar.g:4313:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4318:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // InternalVaryGrammar.g:4319:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // InternalVaryGrammar.g:4319:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // InternalVaryGrammar.g:4320:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4336:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==101) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4337:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4337:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // InternalVaryGrammar.g:4338:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getComparacionAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop82;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4351:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop83:
            	    do {
            	        int alt83=2;
            	        int LA83_0 = input.LA(1);

            	        if ( (LA83_0==106) ) {
            	            alt83=1;
            	        }


            	        switch (alt83) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4352:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4352:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // InternalVaryGrammar.g:4353:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getComparacionAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop83;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4366:3: ( (lv_right_5_0= ruleSumaResta ) )
            	    // InternalVaryGrammar.g:4367:1: (lv_right_5_0= ruleSumaResta )
            	    {
            	    // InternalVaryGrammar.g:4367:1: (lv_right_5_0= ruleSumaResta )
            	    // InternalVaryGrammar.g:4368:3: lv_right_5_0= ruleSumaResta
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
            	    break loop84;
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
    // InternalVaryGrammar.g:4392:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // InternalVaryGrammar.g:4393:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // InternalVaryGrammar.g:4394:2: iv_ruleSumaResta= ruleSumaResta EOF
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
    // InternalVaryGrammar.g:4401:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) ;
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
            // InternalVaryGrammar.g:4404:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) )
            // InternalVaryGrammar.g:4405:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            {
            // InternalVaryGrammar.g:4405:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            // InternalVaryGrammar.g:4406:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_72);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4414:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=100 && LA88_0<=101)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalVaryGrammar.g:4414:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    {
            	    // InternalVaryGrammar.g:4414:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==100) ) {
            	        alt85=1;
            	    }
            	    else if ( (LA85_0==101) ) {
            	        alt85=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 85, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // InternalVaryGrammar.g:4414:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // InternalVaryGrammar.g:4414:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // InternalVaryGrammar.g:4414:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // InternalVaryGrammar.g:4414:4: ()
            	            // InternalVaryGrammar.g:4415:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4420:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // InternalVaryGrammar.g:4421:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // InternalVaryGrammar.g:4421:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // InternalVaryGrammar.g:4422:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_52);
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
            	            // InternalVaryGrammar.g:4439:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // InternalVaryGrammar.g:4439:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // InternalVaryGrammar.g:4439:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // InternalVaryGrammar.g:4439:7: ()
            	            // InternalVaryGrammar.g:4440:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4445:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // InternalVaryGrammar.g:4446:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // InternalVaryGrammar.g:4446:1: (lv_signo_op_4_0= rulesignoResta )
            	            // InternalVaryGrammar.g:4447:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4463:4: ( (lv_negacionesFinales_5_0= '-' ) )*
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);

            	        if ( (LA86_0==101) ) {
            	            alt86=1;
            	        }


            	        switch (alt86) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4464:1: (lv_negacionesFinales_5_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4464:1: (lv_negacionesFinales_5_0= '-' )
            	    	    // InternalVaryGrammar.g:4465:3: lv_negacionesFinales_5_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_5_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_5_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_5_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop86;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4478:3: ( (lv_negacionesFinales_6_0= 'no' ) )*
            	    loop87:
            	    do {
            	        int alt87=2;
            	        int LA87_0 = input.LA(1);

            	        if ( (LA87_0==106) ) {
            	            alt87=1;
            	        }


            	        switch (alt87) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4479:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4479:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    // InternalVaryGrammar.g:4480:3: lv_negacionesFinales_6_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_6_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_6_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesNoKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_6_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop87;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4493:3: ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    // InternalVaryGrammar.g:4494:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    {
            	    // InternalVaryGrammar.g:4494:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    // InternalVaryGrammar.g:4495:3: lv_right_7_0= ruleMultiplicacionDivision
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
            	    break loop88;
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
    // InternalVaryGrammar.g:4519:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // InternalVaryGrammar.g:4520:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // InternalVaryGrammar.g:4521:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
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
    // InternalVaryGrammar.g:4528:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) ;
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
            // InternalVaryGrammar.g:4531:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) )
            // InternalVaryGrammar.g:4532:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            {
            // InternalVaryGrammar.g:4532:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            // InternalVaryGrammar.g:4533:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_73);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4541:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=102 && LA92_0<=103)||LA92_0==105) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalVaryGrammar.g:4541:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) )
            	    {
            	    // InternalVaryGrammar.g:4541:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt89=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt89=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt89=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt89=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 89, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt89) {
            	        case 1 :
            	            // InternalVaryGrammar.g:4541:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // InternalVaryGrammar.g:4541:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // InternalVaryGrammar.g:4541:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // InternalVaryGrammar.g:4541:4: ()
            	            // InternalVaryGrammar.g:4542:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4547:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // InternalVaryGrammar.g:4548:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // InternalVaryGrammar.g:4548:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // InternalVaryGrammar.g:4549:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_52);
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
            	            // InternalVaryGrammar.g:4566:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // InternalVaryGrammar.g:4566:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // InternalVaryGrammar.g:4566:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // InternalVaryGrammar.g:4566:7: ()
            	            // InternalVaryGrammar.g:4567:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4572:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // InternalVaryGrammar.g:4573:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // InternalVaryGrammar.g:4573:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // InternalVaryGrammar.g:4574:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_52);
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
            	            // InternalVaryGrammar.g:4591:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // InternalVaryGrammar.g:4591:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // InternalVaryGrammar.g:4591:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // InternalVaryGrammar.g:4591:7: ()
            	            // InternalVaryGrammar.g:4592:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:4597:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // InternalVaryGrammar.g:4598:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // InternalVaryGrammar.g:4598:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // InternalVaryGrammar.g:4599:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_52);
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

            	    // InternalVaryGrammar.g:4615:4: ( (lv_negacionesFinales_7_0= '-' ) )*
            	    loop90:
            	    do {
            	        int alt90=2;
            	        int LA90_0 = input.LA(1);

            	        if ( (LA90_0==101) ) {
            	            alt90=1;
            	        }


            	        switch (alt90) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4616:1: (lv_negacionesFinales_7_0= '-' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4616:1: (lv_negacionesFinales_7_0= '-' )
            	    	    // InternalVaryGrammar.g:4617:3: lv_negacionesFinales_7_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_7_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	    	            newLeafNode(lv_negacionesFinales_7_0, grammarAccess.getMultiplicacionDivisionAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getMultiplicacionDivisionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_7_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop90;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4630:3: ( (lv_negacionesFinales_8_0= 'no' ) )*
            	    loop91:
            	    do {
            	        int alt91=2;
            	        int LA91_0 = input.LA(1);

            	        if ( (LA91_0==106) ) {
            	            alt91=1;
            	        }


            	        switch (alt91) {
            	    	case 1 :
            	    	    // InternalVaryGrammar.g:4631:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    {
            	    	    // InternalVaryGrammar.g:4631:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    // InternalVaryGrammar.g:4632:3: lv_negacionesFinales_8_0= 'no'
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
            	    	    break loop91;
            	        }
            	    } while (true);

            	    // InternalVaryGrammar.g:4645:3: ( (lv_right_9_0= rulePrimaria ) )
            	    // InternalVaryGrammar.g:4646:1: (lv_right_9_0= rulePrimaria )
            	    {
            	    // InternalVaryGrammar.g:4646:1: (lv_right_9_0= rulePrimaria )
            	    // InternalVaryGrammar.g:4647:3: lv_right_9_0= rulePrimaria
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
            	    break loop92;
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


    // $ANTLR start "entryRuleoperacionIndice"
    // InternalVaryGrammar.g:4671:1: entryRuleoperacionIndice returns [EObject current=null] : iv_ruleoperacionIndice= ruleoperacionIndice EOF ;
    public final EObject entryRuleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacionIndice = null;


        try {
            // InternalVaryGrammar.g:4672:2: (iv_ruleoperacionIndice= ruleoperacionIndice EOF )
            // InternalVaryGrammar.g:4673:2: iv_ruleoperacionIndice= ruleoperacionIndice EOF
            {
             newCompositeNode(grammarAccess.getOperacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleoperacionIndice=ruleoperacionIndice();

            state._fsp--;

             current =iv_ruleoperacionIndice; 
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
    // $ANTLR end "entryRuleoperacionIndice"


    // $ANTLR start "ruleoperacionIndice"
    // InternalVaryGrammar.g:4680:1: ruleoperacionIndice returns [EObject current=null] : this_OrIndice_0= ruleOrIndice ;
    public final EObject ruleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_OrIndice_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4683:28: (this_OrIndice_0= ruleOrIndice )
            // InternalVaryGrammar.g:4685:5: this_OrIndice_0= ruleOrIndice
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
    // $ANTLR end "ruleoperacionIndice"


    // $ANTLR start "entryRuleOrIndice"
    // InternalVaryGrammar.g:4701:1: entryRuleOrIndice returns [EObject current=null] : iv_ruleOrIndice= ruleOrIndice EOF ;
    public final EObject entryRuleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrIndice = null;


        try {
            // InternalVaryGrammar.g:4702:2: (iv_ruleOrIndice= ruleOrIndice EOF )
            // InternalVaryGrammar.g:4703:2: iv_ruleOrIndice= ruleOrIndice EOF
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
    // InternalVaryGrammar.g:4710:1: ruleOrIndice returns [EObject current=null] : (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) ;
    public final EObject ruleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject this_AndIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4713:28: ( (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) )
            // InternalVaryGrammar.g:4714:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            {
            // InternalVaryGrammar.g:4714:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            // InternalVaryGrammar.g:4715:5: this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrIndiceAccess().getAndIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_67);
            this_AndIndice_0=ruleAndIndice();

            state._fsp--;

             
                    current = this_AndIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4723:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==93) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalVaryGrammar.g:4723:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) )
            	    {
            	    // InternalVaryGrammar.g:4723:2: ()
            	    // InternalVaryGrammar.g:4724:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrIndiceAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4729:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // InternalVaryGrammar.g:4730:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // InternalVaryGrammar.g:4730:1: (lv_signo_op_2_0= rulesignoOr )
            	    // InternalVaryGrammar.g:4731:3: lv_signo_op_2_0= rulesignoOr
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

            	    // InternalVaryGrammar.g:4747:2: ( (lv_right_3_0= ruleAndIndice ) )
            	    // InternalVaryGrammar.g:4748:1: (lv_right_3_0= ruleAndIndice )
            	    {
            	    // InternalVaryGrammar.g:4748:1: (lv_right_3_0= ruleAndIndice )
            	    // InternalVaryGrammar.g:4749:3: lv_right_3_0= ruleAndIndice
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
    // $ANTLR end "ruleOrIndice"


    // $ANTLR start "entryRuleAndIndice"
    // InternalVaryGrammar.g:4773:1: entryRuleAndIndice returns [EObject current=null] : iv_ruleAndIndice= ruleAndIndice EOF ;
    public final EObject entryRuleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndIndice = null;


        try {
            // InternalVaryGrammar.g:4774:2: (iv_ruleAndIndice= ruleAndIndice EOF )
            // InternalVaryGrammar.g:4775:2: iv_ruleAndIndice= ruleAndIndice EOF
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
    // InternalVaryGrammar.g:4782:1: ruleAndIndice returns [EObject current=null] : (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) ;
    public final EObject ruleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject this_IgualdadIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4785:28: ( (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) )
            // InternalVaryGrammar.g:4786:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            {
            // InternalVaryGrammar.g:4786:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            // InternalVaryGrammar.g:4787:5: this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndIndiceAccess().getIgualdadIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_68);
            this_IgualdadIndice_0=ruleIgualdadIndice();

            state._fsp--;

             
                    current = this_IgualdadIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4795:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==94) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalVaryGrammar.g:4795:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    {
            	    // InternalVaryGrammar.g:4795:2: ()
            	    // InternalVaryGrammar.g:4796:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndIndiceAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4801:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // InternalVaryGrammar.g:4802:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // InternalVaryGrammar.g:4802:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // InternalVaryGrammar.g:4803:3: lv_signo_op_2_0= rulesignoAnd
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

            	    // InternalVaryGrammar.g:4819:2: ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    // InternalVaryGrammar.g:4820:1: (lv_right_3_0= ruleIgualdadIndice )
            	    {
            	    // InternalVaryGrammar.g:4820:1: (lv_right_3_0= ruleIgualdadIndice )
            	    // InternalVaryGrammar.g:4821:3: lv_right_3_0= ruleIgualdadIndice
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
            	    break loop94;
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
    // InternalVaryGrammar.g:4845:1: entryRuleIgualdadIndice returns [EObject current=null] : iv_ruleIgualdadIndice= ruleIgualdadIndice EOF ;
    public final EObject entryRuleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdadIndice = null;


        try {
            // InternalVaryGrammar.g:4846:2: (iv_ruleIgualdadIndice= ruleIgualdadIndice EOF )
            // InternalVaryGrammar.g:4847:2: iv_ruleIgualdadIndice= ruleIgualdadIndice EOF
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
    // InternalVaryGrammar.g:4854:1: ruleIgualdadIndice returns [EObject current=null] : (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) ;
    public final EObject ruleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject this_ComparacionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4857:28: ( (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) )
            // InternalVaryGrammar.g:4858:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            {
            // InternalVaryGrammar.g:4858:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            // InternalVaryGrammar.g:4859:5: this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getComparacionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_70);
            this_ComparacionIndice_0=ruleComparacionIndice();

            state._fsp--;

             
                    current = this_ComparacionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4867:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==48||LA95_0==95) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalVaryGrammar.g:4867:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) )
            	    {
            	    // InternalVaryGrammar.g:4867:2: ()
            	    // InternalVaryGrammar.g:4868:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadIndiceAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4873:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // InternalVaryGrammar.g:4874:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // InternalVaryGrammar.g:4874:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // InternalVaryGrammar.g:4875:3: lv_signo_op_2_0= rulesignoIgualdad
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

            	    // InternalVaryGrammar.g:4891:2: ( (lv_right_3_0= ruleComparacionIndice ) )
            	    // InternalVaryGrammar.g:4892:1: (lv_right_3_0= ruleComparacionIndice )
            	    {
            	    // InternalVaryGrammar.g:4892:1: (lv_right_3_0= ruleComparacionIndice )
            	    // InternalVaryGrammar.g:4893:3: lv_right_3_0= ruleComparacionIndice
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
            	    break loop95;
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
    // InternalVaryGrammar.g:4917:1: entryRuleComparacionIndice returns [EObject current=null] : iv_ruleComparacionIndice= ruleComparacionIndice EOF ;
    public final EObject entryRuleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacionIndice = null;


        try {
            // InternalVaryGrammar.g:4918:2: (iv_ruleComparacionIndice= ruleComparacionIndice EOF )
            // InternalVaryGrammar.g:4919:2: iv_ruleComparacionIndice= ruleComparacionIndice EOF
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
    // InternalVaryGrammar.g:4926:1: ruleComparacionIndice returns [EObject current=null] : (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) ;
    public final EObject ruleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_SumaRestaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:4929:28: ( (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) )
            // InternalVaryGrammar.g:4930:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            {
            // InternalVaryGrammar.g:4930:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            // InternalVaryGrammar.g:4931:5: this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSumaRestaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_71);
            this_SumaRestaIndice_0=ruleSumaRestaIndice();

            state._fsp--;

             
                    current = this_SumaRestaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:4939:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=96 && LA96_0<=99)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalVaryGrammar.g:4939:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    {
            	    // InternalVaryGrammar.g:4939:2: ()
            	    // InternalVaryGrammar.g:4940:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionIndiceAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // InternalVaryGrammar.g:4945:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // InternalVaryGrammar.g:4946:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // InternalVaryGrammar.g:4946:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // InternalVaryGrammar.g:4947:3: lv_signo_op_2_0= rulesignoComparacion
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

            	    // InternalVaryGrammar.g:4963:2: ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    // InternalVaryGrammar.g:4964:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    {
            	    // InternalVaryGrammar.g:4964:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    // InternalVaryGrammar.g:4965:3: lv_right_3_0= ruleSumaRestaIndice
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
            	    break loop96;
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
    // InternalVaryGrammar.g:4989:1: entryRuleSumaRestaIndice returns [EObject current=null] : iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF ;
    public final EObject entryRuleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaRestaIndice = null;


        try {
            // InternalVaryGrammar.g:4990:2: (iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF )
            // InternalVaryGrammar.g:4991:2: iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF
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
    // InternalVaryGrammar.g:4998:1: ruleSumaRestaIndice returns [EObject current=null] : (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) ;
    public final EObject ruleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivisionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5001:28: ( (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) )
            // InternalVaryGrammar.g:5002:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5002:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            // InternalVaryGrammar.g:5003:5: this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getMultiplicacionDivisionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_72);
            this_MultiplicacionDivisionIndice_0=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             
                    current = this_MultiplicacionDivisionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5011:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=100 && LA98_0<=101)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalVaryGrammar.g:5011:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5011:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==100) ) {
            	        alt97=1;
            	    }
            	    else if ( (LA97_0==101) ) {
            	        alt97=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 97, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalVaryGrammar.g:5011:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // InternalVaryGrammar.g:5011:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // InternalVaryGrammar.g:5011:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // InternalVaryGrammar.g:5011:4: ()
            	            // InternalVaryGrammar.g:5012:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5017:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // InternalVaryGrammar.g:5018:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // InternalVaryGrammar.g:5018:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // InternalVaryGrammar.g:5019:3: lv_signo_op_2_0= rulesignoSuma
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
            	            // InternalVaryGrammar.g:5036:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // InternalVaryGrammar.g:5036:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // InternalVaryGrammar.g:5036:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // InternalVaryGrammar.g:5036:7: ()
            	            // InternalVaryGrammar.g:5037:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5042:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // InternalVaryGrammar.g:5043:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // InternalVaryGrammar.g:5043:1: (lv_signo_op_4_0= rulesignoResta )
            	            // InternalVaryGrammar.g:5044:3: lv_signo_op_4_0= rulesignoResta
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

            	    // InternalVaryGrammar.g:5060:4: ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    // InternalVaryGrammar.g:5061:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    {
            	    // InternalVaryGrammar.g:5061:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    // InternalVaryGrammar.g:5062:3: lv_right_5_0= ruleMultiplicacionDivisionIndice
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
    // $ANTLR end "ruleSumaRestaIndice"


    // $ANTLR start "entryRuleMultiplicacionDivisionIndice"
    // InternalVaryGrammar.g:5086:1: entryRuleMultiplicacionDivisionIndice returns [EObject current=null] : iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF ;
    public final EObject entryRuleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivisionIndice = null;


        try {
            // InternalVaryGrammar.g:5087:2: (iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF )
            // InternalVaryGrammar.g:5088:2: iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF
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
    // InternalVaryGrammar.g:5095:1: ruleMultiplicacionDivisionIndice returns [EObject current=null] : (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) ;
    public final EObject ruleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_PrimariaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5098:28: ( (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) )
            // InternalVaryGrammar.g:5099:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            {
            // InternalVaryGrammar.g:5099:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            // InternalVaryGrammar.g:5100:5: this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getPrimariaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_73);
            this_PrimariaIndice_0=rulePrimariaIndice();

            state._fsp--;

             
                    current = this_PrimariaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // InternalVaryGrammar.g:5108:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=102 && LA100_0<=103)||LA100_0==105) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalVaryGrammar.g:5108:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) )
            	    {
            	    // InternalVaryGrammar.g:5108:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt99=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt99=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt99=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt99=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 99, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt99) {
            	        case 1 :
            	            // InternalVaryGrammar.g:5108:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // InternalVaryGrammar.g:5108:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // InternalVaryGrammar.g:5108:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // InternalVaryGrammar.g:5108:4: ()
            	            // InternalVaryGrammar.g:5109:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5114:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // InternalVaryGrammar.g:5115:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // InternalVaryGrammar.g:5115:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // InternalVaryGrammar.g:5116:3: lv_signo_op_2_0= rulesignoMultiplicacion
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
            	            // InternalVaryGrammar.g:5133:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // InternalVaryGrammar.g:5133:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // InternalVaryGrammar.g:5133:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // InternalVaryGrammar.g:5133:7: ()
            	            // InternalVaryGrammar.g:5134:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5139:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // InternalVaryGrammar.g:5140:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // InternalVaryGrammar.g:5140:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // InternalVaryGrammar.g:5141:3: lv_signo_op_4_0= rulesignoDivision
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
            	            // InternalVaryGrammar.g:5158:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // InternalVaryGrammar.g:5158:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // InternalVaryGrammar.g:5158:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // InternalVaryGrammar.g:5158:7: ()
            	            // InternalVaryGrammar.g:5159:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // InternalVaryGrammar.g:5164:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // InternalVaryGrammar.g:5165:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // InternalVaryGrammar.g:5165:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // InternalVaryGrammar.g:5166:3: lv_signo_op_6_0= rulesignoDiv
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

            	    // InternalVaryGrammar.g:5182:4: ( (lv_right_7_0= rulePrimariaIndice ) )
            	    // InternalVaryGrammar.g:5183:1: (lv_right_7_0= rulePrimariaIndice )
            	    {
            	    // InternalVaryGrammar.g:5183:1: (lv_right_7_0= rulePrimariaIndice )
            	    // InternalVaryGrammar.g:5184:3: lv_right_7_0= rulePrimariaIndice
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
    // $ANTLR end "ruleMultiplicacionDivisionIndice"


    // $ANTLR start "entryRulePrimariaIndice"
    // InternalVaryGrammar.g:5208:1: entryRulePrimariaIndice returns [EObject current=null] : iv_rulePrimariaIndice= rulePrimariaIndice EOF ;
    public final EObject entryRulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimariaIndice = null;


        try {
            // InternalVaryGrammar.g:5209:2: (iv_rulePrimariaIndice= rulePrimariaIndice EOF )
            // InternalVaryGrammar.g:5210:2: iv_rulePrimariaIndice= rulePrimariaIndice EOF
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
    // InternalVaryGrammar.g:5217:1: rulePrimariaIndice returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) ;
    public final EObject rulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5220:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:5221:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:5221:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_INT) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_ID||LA101_0==RULE_STRING) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalVaryGrammar.g:5221:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // InternalVaryGrammar.g:5221:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // InternalVaryGrammar.g:5221:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // InternalVaryGrammar.g:5221:3: ()
                    // InternalVaryGrammar.g:5222:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5227:2: ( (lv_valor_1_0= ruleEInt ) )
                    // InternalVaryGrammar.g:5228:1: (lv_valor_1_0= ruleEInt )
                    {
                    // InternalVaryGrammar.g:5228:1: (lv_valor_1_0= ruleEInt )
                    // InternalVaryGrammar.g:5229:3: lv_valor_1_0= ruleEInt
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
                    // InternalVaryGrammar.g:5246:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:5246:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:5246:7: () ( (lv_nombre_3_0= ruleEString ) )
                    {
                    // InternalVaryGrammar.g:5246:7: ()
                    // InternalVaryGrammar.g:5247:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getVariableIDAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5252:2: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalVaryGrammar.g:5253:1: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5253:1: (lv_nombre_3_0= ruleEString )
                    // InternalVaryGrammar.g:5254:3: lv_nombre_3_0= ruleEString
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
    // InternalVaryGrammar.g:5278:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // InternalVaryGrammar.g:5279:2: (iv_rulePrimaria= rulePrimaria EOF )
            // InternalVaryGrammar.g:5280:2: iv_rulePrimaria= rulePrimaria EOF
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
    // InternalVaryGrammar.g:5287:1: rulePrimaria returns [EObject current=null] : (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject this_VariablesBasicas_0 = null;

        EObject this_VariablesComplejas_1 = null;

        EObject this_Funciones_2 = null;

        EObject this_OperacionParentesis_3 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5290:28: ( (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) )
            // InternalVaryGrammar.g:5291:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            {
            // InternalVaryGrammar.g:5291:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            int alt102=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 113:
            case 114:
                {
                alt102=1;
                }
                break;
            case RULE_STRING:
                {
                int LA102_2 = input.LA(2);

                if ( (LA102_2==45||LA102_2==50) ) {
                    alt102=2;
                }
                else if ( (LA102_2==EOF||(LA102_2>=RULE_ID && LA102_2<=RULE_NOMBRE_FUN)||LA102_2==RULE_STRING||(LA102_2>=18 && LA102_2<=19)||(LA102_2>=26 && LA102_2<=29)||(LA102_2>=31 && LA102_2<=32)||(LA102_2>=35 && LA102_2<=44)||LA102_2==48||LA102_2==51||LA102_2==53||LA102_2==55||LA102_2==60||LA102_2==62||LA102_2==64||(LA102_2>=66 && LA102_2<=68)||LA102_2==70||(LA102_2>=72 && LA102_2<=105)||(LA102_2>=107 && LA102_2<=110)) ) {
                    alt102=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA102_3 = input.LA(2);

                if ( (LA102_3==45||LA102_3==50) ) {
                    alt102=2;
                }
                else if ( (LA102_3==EOF||(LA102_3>=RULE_ID && LA102_3<=RULE_NOMBRE_FUN)||LA102_3==RULE_STRING||(LA102_3>=18 && LA102_3<=19)||(LA102_3>=26 && LA102_3<=29)||(LA102_3>=31 && LA102_3<=32)||(LA102_3>=35 && LA102_3<=44)||LA102_3==48||LA102_3==51||LA102_3==53||LA102_3==55||LA102_3==60||LA102_3==62||LA102_3==64||(LA102_3>=66 && LA102_3<=68)||LA102_3==70||(LA102_3>=72 && LA102_3<=105)||(LA102_3>=107 && LA102_3<=110)) ) {
                    alt102=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOMBRE_FUN:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt102=3;
                }
                break;
            case 69:
                {
                alt102=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalVaryGrammar.g:5292:5: this_VariablesBasicas_0= ruleVariablesBasicas
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
                    // InternalVaryGrammar.g:5302:5: this_VariablesComplejas_1= ruleVariablesComplejas
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
                    // InternalVaryGrammar.g:5312:5: this_Funciones_2= ruleFunciones
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
                    // InternalVaryGrammar.g:5322:5: this_OperacionParentesis_3= ruleOperacionParentesis
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
    // InternalVaryGrammar.g:5338:1: entryRuleOperacionCompleta returns [EObject current=null] : iv_ruleOperacionCompleta= ruleOperacionCompleta EOF ;
    public final EObject entryRuleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionCompleta = null;


        try {
            // InternalVaryGrammar.g:5339:2: (iv_ruleOperacionCompleta= ruleOperacionCompleta EOF )
            // InternalVaryGrammar.g:5340:2: iv_ruleOperacionCompleta= ruleOperacionCompleta EOF
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
    // InternalVaryGrammar.g:5347:1: ruleOperacionCompleta returns [EObject current=null] : ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) ) ;
    public final EObject ruleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesIniciales_1_0=null;
        Token lv_negacionesIniciales_2_0=null;
        EObject lv_valor_operacion_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5350:28: ( ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) ) )
            // InternalVaryGrammar.g:5351:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) )
            {
            // InternalVaryGrammar.g:5351:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) )
            // InternalVaryGrammar.g:5351:2: () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) )
            {
            // InternalVaryGrammar.g:5351:2: ()
            // InternalVaryGrammar.g:5352:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionCompletaAccess().getOperacionCompletaAction_0(),
                        current);
                

            }

            // InternalVaryGrammar.g:5357:2: ( (lv_negacionesIniciales_1_0= '-' ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==101) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalVaryGrammar.g:5358:1: (lv_negacionesIniciales_1_0= '-' )
            	    {
            	    // InternalVaryGrammar.g:5358:1: (lv_negacionesIniciales_1_0= '-' )
            	    // InternalVaryGrammar.g:5359:3: lv_negacionesIniciales_1_0= '-'
            	    {
            	    lv_negacionesIniciales_1_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	            newLeafNode(lv_negacionesIniciales_1_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesHyphenMinusKeyword_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_1_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            // InternalVaryGrammar.g:5372:3: ( (lv_negacionesIniciales_2_0= 'no' ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==106) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalVaryGrammar.g:5373:1: (lv_negacionesIniciales_2_0= 'no' )
            	    {
            	    // InternalVaryGrammar.g:5373:1: (lv_negacionesIniciales_2_0= 'no' )
            	    // InternalVaryGrammar.g:5374:3: lv_negacionesIniciales_2_0= 'no'
            	    {
            	    lv_negacionesIniciales_2_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	            newLeafNode(lv_negacionesIniciales_2_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesNoKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_2_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // InternalVaryGrammar.g:5387:3: ( (lv_valor_operacion_3_0= ruleoperacion ) )
            // InternalVaryGrammar.g:5388:1: (lv_valor_operacion_3_0= ruleoperacion )
            {
            // InternalVaryGrammar.g:5388:1: (lv_valor_operacion_3_0= ruleoperacion )
            // InternalVaryGrammar.g:5389:3: lv_valor_operacion_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionCompletaAccess().getValor_operacionOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_valor_operacion_3_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionCompletaRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_3_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.operacion");
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
    // InternalVaryGrammar.g:5413:1: entryRuleOperacionParentesis returns [EObject current=null] : iv_ruleOperacionParentesis= ruleOperacionParentesis EOF ;
    public final EObject entryRuleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionParentesis = null;


        try {
            // InternalVaryGrammar.g:5414:2: (iv_ruleOperacionParentesis= ruleOperacionParentesis EOF )
            // InternalVaryGrammar.g:5415:2: iv_ruleOperacionParentesis= ruleOperacionParentesis EOF
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
    // InternalVaryGrammar.g:5422:1: ruleOperacionParentesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_negacionesFinales_2_0=null;
        Token lv_negacionesFinales_3_0=null;
        Token otherlv_5=null;
        EObject lv_valor_operacion_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5425:28: ( ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) )
            // InternalVaryGrammar.g:5426:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
            {
            // InternalVaryGrammar.g:5426:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
            // InternalVaryGrammar.g:5426:2: () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')'
            {
            // InternalVaryGrammar.g:5426:2: ()
            // InternalVaryGrammar.g:5427:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionParentesisAccess().getOperacionParentesisAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getOperacionParentesisAccess().getLeftParenthesisKeyword_1());
                
            // InternalVaryGrammar.g:5436:1: ( (lv_negacionesFinales_2_0= '-' ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==101) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalVaryGrammar.g:5437:1: (lv_negacionesFinales_2_0= '-' )
            	    {
            	    // InternalVaryGrammar.g:5437:1: (lv_negacionesFinales_2_0= '-' )
            	    // InternalVaryGrammar.g:5438:3: lv_negacionesFinales_2_0= '-'
            	    {
            	    lv_negacionesFinales_2_0=(Token)match(input,101,FollowSets000.FOLLOW_52); 

            	            newLeafNode(lv_negacionesFinales_2_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesHyphenMinusKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_2_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // InternalVaryGrammar.g:5451:3: ( (lv_negacionesFinales_3_0= 'no' ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==106) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // InternalVaryGrammar.g:5452:1: (lv_negacionesFinales_3_0= 'no' )
            	    {
            	    // InternalVaryGrammar.g:5452:1: (lv_negacionesFinales_3_0= 'no' )
            	    // InternalVaryGrammar.g:5453:3: lv_negacionesFinales_3_0= 'no'
            	    {
            	    lv_negacionesFinales_3_0=(Token)match(input,106,FollowSets000.FOLLOW_52); 

            	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesNoKeyword_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // InternalVaryGrammar.g:5466:3: ( (lv_valor_operacion_4_0= ruleoperacion ) )
            // InternalVaryGrammar.g:5467:1: (lv_valor_operacion_4_0= ruleoperacion )
            {
            // InternalVaryGrammar.g:5467:1: (lv_valor_operacion_4_0= ruleoperacion )
            // InternalVaryGrammar.g:5468:3: lv_valor_operacion_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionParentesisAccess().getValor_operacionOperacionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_32);
            lv_valor_operacion_4_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionParentesisRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_4_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.operacion");
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
    // InternalVaryGrammar.g:5496:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // InternalVaryGrammar.g:5497:2: (iv_ruleFunciones= ruleFunciones EOF )
            // InternalVaryGrammar.g:5498:2: iv_ruleFunciones= ruleFunciones EOF
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
    // InternalVaryGrammar.g:5505:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) ) ;
    public final EObject ruleFunciones() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_operadores_2_0 = null;

        EObject lv_operadores_4_0 = null;

        AntlrDatatypeRuleToken lv_nombre_7_0 = null;

        EObject lv_operadores_8_0 = null;

        EObject lv_operadores_10_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5508:28: ( ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) ) )
            // InternalVaryGrammar.g:5509:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) )
            {
            // InternalVaryGrammar.g:5509:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_NOMBRE_FUN) ) {
                alt111=1;
            }
            else if ( ((LA111_0>=35 && LA111_0<=44)) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalVaryGrammar.g:5509:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' )
                    {
                    // InternalVaryGrammar.g:5509:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')' )
                    // InternalVaryGrammar.g:5509:3: () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )? otherlv_5= ')'
                    {
                    // InternalVaryGrammar.g:5509:3: ()
                    // InternalVaryGrammar.g:5510:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5515:2: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
                    // InternalVaryGrammar.g:5516:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    {
                    // InternalVaryGrammar.g:5516:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    // InternalVaryGrammar.g:5517:3: lv_nombre_1_0= RULE_NOMBRE_FUN
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

                    // InternalVaryGrammar.g:5533:2: ( ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )* )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( ((LA108_0>=RULE_ID && LA108_0<=RULE_CAR)||(LA108_0>=35 && LA108_0<=44)||LA108_0==69||LA108_0==101||LA108_0==106||(LA108_0>=113 && LA108_0<=114)) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // InternalVaryGrammar.g:5533:3: ( (lv_operadores_2_0= ruleOperacionCompleta ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )*
                            {
                            // InternalVaryGrammar.g:5533:3: ( (lv_operadores_2_0= ruleOperacionCompleta ) )
                            // InternalVaryGrammar.g:5534:1: (lv_operadores_2_0= ruleOperacionCompleta )
                            {
                            // InternalVaryGrammar.g:5534:1: (lv_operadores_2_0= ruleOperacionCompleta )
                            // InternalVaryGrammar.g:5535:3: lv_operadores_2_0= ruleOperacionCompleta
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionCompletaParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_26);
                            lv_operadores_2_0=ruleOperacionCompleta();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_2_0, 
                                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalVaryGrammar.g:5551:2: (otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) ) )*
                            loop107:
                            do {
                                int alt107=2;
                                int LA107_0 = input.LA(1);

                                if ( (LA107_0==28) ) {
                                    alt107=1;
                                }


                                switch (alt107) {
                            	case 1 :
                            	    // InternalVaryGrammar.g:5551:4: otherlv_3= ',' ( (lv_operadores_4_0= ruleOperacionCompleta ) )
                            	    {
                            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_52); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getFuncionesAccess().getCommaKeyword_0_2_1_0());
                            	        
                            	    // InternalVaryGrammar.g:5555:1: ( (lv_operadores_4_0= ruleOperacionCompleta ) )
                            	    // InternalVaryGrammar.g:5556:1: (lv_operadores_4_0= ruleOperacionCompleta )
                            	    {
                            	    // InternalVaryGrammar.g:5556:1: (lv_operadores_4_0= ruleOperacionCompleta )
                            	    // InternalVaryGrammar.g:5557:3: lv_operadores_4_0= ruleOperacionCompleta
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionCompletaParserRuleCall_0_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_operadores_4_0=ruleOperacionCompleta();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_4_0, 
                            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop107;
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
                    // InternalVaryGrammar.g:5578:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' )
                    {
                    // InternalVaryGrammar.g:5578:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')' )
                    // InternalVaryGrammar.g:5578:7: () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )? otherlv_11= ')'
                    {
                    // InternalVaryGrammar.g:5578:7: ()
                    // InternalVaryGrammar.g:5579:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5584:2: ( (lv_nombre_7_0= ruleNombreInterna ) )
                    // InternalVaryGrammar.g:5585:1: (lv_nombre_7_0= ruleNombreInterna )
                    {
                    // InternalVaryGrammar.g:5585:1: (lv_nombre_7_0= ruleNombreInterna )
                    // InternalVaryGrammar.g:5586:3: lv_nombre_7_0= ruleNombreInterna
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

                    // InternalVaryGrammar.g:5602:2: ( ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )* )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( ((LA110_0>=RULE_ID && LA110_0<=RULE_CAR)||(LA110_0>=35 && LA110_0<=44)||LA110_0==69||LA110_0==101||LA110_0==106||(LA110_0>=113 && LA110_0<=114)) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // InternalVaryGrammar.g:5602:3: ( (lv_operadores_8_0= ruleOperacionCompleta ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )*
                            {
                            // InternalVaryGrammar.g:5602:3: ( (lv_operadores_8_0= ruleOperacionCompleta ) )
                            // InternalVaryGrammar.g:5603:1: (lv_operadores_8_0= ruleOperacionCompleta )
                            {
                            // InternalVaryGrammar.g:5603:1: (lv_operadores_8_0= ruleOperacionCompleta )
                            // InternalVaryGrammar.g:5604:3: lv_operadores_8_0= ruleOperacionCompleta
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionCompletaParserRuleCall_1_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_26);
                            lv_operadores_8_0=ruleOperacionCompleta();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_8_0, 
                                    		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalVaryGrammar.g:5620:2: (otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) ) )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==28) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // InternalVaryGrammar.g:5620:4: otherlv_9= ',' ( (lv_operadores_10_0= ruleOperacionCompleta ) )
                            	    {
                            	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_52); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getCommaKeyword_1_2_1_0());
                            	        
                            	    // InternalVaryGrammar.g:5624:1: ( (lv_operadores_10_0= ruleOperacionCompleta ) )
                            	    // InternalVaryGrammar.g:5625:1: (lv_operadores_10_0= ruleOperacionCompleta )
                            	    {
                            	    // InternalVaryGrammar.g:5625:1: (lv_operadores_10_0= ruleOperacionCompleta )
                            	    // InternalVaryGrammar.g:5626:3: lv_operadores_10_0= ruleOperacionCompleta
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionCompletaParserRuleCall_1_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_26);
                            	    lv_operadores_10_0=ruleOperacionCompleta();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_10_0, 
                            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.OperacionCompleta");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop109;
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
    // InternalVaryGrammar.g:5654:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // InternalVaryGrammar.g:5655:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // InternalVaryGrammar.g:5656:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
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
    // InternalVaryGrammar.g:5663:1: ruleCampoRegistro returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) ) ;
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
            // InternalVaryGrammar.g:5666:28: ( ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) ) )
            // InternalVaryGrammar.g:5667:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) )
            {
            // InternalVaryGrammar.g:5667:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) )
            int alt112=3;
            alt112 = dfa112.predict(input);
            switch (alt112) {
                case 1 :
                    // InternalVaryGrammar.g:5667:2: (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:5667:2: (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:5667:4: otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_0, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_0_0());
                        
                    // InternalVaryGrammar.g:5671:1: ( (lv_nombre_campo_1_0= ruleEString ) )
                    // InternalVaryGrammar.g:5672:1: (lv_nombre_campo_1_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5672:1: (lv_nombre_campo_1_0= ruleEString )
                    // InternalVaryGrammar.g:5673:3: lv_nombre_campo_1_0= ruleEString
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
                    // InternalVaryGrammar.g:5690:6: (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' )
                    {
                    // InternalVaryGrammar.g:5690:6: (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' )
                    // InternalVaryGrammar.g:5690:8: otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_1_0());
                        
                    // InternalVaryGrammar.g:5694:1: ( (lv_nombre_campo_3_0= ruleEString ) )
                    // InternalVaryGrammar.g:5695:1: (lv_nombre_campo_3_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5695:1: (lv_nombre_campo_3_0= ruleEString )
                    // InternalVaryGrammar.g:5696:3: lv_nombre_campo_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_4, grammarAccess.getCampoRegistroAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // InternalVaryGrammar.g:5716:1: ( (lv_primerIndice_5_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5717:1: (lv_primerIndice_5_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5717:1: (lv_primerIndice_5_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5718:3: lv_primerIndice_5_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_primerIndice_5_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_5_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getCampoRegistroAccess().getRightSquareBracketKeyword_1_4());
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:5739:6: (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' )
                    {
                    // InternalVaryGrammar.g:5739:6: (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' )
                    // InternalVaryGrammar.g:5739:8: otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_7, grammarAccess.getCampoRegistroAccess().getFullStopKeyword_2_0());
                        
                    // InternalVaryGrammar.g:5743:1: ( (lv_nombre_campo_8_0= ruleEString ) )
                    // InternalVaryGrammar.g:5744:1: (lv_nombre_campo_8_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5744:1: (lv_nombre_campo_8_0= ruleEString )
                    // InternalVaryGrammar.g:5745:3: lv_nombre_campo_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    otherlv_9=(Token)match(input,50,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_9, grammarAccess.getCampoRegistroAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // InternalVaryGrammar.g:5765:1: ( (lv_primerIndice_10_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5766:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5766:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5767:3: lv_primerIndice_10_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getPrimerIndiceOperacionIndiceParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_primerIndice_10_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_10_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,55,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_11, grammarAccess.getCampoRegistroAccess().getRightSquareBracketLeftSquareBracketKeyword_2_4());
                        
                    // InternalVaryGrammar.g:5787:1: ( (lv_segundoIndice_12_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5788:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5788:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5789:3: lv_segundoIndice_12_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getSegundoIndiceOperacionIndiceParserRuleCall_2_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_segundoIndice_12_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_12_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,51,FollowSets000.FOLLOW_2); 

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
    // InternalVaryGrammar.g:5817:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // InternalVaryGrammar.g:5818:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // InternalVaryGrammar.g:5819:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
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
    // InternalVaryGrammar.g:5826:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ ) ) ;
    public final EObject ruleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_nombre_vector_1_0 = null;

        EObject lv_indice_3_0 = null;

        EObject lv_campo_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_matriz_7_0 = null;

        EObject lv_primerIndice_9_0 = null;

        EObject lv_segundoIndice_11_0 = null;

        EObject lv_campo_13_0 = null;

        AntlrDatatypeRuleToken lv_nombre_registro_15_0 = null;

        EObject lv_campo_16_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:5829:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ ) ) )
            // InternalVaryGrammar.g:5830:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ ) )
            {
            // InternalVaryGrammar.g:5830:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ ) )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // InternalVaryGrammar.g:5830:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* )
                    {
                    // InternalVaryGrammar.g:5830:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* )
                    // InternalVaryGrammar.g:5830:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )*
                    {
                    // InternalVaryGrammar.g:5830:3: ()
                    // InternalVaryGrammar.g:5831:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5836:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' )
                    // InternalVaryGrammar.g:5836:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']'
                    {
                    // InternalVaryGrammar.g:5836:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // InternalVaryGrammar.g:5837:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5837:1: (lv_nombre_vector_1_0= ruleEString )
                    // InternalVaryGrammar.g:5838:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // InternalVaryGrammar.g:5858:1: ( (lv_indice_3_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5859:1: (lv_indice_3_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5859:1: (lv_indice_3_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5860:3: lv_indice_3_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceOperacionIndiceParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_indice_3_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_77); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // InternalVaryGrammar.g:5880:2: ( (lv_campo_5_0= ruleCampoRegistro ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==45) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:5881:1: (lv_campo_5_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:5881:1: (lv_campo_5_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:5882:3: lv_campo_5_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campo_5_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campo",
                    	            		lv_campo_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:5899:6: ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* )
                    {
                    // InternalVaryGrammar.g:5899:6: ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* )
                    // InternalVaryGrammar.g:5899:7: () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )*
                    {
                    // InternalVaryGrammar.g:5899:7: ()
                    // InternalVaryGrammar.g:5900:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5905:2: ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' )
                    // InternalVaryGrammar.g:5905:3: ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']'
                    {
                    // InternalVaryGrammar.g:5905:3: ( (lv_nombre_matriz_7_0= ruleEString ) )
                    // InternalVaryGrammar.g:5906:1: (lv_nombre_matriz_7_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5906:1: (lv_nombre_matriz_7_0= ruleEString )
                    // InternalVaryGrammar.g:5907:3: lv_nombre_matriz_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    otherlv_8=(Token)match(input,50,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_8, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // InternalVaryGrammar.g:5927:1: ( (lv_primerIndice_9_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5928:1: (lv_primerIndice_9_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5928:1: (lv_primerIndice_9_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5929:3: lv_primerIndice_9_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_42);
                    lv_primerIndice_9_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_9_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,55,FollowSets000.FOLLOW_75); 

                        	newLeafNode(otherlv_10, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // InternalVaryGrammar.g:5949:1: ( (lv_segundoIndice_11_0= ruleoperacionIndice ) )
                    // InternalVaryGrammar.g:5950:1: (lv_segundoIndice_11_0= ruleoperacionIndice )
                    {
                    // InternalVaryGrammar.g:5950:1: (lv_segundoIndice_11_0= ruleoperacionIndice )
                    // InternalVaryGrammar.g:5951:3: lv_segundoIndice_11_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceOperacionIndiceParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_segundoIndice_11_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_11_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,51,FollowSets000.FOLLOW_77); 

                        	newLeafNode(otherlv_12, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // InternalVaryGrammar.g:5971:2: ( (lv_campo_13_0= ruleCampoRegistro ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==45) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:5972:1: (lv_campo_13_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:5972:1: (lv_campo_13_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:5973:3: lv_campo_13_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campo_13_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campo",
                    	            		lv_campo_13_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:5990:6: ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ )
                    {
                    // InternalVaryGrammar.g:5990:6: ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ )
                    // InternalVaryGrammar.g:5990:7: () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+
                    {
                    // InternalVaryGrammar.g:5990:7: ()
                    // InternalVaryGrammar.g:5991:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:5996:2: ( (lv_nombre_registro_15_0= ruleEString ) )
                    // InternalVaryGrammar.g:5997:1: (lv_nombre_registro_15_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:5997:1: (lv_nombre_registro_15_0= ruleEString )
                    // InternalVaryGrammar.g:5998:3: lv_nombre_registro_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
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

                    // InternalVaryGrammar.g:6014:2: ( (lv_campo_16_0= ruleCampoRegistro ) )+
                    int cnt115=0;
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==45) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6015:1: (lv_campo_16_0= ruleCampoRegistro )
                    	    {
                    	    // InternalVaryGrammar.g:6015:1: (lv_campo_16_0= ruleCampoRegistro )
                    	    // InternalVaryGrammar.g:6016:3: lv_campo_16_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_77);
                    	    lv_campo_16_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campo",
                    	            		lv_campo_16_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt115 >= 1 ) break loop115;
                                EarlyExitException eee =
                                    new EarlyExitException(115, input);
                                throw eee;
                        }
                        cnt115++;
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
    // InternalVaryGrammar.g:6040:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // InternalVaryGrammar.g:6041:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // InternalVaryGrammar.g:6042:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
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
    // InternalVaryGrammar.g:6049:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
    public final EObject ruleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        Token lv_contenido_5_0=null;
        Token lv_contenido_7_0=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_valor_3_0 = null;

        AntlrDatatypeRuleToken lv_valor_9_0 = null;

        AntlrDatatypeRuleToken lv_nombre_11_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6052:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // InternalVaryGrammar.g:6053:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // InternalVaryGrammar.g:6053:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt117=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA117_1 = input.LA(2);

                if ( (LA117_1==45) ) {
                    alt117=2;
                }
                else if ( (LA117_1==EOF||(LA117_1>=RULE_ID && LA117_1<=RULE_NOMBRE_FUN)||LA117_1==RULE_STRING||(LA117_1>=18 && LA117_1<=19)||(LA117_1>=26 && LA117_1<=29)||(LA117_1>=31 && LA117_1<=32)||(LA117_1>=35 && LA117_1<=44)||LA117_1==48||LA117_1==51||LA117_1==53||LA117_1==55||LA117_1==60||LA117_1==62||LA117_1==64||(LA117_1>=66 && LA117_1<=68)||LA117_1==70||(LA117_1>=72 && LA117_1<=105)||(LA117_1>=107 && LA117_1<=110)) ) {
                    alt117=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt117=3;
                }
                break;
            case RULE_CAR:
                {
                alt117=4;
                }
                break;
            case 113:
            case 114:
                {
                alt117=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt117=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalVaryGrammar.g:6053:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // InternalVaryGrammar.g:6053:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // InternalVaryGrammar.g:6053:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // InternalVaryGrammar.g:6053:3: ()
                    // InternalVaryGrammar.g:6054:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6059:2: ( (lv_valor_1_0= ruleEInt ) )
                    // InternalVaryGrammar.g:6060:1: (lv_valor_1_0= ruleEInt )
                    {
                    // InternalVaryGrammar.g:6060:1: (lv_valor_1_0= ruleEInt )
                    // InternalVaryGrammar.g:6061:3: lv_valor_1_0= ruleEInt
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
                    // InternalVaryGrammar.g:6078:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // InternalVaryGrammar.g:6078:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // InternalVaryGrammar.g:6078:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // InternalVaryGrammar.g:6078:7: ()
                    // InternalVaryGrammar.g:6079:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6084:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // InternalVaryGrammar.g:6085:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // InternalVaryGrammar.g:6085:1: (lv_valor_3_0= ruleEFloat )
                    // InternalVaryGrammar.g:6086:3: lv_valor_3_0= ruleEFloat
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
                    // InternalVaryGrammar.g:6103:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // InternalVaryGrammar.g:6103:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // InternalVaryGrammar.g:6103:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // InternalVaryGrammar.g:6103:7: ()
                    // InternalVaryGrammar.g:6104:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6109:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // InternalVaryGrammar.g:6110:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // InternalVaryGrammar.g:6110:1: (lv_contenido_5_0= RULE_CAD )
                    // InternalVaryGrammar.g:6111:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_contenido_5_0, grammarAccess.getVariablesBasicasAccess().getContenidoCADTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_5_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.CAD");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVaryGrammar.g:6128:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // InternalVaryGrammar.g:6128:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // InternalVaryGrammar.g:6128:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // InternalVaryGrammar.g:6128:7: ()
                    // InternalVaryGrammar.g:6129:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6134:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // InternalVaryGrammar.g:6135:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // InternalVaryGrammar.g:6135:1: (lv_contenido_7_0= RULE_CAR )
                    // InternalVaryGrammar.g:6136:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_2); 

                    			newLeafNode(lv_contenido_7_0, grammarAccess.getVariablesBasicasAccess().getContenidoCARTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_7_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.CAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVaryGrammar.g:6153:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    {
                    // InternalVaryGrammar.g:6153:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    // InternalVaryGrammar.g:6153:7: () ( (lv_valor_9_0= ruleBooleano ) )
                    {
                    // InternalVaryGrammar.g:6153:7: ()
                    // InternalVaryGrammar.g:6154:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6159:2: ( (lv_valor_9_0= ruleBooleano ) )
                    // InternalVaryGrammar.g:6160:1: (lv_valor_9_0= ruleBooleano )
                    {
                    // InternalVaryGrammar.g:6160:1: (lv_valor_9_0= ruleBooleano )
                    // InternalVaryGrammar.g:6161:3: lv_valor_9_0= ruleBooleano
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
                    // InternalVaryGrammar.g:6178:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // InternalVaryGrammar.g:6178:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // InternalVaryGrammar.g:6178:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // InternalVaryGrammar.g:6178:7: ()
                    // InternalVaryGrammar.g:6179:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // InternalVaryGrammar.g:6184:2: ( (lv_nombre_11_0= ruleEString ) )
                    // InternalVaryGrammar.g:6185:1: (lv_nombre_11_0= ruleEString )
                    {
                    // InternalVaryGrammar.g:6185:1: (lv_nombre_11_0= ruleEString )
                    // InternalVaryGrammar.g:6186:3: lv_nombre_11_0= ruleEString
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
    // InternalVaryGrammar.g:6210:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // InternalVaryGrammar.g:6211:2: (iv_ruleSino= ruleSino EOF )
            // InternalVaryGrammar.g:6212:2: iv_ruleSino= ruleSino EOF
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
    // InternalVaryGrammar.g:6219:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencias ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_devuelve_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6222:28: ( ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencias ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? ) )
            // InternalVaryGrammar.g:6223:1: ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencias ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? )
            {
            // InternalVaryGrammar.g:6223:1: ( () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencias ) )* ( (lv_devuelve_3_0= ruleDevolver ) )? )
            // InternalVaryGrammar.g:6223:2: () otherlv_1= 'si_no' ( (lv_sentencias_2_0= ruleSentencias ) )* ( (lv_devuelve_3_0= ruleDevolver ) )?
            {
            // InternalVaryGrammar.g:6223:2: ()
            // InternalVaryGrammar.g:6224:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_63); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSi_noKeyword_1());
                
            // InternalVaryGrammar.g:6233:1: ( (lv_sentencias_2_0= ruleSentencias ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( ((LA118_0>=RULE_ID && LA118_0<=RULE_NOMBRE_FUN)||LA118_0==RULE_STRING||(LA118_0>=31 && LA118_0<=32)||(LA118_0>=35 && LA118_0<=44)||(LA118_0>=66 && LA118_0<=68)||LA118_0==70||(LA118_0>=73 && LA118_0<=74)||LA118_0==77||LA118_0==80||(LA118_0>=84 && LA118_0<=85)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalVaryGrammar.g:6234:1: (lv_sentencias_2_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:6234:1: (lv_sentencias_2_0= ruleSentencias )
            	    // InternalVaryGrammar.g:6235:3: lv_sentencias_2_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_sentencias_2_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSinoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_2_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            // InternalVaryGrammar.g:6251:3: ( (lv_devuelve_3_0= ruleDevolver ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==108) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalVaryGrammar.g:6252:1: (lv_devuelve_3_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:6252:1: (lv_devuelve_3_0= ruleDevolver )
                    // InternalVaryGrammar.g:6253:3: lv_devuelve_3_0= ruleDevolver
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
    // InternalVaryGrammar.g:6277:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // InternalVaryGrammar.g:6278:2: (iv_ruleDevolver= ruleDevolver EOF )
            // InternalVaryGrammar.g:6279:2: iv_ruleDevolver= ruleDevolver EOF
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
    // InternalVaryGrammar.g:6286:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6289:28: ( ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) )
            // InternalVaryGrammar.g:6290:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            {
            // InternalVaryGrammar.g:6290:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            // InternalVaryGrammar.g:6290:2: () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            {
            // InternalVaryGrammar.g:6290:2: ()
            // InternalVaryGrammar.g:6291:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,108,FollowSets000.FOLLOW_52); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            // InternalVaryGrammar.g:6300:1: ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            // InternalVaryGrammar.g:6301:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            {
            // InternalVaryGrammar.g:6301:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            // InternalVaryGrammar.g:6302:3: lv_devuelve_2_0= ruleOperacionCompleta
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


    // $ANTLR start "entryRuleParametroFuncion"
    // InternalVaryGrammar.g:6326:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // InternalVaryGrammar.g:6327:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // InternalVaryGrammar.g:6328:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
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
    // $ANTLR end "entryRuleParametroFuncion"


    // $ANTLR start "ruleParametroFuncion"
    // InternalVaryGrammar.g:6335:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6338:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // InternalVaryGrammar.g:6339:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // InternalVaryGrammar.g:6339:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // InternalVaryGrammar.g:6339:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // InternalVaryGrammar.g:6339:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // InternalVaryGrammar.g:6340:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // InternalVaryGrammar.g:6340:1: (lv_paso_0_0= ruleTipoPaso )
            // InternalVaryGrammar.g:6341:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_40);
            lv_paso_0_0=ruleTipoPaso();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"paso",
                    		lv_paso_0_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.TipoPaso");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalVaryGrammar.g:6357:2: ( (lv_tipo_1_0= ruleTipo ) )
            // InternalVaryGrammar.g:6358:1: (lv_tipo_1_0= ruleTipo )
            {
            // InternalVaryGrammar.g:6358:1: (lv_tipo_1_0= ruleTipo )
            // InternalVaryGrammar.g:6359:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_41);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"vary.pseudocodigo.dsl.c.VaryGrammar.Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // InternalVaryGrammar.g:6379:1: ( (lv_variable_3_0= ruleVariable ) )
            // InternalVaryGrammar.g:6380:1: (lv_variable_3_0= ruleVariable )
            {
            // InternalVaryGrammar.g:6380:1: (lv_variable_3_0= ruleVariable )
            // InternalVaryGrammar.g:6381:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
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
    // $ANTLR end "ruleParametroFuncion"


    // $ANTLR start "entryRuleFuncion"
    // InternalVaryGrammar.g:6405:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalVaryGrammar.g:6406:2: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalVaryGrammar.g:6407:2: iv_ruleFuncion= ruleFuncion EOF
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
    // InternalVaryGrammar.g:6414:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' ) ;
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

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;

        EObject lv_declaracion_8_0 = null;

        EObject lv_sentencias_10_0 = null;

        EObject lv_devuelve_11_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6417:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' ) )
            // InternalVaryGrammar.g:6418:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' )
            {
            // InternalVaryGrammar.g:6418:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion' )
            // InternalVaryGrammar.g:6418:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'inicio' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'fin_funcion'
            {
            // InternalVaryGrammar.g:6418:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // InternalVaryGrammar.g:6419:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // InternalVaryGrammar.g:6419:1: (lv_tipo_0_0= ruleTipoVariable )
            // InternalVaryGrammar.g:6420:3: lv_tipo_0_0= ruleTipoVariable
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
                
            // InternalVaryGrammar.g:6440:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:6441:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:6441:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:6442:3: lv_nombre_2_0= RULE_NOMBRE_FUN
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

            // InternalVaryGrammar.g:6458:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==46||(LA121_0>=111 && LA121_0<=112)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalVaryGrammar.g:6458:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // InternalVaryGrammar.g:6458:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // InternalVaryGrammar.g:6459:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // InternalVaryGrammar.g:6459:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // InternalVaryGrammar.g:6460:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:6476:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==28) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6476:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // InternalVaryGrammar.g:6480:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // InternalVaryGrammar.g:6481:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // InternalVaryGrammar.g:6481:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // InternalVaryGrammar.g:6482:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_5_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_78); 

                	newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_4());
                
            // InternalVaryGrammar.g:6502:1: (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==19) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalVaryGrammar.g:6502:3: otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_48); 

                        	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getVarKeyword_5_0());
                        
                    // InternalVaryGrammar.g:6506:1: ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                    loop122:
                    do {
                        int alt122=2;
                        int LA122_0 = input.LA(1);

                        if ( (LA122_0==RULE_ID||LA122_0==RULE_STRING||(LA122_0>=88 && LA122_0<=92)) ) {
                            alt122=1;
                        }


                        switch (alt122) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6507:1: (lv_declaracion_8_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:6507:1: (lv_declaracion_8_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:6508:3: lv_declaracion_8_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_48);
                    	    lv_declaracion_8_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_8_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop122;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,63,FollowSets000.FOLLOW_79); 

                	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getInicioKeyword_6());
                
            // InternalVaryGrammar.g:6528:1: ( (lv_sentencias_10_0= ruleSentencias ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=RULE_ID && LA124_0<=RULE_NOMBRE_FUN)||LA124_0==RULE_STRING||(LA124_0>=31 && LA124_0<=32)||(LA124_0>=35 && LA124_0<=44)||(LA124_0>=66 && LA124_0<=68)||LA124_0==70||(LA124_0>=73 && LA124_0<=74)||LA124_0==77||LA124_0==80||(LA124_0>=84 && LA124_0<=85)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalVaryGrammar.g:6529:1: (lv_sentencias_10_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:6529:1: (lv_sentencias_10_0= ruleSentencias )
            	    // InternalVaryGrammar.g:6530:3: lv_sentencias_10_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_79);
            	    lv_sentencias_10_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_10_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            // InternalVaryGrammar.g:6546:3: ( (lv_devuelve_11_0= ruleDevolver ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==108) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalVaryGrammar.g:6547:1: (lv_devuelve_11_0= ruleDevolver )
                    {
                    // InternalVaryGrammar.g:6547:1: (lv_devuelve_11_0= ruleDevolver )
                    // InternalVaryGrammar.g:6548:3: lv_devuelve_11_0= ruleDevolver
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
    // InternalVaryGrammar.g:6576:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // InternalVaryGrammar.g:6577:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // InternalVaryGrammar.g:6578:2: iv_ruleProcedimiento= ruleProcedimiento EOF
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
    // InternalVaryGrammar.g:6585:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'fin_procedimiento' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_parametrofuncion_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_declaracion_7_0 = null;

        EObject lv_sentencias_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6588:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'fin_procedimiento' ) )
            // InternalVaryGrammar.g:6589:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'fin_procedimiento' )
            {
            // InternalVaryGrammar.g:6589:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'fin_procedimiento' )
            // InternalVaryGrammar.g:6589:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'inicio' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // InternalVaryGrammar.g:6593:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // InternalVaryGrammar.g:6594:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // InternalVaryGrammar.g:6594:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // InternalVaryGrammar.g:6595:3: lv_nombre_1_0= RULE_NOMBRE_FUN
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

            // InternalVaryGrammar.g:6611:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==46||(LA127_0>=111 && LA127_0<=112)) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalVaryGrammar.g:6611:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // InternalVaryGrammar.g:6611:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // InternalVaryGrammar.g:6612:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // InternalVaryGrammar.g:6612:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // InternalVaryGrammar.g:6613:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_parametrofuncion_2_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_2_0, 
                            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalVaryGrammar.g:6629:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==28) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6629:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_27); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalVaryGrammar.g:6633:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // InternalVaryGrammar.g:6634:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // InternalVaryGrammar.g:6634:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // InternalVaryGrammar.g:6635:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_26);
                    	    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_4_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_78); 

                	newLeafNode(otherlv_5, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_3());
                
            // InternalVaryGrammar.g:6655:1: (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==19) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalVaryGrammar.g:6655:3: otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_48); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getVarKeyword_4_0());
                        
                    // InternalVaryGrammar.g:6659:1: ( (lv_declaracion_7_0= ruleDeclaracion ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==RULE_ID||LA128_0==RULE_STRING||(LA128_0>=88 && LA128_0<=92)) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalVaryGrammar.g:6660:1: (lv_declaracion_7_0= ruleDeclaracion )
                    	    {
                    	    // InternalVaryGrammar.g:6660:1: (lv_declaracion_7_0= ruleDeclaracion )
                    	    // InternalVaryGrammar.g:6661:3: lv_declaracion_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_48);
                    	    lv_declaracion_7_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_7_0, 
                    	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,63,FollowSets000.FOLLOW_81); 

                	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getInicioKeyword_5());
                
            // InternalVaryGrammar.g:6681:1: ( (lv_sentencias_9_0= ruleSentencias ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=RULE_ID && LA130_0<=RULE_NOMBRE_FUN)||LA130_0==RULE_STRING||(LA130_0>=31 && LA130_0<=32)||(LA130_0>=35 && LA130_0<=44)||(LA130_0>=66 && LA130_0<=68)||LA130_0==70||(LA130_0>=73 && LA130_0<=74)||LA130_0==77||LA130_0==80||(LA130_0>=84 && LA130_0<=85)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalVaryGrammar.g:6682:1: (lv_sentencias_9_0= ruleSentencias )
            	    {
            	    // InternalVaryGrammar.g:6682:1: (lv_sentencias_9_0= ruleSentencias )
            	    // InternalVaryGrammar.g:6683:3: lv_sentencias_9_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_81);
            	    lv_sentencias_9_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_9_0, 
            	            		"vary.pseudocodigo.dsl.c.VaryGrammar.Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop130;
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
    // InternalVaryGrammar.g:6711:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // InternalVaryGrammar.g:6712:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // InternalVaryGrammar.g:6713:2: iv_ruleTipoPaso= ruleTipoPaso EOF
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
    // InternalVaryGrammar.g:6720:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6723:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // InternalVaryGrammar.g:6724:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // InternalVaryGrammar.g:6724:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt131=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt131=1;
                }
                break;
            case 111:
                {
                alt131=2;
                }
                break;
            case 112:
                {
                alt131=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalVaryGrammar.g:6725:2: kw= 'E'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:6732:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalVaryGrammar.g:6739:2: kw= 'S'
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
    // InternalVaryGrammar.g:6752:1: entryRuleBooleano returns [String current=null] : iv_ruleBooleano= ruleBooleano EOF ;
    public final String entryRuleBooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleano = null;


        try {
            // InternalVaryGrammar.g:6753:2: (iv_ruleBooleano= ruleBooleano EOF )
            // InternalVaryGrammar.g:6754:2: iv_ruleBooleano= ruleBooleano EOF
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
    // InternalVaryGrammar.g:6761:1: ruleBooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleBooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVaryGrammar.g:6764:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // InternalVaryGrammar.g:6765:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // InternalVaryGrammar.g:6765:1: (kw= 'verdadero' | kw= 'falso' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==113) ) {
                alt132=1;
            }
            else if ( (LA132_0==114) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalVaryGrammar.g:6766:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalVaryGrammar.g:6773:2: kw= 'falso'
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


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA116 dfa116 = new DFA116(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\4\uffff\2\60\1\4\2\uffff";
    static final String dfa_3s = "\1\72\4\uffff\2\60\1\73\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\2\uffff\1\5\51\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\11\1\uffff\2\11\63\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String dfa_7s = "\u0173\uffff";
    static final String dfa_8s = "\2\uffff\2\5\u016f\uffff";
    static final String dfa_9s = "\1\55\4\4\1\uffff\3\60\15\4\2\uffff\22\60\50\4\55\60\70\4\74\60\52\4\55\60\21\4\22\60\3\4\3\60";
    static final String dfa_10s = "\1\55\1\7\2\156\1\7\1\uffff\3\151\15\7\2\uffff\22\151\50\7\55\151\70\7\74\151\52\7\55\151\21\7\22\151\3\7\3\151";
    static final String dfa_11s = "\5\uffff\1\1\20\uffff\1\2\1\3\u015b\uffff";
    static final String dfa_12s = "\u0173\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\3\2\uffff\1\2",
            "\2\5\1\uffff\1\5\12\uffff\2\5\6\uffff\4\5\1\uffff\2\5\2\uffff\13\5\2\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\1\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1\uffff\5\5\1\uffff\1\5\1\uffff\42\5\1\uffff\4\5",
            "\2\5\1\uffff\1\5\12\uffff\2\5\6\uffff\4\5\1\uffff\2\5\2\uffff\13\5\2\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\1\uffff\1\5\4\uffff\1\5\1\uffff\1\5\1\uffff\5\5\1\uffff\1\5\1\uffff\42\5\1\uffff\4\5",
            "\1\10\1\uffff\1\6\1\7",
            "",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
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
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\11\1\12\1\uffff\1\13",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
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
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\14\1\15\1\52\1\53\1\uffff\1\54",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\55\1\56\1\uffff\1\57",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\62\1\63\1\uffff\1\64",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\73\1\74\1\uffff\1\75",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\106\1\107\1\uffff\1\110",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
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
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\16\1\17\1\20\1\21\1\60\1\61\1\177\1\u0080\1\uffff\1\u0081",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\65\1\66\1\u0082\1\u0083\1\uffff\1\u0084",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u0085\1\u0086\1\uffff\1\u0087",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\76\1\77\1\u008a\1\u008b\1\uffff\1\u008c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u008d\1\u008e\1\uffff\1\u008f",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u0092\1\u0093\1\uffff\1\u0094",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\111\1\112\1\u009b\1\u009c\1\uffff\1\u009d",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u009e\1\u009f\1\uffff\1\u00a0",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u00a3\1\u00a4\1\uffff\1\u00a5",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u00ac\1\u00ad\1\uffff\1\u00ae",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
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
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\22\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\23\1\67\1\70\1\71\1\72\1\u0088\1\u0089\1\u00f3\1\u00f4\1\uffff\1\u00f5",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\100\1\101\1\102\1\103\1\u0090\1\u0091\1\u00f6\1\u00f7\1\uffff\1\u00f8",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u0095\1\u0096\1\u00f9\1\u00fa\1\uffff\1\u00fb",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u00fc\1\u00fd\1\uffff\1\u00fe",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\113\1\114\1\115\1\116\1\u00a1\1\u00a2\1\u0101\1\u0102\1\uffff\1\u0103",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00a6\1\u00a7\1\u0104\1\u0105\1\uffff\1\u0106",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u0107\1\u0108\1\uffff\1\u0109",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00af\1\u00b0\1\u010c\1\u010d\1\uffff\1\u010e",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u010f\1\u0110\1\uffff\1\u0111",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0114\1\u0115\1\uffff\1\u0116",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
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
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\104\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\24\1\105\1\u0097\1\u0098\1\u0099\1\u009a\1\u00ff\1\u0100\1\u014a\1\u014b\1\uffff\1\u014c",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\117\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\120\1\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u010a\1\u010b\1\u014d\1\u014e\1\uffff\1\u014f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u0112\1\u0113\1\u0150\1\u0151\1\uffff\1\u0152",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0117\1\u0118\1\u0153\1\u0154\1\uffff\1\u0155",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u0156\1\u0157\1\uffff\1\u0158",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u0172\1\uffff\1\u0170\1\u0171",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f",
            "\1\u00b5\2\uffff\1\26\3\uffff\1\27\45\uffff\1\25\1\121\1\u00b6\1\u0119\1\u011a\1\u011b\1\u011c\1\u0159\1\u015a\1\u016d\1\u016e\1\uffff\1\u016f"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "5667:1: ( (otherlv_0= '.' ( (lv_nombre_campo_1_0= ruleEString ) ) ) | (otherlv_2= '.' ( (lv_nombre_campo_3_0= ruleEString ) ) otherlv_4= '[' ( (lv_primerIndice_5_0= ruleoperacionIndice ) ) otherlv_6= ']' ) | (otherlv_7= '.' ( (lv_nombre_campo_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) )";
        }
    }
    static final String dfa_14s = "\u0172\uffff";
    static final String dfa_15s = "\1\4\2\55\1\uffff\1\4\3\60\15\4\2\uffff\22\60\50\4\55\60\70\4\74\60\52\4\55\60\21\4\22\60\3\4\3\60";
    static final String dfa_16s = "\1\7\2\62\1\uffff\1\7\3\151\15\7\2\uffff\22\151\50\7\55\151\70\7\74\151\52\7\55\151\21\7\22\151\3\7\3\151";
    static final String dfa_17s = "\3\uffff\1\3\21\uffff\1\1\1\2\u015b\uffff";
    static final String dfa_18s = "\u0172\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\2\uffff\1\1",
            "\1\3\4\uffff\1\4",
            "\1\3\4\uffff\1\4",
            "",
            "\1\7\1\uffff\1\5\1\6",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
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
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\10\1\11\1\uffff\1\12",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
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
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\13\1\14\1\51\1\52\1\uffff\1\53",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\54\1\55\1\uffff\1\56",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\61\1\62\1\uffff\1\63",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\72\1\73\1\uffff\1\74",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\105\1\106\1\uffff\1\107",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
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
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\57\1\60\1\176\1\177\1\uffff\1\u0080",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\64\1\65\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\75\1\76\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\110\1\111\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
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
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\21\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0087\1\u0088\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008f\1\u0090\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0094\1\u0095\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u00a0\1\u00a1\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a5\1\u00a6\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ae\1\u00af\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
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
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\103\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fe\1\u00ff\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\116\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0109\1\u010a\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u0111\1\u0112\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0116\1\u0117\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u00b4\2\uffff\1\25\3\uffff\1\26\45\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0158\1\u0159\1\u016c\1\u016d\1\uffff\1\u016e"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "5830:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) ( (lv_campo_5_0= ruleCampoRegistro ) )* ) | ( () ( ( (lv_nombre_matriz_7_0= ruleEString ) ) otherlv_8= '[' ( (lv_primerIndice_9_0= ruleoperacionIndice ) ) otherlv_10= '][' ( (lv_segundoIndice_11_0= ruleoperacionIndice ) ) otherlv_12= ']' ) ( (lv_campo_13_0= ruleCampoRegistro ) )* ) | ( () ( (lv_nombre_registro_15_0= ruleEString ) ) ( (lv_campo_16_0= ruleCampoRegistro ) )+ ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x40000000080E8000L,0x000000001F000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x40000000080E8090L,0x000000001F000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x45420000080E8090L,0x000000001F000000L});
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
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x054200000C080090L,0x000000001F000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C000000L,0x000000001F000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400020000000L,0x0001800000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L,0x0001800000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00001FF8000003F0L,0x0006000000000020L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000010000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000090L,0x000000001F000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00001FF9800000B0L,0x000000000031265DL});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00001FF8000003F0L,0x0006042000000020L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00001FF9800000B0L,0x000018000031275CL});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000100L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00001FF9800000B0L,0x000000000031365CL});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00001FF9800000B0L,0x000000000031E65CL});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00001FF9800000B0L,0x000000000035265CL});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00001FF9800000B2L,0x000010000031265CL});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000480000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00001FF9800000B0L,0x0000100000B1265CL});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0001000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000F00000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00001FF8000003F0L,0x0006040000000020L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x00001FF8200003F0L,0x0006042000000020L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000000000080000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x00001FF9800000B0L,0x000030000031265CL});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x00001FF9800000B0L,0x000040000031265CL});
    }


}