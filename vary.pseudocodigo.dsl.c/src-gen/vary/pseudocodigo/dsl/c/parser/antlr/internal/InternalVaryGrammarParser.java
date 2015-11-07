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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algoritmo'", "'importa'", "'fin_importa'", "'const'", "'tipo'", "'var'", "'fin_algoritmo'", "'Modulo'", "'exporta'", "'fin_exporta'", "'fin_modulo'", "'implementacion'", "'fin_implementacion'", "'procedimiento'", "'('", "','", "')'", "'funcion'", "'abrir'", "'cerrar'", "'escritura'", "'lectura'", "'cos'", "'cuadrado'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'longitud'", "'concatena'", "'.'", "'E'", "'e'", "'+'", "'-'", "'='", "'vector'", "'['", "']'", "'de'", "': '", "'matriz'", "']['", "'registro:'", "'fin_registro'", "'archivo de '", "'{'", "'}'", "'..'", "'principal'", "'inicio'", "'fin_inicio'", "'<-'", "'escribir'", "'leer'", "'si'", "'entonces'", "'fin_si'", "'mientras'", "'hacer'", "'fin_mientras'", "'repetir'", "'hasta_que'", "'desde'", "'hasta'", "'fin_desde'", "'caso'", "'segun_sea'", "'en_otro_caso:'", "'fin_segun'", "'entero'", "'caracter'", "'real'", "'logico'", "'cadena'", "'o'", "'y'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", "'*'", "'/'", "'mod'", "'|'", "'-('", "'no'", "'si_no'", "'devolver'", "'fin_funcion'", "'fin_procedimiento'", "'E/S'", "'S'", "'verdadero'", "'falso'"
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
    public static final int RULE_ANY_OTHER=13;
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
    public static final int T__14=14;
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
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=8;
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
    public static final int RULE_CAR=10;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_CAD=9;
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
    public static final int RULE_INT=7;
    public static final int RULE_COMENT=6;
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
    public static final int RULE_SL_COMMENT=5;
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
    public static final int RULE_WS=12;

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
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAlgoritmo241); 

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

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:178:7: otherlv_4= 'importa' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'fin_importa'
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAlgoritmo321); 

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

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAlgoritmo377); 

                        	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getFin_importaKeyword_3_2());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:3: (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:5: otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )?
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAlgoritmo392); 

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

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:252:9: otherlv_11= 'tipo' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAlgoritmo453); 

                        	newLeafNode(otherlv_11, grammarAccess.getAlgoritmoAccess().getTipoKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:256:1: ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING||LA11_0==51||LA11_0==56||LA11_0==58||LA11_0==60) ) {
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

                                if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING||LA10_0==51||LA10_0==56||LA10_0==58||LA10_0==60) ) {
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

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:292:9: otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlgoritmo514); 

                        	newLeafNode(otherlv_14, grammarAccess.getAlgoritmoAccess().getVarKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:296:1: ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case 85:
                            {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==55) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA14_2 = input.LA(2);

                            if ( (LA14_2==55) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA14_3 = input.LA(2);

                            if ( (LA14_3==55) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA14_4 = input.LA(2);

                            if ( (LA14_4==55) ) {
                                alt14=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA14_5 = input.LA(2);

                            if ( (LA14_5==55) ) {
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
                                case 85:
                                    {
                                    int LA13_1 = input.LA(2);

                                    if ( (LA13_1==55) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA13_2 = input.LA(2);

                                    if ( (LA13_2==55) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA13_3 = input.LA(2);

                                    if ( (LA13_3==55) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA13_4 = input.LA(2);

                                    if ( (LA13_4==55) ) {
                                        alt13=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA13_5 = input.LA(2);

                                    if ( (LA13_5==55) ) {
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

            if ( (LA17_0==27||(LA17_0>=85 && LA17_0<=89)) ) {
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

                        if ( (LA16_0==27||(LA16_0>=85 && LA16_0<=89)) ) {
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

            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlgoritmo641); 

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
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleModulo724); 

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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModulo758); 

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

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModulo814); 

                	newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getFin_importaKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:467:1: (otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:467:3: otherlv_6= 'exporta' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'fin_exporta'
            {
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModulo827); 

                	newLeafNode(otherlv_6, grammarAccess.getModuloAccess().getExportaKeyword_5_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:471:1: (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:471:3: otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )?
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModulo840); 

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

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:511:9: otherlv_10= 'tipo' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )?
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModulo901); 

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

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:551:9: otherlv_13= 'var' ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModulo962); 

                        	newLeafNode(otherlv_13, grammarAccess.getModuloAccess().getVarKeyword_5_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:555:1: ( ( (lv_exporta_global_14_0= ruleDeclaracion ) ) ( (lv_exporta_global_15_0= ruleDeclaracion ) )* )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case 85:
                            {
                            int LA27_1 = input.LA(2);

                            if ( (LA27_1==55) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA27_2 = input.LA(2);

                            if ( (LA27_2==55) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA27_3 = input.LA(2);

                            if ( (LA27_3==55) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA27_4 = input.LA(2);

                            if ( (LA27_4==55) ) {
                                alt27=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA27_5 = input.LA(2);

                            if ( (LA27_5==55) ) {
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
                                case 85:
                                    {
                                    int LA26_2 = input.LA(2);

                                    if ( (LA26_2==55) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA26_3 = input.LA(2);

                                    if ( (LA26_3==55) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA26_4 = input.LA(2);

                                    if ( (LA26_4==55) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA26_5 = input.LA(2);

                                    if ( (LA26_5==55) ) {
                                        alt26=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA26_6 = input.LA(2);

                                    if ( (LA26_6==55) ) {
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

            if ( (LA30_0==27||(LA30_0>=85 && LA30_0<=89)) ) {
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

                        if ( (LA29_0==27||(LA29_0>=85 && LA29_0<=89)) ) {
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

            otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModulo1068); 

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

            otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModulo1102); 

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
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleImplementacion1195); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementacionKeyword_1_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:684:1: (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:684:3: otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImplementacion1208); 

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

            if ( (LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:724:9: otherlv_5= 'tipo' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImplementacion1269); 

                        	newLeafNode(otherlv_5, grammarAccess.getImplementacionAccess().getTipoKeyword_1_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:728:1: ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID||LA35_0==RULE_STRING||LA35_0==51||LA35_0==56||LA35_0==58||LA35_0==60) ) {
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

                                if ( (LA34_0==RULE_ID||LA34_0==RULE_STRING||LA34_0==51||LA34_0==56||LA34_0==58||LA34_0==60) ) {
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

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:764:9: otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImplementacion1330); 

                        	newLeafNode(otherlv_8, grammarAccess.getImplementacionAccess().getVarKeyword_1_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:768:1: ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
                    int alt38=2;
                    switch ( input.LA(1) ) {
                        case 85:
                            {
                            int LA38_1 = input.LA(2);

                            if ( (LA38_1==55) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA38_2 = input.LA(2);

                            if ( (LA38_2==55) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA38_3 = input.LA(2);

                            if ( (LA38_3==55) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA38_4 = input.LA(2);

                            if ( (LA38_4==55) ) {
                                alt38=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA38_5 = input.LA(2);

                            if ( (LA38_5==55) ) {
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
                                case 85:
                                    {
                                    int LA37_1 = input.LA(2);

                                    if ( (LA37_1==55) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA37_2 = input.LA(2);

                                    if ( (LA37_2==55) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA37_3 = input.LA(2);

                                    if ( (LA37_3==55) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA37_4 = input.LA(2);

                                    if ( (LA37_4==55) ) {
                                        alt37=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA37_5 = input.LA(2);

                                    if ( (LA37_5==55) ) {
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

            if ( (LA41_0==27||(LA41_0>=85 && LA41_0<=89)) ) {
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

                        if ( (LA40_0==27||(LA40_0>=85 && LA40_0<=89)) ) {
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

            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleImplementacion1436); 

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

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=85 && LA42_0<=89)) ) {
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:901:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:904:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCabeceraProcedimiento1639); 

                	newLeafNode(otherlv_0, grammarAccess.getCabeceraProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:909:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:910:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:910:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:911:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCabeceraProcedimiento1660);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraProcedimiento1672); 

                	newLeafNode(otherlv_2, grammarAccess.getCabeceraProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:931:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46||(LA44_0>=108 && LA44_0<=109)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:931:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:931:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:932:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:932:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:933:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1694);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:949:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==29) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:949:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraProcedimiento1707); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:953:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:954:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:954:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:955:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1728);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraProcedimientoRule());
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraProcedimiento1744); 

                	newLeafNode(otherlv_6, grammarAccess.getCabeceraProcedimientoAccess().getRightParenthesisKeyword_4());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:983:1: entryRuleCabeceraFuncion returns [EObject current=null] : iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF ;
    public final EObject entryRuleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:984:2: (iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:985:2: iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF
            {
             newCompositeNode(grammarAccess.getCabeceraFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1780);
            iv_ruleCabeceraFuncion=ruleCabeceraFuncion();

            state._fsp--;

             current =iv_ruleCabeceraFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraFuncion1790); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:992:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_parametrofuncion_6_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:995:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:996:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:996:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:996:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:996:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:997:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:997:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:998:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1836);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCabeceraFuncion1848); 

                	newLeafNode(otherlv_1, grammarAccess.getCabeceraFuncionAccess().getFuncionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1018:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1019:1: (lv_nombre_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1019:1: (lv_nombre_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1020:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCabeceraFuncion1869);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraFuncion1881); 

                	newLeafNode(otherlv_3, grammarAccess.getCabeceraFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1040:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46||(LA46_0>=108 && LA46_0<=109)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1040:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1040:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1041:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1041:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1042:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1903);
                    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_4_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1058:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==29) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1058:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraFuncion1916); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1062:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1063:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1063:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1064:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1937);
                    	    lv_parametrofuncion_6_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCabeceraFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_6_0, 
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

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraFuncion1953); 

                	newLeafNode(otherlv_7, grammarAccess.getCabeceraFuncionAccess().getRightParenthesisKeyword_5());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1092:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1093:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1094:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1989);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo1999); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1101:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1104:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt47=6;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1106:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo2046);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1116:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo2073);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1126:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo2100);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1136:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo2127);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1146:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo2154);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1156:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo2181);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1172:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1173:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1174:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso2216);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso2226); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1181:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1184:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1185:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1185:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=85 && LA48_0<=89)) ) {
                alt48=1;
            }
            else if ( (LA48_0==27) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1186:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso2273);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1196:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso2300);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1212:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1213:2: (iv_ruleComentario= ruleComentario EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1214:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario2335);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario2345); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1221:1: ruleComentario returns [EObject current=null] : ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token lv_mensaje_2_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1224:28: ( ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1225:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1225:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1225:2: () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1225:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComentarioAccess().getComentarioAction_0(),
                        current);
                

            }

            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleComentario2390); 
             
                newLeafNode(this_SL_COMMENT_1, grammarAccess.getComentarioAccess().getSL_COMMENTTerminalRuleCall_1()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1235:1: ( (lv_mensaje_2_0= RULE_COMENT ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1236:1: (lv_mensaje_2_0= RULE_COMENT )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1236:1: (lv_mensaje_2_0= RULE_COMENT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1237:3: lv_mensaje_2_0= RULE_COMENT
            {
            lv_mensaje_2_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario2406); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1261:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1262:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1263:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias2447);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias2457); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1270:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1273:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt49=7;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1275:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias2504);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1285:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias2531);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1295:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias2558);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1305:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2585);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1315:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2612);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1325:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias2639);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1335:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_ruleSentencias2666);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1351:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1352:2: (iv_ruleBloque= ruleBloque EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1353:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque2701);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque2711); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1360:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1363:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1364:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1364:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt50=1;
                }
                break;
            case 73:
                {
                alt50=2;
                }
                break;
            case 76:
                {
                alt50=3;
                }
                break;
            case 78:
                {
                alt50=4;
                }
                break;
            case 82:
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1365:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque2758);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1375:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque2785);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1385:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque2812);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1395:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque2839);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1405:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque2866);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1421:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1422:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1423:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2901);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion2911); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1430:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1433:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1434:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1434:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=85 && LA51_0<=89)) ) {
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1435:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2958);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1445:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2985);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1461:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1462:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1463:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir3020);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3030); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1470:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1473:28: ( (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:1: (otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1474:3: otherlv_0= 'abrir' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFuncionFicheroAbrir3067); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getAbrirKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncionFicheroAbrir3079); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1482:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1482:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1482:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1483:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1483:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1484:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3101);
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

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3113); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1504:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1505:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1505:1: (lv_modo_4_0= ruleModoApertura )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1506:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3134);
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

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3146); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1526:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1527:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1527:1: (lv_variable_6_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1528:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3167);
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

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroAbrir3180); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1556:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1557:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1558:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3216);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3226); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1565:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1568:28: ( (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1569:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1569:1: (otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1569:3: otherlv_0= 'cerrar' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroCerrar3263); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCerrarKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncionFicheroCerrar3275); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1577:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1578:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1578:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1579:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3296);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroCerrar3308); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1607:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1608:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1609:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura3345);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura3356); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1616:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'escritura' | kw= 'lectura' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1619:28: ( (kw= 'escritura' | kw= 'lectura' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1620:1: (kw= 'escritura' | kw= 'lectura' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1620:1: (kw= 'escritura' | kw= 'lectura' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            else if ( (LA52_0==35) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1621:2: kw= 'escritura'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleModoApertura3394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getEscrituraKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1628:2: kw= 'lectura'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleModoApertura3413); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1641:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1642:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1643:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3454);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna3465); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1650:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1653:28: ( (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1654:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1654:1: (kw= 'cos' | kw= 'cuadrado' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'longitud' | kw= 'concatena' )
            int alt53=9;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt53=1;
                }
                break;
            case 37:
                {
                alt53=2;
                }
                break;
            case 38:
                {
                alt53=3;
                }
                break;
            case 39:
                {
                alt53=4;
                }
                break;
            case 40:
                {
                alt53=5;
                }
                break;
            case 41:
                {
                alt53=6;
                }
                break;
            case 42:
                {
                alt53=7;
                }
                break;
            case 43:
                {
                alt53=8;
                }
                break;
            case 44:
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1655:2: kw= 'cos'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNombreInterna3503); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1662:2: kw= 'cuadrado'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNombreInterna3522); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCuadradoKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1669:2: kw= 'exp'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNombreInterna3541); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1676:2: kw= 'ln'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNombreInterna3560); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1683:2: kw= 'log'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNombreInterna3579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1690:2: kw= 'sen'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNombreInterna3598); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1697:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNombreInterna3617); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1704:2: kw= 'longitud'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNombreInterna3636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLongitudKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1711:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNombreInterna3655); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1724:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1725:2: (iv_ruleEInt= ruleEInt EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1726:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3696);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3707); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1733:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1736:28: (this_INT_0= RULE_INT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1737:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3746); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1752:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1753:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1754:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3791);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3802); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1761:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1764:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1765:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1765:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1765:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3842); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEFloat3860); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3875); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1785:1: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=46 && LA56_0<=47)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1785:2: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1785:2: (kw= 'E' | kw= 'e' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==46) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==47) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1786:2: kw= 'E'
                            {
                            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat3895); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1793:2: kw= 'e'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEFloat3914); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1798:2: (kw= '+' | kw= '-' )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==48) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==49) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1799:2: kw= '+'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloat3929); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1806:2: kw= '-'
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEFloat3948); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3965); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1826:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1827:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1828:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro4012);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro4022); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1835:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1838:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1839:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1839:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1840:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1840:1: (lv_nombre_campo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1841:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro4067);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1865:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1866:2: (iv_ruleTipo= ruleTipo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1867:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo4102);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo4112); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1874:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1877:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1878:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1878:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||LA57_0==RULE_STRING) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=85 && LA57_0<=89)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1879:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo4159);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1889:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo4186);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1905:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1906:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1907:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4221);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido4231); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1914:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1917:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1918:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1918:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1919:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1919:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1920:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido4276);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1944:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1945:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1946:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4311);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente4321); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1953:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1956:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1957:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1957:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1958:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1958:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1959:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente4366);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1983:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1984:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1985:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes4401);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes4411); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1992:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1995:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1996:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1996:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1996:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1996:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1997:1: (lv_variable_0_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1997:1: (lv_variable_0_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1998:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes4457);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleConstantes4469); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2018:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2019:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2019:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2020:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes4490);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2044:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2045:2: (iv_ruleVector= ruleVector EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2046:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector4526);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector4536); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2053:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2056:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2057:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2057:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2057:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'de' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleVector4573); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVector4585); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2065:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2066:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2066:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2067:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector4606);
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

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVector4618); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVector4630); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getDeKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2091:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2092:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2092:1: (lv_tipo_5_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2093:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector4651);
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

            otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleVector4663); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2113:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2114:1: (lv_nombre_7_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2114:1: (lv_nombre_7_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2115:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector4684);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2139:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2140:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2141:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz4720);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz4730); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2148:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2151:28: ( (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2152:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2152:1: (otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2152:3: otherlv_0= 'matriz' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'de' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMatriz4767); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrizKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMatriz4779); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2160:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2161:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2161:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2162:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4800);
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

            otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMatriz4812); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2182:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2183:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2183:1: (lv_valor_4_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2184:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4833);
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

            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMatriz4845); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMatriz4857); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getDeKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2208:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2209:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2209:1: (lv_tipo_7_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2210:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4878);
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

            otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMatriz4890); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2230:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2231:1: (lv_nombre_9_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2231:1: (lv_nombre_9_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2232:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4911);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2256:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2257:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2258:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4947);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4957); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2265:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2268:28: ( (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2269:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2269:1: (otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2269:3: otherlv_0= 'registro:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'fin_registro'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRegistro4994); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2273:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2274:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2274:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2275:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro5015);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2291:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2291:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2291:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2292:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2292:1: (lv_variable_2_0= ruleDeclaracion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2293:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5037);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2309:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||LA58_0==RULE_STRING||(LA58_0>=85 && LA58_0<=89)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2310:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2310:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2311:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5058);
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

            otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRegistro5072); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2339:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2340:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2341:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo5108);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo5118); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2348:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2351:28: ( (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2352:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2352:1: (otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2352:3: otherlv_0= 'archivo de ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleArchivo5155); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchivoDeKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2356:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2357:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2357:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2358:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo5176);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleArchivo5188); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2378:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2379:1: (lv_nombre_3_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2379:1: (lv_nombre_3_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2380:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo5209);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2404:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2405:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2406:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado5245);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado5255); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2413:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2416:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2417:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2417:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2417:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2417:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2418:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2418:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2419:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado5301);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEnumerado5313); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEnumerado5325); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2443:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2443:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2443:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2444:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2444:1: (lv_valor_3_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2445:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5347);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2461:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==29) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2461:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumerado5360); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2465:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2466:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2466:1: (lv_valor_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2467:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5381);
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

            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEnumerado5396); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2495:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2496:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2497:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango5432);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango5442); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2504:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2507:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2508:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2508:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==50) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_INT) ) {
                        alt60=1;
                    }
                    else if ( (LA60_3==RULE_ID||LA60_3==RULE_STRING) ) {
                        alt60=2;
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

                if ( (LA60_2==50) ) {
                    int LA60_3 = input.LA(3);

                    if ( (LA60_3==RULE_INT) ) {
                        alt60=1;
                    }
                    else if ( (LA60_3==RULE_ID||LA60_3==RULE_STRING) ) {
                        alt60=2;
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2509:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5489);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2519:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5516);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2535:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2536:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2537:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5551);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico5561); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2544:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2547:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2548:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2548:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2548:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2548:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2549:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2549:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2550:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico5607);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoNumerico5619); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2570:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2570:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2570:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2571:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2571:1: (lv_limite_inf_2_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2572:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5641);
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

            otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleSubrangoNumerico5653); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2592:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2593:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2593:1: (lv_limite_sup_4_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2594:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5674);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2618:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2619:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2620:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5711);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado5721); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2627:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2630:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2631:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2631:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2631:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2631:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2632:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2632:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2633:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5767);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoEnumerado5779); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2653:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2653:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2653:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2654:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2654:1: (lv_limite_inf_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2655:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5801);
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

            otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleSubrangoEnumerado5813); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2675:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2676:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2676:1: (lv_limite_sup_4_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2677:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5834);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2701:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2702:2: (iv_ruleInicio= ruleInicio EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2703:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio5871);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio5881); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2710:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2713:28: ( (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2714:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2714:1: (otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2714:3: otherlv_0= 'principal' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'inicio' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'fin_inicio'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleInicio5918); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getPrincipalKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2718:1: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2719:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInicio5939); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2728:1: ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==RULE_STRING||(LA62_0>=85 && LA62_0<=89)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2728:2: ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2728:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2729:1: (lv_declaracion_3_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2729:1: (lv_declaracion_3_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2730:3: lv_declaracion_3_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5961);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2746:2: ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID||LA61_0==RULE_STRING||(LA61_0>=85 && LA61_0<=89)) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2747:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2747:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2748:3: lv_declaracion_4_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5982);
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

            otherlv_5=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleInicio5997); 

                	newLeafNode(otherlv_5, grammarAccess.getInicioAccess().getInicioKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:1: ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==RULE_STRING||(LA64_0>=32 && LA64_0<=33)||(LA64_0>=36 && LA64_0<=44)||(LA64_0>=68 && LA64_0<=70)||LA64_0==73||LA64_0==76||LA64_0==78||LA64_0==82) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:2: ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:2: ( (lv_tiene_6_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2769:1: (lv_tiene_6_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2769:1: (lv_tiene_6_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2770:3: lv_tiene_6_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6019);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2786:2: ( (lv_tiene_7_0= ruleSentencias ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID||LA63_0==RULE_STRING||(LA63_0>=32 && LA63_0<=33)||(LA63_0>=36 && LA63_0<=44)||(LA63_0>=68 && LA63_0<=70)||LA63_0==73||LA63_0==76||LA63_0==78||LA63_0==82) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2787:1: (lv_tiene_7_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2787:1: (lv_tiene_7_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2788:3: lv_tiene_7_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6040);
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

            otherlv_8=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleInicio6055); 

                	newLeafNode(otherlv_8, grammarAccess.getInicioAccess().getFin_inicioKeyword_6());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2816:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2817:2: (iv_ruleEString= ruleEString EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2818:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6092);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6103); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2825:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2828:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2829:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2829:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2829:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6143); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2837:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6169); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2852:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2853:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2854:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6214);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable6224); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2861:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2864:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2865:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2865:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2865:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2865:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2866:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2866:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2867:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6270);
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDeclaracionVariable6282); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2887:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2888:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2888:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2889:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6303);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2905:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==29) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2905:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionVariable6316); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2909:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2910:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2910:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2911:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6337);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2935:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2936:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2937:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6375);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia6385); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2944:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2947:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2948:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2948:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2948:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2948:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2949:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2949:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2950:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia6431);
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDeclaracionPropia6443); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2970:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2971:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2971:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2972:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6464);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2988:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==29) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2988:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionPropia6477); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2992:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2993:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2993:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2994:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6498);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3018:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3019:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3020:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion6536);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion6546); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3027:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3030:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3031:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3031:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==67) ) {
                    alt68=1;
                }
                else if ( (LA68_1==45||LA68_1==52) ) {
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

                if ( (LA68_2==45||LA68_2==52) ) {
                    alt68=2;
                }
                else if ( (LA68_2==67) ) {
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3032:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6593);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3042:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6620);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3058:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3059:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3060:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6655);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal6665); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3067:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3070:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3071:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3071:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3071:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3071:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3072:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3072:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3073:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal6711);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAsignacionNormal6723); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3093:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3094:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3094:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3095:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionNormal6744);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3119:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3120:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3121:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6780);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6790); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3128:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3131:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3132:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3132:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3132:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3132:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3133:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3133:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3134:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6836);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAsignacionCompleja6848); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3154:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3155:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3155:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3156:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6869);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3180:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3181:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3182:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6905);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6915); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3189:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleEscribir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_operador_2_0 = null;

        EObject lv_operador_4_0 = null;

        EObject lv_operador_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3192:28: ( (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3193:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3193:1: (otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3193:3: otherlv_0= 'escribir' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEscribir6952); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getEscribirKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEscribir6964); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3201:1: ( (lv_operador_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3202:1: (lv_operador_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3202:1: (lv_operador_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3203:3: lv_operador_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6985);
            lv_operador_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	        }
                   		add(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3219:2: ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==29) ) {
                    alt69=1;
                }
                else if ( (LA69_0==RULE_ID||(LA69_0>=RULE_INT && LA69_0<=RULE_CAR)||(LA69_0>=36 && LA69_0<=44)||(LA69_0>=101 && LA69_0<=103)||(LA69_0>=110 && LA69_0<=111)) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3219:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3219:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3219:5: otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEscribir6999); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3223:1: ( (lv_operador_4_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3224:1: (lv_operador_4_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3224:1: (lv_operador_4_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3225:3: lv_operador_4_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir7020);
            	    lv_operador_4_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_4_0, 
            	            		"Primaria");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3242:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3242:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3243:1: (lv_operador_5_0= ruleoperacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3243:1: (lv_operador_5_0= ruleoperacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3244:3: lv_operador_5_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir7048);
            	    lv_operador_5_0=ruleoperacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEscribirRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operador",
            	            		lv_operador_5_0, 
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

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEscribir7062); 

                	newLeafNode(otherlv_6, grammarAccess.getEscribirAccess().getRightParenthesisKeyword_4());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3272:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3273:2: (iv_ruleLeer= ruleLeer EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3274:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer7098);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer7108); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3281:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3284:28: ( (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3285:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3285:1: (otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3285:3: otherlv_0= 'leer' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLeer7145); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getLeerKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLeer7157); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3293:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3294:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3294:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3295:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer7178);
            lv_variable_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLeerRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"Primaria");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeer7190); 

                	newLeafNode(otherlv_3, grammarAccess.getLeerAccess().getRightParenthesisKeyword_3());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3323:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3324:2: (iv_ruleSi= ruleSi EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3325:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi7226);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi7236); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3332:1: ruleSi returns [EObject current=null] : (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) ;
    public final EObject ruleSi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_valor_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;

        EObject lv_devuelve_5_0 = null;

        EObject lv_sino_6_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3335:28: ( (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3336:1: (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3336:1: (otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3336:3: otherlv_0= 'si' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'entonces' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'fin_si'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleSi7273); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getSiKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3340:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3341:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3341:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3342:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleSi7294);
            lv_valor_1_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSi7306); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getEntoncesKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3362:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||LA71_0==RULE_STRING||(LA71_0>=32 && LA71_0<=33)||(LA71_0>=36 && LA71_0<=44)||(LA71_0>=68 && LA71_0<=70)||LA71_0==73||LA71_0==76||LA71_0==78||LA71_0==82) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3362:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3362:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3363:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3363:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3364:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7328);
                    lv_sentencias_3_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_3_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3380:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_ID||LA70_0==RULE_STRING||(LA70_0>=32 && LA70_0<=33)||(LA70_0>=36 && LA70_0<=44)||(LA70_0>=68 && LA70_0<=70)||LA70_0==73||LA70_0==76||LA70_0==78||LA70_0==82) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3381:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3381:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3382:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7349);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSiRule());
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3398:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==105) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3399:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3399:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3400:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi7373);
                    lv_devuelve_5_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3416:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==104) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3417:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3417:1: (lv_sino_6_0= ruleSino )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3418:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi7395);
                    lv_sino_6_0=ruleSino();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSiRule());
                    	        }
                           		set(
                           			current, 
                           			"sino",
                            		lv_sino_6_0, 
                            		"Sino");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSi7408); 

                	newLeafNode(otherlv_7, grammarAccess.getSiAccess().getFin_siKeyword_6());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3446:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3447:2: (iv_rulemientras= rulemientras EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3448:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras7444);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras7454); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3455:1: rulemientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) ;
    public final EObject rulemientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_valor_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_sentencias_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3458:28: ( (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3459:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3459:1: (otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3459:3: otherlv_0= 'mientras' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'hacer' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'fin_mientras'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_rulemientras7491); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3463:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3464:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3464:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3465:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulemientras7512);
            lv_valor_1_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulemientras7524); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getHacerKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3485:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||LA75_0==RULE_STRING||(LA75_0>=32 && LA75_0<=33)||(LA75_0>=36 && LA75_0<=44)||(LA75_0>=68 && LA75_0<=70)||LA75_0==73||LA75_0==76||LA75_0==78||LA75_0==82) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3485:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3485:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3486:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3486:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3487:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7546);
                    lv_sentencias_3_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_3_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3503:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==RULE_ID||LA74_0==RULE_STRING||(LA74_0>=32 && LA74_0<=33)||(LA74_0>=36 && LA74_0<=44)||(LA74_0>=68 && LA74_0<=70)||LA74_0==73||LA74_0==76||LA74_0==78||LA74_0==82) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3504:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3504:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3505:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7567);
                    	    lv_sentencias_4_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMientrasRule());
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
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulemientras7582); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getFin_mientrasKeyword_4());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3533:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3534:2: (iv_rulerepetir= rulerepetir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3535:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir7618);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir7628); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3542:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3545:28: ( (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3546:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3546:1: (otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3546:3: otherlv_0= 'repetir' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'hasta_que' ( (lv_valor_4_0= ruleoperacion ) )
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulerepetir7665); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3550:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||LA77_0==RULE_STRING||(LA77_0>=32 && LA77_0<=33)||(LA77_0>=36 && LA77_0<=44)||(LA77_0>=68 && LA77_0<=70)||LA77_0==73||LA77_0==76||LA77_0==78||LA77_0==82) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3550:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3550:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3551:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3551:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3552:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7687);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3568:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==RULE_ID||LA76_0==RULE_STRING||(LA76_0>=32 && LA76_0<=33)||(LA76_0>=36 && LA76_0<=44)||(LA76_0>=68 && LA76_0<=70)||LA76_0==73||LA76_0==76||LA76_0==78||LA76_0==82) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3569:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3569:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3570:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7708);
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
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulerepetir7723); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getHasta_queKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3590:1: ( (lv_valor_4_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3591:1: (lv_valor_4_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3591:1: (lv_valor_4_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3592:3: lv_valor_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulerepetir7744);
            lv_valor_4_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_4_0, 
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
    // $ANTLR end "rulerepetir"


    // $ANTLR start "entryRuledesde"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3616:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3617:2: (iv_ruledesde= ruledesde EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3618:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7780);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7790); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3625:1: ruledesde returns [EObject current=null] : (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3628:28: ( (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3629:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3629:1: (otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3629:3: otherlv_0= 'desde' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'hasta' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'hacer' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'fin_desde'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruledesde7827); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3633:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3634:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3634:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3635:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde7848);
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

            otherlv_2=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruledesde7860); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getHastaKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3655:1: ( (lv_valor_3_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3656:1: (lv_valor_3_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3656:1: (lv_valor_3_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3657:3: lv_valor_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruledesde7881);
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

            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruledesde7893); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getHacerKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3677:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID||LA79_0==RULE_STRING||(LA79_0>=32 && LA79_0<=33)||(LA79_0>=36 && LA79_0<=44)||(LA79_0>=68 && LA79_0<=70)||LA79_0==73||LA79_0==76||LA79_0==78||LA79_0==82) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3677:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3677:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3678:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3678:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3679:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7915);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3695:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==RULE_ID||LA78_0==RULE_STRING||(LA78_0>=32 && LA78_0<=33)||(LA78_0>=36 && LA78_0<=44)||(LA78_0>=68 && LA78_0<=70)||LA78_0==73||LA78_0==76||LA78_0==78||LA78_0==82) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3696:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3696:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3697:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7936);
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
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruledesde7951); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3725:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3726:2: (iv_ruleCaso= ruleCaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3727:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso7987);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso7997); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3734:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3737:28: ( (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3738:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3738:1: (otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3738:3: otherlv_0= 'caso' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleCaso8034); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3742:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3743:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3743:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3744:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso8055);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCaso8067); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3764:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID||LA81_0==RULE_STRING||(LA81_0>=32 && LA81_0<=33)||(LA81_0>=36 && LA81_0<=44)||(LA81_0>=68 && LA81_0<=70)||LA81_0==73||LA81_0==76||LA81_0==78||LA81_0==82) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3764:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3764:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3765:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3765:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3766:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8089);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3782:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==RULE_ID||LA80_0==RULE_STRING||(LA80_0>=32 && LA80_0<=33)||(LA80_0>=36 && LA80_0<=44)||(LA80_0>=68 && LA80_0<=70)||LA80_0==73||LA80_0==76||LA80_0==78||LA80_0==82) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3783:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3783:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3784:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8110);
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
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3800:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==105) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3801:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3801:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3802:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso8134);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3826:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3827:2: (iv_rulesegun= rulesegun EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3828:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun8171);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun8181); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3835:1: rulesegun returns [EObject current=null] : (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3838:28: ( (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3839:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3839:1: (otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3839:3: otherlv_0= 'segun_sea' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'hacer' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'en_otro_caso:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'fin_segun'
            {
            otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesegun8218); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getSegun_seaKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulesegun8230); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3847:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3848:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3848:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3849:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_rulesegun8251);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulesegun8263); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulesegun8275); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getHacerKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3873:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==81) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3873:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3873:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3874:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3874:1: (lv_caso_5_0= ruleCaso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3875:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8297);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3891:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==81) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3892:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3892:1: (lv_caso_6_0= ruleCaso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3893:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8318);
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
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesegun8333); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getEn_otro_casoKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3913:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==RULE_STRING||(LA86_0>=32 && LA86_0<=33)||(LA86_0>=36 && LA86_0<=44)||(LA86_0>=68 && LA86_0<=70)||LA86_0==73||LA86_0==76||LA86_0==78||LA86_0==82) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3913:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3913:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3914:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3914:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3915:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8355);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3931:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==RULE_ID||LA85_0==RULE_STRING||(LA85_0>=32 && LA85_0<=33)||(LA85_0>=36 && LA85_0<=44)||(LA85_0>=68 && LA85_0<=70)||LA85_0==73||LA85_0==76||LA85_0==78||LA85_0==82) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3932:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3932:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3933:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8376);
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
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3949:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==105) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3950:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3950:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3951:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun8400);
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

            otherlv_11=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesegun8413); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3979:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3980:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3981:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8450);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable8461); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3988:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3991:28: ( (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3992:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3992:1: (kw= 'entero' | kw= 'caracter' | kw= 'real' | kw= 'logico' | kw= 'cadena' )
            int alt88=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt88=1;
                }
                break;
            case 86:
                {
                alt88=2;
                }
                break;
            case 87:
                {
                alt88=3;
                }
                break;
            case 88:
                {
                alt88=4;
                }
                break;
            case 89:
                {
                alt88=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3993:2: kw= 'entero'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleTipoVariable8499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getEnteroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4000:2: kw= 'caracter'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleTipoVariable8518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCaracterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4007:2: kw= 'real'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleTipoVariable8537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4014:2: kw= 'logico'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleTipoVariable8556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLogicoKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4021:2: kw= 'cadena'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleTipoVariable8575); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4034:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4035:2: (iv_ruleVariable= ruleVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4036:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable8615);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable8625); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4043:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4046:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4047:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4047:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4047:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4047:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4048:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4053:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4054:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4054:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4055:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8680);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4081:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4082:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4083:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr8719);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr8730); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4090:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'o' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4093:28: (kw= 'o' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4095:2: kw= 'o'
            {
            kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_rulesignoOr8767); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4108:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4109:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4110:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd8807);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd8818); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4117:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'y' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4120:28: (kw= 'y' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4122:2: kw= 'y'
            {
            kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulesignoAnd8855); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4135:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4136:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4137:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8895);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad8906); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4144:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4147:28: ( (kw= '==' | kw= '!=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4148:1: (kw= '==' | kw= '!=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4148:1: (kw= '==' | kw= '!=' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==92) ) {
                alt89=1;
            }
            else if ( (LA89_0==93) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4149:2: kw= '=='
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_rulesignoIgualdad8944); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4156:2: kw= '!='
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulesignoIgualdad8963); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4169:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4170:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4171:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9004);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion9015); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4178:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4181:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4182:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4182:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt90=1;
                }
                break;
            case 95:
                {
                alt90=2;
                }
                break;
            case 96:
                {
                alt90=3;
                }
                break;
            case 97:
                {
                alt90=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4183:2: kw= '<'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_94_in_rulesignoComparacion9053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4190:2: kw= '>'
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_95_in_rulesignoComparacion9072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4197:2: kw= '>='
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_rulesignoComparacion9091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4204:2: kw= '<='
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_rulesignoComparacion9110); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4217:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4218:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4219:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma9151);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma9162); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4226:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4229:28: (kw= '+' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4231:2: kw= '+'
            {
            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulesignoSuma9199); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4245:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4246:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta9239);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta9250); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4253:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4256:28: (kw= '-' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4258:2: kw= '-'
            {
            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulesignoResta9287); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4271:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4272:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4273:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9327);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion9338); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4280:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4283:28: (kw= '*' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4285:2: kw= '*'
            {
            kw=(Token)match(input,98,FollowSets000.FOLLOW_98_in_rulesignoMultiplicacion9375); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4298:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4299:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4300:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision9415);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision9426); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4307:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4310:28: (kw= '/' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4312:2: kw= '/'
            {
            kw=(Token)match(input,99,FollowSets000.FOLLOW_99_in_rulesignoDivision9463); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4325:1: entryRulesignoModulo returns [String current=null] : iv_rulesignoModulo= rulesignoModulo EOF ;
    public final String entryRulesignoModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4326:2: (iv_rulesignoModulo= rulesignoModulo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4327:2: iv_rulesignoModulo= rulesignoModulo EOF
            {
             newCompositeNode(grammarAccess.getSignoModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_entryRulesignoModulo9503);
            iv_rulesignoModulo=rulesignoModulo();

            state._fsp--;

             current =iv_rulesignoModulo.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoModulo9514); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4334:1: rulesignoModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken rulesignoModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4337:28: (kw= 'mod' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4339:2: kw= 'mod'
            {
            kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_rulesignoModulo9551); 

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


    // $ANTLR start "entryRuleoperacion"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4352:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4353:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4354:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion9590);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion9600); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4361:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4364:28: (this_Or_0= ruleOr )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4366:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion9646);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4382:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4383:2: (iv_ruleOr= ruleOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4384:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr9680);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr9690); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4391:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4394:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4395:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4395:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4396:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9737);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4404:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==90) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4404:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4404:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4405:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4411:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4411:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4412:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr9767);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4428:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4429:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4429:1: (lv_right_3_0= ruleAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4430:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9788);
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
            	    break loop91;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4454:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4455:2: (iv_ruleAnd= ruleAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4456:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd9826);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd9836); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4463:1: ruleAnd returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Mod_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4466:28: ( (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4467:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4467:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4468:5: this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getModParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd9883);
            this_Mod_0=ruleMod();

            state._fsp--;

             
                    current = this_Mod_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4476:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==91) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4476:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleMod ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4476:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4477:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4482:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4484:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd9913);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4500:2: ( (lv_right_3_0= ruleMod ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4501:1: (lv_right_3_0= ruleMod )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4501:1: (lv_right_3_0= ruleMod )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4502:3: lv_right_3_0= ruleMod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightModParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd9934);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleMod"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4526:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4527:2: (iv_ruleMod= ruleMod EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4528:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_entryRuleMod9972);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMod9982); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4535:1: ruleMod returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4538:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4539:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4539:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4540:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod10029);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4548:1: ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==100) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4548:2: () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_right_3_0= ruleIgualdad ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4548:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4549:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getModAccess().getModLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4554:2: ( (lv_signo_op_2_0= rulesignoModulo ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4555:1: (lv_signo_op_2_0= rulesignoModulo )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4555:1: (lv_signo_op_2_0= rulesignoModulo )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4556:3: lv_signo_op_2_0= rulesignoModulo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getSigno_opSignoModuloParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_ruleMod10059);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4572:2: ( (lv_right_3_0= ruleIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4573:1: (lv_right_3_0= ruleIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4573:1: (lv_right_3_0= ruleIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4574:3: lv_right_3_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getRightIgualdadParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod10080);
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
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRuleIgualdad"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4598:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4599:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4600:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad10118);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad10128); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4607:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4610:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4611:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4611:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4612:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10175);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4620:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=92 && LA94_0<=93)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4620:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4620:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4621:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4626:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4627:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4627:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4628:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad10205);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4644:2: ( (lv_right_3_0= ruleComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4645:1: (lv_right_3_0= ruleComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4645:1: (lv_right_3_0= ruleComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4646:3: lv_right_3_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10226);
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
    // $ANTLR end "ruleIgualdad"


    // $ANTLR start "entryRuleComparacion"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4670:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4671:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4672:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion10264);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion10274); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4679:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4682:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4683:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4683:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4684:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10321);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=94 && LA95_0<=97)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4693:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4698:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4699:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4699:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4700:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion10351);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4716:2: ( (lv_right_3_0= ruleSumaResta ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:1: (lv_right_3_0= ruleSumaResta )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:1: (lv_right_3_0= ruleSumaResta )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4718:3: lv_right_3_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10372);
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
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleSumaResta"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4742:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4743:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4744:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta10410);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta10420); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4751:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4754:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4755:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4755:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4756:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10467);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=48 && LA97_0<=49)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==48) ) {
            	        alt96=1;
            	    }
            	    else if ( (LA96_0==49) ) {
            	        alt96=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 96, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4764:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4765:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4770:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4771:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4771:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4772:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta10499);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4789:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4789:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4789:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4789:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4790:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4795:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4796:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4796:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4797:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta10537);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4813:4: ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4814:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4814:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4815:3: lv_right_5_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10560);
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
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4839:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4840:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4841:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10598);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision10608); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4848:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4851:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4852:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4852:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4853:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10655);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=98 && LA99_0<=99)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) )
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==98) ) {
            	        alt98=1;
            	    }
            	    else if ( (LA98_0==99) ) {
            	        alt98=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 98, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4861:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4862:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4867:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4868:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4868:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4869:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10687);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4886:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4886:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4886:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4886:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4887:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4892:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4893:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4893:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4894:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10725);
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

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4910:4: ( (lv_right_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4911:1: (lv_right_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4911:1: (lv_right_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4912:3: lv_right_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10748);
            	    lv_right_5_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Primaria");
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRuleoperacionIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4936:1: entryRuleoperacionIndice returns [EObject current=null] : iv_ruleoperacionIndice= ruleoperacionIndice EOF ;
    public final EObject entryRuleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4937:2: (iv_ruleoperacionIndice= ruleoperacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4938:2: iv_ruleoperacionIndice= ruleoperacionIndice EOF
            {
             newCompositeNode(grammarAccess.getOperacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10786);
            iv_ruleoperacionIndice=ruleoperacionIndice();

            state._fsp--;

             current =iv_ruleoperacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacionIndice10796); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4945:1: ruleoperacionIndice returns [EObject current=null] : this_OrIndice_0= ruleOrIndice ;
    public final EObject ruleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_OrIndice_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4948:28: (this_OrIndice_0= ruleOrIndice )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4950:5: this_OrIndice_0= ruleOrIndice
            {
             
                    newCompositeNode(grammarAccess.getOperacionIndiceAccess().getOrIndiceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_ruleoperacionIndice10842);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4966:1: entryRuleOrIndice returns [EObject current=null] : iv_ruleOrIndice= ruleOrIndice EOF ;
    public final EObject entryRuleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4967:2: (iv_ruleOrIndice= ruleOrIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4968:2: iv_ruleOrIndice= ruleOrIndice EOF
            {
             newCompositeNode(grammarAccess.getOrIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_entryRuleOrIndice10876);
            iv_ruleOrIndice=ruleOrIndice();

            state._fsp--;

             current =iv_ruleOrIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrIndice10886); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4975:1: ruleOrIndice returns [EObject current=null] : (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) ;
    public final EObject ruleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject this_AndIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4978:28: ( (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4979:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4979:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4980:5: this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrIndiceAccess().getAndIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice10933);
            this_AndIndice_0=ruleAndIndice();

            state._fsp--;

             
                    current = this_AndIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4988:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==90) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4988:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4988:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4989:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrIndiceAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4994:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4995:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4995:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4996:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOrIndice10963);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5012:2: ( (lv_right_3_0= ruleAndIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5013:1: (lv_right_3_0= ruleAndIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5013:1: (lv_right_3_0= ruleAndIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5014:3: lv_right_3_0= ruleAndIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getRightAndIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice10984);
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
    // $ANTLR end "ruleOrIndice"


    // $ANTLR start "entryRuleAndIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5038:1: entryRuleAndIndice returns [EObject current=null] : iv_ruleAndIndice= ruleAndIndice EOF ;
    public final EObject entryRuleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5039:2: (iv_ruleAndIndice= ruleAndIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5040:2: iv_ruleAndIndice= ruleAndIndice EOF
            {
             newCompositeNode(grammarAccess.getAndIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_entryRuleAndIndice11022);
            iv_ruleAndIndice=ruleAndIndice();

            state._fsp--;

             current =iv_ruleAndIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndIndice11032); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5047:1: ruleAndIndice returns [EObject current=null] : (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) ;
    public final EObject ruleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject this_IgualdadIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:28: ( (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5051:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5051:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5052:5: this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndIndiceAccess().getIgualdadIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11079);
            this_IgualdadIndice_0=ruleIgualdadIndice();

            state._fsp--;

             
                    current = this_IgualdadIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5060:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==91) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5060:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5060:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5061:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndIndiceAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5066:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5067:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5067:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5068:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAndIndice11109);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5084:2: ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5085:1: (lv_right_3_0= ruleIgualdadIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5085:1: (lv_right_3_0= ruleIgualdadIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5086:3: lv_right_3_0= ruleIgualdadIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getRightIgualdadIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11130);
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
    // $ANTLR end "ruleAndIndice"


    // $ANTLR start "entryRuleIgualdadIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5110:1: entryRuleIgualdadIndice returns [EObject current=null] : iv_ruleIgualdadIndice= ruleIgualdadIndice EOF ;
    public final EObject entryRuleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdadIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5111:2: (iv_ruleIgualdadIndice= ruleIgualdadIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5112:2: iv_ruleIgualdadIndice= ruleIgualdadIndice EOF
            {
             newCompositeNode(grammarAccess.getIgualdadIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11168);
            iv_ruleIgualdadIndice=ruleIgualdadIndice();

            state._fsp--;

             current =iv_ruleIgualdadIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdadIndice11178); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5119:1: ruleIgualdadIndice returns [EObject current=null] : (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) ;
    public final EObject ruleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject this_ComparacionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5122:28: ( (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5123:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5123:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5124:5: this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getComparacionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11225);
            this_ComparacionIndice_0=ruleComparacionIndice();

            state._fsp--;

             
                    current = this_ComparacionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5132:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=92 && LA102_0<=93)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5132:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5132:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5133:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadIndiceAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5138:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5139:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5139:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5140:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11255);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5156:2: ( (lv_right_3_0= ruleComparacionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5157:1: (lv_right_3_0= ruleComparacionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5157:1: (lv_right_3_0= ruleComparacionIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5158:3: lv_right_3_0= ruleComparacionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getRightComparacionIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11276);
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
    // $ANTLR end "ruleIgualdadIndice"


    // $ANTLR start "entryRuleComparacionIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5182:1: entryRuleComparacionIndice returns [EObject current=null] : iv_ruleComparacionIndice= ruleComparacionIndice EOF ;
    public final EObject entryRuleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5183:2: (iv_ruleComparacionIndice= ruleComparacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5184:2: iv_ruleComparacionIndice= ruleComparacionIndice EOF
            {
             newCompositeNode(grammarAccess.getComparacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11314);
            iv_ruleComparacionIndice=ruleComparacionIndice();

            state._fsp--;

             current =iv_ruleComparacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacionIndice11324); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5191:1: ruleComparacionIndice returns [EObject current=null] : (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) ;
    public final EObject ruleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_SumaRestaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5194:28: ( (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5195:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5195:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5196:5: this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSumaRestaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11371);
            this_SumaRestaIndice_0=ruleSumaRestaIndice();

            state._fsp--;

             
                    current = this_SumaRestaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5204:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( ((LA103_0>=94 && LA103_0<=97)) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5204:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5204:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5205:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionIndiceAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5210:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5211:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5211:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5212:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11401);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5228:2: ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5229:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5229:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5230:3: lv_right_3_0= ruleSumaRestaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getRightSumaRestaIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11422);
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
    // $ANTLR end "ruleComparacionIndice"


    // $ANTLR start "entryRuleSumaRestaIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5254:1: entryRuleSumaRestaIndice returns [EObject current=null] : iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF ;
    public final EObject entryRuleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaRestaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5255:2: (iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5256:2: iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11460);
            iv_ruleSumaRestaIndice=ruleSumaRestaIndice();

            state._fsp--;

             current =iv_ruleSumaRestaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaRestaIndice11470); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5263:1: ruleSumaRestaIndice returns [EObject current=null] : (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) ;
    public final EObject ruleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivisionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5266:28: ( (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5267:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5267:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5268:5: this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getMultiplicacionDivisionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11517);
            this_MultiplicacionDivisionIndice_0=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             
                    current = this_MultiplicacionDivisionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( ((LA105_0>=48 && LA105_0<=49)) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==48) ) {
            	        alt104=1;
            	    }
            	    else if ( (LA104_0==49) ) {
            	        alt104=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 104, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5276:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5277:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5282:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5283:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5283:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5284:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11549);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5301:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5301:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5301:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5301:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5302:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5307:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5308:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5308:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5309:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11587);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5325:4: ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5326:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5326:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5327:3: lv_right_5_0= ruleMultiplicacionDivisionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getRightMultiplicacionDivisionIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11610);
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
    // $ANTLR end "ruleSumaRestaIndice"


    // $ANTLR start "entryRuleMultiplicacionDivisionIndice"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5351:1: entryRuleMultiplicacionDivisionIndice returns [EObject current=null] : iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF ;
    public final EObject entryRuleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivisionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5352:2: (iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5353:2: iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11648);
            iv_ruleMultiplicacionDivisionIndice=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             current =iv_ruleMultiplicacionDivisionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11658); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5360:1: ruleMultiplicacionDivisionIndice returns [EObject current=null] : (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )* ) ;
    public final EObject ruleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_PrimariaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5363:28: ( (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5364:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5364:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5365:5: this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getPrimariaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11705);
            this_PrimariaIndice_0=rulePrimariaIndice();

            state._fsp--;

             
                    current = this_PrimariaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( ((LA107_0>=98 && LA107_0<=99)) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimariaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) )
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==98) ) {
            	        alt106=1;
            	    }
            	    else if ( (LA106_0==99) ) {
            	        alt106=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 106, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5374:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5379:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5380:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5380:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5381:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11737);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5398:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5398:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5398:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5398:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5399:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5404:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5405:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5405:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5406:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11775);
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

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5422:4: ( (lv_right_5_0= rulePrimariaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5423:1: (lv_right_5_0= rulePrimariaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5423:1: (lv_right_5_0= rulePrimariaIndice )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5424:3: lv_right_5_0= rulePrimariaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getRightPrimariaIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11798);
            	    lv_right_5_0=rulePrimariaIndice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionIndiceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"PrimariaIndice");
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


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5448:1: entryRulePrimariaIndice returns [EObject current=null] : iv_rulePrimariaIndice= rulePrimariaIndice EOF ;
    public final EObject entryRulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimariaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5449:2: (iv_rulePrimariaIndice= rulePrimariaIndice EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5450:2: iv_rulePrimariaIndice= rulePrimariaIndice EOF
            {
             newCompositeNode(grammarAccess.getPrimariaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice11836);
            iv_rulePrimariaIndice=rulePrimariaIndice();

            state._fsp--;

             current =iv_rulePrimariaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimariaIndice11846); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5457:1: rulePrimariaIndice returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) ;
    public final EObject rulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5460:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_INT) ) {
                alt108=1;
            }
            else if ( (LA108_0==RULE_ID||LA108_0==RULE_STRING) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5462:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5467:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5468:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5468:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5469:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePrimariaIndice11902);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5486:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5486:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5486:7: () ( (lv_nombre_3_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5486:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5487:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getVariableIDAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5492:2: ( (lv_nombre_3_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5493:1: (lv_nombre_3_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5493:1: (lv_nombre_3_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5494:3: lv_nombre_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getNombreEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimariaIndice11940);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5518:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5519:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5520:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria11977);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria11987); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5527:1: rulePrimaria returns [EObject current=null] : (this_VariablesBasicas_0= ruleVariablesBasicas | (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' ) | this_VariablesComplejas_4= ruleVariablesComplejas | ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' ) | ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' ) | this_Funciones_14= ruleFunciones ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_VariablesBasicas_0 = null;

        EObject this_operacion_2 = null;

        EObject this_VariablesComplejas_4 = null;

        EObject lv_valor_operacion_7_0 = null;

        EObject lv_valor_operacion_12_0 = null;

        EObject this_Funciones_14 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5530:28: ( (this_VariablesBasicas_0= ruleVariablesBasicas | (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' ) | this_VariablesComplejas_4= ruleVariablesComplejas | ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' ) | ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' ) | this_Funciones_14= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5531:1: (this_VariablesBasicas_0= ruleVariablesBasicas | (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' ) | this_VariablesComplejas_4= ruleVariablesComplejas | ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' ) | ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' ) | this_Funciones_14= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5531:1: (this_VariablesBasicas_0= ruleVariablesBasicas | (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' ) | this_VariablesComplejas_4= ruleVariablesComplejas | ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' ) | ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' ) | this_Funciones_14= ruleFunciones )
            int alt109=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 110:
            case 111:
                {
                alt109=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 45:
                case 52:
                    {
                    alt109=3;
                    }
                    break;
                case 28:
                    {
                    alt109=6;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_CAD:
                case RULE_CAR:
                case 18:
                case 19:
                case 26:
                case 27:
                case 29:
                case 30:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 48:
                case 49:
                case 53:
                case 55:
                case 57:
                case 62:
                case 64:
                case 66:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 110:
                case 111:
                    {
                    alt109=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_CAD:
                case RULE_CAR:
                case 18:
                case 19:
                case 26:
                case 27:
                case 29:
                case 30:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 48:
                case 49:
                case 53:
                case 55:
                case 57:
                case 62:
                case 64:
                case 66:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 110:
                case 111:
                    {
                    alt109=1;
                    }
                    break;
                case 45:
                case 52:
                    {
                    alt109=3;
                    }
                    break;
                case 28:
                    {
                    alt109=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 3, input);

                    throw nvae;
                }

                }
                break;
            case 101:
                {
                alt109=2;
                }
                break;
            case 102:
                {
                alt109=4;
                }
                break;
            case 103:
                {
                alt109=5;
                }
                break;
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
                alt109=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5532:5: this_VariablesBasicas_0= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_rulePrimaria12034);
                    this_VariablesBasicas_0=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5541:6: (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5541:6: (otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5541:8: otherlv_1= '|' this_operacion_2= ruleoperacion otherlv_3= '|'
                    {
                    otherlv_1=(Token)match(input,101,FollowSets000.FOLLOW_101_in_rulePrimaria12052); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12074);
                    this_operacion_2=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,101,FollowSets000.FOLLOW_101_in_rulePrimaria12085); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5560:5: this_VariablesComplejas_4= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_rulePrimaria12114);
                    this_VariablesComplejas_4=ruleVariablesComplejas();

                    state._fsp--;

                     
                            current = this_VariablesComplejas_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5569:6: ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5569:6: ( () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5569:7: () otherlv_6= '-(' ( (lv_valor_operacion_7_0= ruleoperacion ) ) otherlv_8= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5569:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5570:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegativaAction_3_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulePrimaria12141); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimariaAccess().getHyphenMinusLeftParenthesisKeyword_3_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5579:1: ( (lv_valor_operacion_7_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5580:1: (lv_valor_operacion_7_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5580:1: (lv_valor_operacion_7_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5581:3: lv_valor_operacion_7_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12162);
                    lv_valor_operacion_7_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_7_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria12174); 

                        	newLeafNode(otherlv_8, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_3_3());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5602:6: ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5602:6: ( () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5602:7: () otherlv_10= 'no' otherlv_11= '(' ( (lv_valor_operacion_12_0= ruleoperacion ) ) otherlv_13= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5602:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5603:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegacionAction_4_0(),
                                current);
                        

                    }

                    otherlv_10=(Token)match(input,103,FollowSets000.FOLLOW_103_in_rulePrimaria12203); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimariaAccess().getNoKeyword_4_1());
                        
                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePrimaria12215); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_4_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5616:1: ( (lv_valor_operacion_12_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5617:1: (lv_valor_operacion_12_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5617:1: (lv_valor_operacion_12_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5618:3: lv_valor_operacion_12_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria12236);
                    lv_valor_operacion_12_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_12_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria12248); 

                        	newLeafNode(otherlv_13, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_4_4());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5640:5: this_Funciones_14= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_rulePrimaria12277);
                    this_Funciones_14=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_14; 
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


    // $ANTLR start "entryRuleFunciones"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5656:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5657:2: (iv_ruleFunciones= ruleFunciones EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5658:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_entryRuleFunciones12312);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunciones12322); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5665:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) ;
    public final EObject ruleFunciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_operadores_3_0 = null;

        EObject lv_operadores_5_0 = null;

        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        EObject lv_operadores_10_0 = null;

        EObject lv_operadores_12_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5668:28: ( ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_ID||LA114_0==RULE_STRING) ) {
                alt114=1;
            }
            else if ( ((LA114_0>=36 && LA114_0<=44)) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:3: () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5669:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5670:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5675:2: ( (lv_nombre_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5676:1: (lv_nombre_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5676:1: (lv_nombre_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5677:3: lv_nombre_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreEStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFunciones12378);
                    lv_nombre_1_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_1_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunciones12390); 

                        	newLeafNode(otherlv_2, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5697:1: ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==RULE_ID||(LA111_0>=RULE_INT && LA111_0<=RULE_CAR)||(LA111_0>=36 && LA111_0<=44)||(LA111_0>=101 && LA111_0<=103)||(LA111_0>=110 && LA111_0<=111)) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5697:2: ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5697:2: ( (lv_operadores_3_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5698:1: (lv_operadores_3_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5698:1: (lv_operadores_3_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5699:3: lv_operadores_3_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12412);
                            lv_operadores_3_0=ruleoperacion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_3_0, 
                                    		"operacion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5715:2: (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            loop110:
                            do {
                                int alt110=2;
                                int LA110_0 = input.LA(1);

                                if ( (LA110_0==29) ) {
                                    alt110=1;
                                }


                                switch (alt110) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5715:4: otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) )
                            	    {
                            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12425); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getFuncionesAccess().getCommaKeyword_0_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5719:1: ( (lv_operadores_5_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5720:1: (lv_operadores_5_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5720:1: (lv_operadores_5_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5721:3: lv_operadores_5_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12446);
                            	    lv_operadores_5_0=ruleoperacion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_5_0, 
                            	            		"operacion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop110;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12462); 

                        	newLeafNode(otherlv_6, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5742:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5742:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5742:7: () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5742:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5743:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5748:2: ( (lv_nombre_8_0= ruleNombreInterna ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5749:1: (lv_nombre_8_0= ruleNombreInterna )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5749:1: (lv_nombre_8_0= ruleNombreInterna )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5750:3: lv_nombre_8_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleFunciones12500);
                    lv_nombre_8_0=ruleNombreInterna();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_8_0, 
                            		"NombreInterna");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunciones12512); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5770:1: ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==RULE_ID||(LA113_0>=RULE_INT && LA113_0<=RULE_CAR)||(LA113_0>=36 && LA113_0<=44)||(LA113_0>=101 && LA113_0<=103)||(LA113_0>=110 && LA113_0<=111)) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5770:2: ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5770:2: ( (lv_operadores_10_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5771:1: (lv_operadores_10_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5771:1: (lv_operadores_10_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5772:3: lv_operadores_10_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12534);
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

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5788:2: (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( (LA112_0==29) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5788:4: otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) )
                            	    {
                            	    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12547); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getFuncionesAccess().getCommaKeyword_1_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5792:1: ( (lv_operadores_12_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5793:1: (lv_operadores_12_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5793:1: (lv_operadores_12_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5794:3: lv_operadores_12_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12568);
                            	    lv_operadores_12_0=ruleoperacion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_12_0, 
                            	            		"operacion");
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

                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12584); 

                        	newLeafNode(otherlv_13, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_1_4());
                        

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5822:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5823:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5824:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12621);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesComplejas12631); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5831:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5834:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            int alt118=3;
            alt118 = dfa118.predict(input);
            switch (alt118) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5835:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5836:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5841:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5841:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5841:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5842:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5842:1: (lv_nombre_vector_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5843:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas12688);
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

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVariablesComplejas12700); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5863:1: ( (lv_indice_3_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5864:1: (lv_indice_3_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5864:1: (lv_indice_3_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5865:3: lv_indice_3_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceOperacionIndiceParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12721);
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

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas12733); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5885:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==45) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5885:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                            {
                            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas12747); 

                                	newLeafNode(otherlv_5, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_0_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5889:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5890:1: (lv_campo_6_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5890:1: (lv_campo_6_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5891:3: lv_campo_6_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12768);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5908:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5908:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5908:7: () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5908:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5909:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5914:2: ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5914:3: ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5914:3: ( (lv_nombre_matriz_8_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5915:1: (lv_nombre_matriz_8_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5915:1: (lv_nombre_matriz_8_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5916:3: lv_nombre_matriz_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas12809);
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

                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVariablesComplejas12821); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5936:1: ( (lv_primerIndice_10_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5937:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5937:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5938:3: lv_primerIndice_10_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12842);
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

                    otherlv_11=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleVariablesComplejas12854); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5958:1: ( (lv_segundoIndice_12_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5959:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5959:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5960:3: lv_segundoIndice_12_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceOperacionIndiceParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12875);
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

                    otherlv_13=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas12887); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5980:2: (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==45) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5980:4: otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) )
                            {
                            otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas12901); 

                                	newLeafNode(otherlv_14, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_1_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5984:1: ( (lv_campo_15_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5985:1: (lv_campo_15_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5985:1: (lv_campo_15_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5986:3: lv_campo_15_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12922);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6003:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6003:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6003:7: () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6003:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6004:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6009:2: ( (lv_nombre_registro_17_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6010:1: (lv_nombre_registro_17_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6010:1: (lv_nombre_registro_17_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6011:3: lv_nombre_registro_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas12962);
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

                    otherlv_18=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas12974); 

                        	newLeafNode(otherlv_18, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6031:1: ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6031:2: ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6031:2: ( (lv_campo_19_0= ruleCampoRegistro ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6032:1: (lv_campo_19_0= ruleCampoRegistro )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6032:1: (lv_campo_19_0= ruleCampoRegistro )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6033:3: lv_campo_19_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12996);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6049:2: (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==45) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6049:4: otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_20=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas13009); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6053:1: ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6054:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6054:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6055:3: lv_campo_21_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13030);
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
                    	    break loop117;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6079:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6080:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6081:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13070);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesBasicas13080); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6088:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6091:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt119=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==45) ) {
                    alt119=2;
                }
                else if ( (LA119_1==EOF||LA119_1==RULE_ID||(LA119_1>=RULE_INT && LA119_1<=RULE_CAR)||(LA119_1>=18 && LA119_1<=19)||(LA119_1>=26 && LA119_1<=27)||(LA119_1>=29 && LA119_1<=30)||(LA119_1>=32 && LA119_1<=33)||(LA119_1>=36 && LA119_1<=44)||(LA119_1>=48 && LA119_1<=49)||LA119_1==53||LA119_1==55||LA119_1==57||LA119_1==62||LA119_1==64||LA119_1==66||(LA119_1>=68 && LA119_1<=105)||(LA119_1>=110 && LA119_1<=111)) ) {
                    alt119=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 119, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt119=3;
                }
                break;
            case RULE_CAR:
                {
                alt119=4;
                }
                break;
            case 110:
            case 111:
                {
                alt119=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt119=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6092:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6093:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6098:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6099:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6099:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6100:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVariablesBasicas13136);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6117:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6118:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6123:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6124:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6124:1: (lv_valor_3_0= ruleEFloat )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6125:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleVariablesBasicas13174);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6142:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6142:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6142:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6142:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6143:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6148:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6149:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6149:1: (lv_contenido_5_0= RULE_CAD )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6150:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleVariablesBasicas13208); 

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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6167:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6167:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6167:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6167:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6168:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6173:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6174:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6174:1: (lv_contenido_7_0= RULE_CAR )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6175:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleVariablesBasicas13247); 

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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6192:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6192:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6192:7: () ( (lv_valor_9_0= ruleBooleano ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6192:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6193:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6198:2: ( (lv_valor_9_0= ruleBooleano ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6199:1: (lv_valor_9_0= ruleBooleano )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6199:1: (lv_valor_9_0= ruleBooleano )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6200:3: lv_valor_9_0= ruleBooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_ruleVariablesBasicas13290);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6217:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6217:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6217:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6217:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6218:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6223:2: ( (lv_nombre_11_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6224:1: (lv_nombre_11_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6224:1: (lv_nombre_11_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6225:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesBasicas13328);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6249:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6250:2: (iv_ruleSino= ruleSino EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6251:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino13365);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino13375); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6258:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6261:28: ( ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6262:1: ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6262:1: ( () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6262:2: () otherlv_1= 'si_no' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6262:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6263:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleSino13421); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getSi_noKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6272:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_ID||LA121_0==RULE_STRING||(LA121_0>=32 && LA121_0<=33)||(LA121_0>=36 && LA121_0<=44)||(LA121_0>=68 && LA121_0<=70)||LA121_0==73||LA121_0==76||LA121_0==78||LA121_0==82) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6272:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6272:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6273:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6273:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6274:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13443);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6290:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==RULE_ID||LA120_0==RULE_STRING||(LA120_0>=32 && LA120_0<=33)||(LA120_0>=36 && LA120_0<=44)||(LA120_0>=68 && LA120_0<=70)||LA120_0==73||LA120_0==76||LA120_0==78||LA120_0==82) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6291:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6291:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6292:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13464);
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
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6308:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==105) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6309:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6309:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6310:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino13488);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6334:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6335:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6336:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver13525);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver13535); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6343:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6346:28: ( ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6347:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6347:1: ( () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6347:2: () otherlv_1= 'devolver' ( (lv_devuelve_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6347:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleDevolver13581); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getDevolverKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6357:1: ( (lv_devuelve_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6358:1: (lv_devuelve_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6358:1: (lv_devuelve_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6359:3: lv_devuelve_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleDevolver13602);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6383:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6384:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6385:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13638);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion13648); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6392:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6395:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6396:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6396:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6396:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6396:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6397:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6397:1: (lv_paso_0_0= ruleTipoPaso )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6398:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion13694);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6414:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6415:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6415:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6416:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion13715);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleParametroFuncion13727); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6436:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6437:1: (lv_variable_3_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6437:1: (lv_variable_3_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6438:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion13748);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6462:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6463:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6464:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion13784);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion13794); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6471:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )? otherlv_11= 'inicio' ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )? ( (lv_devuelve_14_0= ruleDevolver ) )? otherlv_15= 'fin_inicio' otherlv_16= 'fin_funcion' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_parametrofuncion_6_0 = null;

        EObject lv_declaracion_9_0 = null;

        EObject lv_declaracion_10_0 = null;

        EObject lv_sentencias_12_0 = null;

        EObject lv_sentencias_13_0 = null;

        EObject lv_devuelve_14_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6474:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )? otherlv_11= 'inicio' ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )? ( (lv_devuelve_14_0= ruleDevolver ) )? otherlv_15= 'fin_inicio' otherlv_16= 'fin_funcion' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6475:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )? otherlv_11= 'inicio' ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )? ( (lv_devuelve_14_0= ruleDevolver ) )? otherlv_15= 'fin_inicio' otherlv_16= 'fin_funcion' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6475:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )? otherlv_11= 'inicio' ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )? ( (lv_devuelve_14_0= ruleDevolver ) )? otherlv_15= 'fin_inicio' otherlv_16= 'fin_funcion' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6475:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'funcion' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )? otherlv_11= 'inicio' ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )? ( (lv_devuelve_14_0= ruleDevolver ) )? otherlv_15= 'fin_inicio' otherlv_16= 'fin_funcion'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6475:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6476:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6476:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6477:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion13840);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFuncion13852); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFuncionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6497:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6498:1: (lv_nombre_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6498:1: (lv_nombre_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6499:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion13873);
            lv_nombre_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncion13885); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6519:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==46||(LA124_0>=108 && LA124_0<=109)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6519:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6519:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6520:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6520:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6521:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion13907);
                    lv_parametrofuncion_4_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_4_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6537:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==29) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6537:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncion13920); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6541:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6542:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6542:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6543:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion13941);
                    	    lv_parametrofuncion_6_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parametrofuncion",
                    	            		lv_parametrofuncion_6_0, 
                    	            		"ParametroFuncion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncion13957); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6563:1: (otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==19) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6563:3: otherlv_8= 'var' ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion13970); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getVarKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6567:1: ( ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )* )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==RULE_ID||LA126_0==RULE_STRING||(LA126_0>=85 && LA126_0<=89)) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6567:2: ( (lv_declaracion_9_0= ruleDeclaracion ) ) ( (lv_declaracion_10_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6567:2: ( (lv_declaracion_9_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6568:1: (lv_declaracion_9_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6568:1: (lv_declaracion_9_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6569:3: lv_declaracion_9_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_6_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion13992);
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

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6585:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )*
                            loop125:
                            do {
                                int alt125=2;
                                int LA125_0 = input.LA(1);

                                if ( (LA125_0==RULE_ID||LA125_0==RULE_STRING||(LA125_0>=85 && LA125_0<=89)) ) {
                                    alt125=1;
                                }


                                switch (alt125) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6586:1: (lv_declaracion_10_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6586:1: (lv_declaracion_10_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6587:3: lv_declaracion_10_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_6_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion14013);
                            	    lv_declaracion_10_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"declaracion",
                            	            		lv_declaracion_10_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

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


                    }
                    break;

            }

            otherlv_11=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFuncion14030); 

                	newLeafNode(otherlv_11, grammarAccess.getFuncionAccess().getInicioKeyword_7());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6607:1: ( ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )* )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_ID||LA129_0==RULE_STRING||(LA129_0>=32 && LA129_0<=33)||(LA129_0>=36 && LA129_0<=44)||(LA129_0>=68 && LA129_0<=70)||LA129_0==73||LA129_0==76||LA129_0==78||LA129_0==82) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6607:2: ( (lv_sentencias_12_0= ruleSentencias ) ) ( (lv_sentencias_13_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6607:2: ( (lv_sentencias_12_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6608:1: (lv_sentencias_12_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6608:1: (lv_sentencias_12_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6609:3: lv_sentencias_12_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion14052);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6625:2: ( (lv_sentencias_13_0= ruleSentencias ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==RULE_ID||LA128_0==RULE_STRING||(LA128_0>=32 && LA128_0<=33)||(LA128_0>=36 && LA128_0<=44)||(LA128_0>=68 && LA128_0<=70)||LA128_0==73||LA128_0==76||LA128_0==78||LA128_0==82) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6626:1: (lv_sentencias_13_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6626:1: (lv_sentencias_13_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6627:3: lv_sentencias_13_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion14073);
                    	    lv_sentencias_13_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_13_0, 
                    	            		"Sentencias");
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6643:5: ( (lv_devuelve_14_0= ruleDevolver ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==105) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6644:1: (lv_devuelve_14_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6644:1: (lv_devuelve_14_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6645:3: lv_devuelve_14_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_9_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion14097);
                    lv_devuelve_14_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_14_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFuncion14110); 

                	newLeafNode(otherlv_15, grammarAccess.getFuncionAccess().getFin_inicioKeyword_10());
                
            otherlv_16=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFuncion14122); 

                	newLeafNode(otherlv_16, grammarAccess.getFuncionAccess().getFin_funcionKeyword_11());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6677:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6678:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6679:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14158);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento14168); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6686:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? otherlv_13= 'fin_inicio' otherlv_14= 'fin_procedimiento' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;

        EObject lv_declaracion_8_0 = null;

        EObject lv_declaracion_9_0 = null;

        EObject lv_sentencias_11_0 = null;

        EObject lv_sentencias_12_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6689:28: ( (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? otherlv_13= 'fin_inicio' otherlv_14= 'fin_procedimiento' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6690:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? otherlv_13= 'fin_inicio' otherlv_14= 'fin_procedimiento' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6690:1: (otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? otherlv_13= 'fin_inicio' otherlv_14= 'fin_procedimiento' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6690:3: otherlv_0= 'procedimiento' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )? otherlv_10= 'inicio' ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )? otherlv_13= 'fin_inicio' otherlv_14= 'fin_procedimiento'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleProcedimiento14205); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedimientoKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6694:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6695:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6695:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6696:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento14226);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
            	        }
                   		set(
                   			current, 
                   			"nombre",
                    		lv_nombre_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcedimiento14238); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6716:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==46||(LA132_0>=108 && LA132_0<=109)) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6716:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6716:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6717:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6717:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6718:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14260);
                    lv_parametrofuncion_3_0=ruleParametroFuncion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"parametrofuncion",
                            		lv_parametrofuncion_3_0, 
                            		"ParametroFuncion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6734:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==29) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6734:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcedimiento14273); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6738:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6739:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6739:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6740:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14294);
                    	    lv_parametrofuncion_5_0=ruleParametroFuncion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
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
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcedimiento14310); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6760:1: (otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )? )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==19) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6760:3: otherlv_7= 'var' ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento14323); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getVarKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6764:1: ( ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )* )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==RULE_ID||LA134_0==RULE_STRING||(LA134_0>=85 && LA134_0<=89)) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6764:2: ( (lv_declaracion_8_0= ruleDeclaracion ) ) ( (lv_declaracion_9_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6764:2: ( (lv_declaracion_8_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6765:1: (lv_declaracion_8_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6765:1: (lv_declaracion_8_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6766:3: lv_declaracion_8_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento14345);
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

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6782:2: ( (lv_declaracion_9_0= ruleDeclaracion ) )*
                            loop133:
                            do {
                                int alt133=2;
                                int LA133_0 = input.LA(1);

                                if ( (LA133_0==RULE_ID||LA133_0==RULE_STRING||(LA133_0>=85 && LA133_0<=89)) ) {
                                    alt133=1;
                                }


                                switch (alt133) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6783:1: (lv_declaracion_9_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6783:1: (lv_declaracion_9_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6784:3: lv_declaracion_9_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento14366);
                            	    lv_declaracion_9_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
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
                            	    break loop133;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleProcedimiento14383); 

                	newLeafNode(otherlv_10, grammarAccess.getProcedimientoAccess().getInicioKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6804:1: ( ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )* )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_ID||LA137_0==RULE_STRING||(LA137_0>=32 && LA137_0<=33)||(LA137_0>=36 && LA137_0<=44)||(LA137_0>=68 && LA137_0<=70)||LA137_0==73||LA137_0==76||LA137_0==78||LA137_0==82) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6804:2: ( (lv_sentencias_11_0= ruleSentencias ) ) ( (lv_sentencias_12_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6804:2: ( (lv_sentencias_11_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6805:1: (lv_sentencias_11_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6805:1: (lv_sentencias_11_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6806:3: lv_sentencias_11_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento14405);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6822:2: ( (lv_sentencias_12_0= ruleSentencias ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==RULE_ID||LA136_0==RULE_STRING||(LA136_0>=32 && LA136_0<=33)||(LA136_0>=36 && LA136_0<=44)||(LA136_0>=68 && LA136_0<=70)||LA136_0==73||LA136_0==76||LA136_0==78||LA136_0==82) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6823:1: (lv_sentencias_12_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6823:1: (lv_sentencias_12_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6824:3: lv_sentencias_12_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento14426);
                    	    lv_sentencias_12_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
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
                    	    break loop136;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleProcedimiento14441); 

                	newLeafNode(otherlv_13, grammarAccess.getProcedimientoAccess().getFin_inicioKeyword_8());
                
            otherlv_14=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleProcedimiento14453); 

                	newLeafNode(otherlv_14, grammarAccess.getProcedimientoAccess().getFin_procedimientoKeyword_9());
                

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6856:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6857:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6858:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14490);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso14501); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6865:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6868:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6869:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6869:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt138=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt138=1;
                }
                break;
            case 108:
                {
                alt138=2;
                }
                break;
            case 109:
                {
                alt138=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6870:2: kw= 'E'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTipoPaso14539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6877:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleTipoPaso14558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6884:2: kw= 'S'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleTipoPaso14577); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6897:1: entryRuleBooleano returns [String current=null] : iv_ruleBooleano= ruleBooleano EOF ;
    public final String entryRuleBooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleano = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6898:2: (iv_ruleBooleano= ruleBooleano EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6899:2: iv_ruleBooleano= ruleBooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_entryRuleBooleano14618);
            iv_ruleBooleano=ruleBooleano();

            state._fsp--;

             current =iv_ruleBooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleano14629); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6906:1: ruleBooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'verdadero' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleBooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6909:28: ( (kw= 'verdadero' | kw= 'falso' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6910:1: (kw= 'verdadero' | kw= 'falso' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6910:1: (kw= 'verdadero' | kw= 'falso' )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==110) ) {
                alt139=1;
            }
            else if ( (LA139_0==111) ) {
                alt139=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }
            switch (alt139) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6911:2: kw= 'verdadero'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleBooleano14667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getVerdaderoKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:6918:2: kw= 'falso'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleBooleano14686); 

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
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA118 dfa118 = new DFA118(this);
    static final String DFA47_eotS =
        "\12\uffff";
    static final String DFA47_eofS =
        "\12\uffff";
    static final String DFA47_minS =
        "\1\4\4\uffff\2\62\1\4\2\uffff";
    static final String DFA47_maxS =
        "\1\74\4\uffff\2\62\1\75\2\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
    static final String DFA47_specialS =
        "\12\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\6\3\uffff\1\5\52\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\10\2\uffff\2\10\64\uffff\1\11",
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
            return "1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA49_eotS =
        "\12\uffff";
    static final String DFA49_eofS =
        "\12\uffff";
    static final String DFA49_minS =
        "\1\4\5\uffff\2\34\2\uffff";
    static final String DFA49_maxS =
        "\1\122\5\uffff\2\103\2\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\6";
    static final String DFA49_specialS =
        "\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\7\3\uffff\1\6\27\uffff\1\4\1\5\2\uffff\11\10\27\uffff\1\1\1\2\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "\1\10\20\uffff\1\11\6\uffff\1\11\16\uffff\1\11",
            "\1\10\20\uffff\1\11\6\uffff\1\11\16\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )";
        }
    }
    static final String DFA118_eotS =
        "\u0152\uffff";
    static final String DFA118_eofS =
        "\u0152\uffff";
    static final String DFA118_minS =
        "\1\4\2\55\1\uffff\1\4\3\60\14\4\2\uffff\22\60\43\4\55\60\56\4\74\60\40\4\55\60\14\4\22\60\2\4\3\60";
    static final String DFA118_maxS =
        "\1\10\2\64\1\uffff\1\10\3\143\14\10\2\uffff\22\143\43\10\55\143\56\10\74\143\40\10\55\143\14\10\22\143\2\10\3\143";
    static final String DFA118_acceptS =
        "\3\uffff\1\3\20\uffff\1\2\1\1\u013c\uffff";
    static final String DFA118_specialS =
        "\u0152\uffff}>";
    static final String[] DFA118_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\3\6\uffff\1\4",
            "\1\3\6\uffff\1\4",
            "",
            "\1\7\2\uffff\1\5\1\6",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\30\2\uffff\1\26\1\27",
            "\1\30\2\uffff\1\26\1\27",
            "\1\33\2\uffff\1\31\1\32",
            "\1\33\2\uffff\1\31\1\32",
            "\1\36\2\uffff\1\34\1\35",
            "\1\36\2\uffff\1\34\1\35",
            "\1\36\2\uffff\1\34\1\35",
            "\1\36\2\uffff\1\34\1\35",
            "\1\41\2\uffff\1\37\1\40",
            "\1\41\2\uffff\1\37\1\40",
            "\1\44\2\uffff\1\42\1\43",
            "\1\47\2\uffff\1\45\1\46",
            "",
            "",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\115\2\uffff\1\113\1\114",
            "\1\115\2\uffff\1\113\1\114",
            "\1\120\2\uffff\1\116\1\117",
            "\1\120\2\uffff\1\116\1\117",
            "\1\123\2\uffff\1\121\1\122",
            "\1\123\2\uffff\1\121\1\122",
            "\1\126\2\uffff\1\124\1\125",
            "\1\126\2\uffff\1\124\1\125",
            "\1\131\2\uffff\1\127\1\130",
            "\1\131\2\uffff\1\127\1\130",
            "\1\134\2\uffff\1\132\1\133",
            "\1\134\2\uffff\1\132\1\133",
            "\1\134\2\uffff\1\132\1\133",
            "\1\134\2\uffff\1\132\1\133",
            "\1\137\2\uffff\1\135\1\136",
            "\1\137\2\uffff\1\135\1\136",
            "\1\142\2\uffff\1\140\1\141",
            "\1\142\2\uffff\1\140\1\141",
            "\1\145\2\uffff\1\143\1\144",
            "\1\145\2\uffff\1\143\1\144",
            "\1\145\2\uffff\1\143\1\144",
            "\1\145\2\uffff\1\143\1\144",
            "\1\150\2\uffff\1\146\1\147",
            "\1\150\2\uffff\1\146\1\147",
            "\1\153\2\uffff\1\151\1\152",
            "\1\153\2\uffff\1\151\1\152",
            "\1\156\2\uffff\1\154\1\155",
            "\1\156\2\uffff\1\154\1\155",
            "\1\161\2\uffff\1\157\1\160",
            "\1\161\2\uffff\1\157\1\160",
            "\1\161\2\uffff\1\157\1\160",
            "\1\161\2\uffff\1\157\1\160",
            "\1\164\2\uffff\1\162\1\163",
            "\1\164\2\uffff\1\162\1\163",
            "\1\167\2\uffff\1\165\1\166",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\12\1\13\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\50\1\51",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\52\1\53",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\56\1\57",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\66\1\67",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\100\1\101",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u00a8\2\uffff\1\u00a6\1\u00a7",
            "\1\u00a8\2\uffff\1\u00a6\1\u00a7",
            "\1\u00ab\2\uffff\1\u00a9\1\u00aa",
            "\1\u00ab\2\uffff\1\u00a9\1\u00aa",
            "\1\u00ae\2\uffff\1\u00ac\1\u00ad",
            "\1\u00ae\2\uffff\1\u00ac\1\u00ad",
            "\1\u00b1\2\uffff\1\u00af\1\u00b0",
            "\1\u00b1\2\uffff\1\u00af\1\u00b0",
            "\1\u00b4\2\uffff\1\u00b2\1\u00b3",
            "\1\u00b4\2\uffff\1\u00b2\1\u00b3",
            "\1\u00b7\2\uffff\1\u00b5\1\u00b6",
            "\1\u00b7\2\uffff\1\u00b5\1\u00b6",
            "\1\u00ba\2\uffff\1\u00b8\1\u00b9",
            "\1\u00ba\2\uffff\1\u00b8\1\u00b9",
            "\1\u00bd\2\uffff\1\u00bb\1\u00bc",
            "\1\u00bd\2\uffff\1\u00bb\1\u00bc",
            "\1\u00c0\2\uffff\1\u00be\1\u00bf",
            "\1\u00c0\2\uffff\1\u00be\1\u00bf",
            "\1\u00c3\2\uffff\1\u00c1\1\u00c2",
            "\1\u00c3\2\uffff\1\u00c1\1\u00c2",
            "\1\u00c3\2\uffff\1\u00c1\1\u00c2",
            "\1\u00c3\2\uffff\1\u00c1\1\u00c2",
            "\1\u00c6\2\uffff\1\u00c4\1\u00c5",
            "\1\u00c6\2\uffff\1\u00c4\1\u00c5",
            "\1\u00c9\2\uffff\1\u00c7\1\u00c8",
            "\1\u00c9\2\uffff\1\u00c7\1\u00c8",
            "\1\u00cc\2\uffff\1\u00ca\1\u00cb",
            "\1\u00cc\2\uffff\1\u00ca\1\u00cb",
            "\1\u00cf\2\uffff\1\u00cd\1\u00ce",
            "\1\u00cf\2\uffff\1\u00cd\1\u00ce",
            "\1\u00d2\2\uffff\1\u00d0\1\u00d1",
            "\1\u00d2\2\uffff\1\u00d0\1\u00d1",
            "\1\u00d5\2\uffff\1\u00d3\1\u00d4",
            "\1\u00d5\2\uffff\1\u00d3\1\u00d4",
            "\1\u00d5\2\uffff\1\u00d3\1\u00d4",
            "\1\u00d5\2\uffff\1\u00d3\1\u00d4",
            "\1\u00d8\2\uffff\1\u00d6\1\u00d7",
            "\1\u00d8\2\uffff\1\u00d6\1\u00d7",
            "\1\u00db\2\uffff\1\u00d9\1\u00da",
            "\1\u00db\2\uffff\1\u00d9\1\u00da",
            "\1\u00de\2\uffff\1\u00dc\1\u00dd",
            "\1\u00de\2\uffff\1\u00dc\1\u00dd",
            "\1\u00de\2\uffff\1\u00dc\1\u00dd",
            "\1\u00de\2\uffff\1\u00dc\1\u00dd",
            "\1\u00e1\2\uffff\1\u00df\1\u00e0",
            "\1\u00e1\2\uffff\1\u00df\1\u00e0",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\54\1\55\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\14\1\15\1\16\1\17\1\170\1\171",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\60\1\61\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\172\1\173",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\174\1\175",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\70\1\71\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0080\1\u0081",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u0082\1\u0083",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u0086\1\u0087",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\102\1\103\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u008e\1\u008f",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u0090\1\u0091",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0094\1\u0095",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u009c\1\u009d",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u0104\2\uffff\1\u0102\1\u0103",
            "\1\u0104\2\uffff\1\u0102\1\u0103",
            "\1\u0107\2\uffff\1\u0105\1\u0106",
            "\1\u0107\2\uffff\1\u0105\1\u0106",
            "\1\u010a\2\uffff\1\u0108\1\u0109",
            "\1\u010a\2\uffff\1\u0108\1\u0109",
            "\1\u010d\2\uffff\1\u010b\1\u010c",
            "\1\u010d\2\uffff\1\u010b\1\u010c",
            "\1\u0110\2\uffff\1\u010e\1\u010f",
            "\1\u0110\2\uffff\1\u010e\1\u010f",
            "\1\u0113\2\uffff\1\u0111\1\u0112",
            "\1\u0113\2\uffff\1\u0111\1\u0112",
            "\1\u0116\2\uffff\1\u0114\1\u0115",
            "\1\u0116\2\uffff\1\u0114\1\u0115",
            "\1\u0119\2\uffff\1\u0117\1\u0118",
            "\1\u0119\2\uffff\1\u0117\1\u0118",
            "\1\u011c\2\uffff\1\u011a\1\u011b",
            "\1\u011c\2\uffff\1\u011a\1\u011b",
            "\1\u011f\2\uffff\1\u011d\1\u011e",
            "\1\u011f\2\uffff\1\u011d\1\u011e",
            "\1\u0122\2\uffff\1\u0120\1\u0121",
            "\1\u0122\2\uffff\1\u0120\1\u0121",
            "\1\u0125\2\uffff\1\u0123\1\u0124",
            "\1\u0125\2\uffff\1\u0123\1\u0124",
            "\1\u0128\2\uffff\1\u0126\1\u0127",
            "\1\u0128\2\uffff\1\u0126\1\u0127",
            "\1\u012b\2\uffff\1\u0129\1\u012a",
            "\1\u012b\2\uffff\1\u0129\1\u012a",
            "\1\u012e\2\uffff\1\u012c\1\u012d",
            "\1\u012e\2\uffff\1\u012c\1\u012d",
            "\1\u012e\2\uffff\1\u012c\1\u012d",
            "\1\u012e\2\uffff\1\u012c\1\u012d",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\176\1\177\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\20\1\21\1\62\1\63\1\64\1\65\1\u00e2\1\u00e3",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0084\1\u0085\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\72\1\73\1\74\1\75\1\u00e4\1\u00e5",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u0088\1\u0089\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e6\1\u00e7",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u00e8\1\u00e9",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0092\1\u0093\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\104\1\105\1\106\1\107\1\u00ec\1\u00ed",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u0096\1\u0097\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00ee\1\u00ef",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u00f0\1\u00f1",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u009e\1\u009f\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f4\1\u00f5",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00f6\1\u00f7",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u00fa\1\u00fb",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u013d\2\uffff\1\u013b\1\u013c",
            "\1\u013d\2\uffff\1\u013b\1\u013c",
            "\1\u0140\2\uffff\1\u013e\1\u013f",
            "\1\u0140\2\uffff\1\u013e\1\u013f",
            "\1\u0143\2\uffff\1\u0141\1\u0142",
            "\1\u0143\2\uffff\1\u0141\1\u0142",
            "\1\u0146\2\uffff\1\u0144\1\u0145",
            "\1\u0146\2\uffff\1\u0144\1\u0145",
            "\1\u0149\2\uffff\1\u0147\1\u0148",
            "\1\u0149\2\uffff\1\u0147\1\u0148",
            "\1\u014c\2\uffff\1\u014a\1\u014b",
            "\1\u014c\2\uffff\1\u014a\1\u014b",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u00ea\1\u00eb\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\22\1\76\1\77\1\u008a\1\u008b\1\u008c\1\u008d\1\u012f\1\u0130",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u00f2\1\u00f3\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\110\1\111\1\u0098\1\u0099\1\u009a\1\u009b\1\u0131\1\u0132",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00f8\1\u00f9\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u0133\1\u0134",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u00fc\1\u00fd\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0135\1\u0136",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0137\1\u0138",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e",
            "\1\u0151\2\uffff\1\u014f\1\u0150",
            "\1\u0151\2\uffff\1\u014f\1\u0150",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e",
            "\1\u0139\1\u013a\3\uffff\1\25\3\uffff\1\24\40\uffff\1\23\1\112\1\u00a4\1\u00a5\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u014d\1\u014e"
    };

    static final short[] DFA118_eot = DFA.unpackEncodedString(DFA118_eotS);
    static final short[] DFA118_eof = DFA.unpackEncodedString(DFA118_eofS);
    static final char[] DFA118_min = DFA.unpackEncodedStringToUnsignedChars(DFA118_minS);
    static final char[] DFA118_max = DFA.unpackEncodedStringToUnsignedChars(DFA118_maxS);
    static final short[] DFA118_accept = DFA.unpackEncodedString(DFA118_acceptS);
    static final short[] DFA118_special = DFA.unpackEncodedString(DFA118_specialS);
    static final short[][] DFA118_transition;

    static {
        int numStates = DFA118_transitionS.length;
        DFA118_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA118_transition[i] = DFA.unpackEncodedString(DFA118_transitionS[i]);
        }
    }

    class DFA118 extends DFA {

        public DFA118(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 118;
            this.eot = DFA118_eot;
            this.eof = DFA118_eof;
            this.min = DFA118_min;
            this.max = DFA118_max;
            this.accept = DFA118_accept;
            this.special = DFA118_special;
            this.transition = DFA118_transition;
        }
        public String getDescription() {
            return "5835:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_ruleCodigo132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_ruleCodigo159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_entryRuleAlgoritmo194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlgoritmo204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleAlgoritmo241 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAlgoritmo262 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo284 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo305 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_15_in_ruleAlgoritmo321 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo342 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo362 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleAlgoritmo377 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_17_in_ruleAlgoritmo392 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo414 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo435 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_18_in_ruleAlgoritmo453 = new BitSet(new long[]{0x15080000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo475 = new BitSet(new long[]{0x15080000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo496 = new BitSet(new long[]{0x15080000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_19_in_ruleAlgoritmo514 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo536 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo557 = new BitSet(new long[]{0x00000000080E8130L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo584 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo605 = new BitSet(new long[]{0x00000000080E8020L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleAlgoritmo629 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAlgoritmo641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_entryRuleModulo677 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModulo687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleModulo724 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo741 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModulo758 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo779 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo799 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleModulo814 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleModulo827 = new BitSet(new long[]{0x00000000088E0000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_17_in_ruleModulo840 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo862 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo883 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_18_in_ruleModulo901 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo923 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo944 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_19_in_ruleModulo962 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo984 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo1005 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1032 = new BitSet(new long[]{0x0000000008800000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1053 = new BitSet(new long[]{0x0000000008800000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_23_in_ruleModulo1068 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleImplementacion_in_ruleModulo1090 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleModulo1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementacion_in_entryRuleImplementacion1138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementacion1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleImplementacion1195 = new BitSet(new long[]{0x000000000C0E0000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_17_in_ruleImplementacion1208 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1230 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1251 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_18_in_ruleImplementacion1269 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1291 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1312 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_19_in_ruleImplementacion1330 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1352 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1373 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1400 = new BitSet(new long[]{0x000000000C000000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1421 = new BitSet(new long[]{0x000000000C000000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_26_in_ruleImplementacion1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraSubproceso1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCabeceraProcedimiento1639 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCabeceraProcedimiento1660 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraProcedimiento1672 = new BitSet(new long[]{0x0000400040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1694 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraProcedimiento1707 = new BitSet(new long[]{0x0000400000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1728 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraProcedimiento1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraFuncion1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1836 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCabeceraFuncion1848 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCabeceraFuncion1869 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraFuncion1881 = new BitSet(new long[]{0x0000400040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1903 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraFuncion1916 = new BitSet(new long[]{0x0000400000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1937 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraFuncion1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso2216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario2335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario2345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComentario2390 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias2447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_ruleSentencias2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque2701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir3020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFuncionFicheroAbrir3067 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncionFicheroAbrir3079 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3101 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3113 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3134 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3146 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3167 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroAbrir3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3216 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroCerrar3263 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncionFicheroCerrar3275 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3296 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroCerrar3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura3345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleModoApertura3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleModoApertura3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna3465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleNombreInterna3503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleNombreInterna3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNombreInterna3541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNombreInterna3560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNombreInterna3579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNombreInterna3598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNombreInterna3617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleNombreInterna3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleNombreInterna3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3696 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3842 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleEFloat3860 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3875 = new BitSet(new long[]{0x0000C00000000002L});
        public static final BitSet FOLLOW_46_in_ruleEFloat3895 = new BitSet(new long[]{0x0003000000000080L});
        public static final BitSet FOLLOW_47_in_ruleEFloat3914 = new BitSet(new long[]{0x0003000000000080L});
        public static final BitSet FOLLOW_48_in_ruleEFloat3929 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_49_in_ruleEFloat3948 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro4012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro4067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo4102 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo4112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido4231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente4321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes4401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes4457 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleConstantes4469 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector4536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleVector4573 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVector4585 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector4606 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVector4618 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVector4630 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector4651 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleVector4663 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector4684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz4720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz4730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMatriz4767 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleMatriz4779 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4800 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleMatriz4812 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4833 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleMatriz4845 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleMatriz4857 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4878 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMatriz4890 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRegistro4994 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro5015 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5037 = new BitSet(new long[]{0x0800000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5058 = new BitSet(new long[]{0x0800000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_59_in_ruleRegistro5072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo5108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleArchivo5155 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo5176 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleArchivo5188 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado5245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado5255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado5301 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleEnumerado5313 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleEnumerado5325 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5347 = new BitSet(new long[]{0x4000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEnumerado5360 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5381 = new BitSet(new long[]{0x4000000020000000L});
        public static final BitSet FOLLOW_62_in_ruleEnumerado5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango5432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango5442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico5561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico5607 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoNumerico5619 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5641 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleSubrangoNumerico5653 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado5721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5767 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoEnumerado5779 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5801 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleSubrangoEnumerado5813 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio5871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio5881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleInicio5918 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleInicio5939 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5961 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5982 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleInicio5997 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6019 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6040 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_66_in_ruleInicio6055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable6224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6270 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDeclaracionVariable6282 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6303 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionVariable6316 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6337 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6375 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia6385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia6431 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDeclaracionPropia6443 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6464 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionPropia6477 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6498 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion6536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion6546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal6665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal6711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAsignacionNormal6723 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionNormal6744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAsignacionCompleja6848 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleEscribir6952 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEscribir6964 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6985 = new BitSet(new long[]{0x00001FF060000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_29_in_ruleEscribir6999 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir7020 = new BitSet(new long[]{0x00001FF060000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir7048 = new BitSet(new long[]{0x00001FF060000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_30_in_ruleEscribir7062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer7098 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLeer7145 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLeer7157 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer7178 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLeer7190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi7226 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi7236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleSi7273 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleSi7294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleSi7306 = new BitSet(new long[]{0x00001FF300000790L,0x0000C3E000045370L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7328 = new BitSet(new long[]{0x00001FF300000790L,0x0000C3E000045370L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7349 = new BitSet(new long[]{0x00001FF300000790L,0x0000C3E000045370L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi7373 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000100L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi7395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleSi7408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras7444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras7454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulemientras7491 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulemientras7512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulemientras7524 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045A70L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7546 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045A70L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7567 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045A70L});
        public static final BitSet FOLLOW_75_in_rulemientras7582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir7618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir7628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulerepetir7665 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000047270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7687 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000047270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7708 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000047270L});
        public static final BitSet FOLLOW_77_in_rulerepetir7723 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulerepetir7744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruledesde7827 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde7848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruledesde7860 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruledesde7881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruledesde7893 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000055270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7915 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000055270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7936 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000055270L});
        public static final BitSet FOLLOW_80_in_ruledesde7951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso7987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso7997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleCaso8034 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso8055 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleCaso8067 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8089 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8110 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso8134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun8171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun8181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesegun8218 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulesegun8230 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_rulesegun8251 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulesegun8263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulesegun8275 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8297 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8318 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_83_in_rulesegun8333 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000145270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8355 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000145270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8376 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000145270L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun8400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_rulesegun8413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable8461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleTipoVariable8499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleTipoVariable8518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleTipoVariable8537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleTipoVariable8556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleTipoVariable8575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable8625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr8719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr8730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_rulesignoOr8767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd8807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd8818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rulesignoAnd8855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad8906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_rulesignoIgualdad8944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_rulesignoIgualdad8963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion9015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_rulesignoComparacion9053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_rulesignoComparacion9072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_rulesignoComparacion9091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_rulesignoComparacion9110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma9151 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma9162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulesignoSuma9199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta9239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta9250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulesignoResta9287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion9338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_rulesignoMultiplicacion9375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision9415 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision9426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_rulesignoDivision9463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoModulo_in_entryRulesignoModulo9503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoModulo9514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_rulesignoModulo9551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion9590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion9600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion9646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr9690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9737 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr9767 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9788 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd9836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd9883 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd9913 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd9934 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleMod_in_entryRuleMod9972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMod9982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod10029 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
        public static final BitSet FOLLOW_rulesignoModulo_in_ruleMod10059 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod10080 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad10118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad10128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10175 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad10205 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10226 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion10264 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion10274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10321 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion10351 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10372 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta10410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta10420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10467 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta10499 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta10537 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10560 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision10608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10655 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10687 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10725 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10748 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacionIndice10796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_ruleoperacionIndice10842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_entryRuleOrIndice10876 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrIndice10886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice10933 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOrIndice10963 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice10984 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleAndIndice_in_entryRuleAndIndice11022 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndIndice11032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11079 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAndIndice11109 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11130 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdadIndice11178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11225 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11255 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11276 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11314 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacionIndice11324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11371 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11401 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11422 = new BitSet(new long[]{0x0000000000000002L,0x00000003C0000000L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaRestaIndice11470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11517 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11549 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11587 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11610 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11705 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11737 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11775 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11798 = new BitSet(new long[]{0x0000000000000002L,0x0000000C00000000L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice11836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimariaIndice11846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePrimariaIndice11902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimariaIndice11940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria11977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria11987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_rulePrimaria12034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_rulePrimaria12052 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12074 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_101_in_rulePrimaria12085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_rulePrimaria12114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_rulePrimaria12141 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12162 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria12174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_rulePrimaria12203 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePrimaria12215 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria12236 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria12248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_rulePrimaria12277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_entryRuleFunciones12312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunciones12322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFunciones12378 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunciones12390 = new BitSet(new long[]{0x00001FF040000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12412 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12425 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12446 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleFunciones12500 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunciones12512 = new BitSet(new long[]{0x00001FF040000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12534 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12547 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12568 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesComplejas12631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas12688 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVariablesComplejas12700 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12721 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas12733 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas12747 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas12809 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVariablesComplejas12821 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12842 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleVariablesComplejas12854 = new BitSet(new long[]{0x0000000000000190L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas12875 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas12887 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas12901 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas12962 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas12974 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas12996 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas13009 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13030 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesBasicas13080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVariablesBasicas13136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleVariablesBasicas13174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleVariablesBasicas13208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleVariablesBasicas13247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_ruleVariablesBasicas13290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesBasicas13328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino13365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino13375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleSino13421 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13443 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13464 = new BitSet(new long[]{0x00001FF300000792L,0x0000C2E000045270L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino13488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver13525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver13535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleDevolver13581 = new BitSet(new long[]{0x00001FF000000790L,0x0000C0E000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleDevolver13602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion13648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion13694 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion13715 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleParametroFuncion13727 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion13748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion13784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion13794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion13840 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleFuncion13852 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion13873 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncion13885 = new BitSet(new long[]{0x0000400040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion13907 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncion13920 = new BitSet(new long[]{0x0000400000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion13941 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncion13957 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleFuncion13970 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion13992 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion14013 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleFuncion14030 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion14052 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion14073 = new BitSet(new long[]{0x00001FF300000790L,0x0000C2E000045274L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion14097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleFuncion14110 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFuncion14122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento14168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleProcedimiento14205 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento14226 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleProcedimiento14238 = new BitSet(new long[]{0x0000400040000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14260 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleProcedimiento14273 = new BitSet(new long[]{0x0000400000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14294 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleProcedimiento14310 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento14323 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento14345 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento14366 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleProcedimiento14383 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento14405 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento14426 = new BitSet(new long[]{0x00001FF300000790L,0x0000C0E000045274L});
        public static final BitSet FOLLOW_66_in_ruleProcedimiento14441 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleProcedimiento14453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14490 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso14501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTipoPaso14539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleTipoPaso14558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleTipoPaso14577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_entryRuleBooleano14618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleano14629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleBooleano14667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleBooleano14686 = new BitSet(new long[]{0x0000000000000002L});
    }


}