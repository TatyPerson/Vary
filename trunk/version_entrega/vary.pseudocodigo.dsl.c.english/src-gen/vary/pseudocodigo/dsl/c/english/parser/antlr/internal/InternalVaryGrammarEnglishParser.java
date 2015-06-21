package vary.pseudocodigo.dsl.c.english.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import vary.pseudocodigo.dsl.c.english.services.VaryGrammarEnglishGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVaryGrammarEnglishParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algorithm'", "'import'", "'end_import'", "'const'", "'type'", "'var'", "'end_algorithm'", "'Module'", "'export'", "'end_export'", "'end_module'", "'implementation'", "'end_implementation'", "'procedure'", "'('", "','", "')'", "'function'", "'open'", "'close'", "'writing'", "'reading'", "'cos'", "'square'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'length'", "'concatena'", "'.'", "'E'", "'e'", "'+'", "'-'", "'='", "'vector'", "'['", "']'", "'of'", "': '", "'matrix'", "']['", "'registry:'", "'end_registry'", "'archive of '", "'{'", "'}'", "'..'", "'main'", "'initiation'", "'end_initiation'", "'<-'", "'write'", "'read'", "'if'", "'then'", "'end_if'", "'while'", "'do'", "'end_while'", "'repeat'", "'until'", "'for'", "'to'", "'end_for'", "'case'", "'according_to'", "'otherwise:'", "'end_according_to'", "'integer'", "'character'", "'real'", "'boolean'", "'string'", "'true'", "'false'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", "'*'", "'/'", "'|'", "'-('", "'not'", "'else'", "'return'", "'end_function'", "'end_procedure'", "'E/S'", "'S'"
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


        public InternalVaryGrammarEnglishParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaryGrammarEnglishParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaryGrammarEnglishParser.tokenNames; }
    public String getGrammarFileName() { return "../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g"; }



     	private VaryGrammarEnglishGrammarAccess grammarAccess;
     	
        public InternalVaryGrammarEnglishParser(TokenStream input, VaryGrammarEnglishGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Codigo";	
       	}
       	
       	@Override
       	protected VaryGrammarEnglishGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCodigo"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:67:1: entryRuleCodigo returns [EObject current=null] : iv_ruleCodigo= ruleCodigo EOF ;
    public final EObject entryRuleCodigo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodigo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:68:2: (iv_ruleCodigo= ruleCodigo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:69:2: iv_ruleCodigo= ruleCodigo EOF
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:76:1: ruleCodigo returns [EObject current=null] : (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        EObject this_Algoritmo_0 = null;

        EObject this_Modulo_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:79:28: ( (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:80:1: (this_Algoritmo_0= ruleAlgoritmo | this_Modulo_1= ruleModulo )
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:81:5: this_Algoritmo_0= ruleAlgoritmo
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:91:5: this_Modulo_1= ruleModulo
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:107:1: entryRuleAlgoritmo returns [EObject current=null] : iv_ruleAlgoritmo= ruleAlgoritmo EOF ;
    public final EObject entryRuleAlgoritmo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgoritmo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:108:2: (iv_ruleAlgoritmo= ruleAlgoritmo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:109:2: iv_ruleAlgoritmo= ruleAlgoritmo EOF
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:116:1: ruleAlgoritmo returns [EObject current=null] : (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? otherlv_4= 'import' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'end_import' (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'end_algorithm' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:119:28: ( (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? otherlv_4= 'import' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'end_import' (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'end_algorithm' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:1: (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? otherlv_4= 'import' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'end_import' (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'end_algorithm' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:1: (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? otherlv_4= 'import' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'end_import' (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'end_algorithm' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:3: otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? otherlv_4= 'import' ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )? otherlv_7= 'end_import' (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )? (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )? (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )? ( (lv_tiene_19_0= ruleInicio ) ) otherlv_20= 'end_algorithm'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAlgoritmo241); 

                	newLeafNode(otherlv_0, grammarAccess.getAlgoritmoAccess().getAlgorithmKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:124:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:125:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:125:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:126:3: lv_nombre_1_0= ruleEString
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:142:2: ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:142:3: ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:142:3: ( (lv_comentarios_2_0= ruleComentario ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:143:1: (lv_comentarios_2_0= ruleComentario )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:143:1: (lv_comentarios_2_0= ruleComentario )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:144:3: lv_comentarios_2_0= ruleComentario
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:160:2: ( (lv_comentarios_3_0= ruleComentario ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_SL_COMMENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:161:1: (lv_comentarios_3_0= ruleComentario )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:161:1: (lv_comentarios_3_0= ruleComentario )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:162:3: lv_comentarios_3_0= ruleComentario
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

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAlgoritmo320); 

                	newLeafNode(otherlv_4, grammarAccess.getAlgoritmoAccess().getImportKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:182:1: ( ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:182:2: ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:182:2: ( (otherlv_5= RULE_ID ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:183:1: (otherlv_5= RULE_ID )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:183:1: (otherlv_5= RULE_ID )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:184:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlgoritmo341); 

                    		newLeafNode(otherlv_5, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:195:2: ( (otherlv_6= RULE_ID ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:196:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:196:1: (otherlv_6= RULE_ID )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:197:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlgoritmo361); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_4_1_0()); 
                    	    	

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

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAlgoritmo376); 

                	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getEnd_importKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:212:1: (otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:212:3: otherlv_8= 'const' ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )?
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAlgoritmo389); 

                        	newLeafNode(otherlv_8, grammarAccess.getAlgoritmoAccess().getConstKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:216:1: ( ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID||LA7_0==RULE_STRING) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:216:2: ( (lv_constantes_9_0= ruleConstantes ) ) ( (lv_constantes_10_0= ruleConstantes ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:216:2: ( (lv_constantes_9_0= ruleConstantes ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:217:1: (lv_constantes_9_0= ruleConstantes )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:217:1: (lv_constantes_9_0= ruleConstantes )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:218:3: lv_constantes_9_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_6_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleAlgoritmo411);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:234:2: ( (lv_constantes_10_0= ruleConstantes ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:235:1: (lv_constantes_10_0= ruleConstantes )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:235:1: (lv_constantes_10_0= ruleConstantes )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:236:3: lv_constantes_10_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_6_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleAlgoritmo432);
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
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:252:7: (otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:252:9: otherlv_11= 'type' ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAlgoritmo450); 

                        	newLeafNode(otherlv_11, grammarAccess.getAlgoritmoAccess().getTypeKeyword_7_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:256:1: ( ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING||LA10_0==51||LA10_0==56||LA10_0==58||LA10_0==60) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:256:2: ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:256:2: ( (lv_tipocomplejo_12_0= ruleTipoComplejo ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:257:1: (lv_tipocomplejo_12_0= ruleTipoComplejo )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:257:1: (lv_tipocomplejo_12_0= ruleTipoComplejo )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:258:3: lv_tipocomplejo_12_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_7_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo472);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:274:2: ( (lv_tipocomplejo_13_0= ruleTipoComplejo ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING||LA9_0==51||LA9_0==56||LA9_0==58||LA9_0==60) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:275:1: (lv_tipocomplejo_13_0= ruleTipoComplejo )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:275:1: (lv_tipocomplejo_13_0= ruleTipoComplejo )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:276:3: lv_tipocomplejo_13_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_7_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo493);
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
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:292:7: (otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:292:9: otherlv_14= 'var' ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlgoritmo511); 

                        	newLeafNode(otherlv_14, grammarAccess.getAlgoritmoAccess().getVarKeyword_8_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:296:1: ( ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )* )?
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
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:296:2: ( (lv_global_15_0= ruleDeclaracion ) ) ( (lv_global_16_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:296:2: ( (lv_global_15_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:297:1: (lv_global_15_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:297:1: (lv_global_15_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:298:3: lv_global_15_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleAlgoritmo533);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:314:2: ( (lv_global_16_0= ruleDeclaracion ) )*
                            loop12:
                            do {
                                int alt12=2;
                                switch ( input.LA(1) ) {
                                case 85:
                                    {
                                    int LA12_1 = input.LA(2);

                                    if ( (LA12_1==55) ) {
                                        alt12=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA12_2 = input.LA(2);

                                    if ( (LA12_2==55) ) {
                                        alt12=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA12_3 = input.LA(2);

                                    if ( (LA12_3==55) ) {
                                        alt12=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA12_4 = input.LA(2);

                                    if ( (LA12_4==55) ) {
                                        alt12=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA12_5 = input.LA(2);

                                    if ( (LA12_5==55) ) {
                                        alt12=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt12=1;
                                    }
                                    break;

                                }

                                switch (alt12) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:315:1: (lv_global_16_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:315:1: (lv_global_16_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:316:3: lv_global_16_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_8_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleAlgoritmo554);
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
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:332:7: ( ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27||(LA16_0>=85 && LA16_0<=89)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:332:8: ( (lv_funcion_17_0= ruleSubproceso ) ) ( (lv_funcion_18_0= ruleSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:332:8: ( (lv_funcion_17_0= ruleSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:333:1: (lv_funcion_17_0= ruleSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:333:1: (lv_funcion_17_0= ruleSubproceso )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:334:3: lv_funcion_17_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleAlgoritmo581);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:350:2: ( (lv_funcion_18_0= ruleSubproceso ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==27||(LA15_0>=85 && LA15_0<=89)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:351:1: (lv_funcion_18_0= ruleSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:351:1: (lv_funcion_18_0= ruleSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:352:3: lv_funcion_18_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleAlgoritmo602);
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:368:5: ( (lv_tiene_19_0= ruleInicio ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:369:1: (lv_tiene_19_0= ruleInicio )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:369:1: (lv_tiene_19_0= ruleInicio )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:370:3: lv_tiene_19_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTieneInicioParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleAlgoritmo626);
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

            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlgoritmo638); 

                	newLeafNode(otherlv_20, grammarAccess.getAlgoritmoAccess().getEnd_algorithmKeyword_11());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:398:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:399:2: (iv_ruleModulo= ruleModulo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:400:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModulo_in_entryRuleModulo674);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModulo684); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:407:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'end_import' otherlv_6= 'export' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'end_export' ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'end_module' ) ;
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

        EObject lv_exporta_globales_14_0 = null;

        EObject lv_exporta_globales_15_0 = null;

        EObject lv_exporta_funciones_16_0 = null;

        EObject lv_exporta_funciones_17_0 = null;

        EObject lv_implementacion_19_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:410:28: ( (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'end_import' otherlv_6= 'export' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'end_export' ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'end_module' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:411:1: (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'end_import' otherlv_6= 'export' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'end_export' ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'end_module' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:411:1: (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'end_import' otherlv_6= 'export' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'end_export' ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'end_module' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:411:3: otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )? otherlv_5= 'end_import' otherlv_6= 'export' (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )? (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )? (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )? ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )? otherlv_18= 'end_export' ( (lv_implementacion_19_0= ruleImplementacion ) ) otherlv_20= 'end_module'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleModulo721); 

                	newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getModuleKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:415:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:416:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:416:1: (lv_nombre_1_0= RULE_ID )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:417:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo738); 

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

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModulo755); 

                	newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getImportKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:437:1: ( ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:437:2: ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= RULE_ID ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:437:2: ( (otherlv_3= RULE_ID ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:438:1: (otherlv_3= RULE_ID )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:438:1: (otherlv_3= RULE_ID )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:439:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuloRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo776); 

                    		newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:450:2: ( (otherlv_4= RULE_ID ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:451:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:451:1: (otherlv_4= RULE_ID )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:452:3: otherlv_4= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getModuloRule());
                    	    	        }
                    	            
                    	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo796); 

                    	    		newLeafNode(otherlv_4, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModulo811); 

                	newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getEnd_importKeyword_4());
                
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModulo823); 

                	newLeafNode(otherlv_6, grammarAccess.getModuloAccess().getExportKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:471:1: (otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:471:3: otherlv_7= 'const' ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )?
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModulo836); 

                        	newLeafNode(otherlv_7, grammarAccess.getModuloAccess().getConstKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:475:1: ( ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:475:2: ( (lv_exporta_constantes_8_0= ruleEString ) ) ( (lv_exporta_constantes_9_0= ruleEString ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:475:2: ( (lv_exporta_constantes_8_0= ruleEString ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:476:1: (lv_exporta_constantes_8_0= ruleEString )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:476:1: (lv_exporta_constantes_8_0= ruleEString )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:477:3: lv_exporta_constantes_8_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_6_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo858);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:493:2: ( (lv_exporta_constantes_9_0= ruleEString ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:494:1: (lv_exporta_constantes_9_0= ruleEString )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:494:1: (lv_exporta_constantes_9_0= ruleEString )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:495:3: lv_exporta_constantes_9_0= ruleEString
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_6_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo879);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:511:7: (otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:511:9: otherlv_10= 'type' ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )?
                    {
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModulo897); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuloAccess().getTypeKeyword_7_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:515:1: ( ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:515:2: ( (lv_exporta_tipos_11_0= ruleEString ) ) ( (lv_exporta_tipos_12_0= ruleEString ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:515:2: ( (lv_exporta_tipos_11_0= ruleEString ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:516:1: (lv_exporta_tipos_11_0= ruleEString )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:516:1: (lv_exporta_tipos_11_0= ruleEString )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:517:3: lv_exporta_tipos_11_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_7_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo919);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:533:2: ( (lv_exporta_tipos_12_0= ruleEString ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==RULE_ID||LA22_0==RULE_STRING) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:534:1: (lv_exporta_tipos_12_0= ruleEString )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:534:1: (lv_exporta_tipos_12_0= ruleEString )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:535:3: lv_exporta_tipos_12_0= ruleEString
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_7_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo940);
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
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:551:7: (otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:551:9: otherlv_13= 'var' ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModulo958); 

                        	newLeafNode(otherlv_13, grammarAccess.getModuloAccess().getVarKeyword_8_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:555:1: ( ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )* )?
                    int alt26=2;
                    switch ( input.LA(1) ) {
                        case 85:
                            {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1==55) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case 86:
                            {
                            int LA26_2 = input.LA(2);

                            if ( (LA26_2==55) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case 87:
                            {
                            int LA26_3 = input.LA(2);

                            if ( (LA26_3==55) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case 88:
                            {
                            int LA26_4 = input.LA(2);

                            if ( (LA26_4==55) ) {
                                alt26=1;
                            }
                            }
                            break;
                        case 89:
                            {
                            int LA26_5 = input.LA(2);

                            if ( (LA26_5==55) ) {
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
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:555:2: ( (lv_exporta_globales_14_0= ruleDeclaracion ) ) ( (lv_exporta_globales_15_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:555:2: ( (lv_exporta_globales_14_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:556:1: (lv_exporta_globales_14_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:556:1: (lv_exporta_globales_14_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:557:3: lv_exporta_globales_14_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalesDeclaracionParserRuleCall_8_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleModulo980);
                            lv_exporta_globales_14_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"exporta_globales",
                                    		lv_exporta_globales_14_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:573:2: ( (lv_exporta_globales_15_0= ruleDeclaracion ) )*
                            loop25:
                            do {
                                int alt25=2;
                                switch ( input.LA(1) ) {
                                case 85:
                                    {
                                    int LA25_2 = input.LA(2);

                                    if ( (LA25_2==55) ) {
                                        alt25=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA25_3 = input.LA(2);

                                    if ( (LA25_3==55) ) {
                                        alt25=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA25_4 = input.LA(2);

                                    if ( (LA25_4==55) ) {
                                        alt25=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA25_5 = input.LA(2);

                                    if ( (LA25_5==55) ) {
                                        alt25=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA25_6 = input.LA(2);

                                    if ( (LA25_6==55) ) {
                                        alt25=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt25=1;
                                    }
                                    break;

                                }

                                switch (alt25) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:574:1: (lv_exporta_globales_15_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:574:1: (lv_exporta_globales_15_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:575:3: lv_exporta_globales_15_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalesDeclaracionParserRuleCall_8_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleModulo1001);
                            	    lv_exporta_globales_15_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"exporta_globales",
                            	            		lv_exporta_globales_15_0, 
                            	            		"Declaracion");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:591:7: ( ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27||(LA29_0>=85 && LA29_0<=89)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:591:8: ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) ) ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:591:8: ( (lv_exporta_funciones_16_0= ruleCabeceraSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:592:1: (lv_exporta_funciones_16_0= ruleCabeceraSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:592:1: (lv_exporta_funciones_16_0= ruleCabeceraSubproceso )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:593:3: lv_exporta_funciones_16_0= ruleCabeceraSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1028);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:609:2: ( (lv_exporta_funciones_17_0= ruleCabeceraSubproceso ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27||(LA28_0>=85 && LA28_0<=89)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:610:1: (lv_exporta_funciones_17_0= ruleCabeceraSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:610:1: (lv_exporta_funciones_17_0= ruleCabeceraSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:611:3: lv_exporta_funciones_17_0= ruleCabeceraSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1049);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModulo1064); 

                	newLeafNode(otherlv_18, grammarAccess.getModuloAccess().getEnd_exportKeyword_10());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:631:1: ( (lv_implementacion_19_0= ruleImplementacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:632:1: (lv_implementacion_19_0= ruleImplementacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:632:1: (lv_implementacion_19_0= ruleImplementacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:633:3: lv_implementacion_19_0= ruleImplementacion
            {
             
            	        newCompositeNode(grammarAccess.getModuloAccess().getImplementacionImplementacionParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_ruleModulo1085);
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

            otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModulo1097); 

                	newLeafNode(otherlv_20, grammarAccess.getModuloAccess().getEnd_moduleKeyword_12());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:661:1: entryRuleImplementacion returns [EObject current=null] : iv_ruleImplementacion= ruleImplementacion EOF ;
    public final EObject entryRuleImplementacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:662:2: (iv_ruleImplementacion= ruleImplementacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:663:2: iv_ruleImplementacion= ruleImplementacion EOF
            {
             newCompositeNode(grammarAccess.getImplementacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_entryRuleImplementacion1133);
            iv_ruleImplementacion=ruleImplementacion();

            state._fsp--;

             current =iv_ruleImplementacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementacion1143); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:670:1: ruleImplementacion returns [EObject current=null] : ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'end_implementation' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:673:28: ( ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'end_implementation' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:674:1: ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'end_implementation' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:674:1: ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'end_implementation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:674:2: () otherlv_1= 'implementation' (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )? (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )? (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )? otherlv_13= 'end_implementation'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:674:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:675:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplementacionAccess().getImplementacionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleImplementacion1189); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementationKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:684:1: (otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:684:3: otherlv_2= 'const' ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleImplementacion1202); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplementacionAccess().getConstKeyword_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:688:1: ( ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID||LA31_0==RULE_STRING) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:688:2: ( (lv_constantes_3_0= ruleConstantes ) ) ( (lv_constantes_4_0= ruleConstantes ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:688:2: ( (lv_constantes_3_0= ruleConstantes ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:689:1: (lv_constantes_3_0= ruleConstantes )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:689:1: (lv_constantes_3_0= ruleConstantes )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:690:3: lv_constantes_3_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleImplementacion1224);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:706:2: ( (lv_constantes_4_0= ruleConstantes ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:707:1: (lv_constantes_4_0= ruleConstantes )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:707:1: (lv_constantes_4_0= ruleConstantes )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:708:3: lv_constantes_4_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_2_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleImplementacion1245);
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
                            	    break loop30;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:724:7: (otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:724:9: otherlv_5= 'type' ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImplementacion1263); 

                        	newLeafNode(otherlv_5, grammarAccess.getImplementacionAccess().getTypeKeyword_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:728:1: ( ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID||LA34_0==RULE_STRING||LA34_0==51||LA34_0==56||LA34_0==58||LA34_0==60) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:728:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:728:2: ( (lv_tipocomplejo_6_0= ruleTipoComplejo ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:729:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:729:1: (lv_tipocomplejo_6_0= ruleTipoComplejo )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:730:3: lv_tipocomplejo_6_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleImplementacion1285);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:746:2: ( (lv_tipocomplejo_7_0= ruleTipoComplejo ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_ID||LA33_0==RULE_STRING||LA33_0==51||LA33_0==56||LA33_0==58||LA33_0==60) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:747:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:747:1: (lv_tipocomplejo_7_0= ruleTipoComplejo )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:748:3: lv_tipocomplejo_7_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleImplementacion1306);
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:764:7: (otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:764:9: otherlv_8= 'var' ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImplementacion1324); 

                        	newLeafNode(otherlv_8, grammarAccess.getImplementacionAccess().getVarKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:768:1: ( ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )* )?
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
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:768:2: ( (lv_global_9_0= ruleDeclaracion ) ) ( (lv_global_10_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:768:2: ( (lv_global_9_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:769:1: (lv_global_9_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:769:1: (lv_global_9_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:770:3: lv_global_9_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleImplementacion1346);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:786:2: ( (lv_global_10_0= ruleDeclaracion ) )*
                            loop36:
                            do {
                                int alt36=2;
                                switch ( input.LA(1) ) {
                                case 85:
                                    {
                                    int LA36_1 = input.LA(2);

                                    if ( (LA36_1==55) ) {
                                        alt36=1;
                                    }


                                    }
                                    break;
                                case 86:
                                    {
                                    int LA36_2 = input.LA(2);

                                    if ( (LA36_2==55) ) {
                                        alt36=1;
                                    }


                                    }
                                    break;
                                case 87:
                                    {
                                    int LA36_3 = input.LA(2);

                                    if ( (LA36_3==55) ) {
                                        alt36=1;
                                    }


                                    }
                                    break;
                                case 88:
                                    {
                                    int LA36_4 = input.LA(2);

                                    if ( (LA36_4==55) ) {
                                        alt36=1;
                                    }


                                    }
                                    break;
                                case 89:
                                    {
                                    int LA36_5 = input.LA(2);

                                    if ( (LA36_5==55) ) {
                                        alt36=1;
                                    }


                                    }
                                    break;
                                case RULE_ID:
                                case RULE_STRING:
                                    {
                                    alt36=1;
                                    }
                                    break;

                                }

                                switch (alt36) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:787:1: (lv_global_10_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:787:1: (lv_global_10_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:788:3: lv_global_10_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleImplementacion1367);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:804:7: ( ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27||(LA40_0>=85 && LA40_0<=89)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:804:8: ( (lv_funcion_11_0= ruleSubproceso ) ) ( (lv_funcion_12_0= ruleSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:804:8: ( (lv_funcion_11_0= ruleSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:805:1: (lv_funcion_11_0= ruleSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:805:1: (lv_funcion_11_0= ruleSubproceso )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:806:3: lv_funcion_11_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleImplementacion1394);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:822:2: ( (lv_funcion_12_0= ruleSubproceso ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==27||(LA39_0>=85 && LA39_0<=89)) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:823:1: (lv_funcion_12_0= ruleSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:823:1: (lv_funcion_12_0= ruleSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:824:3: lv_funcion_12_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleImplementacion1415);
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
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleImplementacion1430); 

                	newLeafNode(otherlv_13, grammarAccess.getImplementacionAccess().getEnd_implementationKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:852:1: entryRuleCabeceraSubproceso returns [EObject current=null] : iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF ;
    public final EObject entryRuleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:853:2: (iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:854:2: iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF
            {
             newCompositeNode(grammarAccess.getCabeceraSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1466);
            iv_ruleCabeceraSubproceso=ruleCabeceraSubproceso();

            state._fsp--;

             current =iv_ruleCabeceraSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraSubproceso1476); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:861:1: ruleCabeceraSubproceso returns [EObject current=null] : (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) ;
    public final EObject ruleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_CabeceraProcedimiento_0 = null;

        EObject this_CabeceraFuncion_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:864:28: ( (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:865:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:865:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=85 && LA41_0<=89)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:866:5: this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraProcedimientoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1523);
                    this_CabeceraProcedimiento_0=ruleCabeceraProcedimiento();

                    state._fsp--;

                     
                            current = this_CabeceraProcedimiento_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:876:5: this_CabeceraFuncion_1= ruleCabeceraFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraFuncionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1550);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:892:1: entryRuleCabeceraProcedimiento returns [EObject current=null] : iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF ;
    public final EObject entryRuleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:893:2: (iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:894:2: iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getCabeceraProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1585);
            iv_ruleCabeceraProcedimiento=ruleCabeceraProcedimiento();

            state._fsp--;

             current =iv_ruleCabeceraProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1595); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:901:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:904:28: ( (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:905:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:905:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:905:3: otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCabeceraProcedimiento1632); 

                	newLeafNode(otherlv_0, grammarAccess.getCabeceraProcedimientoAccess().getProcedureKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:909:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:910:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:910:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:911:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCabeceraProcedimiento1653);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraProcedimiento1665); 

                	newLeafNode(otherlv_2, grammarAccess.getCabeceraProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:931:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46||(LA43_0>=109 && LA43_0<=110)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:931:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:931:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:932:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:932:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:933:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1687);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:949:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==29) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:949:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraProcedimiento1700); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:953:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:954:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:954:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:955:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1721);
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
                    	    break loop42;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraProcedimiento1737); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:983:1: entryRuleCabeceraFuncion returns [EObject current=null] : iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF ;
    public final EObject entryRuleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:984:2: (iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:985:2: iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF
            {
             newCompositeNode(grammarAccess.getCabeceraFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1773);
            iv_ruleCabeceraFuncion=ruleCabeceraFuncion();

            state._fsp--;

             current =iv_ruleCabeceraFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraFuncion1783); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:992:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:995:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:996:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:996:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:996:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:996:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:997:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:997:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:998:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1829);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCabeceraFuncion1841); 

                	newLeafNode(otherlv_1, grammarAccess.getCabeceraFuncionAccess().getFunctionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1018:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1019:1: (lv_nombre_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1019:1: (lv_nombre_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1020:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCabeceraFuncion1862);
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

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraFuncion1874); 

                	newLeafNode(otherlv_3, grammarAccess.getCabeceraFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1040:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46||(LA45_0>=109 && LA45_0<=110)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1040:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1040:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1041:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1041:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1042:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1896);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1058:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==29) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1058:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraFuncion1909); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1062:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1063:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1063:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1064:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1930);
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
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraFuncion1946); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1092:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1093:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1094:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1982);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo1992); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1101:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1104:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt46=6;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1106:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo2039);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1116:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo2066);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1126:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo2093);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1136:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo2120);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1146:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo2147);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1156:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo2174);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1172:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1173:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1174:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso2209);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso2219); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1181:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1184:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1185:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1185:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=85 && LA47_0<=89)) ) {
                alt47=1;
            }
            else if ( (LA47_0==27) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1186:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso2266);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1196:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso2293);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1212:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1213:2: (iv_ruleComentario= ruleComentario EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1214:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario2328);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario2338); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1221:1: ruleComentario returns [EObject current=null] : ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token lv_mensaje_2_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1224:28: ( ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1225:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1225:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1225:2: () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1225:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComentarioAccess().getComentarioAction_0(),
                        current);
                

            }

            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleComentario2383); 
             
                newLeafNode(this_SL_COMMENT_1, grammarAccess.getComentarioAccess().getSL_COMMENTTerminalRuleCall_1()); 
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1235:1: ( (lv_mensaje_2_0= RULE_COMENT ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1236:1: (lv_mensaje_2_0= RULE_COMENT )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1236:1: (lv_mensaje_2_0= RULE_COMENT )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1237:3: lv_mensaje_2_0= RULE_COMENT
            {
            lv_mensaje_2_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario2399); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1261:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1262:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1263:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias2440);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias2450); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1270:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1273:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt48=7;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1275:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias2497);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1285:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias2524);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1295:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias2551);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1305:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2578);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1315:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2605);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1325:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias2632);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1335:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_ruleSentencias2659);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1351:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1352:2: (iv_ruleBloque= ruleBloque EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1353:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque2694);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque2704); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1360:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1363:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1364:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1364:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt49=1;
                }
                break;
            case 73:
                {
                alt49=2;
                }
                break;
            case 76:
                {
                alt49=3;
                }
                break;
            case 78:
                {
                alt49=4;
                }
                break;
            case 82:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1365:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque2751);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1375:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque2778);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1385:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque2805);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1395:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque2832);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1405:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque2859);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1421:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1422:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1423:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2894);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion2904); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1430:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1433:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1434:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1434:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=85 && LA50_0<=89)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID||LA50_0==RULE_STRING) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1435:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2951);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1445:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2978);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1461:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1462:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1463:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir3013);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3023); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1470:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1473:28: ( (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1474:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1474:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1474:3: otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFuncionFicheroAbrir3060); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getOpenKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncionFicheroAbrir3072); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1482:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1482:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1482:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1483:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1483:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1484:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3094);
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

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3106); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1504:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1505:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1505:1: (lv_modo_4_0= ruleModoApertura )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1506:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3127);
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

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir3139); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1526:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1527:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1527:1: (lv_variable_6_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1528:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3160);
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

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroAbrir3173); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1556:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1557:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1558:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3209);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3219); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1565:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1568:28: ( (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1569:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1569:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1569:3: otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroCerrar3256); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCloseKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncionFicheroCerrar3268); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1577:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1578:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1578:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1579:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3289);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroCerrar3301); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1607:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1608:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1609:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura3338);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura3349); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1616:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'writing' | kw= 'reading' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1619:28: ( (kw= 'writing' | kw= 'reading' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1620:1: (kw= 'writing' | kw= 'reading' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1620:1: (kw= 'writing' | kw= 'reading' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==34) ) {
                alt51=1;
            }
            else if ( (LA51_0==35) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1621:2: kw= 'writing'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleModoApertura3387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getWritingKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1628:2: kw= 'reading'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleModoApertura3406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getReadingKeyword_1()); 
                        

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1641:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1642:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1643:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3447);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna3458); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1650:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1653:28: ( (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1654:1: (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1654:1: (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' )
            int alt52=9;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt52=1;
                }
                break;
            case 37:
                {
                alt52=2;
                }
                break;
            case 38:
                {
                alt52=3;
                }
                break;
            case 39:
                {
                alt52=4;
                }
                break;
            case 40:
                {
                alt52=5;
                }
                break;
            case 41:
                {
                alt52=6;
                }
                break;
            case 42:
                {
                alt52=7;
                }
                break;
            case 43:
                {
                alt52=8;
                }
                break;
            case 44:
                {
                alt52=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1655:2: kw= 'cos'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleNombreInterna3496); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1662:2: kw= 'square'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNombreInterna3515); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSquareKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1669:2: kw= 'exp'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNombreInterna3534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1676:2: kw= 'ln'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNombreInterna3553); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1683:2: kw= 'log'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNombreInterna3572); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1690:2: kw= 'sen'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNombreInterna3591); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1697:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNombreInterna3610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1704:2: kw= 'length'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNombreInterna3629); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLengthKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1711:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNombreInterna3648); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1724:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1725:2: (iv_ruleEInt= ruleEInt EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1726:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3689);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3700); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1733:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1736:28: (this_INT_0= RULE_INT )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1737:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3739); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1752:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1753:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1754:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3784);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3795); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1761:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1764:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1765:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1765:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1765:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3835); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleEFloat3853); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3868); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1785:1: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=46 && LA55_0<=47)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1785:2: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1785:2: (kw= 'E' | kw= 'e' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==46) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==47) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1786:2: kw= 'E'
                            {
                            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat3888); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1793:2: kw= 'e'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEFloat3907); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1798:2: (kw= '+' | kw= '-' )?
                    int alt54=3;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==48) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==49) ) {
                        alt54=2;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1799:2: kw= '+'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloat3922); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1806:2: kw= '-'
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEFloat3941); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3958); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1826:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1827:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1828:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro4005);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro4015); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1835:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1838:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1839:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1839:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1840:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1840:1: (lv_nombre_campo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1841:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro4060);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1865:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1866:2: (iv_ruleTipo= ruleTipo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1867:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo4095);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo4105); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1874:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1877:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1878:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1878:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=85 && LA56_0<=89)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1879:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo4152);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1889:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo4179);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1905:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1906:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1907:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4214);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido4224); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1914:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1917:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1918:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1918:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1919:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1919:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1920:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido4269);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1944:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1945:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1946:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4304);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente4314); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1953:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1956:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1957:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1957:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1958:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1958:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1959:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente4359);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1983:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1984:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1985:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes4394);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes4404); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1992:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1995:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1996:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1996:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1996:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1996:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1997:1: (lv_variable_0_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1997:1: (lv_variable_0_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1998:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes4450);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleConstantes4462); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2018:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2019:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2019:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2020:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes4483);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2044:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2045:2: (iv_ruleVector= ruleVector EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2046:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector4519);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector4529); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2053:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2056:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2057:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2057:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2057:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleVector4566); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVector4578); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2065:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2067:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector4599);
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

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVector4611); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVector4623); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getOfKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2091:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2092:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2092:1: (lv_tipo_5_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2093:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector4644);
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

            otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleVector4656); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2113:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2114:1: (lv_nombre_7_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2114:1: (lv_nombre_7_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2115:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector4677);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2139:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2140:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2141:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz4713);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz4723); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2148:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2151:28: ( (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2152:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2152:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2152:3: otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMatriz4760); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrixKeyword_0());
                
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleMatriz4772); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2160:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2161:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2161:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2162:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4793);
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

            otherlv_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMatriz4805); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2182:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2183:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2183:1: (lv_valor_4_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2184:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4826);
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

            otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMatriz4838); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMatriz4850); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getOfKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2208:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2209:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2209:1: (lv_tipo_7_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2210:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4871);
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

            otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMatriz4883); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2230:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2231:1: (lv_nombre_9_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2231:1: (lv_nombre_9_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2232:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4904);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2256:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2257:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2258:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4940);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4950); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2265:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2268:28: ( (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2269:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2269:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2269:3: otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleRegistro4987); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistryKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2273:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2274:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2274:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2275:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro5008);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2291:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2291:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2291:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2292:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2292:1: (lv_variable_2_0= ruleDeclaracion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2293:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5030);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2309:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID||LA57_0==RULE_STRING||(LA57_0>=85 && LA57_0<=89)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2310:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2310:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2311:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro5051);
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
            	    break loop57;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRegistro5065); 

                	newLeafNode(otherlv_4, grammarAccess.getRegistroAccess().getEnd_registryKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2339:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2340:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2341:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo5101);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo5111); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2348:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2351:28: ( (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2352:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2352:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2352:3: otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleArchivo5148); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchiveOfKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2356:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2357:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2357:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2358:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo5169);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleArchivo5181); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2378:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2379:1: (lv_nombre_3_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2379:1: (lv_nombre_3_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2380:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo5202);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2404:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2405:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2406:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado5238);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado5248); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2413:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2416:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2417:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2417:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2417:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2417:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2418:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2418:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2419:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado5294);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEnumerado5306); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEnumerado5318); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2443:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2443:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2443:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2444:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2444:1: (lv_valor_3_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2445:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5340);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2461:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==29) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2461:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumerado5353); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2465:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2466:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2466:1: (lv_valor_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2467:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado5374);
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
            	    break loop58;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEnumerado5389); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2495:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2496:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2497:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango5425);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango5435); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2504:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2507:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2508:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2508:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==50) ) {
                    int LA59_3 = input.LA(3);

                    if ( (LA59_3==RULE_ID||LA59_3==RULE_STRING) ) {
                        alt59=2;
                    }
                    else if ( (LA59_3==RULE_INT) ) {
                        alt59=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==RULE_ID) ) {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==50) ) {
                    int LA59_3 = input.LA(3);

                    if ( (LA59_3==RULE_ID||LA59_3==RULE_STRING) ) {
                        alt59=2;
                    }
                    else if ( (LA59_3==RULE_INT) ) {
                        alt59=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2509:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5482);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2519:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5509);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2535:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2536:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2537:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5544);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico5554); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2544:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2547:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2548:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2548:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2548:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2548:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2549:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2549:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2550:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico5600);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoNumerico5612); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2570:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2570:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2570:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2571:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2571:1: (lv_limite_inf_2_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2572:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5634);
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

            otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleSubrangoNumerico5646); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2592:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2593:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2593:1: (lv_limite_sup_4_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2594:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5667);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2618:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2619:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2620:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5704);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado5714); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2627:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2630:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2631:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2631:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2631:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2631:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2632:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2632:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2633:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5760);
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangoEnumerado5772); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2653:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2653:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2653:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2654:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2654:1: (lv_limite_inf_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2655:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5794);
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

            otherlv_3=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleSubrangoEnumerado5806); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2675:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2676:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2676:1: (lv_limite_sup_4_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2677:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5827);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2701:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2702:2: (iv_ruleInicio= ruleInicio EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2703:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio5864);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio5874); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2710:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2713:28: ( (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2714:1: (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2714:1: (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2714:3: otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleInicio5911); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getMainKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2718:1: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2719:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInicio5932); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2728:1: ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==RULE_STRING||(LA61_0>=85 && LA61_0<=89)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2728:2: ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2728:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2729:1: (lv_declaracion_3_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2729:1: (lv_declaracion_3_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2730:3: lv_declaracion_3_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5954);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2746:2: ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ID||LA60_0==RULE_STRING||(LA60_0>=85 && LA60_0<=89)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2747:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2747:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2748:3: lv_declaracion_4_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5975);
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
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleInicio5990); 

                	newLeafNode(otherlv_5, grammarAccess.getInicioAccess().getInitiationKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2768:1: ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==RULE_STRING||(LA63_0>=32 && LA63_0<=33)||(LA63_0>=36 && LA63_0<=44)||(LA63_0>=68 && LA63_0<=70)||LA63_0==73||LA63_0==76||LA63_0==78||LA63_0==82) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2768:2: ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2768:2: ( (lv_tiene_6_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2769:1: (lv_tiene_6_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2769:1: (lv_tiene_6_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2770:3: lv_tiene_6_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6012);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2786:2: ( (lv_tiene_7_0= ruleSentencias ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ID||LA62_0==RULE_STRING||(LA62_0>=32 && LA62_0<=33)||(LA62_0>=36 && LA62_0<=44)||(LA62_0>=68 && LA62_0<=70)||LA62_0==73||LA62_0==76||LA62_0==78||LA62_0==82) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2787:1: (lv_tiene_7_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2787:1: (lv_tiene_7_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2788:3: lv_tiene_7_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio6033);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleInicio6048); 

                	newLeafNode(otherlv_8, grammarAccess.getInicioAccess().getEnd_initiationKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2816:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2817:2: (iv_ruleEString= ruleEString EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2818:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString6085);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString6096); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2825:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2828:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2829:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2829:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2829:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString6136); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2837:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString6162); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2852:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2853:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2854:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6207);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable6217); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2861:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2864:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2865:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2865:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2865:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2865:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2866:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2866:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2867:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6263);
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDeclaracionVariable6275); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2887:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2888:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2888:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2889:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6296);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2905:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==29) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2905:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionVariable6309); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2909:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2910:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2910:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2911:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable6330);
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
            	    break loop65;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2935:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2936:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2937:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6368);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia6378); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2944:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2947:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2948:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2948:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2948:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2948:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2949:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2949:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2950:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia6424);
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

            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleDeclaracionPropia6436); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2970:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2971:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2971:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2972:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6457);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2988:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==29) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2988:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionPropia6470); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2992:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2993:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2993:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2994:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia6491);
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
    // $ANTLR end "ruleDeclaracionPropia"


    // $ANTLR start "entryRuleAsignacion"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3018:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3019:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3020:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion6529);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion6539); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3027:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3030:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3031:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3031:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==45||LA67_1==52) ) {
                    alt67=2;
                }
                else if ( (LA67_1==67) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA67_0==RULE_ID) ) {
                int LA67_2 = input.LA(2);

                if ( (LA67_2==45||LA67_2==52) ) {
                    alt67=2;
                }
                else if ( (LA67_2==67) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3032:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6586);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3042:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6613);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3058:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3059:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3060:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6648);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal6658); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3067:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3070:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3071:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3071:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3071:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3071:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3072:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3072:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3073:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal6704);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAsignacionNormal6716); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3093:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3094:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3094:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3095:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionNormal6737);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3119:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3120:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3121:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6773);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6783); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3128:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3131:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3132:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3132:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3132:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3132:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3133:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3133:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3134:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6829);
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

            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAsignacionCompleja6841); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3154:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3155:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3155:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3156:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6862);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3180:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3181:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3182:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6898);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6908); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3189:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3192:28: ( (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3193:1: (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3193:1: (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3193:3: otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleEscribir6945); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getWriteKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEscribir6957); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3201:1: ( (lv_operador_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3202:1: (lv_operador_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3202:1: (lv_operador_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3203:3: lv_operador_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6978);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3219:2: ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )*
            loop68:
            do {
                int alt68=3;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==29) ) {
                    alt68=1;
                }
                else if ( (LA68_0==RULE_ID||(LA68_0>=RULE_INT && LA68_0<=RULE_CAR)||(LA68_0>=36 && LA68_0<=44)||(LA68_0>=90 && LA68_0<=91)||(LA68_0>=102 && LA68_0<=104)) ) {
                    alt68=2;
                }


                switch (alt68) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3219:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3219:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3219:5: otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEscribir6992); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3223:1: ( (lv_operador_4_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3224:1: (lv_operador_4_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3224:1: (lv_operador_4_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3225:3: lv_operador_4_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir7013);
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
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3242:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3242:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3243:1: (lv_operador_5_0= ruleoperacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3243:1: (lv_operador_5_0= ruleoperacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3244:3: lv_operador_5_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir7041);
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
            	    break loop68;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEscribir7055); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3272:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3273:2: (iv_ruleLeer= ruleLeer EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3274:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer7091);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer7101); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3281:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3284:28: ( (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3285:1: (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3285:1: (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3285:3: otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleLeer7138); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getReadKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLeer7150); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3293:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3294:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3294:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3295:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer7171);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeer7183); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3323:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3324:2: (iv_ruleSi= ruleSi EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3325:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi7219);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi7229); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3332:1: ruleSi returns [EObject current=null] : (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3335:28: ( (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3336:1: (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3336:1: (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3336:3: otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleSi7266); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getIfKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3340:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3341:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3341:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3342:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleSi7287);
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

            otherlv_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSi7299); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getThenKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3362:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||LA70_0==RULE_STRING||(LA70_0>=32 && LA70_0<=33)||(LA70_0>=36 && LA70_0<=44)||(LA70_0>=68 && LA70_0<=70)||LA70_0==73||LA70_0==76||LA70_0==78||LA70_0==82) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3362:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3362:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3363:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3363:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3364:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7321);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3380:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_ID||LA69_0==RULE_STRING||(LA69_0>=32 && LA69_0<=33)||(LA69_0>=36 && LA69_0<=44)||(LA69_0>=68 && LA69_0<=70)||LA69_0==73||LA69_0==76||LA69_0==78||LA69_0==82) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3381:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3381:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3382:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi7342);
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
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3398:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==106) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3399:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3399:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3400:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi7366);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3416:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==105) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3417:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3417:1: (lv_sino_6_0= ruleSino )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3418:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi7388);
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

            otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSi7401); 

                	newLeafNode(otherlv_7, grammarAccess.getSiAccess().getEnd_ifKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3446:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3447:2: (iv_rulemientras= rulemientras EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3448:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras7437);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras7447); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3455:1: rulemientras returns [EObject current=null] : (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3458:28: ( (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3459:1: (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3459:1: (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3459:3: otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_rulemientras7484); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getWhileKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3463:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3464:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3464:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3465:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulemientras7505);
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

            otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulemientras7517); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getDoKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3485:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||LA74_0==RULE_STRING||(LA74_0>=32 && LA74_0<=33)||(LA74_0>=36 && LA74_0<=44)||(LA74_0>=68 && LA74_0<=70)||LA74_0==73||LA74_0==76||LA74_0==78||LA74_0==82) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3485:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3485:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3486:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3486:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3487:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7539);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3503:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==RULE_ID||LA73_0==RULE_STRING||(LA73_0>=32 && LA73_0<=33)||(LA73_0>=36 && LA73_0<=44)||(LA73_0>=68 && LA73_0<=70)||LA73_0==73||LA73_0==76||LA73_0==78||LA73_0==82) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3504:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3504:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3505:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7560);
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
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulemientras7575); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getEnd_whileKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3533:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3534:2: (iv_rulerepetir= rulerepetir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3535:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir7611);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir7621); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3542:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3545:28: ( (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3546:1: (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3546:1: (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3546:3: otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) )
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulerepetir7658); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepeatKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3550:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||LA76_0==RULE_STRING||(LA76_0>=32 && LA76_0<=33)||(LA76_0>=36 && LA76_0<=44)||(LA76_0>=68 && LA76_0<=70)||LA76_0==73||LA76_0==76||LA76_0==78||LA76_0==82) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3550:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3550:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3551:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3551:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3552:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7680);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3568:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==RULE_ID||LA75_0==RULE_STRING||(LA75_0>=32 && LA75_0<=33)||(LA75_0>=36 && LA75_0<=44)||(LA75_0>=68 && LA75_0<=70)||LA75_0==73||LA75_0==76||LA75_0==78||LA75_0==82) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3569:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3569:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3570:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7701);
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
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulerepetir7716); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getUntilKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3590:1: ( (lv_valor_4_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3591:1: (lv_valor_4_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3591:1: (lv_valor_4_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3592:3: lv_valor_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulerepetir7737);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3616:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3617:2: (iv_ruledesde= ruledesde EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3618:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7773);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7783); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3625:1: ruledesde returns [EObject current=null] : (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3628:28: ( (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3629:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3629:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3629:3: otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruledesde7820); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getForKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3633:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3634:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3634:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3635:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde7841);
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

            otherlv_2=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruledesde7853); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getToKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3655:1: ( (lv_valor_3_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3656:1: (lv_valor_3_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3656:1: (lv_valor_3_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3657:3: lv_valor_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruledesde7874);
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

            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruledesde7886); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getDoKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3677:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||LA78_0==RULE_STRING||(LA78_0>=32 && LA78_0<=33)||(LA78_0>=36 && LA78_0<=44)||(LA78_0>=68 && LA78_0<=70)||LA78_0==73||LA78_0==76||LA78_0==78||LA78_0==82) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3677:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3677:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3678:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3678:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3679:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7908);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3695:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_ID||LA77_0==RULE_STRING||(LA77_0>=32 && LA77_0<=33)||(LA77_0>=36 && LA77_0<=44)||(LA77_0>=68 && LA77_0<=70)||LA77_0==73||LA77_0==76||LA77_0==78||LA77_0==82) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3696:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3696:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3697:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7929);
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
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruledesde7944); 

                	newLeafNode(otherlv_7, grammarAccess.getDesdeAccess().getEnd_forKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3725:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3726:2: (iv_ruleCaso= ruleCaso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3727:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso7980);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso7990); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3734:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3737:28: ( (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3738:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3738:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3738:3: otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleCaso8027); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCaseKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3742:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3743:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3743:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3744:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso8048);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCaso8060); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3764:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==RULE_STRING||(LA80_0>=32 && LA80_0<=33)||(LA80_0>=36 && LA80_0<=44)||(LA80_0>=68 && LA80_0<=70)||LA80_0==73||LA80_0==76||LA80_0==78||LA80_0==82) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3764:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3764:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3765:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3765:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3766:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8082);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3782:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ID||LA79_0==RULE_STRING||(LA79_0>=32 && LA79_0<=33)||(LA79_0>=36 && LA79_0<=44)||(LA79_0>=68 && LA79_0<=70)||LA79_0==73||LA79_0==76||LA79_0==78||LA79_0==82) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3783:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3783:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3784:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso8103);
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
                    	    break loop79;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3800:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==106) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3801:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3801:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3802:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso8127);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3826:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3827:2: (iv_rulesegun= rulesegun EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3828:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun8164);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun8174); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3835:1: rulesegun returns [EObject current=null] : (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3838:28: ( (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3839:1: (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3839:1: (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3839:3: otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to'
            {
            otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesegun8211); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getAccording_toKeyword_0());
                
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulesegun8223); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3847:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3848:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3848:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3849:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_rulesegun8244);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulesegun8256); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulesegun8268); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getDoKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3873:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==81) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3873:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3873:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3874:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3874:1: (lv_caso_5_0= ruleCaso )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3875:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8290);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3891:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==81) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3892:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3892:1: (lv_caso_6_0= ruleCaso )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3893:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun8311);
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
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesegun8326); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getOtherwiseKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3913:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==RULE_STRING||(LA85_0>=32 && LA85_0<=33)||(LA85_0>=36 && LA85_0<=44)||(LA85_0>=68 && LA85_0<=70)||LA85_0==73||LA85_0==76||LA85_0==78||LA85_0==82) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3913:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3913:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3914:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3914:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3915:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8348);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3931:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==RULE_ID||LA84_0==RULE_STRING||(LA84_0>=32 && LA84_0<=33)||(LA84_0>=36 && LA84_0<=44)||(LA84_0>=68 && LA84_0<=70)||LA84_0==73||LA84_0==76||LA84_0==78||LA84_0==82) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3932:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3932:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3933:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun8369);
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
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3949:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==106) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3950:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3950:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3951:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun8393);
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

            otherlv_11=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesegun8406); 

                	newLeafNode(otherlv_11, grammarAccess.getSegunAccess().getEnd_according_toKeyword_9());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3979:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3980:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3981:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8443);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable8454); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3988:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3991:28: ( (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3992:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3992:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            int alt87=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt87=1;
                }
                break;
            case 86:
                {
                alt87=2;
                }
                break;
            case 87:
                {
                alt87=3;
                }
                break;
            case 88:
                {
                alt87=4;
                }
                break;
            case 89:
                {
                alt87=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3993:2: kw= 'integer'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleTipoVariable8492); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getIntegerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4000:2: kw= 'character'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleTipoVariable8511); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCharacterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4007:2: kw= 'real'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleTipoVariable8530); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4014:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleTipoVariable8549); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getBooleanKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4021:2: kw= 'string'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleTipoVariable8568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getStringKeyword_4()); 
                        

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4034:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4035:2: (iv_ruleVariable= ruleVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4036:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable8608);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable8618); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4043:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4046:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4047:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4047:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4047:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4047:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4048:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4053:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4054:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4054:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4055:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8673);
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


    // $ANTLR start "entryRulebooleano"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4079:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4080:2: (iv_rulebooleano= rulebooleano EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4081:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano8710);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano8721); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleano"


    // $ANTLR start "rulebooleano"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4088:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4091:28: ( (kw= 'true' | kw= 'false' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4092:1: (kw= 'true' | kw= 'false' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4092:1: (kw= 'true' | kw= 'false' )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==90) ) {
                alt88=1;
            }
            else if ( (LA88_0==91) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4093:2: kw= 'true'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_rulebooleano8759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4100:2: kw= 'false'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulebooleano8778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "rulebooleano"


    // $ANTLR start "entryRulesignoOr"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4115:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4116:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4117:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr8821);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr8832); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4124:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4127:28: (kw= 'or' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4129:2: kw= 'or'
            {
            kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_rulesignoOr8869); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoOrAccess().getOrKeyword()); 
                

            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4142:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4143:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4144:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd8909);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd8920); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4151:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4154:28: (kw= 'and' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4156:2: kw= 'and'
            {
            kw=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulesignoAnd8957); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSignoAndAccess().getAndKeyword()); 
                

            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4169:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4170:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4171:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8997);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad9008); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4178:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4181:28: ( (kw= '==' | kw= '!=' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4182:1: (kw= '==' | kw= '!=' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4182:1: (kw= '==' | kw= '!=' )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==94) ) {
                alt89=1;
            }
            else if ( (LA89_0==95) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4183:2: kw= '=='
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_94_in_rulesignoIgualdad9046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4190:2: kw= '!='
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_95_in_rulesignoIgualdad9065); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4203:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4204:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4205:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9106);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion9117); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4212:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4215:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4216:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4216:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt90=1;
                }
                break;
            case 97:
                {
                alt90=2;
                }
                break;
            case 98:
                {
                alt90=3;
                }
                break;
            case 99:
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4217:2: kw= '<'
                    {
                    kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_rulesignoComparacion9155); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4224:2: kw= '>'
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_rulesignoComparacion9174); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4231:2: kw= '>='
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_98_in_rulesignoComparacion9193); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4238:2: kw= '<='
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_99_in_rulesignoComparacion9212); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4251:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4252:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4253:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma9253);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma9264); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4260:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4263:28: (kw= '+' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4265:2: kw= '+'
            {
            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulesignoSuma9301); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4278:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4279:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4280:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta9341);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta9352); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4287:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4290:28: (kw= '-' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4292:2: kw= '-'
            {
            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulesignoResta9389); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4305:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4306:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4307:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9429);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion9440); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4314:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4317:28: (kw= '*' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4319:2: kw= '*'
            {
            kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_rulesignoMultiplicacion9477); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4332:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4333:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4334:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision9517);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision9528); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4341:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4344:28: (kw= '/' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4346:2: kw= '/'
            {
            kw=(Token)match(input,101,FollowSets000.FOLLOW_101_in_rulesignoDivision9565); 

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


    // $ANTLR start "entryRuleoperacion"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4359:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4360:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4361:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion9604);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion9614); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4368:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4371:28: (this_Or_0= ruleOr )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4373:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion9660);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4389:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4390:2: (iv_ruleOr= ruleOr EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4391:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr9694);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr9704); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4398:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4401:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4402:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4402:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4403:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9751);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4411:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==92) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4411:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4411:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4412:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4417:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4418:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4418:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4419:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr9781);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4435:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4436:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4436:1: (lv_right_3_0= ruleAnd )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4437:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9802);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4461:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4462:2: (iv_ruleAnd= ruleAnd EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4463:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd9840);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd9850); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4470:1: ruleAnd returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4473:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4474:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4474:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4475:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd9897);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4483:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==93) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4483:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4483:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4484:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4489:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4490:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4490:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4491:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd9927);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4507:2: ( (lv_right_3_0= ruleIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4508:1: (lv_right_3_0= ruleIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4508:1: (lv_right_3_0= ruleIgualdad )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4509:3: lv_right_3_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightIgualdadParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd9948);
            	    lv_right_3_0=ruleIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
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


    // $ANTLR start "entryRuleIgualdad"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4533:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4534:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4535:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad9986);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad9996); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4542:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4545:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4546:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4546:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4547:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10043);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4555:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=94 && LA93_0<=95)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4555:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4555:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4556:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4561:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4562:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4562:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4563:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad10073);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4579:2: ( (lv_right_3_0= ruleComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4580:1: (lv_right_3_0= ruleComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4580:1: (lv_right_3_0= ruleComparacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4581:3: lv_right_3_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad10094);
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
    // $ANTLR end "ruleIgualdad"


    // $ANTLR start "entryRuleComparacion"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4605:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4606:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4607:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion10132);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion10142); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4614:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4617:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4618:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4618:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4619:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10189);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4627:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=96 && LA94_0<=99)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4627:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4627:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4628:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4633:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4634:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4634:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4635:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion10219);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4651:2: ( (lv_right_3_0= ruleSumaResta ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4652:1: (lv_right_3_0= ruleSumaResta )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4652:1: (lv_right_3_0= ruleSumaResta )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4653:3: lv_right_3_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10240);
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
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleSumaResta"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4677:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4678:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4679:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta10278);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta10288); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4686:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4689:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4690:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4690:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4691:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10335);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=48 && LA96_0<=49)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==48) ) {
            	        alt95=1;
            	    }
            	    else if ( (LA95_0==49) ) {
            	        alt95=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 95, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4699:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4700:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4705:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4706:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4706:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4707:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta10367);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4724:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4724:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4724:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4724:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4725:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4730:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4731:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4731:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4732:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta10405);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4748:4: ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4749:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4749:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4750:3: lv_right_5_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10428);
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
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4774:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4775:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4776:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10466);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision10476); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4783:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4786:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4787:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4787:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4788:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10523);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=100 && LA98_0<=101)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) )
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4797:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4802:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4803:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4803:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4804:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10555);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4821:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4821:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4821:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4821:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4822:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4827:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4828:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4828:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4829:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10593);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4845:4: ( (lv_right_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4846:1: (lv_right_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4846:1: (lv_right_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4847:3: lv_right_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10616);
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRulePrimaria"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4871:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4872:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4873:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria10654);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria10664); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4880:1: rulePrimaria returns [EObject current=null] : ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject this_operacion_1 = null;

        EObject this_VariablesBasicas_3 = null;

        EObject lv_valor_operacion_6_0 = null;

        EObject lv_valor_operacion_11_0 = null;

        EObject this_Funciones_13 = null;

        EObject this_VariablesComplejas_14 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4883:28: ( ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4884:1: ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4884:1: ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas )
            int alt99=6;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt99=1;
                }
                break;
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 90:
            case 91:
                {
                alt99=2;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 45:
                case 52:
                    {
                    alt99=6;
                    }
                    break;
                case 28:
                    {
                    alt99=5;
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
                case 106:
                    {
                    alt99=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 3, input);

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
                case 106:
                    {
                    alt99=2;
                    }
                    break;
                case 45:
                case 52:
                    {
                    alt99=6;
                    }
                    break;
                case 28:
                    {
                    alt99=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 4, input);

                    throw nvae;
                }

                }
                break;
            case 103:
                {
                alt99=3;
                }
                break;
            case 104:
                {
                alt99=4;
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
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4884:2: (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4884:2: (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4884:4: otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|'
                    {
                    otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulePrimaria10702); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria10724);
                    this_operacion_1=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulePrimaria10735); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4903:5: this_VariablesBasicas_3= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_rulePrimaria10764);
                    this_VariablesBasicas_3=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4912:6: ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4912:6: ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4912:7: () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4912:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4913:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegativaAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,103,FollowSets000.FOLLOW_103_in_rulePrimaria10791); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimariaAccess().getHyphenMinusLeftParenthesisKeyword_2_1());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4922:1: ( (lv_valor_operacion_6_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4923:1: (lv_valor_operacion_6_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4923:1: (lv_valor_operacion_6_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4924:3: lv_valor_operacion_6_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria10812);
                    lv_valor_operacion_6_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_6_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria10824); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4945:6: ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4945:6: ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4945:7: () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4945:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4946:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegacionAction_3_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,104,FollowSets000.FOLLOW_104_in_rulePrimaria10853); 

                        	newLeafNode(otherlv_9, grammarAccess.getPrimariaAccess().getNotKeyword_3_1());
                        
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePrimaria10865); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4959:1: ( (lv_valor_operacion_11_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4960:1: (lv_valor_operacion_11_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4960:1: (lv_valor_operacion_11_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4961:3: lv_valor_operacion_11_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria10886);
                    lv_valor_operacion_11_0=ruleoperacion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimariaRule());
                    	        }
                           		set(
                           			current, 
                           			"valor_operacion",
                            		lv_valor_operacion_11_0, 
                            		"operacion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePrimaria10898); 

                        	newLeafNode(otherlv_12, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4983:5: this_Funciones_13= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_rulePrimaria10927);
                    this_Funciones_13=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4993:5: this_VariablesComplejas_14= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_rulePrimaria10954);
                    this_VariablesComplejas_14=ruleVariablesComplejas();

                    state._fsp--;

                     
                            current = this_VariablesComplejas_14; 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5009:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5010:2: (iv_ruleFunciones= ruleFunciones EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5011:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_entryRuleFunciones10989);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunciones10999); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5018:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5021:28: ( ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID||LA104_0==RULE_STRING) ) {
                alt104=1;
            }
            else if ( ((LA104_0>=36 && LA104_0<=44)) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:3: () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5022:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5023:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5028:2: ( (lv_nombre_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5029:1: (lv_nombre_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5029:1: (lv_nombre_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5030:3: lv_nombre_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreEStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFunciones11055);
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

                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunciones11067); 

                        	newLeafNode(otherlv_2, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5050:1: ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==RULE_ID||(LA101_0>=RULE_INT && LA101_0<=RULE_CAR)||(LA101_0>=36 && LA101_0<=44)||(LA101_0>=90 && LA101_0<=91)||(LA101_0>=102 && LA101_0<=104)) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5050:2: ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5050:2: ( (lv_operadores_3_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5051:1: (lv_operadores_3_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5051:1: (lv_operadores_3_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5052:3: lv_operadores_3_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones11089);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5068:2: (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==29) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5068:4: otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) )
                            	    {
                            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones11102); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getFuncionesAccess().getCommaKeyword_0_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5072:1: ( (lv_operadores_5_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5073:1: (lv_operadores_5_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5073:1: (lv_operadores_5_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5074:3: lv_operadores_5_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones11123);
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
                            	    break loop100;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones11139); 

                        	newLeafNode(otherlv_6, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5095:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5095:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5095:7: () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5095:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5096:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5101:2: ( (lv_nombre_8_0= ruleNombreInterna ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5102:1: (lv_nombre_8_0= ruleNombreInterna )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5102:1: (lv_nombre_8_0= ruleNombreInterna )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5103:3: lv_nombre_8_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleFunciones11177);
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

                    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFunciones11189); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5123:1: ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==RULE_ID||(LA103_0>=RULE_INT && LA103_0<=RULE_CAR)||(LA103_0>=36 && LA103_0<=44)||(LA103_0>=90 && LA103_0<=91)||(LA103_0>=102 && LA103_0<=104)) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5123:2: ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5123:2: ( (lv_operadores_10_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5124:1: (lv_operadores_10_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5124:1: (lv_operadores_10_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5125:3: lv_operadores_10_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones11211);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5141:2: (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            loop102:
                            do {
                                int alt102=2;
                                int LA102_0 = input.LA(1);

                                if ( (LA102_0==29) ) {
                                    alt102=1;
                                }


                                switch (alt102) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5141:4: otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) )
                            	    {
                            	    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones11224); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getFuncionesAccess().getCommaKeyword_1_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5145:1: ( (lv_operadores_12_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5146:1: (lv_operadores_12_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5146:1: (lv_operadores_12_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5147:3: lv_operadores_12_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones11245);
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
                            	    break loop102;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones11261); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5175:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5176:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5177:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas11298);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesComplejas11308); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5184:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5187:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            int alt108=3;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5189:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5194:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5194:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5194:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5195:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5195:1: (lv_nombre_vector_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5196:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas11365);
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

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVariablesComplejas11377); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5216:1: ( (lv_indice_3_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5217:1: (lv_indice_3_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5217:1: (lv_indice_3_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5218:3: lv_indice_3_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceVariablesBasicasParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11398);
                    lv_indice_3_0=ruleVariablesBasicas();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"indice",
                            		lv_indice_3_0, 
                            		"VariablesBasicas");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas11410); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5238:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==45) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5238:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                            {
                            otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas11424); 

                                	newLeafNode(otherlv_5, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_0_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5242:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5243:1: (lv_campo_6_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5243:1: (lv_campo_6_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5244:3: lv_campo_6_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11445);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5261:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5261:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5261:7: () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5261:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5262:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5267:2: ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5267:3: ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5267:3: ( (lv_nombre_matriz_8_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5268:1: (lv_nombre_matriz_8_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5268:1: (lv_nombre_matriz_8_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5269:3: lv_nombre_matriz_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas11486);
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

                    otherlv_9=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVariablesComplejas11498); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5289:1: ( (lv_primerIndice_10_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5290:1: (lv_primerIndice_10_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5290:1: (lv_primerIndice_10_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5291:3: lv_primerIndice_10_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceVariablesBasicasParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11519);
                    lv_primerIndice_10_0=ruleVariablesBasicas();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"primerIndice",
                            		lv_primerIndice_10_0, 
                            		"VariablesBasicas");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleVariablesComplejas11531); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5311:1: ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5312:1: (lv_segundoIndice_12_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5312:1: (lv_segundoIndice_12_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5313:3: lv_segundoIndice_12_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceVariablesBasicasParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11552);
                    lv_segundoIndice_12_0=ruleVariablesBasicas();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesComplejasRule());
                    	        }
                           		set(
                           			current, 
                           			"segundoIndice",
                            		lv_segundoIndice_12_0, 
                            		"VariablesBasicas");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas11564); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5333:2: (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==45) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5333:4: otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) )
                            {
                            otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas11578); 

                                	newLeafNode(otherlv_14, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_1_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5337:1: ( (lv_campo_15_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5338:1: (lv_campo_15_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5338:1: (lv_campo_15_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5339:3: lv_campo_15_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11599);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5356:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5356:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5356:7: () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5356:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5357:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5362:2: ( (lv_nombre_registro_17_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5363:1: (lv_nombre_registro_17_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5363:1: (lv_nombre_registro_17_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5364:3: lv_nombre_registro_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas11639);
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

                    otherlv_18=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas11651); 

                        	newLeafNode(otherlv_18, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_2());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5384:1: ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5384:2: ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5384:2: ( (lv_campo_19_0= ruleCampoRegistro ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5385:1: (lv_campo_19_0= ruleCampoRegistro )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5385:1: (lv_campo_19_0= ruleCampoRegistro )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5386:3: lv_campo_19_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11673);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5402:2: (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==45) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5402:4: otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_20=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVariablesComplejas11686); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5406:1: ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5407:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5407:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5408:3: lv_campo_21_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11707);
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
                    	    break loop107;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5432:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5433:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5434:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas11747);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesBasicas11757); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5441:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5444:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt109=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA109_1 = input.LA(2);

                if ( (LA109_1==45) ) {
                    alt109=2;
                }
                else if ( (LA109_1==EOF||LA109_1==RULE_ID||(LA109_1>=RULE_INT && LA109_1<=RULE_CAR)||(LA109_1>=18 && LA109_1<=19)||(LA109_1>=26 && LA109_1<=27)||(LA109_1>=29 && LA109_1<=30)||(LA109_1>=32 && LA109_1<=33)||(LA109_1>=36 && LA109_1<=44)||(LA109_1>=48 && LA109_1<=49)||LA109_1==53||LA109_1==55||LA109_1==57||LA109_1==62||LA109_1==64||LA109_1==66||(LA109_1>=68 && LA109_1<=106)) ) {
                    alt109=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt109=3;
                }
                break;
            case RULE_CAR:
                {
                alt109=4;
                }
                break;
            case 90:
            case 91:
                {
                alt109=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5446:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5451:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5452:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5452:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5453:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVariablesBasicas11813);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5470:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5470:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5470:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5470:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5471:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5476:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5477:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5477:1: (lv_valor_3_0= ruleEFloat )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5478:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleVariablesBasicas11851);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5495:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5495:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5495:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5495:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5496:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5501:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5502:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5502:1: (lv_contenido_5_0= RULE_CAD )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5503:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleVariablesBasicas11885); 

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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5520:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5520:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5520:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5520:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5521:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5526:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5527:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5527:1: (lv_contenido_7_0= RULE_CAR )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5528:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleVariablesBasicas11924); 

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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5545:6: ( () ( (lv_valor_9_0= rulebooleano ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5545:6: ( () ( (lv_valor_9_0= rulebooleano ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5545:7: () ( (lv_valor_9_0= rulebooleano ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5545:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5546:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5551:2: ( (lv_valor_9_0= rulebooleano ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5552:1: (lv_valor_9_0= rulebooleano )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5552:1: (lv_valor_9_0= rulebooleano )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5553:3: lv_valor_9_0= rulebooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleVariablesBasicas11967);
                    lv_valor_9_0=rulebooleano();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariablesBasicasRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_9_0, 
                            		"booleano");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5570:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5570:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5570:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5570:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5571:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5576:2: ( (lv_nombre_11_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5577:1: (lv_nombre_11_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5577:1: (lv_nombre_11_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5578:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesBasicas12005);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5602:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5603:2: (iv_ruleSino= ruleSino EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5604:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino12042);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino12052); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5611:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5614:28: ( ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5615:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5615:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5615:2: () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5615:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleSino12098); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getElseKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5625:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_ID||LA111_0==RULE_STRING||(LA111_0>=32 && LA111_0<=33)||(LA111_0>=36 && LA111_0<=44)||(LA111_0>=68 && LA111_0<=70)||LA111_0==73||LA111_0==76||LA111_0==78||LA111_0==82) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5625:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5625:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5626:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5626:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5627:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino12120);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5643:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==RULE_ID||LA110_0==RULE_STRING||(LA110_0>=32 && LA110_0<=33)||(LA110_0>=36 && LA110_0<=44)||(LA110_0>=68 && LA110_0<=70)||LA110_0==73||LA110_0==76||LA110_0==78||LA110_0==82) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5644:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5644:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5645:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino12141);
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
                    	    break loop110;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5661:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==106) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5662:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5662:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5663:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino12165);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5687:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5688:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5689:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver12202);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver12212); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5696:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5699:28: ( ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5700:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5700:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5700:2: () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5700:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5701:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleDevolver12258); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getReturnKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5710:1: ( (lv_devuelve_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5711:1: (lv_devuelve_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5711:1: (lv_devuelve_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5712:3: lv_devuelve_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelvePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleDevolver12279);
            lv_devuelve_2_0=rulePrimaria();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_2_0, 
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
    // $ANTLR end "ruleDevolver"


    // $ANTLR start "entryRuleParametroFuncion"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5736:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5737:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5738:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion12315);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion12325); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5745:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5748:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5749:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5749:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5749:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5749:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5750:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5750:1: (lv_paso_0_0= ruleTipoPaso )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5751:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion12371);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5767:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5768:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5768:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5769:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion12392);
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

            otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleParametroFuncion12404); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5789:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5790:1: (lv_variable_3_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5790:1: (lv_variable_3_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5791:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion12425);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5815:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5816:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5817:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion12461);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion12471); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5824:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_2_0 = null;

        EObject lv_parametrofuncion_4_0 = null;

        EObject lv_parametrofuncion_6_0 = null;

        EObject lv_declaracion_11_0 = null;

        EObject lv_declaracion_12_0 = null;

        EObject lv_sentencias_14_0 = null;

        EObject lv_sentencias_15_0 = null;

        EObject lv_devuelve_16_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5827:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5828:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5828:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5828:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5828:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5829:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5829:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5830:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion12517);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFuncion12529); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFunctionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5850:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5851:1: (lv_nombre_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5851:1: (lv_nombre_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5852:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion12550);
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

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFuncion12562); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5872:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==46||(LA114_0>=109 && LA114_0<=110)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5872:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5872:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5873:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5873:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5874:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion12584);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5890:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==29) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5890:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncion12597); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5894:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5895:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5895:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5896:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion12618);
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
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncion12634); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5916:1: (otherlv_8= 'const' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==17) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5916:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion12647); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5920:3: (otherlv_9= 'type' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==18) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5920:5: otherlv_9= 'type'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFuncion12662); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTypeKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncion12676); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5928:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_ID||LA118_0==RULE_STRING||(LA118_0>=85 && LA118_0<=89)) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5928:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5928:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5929:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5929:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5930:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion12698);
                    lv_declaracion_11_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_11_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5946:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==RULE_ID||LA117_0==RULE_STRING||(LA117_0>=85 && LA117_0<=89)) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5947:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5947:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5948:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion12719);
                    	    lv_declaracion_12_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_12_0, 
                    	            		"Declaracion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleFuncion12734); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInitiationKeyword_10());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5968:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_ID||LA120_0==RULE_STRING||(LA120_0>=32 && LA120_0<=33)||(LA120_0>=36 && LA120_0<=44)||(LA120_0>=68 && LA120_0<=70)||LA120_0==73||LA120_0==76||LA120_0==78||LA120_0==82) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5968:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5968:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5969:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5969:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5970:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion12756);
                    lv_sentencias_14_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_14_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5986:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==RULE_ID||LA119_0==RULE_STRING||(LA119_0>=32 && LA119_0<=33)||(LA119_0>=36 && LA119_0<=44)||(LA119_0>=68 && LA119_0<=70)||LA119_0==73||LA119_0==76||LA119_0==78||LA119_0==82) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5987:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5987:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5988:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion12777);
                    	    lv_sentencias_15_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_15_0, 
                    	            		"Sentencias");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6004:5: ( (lv_devuelve_16_0= ruleDevolver ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6005:1: (lv_devuelve_16_0= ruleDevolver )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6005:1: (lv_devuelve_16_0= ruleDevolver )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6006:3: lv_devuelve_16_0= ruleDevolver
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion12801);
            lv_devuelve_16_0=ruleDevolver();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_16_0, 
                    		"Devolver");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFuncion12813); 

                	newLeafNode(otherlv_17, grammarAccess.getFuncionAccess().getEnd_initiationKeyword_13());
                
            otherlv_18=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleFuncion12825); 

                	newLeafNode(otherlv_18, grammarAccess.getFuncionAccess().getEnd_functionKeyword_14());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6038:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6039:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6040:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento12861);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento12871); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6047:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' ) ;
    public final EObject ruleProcedimiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_parametrofuncion_3_0 = null;

        EObject lv_parametrofuncion_5_0 = null;

        EObject lv_declaracion_10_0 = null;

        EObject lv_declaracion_11_0 = null;

        EObject lv_sentencias_13_0 = null;

        EObject lv_sentencias_14_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6050:28: ( (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6051:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6051:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6051:3: otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleProcedimiento12908); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedureKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6055:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6056:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6056:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6057:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento12929);
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

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcedimiento12941); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6077:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==46||(LA122_0>=109 && LA122_0<=110)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6077:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6077:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6079:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento12963);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6095:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==29) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6095:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcedimiento12976); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6099:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6100:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6100:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6101:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento12997);
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
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcedimiento13013); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6121:1: (otherlv_7= 'const' )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==17) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6121:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento13026); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6125:3: (otherlv_8= 'type' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==18) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6125:5: otherlv_8= 'type'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleProcedimiento13041); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTypeKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleProcedimiento13055); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6133:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_ID||LA126_0==RULE_STRING||(LA126_0>=85 && LA126_0<=89)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6133:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6133:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6134:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6134:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6135:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento13077);
                    lv_declaracion_10_0=ruleDeclaracion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"declaracion",
                            		lv_declaracion_10_0, 
                            		"Declaracion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6151:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==RULE_ID||LA125_0==RULE_STRING||(LA125_0>=85 && LA125_0<=89)) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6152:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6152:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6153:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento13098);
                    	    lv_declaracion_11_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaracion",
                    	            		lv_declaracion_11_0, 
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

            otherlv_12=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleProcedimiento13113); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInitiationKeyword_9());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6173:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==RULE_ID||LA128_0==RULE_STRING||(LA128_0>=32 && LA128_0<=33)||(LA128_0>=36 && LA128_0<=44)||(LA128_0>=68 && LA128_0<=70)||LA128_0==73||LA128_0==76||LA128_0==78||LA128_0==82) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6173:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6173:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6174:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6174:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6175:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento13135);
                    lv_sentencias_13_0=ruleSentencias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	        }
                           		add(
                           			current, 
                           			"sentencias",
                            		lv_sentencias_13_0, 
                            		"Sentencias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6191:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==RULE_ID||LA127_0==RULE_STRING||(LA127_0>=32 && LA127_0<=33)||(LA127_0>=36 && LA127_0<=44)||(LA127_0>=68 && LA127_0<=70)||LA127_0==73||LA127_0==76||LA127_0==78||LA127_0==82) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6192:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6192:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6193:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento13156);
                    	    lv_sentencias_14_0=ruleSentencias();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sentencias",
                    	            		lv_sentencias_14_0, 
                    	            		"Sentencias");
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

            otherlv_15=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleProcedimiento13171); 

                	newLeafNode(otherlv_15, grammarAccess.getProcedimientoAccess().getEnd_initiationKeyword_11());
                
            otherlv_16=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleProcedimiento13183); 

                	newLeafNode(otherlv_16, grammarAccess.getProcedimientoAccess().getEnd_procedureKeyword_12());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6225:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6226:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6227:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso13220);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso13231); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6234:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6237:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6238:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6238:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt129=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt129=1;
                }
                break;
            case 109:
                {
                alt129=2;
                }
                break;
            case 110:
                {
                alt129=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6239:2: kw= 'E'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTipoPaso13269); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6246:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleTipoPaso13288); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6253:2: kw= 'S'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleTipoPaso13307); 

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

    // Delegated rules


    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA46_eotS =
        "\12\uffff";
    static final String DFA46_eofS =
        "\12\uffff";
    static final String DFA46_minS =
        "\1\4\4\uffff\2\62\1\4\2\uffff";
    static final String DFA46_maxS =
        "\1\74\4\uffff\2\62\1\75\2\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
    static final String DFA46_specialS =
        "\12\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\6\3\uffff\1\5\52\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff"+
            "\1\4",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1105:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA48_eotS =
        "\12\uffff";
    static final String DFA48_eofS =
        "\12\uffff";
    static final String DFA48_minS =
        "\1\4\5\uffff\2\34\2\uffff";
    static final String DFA48_maxS =
        "\1\122\5\uffff\2\103\2\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\6";
    static final String DFA48_specialS =
        "\12\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\7\3\uffff\1\6\27\uffff\1\4\1\5\2\uffff\11\10\27\uffff\1\1"+
            "\1\2\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "1274:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )";
        }
    }
    static final String DFA108_eotS =
        "\25\uffff";
    static final String DFA108_eofS =
        "\25\uffff";
    static final String DFA108_minS =
        "\1\4\2\55\1\uffff\1\4\1\55\6\65\1\uffff\1\7\1\uffff\1\56\4\7\1\65";
    static final String DFA108_maxS =
        "\1\10\2\64\1\uffff\1\133\7\71\1\uffff\1\7\1\uffff\1\71\2\61\2\7"+
        "\1\71";
    static final String DFA108_acceptS =
        "\3\uffff\1\3\10\uffff\1\2\1\uffff\1\1\6\uffff";
    static final String DFA108_specialS =
        "\25\uffff}>";
    static final String[] DFA108_transitionS = {
            "\1\2\3\uffff\1\1",
            "\1\3\6\uffff\1\4",
            "\1\3\6\uffff\1\4",
            "",
            "\1\13\2\uffff\1\5\1\12\1\6\1\7\117\uffff\1\10\1\11",
            "\1\15\7\uffff\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "\1\16\3\uffff\1\14",
            "",
            "\1\17",
            "",
            "\1\20\1\21\5\uffff\1\16\3\uffff\1\14",
            "\1\24\50\uffff\1\22\1\23",
            "\1\24\50\uffff\1\22\1\23",
            "\1\24",
            "\1\24",
            "\1\16\3\uffff\1\14"
    };

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "5188:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )";
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
        public static final BitSet FOLLOW_ruleEString_in_ruleAlgoritmo262 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo284 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleAlgoritmo305 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_15_in_ruleAlgoritmo320 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo341 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo361 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleAlgoritmo376 = new BitSet(new long[]{0x00000000080E0000L,0x0000000003E00001L});
        public static final BitSet FOLLOW_17_in_ruleAlgoritmo389 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo411 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo432 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_18_in_ruleAlgoritmo450 = new BitSet(new long[]{0x15080000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo472 = new BitSet(new long[]{0x15080000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo493 = new BitSet(new long[]{0x15080000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_19_in_ruleAlgoritmo511 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo533 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo554 = new BitSet(new long[]{0x00000000080E0110L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo581 = new BitSet(new long[]{0x00000000080E0000L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo602 = new BitSet(new long[]{0x00000000080E0000L,0x0000000003E00001L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleAlgoritmo626 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAlgoritmo638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_entryRuleModulo674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModulo684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleModulo721 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo738 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModulo755 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo776 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo796 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleModulo811 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleModulo823 = new BitSet(new long[]{0x00000000088E0000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_17_in_ruleModulo836 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo858 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo879 = new BitSet(new long[]{0x00000000088C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_18_in_ruleModulo897 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo919 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo940 = new BitSet(new long[]{0x0000000008880110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_19_in_ruleModulo958 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo980 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo1001 = new BitSet(new long[]{0x0000000008800110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1028 = new BitSet(new long[]{0x0000000008800000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo1049 = new BitSet(new long[]{0x0000000008800000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_23_in_ruleModulo1064 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleImplementacion_in_ruleModulo1085 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleModulo1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementacion_in_entryRuleImplementacion1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementacion1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleImplementacion1189 = new BitSet(new long[]{0x000000000C0E0000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_17_in_ruleImplementacion1202 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1224 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion1245 = new BitSet(new long[]{0x000000000C0C0110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_18_in_ruleImplementacion1263 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1285 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion1306 = new BitSet(new long[]{0x150800000C080110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_19_in_ruleImplementacion1324 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1346 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1367 = new BitSet(new long[]{0x000000000C000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1394 = new BitSet(new long[]{0x000000000C000000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1415 = new BitSet(new long[]{0x000000000C000000L,0x0000000003E00000L});
        public static final BitSet FOLLOW_26_in_ruleImplementacion1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraSubproceso1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1585 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCabeceraProcedimiento1632 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCabeceraProcedimiento1653 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraProcedimiento1665 = new BitSet(new long[]{0x0000400040000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1687 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraProcedimiento1700 = new BitSet(new long[]{0x0000400000000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1721 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraProcedimiento1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraFuncion1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1829 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCabeceraFuncion1841 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCabeceraFuncion1862 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraFuncion1874 = new BitSet(new long[]{0x0000400040000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1896 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraFuncion1909 = new BitSet(new long[]{0x0000400000000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1930 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraFuncion1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1982 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo2093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso2209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario2328 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComentario2383 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario2399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias2440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias2450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias2524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias2551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias2632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_ruleSentencias2659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque2694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque2751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque2778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque2832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion2904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir3013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFuncionFicheroAbrir3060 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncionFicheroAbrir3072 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3094 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3106 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir3127 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir3139 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir3160 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroAbrir3173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar3209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroCerrar3256 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncionFicheroCerrar3268 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar3289 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroCerrar3301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura3338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleModoApertura3387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleModoApertura3406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna3447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleNombreInterna3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleNombreInterna3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNombreInterna3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNombreInterna3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNombreInterna3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNombreInterna3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNombreInterna3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleNombreInterna3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleNombreInterna3648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3835 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleEFloat3853 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3868 = new BitSet(new long[]{0x0000C00000000002L});
        public static final BitSet FOLLOW_46_in_ruleEFloat3888 = new BitSet(new long[]{0x0003000000000080L});
        public static final BitSet FOLLOW_47_in_ruleEFloat3907 = new BitSet(new long[]{0x0003000000000080L});
        public static final BitSet FOLLOW_48_in_ruleEFloat3922 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_49_in_ruleEFloat3941 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro4005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro4015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo4095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo4105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo4152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo4179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido4214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido4269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente4304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente4314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente4359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes4394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes4404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes4450 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleConstantes4462 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes4483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector4529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleVector4566 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVector4578 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector4599 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVector4611 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVector4623 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector4644 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleVector4656 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz4713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleMatriz4760 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleMatriz4772 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4793 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleMatriz4805 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4826 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleMatriz4838 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleMatriz4850 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4871 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMatriz4883 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleRegistro4987 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro5008 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5030 = new BitSet(new long[]{0x0800000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro5051 = new BitSet(new long[]{0x0800000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_59_in_ruleRegistro5065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo5101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleArchivo5148 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo5169 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleArchivo5181 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo5202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado5238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado5248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado5294 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleEnumerado5306 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleEnumerado5318 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5340 = new BitSet(new long[]{0x4000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEnumerado5353 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado5374 = new BitSet(new long[]{0x4000000020000000L});
        public static final BitSet FOLLOW_62_in_ruleEnumerado5389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango5425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango5482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango5509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico5600 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoNumerico5612 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5634 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleSubrangoNumerico5646 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5704 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado5714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5760 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSubrangoEnumerado5772 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5794 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruleSubrangoEnumerado5806 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio5864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio5874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleInicio5911 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleInicio5932 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5954 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5975 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleInicio5990 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6012 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio6033 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_66_in_ruleInicio6048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString6085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString6136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString6162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable6207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable6263 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDeclaracionVariable6275 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6296 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionVariable6309 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable6330 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia6368 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia6378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia6424 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleDeclaracionPropia6436 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6457 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionPropia6470 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia6491 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion6529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion6539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal6658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal6704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAsignacionNormal6716 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionNormal6737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_67_in_ruleAsignacionCompleja6841 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionCompleja6862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleEscribir6945 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEscribir6957 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6978 = new BitSet(new long[]{0x00001FF060000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_29_in_ruleEscribir6992 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir7013 = new BitSet(new long[]{0x00001FF060000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir7041 = new BitSet(new long[]{0x00001FF060000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_30_in_ruleEscribir7055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer7091 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer7101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleLeer7138 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLeer7150 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer7171 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleLeer7183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi7219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi7229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleSi7266 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleSi7287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleSi7299 = new BitSet(new long[]{0x00001FF300000790L,0x000007C00C045370L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7321 = new BitSet(new long[]{0x00001FF300000790L,0x000007C00C045370L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi7342 = new BitSet(new long[]{0x00001FF300000790L,0x000007C00C045370L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi7366 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000100L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi7388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleSi7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras7437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulemientras7484 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulemientras7505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulemientras7517 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045A70L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7539 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045A70L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7560 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045A70L});
        public static final BitSet FOLLOW_75_in_rulemientras7575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir7611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir7621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulerepetir7658 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C047270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7680 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C047270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7701 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C047270L});
        public static final BitSet FOLLOW_77_in_rulerepetir7716 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulerepetir7737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruledesde7820 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde7841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruledesde7853 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruledesde7874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruledesde7886 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C055270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7908 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C055270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7929 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C055270L});
        public static final BitSet FOLLOW_80_in_ruledesde7944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso7980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso7990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleCaso8027 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso8048 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleCaso8060 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8082 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso8103 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso8127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun8164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesegun8211 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulesegun8223 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_rulesegun8244 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulesegun8256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_rulesegun8268 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8290 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun8311 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0000L});
        public static final BitSet FOLLOW_83_in_rulesegun8326 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C145270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8348 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C145270L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun8369 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C145270L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun8393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_rulesegun8406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable8443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable8454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleTipoVariable8492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleTipoVariable8511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleTipoVariable8530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleTipoVariable8549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleTipoVariable8568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable8618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano8710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano8721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_rulebooleano8759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rulebooleano8778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr8821 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr8832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_rulesignoOr8869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd8909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd8920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_rulesignoAnd8957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad9008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_rulesignoIgualdad9046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_rulesignoIgualdad9065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion9106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion9117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_rulesignoComparacion9155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_rulesignoComparacion9174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_rulesignoComparacion9193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_rulesignoComparacion9212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma9253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma9264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulesignoSuma9301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta9341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta9352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulesignoResta9389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion9429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion9440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_rulesignoMultiplicacion9477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision9517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision9528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_rulesignoDivision9565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion9604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion9614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr9704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9751 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr9781 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9802 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd9850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd9897 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd9927 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd9948 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad9986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad9996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10043 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad10073 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad10094 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion10132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion10142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10189 = new BitSet(new long[]{0x0000000000000002L,0x0000000F00000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion10219 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10240 = new BitSet(new long[]{0x0000000000000002L,0x0000000F00000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta10278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta10288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10335 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta10367 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta10405 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10428 = new BitSet(new long[]{0x0003000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision10476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10523 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10555 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10593 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10616 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria10654 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria10664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_rulePrimaria10702 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria10724 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_102_in_rulePrimaria10735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_rulePrimaria10764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_rulePrimaria10791 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria10812 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria10824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_rulePrimaria10853 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_rulePrimaria10865 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria10886 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulePrimaria10898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_rulePrimaria10927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_rulePrimaria10954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_entryRuleFunciones10989 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunciones10999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFunciones11055 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunciones11067 = new BitSet(new long[]{0x00001FF040000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones11089 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones11102 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones11123 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones11139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleFunciones11177 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFunciones11189 = new BitSet(new long[]{0x00001FF040000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones11211 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones11224 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones11245 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones11261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas11298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesComplejas11308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas11365 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVariablesComplejas11377 = new BitSet(new long[]{0x0000000000000790L,0x000000000C000000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11398 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas11410 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas11424 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas11486 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleVariablesComplejas11498 = new BitSet(new long[]{0x0000000000000790L,0x000000000C000000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11519 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleVariablesComplejas11531 = new BitSet(new long[]{0x0000000000000790L,0x000000000C000000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas11552 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas11564 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas11578 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas11639 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas11651 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11673 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleVariablesComplejas11686 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas11707 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas11747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesBasicas11757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVariablesBasicas11813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleVariablesBasicas11851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleVariablesBasicas11885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleVariablesBasicas11924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleVariablesBasicas11967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesBasicas12005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino12042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino12052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_ruleSino12098 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino12120 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino12141 = new BitSet(new long[]{0x00001FF300000792L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino12165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver12202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver12212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleDevolver12258 = new BitSet(new long[]{0x00001FF000000790L,0x000001C00C000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleDevolver12279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion12315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion12325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion12371 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion12392 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleParametroFuncion12404 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion12425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion12461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion12471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion12517 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleFuncion12529 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion12550 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleFuncion12562 = new BitSet(new long[]{0x0000400040000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion12584 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncion12597 = new BitSet(new long[]{0x0000400000000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion12618 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncion12634 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion12647 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleFuncion12662 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFuncion12676 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion12698 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion12719 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleFuncion12734 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion12756 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion12777 = new BitSet(new long[]{0x00001FF300000790L,0x000005C00C045270L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion12801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_66_in_ruleFuncion12813 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleFuncion12825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento12861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento12871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleProcedimiento12908 = new BitSet(new long[]{0x0000000000000110L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento12929 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleProcedimiento12941 = new BitSet(new long[]{0x0000400040000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento12963 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleProcedimiento12976 = new BitSet(new long[]{0x0000400000000000L,0x0000600000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento12997 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleProcedimiento13013 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento13026 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleProcedimiento13041 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleProcedimiento13055 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento13077 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento13098 = new BitSet(new long[]{0x0000000000000110L,0x0000000003E00002L});
        public static final BitSet FOLLOW_65_in_ruleProcedimiento13113 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento13135 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento13156 = new BitSet(new long[]{0x00001FF300000790L,0x000001C00C045274L});
        public static final BitSet FOLLOW_66_in_ruleProcedimiento13171 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_108_in_ruleProcedimiento13183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso13220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso13231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTipoPaso13269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleTipoPaso13288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleTipoPaso13307 = new BitSet(new long[]{0x0000000000000002L});
    }


}