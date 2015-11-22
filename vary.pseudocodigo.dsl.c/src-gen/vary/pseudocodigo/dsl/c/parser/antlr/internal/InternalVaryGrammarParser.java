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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NOMBRE_FUN", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algoritmo'", "'importa'", "'fin_importa'", "'const'", "'tipo'", "'var'", "'fin_algoritmo'", "'Modulo'", "'exporta'", "'fin_exporta'", "'fin_modulo'", "'implementacion'", "'fin_implementacion'", "'procedimiento'", "','", "')'", "'funcion'", "'abrir'", "'('", "'cerrar'", "'escritura'", "'lectura'", "'cos('", "'cuadrado('", "'exp('", "'ln('", "'log('", "'sen('", "'sqrt('", "'longitud('", "'concatena('", "'.'", "'E'", "'e'", "'+'", "'-'", "'='", "'vector'", "'['", "']'", "'de'", "': '", "'matriz'", "']['", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'principal'", "'inicio'", "'fin_principal'", "'<-'", "'escribir('", "'leer('", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'caso'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'o'", "'y'", "'!='", "'<'", "'>'", "'>='", "'<='", "'*'", "'/'", "'mod'", "'div'", "'-('", "'no'", "'si_no'", "'devolver'", "'fin_funcion'", "'fin_procedimiento'", "'E/S'", "'S'", "'verdadero'", "'falso'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_NOMBRE_FUN=5;
    public static final int RULE_CAR=11;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_CAD=10;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=8;
    public static final int RULE_COMENT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalVaryGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaryGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaryGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g"; }



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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:67:1: entryRuleCodigo returns [EObject current=null] : iv_ruleCodigo= ruleCodigo EOF ;
    public final EObject entryRuleCodigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodigo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:68:2: (iv_ruleCodigo= ruleCodigo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:69:2: iv_ruleCodigo= ruleCodigo EOF
            {
             newCompositeNode(grammarAccess.getCodigoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCodigo_in_entryRuleCodigo75);
            iv_ruleCodigo=ruleCodigo();

            state._fsp--;

             current =iv_ruleCodigo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCodigo85); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:76:1: ruleCodigo returns [EObject current=null] : (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        EObject this_Algoritmo_0 = null;

        EObject this_Modulo_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:79:28: ( (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:81:5: this_Algoritmo_0= ruleAlgoritmo
                    {
                     
                            newCompositeNode(grammarAccess.getCodigoAccess().getAlgoritmoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAlgoritmo_in_ruleCodigo132);
                    this_Algoritmo_0=ruleAlgoritmo();

                    state._fsp--;

                     
                            current = this_Algoritmo_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:91:5: this_Modulo_1= ruleModulo
                    {
                     
                            newCompositeNode(grammarAccess.getCodigoAccess().getModuloParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleModulo_in_ruleCodigo159);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:107:1: entryRuleAlgoritmo returns [EObject current=null] : iv_ruleAlgoritmo= ruleAlgoritmo EOF ;
    public final EObject entryRuleAlgoritmo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoritmo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:108:2: (iv_ruleAlgoritmo= ruleAlgoritmo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:109:2: iv_ruleAlgoritmo= ruleAlgoritmo EOF
            {
             newCompositeNode(grammarAccess.getAlgoritmoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAlgoritmo_in_entryRuleAlgoritmo194);
            iv_ruleAlgoritmo=ruleAlgoritmo();

            state._fsp--;

             current =iv_ruleAlgoritmo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAlgoritmo204); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:116:1: ruleAlgoritmo returns [EObject current=null] : (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )? (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'fin_algoritmo' ) ;
    public final EObject ruleAlgoritmo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_comentarios_2_0 = null;

        EObject lv_comentarios_3_0 = null;

        EObject lv_constantes_9_0 = null;

        EObject lv_constantes_10_0 = null;

        EObject lv_tipocomplejo_12_0 = null;

        EObject lv_tipocomplejo_13_0 = null;

        EObject lv_global_15_0 = null;

        EObject lv_global_16_0 = null;

        EObject lv_funcion_17_0 = null;

        EObject lv_funcion_18_0 = null;

        EObject lv_tiene_19_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:119:28: ( (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )? (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'fin_algoritmo' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )? (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'fin_algoritmo' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:120:1: (otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )? (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'fin_algoritmo' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:120:3: otherlv_0= 'Algoritmo' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )? (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'fin_algoritmo'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAlgoritmo241); 

                	newLeafNode(otherlv_0, grammarAccess.getAlgoritmoAccess().getAlgoritmoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:124:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:125:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:125:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:126:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAlgoritmo262);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:142:2: ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:142:3: ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:142:3: ( (lv_comentarios_2_0= ruleComentario ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:143:1: (lv_comentarios_2_0= ruleComentario )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:143:1: (lv_comentarios_2_0= ruleComentario )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:144:3: lv_comentarios_2_0= ruleComentario
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getComentariosComentarioParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleAlgoritmo284);
                    lv_comentarios_2_0=ruleComentario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	        }
                           		add(
                           			current, 
                           			"comentarios",
                            		lv_comentarios_2_0, 
                            		"Comentario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:160:2: ( (lv_comentarios_3_0= ruleComentario ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_SL_COMMENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:161:1: (lv_comentarios_3_0= ruleComentario )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:161:1: (lv_comentarios_3_0= ruleComentario )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:162:3: lv_comentarios_3_0= ruleComentario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getComentariosComentarioParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleAlgoritmo305);
                    	    lv_comentarios_3_0=ruleComentario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"comentarios",
                    	            		lv_comentarios_3_0, 
                    	            		"Comentario");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:178:5: (otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:178:7: otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAlgoritmo321); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlgoritmoAccess().getImportaKeyword_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:182:1: ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:182:2: ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:182:2: ( (otherlv_5= RULE_ID ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:183:1: (otherlv_5= RULE_ID )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:183:1: (otherlv_5= RULE_ID )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:184:3: otherlv_5= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                            	        }
                                    
                            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlgoritmo342); 

                            		newLeafNode(otherlv_5, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_3_1_0_0()); 
                            	

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:195:2: ( (otherlv_6= RULE_ID ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==RULE_ID) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:196:1: (otherlv_6= RULE_ID )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:196:1: (otherlv_6= RULE_ID )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:197:3: otherlv_6= RULE_ID
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                            	    	        }
                            	            
                            	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlgoritmo362); 

                            	    		newLeafNode(otherlv_6, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_3_1_1_0()); 
                            	    	

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

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAlgoritmo377); 

                        	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getFin_importaKeyword_3_2());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:3: (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:5: otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )?
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAlgoritmo392); 

                        	newLeafNode(otherlv_8, grammarAccess.getAlgoritmoAccess().getConstKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:216:1: ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:216:2: ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:216:2: ( (lv_constantes_9_0= ruleConstantes ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:217:1: (lv_constantes_9_0= ruleConstantes )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:217:1: (lv_constantes_9_0= ruleConstantes )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:218:3: lv_constantes_9_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleAlgoritmo414);
                            lv_constantes_9_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_9_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:234:2: ( (lv_constantes_10_0= ruleConstantes ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_ID||LA7_0==RULE_STRING) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:235:1: (lv_constantes_10_0= ruleConstantes )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:235:1: (lv_constantes_10_0= ruleConstantes )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:236:3: lv_constantes_10_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleAlgoritmo435);
                            	    lv_constantes_10_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_10_0, 
                            	            		"Constantes");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:252:7: (otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:252:9: otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlgoritmo453); 

                        	newLeafNode(otherlv_11, grammarAccess.getAlgoritmoAccess().getTipoKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:256:1: ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING||LA11_0==52||LA11_0==57||LA11_0==59||LA11_0==61) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:256:2: ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:256:2: ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:257:1: (lv_tipocomplejo_12_0= ruleTipoComplejo )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:257:1: (lv_tipocomplejo_12_0= ruleTipoComplejo )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:258:3: lv_tipocomplejo_12_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo475);
                            lv_tipocomplejo_12_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_12_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:274:2: ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING||LA10_0==52||LA10_0==57||LA10_0==59||LA10_0==61) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:275:1: (lv_tipocomplejo_13_0= ruleTipoComplejo )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:275:1: (lv_tipocomplejo_13_0= ruleTipoComplejo )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:276:3: lv_tipocomplejo_13_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo496);
                            	    lv_tipocomplejo_13_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_13_0, 
                            	            		"TipoComplejo");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:292:7: (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:292:9: otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlgoritmo514); 

                        	newLeafNode(otherlv_14, grammarAccess.getAlgoritmoAccess().getVarKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:296:1: ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case 86:
                            {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==56) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA14_2 = input.LA(2);

                            if ( (LA14_2==56) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (LA14_3==56) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA14_4 = input.LA(2);

                            if ( (LA14_4==56) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 90:
                            {
                            int LA14_5 = input.LA(2);

                            if ( (LA14_5==56) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt14=1;
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:296:2: ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:296:2: ( (lv_global_15_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:297:1: (lv_global_15_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:297:1: (lv_global_15_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:298:3: lv_global_15_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_6_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleAlgoritmo536);
                            lv_global_15_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"global",
                                    		lv_global_15_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:314:2: ( (lv_global_16_0= ruleDeclaracion ) )*
                            loop13:
                            do {
                                int alt13=2;
                                switch ( input.LA(1) ) {
                                case 86:
                                    {
                                    int LA13_1 = input.LA(2);

                                    if ( (LA13_1==56) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA13_2 = input.LA(2);

                                    if ( (LA13_2==56) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA13_3 = input.LA(2);

                                    if ( (LA13_3==56) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA13_4 = input.LA(2);

                                    if ( (LA13_4==56) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 90:
                                    {
                                    int LA13_5 = input.LA(2);

                                    if ( (LA13_5==56) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt13=1;
                                    }
                                    break;

                                }

                                switch (alt13) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:315:1: (lv_global_16_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:315:1: (lv_global_16_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:316:3: lv_global_16_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_6_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleAlgoritmo557);
                            	    lv_global_16_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"global",
                            	            		lv_global_16_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:332:7: ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28||(LA17_0>=86 && LA17_0<=90)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:332:8: ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:332:8: ( (lv_funcion_17_0= ruleSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:333:1: (lv_funcion_17_0= ruleSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:333:1: (lv_funcion_17_0= ruleSubproceso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:334:3: lv_funcion_17_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleAlgoritmo584);
                    lv_funcion_17_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_17_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:350:2: ( (lv_funcion_18_0= ruleSubproceso ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==28||(LA16_0>=86 && LA16_0<=90)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:351:1: (lv_funcion_18_0= ruleSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:351:1: (lv_funcion_18_0= ruleSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:352:3: lv_funcion_18_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleAlgoritmo605);
                    	    lv_funcion_18_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_18_0, 
                    	            		"Subproceso");
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:368:5: ( (lv_tiene_19_0= ruleInicio ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:369:1: (lv_tiene_19_0= ruleInicio )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:369:1: (lv_tiene_19_0= ruleInicio )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:370:3: lv_tiene_19_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTieneInicioParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleAlgoritmo629);
            lv_tiene_19_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_19_0, 
                    		"Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAlgoritmo641); 

                	newLeafNode(otherlv_20, grammarAccess.getAlgoritmoAccess().getFin_algoritmoKeyword_9());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:398:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:399:2: (iv_ruleModulo= ruleModulo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:400:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModulo_in_entryRuleModulo677);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModulo687); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:407:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'fin_importa' (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' ) ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'fin_modulo' ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_exporta_constantes_8_0 = null;

        AntlrDatatypeRuleToken lv_exporta_constantes_9_0 = null;

        AntlrDatatypeRuleToken lv_exporta_tipos_11_0 = null;

        AntlrDatatypeRuleToken lv_exporta_tipos_12_0 = null;

        EObject lv_exporta_global_14_0 = null;

        EObject lv_exporta_global_15_0 = null;

        EObject lv_exporta_funciones_16_0 = null;

        EObject lv_exporta_funciones_17_0 = null;

        EObject lv_implementacion_19_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:410:28: ( (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'fin_importa' (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' ) ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'fin_modulo' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:411:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'fin_importa' (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' ) ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'fin_modulo' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:411:1: (otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'fin_importa' (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' ) ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'fin_modulo' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:411:3: otherlv_0= 'Modulo' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'importa' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'fin_importa' (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' ) ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'fin_modulo'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModulo724); 

                	newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getModuloKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:415:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:416:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:416:1: (lv_nombre_1_0= RULE_ID )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:417:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo741); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getModuloAccess().getNombreIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuloRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModulo758); 

                	newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getImportaKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:437:1: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:437:2: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:437:2: ( (otherlv_3= RULE_ID ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:438:1: (otherlv_3= RULE_ID )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:438:1: (otherlv_3= RULE_ID )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:439:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuloRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo779); 

                    		newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:450:2: ( (otherlv_4= RULE_ID ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:451:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:451:1: (otherlv_4= RULE_ID )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:452:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getModuloRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo799); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModulo814); 

                	newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getFin_importaKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:467:1: (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:467:3: otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta'
            {
            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModulo827); 

                	newLeafNode(otherlv_6, grammarAccess.getModuloAccess().getExportaKeyword_5_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:471:1: (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:471:3: otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )?
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModulo840); 

                        	newLeafNode(otherlv_7, grammarAccess.getModuloAccess().getConstKeyword_5_1_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:475:1: ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:475:2: ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:475:2: ( (lv_exporta_constantes_8_0= ruleEString ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:476:1: (lv_exporta_constantes_8_0= ruleEString )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:476:1: (lv_exporta_constantes_8_0= ruleEString )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:477:3: lv_exporta_constantes_8_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_5_1_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo862);
                            lv_exporta_constantes_8_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exporta_constantes",
                                    		lv_exporta_constantes_8_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:493:2: ( (lv_exporta_constantes_9_0= ruleEString ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:494:1: (lv_exporta_constantes_9_0= ruleEString )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:494:1: (lv_exporta_constantes_9_0= ruleEString )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:495:3: lv_exporta_constantes_9_0= ruleEString
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_5_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo883);
                            	    lv_exporta_constantes_9_0=ruleEString();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exporta_constantes",
                            	            		lv_exporta_constantes_9_0, 
                            	            		"EString");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:511:7: (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:511:9: otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )?
                    {
                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModulo901); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuloAccess().getTipoKeyword_5_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:515:1: ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID||LA24_0==RULE_STRING) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:515:2: ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:515:2: ( (lv_exporta_tipos_11_0= ruleEString ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:516:1: (lv_exporta_tipos_11_0= ruleEString )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:516:1: (lv_exporta_tipos_11_0= ruleEString )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:517:3: lv_exporta_tipos_11_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_5_2_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo923);
                            lv_exporta_tipos_11_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exporta_tipos",
                                    		lv_exporta_tipos_11_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:533:2: ( (lv_exporta_tipos_12_0= ruleEString ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:534:1: (lv_exporta_tipos_12_0= ruleEString )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:534:1: (lv_exporta_tipos_12_0= ruleEString )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:535:3: lv_exporta_tipos_12_0= ruleEString
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_5_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo944);
                            	    lv_exporta_tipos_12_0=ruleEString();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exporta_tipos",
                            	            		lv_exporta_tipos_12_0, 
                            	            		"EString");
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


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:551:7: (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:551:9: otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModulo962); 

                        	newLeafNode(otherlv_13, grammarAccess.getModuloAccess().getVarKeyword_5_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:555:1: ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case 86:
                            {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==56) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==56) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA27_3 = input.LA(2);

                            if ( (LA27_3==56) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA27_4 = input.LA(2);

                            if ( (LA27_4==56) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 90:
                            {
                            int LA27_5 = input.LA(2);

                            if ( (LA27_5==56) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:555:2: ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:555:2: ( (lv_exporta_global_14_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:556:1: (lv_exporta_global_14_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:556:1: (lv_exporta_global_14_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:557:3: lv_exporta_global_14_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalDeclaracionParserRuleCall_5_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleModulo984);
                            lv_exporta_global_14_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exporta_global",
                                    		lv_exporta_global_14_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:573:2: ( (lv_exporta_global_15_0= ruleDeclaracion ) )*
                            loop26:
                            do {
                                int alt26=2;
                                switch ( input.LA(1) ) {
                                case 86:
                                    {
                                    int LA26_2 = input.LA(2);

                                    if ( (LA26_2==56) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA26_3 = input.LA(2);

                                    if ( (LA26_3==56) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA26_4 = input.LA(2);

                                    if ( (LA26_4==56) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA26_5 = input.LA(2);

                                    if ( (LA26_5==56) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 90:
                                    {
                                    int LA26_6 = input.LA(2);

                                    if ( (LA26_6==56) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt26=1;
                                    }
                                    break;

                                }

                                switch (alt26) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:574:1: (lv_exporta_global_15_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:574:1: (lv_exporta_global_15_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:575:3: lv_exporta_global_15_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalDeclaracionParserRuleCall_5_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleModulo1005);
                            	    lv_exporta_global_15_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exporta_global",
                            	            		lv_exporta_global_15_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:591:7: ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28||(LA30_0>=86 && LA30_0<=90)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:591:8: ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:591:8: ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:592:1: (lv_exporta_funciones_16_0= ruleCabeceraSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:592:1: (lv_exporta_funciones_16_0= ruleCabeceraSubproceso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:593:3: lv_exporta_funciones_16_0= ruleCabeceraSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_5_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1032);
                    lv_exporta_funciones_16_0=ruleCabeceraSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	        }
                           		add(
                           			current, 
                           			"exporta_funciones",
                            		lv_exporta_funciones_16_0, 
                            		"CabeceraSubproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:609:2: ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28||(LA29_0>=86 && LA29_0<=90)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:610:1: (lv_exporta_funciones_17_0= ruleCabeceraSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:610:1: (lv_exporta_funciones_17_0= ruleCabeceraSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:611:3: lv_exporta_funciones_17_0= ruleCabeceraSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_5_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1053);
                    	    lv_exporta_funciones_17_0=ruleCabeceraSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_funciones",
                    	            		lv_exporta_funciones_17_0, 
                    	            		"CabeceraSubproceso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModulo1068); 

                	newLeafNode(otherlv_18, grammarAccess.getModuloAccess().getFin_exportaKeyword_5_5());
                

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:631:2: ( (lv_implementacion_19_0= ruleImplementacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:632:1: (lv_implementacion_19_0= ruleImplementacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:632:1: (lv_implementacion_19_0= ruleImplementacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:633:3: lv_implementacion_19_0= ruleImplementacion
            {
             
            	        newCompositeNode(grammarAccess.getModuloAccess().getImplementacionImplementacionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_ruleModulo1090);
            lv_implementacion_19_0=ruleImplementacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	        }
                   		set(
                   			current, 
                   			"implementacion",
                    		lv_implementacion_19_0, 
                    		"Implementacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_20=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleModulo1102); 

                	newLeafNode(otherlv_20, grammarAccess.getModuloAccess().getFin_moduloKeyword_7());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:661:1: entryRuleImplementacion returns [EObject current=null] : iv_ruleImplementacion= ruleImplementacion EOF ;
    public final EObject entryRuleImplementacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:662:2: (iv_ruleImplementacion= ruleImplementacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:663:2: iv_ruleImplementacion= ruleImplementacion EOF
            {
             newCompositeNode(grammarAccess.getImplementacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_entryRuleImplementacion1138);
            iv_ruleImplementacion=ruleImplementacion();

            state._fsp--;

             current =iv_ruleImplementacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementacion1148); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:670:1: ruleImplementacion returns [EObject current=null] : ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' ) ) ;
    public final EObject ruleImplementacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        EObject lv_constantes_3_0 = null;

        EObject lv_constantes_4_0 = null;

        EObject lv_tipocomplejo_6_0 = null;

        EObject lv_tipocomplejo_7_0 = null;

        EObject lv_global_9_0 = null;

        EObject lv_global_10_0 = null;

        EObject lv_funcion_11_0 = null;

        EObject lv_funcion_12_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:673:28: ( ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:674:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:674:1: ( () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:674:2: () (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:674:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplementacionAccess().getImplementacionAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:680:2: (otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:680:4: otherlv_1= 'implementacion' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'fin_implementacion'
            {
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleImplementacion1195); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementacionKeyword_1_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:684:1: (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:684:3: otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImplementacion1208); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplementacionAccess().getConstKeyword_1_1_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:688:1: ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID||LA32_0==RULE_STRING) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:688:2: ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:688:2: ( (lv_constantes_3_0= ruleConstantes ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:689:1: (lv_constantes_3_0= ruleConstantes )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:689:1: (lv_constantes_3_0= ruleConstantes )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:690:3: lv_constantes_3_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleImplementacion1230);
                            lv_constantes_3_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_3_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:706:2: ( (lv_constantes_4_0= ruleConstantes ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==RULE_ID||LA31_0==RULE_STRING) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:707:1: (lv_constantes_4_0= ruleConstantes )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:707:1: (lv_constantes_4_0= ruleConstantes )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:708:3: lv_constantes_4_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleImplementacion1251);
                            	    lv_constantes_4_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_4_0, 
                            	            		"Constantes");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:724:7: (otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:724:9: otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImplementacion1269); 

                        	newLeafNode(otherlv_5, grammarAccess.getImplementacionAccess().getTipoKeyword_1_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:728:1: ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==RULE_STRING||LA35_0==52||LA35_0==57||LA35_0==59||LA35_0==61) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:728:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:728:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:729:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:729:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:730:3: lv_tipocomplejo_6_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_1_2_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleImplementacion1291);
                            lv_tipocomplejo_6_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_6_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:746:2: ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_ID||LA34_0==RULE_STRING||LA34_0==52||LA34_0==57||LA34_0==59||LA34_0==61) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:747:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:747:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:748:3: lv_tipocomplejo_7_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_1_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleImplementacion1312);
                            	    lv_tipocomplejo_7_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_7_0, 
                            	            		"TipoComplejo");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:764:7: (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:764:9: otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleImplementacion1330); 

                        	newLeafNode(otherlv_8, grammarAccess.getImplementacionAccess().getVarKeyword_1_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:768:1: ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case 86:
                            {
                            int LA38_1 = input.LA(2);

                            if ( (LA38_1==56) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA38_2 = input.LA(2);

                            if ( (LA38_2==56) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA38_3 = input.LA(2);

                            if ( (LA38_3==56) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA38_4 = input.LA(2);

                            if ( (LA38_4==56) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 90:
                            {
                            int LA38_5 = input.LA(2);

                            if ( (LA38_5==56) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                            {
                            alt38=1;
                            }
                            break;
                    }

                    switch (alt38) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:768:2: ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:768:2: ( (lv_global_9_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:769:1: (lv_global_9_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:769:1: (lv_global_9_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:770:3: lv_global_9_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_1_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleImplementacion1352);
                            lv_global_9_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"global",
                                    		lv_global_9_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:786:2: ( (lv_global_10_0= ruleDeclaracion ) )*
                            loop37:
                            do {
                                int alt37=2;
                                switch ( input.LA(1) ) {
                                case 86:
                                    {
                                    int LA37_1 = input.LA(2);

                                    if ( (LA37_1==56) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA37_2 = input.LA(2);

                                    if ( (LA37_2==56) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA37_3 = input.LA(2);

                                    if ( (LA37_3==56) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA37_4 = input.LA(2);

                                    if ( (LA37_4==56) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 90:
                                    {
                                    int LA37_5 = input.LA(2);

                                    if ( (LA37_5==56) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt37=1;
                                    }
                                    break;

                                }

                                switch (alt37) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:787:1: (lv_global_10_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:787:1: (lv_global_10_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:788:3: lv_global_10_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_1_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleImplementacion1373);
                            	    lv_global_10_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"global",
                            	            		lv_global_10_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:804:7: ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28||(LA41_0>=86 && LA41_0<=90)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:804:8: ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:804:8: ( (lv_funcion_11_0= ruleSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:805:1: (lv_funcion_11_0= ruleSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:805:1: (lv_funcion_11_0= ruleSubproceso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:806:3: lv_funcion_11_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_1_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleImplementacion1400);
                    lv_funcion_11_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_11_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:822:2: ( (lv_funcion_12_0= ruleSubproceso ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==28||(LA40_0>=86 && LA40_0<=90)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:823:1: (lv_funcion_12_0= ruleSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:823:1: (lv_funcion_12_0= ruleSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:824:3: lv_funcion_12_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_1_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleImplementacion1421);
                    	    lv_funcion_12_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_12_0, 
                    	            		"Subproceso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleImplementacion1436); 

                	newLeafNode(otherlv_13, grammarAccess.getImplementacionAccess().getFin_implementacionKeyword_1_5());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:852:1: entryRuleCabeceraSubproceso returns [EObject current=null] : iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF ;
    public final EObject entryRuleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:853:2: (iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:854:2: iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF
            {
             newCompositeNode(grammarAccess.getCabeceraSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1473);
            iv_ruleCabeceraSubproceso=ruleCabeceraSubproceso();

            state._fsp--;

             current =iv_ruleCabeceraSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraSubproceso1483); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:861:1: ruleCabeceraSubproceso returns [EObject current=null] : (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) ;
    public final EObject ruleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_CabeceraProcedimiento_0 = null;

        EObject this_CabeceraFuncion_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:864:28: ( (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:865:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:865:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=86 && LA42_0<=90)) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:866:5: this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraProcedimientoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1530);
                    this_CabeceraProcedimiento_0=ruleCabeceraProcedimiento();

                    state._fsp--;

                     
                            current = this_CabeceraProcedimiento_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:876:5: this_CabeceraFuncion_1= ruleCabeceraFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraFuncionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1557);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:892:1: entryRuleCabeceraProcedimiento returns [EObject current=null] : iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF ;
    public final EObject entryRuleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:893:2: (iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:894:2: iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getCabeceraProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1592);
            iv_ruleCabeceraProcedimiento=ruleCabeceraProcedimiento();

            state._fsp--;

             current =iv_ruleCabeceraProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1602); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:901:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:904:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraProcedimiento1639); 

                	newLeafNode(otherlv_0, grammarAccess.getCabeceraProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:909:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:910:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:910:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:911:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraProcedimiento1656); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getCabeceraProcedimientoAccess().getNombreNOMBRE_FUNTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCabeceraProcedimientoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"NOMBRE_FUN");
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:927:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47||(LA44_0>=108 && LA44_0<=109)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:927:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:927:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:928:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:928:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:929:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1683);
                    lv_parametrofuncion_2_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_2_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:945:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==29) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:945:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraProcedimiento1696); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:949:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:950:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:950:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:951:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1717);
                    	    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_4_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraProcedimiento1733); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:979:1: entryRuleCabeceraFuncion returns [EObject current=null] : iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF ;
    public final EObject entryRuleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:980:2: (iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:981:2: iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF
            {
             newCompositeNode(grammarAccess.getCabeceraFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1769);
            iv_ruleCabeceraFuncion=ruleCabeceraFuncion();

            state._fsp--;

             current =iv_ruleCabeceraFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraFuncion1779); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:988:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:991:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:992:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:992:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:992:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:992:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:993:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:993:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:994:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1825);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCabeceraFuncion1837); 

                	newLeafNode(otherlv_1, grammarAccess.getCabeceraFuncionAccess().getFuncionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1014:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1015:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1015:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1016:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraFuncion1854); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getCabeceraFuncionAccess().getNombreNOMBRE_FUNTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCabeceraFuncionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"NOMBRE_FUN");
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1032:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47||(LA46_0>=108 && LA46_0<=109)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1032:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1032:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1033:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1033:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1034:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1881);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1050:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==29) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1050:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraFuncion1894); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1054:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1055:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1055:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1056:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1915);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_5_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraFuncion1931); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1084:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1085:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1086:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1967);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo1977); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1093:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1096:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1097:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1097:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt47=6;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1098:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo2024);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1108:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo2051);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1118:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo2078);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1128:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo2105);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1138:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo2132);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1148:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo2159);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1164:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1165:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1166:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso2194);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso2204); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1173:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1176:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1177:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1177:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=86 && LA48_0<=90)) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1178:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso2251);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1188:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso2278);
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


    // $ANTLR start "entryRuleComentario"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1204:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1205:2: (iv_ruleComentario= ruleComentario EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1206:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario2313);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario2323); 

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
    // $ANTLR end "entryRuleComentario"


    // $ANTLR start "ruleComentario"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1213:1: ruleComentario returns [EObject current=null] : ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token lv_mensaje_2_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1216:28: ( ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1217:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1217:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1217:2: () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1217:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComentarioAccess().getComentarioAction_0(),
                        current);
                

            }

            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleComentario2368); 
             
                newLeafNode(this_SL_COMMENT_1, grammarAccess.getComentarioAccess().getSL_COMMENTTerminalRuleCall_1()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1227:1: ( (lv_mensaje_2_0= RULE_COMENT ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1228:1: (lv_mensaje_2_0= RULE_COMENT )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1228:1: (lv_mensaje_2_0= RULE_COMENT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1229:3: lv_mensaje_2_0= RULE_COMENT
            {
            lv_mensaje_2_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario2384); 

            			newLeafNode(lv_mensaje_2_0, grammarAccess.getComentarioAccess().getMensajeCOMENTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComentarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mensaje",
                    		lv_mensaje_2_0, 
                    		"COMENT");
            	    

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
    // $ANTLR end "ruleComentario"


    // $ANTLR start "entryRuleSentencias"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1253:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1254:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1255:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias2425);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias2435); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1262:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1265:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1266:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1266:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt49=1;
                }
                break;
            case 70:
                {
                alt49=2;
                }
                break;
            case 71:
            case 74:
            case 77:
            case 79:
            case 83:
                {
                alt49=3;
                }
                break;
            case 32:
                {
                alt49=4;
                }
                break;
            case 34:
                {
                alt49=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt49=6;
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
                {
                alt49=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1267:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias2482);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1277:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias2509);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1287:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias2536);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1297:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2563);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1307:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2590);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1317:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias2617);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1327:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_ruleSentencias2644);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1343:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1344:2: (iv_ruleBloque= ruleBloque EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1345:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque2679);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque2689); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1352:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1355:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1356:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1356:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt50=1;
                }
                break;
            case 74:
                {
                alt50=2;
                }
                break;
            case 77:
                {
                alt50=3;
                }
                break;
            case 79:
                {
                alt50=4;
                }
                break;
            case 83:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1357:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque2736);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1367:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque2763);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1377:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque2790);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1387:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque2817);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1397:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque2844);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1413:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1414:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1415:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2879);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion2889); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1422:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1425:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1426:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1426:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=86 && LA51_0<=90)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID||LA51_0==RULE_STRING) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1427:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2936);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1437:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2963);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1453:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1454:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1455:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir2998);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3008); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1462:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
    public final EObject ruleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_variable_2_0 = null;

        AntlrDatatypeRuleToken lv_modo_4_0 = null;

        EObject lv_variable_6_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1465:28: ( (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1466:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1466:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1466:3: otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFuncionFicheroAbrir3045); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroAbrir3057); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1475:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1475:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1476:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3079);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3091); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1496:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1497:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1497:1: (lv_modo_4_0= ruleModoApertura )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1498:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3112);
            lv_modo_4_0=ruleModoApertura();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		set(
                   			current, 
                   			"modo",
                    		lv_modo_4_0, 
                    		"ModoApertura");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3124); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1518:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1519:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1519:1: (lv_variable_6_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1520:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3145);
            lv_variable_6_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroAbrirRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_6_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroAbrir3158); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionFicheroAbrirAccess().getRightParenthesisKeyword_3());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1548:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1549:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1550:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3194);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3204); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1557:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1560:28: ( (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1561:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1561:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1561:3: otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFuncionFicheroCerrar3241); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroCerrar3253); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1569:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1570:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1570:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1571:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3274);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionFicheroCerrarRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroCerrar3286); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroCerrarAccess().getRightParenthesisKeyword_3());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1599:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1600:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1601:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura3323);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura3334); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1608:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1611:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1612:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1612:1: (kw= 'escritura' | kw= 'lectura' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            else if ( (LA52_0==36) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1613:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleModoApertura3372); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1620:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleModoApertura3391); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1633:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1634:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1635:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3432);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna3443); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1642:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1645:28: ( (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1646:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1646:1: (kw= 'cos(' | kw= 'cuadrado(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'longitud(' | kw= 'concatena(' )
            int alt53=9;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt53=1;
                }
                break;
            case 38:
                {
                alt53=2;
                }
                break;
            case 39:
                {
                alt53=3;
                }
                break;
            case 40:
                {
                alt53=4;
                }
                break;
            case 41:
                {
                alt53=5;
                }
                break;
            case 42:
                {
                alt53=6;
                }
                break;
            case 43:
                {
                alt53=7;
                }
                break;
            case 44:
                {
                alt53=8;
                }
                break;
            case 45:
                {
                alt53=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1647:2: kw= 'cos('
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNombreInterna3481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1654:2: kw= 'cuadrado('
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNombreInterna3500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1661:2: kw= 'exp('
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNombreInterna3519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1668:2: kw= 'ln('
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNombreInterna3538); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1675:2: kw= 'log('
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNombreInterna3557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1682:2: kw= 'sen('
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNombreInterna3576); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1689:2: kw= 'sqrt('
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNombreInterna3595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1696:2: kw= 'longitud('
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNombreInterna3614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1703:2: kw= 'concatena('
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNombreInterna3633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getConcatenaKeyword_8()); 
                        

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1716:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1717:2: (iv_ruleEInt= ruleEInt EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1718:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3674);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3685); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1725:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1728:28: (this_INT_0= RULE_INT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1729:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3724); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1744:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1745:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1746:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3769);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3780); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1753:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1756:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1757:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1757:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1757:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3820); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat3838); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3853); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1777:1: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=47 && LA56_0<=48)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1777:2: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1777:2: (kw= 'E' | kw= 'e' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==47) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==48) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1778:2: kw= 'E'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEFloat3873); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1785:2: kw= 'e'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloat3892); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1790:2: (kw= '+' | kw= '-' )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==49) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==50) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1791:2: kw= '+'
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEFloat3907); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1798:2: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEFloat3926); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3943); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3_2()); 
                        

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


    // $ANTLR start "entryRuleCampoRegistro"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1818:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1819:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1820:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3990);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro4000); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1827:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1830:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1831:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1831:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1832:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1832:1: (lv_nombre_campo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1833:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro4045);
            lv_nombre_campo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCampoRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre_campo",
                    		lv_nombre_campo_0_0, 
                    		"EString");
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
    // $ANTLR end "ruleCampoRegistro"


    // $ANTLR start "entryRuleTipo"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1857:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1858:2: (iv_ruleTipo= ruleTipo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1859:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo4080);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo4090); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1866:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1869:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1870:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1870:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=86 && LA57_0<=90)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1871:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo4137);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1881:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo4164);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1897:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1898:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1899:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4199);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido4209); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1906:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1909:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1910:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1910:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1911:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1911:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1912:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido4254);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoDefinidoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1936:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1937:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1938:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4289);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente4299); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1945:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1948:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1949:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1949:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1950:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1950:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1951:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente4344);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTipoExistenteRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1975:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1976:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1977:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes4379);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes4389); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1984:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1987:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1988:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1988:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1988:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1988:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1989:1: (lv_variable_0_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1989:1: (lv_variable_0_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1990:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes4435);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleConstantes4447); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2010:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2011:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2011:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2012:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes4468);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantesRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2036:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2037:2: (iv_ruleVector= ruleVector EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2038:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector4504);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector4514); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2045:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2048:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2049:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2049:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2049:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVector4551); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVector4563); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2057:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2058:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2058:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2059:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector4584);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVector4596); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleVector4608); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2083:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2084:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2084:1: (lv_tipo_5_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2085:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector4629);
            lv_tipo_5_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_5_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleVector4641); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2105:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2106:1: (lv_nombre_7_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2106:1: (lv_nombre_7_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2107:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector4662);
            lv_nombre_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_7_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2131:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2132:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2133:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz4698);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz4708); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2140:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2143:28: ( (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2144:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2144:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2144:3: otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMatriz4745); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMatriz4757); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2152:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2153:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2153:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2154:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4778);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMatriz4790); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2174:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2175:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2175:1: (lv_valor_4_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2176:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4811);
            lv_valor_4_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMatriz4823); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMatriz4835); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2200:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2201:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2201:1: (lv_tipo_7_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2202:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4856);
            lv_tipo_7_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_7_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMatriz4868); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2222:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2223:1: (lv_nombre_9_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2223:1: (lv_nombre_9_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2224:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4889);
            lv_nombre_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMatrizRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_9_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2248:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2249:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2250:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4925);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4935); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2257:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2260:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2261:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2261:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2261:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRegistro4972); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2265:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2266:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2266:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2267:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro4993);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2283:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2283:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2283:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2284:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2284:1: (lv_variable_2_0= ruleDeclaracion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2285:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5015);
            lv_variable_2_0=ruleDeclaracion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Declaracion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2301:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==RULE_STRING||(LA58_0>=86 && LA58_0<=90)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2302:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2302:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2303:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5036);
            	    lv_variable_3_0=ruleDeclaracion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"Declaracion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleRegistro5050); 

                	newLeafNode(otherlv_4, grammarAccess.getRegistroAccess().getFin_registroKeyword_3());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2331:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2332:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2333:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo5086);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo5096); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2340:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2343:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2344:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2344:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2344:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleArchivo5133); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2348:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2349:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2349:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2350:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo5154);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleArchivo5166); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2370:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2371:1: (lv_nombre_3_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2371:1: (lv_nombre_3_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2372:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo5187);
            lv_nombre_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchivoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_3_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2396:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2397:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2398:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado5223);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado5233); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2405:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2408:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2409:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2409:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2409:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2409:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2410:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2410:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2411:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado5279);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEnumerado5291); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEnumerado5303); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2435:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2435:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2435:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2436:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2436:1: (lv_valor_3_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2437:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5325);
            lv_valor_3_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	        }
                   		add(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2453:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==29) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2453:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumerado5338); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2457:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2458:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2458:1: (lv_valor_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2459:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5359);
            	    lv_valor_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumeradoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"valor",
            	            		lv_valor_5_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEnumerado5374); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2487:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2488:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2489:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango5410);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango5420); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2496:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2499:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2500:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2500:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==51) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_ID||LA60_3==RULE_STRING) ) {
                        alt60=2;
                    }
                    else if ( (LA60_3==RULE_INT) ) {
                        alt60=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA60_0==RULE_ID) ) {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==51) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_ID||LA60_3==RULE_STRING) ) {
                        alt60=2;
                    }
                    else if ( (LA60_3==RULE_INT) ) {
                        alt60=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2501:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5467);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2511:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5494);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2527:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2528:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2529:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5529);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico5539); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2536:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2539:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2540:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2540:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2540:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2540:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2541:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2541:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2542:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico5585);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangoNumerico5597); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2562:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2562:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2562:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2563:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2563:1: (lv_limite_inf_2_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2564:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5619);
            lv_limite_inf_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleSubrangoNumerico5631); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2584:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2585:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2585:1: (lv_limite_sup_4_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2586:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5652);
            lv_limite_sup_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoNumericoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"EInt");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2610:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2611:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2612:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5689);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado5699); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2619:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2622:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2623:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2623:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2623:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2623:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2624:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2624:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2625:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5745);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangoEnumerado5757); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2645:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2645:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2645:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2646:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2646:1: (lv_limite_inf_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2647:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5779);
            lv_limite_inf_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_inf",
                    		lv_limite_inf_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleSubrangoEnumerado5791); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2667:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2668:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2668:1: (lv_limite_sup_4_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2669:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5812);
            lv_limite_sup_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubrangoEnumeradoRule());
            	        }
                   		set(
                   			current, 
                   			"limite_sup",
                    		lv_limite_sup_4_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2693:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2694:2: (iv_ruleInicio= ruleInicio EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2695:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio5849);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio5859); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2702:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_principal' ) ;
    public final EObject ruleInicio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_declaracion_3_0 = null;

        EObject lv_declaracion_4_0 = null;

        EObject lv_tiene_6_0 = null;

        EObject lv_tiene_7_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2705:28: ( (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_principal' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2706:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_principal' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2706:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_principal' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2706:3: otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_principal'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleInicio5896); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getPrincipalKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2710:1: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2711:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInicio5917); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2720:1: ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==RULE_STRING||(LA62_0>=86 && LA62_0<=90)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2720:2: ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2720:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2721:1: (lv_declaracion_3_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2721:1: (lv_declaracion_3_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2722:3: lv_declaracion_3_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5939);
                    lv_declaracion_3_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_3_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2738:2: ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID||LA61_0==RULE_STRING||(LA61_0>=86 && LA61_0<=90)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2739:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2739:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2740:3: lv_declaracion_4_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5960);
                    	    lv_declaracion_4_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_4_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleInicio5975); 

                	newLeafNode(otherlv_5, grammarAccess.getInicioAccess().getInicioKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2760:1: ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_ID && LA64_0<=RULE_NOMBRE_FUN)||LA64_0==RULE_STRING||LA64_0==32||LA64_0==34||(LA64_0>=37 && LA64_0<=45)||(LA64_0>=69 && LA64_0<=71)||LA64_0==74||LA64_0==77||LA64_0==79||LA64_0==83) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2760:2: ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2760:2: ( (lv_tiene_6_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2761:1: (lv_tiene_6_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2761:1: (lv_tiene_6_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2762:3: lv_tiene_6_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio5997);
                    lv_tiene_6_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	        }
                           		add(
                           			current, 
                           			"tiene",
                            		lv_tiene_6_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2778:2: ( (lv_tiene_7_0= ruleSentencias ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( ((LA63_0>=RULE_ID && LA63_0<=RULE_NOMBRE_FUN)||LA63_0==RULE_STRING||LA63_0==32||LA63_0==34||(LA63_0>=37 && LA63_0<=45)||(LA63_0>=69 && LA63_0<=71)||LA63_0==74||LA63_0==77||LA63_0==79||LA63_0==83) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2779:1: (lv_tiene_7_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2779:1: (lv_tiene_7_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2780:3: lv_tiene_7_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6018);
                    	    lv_tiene_7_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tiene",
                    	            		lv_tiene_7_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleInicio6033); 

                	newLeafNode(otherlv_8, grammarAccess.getInicioAccess().getFin_principalKeyword_6());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2808:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2809:2: (iv_ruleEString= ruleEString EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2810:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6070);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6081); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2817:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2820:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2821:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2821:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2821:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6121); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2829:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6147); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2844:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2845:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2846:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6192);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable6202); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2853:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2856:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2857:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2857:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2857:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2857:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2858:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2858:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2859:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6248);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleDeclaracionVariable6260); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2879:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2880:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2880:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2881:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6281);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2897:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==29) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2897:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionVariable6294); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2901:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2902:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2902:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2903:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6315);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionVariableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2927:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2928:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2929:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6353);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia6363); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2936:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2939:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2940:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2940:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2940:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2940:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2941:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2941:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2942:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia6409);
            lv_tipo_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleDeclaracionPropia6421); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2962:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2963:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2963:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2964:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6442);
            lv_variable_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2980:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==29) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2980:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionPropia6455); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2984:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2985:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2985:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2986:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6476);
            	    lv_variable_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclaracionPropiaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3010:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3011:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3012:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion6514);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion6524); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3019:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3022:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3023:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3023:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==68) ) {
                    alt68=1;
                }
                else if ( (LA68_1==46||LA68_1==53) ) {
                    alt68=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA68_0==RULE_ID) ) {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==46||LA68_2==53) ) {
                    alt68=2;
                }
                else if ( (LA68_2==68) ) {
                    alt68=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3024:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6571);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3034:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6598);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3050:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3051:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3052:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6633);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal6643); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3059:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3062:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3063:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3063:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3063:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3063:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3064:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3064:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3065:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal6689);
            lv_valor_asignacion_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"valor_asignacion",
                    		lv_valor_asignacion_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAsignacionNormal6701); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3085:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3086:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3086:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3087:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionNormal6722);
            lv_operador_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"operacion");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3111:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3112:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3113:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6758);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6768); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3120:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3123:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3124:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3124:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3124:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3124:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3125:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3125:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3126:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6814);
            lv_valor_asignacion_0_0=ruleVariablesComplejas();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"valor_asignacion",
                    		lv_valor_asignacion_0_0, 
                    		"VariablesComplejas");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAsignacionCompleja6826); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3146:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3147:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3147:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3148:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6847);
            lv_operador_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"operacion");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3172:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3173:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3174:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6883);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6893); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3181:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operador_1_0 = null;

        EObject lv_operador_3_0 = null;

        EObject lv_operador_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3184:28: ( (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3185:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3185:1: (otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3185:3: otherlv_0= 'escribir(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEscribir6930); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3189:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3190:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3190:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3191:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6951);
            lv_operador_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_1_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3207:2: ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==29) ) {
                    alt69=1;
                }
                else if ( ((LA69_0>=RULE_ID && LA69_0<=RULE_NOMBRE_FUN)||(LA69_0>=RULE_INT && LA69_0<=RULE_CAR)||LA69_0==33||(LA69_0>=37 && LA69_0<=45)||(LA69_0>=102 && LA69_0<=103)||(LA69_0>=110 && LA69_0<=111)) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3207:3: (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3207:3: (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3207:5: otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEscribir6965); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEscribirAccess().getCommaKeyword_2_0_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3211:1: ( (lv_operador_3_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3212:1: (lv_operador_3_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3212:1: (lv_operador_3_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3213:3: lv_operador_3_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6986);
            	    lv_operador_3_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_3_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3230:6: ( (lv_operador_4_0= ruleoperacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3230:6: ( (lv_operador_4_0= ruleoperacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3231:1: (lv_operador_4_0= ruleoperacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3231:1: (lv_operador_4_0= ruleoperacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3232:3: lv_operador_4_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir7014);
            	    lv_operador_4_0=ruleoperacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_4_0, 
            	            		"operacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEscribir7028); 

                	newLeafNode(otherlv_5, grammarAccess.getEscribirAccess().getRightParenthesisKeyword_3());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3260:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3261:2: (iv_ruleLeer= ruleLeer EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3262:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer7064);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer7074); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3269:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3272:28: ( (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3273:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3273:1: (otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3273:3: otherlv_0= 'leer(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleLeer7111); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3277:1: ( (lv_variable_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3278:1: (lv_variable_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3278:1: (lv_variable_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3279:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer7132);
            lv_variable_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		add(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3295:2: (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==29) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3295:4: otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLeer7145); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeerAccess().getCommaKeyword_2_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3299:1: ( (lv_variable_3_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3300:1: (lv_variable_3_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3300:1: (lv_variable_3_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3301:3: lv_variable_3_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer7166);
            	    lv_variable_3_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variable",
            	            		lv_variable_3_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeer7180); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3329:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3330:2: (iv_ruleSi= ruleSi EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3331:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi7216);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi7226); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3338:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'entonces' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) ;
    public final EObject ruleSi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_valor_2_0 = null;

        EObject lv_sentencias_5_0 = null;

        EObject lv_sentencias_6_0 = null;

        EObject lv_devuelve_7_0 = null;

        EObject lv_sino_8_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3341:28: ( (otherlv_0= 'si' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'entonces' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3342:1: (otherlv_0= 'si' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'entonces' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3342:1: (otherlv_0= 'si' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'entonces' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3342:3: otherlv_0= 'si' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'entonces' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'fin_si'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSi7263); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSi7275); 

                	newLeafNode(otherlv_1, grammarAccess.getSiAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3350:1: ( (lv_valor_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3351:1: (lv_valor_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3351:1: (lv_valor_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3352:3: lv_valor_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleSi7296);
            lv_valor_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSi7308); 

                	newLeafNode(otherlv_3, grammarAccess.getSiAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSi7320); 

                	newLeafNode(otherlv_4, grammarAccess.getSiAccess().getEntoncesKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3376:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_ID && LA72_0<=RULE_NOMBRE_FUN)||LA72_0==RULE_STRING||LA72_0==32||LA72_0==34||(LA72_0>=37 && LA72_0<=45)||(LA72_0>=69 && LA72_0<=71)||LA72_0==74||LA72_0==77||LA72_0==79||LA72_0==83) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3376:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3376:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3377:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3377:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3378:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7342);
                    lv_sentencias_5_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_5_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3394:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_NOMBRE_FUN)||LA71_0==RULE_STRING||LA71_0==32||LA71_0==34||(LA71_0>=37 && LA71_0<=45)||(LA71_0>=69 && LA71_0<=71)||LA71_0==74||LA71_0==77||LA71_0==79||LA71_0==83) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3395:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3395:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3396:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7363);
                    	    lv_sentencias_6_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_6_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3412:5: ( (lv_devuelve_7_0= ruleDevolver ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==105) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3413:1: (lv_devuelve_7_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3413:1: (lv_devuelve_7_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3414:3: lv_devuelve_7_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi7387);
                    lv_devuelve_7_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_7_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3430:3: ( (lv_sino_8_0= ruleSino ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==104) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3431:1: (lv_sino_8_0= ruleSino )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3431:1: (lv_sino_8_0= ruleSino )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3432:3: lv_sino_8_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi7409);
                    lv_sino_8_0=ruleSino();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"sino",
                            		lv_sino_8_0, 
                            		"Sino");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleSi7422); 

                	newLeafNode(otherlv_9, grammarAccess.getSiAccess().getFin_siKeyword_8());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3460:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3461:2: (iv_rulemientras= rulemientras EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3462:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras7458);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras7468); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3469:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_mientras' ) ;
    public final EObject rulemientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_valor_2_0 = null;

        EObject lv_sentencias_5_0 = null;

        EObject lv_sentencias_6_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3472:28: ( (otherlv_0= 'mientras' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_mientras' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3473:1: (otherlv_0= 'mientras' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_mientras' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3473:1: (otherlv_0= 'mientras' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_mientras' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3473:3: otherlv_0= 'mientras' otherlv_1= '(' ( (lv_valor_2_0= ruleoperacion ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulemientras7505); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulemientras7517); 

                	newLeafNode(otherlv_1, grammarAccess.getMientrasAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3481:1: ( (lv_valor_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3482:1: (lv_valor_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3482:1: (lv_valor_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3483:3: lv_valor_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulemientras7538);
            lv_valor_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemientras7550); 

                	newLeafNode(otherlv_3, grammarAccess.getMientrasAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulemientras7562); 

                	newLeafNode(otherlv_4, grammarAccess.getMientrasAccess().getHacerKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3507:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=RULE_ID && LA76_0<=RULE_NOMBRE_FUN)||LA76_0==RULE_STRING||LA76_0==32||LA76_0==34||(LA76_0>=37 && LA76_0<=45)||(LA76_0>=69 && LA76_0<=71)||LA76_0==74||LA76_0==77||LA76_0==79||LA76_0==83) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3507:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3507:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3508:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3508:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3509:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7584);
                    lv_sentencias_5_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_5_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3525:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_NOMBRE_FUN)||LA75_0==RULE_STRING||LA75_0==32||LA75_0==34||(LA75_0>=37 && LA75_0<=45)||(LA75_0>=69 && LA75_0<=71)||LA75_0==74||LA75_0==77||LA75_0==79||LA75_0==83) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3526:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3526:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3527:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7605);
                    	    lv_sentencias_6_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_6_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulemientras7620); 

                	newLeafNode(otherlv_7, grammarAccess.getMientrasAccess().getFin_mientrasKeyword_6());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3555:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3556:2: (iv_rulerepetir= rulerepetir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3557:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir7656);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir7666); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3564:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' otherlv_4= '(' ( (lv_valor_5_0= ruleoperacion ) ) otherlv_6= ')' ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3567:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' otherlv_4= '(' ( (lv_valor_5_0= ruleoperacion ) ) otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3568:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' otherlv_4= '(' ( (lv_valor_5_0= ruleoperacion ) ) otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3568:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' otherlv_4= '(' ( (lv_valor_5_0= ruleoperacion ) ) otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3568:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' otherlv_4= '(' ( (lv_valor_5_0= ruleoperacion ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulerepetir7703); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3572:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_ID && LA78_0<=RULE_NOMBRE_FUN)||LA78_0==RULE_STRING||LA78_0==32||LA78_0==34||(LA78_0>=37 && LA78_0<=45)||(LA78_0>=69 && LA78_0<=71)||LA78_0==74||LA78_0==77||LA78_0==79||LA78_0==83) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3572:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3572:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3573:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3573:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3574:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7725);
                    lv_sentencias_1_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_1_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3590:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=RULE_ID && LA77_0<=RULE_NOMBRE_FUN)||LA77_0==RULE_STRING||LA77_0==32||LA77_0==34||(LA77_0>=37 && LA77_0<=45)||(LA77_0>=69 && LA77_0<=71)||LA77_0==74||LA77_0==77||LA77_0==79||LA77_0==83) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3591:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3591:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3592:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7746);
                    	    lv_sentencias_2_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRepetirRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_2_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulerepetir7761); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulerepetir7773); 

                	newLeafNode(otherlv_4, grammarAccess.getRepetirAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3616:1: ( (lv_valor_5_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3617:1: (lv_valor_5_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3617:1: (lv_valor_5_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3618:3: lv_valor_5_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulerepetir7794);
            lv_valor_5_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_5_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulerepetir7806); 

                	newLeafNode(otherlv_6, grammarAccess.getRepetirAccess().getRightParenthesisKeyword_5());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3646:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3647:2: (iv_ruledesde= ruledesde EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3648:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7842);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7852); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3655:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
    public final EObject ruledesde() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_asignacion_1_0 = null;

        EObject lv_valor_3_0 = null;

        EObject lv_sentencias_5_0 = null;

        EObject lv_sentencias_6_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3658:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3659:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3659:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3659:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruledesde7889); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3663:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3664:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3664:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3665:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde7910);
            lv_asignacion_1_0=ruleAsignacionNormal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"asignacion",
                    		lv_asignacion_1_0, 
                    		"AsignacionNormal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruledesde7922); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3685:1: ( (lv_valor_3_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3686:1: (lv_valor_3_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3686:1: (lv_valor_3_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3687:3: lv_valor_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruledesde7943);
            lv_valor_3_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruledesde7955); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3707:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=RULE_ID && LA80_0<=RULE_NOMBRE_FUN)||LA80_0==RULE_STRING||LA80_0==32||LA80_0==34||(LA80_0>=37 && LA80_0<=45)||(LA80_0>=69 && LA80_0<=71)||LA80_0==74||LA80_0==77||LA80_0==79||LA80_0==83) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3707:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3707:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3708:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3708:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3709:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7977);
                    lv_sentencias_5_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_5_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3725:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_NOMBRE_FUN)||LA79_0==RULE_STRING||LA79_0==32||LA79_0==34||(LA79_0>=37 && LA79_0<=45)||(LA79_0>=69 && LA79_0<=71)||LA79_0==74||LA79_0==77||LA79_0==79||LA79_0==83) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3726:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3726:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3727:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7998);
                    	    lv_sentencias_6_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDesdeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_6_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruledesde8013); 

                	newLeafNode(otherlv_7, grammarAccess.getDesdeAccess().getFin_desdeKeyword_6());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3755:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3756:2: (iv_ruleCaso= ruleCaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3757:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso8049);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso8059); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3764:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operador_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;

        EObject lv_devuelve_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3767:28: ( (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3768:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3768:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3768:3: otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleCaso8096); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3772:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3773:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3773:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3774:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso8117);
            lv_operador_1_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCasoRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_1_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCaso8129); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3794:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_NOMBRE_FUN)||LA82_0==RULE_STRING||LA82_0==32||LA82_0==34||(LA82_0>=37 && LA82_0<=45)||(LA82_0>=69 && LA82_0<=71)||LA82_0==74||LA82_0==77||LA82_0==79||LA82_0==83) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3794:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3794:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3795:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3795:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3796:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8151);
                    lv_sentencias_3_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_3_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3812:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=RULE_ID && LA81_0<=RULE_NOMBRE_FUN)||LA81_0==RULE_STRING||LA81_0==32||LA81_0==34||(LA81_0>=37 && LA81_0<=45)||(LA81_0>=69 && LA81_0<=71)||LA81_0==74||LA81_0==77||LA81_0==79||LA81_0==83) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3813:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3813:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3814:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8172);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_4_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3830:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==105) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3831:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3831:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3832:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso8196);
                    lv_devuelve_5_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_5_0, 
                            		"Devolver");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3856:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3857:2: (iv_rulesegun= rulesegun EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3858:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun8233);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun8243); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3865:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
    public final EObject rulesegun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        EObject lv_valor_2_0 = null;

        EObject lv_caso_5_0 = null;

        EObject lv_caso_6_0 = null;

        EObject lv_sentencias_8_0 = null;

        EObject lv_sentencias_9_0 = null;

        EObject lv_devuelve_10_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3868:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3869:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3869:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3869:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesegun8280); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulesegun8292); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3877:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3878:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3878:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3879:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_rulesegun8313);
            lv_valor_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulesegun8325); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulesegun8337); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3903:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==82) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3903:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3903:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3904:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3904:1: (lv_caso_5_0= ruleCaso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3905:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8359);
                    lv_caso_5_0=ruleCaso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"caso",
                            		lv_caso_5_0, 
                            		"Caso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==82) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3922:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3922:1: (lv_caso_6_0= ruleCaso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3923:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8380);
                    	    lv_caso_6_0=ruleCaso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"caso",
                    	            		lv_caso_6_0, 
                    	            		"Caso");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesegun8395); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3943:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=RULE_ID && LA87_0<=RULE_NOMBRE_FUN)||LA87_0==RULE_STRING||LA87_0==32||LA87_0==34||(LA87_0>=37 && LA87_0<=45)||(LA87_0>=69 && LA87_0<=71)||LA87_0==74||LA87_0==77||LA87_0==79||LA87_0==83) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3943:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3943:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3944:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3944:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3945:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8417);
                    lv_sentencias_8_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_8_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3961:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_NOMBRE_FUN)||LA86_0==RULE_STRING||LA86_0==32||LA86_0==34||(LA86_0>=37 && LA86_0<=45)||(LA86_0>=69 && LA86_0<=71)||LA86_0==74||LA86_0==77||LA86_0==79||LA86_0==83) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3962:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3962:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3963:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8438);
                    	    lv_sentencias_9_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_9_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3979:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==105) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3980:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3980:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3981:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun8462);
                    lv_devuelve_10_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_10_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesegun8475); 

                	newLeafNode(otherlv_11, grammarAccess.getSegunAccess().getFin_segunKeyword_9());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4009:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4010:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4011:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8512);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable8523); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4021:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4022:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4022:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt89=5;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt89=1;
                }
                break;
            case 87:
                {
                alt89=2;
                }
                break;
            case 88:
                {
                alt89=3;
                }
                break;
            case 89:
                {
                alt89=4;
                }
                break;
            case 90:
                {
                alt89=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4023:2: kw= 'entero'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleTipoVariable8561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4030:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleTipoVariable8580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4037:2: kw= 'real'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleTipoVariable8599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4044:2: kw= 'logico'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleTipoVariable8618); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4051:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleTipoVariable8637); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4064:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4065:2: (iv_ruleVariable= ruleVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4066:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable8677);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable8687); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4073:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4076:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4077:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4077:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4077:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4077:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4078:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4083:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4084:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4084:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4085:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8742);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4111:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4112:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4113:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr8781);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr8792); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4120:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'o' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4123:28: (kw= 'o' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4125:2: kw= 'o'
            {
            kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulesignoOr8829); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4138:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4139:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4140:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd8869);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd8880); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4147:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'y' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4150:28: (kw= 'y' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4152:2: kw= 'y'
            {
            kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_rulesignoAnd8917); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4165:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4166:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4167:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8957);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad8968); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4174:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4177:28: ( (kw= '=' | kw= '!=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4178:1: (kw= '=' | kw= '!=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4178:1: (kw= '=' | kw= '!=' )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==51) ) {
                alt90=1;
            }
            else if ( (LA90_0==93) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4179:2: kw= '='
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulesignoIgualdad9006); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4186:2: kw= '!='
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulesignoIgualdad9025); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4199:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4200:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4201:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9066);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion9077); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4208:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4211:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4212:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4212:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt91=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt91=1;
                }
                break;
            case 95:
                {
                alt91=2;
                }
                break;
            case 96:
                {
                alt91=3;
                }
                break;
            case 97:
                {
                alt91=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4213:2: kw= '<'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_94_in_rulesignoComparacion9115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4220:2: kw= '>'
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_95_in_rulesignoComparacion9134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4227:2: kw= '>='
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_rulesignoComparacion9153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4234:2: kw= '<='
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_rulesignoComparacion9172); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4247:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4248:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4249:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma9213);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma9224); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4256:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4259:28: (kw= '+' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4261:2: kw= '+'
            {
            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulesignoSuma9261); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4274:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4275:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4276:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta9301);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta9312); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4283:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4286:28: (kw= '-' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4288:2: kw= '-'
            {
            kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulesignoResta9349); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4301:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4302:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4303:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9389);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion9400); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4310:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4313:28: (kw= '*' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4315:2: kw= '*'
            {
            kw=(Token)match(input,98,FollowSets000.FOLLOW_98_in_rulesignoMultiplicacion9437); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4328:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4329:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4330:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision9477);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision9488); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4337:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4340:28: (kw= '/' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4342:2: kw= '/'
            {
            kw=(Token)match(input,99,FollowSets000.FOLLOW_99_in_rulesignoDivision9525); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4355:1: entryRulesignoModulo returns [String current=null] : iv_rulesignoModulo= rulesignoModulo EOF ;
    public final String entryRulesignoModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4356:2: (iv_rulesignoModulo= rulesignoModulo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4357:2: iv_rulesignoModulo= rulesignoModulo EOF
            {
             newCompositeNode(grammarAccess.getSignoModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_entryRulesignoModulo9565);
            iv_rulesignoModulo=rulesignoModulo();

            state._fsp--;

             current =iv_rulesignoModulo.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoModulo9576); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4364:1: rulesignoModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken rulesignoModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4367:28: (kw= 'mod' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4369:2: kw= 'mod'
            {
            kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_rulesignoModulo9613); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4382:1: entryRulesignoDiv returns [String current=null] : iv_rulesignoDiv= rulesignoDiv EOF ;
    public final String entryRulesignoDiv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDiv = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4383:2: (iv_rulesignoDiv= rulesignoDiv EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4384:2: iv_rulesignoDiv= rulesignoDiv EOF
            {
             newCompositeNode(grammarAccess.getSignoDivRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_entryRulesignoDiv9653);
            iv_rulesignoDiv=rulesignoDiv();

            state._fsp--;

             current =iv_rulesignoDiv.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDiv9664); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4391:1: rulesignoDiv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken rulesignoDiv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4394:28: (kw= 'div' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4396:2: kw= 'div'
            {
            kw=(Token)match(input,101,FollowSets000.FOLLOW_101_in_rulesignoDiv9701); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4409:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4411:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion9740);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion9750); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4418:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4421:28: (this_Or_0= ruleOr )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4423:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion9796);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4439:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4440:2: (iv_ruleOr= ruleOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4441:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr9830);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr9840); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4448:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4451:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4452:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4452:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4453:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9887);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4461:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==91) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4461:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4461:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4462:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4467:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4468:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4468:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4469:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr9917);
            	    lv_signo_op_2_0=rulesignoOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoOr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4485:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4486:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4486:1: (lv_right_3_0= ruleAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4487:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9938);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4511:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4512:2: (iv_ruleAnd= ruleAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4513:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd9976);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd9986); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4520:1: ruleAnd returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Mod_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4523:28: ( (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4524:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4524:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4525:5: this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getModParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd10033);
            this_Mod_0=ruleMod();

            state._fsp--;

             
                    current = this_Mod_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4533:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==92) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4533:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4533:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4534:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4539:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4540:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4540:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4541:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd10063);
            	    lv_signo_op_2_0=rulesignoAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4557:2: ( (lv_right_3_0= ruleMod ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4558:1: (lv_right_3_0= ruleMod )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4558:1: (lv_right_3_0= ruleMod )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4559:3: lv_right_3_0= ruleMod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightModParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd10084);
            	    lv_right_3_0=ruleMod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Mod");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleMod"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4583:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4584:2: (iv_ruleMod= ruleMod EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4585:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_entryRuleMod10122);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMod10132); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4592:1: ruleMod returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4595:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4596:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4596:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4597:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod10179);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4605:1: ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==100) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4605:2: () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4605:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4606:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getModAccess().getModLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4611:2: ( (lv_signo_op_2_0= rulesignoModulo ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4612:1: (lv_signo_op_2_0= rulesignoModulo )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4612:1: (lv_signo_op_2_0= rulesignoModulo )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4613:3: lv_signo_op_2_0= rulesignoModulo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getSigno_opSignoModuloParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_ruleMod10209);
            	    lv_signo_op_2_0=rulesignoModulo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoModulo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4629:2: ( (lv_right_3_0= ruleIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4630:1: (lv_right_3_0= ruleIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4630:1: (lv_right_3_0= ruleIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4631:3: lv_right_3_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getRightIgualdadParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod10230);
            	    lv_right_3_0=ruleIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Igualdad");
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
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleIgualdad"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4655:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4656:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4657:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad10268);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad10278); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4664:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4668:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4668:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4669:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10325);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4677:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==51||LA95_0==93) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4677:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4677:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4678:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4683:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4684:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4684:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4685:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad10355);
            	    lv_signo_op_2_0=rulesignoIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoIgualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4701:2: ( (lv_right_3_0= ruleComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4702:1: (lv_right_3_0= ruleComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4702:1: (lv_right_3_0= ruleComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4703:3: lv_right_3_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10376);
            	    lv_right_3_0=ruleComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparacion");
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
    // $ANTLR end "ruleIgualdad"


    // $ANTLR start "entryRuleComparacion"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4727:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4728:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4729:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion10414);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion10424); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4736:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4739:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4740:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4740:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4741:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10471);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4749:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=94 && LA96_0<=97)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4749:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4749:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4750:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4755:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4756:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4756:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4757:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion10501);
            	    lv_signo_op_2_0=rulesignoComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoComparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4773:2: ( (lv_right_3_0= ruleSumaResta ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4774:1: (lv_right_3_0= ruleSumaResta )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4774:1: (lv_right_3_0= ruleSumaResta )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4775:3: lv_right_3_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10522);
            	    lv_right_3_0=ruleSumaResta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SumaResta");
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
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleSumaResta"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4799:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4800:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4801:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta10560);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta10570); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4808:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4811:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4812:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4812:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4813:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10617);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=49 && LA98_0<=50)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==49) ) {
            	        alt97=1;
            	    }
            	    else if ( (LA97_0==50) ) {
            	        alt97=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 97, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4821:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4822:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4827:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4828:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4828:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4829:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta10649);
            	            lv_signo_op_2_0=rulesignoSuma();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoSuma");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4846:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4846:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4846:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4846:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4847:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4852:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4853:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4853:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4854:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta10687);
            	            lv_signo_op_4_0=rulesignoResta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoResta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4870:4: ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4871:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4871:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4872:3: lv_right_5_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10710);
            	    lv_right_5_0=ruleMultiplicacionDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultiplicacionDivision");
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
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4896:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4897:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4898:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10748);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision10758); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4905:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4908:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4909:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4909:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4910:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10805);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=98 && LA100_0<=99)||LA100_0==101) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimaria ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt99=3;
            	    switch ( input.LA(1) ) {
            	    case 98:
            	        {
            	        alt99=1;
            	        }
            	        break;
            	    case 99:
            	        {
            	        alt99=2;
            	        }
            	        break;
            	    case 101:
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4919:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4924:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4925:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4925:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4926:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10837);
            	            lv_signo_op_2_0=rulesignoMultiplicacion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoMultiplicacion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4943:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4943:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4943:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4943:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4944:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4949:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4950:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4950:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4951:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10875);
            	            lv_signo_op_4_0=rulesignoDivision();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoDivision");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4968:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4968:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4968:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4968:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4969:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4974:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4975:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4975:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4976:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivision10913);
            	            lv_signo_op_6_0=rulesignoDiv();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_6_0, 
            	                    		"signoDiv");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4992:4: ( (lv_right_7_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4993:1: (lv_right_7_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4993:1: (lv_right_7_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4994:3: lv_right_7_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10936);
            	    lv_right_7_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"Primaria");
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRuleoperacionIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5018:1: entryRuleoperacionIndice returns [EObject current=null] : iv_ruleoperacionIndice= ruleoperacionIndice EOF ;
    public final EObject entryRuleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5019:2: (iv_ruleoperacionIndice= ruleoperacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5020:2: iv_ruleoperacionIndice= ruleoperacionIndice EOF
            {
             newCompositeNode(grammarAccess.getOperacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10974);
            iv_ruleoperacionIndice=ruleoperacionIndice();

            state._fsp--;

             current =iv_ruleoperacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacionIndice10984); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5027:1: ruleoperacionIndice returns [EObject current=null] : this_OrIndice_0= ruleOrIndice ;
    public final EObject ruleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_OrIndice_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5030:28: (this_OrIndice_0= ruleOrIndice )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5032:5: this_OrIndice_0= ruleOrIndice
            {
             
                    newCompositeNode(grammarAccess.getOperacionIndiceAccess().getOrIndiceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_ruleoperacionIndice11030);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5048:1: entryRuleOrIndice returns [EObject current=null] : iv_ruleOrIndice= ruleOrIndice EOF ;
    public final EObject entryRuleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5049:2: (iv_ruleOrIndice= ruleOrIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:2: iv_ruleOrIndice= ruleOrIndice EOF
            {
             newCompositeNode(grammarAccess.getOrIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_entryRuleOrIndice11064);
            iv_ruleOrIndice=ruleOrIndice();

            state._fsp--;

             current =iv_ruleOrIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrIndice11074); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5057:1: ruleOrIndice returns [EObject current=null] : (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) ;
    public final EObject ruleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject this_AndIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5060:28: ( (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5061:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5061:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5062:5: this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrIndiceAccess().getAndIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice11121);
            this_AndIndice_0=ruleAndIndice();

            state._fsp--;

             
                    current = this_AndIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5070:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==91) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5070:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5070:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5071:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrIndiceAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5076:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5077:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5077:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5078:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOrIndice11151);
            	    lv_signo_op_2_0=rulesignoOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoOr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5094:2: ( (lv_right_3_0= ruleAndIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5095:1: (lv_right_3_0= ruleAndIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5095:1: (lv_right_3_0= ruleAndIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5096:3: lv_right_3_0= ruleAndIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getRightAndIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice11172);
            	    lv_right_3_0=ruleAndIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndIndice");
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
    // $ANTLR end "ruleOrIndice"


    // $ANTLR start "entryRuleAndIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5120:1: entryRuleAndIndice returns [EObject current=null] : iv_ruleAndIndice= ruleAndIndice EOF ;
    public final EObject entryRuleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5121:2: (iv_ruleAndIndice= ruleAndIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5122:2: iv_ruleAndIndice= ruleAndIndice EOF
            {
             newCompositeNode(grammarAccess.getAndIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_entryRuleAndIndice11210);
            iv_ruleAndIndice=ruleAndIndice();

            state._fsp--;

             current =iv_ruleAndIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndIndice11220); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5129:1: ruleAndIndice returns [EObject current=null] : (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) ;
    public final EObject ruleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject this_IgualdadIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5132:28: ( (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5133:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5133:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5134:5: this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndIndiceAccess().getIgualdadIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11267);
            this_IgualdadIndice_0=ruleIgualdadIndice();

            state._fsp--;

             
                    current = this_IgualdadIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5142:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==92) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5142:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5142:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5143:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndIndiceAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5148:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5149:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5149:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5150:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAndIndice11297);
            	    lv_signo_op_2_0=rulesignoAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoAnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5166:2: ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5167:1: (lv_right_3_0= ruleIgualdadIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5167:1: (lv_right_3_0= ruleIgualdadIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5168:3: lv_right_3_0= ruleIgualdadIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getRightIgualdadIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11318);
            	    lv_right_3_0=ruleIgualdadIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"IgualdadIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop102;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5192:1: entryRuleIgualdadIndice returns [EObject current=null] : iv_ruleIgualdadIndice= ruleIgualdadIndice EOF ;
    public final EObject entryRuleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdadIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5193:2: (iv_ruleIgualdadIndice= ruleIgualdadIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5194:2: iv_ruleIgualdadIndice= ruleIgualdadIndice EOF
            {
             newCompositeNode(grammarAccess.getIgualdadIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11356);
            iv_ruleIgualdadIndice=ruleIgualdadIndice();

            state._fsp--;

             current =iv_ruleIgualdadIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdadIndice11366); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5201:1: ruleIgualdadIndice returns [EObject current=null] : (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) ;
    public final EObject ruleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject this_ComparacionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5204:28: ( (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5205:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5205:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5206:5: this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getComparacionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11413);
            this_ComparacionIndice_0=ruleComparacionIndice();

            state._fsp--;

             
                    current = this_ComparacionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5214:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==51||LA103_0==93) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5214:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5214:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5215:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadIndiceAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5220:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5221:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5221:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5222:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11443);
            	    lv_signo_op_2_0=rulesignoIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoIgualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5238:2: ( (lv_right_3_0= ruleComparacionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5239:1: (lv_right_3_0= ruleComparacionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5239:1: (lv_right_3_0= ruleComparacionIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5240:3: lv_right_3_0= ruleComparacionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getRightComparacionIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11464);
            	    lv_right_3_0=ruleComparacionIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ComparacionIndice");
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
    // $ANTLR end "ruleIgualdadIndice"


    // $ANTLR start "entryRuleComparacionIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5264:1: entryRuleComparacionIndice returns [EObject current=null] : iv_ruleComparacionIndice= ruleComparacionIndice EOF ;
    public final EObject entryRuleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5265:2: (iv_ruleComparacionIndice= ruleComparacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5266:2: iv_ruleComparacionIndice= ruleComparacionIndice EOF
            {
             newCompositeNode(grammarAccess.getComparacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11502);
            iv_ruleComparacionIndice=ruleComparacionIndice();

            state._fsp--;

             current =iv_ruleComparacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacionIndice11512); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5273:1: ruleComparacionIndice returns [EObject current=null] : (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) ;
    public final EObject ruleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_SumaRestaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:28: ( (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5277:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5277:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5278:5: this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSumaRestaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11559);
            this_SumaRestaIndice_0=ruleSumaRestaIndice();

            state._fsp--;

             
                    current = this_SumaRestaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5286:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( ((LA104_0>=94 && LA104_0<=97)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5286:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5286:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5287:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionIndiceAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5292:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5293:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5293:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5294:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11589);
            	    lv_signo_op_2_0=rulesignoComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"signo_op",
            	            		lv_signo_op_2_0, 
            	            		"signoComparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5310:2: ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5311:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5311:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5312:3: lv_right_3_0= ruleSumaRestaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getRightSumaRestaIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11610);
            	    lv_right_3_0=ruleSumaRestaIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"SumaRestaIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5336:1: entryRuleSumaRestaIndice returns [EObject current=null] : iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF ;
    public final EObject entryRuleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaRestaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5337:2: (iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5338:2: iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11648);
            iv_ruleSumaRestaIndice=ruleSumaRestaIndice();

            state._fsp--;

             current =iv_ruleSumaRestaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaRestaIndice11658); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5345:1: ruleSumaRestaIndice returns [EObject current=null] : (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) ;
    public final EObject ruleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivisionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5348:28: ( (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5349:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5349:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5350:5: this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getMultiplicacionDivisionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11705);
            this_MultiplicacionDivisionIndice_0=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             
                    current = this_MultiplicacionDivisionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( ((LA106_0>=49 && LA106_0<=50)) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==49) ) {
            	        alt105=1;
            	    }
            	    else if ( (LA105_0==50) ) {
            	        alt105=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 105, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5358:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5359:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5364:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5365:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5365:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5366:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11737);
            	            lv_signo_op_2_0=rulesignoSuma();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoSuma");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5383:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5383:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5383:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5383:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5384:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5389:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5390:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5390:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5391:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11775);
            	            lv_signo_op_4_0=rulesignoResta();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoResta");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5407:4: ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5408:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5408:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5409:3: lv_right_5_0= ruleMultiplicacionDivisionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getRightMultiplicacionDivisionIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11798);
            	    lv_right_5_0=ruleMultiplicacionDivisionIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultiplicacionDivisionIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5433:1: entryRuleMultiplicacionDivisionIndice returns [EObject current=null] : iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF ;
    public final EObject entryRuleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivisionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5434:2: (iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5435:2: iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11836);
            iv_ruleMultiplicacionDivisionIndice=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             current =iv_ruleMultiplicacionDivisionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11846); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5442:1: ruleMultiplicacionDivisionIndice returns [EObject current=null] : (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) ;
    public final EObject ruleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_PrimariaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5445:28: ( (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5446:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5446:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5447:5: this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getPrimariaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11893);
            this_PrimariaIndice_0=rulePrimariaIndice();

            state._fsp--;

             
                    current = this_PrimariaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( ((LA108_0>=98 && LA108_0<=99)||LA108_0==101) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt107=3;
            	    switch ( input.LA(1) ) {
            	    case 98:
            	        {
            	        alt107=1;
            	        }
            	        break;
            	    case 99:
            	        {
            	        alt107=2;
            	        }
            	        break;
            	    case 101:
            	        {
            	        alt107=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 107, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt107) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5455:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5456:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5462:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5462:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5463:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11925);
            	            lv_signo_op_2_0=rulesignoMultiplicacion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_2_0, 
            	                    		"signoMultiplicacion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5480:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5480:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5480:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5480:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5481:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5486:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5487:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5487:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5488:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11963);
            	            lv_signo_op_4_0=rulesignoDivision();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_4_0, 
            	                    		"signoDivision");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5505:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5505:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5505:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5505:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5506:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5511:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5512:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5512:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5513:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivisionIndice12001);
            	            lv_signo_op_6_0=rulesignoDiv();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"signo_op",
            	                    		lv_signo_op_6_0, 
            	                    		"signoDiv");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5529:4: ( (lv_right_7_0= rulePrimariaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5530:1: (lv_right_7_0= rulePrimariaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5530:1: (lv_right_7_0= rulePrimariaIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5531:3: lv_right_7_0= rulePrimariaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getRightPrimariaIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice12024);
            	    lv_right_7_0=rulePrimariaIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"PrimariaIndice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop108;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5555:1: entryRulePrimariaIndice returns [EObject current=null] : iv_rulePrimariaIndice= rulePrimariaIndice EOF ;
    public final EObject entryRulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimariaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5556:2: (iv_rulePrimariaIndice= rulePrimariaIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5557:2: iv_rulePrimariaIndice= rulePrimariaIndice EOF
            {
             newCompositeNode(grammarAccess.getPrimariaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice12062);
            iv_rulePrimariaIndice=rulePrimariaIndice();

            state._fsp--;

             current =iv_rulePrimariaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimariaIndice12072); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5564:1: rulePrimariaIndice returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) ;
    public final EObject rulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5567:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_INT) ) {
                alt109=1;
            }
            else if ( (LA109_0==RULE_ID||LA109_0==RULE_STRING) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5568:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5569:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5574:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5575:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5575:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5576:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePrimariaIndice12128);
                    lv_valor_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaIndiceRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5593:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5593:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5593:7: () ( (lv_nombre_3_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5593:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5594:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getVariableIDAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5599:2: ( (lv_nombre_3_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5600:1: (lv_nombre_3_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5600:1: (lv_nombre_3_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5601:3: lv_nombre_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getNombreEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimariaIndice12166);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaIndiceRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_3_0, 
                            		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5625:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5626:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5627:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria12203);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria12213); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5634:1: rulePrimaria returns [EObject current=null] : (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) | ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' ) | this_Funciones_11= ruleFunciones | ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' ) ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_VariablesBasicas_0 = null;

        EObject this_VariablesComplejas_1 = null;

        EObject lv_valor_operacion_4_0 = null;

        EObject lv_valor_operacion_9_0 = null;

        EObject this_Funciones_11 = null;

        EObject lv_valor_operacion_14_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5637:28: ( (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) | ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' ) | this_Funciones_11= ruleFunciones | ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5638:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) | ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' ) | this_Funciones_11= ruleFunciones | ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5638:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) | ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' ) | this_Funciones_11= ruleFunciones | ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' ) )
            int alt110=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 110:
            case 111:
                {
                alt110=1;
                }
                break;
            case RULE_STRING:
                {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==46||LA110_2==53) ) {
                    alt110=2;
                }
                else if ( (LA110_2==EOF||(LA110_2>=RULE_ID && LA110_2<=RULE_NOMBRE_FUN)||(LA110_2>=RULE_INT && LA110_2<=RULE_CAR)||(LA110_2>=19 && LA110_2<=20)||(LA110_2>=27 && LA110_2<=30)||(LA110_2>=32 && LA110_2<=34)||(LA110_2>=37 && LA110_2<=45)||(LA110_2>=49 && LA110_2<=51)||LA110_2==54||LA110_2==56||LA110_2==58||LA110_2==63||LA110_2==65||LA110_2==67||(LA110_2>=69 && LA110_2<=71)||(LA110_2>=73 && LA110_2<=107)||(LA110_2>=110 && LA110_2<=111)) ) {
                    alt110=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA110_3 = input.LA(2);

                if ( (LA110_3==46||LA110_3==53) ) {
                    alt110=2;
                }
                else if ( (LA110_3==EOF||(LA110_3>=RULE_ID && LA110_3<=RULE_NOMBRE_FUN)||(LA110_3>=RULE_INT && LA110_3<=RULE_CAR)||(LA110_3>=19 && LA110_3<=20)||(LA110_3>=27 && LA110_3<=30)||(LA110_3>=32 && LA110_3<=34)||(LA110_3>=37 && LA110_3<=45)||(LA110_3>=49 && LA110_3<=51)||LA110_3==54||LA110_3==56||LA110_3==58||LA110_3==63||LA110_3==65||LA110_3==67||(LA110_3>=69 && LA110_3<=71)||(LA110_3>=73 && LA110_3<=107)||(LA110_3>=110 && LA110_3<=111)) ) {
                    alt110=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 3, input);

                    throw nvae;
                }
                }
                break;
            case 102:
                {
                alt110=3;
                }
                break;
            case 103:
                {
                alt110=4;
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
                {
                alt110=5;
                }
                break;
            case 33:
                {
                alt110=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5639:5: this_VariablesBasicas_0= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_rulePrimaria12260);
                    this_VariablesBasicas_0=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5649:5: this_VariablesComplejas_1= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_rulePrimaria12287);
                    this_VariablesComplejas_1=ruleVariablesComplejas();

                    state._fsp--;

                     
                            current = this_VariablesComplejas_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5658:6: ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5658:6: ( () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5658:7: () otherlv_3= '-(' ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5658:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5659:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegativaAction_2_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulePrimaria12314); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimariaAccess().getHyphenMinusLeftParenthesisKeyword_2_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5668:1: ( (lv_valor_operacion_4_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:1: (lv_valor_operacion_4_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:1: (lv_valor_operacion_4_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5670:3: lv_valor_operacion_4_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12335);
                    lv_valor_operacion_4_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_4_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria12347); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5691:6: ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5691:6: ( () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5691:7: () otherlv_7= 'no' otherlv_8= '(' ( (lv_valor_operacion_9_0= ruleoperacion ) ) otherlv_10= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5691:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5692:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegacionAction_3_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,103,FollowSets000.FOLLOW_103_in_rulePrimaria12376); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimariaAccess().getNoKeyword_3_1());
                        
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePrimaria12388); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5705:1: ( (lv_valor_operacion_9_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5706:1: (lv_valor_operacion_9_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5706:1: (lv_valor_operacion_9_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5707:3: lv_valor_operacion_9_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12409);
                    lv_valor_operacion_9_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_9_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria12421); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5729:5: this_Funciones_11= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_rulePrimaria12450);
                    this_Funciones_11=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5738:6: ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5738:6: ( () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5738:7: () otherlv_13= '(' ( (lv_valor_operacion_14_0= ruleoperacion ) ) otherlv_15= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5738:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5739:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getOperacionParentesisAction_5_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePrimaria12477); 

                        	newLeafNode(otherlv_13, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5748:1: ( (lv_valor_operacion_14_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5749:1: (lv_valor_operacion_14_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5749:1: (lv_valor_operacion_14_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5750:3: lv_valor_operacion_14_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12498);
                    lv_valor_operacion_14_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_14_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria12510); 

                        	newLeafNode(otherlv_15, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_5_3());
                        

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
    // $ANTLR end "rulePrimaria"


    // $ANTLR start "entryRuleFunciones"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5778:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5779:2: (iv_ruleFunciones= ruleFunciones EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5780:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_entryRuleFunciones12547);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunciones12557); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5787:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5790:28: ( ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' ) | ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_NOMBRE_FUN) ) {
                alt115=1;
            }
            else if ( ((LA115_0>=37 && LA115_0<=45)) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:3: () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )? otherlv_5= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5791:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5792:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5797:2: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5798:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5798:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5799:3: lv_nombre_1_0= RULE_NOMBRE_FUN
                    {
                    lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleFunciones12609); 

                    			newLeafNode(lv_nombre_1_0, grammarAccess.getFuncionesAccess().getNombreNOMBRE_FUNTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFuncionesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_0, 
                            		"NOMBRE_FUN");
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5815:2: ( ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )* )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( ((LA112_0>=RULE_ID && LA112_0<=RULE_NOMBRE_FUN)||(LA112_0>=RULE_INT && LA112_0<=RULE_CAR)||LA112_0==33||(LA112_0>=37 && LA112_0<=45)||(LA112_0>=102 && LA112_0<=103)||(LA112_0>=110 && LA112_0<=111)) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5815:3: ( (lv_operadores_2_0= ruleoperacion ) ) (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5815:3: ( (lv_operadores_2_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5816:1: (lv_operadores_2_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5816:1: (lv_operadores_2_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5817:3: lv_operadores_2_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12636);
                            lv_operadores_2_0=ruleoperacion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_2_0, 
                                    		"operacion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5833:2: (otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) ) )*
                            loop111:
                            do {
                                int alt111=2;
                                int LA111_0 = input.LA(1);

                                if ( (LA111_0==29) ) {
                                    alt111=1;
                                }


                                switch (alt111) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5833:4: otherlv_3= ',' ( (lv_operadores_4_0= ruleoperacion ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12649); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getFuncionesAccess().getCommaKeyword_0_2_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5837:1: ( (lv_operadores_4_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5838:1: (lv_operadores_4_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5838:1: (lv_operadores_4_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5839:3: lv_operadores_4_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12670);
                            	    lv_operadores_4_0=ruleoperacion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_4_0, 
                            	            		"operacion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop111;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12686); 

                        	newLeafNode(otherlv_5, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5860:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5860:6: ( () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5860:7: () ( (lv_nombre_7_0= ruleNombreInterna ) ) ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )? otherlv_11= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5860:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5861:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5866:2: ( (lv_nombre_7_0= ruleNombreInterna ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5867:1: (lv_nombre_7_0= ruleNombreInterna )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5867:1: (lv_nombre_7_0= ruleNombreInterna )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5868:3: lv_nombre_7_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleFunciones12724);
                    lv_nombre_7_0=ruleNombreInterna();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_7_0, 
                            		"NombreInterna");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5884:2: ( ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )* )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( ((LA114_0>=RULE_ID && LA114_0<=RULE_NOMBRE_FUN)||(LA114_0>=RULE_INT && LA114_0<=RULE_CAR)||LA114_0==33||(LA114_0>=37 && LA114_0<=45)||(LA114_0>=102 && LA114_0<=103)||(LA114_0>=110 && LA114_0<=111)) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5884:3: ( (lv_operadores_8_0= ruleoperacion ) ) (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5884:3: ( (lv_operadores_8_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5885:1: (lv_operadores_8_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5885:1: (lv_operadores_8_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5886:3: lv_operadores_8_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12746);
                            lv_operadores_8_0=ruleoperacion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_8_0, 
                                    		"operacion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5902:2: (otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) ) )*
                            loop113:
                            do {
                                int alt113=2;
                                int LA113_0 = input.LA(1);

                                if ( (LA113_0==29) ) {
                                    alt113=1;
                                }


                                switch (alt113) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5902:4: otherlv_9= ',' ( (lv_operadores_10_0= ruleoperacion ) )
                            	    {
                            	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12759); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getCommaKeyword_1_2_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5906:1: ( (lv_operadores_10_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5907:1: (lv_operadores_10_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5907:1: (lv_operadores_10_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5908:3: lv_operadores_10_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12780);
                            	    lv_operadores_10_0=ruleoperacion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_10_0, 
                            	            		"operacion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop113;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12796); 

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


    // $ANTLR start "entryRuleVariablesComplejas"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5936:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5937:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5938:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12833);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesComplejas12843); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5945:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) ;
    public final EObject ruleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_nombre_vector_1_0 = null;

        EObject lv_indice_3_0 = null;

        EObject lv_campo_6_0 = null;

        AntlrDatatypeRuleToken lv_nombre_matriz_8_0 = null;

        EObject lv_primerIndice_10_0 = null;

        EObject lv_segundoIndice_12_0 = null;

        EObject lv_campo_15_0 = null;

        AntlrDatatypeRuleToken lv_nombre_registro_17_0 = null;

        EObject lv_campo_19_0 = null;

        EObject lv_campo_21_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5948:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            int alt119=3;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5949:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5950:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5955:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5955:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5955:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5956:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5956:1: (lv_nombre_vector_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5957:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas12900);
                    lv_nombre_vector_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_vector",
                            		lv_nombre_vector_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas12912); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5977:1: ( (lv_indice_3_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5978:1: (lv_indice_3_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5978:1: (lv_indice_3_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5979:3: lv_indice_3_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceOperacionIndiceParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12933);
                    lv_indice_3_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_3_0, 
                            		"operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVariablesComplejas12945); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5999:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==46) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5999:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                            {
                            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas12959); 

                                	newLeafNode(otherlv_5, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_0_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6003:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6004:1: (lv_campo_6_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6004:1: (lv_campo_6_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6005:3: lv_campo_6_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12980);
                            lv_campo_6_0=ruleCampoRegistro();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"campo",
                                    		lv_campo_6_0, 
                                    		"CampoRegistro");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6022:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6022:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6022:7: () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6022:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6023:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6028:2: ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6028:3: ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6028:3: ( (lv_nombre_matriz_8_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6029:1: (lv_nombre_matriz_8_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6029:1: (lv_nombre_matriz_8_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6030:3: lv_nombre_matriz_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas13021);
                    lv_nombre_matriz_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_matriz",
                            		lv_nombre_matriz_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas13033); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6050:1: ( (lv_primerIndice_10_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6051:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6051:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6052:3: lv_primerIndice_10_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13054);
                    lv_primerIndice_10_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_10_0, 
                            		"operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleVariablesComplejas13066); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6072:1: ( (lv_segundoIndice_12_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6073:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6073:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6074:3: lv_segundoIndice_12_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceOperacionIndiceParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13087);
                    lv_segundoIndice_12_0=ruleoperacionIndice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_12_0, 
                            		"operacionIndice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVariablesComplejas13099); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6094:2: (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==46) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6094:4: otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) )
                            {
                            otherlv_14=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13113); 

                                	newLeafNode(otherlv_14, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_1_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6098:1: ( (lv_campo_15_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6099:1: (lv_campo_15_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6099:1: (lv_campo_15_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6100:3: lv_campo_15_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13134);
                            lv_campo_15_0=ruleCampoRegistro();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"campo",
                                    		lv_campo_15_0, 
                                    		"CampoRegistro");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:7: () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6118:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6123:2: ( (lv_nombre_registro_17_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6124:1: (lv_nombre_registro_17_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6124:1: (lv_nombre_registro_17_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6125:3: lv_nombre_registro_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas13174);
                    lv_nombre_registro_17_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre_registro",
                            		lv_nombre_registro_17_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13186); 

                        	newLeafNode(otherlv_18, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6145:1: ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6145:2: ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6145:2: ( (lv_campo_19_0= ruleCampoRegistro ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6146:1: (lv_campo_19_0= ruleCampoRegistro )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6146:1: (lv_campo_19_0= ruleCampoRegistro )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6147:3: lv_campo_19_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13208);
                    lv_campo_19_0=ruleCampoRegistro();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		add(
                           			current, 
                           			"campo",
                            		lv_campo_19_0, 
                            		"CampoRegistro");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6163:2: (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==46) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6163:4: otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_20=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13221); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6167:1: ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6168:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6168:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6169:3: lv_campo_21_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13242);
                    	    lv_campo_21_0=ruleCampoRegistro();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"campo",
                    	            		lv_campo_21_0, 
                    	            		"CampoRegistro");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);


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
    // $ANTLR end "ruleVariablesComplejas"


    // $ANTLR start "entryRuleVariablesBasicas"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6193:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6194:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6195:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13282);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesBasicas13292); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6202:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6205:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt120=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==46) ) {
                    alt120=2;
                }
                else if ( (LA120_1==EOF||(LA120_1>=RULE_ID && LA120_1<=RULE_NOMBRE_FUN)||(LA120_1>=RULE_INT && LA120_1<=RULE_CAR)||(LA120_1>=19 && LA120_1<=20)||(LA120_1>=27 && LA120_1<=30)||(LA120_1>=32 && LA120_1<=34)||(LA120_1>=37 && LA120_1<=45)||(LA120_1>=49 && LA120_1<=51)||LA120_1==54||LA120_1==56||LA120_1==58||LA120_1==63||LA120_1==65||LA120_1==67||(LA120_1>=69 && LA120_1<=71)||(LA120_1>=73 && LA120_1<=107)||(LA120_1>=110 && LA120_1<=111)) ) {
                    alt120=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 120, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt120=3;
                }
                break;
            case RULE_CAR:
                {
                alt120=4;
                }
                break;
            case 110:
            case 111:
                {
                alt120=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt120=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6206:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6207:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6212:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6213:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6213:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6214:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVariablesBasicas13348);
                    lv_valor_1_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_1_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6231:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6231:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6231:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6231:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6232:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6237:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6238:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6238:1: (lv_valor_3_0= ruleEFloat )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6239:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleVariablesBasicas13386);
                    lv_valor_3_0=ruleEFloat();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_3_0, 
                            		"EFloat");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6256:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6256:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6256:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6256:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6257:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6262:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6263:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6263:1: (lv_contenido_5_0= RULE_CAD )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6264:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleVariablesBasicas13420); 

                    			newLeafNode(lv_contenido_5_0, grammarAccess.getVariablesBasicasAccess().getContenidoCADTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_5_0, 
                            		"CAD");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6281:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6281:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6281:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6281:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6282:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6287:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6288:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6288:1: (lv_contenido_7_0= RULE_CAR )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6289:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleVariablesBasicas13459); 

                    			newLeafNode(lv_contenido_7_0, grammarAccess.getVariablesBasicasAccess().getContenidoCARTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"contenido",
                            		lv_contenido_7_0, 
                            		"CAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6306:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6306:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6306:7: () ( (lv_valor_9_0= ruleBooleano ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6306:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6307:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6312:2: ( (lv_valor_9_0= ruleBooleano ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6313:1: (lv_valor_9_0= ruleBooleano )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6313:1: (lv_valor_9_0= ruleBooleano )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6314:3: lv_valor_9_0= ruleBooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_ruleVariablesBasicas13502);
                    lv_valor_9_0=ruleBooleano();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_9_0, 
                            		"Booleano");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6331:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6331:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6331:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6331:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6332:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6337:2: ( (lv_nombre_11_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6338:1: (lv_nombre_11_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6338:1: (lv_nombre_11_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6339:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesBasicas13540);
                    lv_nombre_11_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_11_0, 
                            		"EString");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6363:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6364:2: (iv_ruleSino= ruleSino EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6365:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino13577);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino13587); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6372:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6375:28: ( ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6376:1: ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6376:1: ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6376:2: () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6376:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6377:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleSino13633); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSi_noKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6386:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RULE_ID && LA122_0<=RULE_NOMBRE_FUN)||LA122_0==RULE_STRING||LA122_0==32||LA122_0==34||(LA122_0>=37 && LA122_0<=45)||(LA122_0>=69 && LA122_0<=71)||LA122_0==74||LA122_0==77||LA122_0==79||LA122_0==83) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6386:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6386:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6387:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6387:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6388:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13655);
                    lv_sentencias_2_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_2_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6404:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( ((LA121_0>=RULE_ID && LA121_0<=RULE_NOMBRE_FUN)||LA121_0==RULE_STRING||LA121_0==32||LA121_0==34||(LA121_0>=37 && LA121_0<=45)||(LA121_0>=69 && LA121_0<=71)||LA121_0==74||LA121_0==77||LA121_0==79||LA121_0==83) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6405:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6405:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6406:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13676);
                    	    lv_sentencias_3_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_3_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6422:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==105) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6423:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6423:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6424:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino13700);
                    lv_devuelve_4_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSinoRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_4_0, 
                            		"Devolver");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6448:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6449:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6450:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver13737);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver13747); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6457:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6460:28: ( ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6461:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6461:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6461:2: () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6461:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6462:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleDevolver13793); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6471:1: ( (lv_devuelve_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6472:1: (lv_devuelve_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6472:1: (lv_devuelve_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6473:3: lv_devuelve_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleDevolver13814);
            lv_devuelve_2_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_2_0, 
                    		"operacion");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6497:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6498:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6499:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13850);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion13860); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6506:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6509:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6510:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6510:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6510:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6510:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6511:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6511:1: (lv_paso_0_0= ruleTipoPaso )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6512:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion13906);
            lv_paso_0_0=ruleTipoPaso();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"paso",
                    		lv_paso_0_0, 
                    		"TipoPaso");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6528:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6529:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6529:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6530:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion13927);
            lv_tipo_1_0=ruleTipo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_1_0, 
                    		"Tipo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleParametroFuncion13939); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6550:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6551:1: (lv_variable_3_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6551:1: (lv_variable_3_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6552:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion13960);
            lv_variable_3_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParametroFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"Variable");
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6576:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6577:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6578:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion13996);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion14006); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6585:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? ( (lv_devuelve_13_0= ruleDevolver ) )? otherlv_14= 'fin_funcion' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;

        EObject lv_declaracion_8_0 = null;

        EObject lv_declaracion_9_0 = null;

        EObject lv_sentencias_11_0 = null;

        EObject lv_sentencias_12_0 = null;

        EObject lv_devuelve_13_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6588:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? ( (lv_devuelve_13_0= ruleDevolver ) )? otherlv_14= 'fin_funcion' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6589:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? ( (lv_devuelve_13_0= ruleDevolver ) )? otherlv_14= 'fin_funcion' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6589:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? ( (lv_devuelve_13_0= ruleDevolver ) )? otherlv_14= 'fin_funcion' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6589:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? ( (lv_devuelve_13_0= ruleDevolver ) )? otherlv_14= 'fin_funcion'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6589:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6590:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6590:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6591:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion14052);
            lv_tipo_0_0=ruleTipoVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"tipo",
                    		lv_tipo_0_0, 
                    		"TipoVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFuncion14064); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6611:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6612:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6612:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6613:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleFuncion14081); 

            			newLeafNode(lv_nombre_2_0, grammarAccess.getFuncionAccess().getNombreNOMBRE_FUNTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFuncionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"NOMBRE_FUN");
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6629:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==47||(LA125_0>=108 && LA125_0<=109)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6629:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6629:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6630:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6630:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6631:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion14108);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6647:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==29) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6647:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncion14121); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6651:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6652:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6652:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6653:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion14142);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_5_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncion14158); 

                	newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6673:1: (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==20) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6673:3: otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncion14171); 

                        	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getVarKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6677:1: ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==RULE_ID||LA127_0==RULE_STRING||(LA127_0>=86 && LA127_0<=90)) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6677:2: ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6677:2: ( (lv_declaracion_8_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6678:1: (lv_declaracion_8_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6678:1: (lv_declaracion_8_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6679:3: lv_declaracion_8_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion14193);
                            lv_declaracion_8_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"declaracion",
                                    		lv_declaracion_8_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6695:2: ( (lv_declaracion_9_0= ruleDeclaracion ) )*
                            loop126:
                            do {
                                int alt126=2;
                                int LA126_0 = input.LA(1);

                                if ( (LA126_0==RULE_ID||LA126_0==RULE_STRING||(LA126_0>=86 && LA126_0<=90)) ) {
                                    alt126=1;
                                }


                                switch (alt126) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6696:1: (lv_declaracion_9_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6696:1: (lv_declaracion_9_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6697:3: lv_declaracion_9_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion14214);
                            	    lv_declaracion_9_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"declaracion",
                            	            		lv_declaracion_9_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

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


                    }
                    break;

            }

            otherlv_10=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFuncion14231); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getInicioKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6717:1: ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=RULE_ID && LA130_0<=RULE_NOMBRE_FUN)||LA130_0==RULE_STRING||LA130_0==32||LA130_0==34||(LA130_0>=37 && LA130_0<=45)||(LA130_0>=69 && LA130_0<=71)||LA130_0==74||LA130_0==77||LA130_0==79||LA130_0==83) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6717:2: ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6717:2: ( (lv_sentencias_11_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6718:1: (lv_sentencias_11_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6718:1: (lv_sentencias_11_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6719:3: lv_sentencias_11_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion14253);
                    lv_sentencias_11_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_11_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6735:2: ( (lv_sentencias_12_0= ruleSentencias ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( ((LA129_0>=RULE_ID && LA129_0<=RULE_NOMBRE_FUN)||LA129_0==RULE_STRING||LA129_0==32||LA129_0==34||(LA129_0>=37 && LA129_0<=45)||(LA129_0>=69 && LA129_0<=71)||LA129_0==74||LA129_0==77||LA129_0==79||LA129_0==83) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6736:1: (lv_sentencias_12_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6736:1: (lv_sentencias_12_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6737:3: lv_sentencias_12_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion14274);
                    	    lv_sentencias_12_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_12_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6753:5: ( (lv_devuelve_13_0= ruleDevolver ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==105) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6754:1: (lv_devuelve_13_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6754:1: (lv_devuelve_13_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6755:3: lv_devuelve_13_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion14298);
                    lv_devuelve_13_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_13_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFuncion14311); 

                	newLeafNode(otherlv_14, grammarAccess.getFuncionAccess().getFin_funcionKeyword_9());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6783:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6784:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6785:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14347);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento14357); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6792:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )? otherlv_9= 'inicio' ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )? otherlv_12= 'fin_procedimiento' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject lv_parametrofuncion_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_declaracion_7_0 = null;

        EObject lv_declaracion_8_0 = null;

        EObject lv_sentencias_10_0 = null;

        EObject lv_sentencias_11_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6795:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )? otherlv_9= 'inicio' ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )? otherlv_12= 'fin_procedimiento' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6796:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )? otherlv_9= 'inicio' ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )? otherlv_12= 'fin_procedimiento' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6796:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )? otherlv_9= 'inicio' ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )? otherlv_12= 'fin_procedimiento' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6796:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )? otherlv_9= 'inicio' ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )? otherlv_12= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcedimiento14394); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6800:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6801:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6801:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6802:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleProcedimiento14411); 

            			newLeafNode(lv_nombre_1_0, grammarAccess.getProcedimientoAccess().getNombreNOMBRE_FUNTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedimientoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"NOMBRE_FUN");
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6818:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==47||(LA133_0>=108 && LA133_0<=109)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6818:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6818:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6819:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6819:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6820:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14438);
                    lv_parametrofuncion_2_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_2_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6836:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==29) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6836:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcedimiento14451); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6840:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6841:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6841:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6842:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14472);
                    	    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_4_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcedimiento14488); 

                	newLeafNode(otherlv_5, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6862:1: (otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==20) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6862:3: otherlv_6= 'var' ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProcedimiento14501); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getVarKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6866:1: ( ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )* )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==RULE_ID||LA135_0==RULE_STRING||(LA135_0>=86 && LA135_0<=90)) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6866:2: ( (lv_declaracion_7_0= ruleDeclaracion ) ) ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6866:2: ( (lv_declaracion_7_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6867:1: (lv_declaracion_7_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6867:1: (lv_declaracion_7_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6868:3: lv_declaracion_7_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento14523);
                            lv_declaracion_7_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"declaracion",
                                    		lv_declaracion_7_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6884:2: ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                            loop134:
                            do {
                                int alt134=2;
                                int LA134_0 = input.LA(1);

                                if ( (LA134_0==RULE_ID||LA134_0==RULE_STRING||(LA134_0>=86 && LA134_0<=90)) ) {
                                    alt134=1;
                                }


                                switch (alt134) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6885:1: (lv_declaracion_8_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6885:1: (lv_declaracion_8_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6886:3: lv_declaracion_8_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento14544);
                            	    lv_declaracion_8_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"declaracion",
                            	            		lv_declaracion_8_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop134;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleProcedimiento14561); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getInicioKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6906:1: ( ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )* )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( ((LA138_0>=RULE_ID && LA138_0<=RULE_NOMBRE_FUN)||LA138_0==RULE_STRING||LA138_0==32||LA138_0==34||(LA138_0>=37 && LA138_0<=45)||(LA138_0>=69 && LA138_0<=71)||LA138_0==74||LA138_0==77||LA138_0==79||LA138_0==83) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6906:2: ( (lv_sentencias_10_0= ruleSentencias ) ) ( (lv_sentencias_11_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6906:2: ( (lv_sentencias_10_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6907:1: (lv_sentencias_10_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6907:1: (lv_sentencias_10_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6908:3: lv_sentencias_10_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento14583);
                    lv_sentencias_10_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_10_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6924:2: ( (lv_sentencias_11_0= ruleSentencias ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( ((LA137_0>=RULE_ID && LA137_0<=RULE_NOMBRE_FUN)||LA137_0==RULE_STRING||LA137_0==32||LA137_0==34||(LA137_0>=37 && LA137_0<=45)||(LA137_0>=69 && LA137_0<=71)||LA137_0==74||LA137_0==77||LA137_0==79||LA137_0==83) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6925:1: (lv_sentencias_11_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6925:1: (lv_sentencias_11_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6926:3: lv_sentencias_11_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento14604);
                    	    lv_sentencias_11_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_11_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleProcedimiento14619); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_7());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6954:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6955:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6956:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14656);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso14667); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6963:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6966:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6967:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6967:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt139=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt139=1;
                }
                break;
            case 108:
                {
                alt139=2;
                }
                break;
            case 109:
                {
                alt139=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6968:2: kw= 'E'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTipoPaso14705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6975:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleTipoPaso14724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6982:2: kw= 'S'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleTipoPaso14743); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6995:1: entryRuleBooleano returns [String current=null] : iv_ruleBooleano= ruleBooleano EOF ;
    public final String entryRuleBooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleano = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6996:2: (iv_ruleBooleano= ruleBooleano EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6997:2: iv_ruleBooleano= ruleBooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_entryRuleBooleano14784);
            iv_ruleBooleano=ruleBooleano();

            state._fsp--;

             current =iv_ruleBooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleano14795); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7004:1: ruleBooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleBooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7007:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7008:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7008:1: (kw= 'verdadero' | kw= 'falso' )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==110) ) {
                alt140=1;
            }
            else if ( (LA140_0==111) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7009:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleBooleano14833); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:7016:2: kw= 'falso'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleBooleano14852); 

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


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA119 dfa119 = new DFA119(this);
    static final String DFA47_eotS =
        "\12\uffff";
    static final String DFA47_eofS =
        "\12\uffff";
    static final String DFA47_minS =
        "\1\4\4\uffff\2\63\1\4\2\uffff";
    static final String DFA47_maxS =
        "\1\75\4\uffff\2\63\1\76\2\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5\1\6";
    static final String DFA47_specialS =
        "\12\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\6\4\uffff\1\5\52\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\11\3\uffff\2\11\64\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1097:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA119_eotS =
        "\u0172\uffff";
    static final String DFA119_eofS =
        "\u0172\uffff";
    static final String DFA119_minS =
        "\1\4\2\56\1\4\1\uffff\3\61\15\4\2\uffff\22\61\50\4\55\61\70\4\74\61\52\4\55\61\21\4\22\61\3\4\3\61";
    static final String DFA119_maxS =
        "\1\11\2\65\1\11\1\uffff\3\145\15\11\2\uffff\22\145\50\11\55\145\70\11\74\145\52\11\55\145\21\11\22\145\3\11\3\145";
    static final String DFA119_acceptS =
        "\4\uffff\1\3\20\uffff\1\1\1\2\u015b\uffff";
    static final String DFA119_specialS =
        "\u0172\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\2\4\uffff\1\1",
            "\1\4\6\uffff\1\3",
            "\1\4\6\uffff\1\3",
            "\1\7\3\uffff\1\5\1\6",
            "",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\31\3\uffff\1\27\1\30",
            "\1\31\3\uffff\1\27\1\30",
            "\1\31\3\uffff\1\27\1\30",
            "\1\34\3\uffff\1\32\1\33",
            "\1\34\3\uffff\1\32\1\33",
            "\1\37\3\uffff\1\35\1\36",
            "\1\37\3\uffff\1\35\1\36",
            "\1\37\3\uffff\1\35\1\36",
            "\1\37\3\uffff\1\35\1\36",
            "\1\42\3\uffff\1\40\1\41",
            "\1\42\3\uffff\1\40\1\41",
            "\1\45\3\uffff\1\43\1\44",
            "\1\50\3\uffff\1\46\1\47",
            "",
            "",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\123\3\uffff\1\121\1\122",
            "\1\123\3\uffff\1\121\1\122",
            "\1\123\3\uffff\1\121\1\122",
            "\1\126\3\uffff\1\124\1\125",
            "\1\126\3\uffff\1\124\1\125",
            "\1\126\3\uffff\1\124\1\125",
            "\1\131\3\uffff\1\127\1\130",
            "\1\131\3\uffff\1\127\1\130",
            "\1\134\3\uffff\1\132\1\133",
            "\1\134\3\uffff\1\132\1\133",
            "\1\134\3\uffff\1\132\1\133",
            "\1\137\3\uffff\1\135\1\136",
            "\1\137\3\uffff\1\135\1\136",
            "\1\142\3\uffff\1\140\1\141",
            "\1\142\3\uffff\1\140\1\141",
            "\1\142\3\uffff\1\140\1\141",
            "\1\142\3\uffff\1\140\1\141",
            "\1\145\3\uffff\1\143\1\144",
            "\1\145\3\uffff\1\143\1\144",
            "\1\145\3\uffff\1\143\1\144",
            "\1\150\3\uffff\1\146\1\147",
            "\1\150\3\uffff\1\146\1\147",
            "\1\153\3\uffff\1\151\1\152",
            "\1\153\3\uffff\1\151\1\152",
            "\1\153\3\uffff\1\151\1\152",
            "\1\153\3\uffff\1\151\1\152",
            "\1\156\3\uffff\1\154\1\155",
            "\1\156\3\uffff\1\154\1\155",
            "\1\161\3\uffff\1\157\1\160",
            "\1\161\3\uffff\1\157\1\160",
            "\1\161\3\uffff\1\157\1\160",
            "\1\164\3\uffff\1\162\1\163",
            "\1\164\3\uffff\1\162\1\163",
            "\1\167\3\uffff\1\165\1\166",
            "\1\167\3\uffff\1\165\1\166",
            "\1\167\3\uffff\1\165\1\166",
            "\1\167\3\uffff\1\165\1\166",
            "\1\172\3\uffff\1\170\1\171",
            "\1\172\3\uffff\1\170\1\171",
            "\1\175\3\uffff\1\173\1\174",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00b8\3\uffff\1\u00b6\1\u00b7",
            "\1\u00b8\3\uffff\1\u00b6\1\u00b7",
            "\1\u00b8\3\uffff\1\u00b6\1\u00b7",
            "\1\u00bb\3\uffff\1\u00b9\1\u00ba",
            "\1\u00bb\3\uffff\1\u00b9\1\u00ba",
            "\1\u00bb\3\uffff\1\u00b9\1\u00ba",
            "\1\u00be\3\uffff\1\u00bc\1\u00bd",
            "\1\u00be\3\uffff\1\u00bc\1\u00bd",
            "\1\u00be\3\uffff\1\u00bc\1\u00bd",
            "\1\u00c1\3\uffff\1\u00bf\1\u00c0",
            "\1\u00c1\3\uffff\1\u00bf\1\u00c0",
            "\1\u00c4\3\uffff\1\u00c2\1\u00c3",
            "\1\u00c4\3\uffff\1\u00c2\1\u00c3",
            "\1\u00c4\3\uffff\1\u00c2\1\u00c3",
            "\1\u00c7\3\uffff\1\u00c5\1\u00c6",
            "\1\u00c7\3\uffff\1\u00c5\1\u00c6",
            "\1\u00c7\3\uffff\1\u00c5\1\u00c6",
            "\1\u00ca\3\uffff\1\u00c8\1\u00c9",
            "\1\u00ca\3\uffff\1\u00c8\1\u00c9",
            "\1\u00cd\3\uffff\1\u00cb\1\u00cc",
            "\1\u00cd\3\uffff\1\u00cb\1\u00cc",
            "\1\u00cd\3\uffff\1\u00cb\1\u00cc",
            "\1\u00d0\3\uffff\1\u00ce\1\u00cf",
            "\1\u00d0\3\uffff\1\u00ce\1\u00cf",
            "\1\u00d3\3\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d1\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d1\1\u00d2",
            "\1\u00d6\3\uffff\1\u00d4\1\u00d5",
            "\1\u00d6\3\uffff\1\u00d4\1\u00d5",
            "\1\u00d6\3\uffff\1\u00d4\1\u00d5",
            "\1\u00d9\3\uffff\1\u00d7\1\u00d8",
            "\1\u00d9\3\uffff\1\u00d7\1\u00d8",
            "\1\u00d9\3\uffff\1\u00d7\1\u00d8",
            "\1\u00dc\3\uffff\1\u00da\1\u00db",
            "\1\u00dc\3\uffff\1\u00da\1\u00db",
            "\1\u00df\3\uffff\1\u00dd\1\u00de",
            "\1\u00df\3\uffff\1\u00dd\1\u00de",
            "\1\u00df\3\uffff\1\u00dd\1\u00de",
            "\1\u00e2\3\uffff\1\u00e0\1\u00e1",
            "\1\u00e2\3\uffff\1\u00e0\1\u00e1",
            "\1\u00e5\3\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\3\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\3\uffff\1\u00e3\1\u00e4",
            "\1\u00e5\3\uffff\1\u00e3\1\u00e4",
            "\1\u00e8\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e8\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e8\3\uffff\1\u00e6\1\u00e7",
            "\1\u00eb\3\uffff\1\u00e9\1\u00ea",
            "\1\u00eb\3\uffff\1\u00e9\1\u00ea",
            "\1\u00ee\3\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\3\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\3\uffff\1\u00ec\1\u00ed",
            "\1\u00ee\3\uffff\1\u00ec\1\u00ed",
            "\1\u00f1\3\uffff\1\u00ef\1\u00f0",
            "\1\u00f1\3\uffff\1\u00ef\1\u00f0",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u011e\3\uffff\1\u011c\1\u011d",
            "\1\u011e\3\uffff\1\u011c\1\u011d",
            "\1\u011e\3\uffff\1\u011c\1\u011d",
            "\1\u0121\3\uffff\1\u011f\1\u0120",
            "\1\u0121\3\uffff\1\u011f\1\u0120",
            "\1\u0121\3\uffff\1\u011f\1\u0120",
            "\1\u0124\3\uffff\1\u0122\1\u0123",
            "\1\u0124\3\uffff\1\u0122\1\u0123",
            "\1\u0124\3\uffff\1\u0122\1\u0123",
            "\1\u0127\3\uffff\1\u0125\1\u0126",
            "\1\u0127\3\uffff\1\u0125\1\u0126",
            "\1\u0127\3\uffff\1\u0125\1\u0126",
            "\1\u012a\3\uffff\1\u0128\1\u0129",
            "\1\u012a\3\uffff\1\u0128\1\u0129",
            "\1\u012d\3\uffff\1\u012b\1\u012c",
            "\1\u012d\3\uffff\1\u012b\1\u012c",
            "\1\u012d\3\uffff\1\u012b\1\u012c",
            "\1\u0130\3\uffff\1\u012e\1\u012f",
            "\1\u0130\3\uffff\1\u012e\1\u012f",
            "\1\u0130\3\uffff\1\u012e\1\u012f",
            "\1\u0133\3\uffff\1\u0131\1\u0132",
            "\1\u0133\3\uffff\1\u0131\1\u0132",
            "\1\u0133\3\uffff\1\u0131\1\u0132",
            "\1\u0136\3\uffff\1\u0134\1\u0135",
            "\1\u0136\3\uffff\1\u0134\1\u0135",
            "\1\u0139\3\uffff\1\u0137\1\u0138",
            "\1\u0139\3\uffff\1\u0137\1\u0138",
            "\1\u0139\3\uffff\1\u0137\1\u0138",
            "\1\u013c\3\uffff\1\u013a\1\u013b",
            "\1\u013c\3\uffff\1\u013a\1\u013b",
            "\1\u013c\3\uffff\1\u013a\1\u013b",
            "\1\u013f\3\uffff\1\u013d\1\u013e",
            "\1\u013f\3\uffff\1\u013d\1\u013e",
            "\1\u0142\3\uffff\1\u0140\1\u0141",
            "\1\u0142\3\uffff\1\u0140\1\u0141",
            "\1\u0142\3\uffff\1\u0140\1\u0141",
            "\1\u0145\3\uffff\1\u0143\1\u0144",
            "\1\u0145\3\uffff\1\u0143\1\u0144",
            "\1\u0148\3\uffff\1\u0146\1\u0147",
            "\1\u0148\3\uffff\1\u0146\1\u0147",
            "\1\u0148\3\uffff\1\u0146\1\u0147",
            "\1\u0148\3\uffff\1\u0146\1\u0147",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u015c\3\uffff\1\u015a\1\u015b",
            "\1\u015c\3\uffff\1\u015a\1\u015b",
            "\1\u015c\3\uffff\1\u015a\1\u015b",
            "\1\u015f\3\uffff\1\u015d\1\u015e",
            "\1\u015f\3\uffff\1\u015d\1\u015e",
            "\1\u015f\3\uffff\1\u015d\1\u015e",
            "\1\u0162\3\uffff\1\u0160\1\u0161",
            "\1\u0162\3\uffff\1\u0160\1\u0161",
            "\1\u0162\3\uffff\1\u0160\1\u0161",
            "\1\u0165\3\uffff\1\u0163\1\u0164",
            "\1\u0165\3\uffff\1\u0163\1\u0164",
            "\1\u0165\3\uffff\1\u0163\1\u0164",
            "\1\u0168\3\uffff\1\u0166\1\u0167",
            "\1\u0168\3\uffff\1\u0166\1\u0167",
            "\1\u0168\3\uffff\1\u0166\1\u0167",
            "\1\u016b\3\uffff\1\u0169\1\u016a",
            "\1\u016b\3\uffff\1\u0169\1\u016a",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0171\3\uffff\1\u016f\1\u0170",
            "\1\u0171\3\uffff\1\u016f\1\u0170",
            "\1\u0171\3\uffff\1\u016f\1\u0170",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\40\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e"
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "5949:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_ruleCodigo132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_ruleCodigo159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_entryRuleAlgoritmo194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlgoritmo204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAlgoritmo241 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAlgoritmo262 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo284 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo305 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_16_in_ruleAlgoritmo321 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo342 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo362 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleAlgoritmo377 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_18_in_ruleAlgoritmo392 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo414 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo435 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_19_in_ruleAlgoritmo453 = new BitSet(new long[]{0x2A100000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo475 = new BitSet(new long[]{0x2A100000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo496 = new BitSet(new long[]{0x2A100000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_20_in_ruleAlgoritmo514 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo536 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo557 = new BitSet(new long[]{0x00000000101D0250L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo584 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo605 = new BitSet(new long[]{0x00000000101D0040L,0x0000000007C00002L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleAlgoritmo629 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAlgoritmo641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_entryRuleModulo677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModulo687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleModulo724 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo741 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleModulo758 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo779 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo799 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleModulo814 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleModulo827 = new BitSet(new long[]{0x00000000111C0000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_18_in_ruleModulo840 = new BitSet(new long[]{0x0000000011180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo862 = new BitSet(new long[]{0x0000000011180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo883 = new BitSet(new long[]{0x0000000011180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_19_in_ruleModulo901 = new BitSet(new long[]{0x0000000011100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo923 = new BitSet(new long[]{0x0000000011100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo944 = new BitSet(new long[]{0x0000000011100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_20_in_ruleModulo962 = new BitSet(new long[]{0x0000000011000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo984 = new BitSet(new long[]{0x0000000011000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo1005 = new BitSet(new long[]{0x0000000011000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1032 = new BitSet(new long[]{0x0000000011000000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1053 = new BitSet(new long[]{0x0000000011000000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_24_in_ruleModulo1068 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleImplementacion_in_ruleModulo1090 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleModulo1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementacion_in_entryRuleImplementacion1138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementacion1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleImplementacion1195 = new BitSet(new long[]{0x00000000181C0000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_18_in_ruleImplementacion1208 = new BitSet(new long[]{0x0000000018180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1230 = new BitSet(new long[]{0x0000000018180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1251 = new BitSet(new long[]{0x0000000018180210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_19_in_ruleImplementacion1269 = new BitSet(new long[]{0x2A10000018100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1291 = new BitSet(new long[]{0x2A10000018100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1312 = new BitSet(new long[]{0x2A10000018100210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_20_in_ruleImplementacion1330 = new BitSet(new long[]{0x0000000018000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1352 = new BitSet(new long[]{0x0000000018000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1373 = new BitSet(new long[]{0x0000000018000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1400 = new BitSet(new long[]{0x0000000018000000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1421 = new BitSet(new long[]{0x0000000018000000L,0x0000000007C00000L});
        public static final BitSet FOLLOW_27_in_ruleImplementacion1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraSubproceso1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraProcedimiento1639 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraProcedimiento1656 = new BitSet(new long[]{0x0000800040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1683 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraProcedimiento1696 = new BitSet(new long[]{0x0000800000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1717 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraProcedimiento1733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraFuncion1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1825 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCabeceraFuncion1837 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraFuncion1854 = new BitSet(new long[]{0x0000800040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1881 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraFuncion1894 = new BitSet(new long[]{0x0000800000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1915 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraFuncion1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo2051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso2194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso2204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario2313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComentario2368 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias2425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias2509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_ruleSentencias2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque2679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque2689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque2736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque2790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque2844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2879 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion2889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir2998 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFuncionFicheroAbrir3045 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroAbrir3057 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3079 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3091 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3112 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3124 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3145 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroAbrir3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFuncionFicheroCerrar3241 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroCerrar3253 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3274 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroCerrar3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura3323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleModoApertura3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleModoApertura3391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleNombreInterna3481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNombreInterna3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNombreInterna3519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNombreInterna3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNombreInterna3557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNombreInterna3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleNombreInterna3595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleNombreInterna3614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleNombreInterna3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3769 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3820 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEFloat3838 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3853 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_47_in_ruleEFloat3873 = new BitSet(new long[]{0x0006000000000100L});
        public static final BitSet FOLLOW_48_in_ruleEFloat3892 = new BitSet(new long[]{0x0006000000000100L});
        public static final BitSet FOLLOW_49_in_ruleEFloat3907 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_50_in_ruleEFloat3926 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro4000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo4080 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo4137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo4164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido4209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes4379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes4389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes4435 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleConstantes4447 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes4468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleVector4551 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVector4563 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector4584 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVector4596 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleVector4608 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector4629 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleVector4641 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector4662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz4698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz4708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMatriz4745 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleMatriz4757 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4778 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleMatriz4790 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4811 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleMatriz4823 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMatriz4835 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4856 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleMatriz4868 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleRegistro4972 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro4993 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5015 = new BitSet(new long[]{0x1000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5036 = new BitSet(new long[]{0x1000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_60_in_ruleRegistro5050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo5086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo5096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleArchivo5133 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo5154 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleArchivo5166 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo5187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado5223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado5233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado5279 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleEnumerado5291 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleEnumerado5303 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5325 = new BitSet(new long[]{0x8000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEnumerado5338 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5359 = new BitSet(new long[]{0x8000000020000000L});
        public static final BitSet FOLLOW_63_in_ruleEnumerado5374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango5410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango5420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico5585 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSubrangoNumerico5597 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleSubrangoNumerico5631 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado5699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5745 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSubrangoEnumerado5757 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleSubrangoEnumerado5791 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio5849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio5859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleInicio5896 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInicio5917 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5939 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5960 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_66_in_ruleInicio5975 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008A4E8L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio5997 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008A4E8L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6018 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008A4E8L});
        public static final BitSet FOLLOW_67_in_ruleInicio6033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6192 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable6202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6248 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDeclaracionVariable6260 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6281 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionVariable6294 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6315 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6353 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia6363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia6409 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDeclaracionPropia6421 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6442 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionPropia6455 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6476 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion6514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion6524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal6643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal6689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleAsignacionNormal6701 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionNormal6722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleAsignacionCompleja6826 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6883 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleEscribir6930 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6951 = new BitSet(new long[]{0x00003FE260000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_29_in_ruleEscribir6965 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6986 = new BitSet(new long[]{0x00003FE260000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir7014 = new BitSet(new long[]{0x00003FE260000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_30_in_ruleEscribir7028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer7064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer7074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleLeer7111 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer7132 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleLeer7145 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer7166 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleLeer7180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi7216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleSi7263 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSi7275 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleSi7296 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSi7308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleSi7320 = new BitSet(new long[]{0x00003FE500000230L,0x000003000008A6E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7342 = new BitSet(new long[]{0x00003FE500000230L,0x000003000008A6E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7363 = new BitSet(new long[]{0x00003FE500000230L,0x000003000008A6E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi7387 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000200L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi7409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleSi7422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras7458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras7468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulemientras7505 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulemientras7517 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulemientras7538 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulemientras7550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulemientras7562 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008B4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7584 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008B4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7605 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008B4E0L});
        public static final BitSet FOLLOW_76_in_rulemientras7620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir7656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir7666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_rulerepetir7703 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008E4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7725 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008E4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7746 = new BitSet(new long[]{0x00003FE500000230L,0x000000000008E4E0L});
        public static final BitSet FOLLOW_78_in_rulerepetir7761 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulerepetir7773 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulerepetir7794 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulerepetir7806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7842 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruledesde7889 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde7910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruledesde7922 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruledesde7943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_ruledesde7955 = new BitSet(new long[]{0x00003FE500000230L,0x00000000000AA4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7977 = new BitSet(new long[]{0x00003FE500000230L,0x00000000000AA4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7998 = new BitSet(new long[]{0x00003FE500000230L,0x00000000000AA4E0L});
        public static final BitSet FOLLOW_81_in_ruledesde8013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso8049 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso8059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleCaso8096 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso8117 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleCaso8129 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8151 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8172 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso8196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun8233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun8243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesegun8280 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulesegun8292 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_rulesegun8313 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulesegun8325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_75_in_rulesegun8337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000140000L});
        public static final BitSet FOLLOW_84_in_rulesegun8395 = new BitSet(new long[]{0x00003FE500000230L,0x000002000028A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8417 = new BitSet(new long[]{0x00003FE500000230L,0x000002000028A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8438 = new BitSet(new long[]{0x00003FE500000230L,0x000002000028A4E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun8462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_85_in_rulesegun8475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable8523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleTipoVariable8561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleTipoVariable8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleTipoVariable8599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleTipoVariable8618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleTipoVariable8637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable8687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr8781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr8792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rulesignoOr8829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd8869 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd8880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_rulesignoAnd8917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8957 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulesignoIgualdad9006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_rulesignoIgualdad9025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9066 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion9077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_rulesignoComparacion9115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_rulesignoComparacion9134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_rulesignoComparacion9153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_rulesignoComparacion9172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma9213 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma9224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulesignoSuma9261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta9301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta9312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulesignoResta9349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion9400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_rulesignoMultiplicacion9437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision9477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision9488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_rulesignoDivision9525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoModulo_in_entryRulesignoModulo9565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoModulo9576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_rulesignoModulo9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDiv_in_entryRulesignoDiv9653 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDiv9664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_rulesignoDiv9701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion9740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion9750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion9796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr9840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9887 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr9917 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9938 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd10033 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd10063 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd10084 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_ruleMod_in_entryRuleMod10122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMod10132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod10179 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
        public static final BitSet FOLLOW_rulesignoModulo_in_ruleMod10209 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod10230 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad10268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad10278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10325 = new BitSet(new long[]{0x0008000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad10355 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10376 = new BitSet(new long[]{0x0008000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion10414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion10424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10471 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion10501 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10522 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta10560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta10570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10617 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta10649 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta10687 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10710 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision10758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10805 = new BitSet(new long[]{0x0000000000000002L,0x0000002C00000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10837 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10875 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivision10913 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10936 = new BitSet(new long[]{0x0000000000000002L,0x0000002C00000000L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacionIndice10984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_ruleoperacionIndice11030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_entryRuleOrIndice11064 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrIndice11074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice11121 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOrIndice11151 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice11172 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleAndIndice_in_entryRuleAndIndice11210 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndIndice11220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11267 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAndIndice11297 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11318 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdadIndice11366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11413 = new BitSet(new long[]{0x0008000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11443 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11464 = new BitSet(new long[]{0x0008000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacionIndice11512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11559 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11589 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11610 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaRestaIndice11658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11705 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11737 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11775 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11798 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11893 = new BitSet(new long[]{0x0000000000000002L,0x0000002C00000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11925 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11963 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivisionIndice12001 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice12024 = new BitSet(new long[]{0x0000000000000002L,0x0000002C00000000L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice12062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimariaIndice12072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePrimariaIndice12128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimariaIndice12166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria12203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria12213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_rulePrimaria12260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_rulePrimaria12287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_rulePrimaria12314 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12335 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria12347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_rulePrimaria12376 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulePrimaria12388 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12409 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria12421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_rulePrimaria12450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulePrimaria12477 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12498 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria12510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_entryRuleFunciones12547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunciones12557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleFunciones12609 = new BitSet(new long[]{0x00003FE240000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12636 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12649 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12670 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleFunciones12724 = new BitSet(new long[]{0x00003FE240000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12746 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12759 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12780 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12833 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesComplejas12843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas12900 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas12912 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12933 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVariablesComplejas12945 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas12959 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas13021 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas13033 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13054 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleVariablesComplejas13066 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13087 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVariablesComplejas13099 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13113 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas13174 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13186 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13208 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13221 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13242 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesBasicas13292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVariablesBasicas13348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleVariablesBasicas13386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleVariablesBasicas13420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleVariablesBasicas13459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_ruleVariablesBasicas13502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesBasicas13540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino13577 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino13587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleSino13633 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13655 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13676 = new BitSet(new long[]{0x00003FE500000232L,0x000002000008A4E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino13700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver13737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver13747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleDevolver13793 = new BitSet(new long[]{0x00003FE200000F30L,0x0000C0C000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleDevolver13814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion13860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion13906 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion13927 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleParametroFuncion13939 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion13960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion13996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion14006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion14052 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleFuncion14064 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleFuncion14081 = new BitSet(new long[]{0x0000800040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion14108 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncion14121 = new BitSet(new long[]{0x0000800000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion14142 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncion14158 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
        public static final BitSet FOLLOW_20_in_ruleFuncion14171 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion14193 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion14214 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_66_in_ruleFuncion14231 = new BitSet(new long[]{0x00003FE500000230L,0x000006000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion14253 = new BitSet(new long[]{0x00003FE500000230L,0x000006000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion14274 = new BitSet(new long[]{0x00003FE500000230L,0x000006000008A4E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion14298 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFuncion14311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14347 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento14357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleProcedimiento14394 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleProcedimiento14411 = new BitSet(new long[]{0x0000800040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14438 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleProcedimiento14451 = new BitSet(new long[]{0x0000800000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14472 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleProcedimiento14488 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
        public static final BitSet FOLLOW_20_in_ruleProcedimiento14501 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento14523 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento14544 = new BitSet(new long[]{0x0000000000000210L,0x0000000007C00004L});
        public static final BitSet FOLLOW_66_in_ruleProcedimiento14561 = new BitSet(new long[]{0x00003FE500000230L,0x000008000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento14583 = new BitSet(new long[]{0x00003FE500000230L,0x000008000008A4E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento14604 = new BitSet(new long[]{0x00003FE500000230L,0x000008000008A4E0L});
        public static final BitSet FOLLOW_107_in_ruleProcedimiento14619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso14667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTipoPaso14705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleTipoPaso14724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleTipoPaso14743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_entryRuleBooleano14784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleano14795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleBooleano14833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleBooleano14852 = new BitSet(new long[]{0x0000000000000002L});
    }


}