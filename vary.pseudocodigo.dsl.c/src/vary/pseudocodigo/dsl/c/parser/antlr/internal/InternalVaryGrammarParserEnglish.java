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
import vary.pseudocodigo.dsl.c.services.VaryGrammarGrammarAccessEnglish;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVaryGrammarParserEnglish extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_CAD", "RULE_CAR", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algorithm'", "'const'", "'type'", "'var'", "'end_algorithm'", "'open'", "'('", "','", "')'", "'close'", "'writing'", "'reading'", "'cos'", "'square'", "'exp'", "'ln'", "'log'", "'sen'", "'sqrt'", "'length'", "'concatena'", "'.'", "'E'", "'e'", "'+'", "'-'", "'='", "'vector'", "'['", "']'", "'of'", "': '", "'matrix'", "']['", "'registry:'", "'end_registry'", "'archive of '", "'{'", "'}'", "'..'", "'main'", "'initiation'", "'end_initiation'", "'write'", "'read'", "'if'", "'then'", "'end_if'", "'while'", "'do'", "'end_while'", "'repeat'", "'until'", "'for'", "'to'", "'end_for'", "'case'", "'according_to'", "'otherwise:'", "'end_according_to'", "'integer'", "'character'", "'real'", "'boolean'", "'string'", "'true'", "'false'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", "'*'", "'/'", "'|'", "'-('", "'not'", "'else'", "'return'", "'function'", "'end_function'", "'procedure'", "'end_procedure'", "'E/S'", "'S'"
    };
    public static final int RULE_ID=8;
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
    public static final int RULE_STRING=7;
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
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_COMENT=5;
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
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=4;
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


        public InternalVaryGrammarParserEnglish(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaryGrammarParserEnglish(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaryGrammarParserEnglish.tokenNames; }
    public String getGrammarFileName() { return "../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g"; }



     	private VaryGrammarGrammarAccessEnglish grammarAccess;
     	
        public InternalVaryGrammarParserEnglish(TokenStream input, VaryGrammarGrammarAccessEnglish grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Codigo";	
       	}
       	
       	@Override
       	protected VaryGrammarGrammarAccessEnglish getGrammarAccess() {
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:76:1: ruleCodigo returns [EObject current=null] : (otherlv_0= 'Algorithm' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'end_algorithm' ) ;
    public final EObject ruleCodigo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_16=null;
        EObject lv_comentarios_2_0 = null;

        EObject lv_comentarios_3_0 = null;

        EObject lv_constantes_5_0 = null;

        EObject lv_constantes_6_0 = null;

        EObject lv_tipocomplejo_8_0 = null;

        EObject lv_tipocomplejo_9_0 = null;

        EObject lv_global_11_0 = null;

        EObject lv_global_12_0 = null;

        EObject lv_funcion_13_0 = null;

        EObject lv_funcion_14_0 = null;

        EObject lv_tiene_15_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:79:28: ( (otherlv_0= 'Algorithm' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'end_algorithm' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:80:1: (otherlv_0= 'Algorithm' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'end_algorithm' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:80:1: (otherlv_0= 'Algorithm' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'end_algorithm' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:80:3: otherlv_0= 'Algorithm' ruleEString ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )? (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )? (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )? (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )? ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )? ( (lv_tiene_15_0= ruleInicio ) ) otherlv_16= 'end_algorithm'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCodigo122); 

                	newLeafNode(otherlv_0, grammarAccess.getCodigoAccess().getAlgorithmKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getCodigoAccess().getEStringParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCodigo138);
            ruleEString();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:92:1: ( ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:92:2: ( (lv_comentarios_2_0= ruleComentario ) ) ( (lv_comentarios_3_0= ruleComentario ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:92:2: ( (lv_comentarios_2_0= ruleComentario ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:93:1: (lv_comentarios_2_0= ruleComentario )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:93:1: (lv_comentarios_2_0= ruleComentario )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:94:3: lv_comentarios_2_0= ruleComentario
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo159);
                    lv_comentarios_2_0=ruleComentario();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"comentarios",
                            		lv_comentarios_2_0, 
                            		"Comentario");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:110:2: ( (lv_comentarios_3_0= ruleComentario ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_SL_COMMENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:111:1: (lv_comentarios_3_0= ruleComentario )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:111:1: (lv_comentarios_3_0= ruleComentario )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:112:3: lv_comentarios_3_0= ruleComentario
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getComentariosComentarioParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleComentario_in_ruleCodigo180);
                    	    lv_comentarios_3_0=ruleComentario();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
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
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:128:5: (otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:128:7: otherlv_4= 'const' ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )?
                    {
                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCodigo196); 

                        	newLeafNode(otherlv_4, grammarAccess.getCodigoAccess().getConstKeyword_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:132:1: ( ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:132:2: ( (lv_constantes_5_0= ruleConstantes ) ) ( (lv_constantes_6_0= ruleConstantes ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:132:2: ( (lv_constantes_5_0= ruleConstantes ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:133:1: (lv_constantes_5_0= ruleConstantes )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:133:1: (lv_constantes_5_0= ruleConstantes )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:134:3: lv_constantes_5_0= ruleConstantes
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo218);
                            lv_constantes_5_0=ruleConstantes();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constantes",
                                    		lv_constantes_5_0, 
                                    		"Constantes");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:150:2: ( (lv_constantes_6_0= ruleConstantes ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:151:1: (lv_constantes_6_0= ruleConstantes )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:151:1: (lv_constantes_6_0= ruleConstantes )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:152:3: lv_constantes_6_0= ruleConstantes
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getConstantesConstantesParserRuleCall_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleCodigo239);
                            	    lv_constantes_6_0=ruleConstantes();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constantes",
                            	            		lv_constantes_6_0, 
                            	            		"Constantes");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:168:7: (otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:168:9: otherlv_7= 'type' ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )?
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCodigo257); 

                        	newLeafNode(otherlv_7, grammarAccess.getCodigoAccess().getTypeKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:172:1: ( ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==41||LA7_0==46||LA7_0==48||LA7_0==50) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:172:2: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) ) ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:172:2: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:173:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:173:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:174:3: lv_tipocomplejo_8_0= ruleTipoComplejo
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo279);
                            lv_tipocomplejo_8_0=ruleTipoComplejo();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"tipocomplejo",
                                    		lv_tipocomplejo_8_0, 
                                    		"TipoComplejo");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:190:2: ( (lv_tipocomplejo_9_0= ruleTipoComplejo ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==41||LA6_0==46||LA6_0==48||LA6_0==50) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:191:1: (lv_tipocomplejo_9_0= ruleTipoComplejo )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:191:1: (lv_tipocomplejo_9_0= ruleTipoComplejo )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:192:3: lv_tipocomplejo_9_0= ruleTipoComplejo
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleCodigo300);
                            	    lv_tipocomplejo_9_0=ruleTipoComplejo();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"tipocomplejo",
                            	            		lv_tipocomplejo_9_0, 
                            	            		"TipoComplejo");
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:208:7: (otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:208:9: otherlv_10= 'var' ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )?
                    {
                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCodigo318); 

                        	newLeafNode(otherlv_10, grammarAccess.getCodigoAccess().getVarKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:1: ( ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )* )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case 74:
                            {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==45) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 75:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==45) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 76:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==45) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 77:
                            {
                            int LA10_4 = input.LA(2);

                            if ( (LA10_4==45) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case 78:
                            {
                            int LA10_5 = input.LA(2);

                            if ( (LA10_5==45) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case RULE_STRING:
                        case RULE_ID:
                            {
                            alt10=1;
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:2: ( (lv_global_11_0= ruleDeclaracion ) ) ( (lv_global_12_0= ruleDeclaracion ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:212:2: ( (lv_global_11_0= ruleDeclaracion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:213:1: (lv_global_11_0= ruleDeclaracion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:213:1: (lv_global_11_0= ruleDeclaracion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:214:3: lv_global_11_0= ruleDeclaracion
                            {
                             
                            	        newCompositeNode(grammarAccess.getCodigoAccess().getGlobalDeclaracionParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleCodigo340);
                            lv_global_11_0=ruleDeclaracion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"global",
                                    		lv_global_11_0, 
                                    		"Declaracion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:230:2: ( (lv_global_12_0= ruleDeclaracion ) )*
                            loop9:
                            do {
                                int alt9=2;
                                switch ( input.LA(1) ) {
                                case 74:
                                    {
                                    int LA9_1 = input.LA(2);

                                    if ( (LA9_1==45) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 75:
                                    {
                                    int LA9_2 = input.LA(2);

                                    if ( (LA9_2==45) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 76:
                                    {
                                    int LA9_3 = input.LA(2);

                                    if ( (LA9_3==45) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 77:
                                    {
                                    int LA9_4 = input.LA(2);

                                    if ( (LA9_4==45) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case 78:
                                    {
                                    int LA9_5 = input.LA(2);

                                    if ( (LA9_5==45) ) {
                                        alt9=1;
                                    }


                                    }
                                    break;
                                case RULE_STRING:
                                case RULE_ID:
                                    {
                                    alt9=1;
                                    }
                                    break;

                                }

                                switch (alt9) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:231:1: (lv_global_12_0= ruleDeclaracion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:231:1: (lv_global_12_0= ruleDeclaracion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:232:3: lv_global_12_0= ruleDeclaracion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCodigoAccess().getGlobalDeclaracionParserRuleCall_5_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleCodigo361);
                            	    lv_global_12_0=ruleDeclaracion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"global",
                            	            		lv_global_12_0, 
                            	            		"Declaracion");
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:248:7: ( ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=74 && LA13_0<=78)||LA13_0==98) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:248:8: ( (lv_funcion_13_0= ruleSubproceso ) ) ( (lv_funcion_14_0= ruleSubproceso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:248:8: ( (lv_funcion_13_0= ruleSubproceso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:249:1: (lv_funcion_13_0= ruleSubproceso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:249:1: (lv_funcion_13_0= ruleSubproceso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:250:3: lv_funcion_13_0= ruleSubproceso
                    {
                     
                    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo388);
                    lv_funcion_13_0=ruleSubproceso();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	        }
                           		add(
                           			current, 
                           			"funcion",
                            		lv_funcion_13_0, 
                            		"Subproceso");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:266:2: ( (lv_funcion_14_0= ruleSubproceso ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=74 && LA12_0<=78)||LA12_0==98) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:267:1: (lv_funcion_14_0= ruleSubproceso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:267:1: (lv_funcion_14_0= ruleSubproceso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:268:3: lv_funcion_14_0= ruleSubproceso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCodigoAccess().getFuncionSubprocesoParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleCodigo409);
                    	    lv_funcion_14_0=ruleSubproceso();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCodigoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"funcion",
                    	            		lv_funcion_14_0, 
                    	            		"Subproceso");
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:284:5: ( (lv_tiene_15_0= ruleInicio ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:285:1: (lv_tiene_15_0= ruleInicio )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:285:1: (lv_tiene_15_0= ruleInicio )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:286:3: lv_tiene_15_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getCodigoAccess().getTieneInicioParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleCodigo433);
            lv_tiene_15_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodigoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_15_0, 
                    		"Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCodigo445); 

                	newLeafNode(otherlv_16, grammarAccess.getCodigoAccess().getEnd_algorithmKeyword_8());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleTipoComplejo"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:314:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:315:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:316:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo481);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo491); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:323:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:326:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:328:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo538);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:338:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo565);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:348:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo592);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:358:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo619);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:368:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo646);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:378:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo673);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:394:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:395:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:396:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso708);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso718); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:403:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:406:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:407:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:407:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=74 && LA15_0<=78)) ) {
                alt15=1;
            }
            else if ( (LA15_0==98) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:408:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso765);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:418:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso792);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:434:1: entryRuleComentario returns [EObject current=null] : iv_ruleComentario= ruleComentario EOF ;
    public final EObject entryRuleComentario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComentario = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:435:2: (iv_ruleComentario= ruleComentario EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:436:2: iv_ruleComentario= ruleComentario EOF
            {
             newCompositeNode(grammarAccess.getComentarioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComentario_in_entryRuleComentario827);
            iv_ruleComentario=ruleComentario();

            state._fsp--;

             current =iv_ruleComentario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComentario837); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:443:1: ruleComentario returns [EObject current=null] : ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) ;
    public final EObject ruleComentario() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token lv_mensaje_2_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:446:28: ( ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:447:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:447:1: ( () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:447:2: () this_SL_COMMENT_1= RULE_SL_COMMENT ( (lv_mensaje_2_0= RULE_COMENT ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:447:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:448:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComentarioAccess().getComentarioAction_0(),
                        current);
                

            }

            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleComentario882); 
             
                newLeafNode(this_SL_COMMENT_1, grammarAccess.getComentarioAccess().getSL_COMMENTTerminalRuleCall_1()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:457:1: ( (lv_mensaje_2_0= RULE_COMENT ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:458:1: (lv_mensaje_2_0= RULE_COMENT )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:458:1: (lv_mensaje_2_0= RULE_COMENT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:459:3: lv_mensaje_2_0= RULE_COMENT
            {
            lv_mensaje_2_0=(Token)match(input,RULE_COMENT,FollowSets000.FOLLOW_RULE_COMENT_in_ruleComentario898); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:483:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:484:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:485:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias939);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias949); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:492:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:495:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:496:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:496:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt16=7;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:497:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias996);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:507:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias1023);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:517:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias1050);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:527:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1077);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:537:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1104);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:547:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias1131);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:557:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_ruleSentencias1158);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:573:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:574:2: (iv_ruleBloque= ruleBloque EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:575:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque1193);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque1203); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:582:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:585:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:586:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:586:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt17=1;
                }
                break;
            case 62:
                {
                alt17=2;
                }
                break;
            case 65:
                {
                alt17=3;
                }
                break;
            case 67:
                {
                alt17=4;
                }
                break;
            case 71:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:587:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque1250);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:597:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque1277);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:607:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque1304);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:617:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque1331);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:627:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque1358);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:643:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:644:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:645:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1393);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion1403); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:652:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:655:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:656:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:656:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=74 && LA18_0<=78)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:657:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1450);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:667:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1477);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:683:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:684:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:685:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1512);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1522); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:692:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:695:28: ( (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:696:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:696:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:696:3: otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFuncionFicheroAbrir1559); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getOpenKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncionFicheroAbrir1571); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:704:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:704:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:704:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:705:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:705:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:706:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1593);
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

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuncionFicheroAbrir1605); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:726:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:727:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:727:1: (lv_modo_4_0= ruleModoApertura )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:728:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1626);
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

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuncionFicheroAbrir1638); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:748:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:749:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:749:1: (lv_variable_6_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:750:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1659);
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

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncionFicheroAbrir1672); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:778:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:779:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:780:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1708);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1718); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:787:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:790:28: ( (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:791:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:791:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:791:3: otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFuncionFicheroCerrar1755); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCloseKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncionFicheroCerrar1767); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:799:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:800:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:800:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:801:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar1788);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncionFicheroCerrar1800); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:829:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:830:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:831:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura1837);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura1848); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:838:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'writing' | kw= 'reading' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:841:28: ( (kw= 'writing' | kw= 'reading' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:842:1: (kw= 'writing' | kw= 'reading' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:842:1: (kw= 'writing' | kw= 'reading' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            else if ( (LA19_0==25) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:843:2: kw= 'writing'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModoApertura1886); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getWritingKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:850:2: kw= 'reading'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleModoApertura1905); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:863:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:864:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:865:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1946);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna1957); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:872:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:875:28: ( (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:876:1: (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:876:1: (kw= 'cos' | kw= 'square' | kw= 'exp' | kw= 'ln' | kw= 'log' | kw= 'sen' | kw= 'sqrt' | kw= 'length' | kw= 'concatena' )
            int alt20=9;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt20=1;
                }
                break;
            case 27:
                {
                alt20=2;
                }
                break;
            case 28:
                {
                alt20=3;
                }
                break;
            case 29:
                {
                alt20=4;
                }
                break;
            case 30:
                {
                alt20=5;
                }
                break;
            case 31:
                {
                alt20=6;
                }
                break;
            case 32:
                {
                alt20=7;
                }
                break;
            case 33:
                {
                alt20=8;
                }
                break;
            case 34:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:877:2: kw= 'cos'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNombreInterna1995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:884:2: kw= 'square'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleNombreInterna2014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSquareKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:891:2: kw= 'exp'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleNombreInterna2033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:898:2: kw= 'ln'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleNombreInterna2052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:905:2: kw= 'log'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleNombreInterna2071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:912:2: kw= 'sen'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNombreInterna2090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:919:2: kw= 'sqrt'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNombreInterna2109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:926:2: kw= 'length'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNombreInterna2128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLengthKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:933:2: kw= 'concatena'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNombreInterna2147); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:946:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:947:2: (iv_ruleEInt= ruleEInt EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:948:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2188);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2199); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:955:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:958:28: (this_INT_0= RULE_INT )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:959:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2238); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:974:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:975:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:976:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat2283);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat2294); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:983:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:986:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:987:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:987:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:987:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2334); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEFloat2352); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2367); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1007:1: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=36 && LA23_0<=37)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1007:2: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1007:2: (kw= 'E' | kw= 'e' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==37) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1008:2: kw= 'E'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEFloat2387); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1015:2: kw= 'e'
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEFloat2406); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1020:2: (kw= '+' | kw= '-' )?
                    int alt22=3;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==38) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==39) ) {
                        alt22=2;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1021:2: kw= '+'
                            {
                            kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEFloat2421); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1028:2: kw= '-'
                            {
                            kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEFloat2440); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat2457); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1048:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1049:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1050:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro2504);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro2514); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1057:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1060:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1061:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1061:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1062:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1062:1: (lv_nombre_campo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1063:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro2559);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1087:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1088:2: (iv_ruleTipo= ruleTipo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1089:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo2594);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo2604); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1096:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1099:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1100:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1100:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=74 && LA24_0<=78)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1101:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo2651);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1111:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo2678);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1127:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1128:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1129:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido2713);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido2723); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1136:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1139:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1140:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1140:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1141:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1141:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1142:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido2768);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1166:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1167:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1168:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente2803);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente2813); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1175:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1178:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1179:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1179:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1180:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1180:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1181:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente2858);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1205:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1206:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1207:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes2893);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes2903); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1214:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1217:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1218:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1218:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1218:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1218:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1219:1: (lv_variable_0_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1219:1: (lv_variable_0_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1220:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes2949);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConstantes2961); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1240:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1241:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1241:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1242:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes2982);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1266:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1267:2: (iv_ruleVector= ruleVector EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1268:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector3018);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector3028); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1275:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1278:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1279:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1279:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1279:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleVector3065); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleVector3077); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1287:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1288:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1288:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1289:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector3098);
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

            otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleVector3110); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleVector3122); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getOfKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1313:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1314:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1314:1: (lv_tipo_5_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1315:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector3143);
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

            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleVector3155); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1335:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1336:1: (lv_nombre_7_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1336:1: (lv_nombre_7_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1337:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector3176);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1361:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1362:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1363:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz3212);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz3222); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1370:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1373:28: ( (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1374:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1374:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1374:3: otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleMatriz3259); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrixKeyword_0());
                
            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleMatriz3271); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1382:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1383:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1383:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1384:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz3292);
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

            otherlv_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMatriz3304); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1404:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1405:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1405:1: (lv_valor_4_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1406:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz3325);
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

            otherlv_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleMatriz3337); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleMatriz3349); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getOfKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1430:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1431:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1431:1: (lv_tipo_7_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1432:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz3370);
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

            otherlv_8=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMatriz3382); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1452:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1453:1: (lv_nombre_9_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1453:1: (lv_nombre_9_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1454:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz3403);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1478:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1479:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1480:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro3439);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro3449); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1487:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1490:28: ( (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1491:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1491:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1491:3: otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* ) otherlv_4= 'end_registry'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleRegistro3486); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistryKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1495:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1496:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1496:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1497:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro3507);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1513:2: ( ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1513:3: ( (lv_variable_2_0= ruleDeclaracion ) ) ( (lv_variable_3_0= ruleDeclaracion ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1513:3: ( (lv_variable_2_0= ruleDeclaracion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1514:1: (lv_variable_2_0= ruleDeclaracion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1514:1: (lv_variable_2_0= ruleDeclaracion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1515:3: lv_variable_2_0= ruleDeclaracion
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro3529);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1531:2: ( (lv_variable_3_0= ruleDeclaracion ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)||(LA25_0>=74 && LA25_0<=78)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1532:1: (lv_variable_3_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1532:1: (lv_variable_3_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1533:3: lv_variable_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro3550);
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
            	    break loop25;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRegistro3564); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1561:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1562:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1563:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo3600);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo3610); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1570:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1573:28: ( (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1574:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1574:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1574:3: otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleArchivo3647); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchiveOfKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1578:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1579:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1579:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1580:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo3668);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleArchivo3680); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1600:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1601:1: (lv_nombre_3_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1601:1: (lv_nombre_3_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1602:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo3701);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1626:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1627:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1628:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado3737);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado3747); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1635:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1638:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1639:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1639:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1639:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1639:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1640:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1640:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1641:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado3793);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEnumerado3805); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEnumerado3817); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1665:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1665:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1665:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1666:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1666:1: (lv_valor_3_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1667:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado3839);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1683:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1683:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEnumerado3852); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1687:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1688:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1688:1: (lv_valor_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1689:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado3873);
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
            	    break loop26;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEnumerado3888); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1717:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1718:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1719:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango3924);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango3934); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1726:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1729:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1730:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1730:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==40) ) {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>=RULE_STRING && LA27_3<=RULE_ID)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_3==RULE_INT) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==RULE_ID) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==40) ) {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>=RULE_STRING && LA27_3<=RULE_ID)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_3==RULE_INT) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1731:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango3981);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1741:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango4008);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1757:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1758:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1759:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4043);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico4053); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1766:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1769:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1770:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1770:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1770:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1770:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1771:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1771:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1772:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico4099);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSubrangoNumerico4111); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1792:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1792:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1792:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1793:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1793:1: (lv_limite_inf_2_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1794:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4133);
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

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSubrangoNumerico4145); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1814:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1815:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1815:1: (lv_limite_sup_4_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1816:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico4166);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1840:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1841:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1842:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado4203);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado4213); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1849:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1852:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1853:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1853:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1853:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1853:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1854:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1854:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1855:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4259);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSubrangoEnumerado4271); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1875:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1875:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1875:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1876:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1876:1: (lv_limite_inf_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1877:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4293);
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

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSubrangoEnumerado4305); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1897:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1898:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1898:1: (lv_limite_sup_4_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1899:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado4326);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1923:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1924:2: (iv_ruleInicio= ruleInicio EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1925:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio4363);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio4373); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1932:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1935:28: ( (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1936:1: (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1936:1: (otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1936:3: otherlv_0= 'main' () otherlv_2= 'var' ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )? otherlv_5= 'initiation' ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )? otherlv_8= 'end_initiation'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleInicio4410); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getMainKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1940:1: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1941:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInicio4431); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1950:1: ( ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=74 && LA29_0<=78)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1950:2: ( (lv_declaracion_3_0= ruleDeclaracion ) ) ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1950:2: ( (lv_declaracion_3_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1951:1: (lv_declaracion_3_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1951:1: (lv_declaracion_3_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1952:3: lv_declaracion_3_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4453);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1968:2: ( (lv_declaracion_4_0= ruleDeclaracion ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=74 && LA28_0<=78)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1969:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1969:1: (lv_declaracion_4_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1970:3: lv_declaracion_4_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio4474);
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
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleInicio4489); 

                	newLeafNode(otherlv_5, grammarAccess.getInicioAccess().getInitiationKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1990:1: ( ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||LA31_0==19||LA31_0==23||(LA31_0>=26 && LA31_0<=34)||(LA31_0>=57 && LA31_0<=59)||LA31_0==62||LA31_0==65||LA31_0==67||LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1990:2: ( (lv_tiene_6_0= ruleSentencias ) ) ( (lv_tiene_7_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1990:2: ( (lv_tiene_6_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1991:1: (lv_tiene_6_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1991:1: (lv_tiene_6_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:1992:3: lv_tiene_6_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4511);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2008:2: ( (lv_tiene_7_0= ruleSentencias ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)||LA30_0==19||LA30_0==23||(LA30_0>=26 && LA30_0<=34)||(LA30_0>=57 && LA30_0<=59)||LA30_0==62||LA30_0==65||LA30_0==67||LA30_0==71) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2009:1: (lv_tiene_7_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2009:1: (lv_tiene_7_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2010:3: lv_tiene_7_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio4532);
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
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleInicio4547); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2038:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2039:2: (iv_ruleEString= ruleEString EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2040:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString4584);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString4595); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2047:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2050:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2051:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2051:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2051:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString4635); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2059:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString4661); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2074:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2075:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2076:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable4706);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable4716); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2083:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2086:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2087:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2087:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2087:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2087:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2088:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2088:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2089:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable4762);
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

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDeclaracionVariable4774); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2109:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2110:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2110:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2111:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable4795);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2127:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2127:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDeclaracionVariable4808); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2131:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2132:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2132:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2133:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable4829);
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
            	    break loop33;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2157:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2158:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2159:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia4867);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia4877); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2166:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2169:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2170:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2170:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2170:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2170:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2171:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2171:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2172:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia4923);
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

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDeclaracionPropia4935); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2192:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2193:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2193:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2194:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia4956);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2210:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2210:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDeclaracionPropia4969); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2214:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2215:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2215:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2216:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia4990);
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
            	    break loop34;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2240:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2241:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2242:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion5028);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion5038); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2249:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2252:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2253:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2253:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==35||LA35_1==42) ) {
                    alt35=2;
                }
                else if ( (LA35_1==40) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_ID) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==40) ) {
                    alt35=1;
                }
                else if ( (LA35_2==35||LA35_2==42) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2254:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5085);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2264:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5112);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2280:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2281:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2282:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5147);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal5157); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2289:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2292:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2293:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2293:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2293:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2293:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2294:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2294:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2295:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal5203);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsignacionNormal5215); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2315:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2316:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2316:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2317:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionNormal5236);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2341:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2342:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2343:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja5272);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja5282); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2350:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2353:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2354:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2354:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2354:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '=' ( (lv_operador_2_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2354:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2355:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2355:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2356:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja5328);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsignacionCompleja5340); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2376:1: ( (lv_operador_2_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2377:1: (lv_operador_2_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2377:1: (lv_operador_2_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2378:3: lv_operador_2_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleAsignacionCompleja5361);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2402:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2403:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2404:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir5397);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir5407); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2411:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2414:28: ( (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2415:1: (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2415:1: (otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2415:3: otherlv_0= 'write' otherlv_1= '(' ( (lv_operador_2_0= rulePrimaria ) ) ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleEscribir5444); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getWriteKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEscribir5456); 

                	newLeafNode(otherlv_1, grammarAccess.getEscribirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2423:1: ( (lv_operador_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2424:1: (lv_operador_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2424:1: (lv_operador_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2425:3: lv_operador_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir5477);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2441:2: ( (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) ) | ( (lv_operador_5_0= ruleoperacion ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }
                else if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_CAR)||(LA36_0>=26 && LA36_0<=34)||(LA36_0>=79 && LA36_0<=80)||(LA36_0>=91 && LA36_0<=93)) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2441:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2441:3: (otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2441:5: otherlv_3= ',' ( (lv_operador_4_0= rulePrimaria ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEscribir5491); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEscribirAccess().getCommaKeyword_3_0_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2445:1: ( (lv_operador_4_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2446:1: (lv_operador_4_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2446:1: (lv_operador_4_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2447:3: lv_operador_4_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_3_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir5512);
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
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2464:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2464:6: ( (lv_operador_5_0= ruleoperacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2465:1: (lv_operador_5_0= ruleoperacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2465:1: (lv_operador_5_0= ruleoperacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2466:3: lv_operador_5_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir5540);
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
            	    break loop36;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEscribir5554); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2494:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2495:2: (iv_ruleLeer= ruleLeer EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2496:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer5590);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer5600); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2503:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2506:28: ( (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2507:1: (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2507:1: (otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2507:3: otherlv_0= 'read' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleLeer5637); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getReadKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLeer5649); 

                	newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2515:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2516:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2516:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2517:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer5670);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLeer5682); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2545:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2546:2: (iv_ruleSi= ruleSi EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2547:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi5718);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi5728); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2554:1: ruleSi returns [EObject current=null] : (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2557:28: ( (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2558:1: (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2558:1: (otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2558:3: otherlv_0= 'if' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'then' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ( (lv_sino_6_0= ruleSino ) )? otherlv_7= 'end_if'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleSi5765); 

                	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getIfKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2562:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2563:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2563:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2564:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleSi5786);
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

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleSi5798); 

                	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getThenKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2584:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)||LA38_0==19||LA38_0==23||(LA38_0>=26 && LA38_0<=34)||(LA38_0>=57 && LA38_0<=59)||LA38_0==62||LA38_0==65||LA38_0==67||LA38_0==71) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2584:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2584:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2585:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2585:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2586:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi5820);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2602:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)||LA37_0==19||LA37_0==23||(LA37_0>=26 && LA37_0<=34)||(LA37_0>=57 && LA37_0<=59)||LA37_0==62||LA37_0==65||LA37_0==67||LA37_0==71) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2603:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2603:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2604:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi5841);
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
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2620:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==95) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2621:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2621:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2622:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi5865);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2638:3: ( (lv_sino_6_0= ruleSino ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==94) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2639:1: (lv_sino_6_0= ruleSino )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2639:1: (lv_sino_6_0= ruleSino )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2640:3: lv_sino_6_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi5887);
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

            otherlv_7=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleSi5900); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2668:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2669:2: (iv_rulemientras= rulemientras EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2670:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras5936);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras5946); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2677:1: rulemientras returns [EObject current=null] : (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2680:28: ( (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2681:1: (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2681:1: (otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2681:3: otherlv_0= 'while' ( (lv_valor_1_0= ruleoperacion ) ) otherlv_2= 'do' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? otherlv_5= 'end_while'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_rulemientras5983); 

                	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getWhileKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2685:1: ( (lv_valor_1_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2686:1: (lv_valor_1_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2686:1: (lv_valor_1_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2687:3: lv_valor_1_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulemientras6004);
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

            otherlv_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulemientras6016); 

                	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getDoKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2707:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)||LA42_0==19||LA42_0==23||(LA42_0>=26 && LA42_0<=34)||(LA42_0>=57 && LA42_0<=59)||LA42_0==62||LA42_0==65||LA42_0==67||LA42_0==71) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2707:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2707:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2708:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2708:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2709:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6038);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2725:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||LA41_0==19||LA41_0==23||(LA41_0>=26 && LA41_0<=34)||(LA41_0>=57 && LA41_0<=59)||LA41_0==62||LA41_0==65||LA41_0==67||LA41_0==71) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2726:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2726:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2727:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras6059);
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
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,64,FollowSets000.FOLLOW_64_in_rulemientras6074); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2755:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2756:2: (iv_rulerepetir= rulerepetir EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2757:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir6110);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir6120); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2764:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) ) ;
    public final EObject rulerepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_sentencias_1_0 = null;

        EObject lv_sentencias_2_0 = null;

        EObject lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2767:28: ( (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:1: (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:1: (otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2768:3: otherlv_0= 'repeat' ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )? otherlv_3= 'until' ( (lv_valor_4_0= ruleoperacion ) )
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulerepetir6157); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepeatKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2772:1: ( ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)||LA44_0==19||LA44_0==23||(LA44_0>=26 && LA44_0<=34)||(LA44_0>=57 && LA44_0<=59)||LA44_0==62||LA44_0==65||LA44_0==67||LA44_0==71) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2772:2: ( (lv_sentencias_1_0= ruleSentencias ) ) ( (lv_sentencias_2_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2772:2: ( (lv_sentencias_1_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2773:1: (lv_sentencias_1_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2773:1: (lv_sentencias_1_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2774:3: lv_sentencias_1_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir6179);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2790:2: ( (lv_sentencias_2_0= ruleSentencias ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)||LA43_0==19||LA43_0==23||(LA43_0>=26 && LA43_0<=34)||(LA43_0>=57 && LA43_0<=59)||LA43_0==62||LA43_0==65||LA43_0==67||LA43_0==71) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2791:1: (lv_sentencias_2_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2791:1: (lv_sentencias_2_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2792:3: lv_sentencias_2_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir6200);
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
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulerepetir6215); 

                	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getUntilKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2812:1: ( (lv_valor_4_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2813:1: (lv_valor_4_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2813:1: (lv_valor_4_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2814:3: lv_valor_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulerepetir6236);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2838:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2839:2: (iv_ruledesde= ruledesde EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2840:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde6272);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde6282); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2847:1: ruledesde returns [EObject current=null] : (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2850:28: ( (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2851:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2851:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2851:3: otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleoperacion ) ) otherlv_4= 'do' ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )? otherlv_7= 'end_for'
            {
            otherlv_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruledesde6319); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getForKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2855:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2856:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2856:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2857:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde6340);
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

            otherlv_2=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruledesde6352); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getToKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2877:1: ( (lv_valor_3_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2878:1: (lv_valor_3_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2878:1: (lv_valor_3_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2879:3: lv_valor_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruledesde6373);
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

            otherlv_4=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruledesde6385); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getDoKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2899:1: ( ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_ID)||LA46_0==19||LA46_0==23||(LA46_0>=26 && LA46_0<=34)||(LA46_0>=57 && LA46_0<=59)||LA46_0==62||LA46_0==65||LA46_0==67||LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2899:2: ( (lv_sentencias_5_0= ruleSentencias ) ) ( (lv_sentencias_6_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2899:2: ( (lv_sentencias_5_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2900:1: (lv_sentencias_5_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2900:1: (lv_sentencias_5_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2901:3: lv_sentencias_5_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde6407);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2917:2: ( (lv_sentencias_6_0= ruleSentencias ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)||LA45_0==19||LA45_0==23||(LA45_0>=26 && LA45_0<=34)||(LA45_0>=57 && LA45_0<=59)||LA45_0==62||LA45_0==65||LA45_0==67||LA45_0==71) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2918:1: (lv_sentencias_6_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2918:1: (lv_sentencias_6_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2919:3: lv_sentencias_6_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde6428);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruledesde6443); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2947:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2948:2: (iv_ruleCaso= ruleCaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2949:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso6479);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso6489); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2956:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2959:28: ( (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2960:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2960:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2960:3: otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )? ( (lv_devuelve_5_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCaso6526); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCaseKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2964:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2965:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2965:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2966:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso6547);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleCaso6559); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2986:1: ( ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)||LA48_0==19||LA48_0==23||(LA48_0>=26 && LA48_0<=34)||(LA48_0>=57 && LA48_0<=59)||LA48_0==62||LA48_0==65||LA48_0==67||LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2986:2: ( (lv_sentencias_3_0= ruleSentencias ) ) ( (lv_sentencias_4_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2986:2: ( (lv_sentencias_3_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2987:1: (lv_sentencias_3_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2987:1: (lv_sentencias_3_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:2988:3: lv_sentencias_3_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso6581);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3004:2: ( (lv_sentencias_4_0= ruleSentencias ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)||LA47_0==19||LA47_0==23||(LA47_0>=26 && LA47_0<=34)||(LA47_0>=57 && LA47_0<=59)||LA47_0==62||LA47_0==65||LA47_0==67||LA47_0==71) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3005:1: (lv_sentencias_4_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3005:1: (lv_sentencias_4_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3006:3: lv_sentencias_4_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso6602);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3022:5: ( (lv_devuelve_5_0= ruleDevolver ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==95) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3023:1: (lv_devuelve_5_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3023:1: (lv_devuelve_5_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3024:3: lv_devuelve_5_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso6626);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3048:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3049:2: (iv_rulesegun= rulesegun EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3050:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun6663);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun6673); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3057:1: rulesegun returns [EObject current=null] : (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3060:28: ( (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3061:1: (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3061:1: (otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3061:3: otherlv_0= 'according_to' otherlv_1= '(' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ')' otherlv_4= 'do' ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )? otherlv_7= 'otherwise:' ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )? ( (lv_devuelve_10_0= ruleDevolver ) )? otherlv_11= 'end_according_to'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_rulesegun6710); 

                	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getAccording_toKeyword_0());
                
            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulesegun6722); 

                	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3069:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3070:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3070:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3071:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_rulesegun6743);
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

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulesegun6755); 

                	newLeafNode(otherlv_3, grammarAccess.getSegunAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,63,FollowSets000.FOLLOW_63_in_rulesegun6767); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getDoKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3095:1: ( ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==70) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3095:2: ( (lv_caso_5_0= ruleCaso ) ) ( (lv_caso_6_0= ruleCaso ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3095:2: ( (lv_caso_5_0= ruleCaso ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3096:1: (lv_caso_5_0= ruleCaso )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3096:1: (lv_caso_5_0= ruleCaso )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3097:3: lv_caso_5_0= ruleCaso
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun6789);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3113:2: ( (lv_caso_6_0= ruleCaso ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==70) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3114:1: (lv_caso_6_0= ruleCaso )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3114:1: (lv_caso_6_0= ruleCaso )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3115:3: lv_caso_6_0= ruleCaso
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun6810);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,72,FollowSets000.FOLLOW_72_in_rulesegun6825); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getOtherwiseKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3135:1: ( ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_ID)||LA53_0==19||LA53_0==23||(LA53_0>=26 && LA53_0<=34)||(LA53_0>=57 && LA53_0<=59)||LA53_0==62||LA53_0==65||LA53_0==67||LA53_0==71) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3135:2: ( (lv_sentencias_8_0= ruleSentencias ) ) ( (lv_sentencias_9_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3135:2: ( (lv_sentencias_8_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3136:1: (lv_sentencias_8_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3136:1: (lv_sentencias_8_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3137:3: lv_sentencias_8_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun6847);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3153:2: ( (lv_sentencias_9_0= ruleSentencias ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)||LA52_0==19||LA52_0==23||(LA52_0>=26 && LA52_0<=34)||(LA52_0>=57 && LA52_0<=59)||LA52_0==62||LA52_0==65||LA52_0==67||LA52_0==71) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3154:1: (lv_sentencias_9_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3154:1: (lv_sentencias_9_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3155:3: lv_sentencias_9_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun6868);
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
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3171:5: ( (lv_devuelve_10_0= ruleDevolver ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==95) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3172:1: (lv_devuelve_10_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3172:1: (lv_devuelve_10_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3173:3: lv_devuelve_10_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun6892);
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

            otherlv_11=(Token)match(input,73,FollowSets000.FOLLOW_73_in_rulesegun6905); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3201:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3202:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3203:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable6942);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable6953); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3210:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3213:28: ( (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3214:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3214:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt55=1;
                }
                break;
            case 75:
                {
                alt55=2;
                }
                break;
            case 76:
                {
                alt55=3;
                }
                break;
            case 77:
                {
                alt55=4;
                }
                break;
            case 78:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3215:2: kw= 'integer'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleTipoVariable6991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getIntegerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3222:2: kw= 'character'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleTipoVariable7010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCharacterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3229:2: kw= 'real'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleTipoVariable7029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3236:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleTipoVariable7048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getBooleanKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3243:2: kw= 'string'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleTipoVariable7067); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3256:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3257:2: (iv_ruleVariable= ruleVariable EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3258:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable7107);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable7117); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3265:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3268:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3269:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3269:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3269:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3269:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3270:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3275:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3276:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3276:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3277:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable7172);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3301:1: entryRulebooleano returns [String current=null] : iv_rulebooleano= rulebooleano EOF ;
    public final String entryRulebooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleano = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3302:2: (iv_rulebooleano= rulebooleano EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3303:2: iv_rulebooleano= rulebooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_rulebooleano_in_entryRulebooleano7209);
            iv_rulebooleano=rulebooleano();

            state._fsp--;

             current =iv_rulebooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebooleano7220); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3310:1: rulebooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulebooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3313:28: ( (kw= 'true' | kw= 'false' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3314:1: (kw= 'true' | kw= 'false' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3314:1: (kw= 'true' | kw= 'false' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==79) ) {
                alt56=1;
            }
            else if ( (LA56_0==80) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3315:2: kw= 'true'
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulebooleano7258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3322:2: kw= 'false'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulebooleano7277); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3337:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3338:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3339:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr7320);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr7331); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3346:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3349:28: (kw= 'or' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3351:2: kw= 'or'
            {
            kw=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulesignoOr7368); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3364:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3365:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3366:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd7408);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd7419); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3373:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3376:28: (kw= 'and' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3378:2: kw= 'and'
            {
            kw=(Token)match(input,82,FollowSets000.FOLLOW_82_in_rulesignoAnd7456); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3391:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3392:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3393:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad7496);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad7507); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3400:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3403:28: ( (kw= '==' | kw= '!=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3404:1: (kw= '==' | kw= '!=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3404:1: (kw= '==' | kw= '!=' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==83) ) {
                alt57=1;
            }
            else if ( (LA57_0==84) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3405:2: kw= '=='
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_83_in_rulesignoIgualdad7545); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3412:2: kw= '!='
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_84_in_rulesignoIgualdad7564); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3425:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3426:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3427:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion7605);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion7616); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3434:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3437:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3438:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3438:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt58=1;
                }
                break;
            case 86:
                {
                alt58=2;
                }
                break;
            case 87:
                {
                alt58=3;
                }
                break;
            case 88:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3439:2: kw= '<'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_85_in_rulesignoComparacion7654); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3446:2: kw= '>'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesignoComparacion7673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3453:2: kw= '>='
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_87_in_rulesignoComparacion7692); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3460:2: kw= '<='
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_88_in_rulesignoComparacion7711); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3473:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3474:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3475:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma7752);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma7763); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3482:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3485:28: (kw= '+' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3487:2: kw= '+'
            {
            kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulesignoSuma7800); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3500:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3501:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3502:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta7840);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta7851); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3509:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3512:28: (kw= '-' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3514:2: kw= '-'
            {
            kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulesignoResta7888); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3527:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3528:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3529:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion7928);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion7939); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3536:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3539:28: (kw= '*' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3541:2: kw= '*'
            {
            kw=(Token)match(input,89,FollowSets000.FOLLOW_89_in_rulesignoMultiplicacion7976); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3554:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3555:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3556:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision8016);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision8027); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3563:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3566:28: (kw= '/' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3568:2: kw= '/'
            {
            kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_rulesignoDivision8064); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3581:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3582:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3583:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion8103);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion8113); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3590:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3593:28: (this_Or_0= ruleOr )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3595:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion8159);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3611:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3612:2: (iv_ruleOr= ruleOr EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3613:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr8193);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr8203); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3620:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3623:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3624:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3624:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3625:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr8250);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3633:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==81) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3633:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3633:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3634:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3639:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3640:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3640:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3641:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr8280);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3657:2: ( (lv_right_3_0= ruleAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3658:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3658:1: (lv_right_3_0= ruleAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3659:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr8301);
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
            	    break loop59;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3683:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3684:2: (iv_ruleAnd= ruleAnd EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3685:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd8339);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd8349); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3692:1: ruleAnd returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3695:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3696:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3696:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3697:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd8396);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3705:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==82) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3705:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdad ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3705:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3706:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3711:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3712:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3712:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3713:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd8426);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3729:2: ( (lv_right_3_0= ruleIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3730:1: (lv_right_3_0= ruleIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3730:1: (lv_right_3_0= ruleIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3731:3: lv_right_3_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightIgualdadParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleAnd8447);
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
            	    break loop60;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3755:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3756:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3757:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad8485);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad8495); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3764:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3767:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3768:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3768:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3769:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad8542);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3777:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=83 && LA61_0<=84)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3777:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3777:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3778:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3783:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3784:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3784:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3785:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad8572);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3801:2: ( (lv_right_3_0= ruleComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3802:1: (lv_right_3_0= ruleComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3802:1: (lv_right_3_0= ruleComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3803:3: lv_right_3_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad8593);
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
            	    break loop61;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3827:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3828:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3829:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion8631);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion8641); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3836:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3839:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3840:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3840:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3841:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion8688);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3849:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=85 && LA62_0<=88)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3849:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaResta ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3849:2: ()
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3850:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3855:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3856:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3856:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3857:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion8718);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3873:2: ( (lv_right_3_0= ruleSumaResta ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3874:1: (lv_right_3_0= ruleSumaResta )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3874:1: (lv_right_3_0= ruleSumaResta )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3875:3: lv_right_3_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion8739);
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
            	    break loop62;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3899:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3900:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3901:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta8777);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta8787); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3908:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) ;
    public final EObject ruleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivision_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3911:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3912:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3912:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3913:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8834);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=38 && LA64_0<=39)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==38) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==39) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3921:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3922:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3927:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3928:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3928:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3929:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta8866);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3946:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3946:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3946:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3946:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3947:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3952:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3953:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3953:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3954:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta8904);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3970:4: ( (lv_right_5_0= ruleMultiplicacionDivision ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3971:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3971:1: (lv_right_5_0= ruleMultiplicacionDivision )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3972:3: lv_right_5_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8927);
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
            	    break loop64;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3996:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3997:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:3998:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision8965);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision8975); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4005:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) ;
    public final EObject ruleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject this_Primaria_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4008:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4009:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4009:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4010:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision9022);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=89 && LA66_0<=90)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) ) ( (lv_right_5_0= rulePrimaria ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==89) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==90) ) {
            	        alt65=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4018:4: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4019:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4024:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4025:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4025:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4026:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision9054);
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
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4043:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4043:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4043:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4043:7: ()
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4044:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4049:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4050:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4050:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4051:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision9092);
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

            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4067:4: ( (lv_right_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4068:1: (lv_right_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4068:1: (lv_right_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4069:3: lv_right_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision9115);
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRulePrimaria"
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4093:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4094:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4095:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria9153);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria9163); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4102:1: rulePrimaria returns [EObject current=null] : ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4105:28: ( ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4106:1: ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4106:1: ( (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' ) | this_VariablesBasicas_3= ruleVariablesBasicas | ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' ) | ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' ) | this_Funciones_13= ruleFunciones | this_VariablesComplejas_14= ruleVariablesComplejas )
            int alt67=6;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt67=1;
                }
                break;
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 79:
            case 80:
                {
                alt67=2;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case 35:
                case 42:
                    {
                    alt67=6;
                    }
                    break;
                case 20:
                    {
                    alt67=5;
                    }
                    break;
                case EOF:
                case RULE_INT:
                case RULE_STRING:
                case RULE_ID:
                case RULE_CAD:
                case RULE_CAR:
                case 16:
                case 17:
                case 19:
                case 21:
                case 22:
                case 23:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 38:
                case 39:
                case 43:
                case 45:
                case 47:
                case 52:
                case 54:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
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
                case 98:
                    {
                    alt67=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 3, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 35:
                case 42:
                    {
                    alt67=6;
                    }
                    break;
                case 20:
                    {
                    alt67=5;
                    }
                    break;
                case EOF:
                case RULE_INT:
                case RULE_STRING:
                case RULE_ID:
                case RULE_CAD:
                case RULE_CAR:
                case 16:
                case 17:
                case 19:
                case 21:
                case 22:
                case 23:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 38:
                case 39:
                case 43:
                case 45:
                case 47:
                case 52:
                case 54:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
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
                case 98:
                    {
                    alt67=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 4, input);

                    throw nvae;
                }

                }
                break;
            case 92:
                {
                alt67=3;
                }
                break;
            case 93:
                {
                alt67=4;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4106:2: (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4106:2: (otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4106:4: otherlv_0= '|' this_operacion_1= ruleoperacion otherlv_2= '|'
                    {
                    otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulePrimaria9201); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria9223);
                    this_operacion_1=ruleoperacion();

                    state._fsp--;

                     
                            current = this_operacion_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,91,FollowSets000.FOLLOW_91_in_rulePrimaria9234); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimariaAccess().getVerticalLineKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4125:5: this_VariablesBasicas_3= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_rulePrimaria9263);
                    this_VariablesBasicas_3=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4134:6: ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4134:6: ( () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4134:7: () otherlv_5= '-(' ( (lv_valor_operacion_6_0= ruleoperacion ) ) otherlv_7= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4134:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4135:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegativaAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,92,FollowSets000.FOLLOW_92_in_rulePrimaria9290); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimariaAccess().getHyphenMinusLeftParenthesisKeyword_2_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4144:1: ( (lv_valor_operacion_6_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4145:1: (lv_valor_operacion_6_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4145:1: (lv_valor_operacion_6_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4146:3: lv_valor_operacion_6_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria9311);
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

                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimaria9323); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_2_3());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4167:6: ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4167:6: ( () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4167:7: () otherlv_9= 'not' otherlv_10= '(' ( (lv_valor_operacion_11_0= ruleoperacion ) ) otherlv_12= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4167:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4168:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaAccess().getNegacionAction_3_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,93,FollowSets000.FOLLOW_93_in_rulePrimaria9352); 

                        	newLeafNode(otherlv_9, grammarAccess.getPrimariaAccess().getNotKeyword_3_1());
                        
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePrimaria9364); 

                        	newLeafNode(otherlv_10, grammarAccess.getPrimariaAccess().getLeftParenthesisKeyword_3_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4181:1: ( (lv_valor_operacion_11_0= ruleoperacion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4182:1: (lv_valor_operacion_11_0= ruleoperacion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4182:1: (lv_valor_operacion_11_0= ruleoperacion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4183:3: lv_valor_operacion_11_0= ruleoperacion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaAccess().getValor_operacionOperacionParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_rulePrimaria9385);
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

                    otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimaria9397); 

                        	newLeafNode(otherlv_12, grammarAccess.getPrimariaAccess().getRightParenthesisKeyword_3_4());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4205:5: this_Funciones_13= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_rulePrimaria9426);
                    this_Funciones_13=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4215:5: this_VariablesComplejas_14= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_rulePrimaria9453);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4231:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4232:2: (iv_ruleFunciones= ruleFunciones EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4233:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_entryRuleFunciones9488);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunciones9498); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4240:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4243:28: ( ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:1: ( ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=26 && LA72_0<=34)) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:2: ( () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:3: () ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )? otherlv_6= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4244:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4245:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4250:2: ( (lv_nombre_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4251:1: (lv_nombre_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4251:1: (lv_nombre_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4252:3: lv_nombre_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreEStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFunciones9554);
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

                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunciones9566); 

                        	newLeafNode(otherlv_2, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_0_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4272:1: ( ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )* )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( ((LA69_0>=RULE_INT && LA69_0<=RULE_CAR)||(LA69_0>=26 && LA69_0<=34)||(LA69_0>=79 && LA69_0<=80)||(LA69_0>=91 && LA69_0<=93)) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4272:2: ( (lv_operadores_3_0= ruleoperacion ) ) (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4272:2: ( (lv_operadores_3_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4273:1: (lv_operadores_3_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4273:1: (lv_operadores_3_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4274:3: lv_operadores_3_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones9588);
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

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4290:2: (otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==21) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4290:4: otherlv_4= ',' ( (lv_operadores_5_0= ruleoperacion ) )
                            	    {
                            	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunciones9601); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getFuncionesAccess().getCommaKeyword_0_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4294:1: ( (lv_operadores_5_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4295:1: (lv_operadores_5_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4295:1: (lv_operadores_5_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4296:3: lv_operadores_5_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones9622);
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
                            	    break loop68;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunciones9638); 

                        	newLeafNode(otherlv_6, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4317:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4317:6: ( () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4317:7: () ( (lv_nombre_8_0= ruleNombreInterna ) ) otherlv_9= '(' ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )? otherlv_13= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4317:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4318:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4323:2: ( (lv_nombre_8_0= ruleNombreInterna ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4324:1: (lv_nombre_8_0= ruleNombreInterna )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4324:1: (lv_nombre_8_0= ruleNombreInterna )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4325:3: lv_nombre_8_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleFunciones9676);
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

                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunciones9688); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4345:1: ( ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( ((LA71_0>=RULE_INT && LA71_0<=RULE_CAR)||(LA71_0>=26 && LA71_0<=34)||(LA71_0>=79 && LA71_0<=80)||(LA71_0>=91 && LA71_0<=93)) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4345:2: ( (lv_operadores_10_0= ruleoperacion ) ) (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4345:2: ( (lv_operadores_10_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4346:1: (lv_operadores_10_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4346:1: (lv_operadores_10_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4347:3: lv_operadores_10_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones9710);
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

                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4363:2: (otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==21) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4363:4: otherlv_11= ',' ( (lv_operadores_12_0= ruleoperacion ) )
                            	    {
                            	    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunciones9723); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getFuncionesAccess().getCommaKeyword_1_3_1_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4367:1: ( (lv_operadores_12_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4368:1: (lv_operadores_12_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4368:1: (lv_operadores_12_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4369:3: lv_operadores_12_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones9744);
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
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunciones9760); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4397:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4398:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4399:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas9797);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesComplejas9807); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4406:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4409:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            int alt76=3;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4410:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4411:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4416:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4416:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4416:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4417:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4417:1: (lv_nombre_vector_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4418:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas9864);
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

                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleVariablesComplejas9876); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4438:1: ( (lv_indice_3_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4439:1: (lv_indice_3_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4439:1: (lv_indice_3_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4440:3: lv_indice_3_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceVariablesBasicasParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas9897);
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

                    otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleVariablesComplejas9909); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4460:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==35) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4460:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                            {
                            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVariablesComplejas9923); 

                                	newLeafNode(otherlv_5, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_0_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4464:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4465:1: (lv_campo_6_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4465:1: (lv_campo_6_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4466:3: lv_campo_6_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas9944);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:7: () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4483:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4484:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4489:2: ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4489:3: ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4489:3: ( (lv_nombre_matriz_8_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4490:1: (lv_nombre_matriz_8_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4490:1: (lv_nombre_matriz_8_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4491:3: lv_nombre_matriz_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas9985);
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

                    otherlv_9=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleVariablesComplejas9997); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4511:1: ( (lv_primerIndice_10_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4512:1: (lv_primerIndice_10_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4512:1: (lv_primerIndice_10_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4513:3: lv_primerIndice_10_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceVariablesBasicasParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas10018);
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

                    otherlv_11=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleVariablesComplejas10030); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4533:1: ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4534:1: (lv_segundoIndice_12_0= ruleVariablesBasicas )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4534:1: (lv_segundoIndice_12_0= ruleVariablesBasicas )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4535:3: lv_segundoIndice_12_0= ruleVariablesBasicas
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceVariablesBasicasParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas10051);
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

                    otherlv_13=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleVariablesComplejas10063); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4555:2: (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==35) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4555:4: otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) )
                            {
                            otherlv_14=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVariablesComplejas10077); 

                                	newLeafNode(otherlv_14, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_1_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4559:1: ( (lv_campo_15_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4560:1: (lv_campo_15_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4560:1: (lv_campo_15_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4561:3: lv_campo_15_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10098);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4578:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4578:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4578:7: () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4578:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4579:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4584:2: ( (lv_nombre_registro_17_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4585:1: (lv_nombre_registro_17_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4585:1: (lv_nombre_registro_17_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4586:3: lv_nombre_registro_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas10138);
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

                    otherlv_18=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVariablesComplejas10150); 

                        	newLeafNode(otherlv_18, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_2());
                        
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4606:1: ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4606:2: ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4606:2: ( (lv_campo_19_0= ruleCampoRegistro ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4607:1: (lv_campo_19_0= ruleCampoRegistro )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4607:1: (lv_campo_19_0= ruleCampoRegistro )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4608:3: lv_campo_19_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10172);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4624:2: (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==35) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4624:4: otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleVariablesComplejas10185); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4628:1: ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4629:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4629:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4630:3: lv_campo_21_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10206);
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
                    	    break loop75;
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4654:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4655:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4656:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas10246);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesBasicas10256); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4663:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4666:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= rulebooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt77=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==35) ) {
                    alt77=2;
                }
                else if ( (LA77_1==EOF||(LA77_1>=RULE_INT && LA77_1<=RULE_CAR)||(LA77_1>=16 && LA77_1<=17)||LA77_1==19||(LA77_1>=21 && LA77_1<=23)||(LA77_1>=26 && LA77_1<=34)||(LA77_1>=38 && LA77_1<=39)||LA77_1==43||LA77_1==45||LA77_1==47||LA77_1==52||LA77_1==54||(LA77_1>=56 && LA77_1<=95)||LA77_1==98) ) {
                    alt77=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt77=3;
                }
                break;
            case RULE_CAR:
                {
                alt77=4;
                }
                break;
            case 79:
            case 80:
                {
                alt77=5;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt77=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4667:3: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4668:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4673:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4674:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4674:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4675:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVariablesBasicas10312);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4692:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4693:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4698:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4699:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4699:1: (lv_valor_3_0= ruleEFloat )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4700:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleVariablesBasicas10350);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4717:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4718:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4723:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4724:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4724:1: (lv_contenido_5_0= RULE_CAD )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4725:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleVariablesBasicas10384); 

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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4742:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4742:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4742:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4742:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4743:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4748:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4749:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4749:1: (lv_contenido_7_0= RULE_CAR )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4750:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleVariablesBasicas10423); 

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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4767:6: ( () ( (lv_valor_9_0= rulebooleano ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4767:6: ( () ( (lv_valor_9_0= rulebooleano ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4767:7: () ( (lv_valor_9_0= rulebooleano ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4767:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4768:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4773:2: ( (lv_valor_9_0= rulebooleano ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4774:1: (lv_valor_9_0= rulebooleano )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4774:1: (lv_valor_9_0= rulebooleano )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4775:3: lv_valor_9_0= rulebooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulebooleano_in_ruleVariablesBasicas10466);
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
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4792:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4792:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4792:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4792:7: ()
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4793:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4798:2: ( (lv_nombre_11_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4799:1: (lv_nombre_11_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4799:1: (lv_nombre_11_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4800:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesBasicas10504);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4824:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4825:2: (iv_ruleSino= ruleSino EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4826:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino10541);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino10551); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4833:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4836:28: ( ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4837:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4837:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4837:2: () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4837:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4838:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleSino10597); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getElseKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4847:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_ID)||LA79_0==19||LA79_0==23||(LA79_0>=26 && LA79_0<=34)||(LA79_0>=57 && LA79_0<=59)||LA79_0==62||LA79_0==65||LA79_0==67||LA79_0==71) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4847:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4847:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4848:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4848:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4849:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino10619);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4865:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)||LA78_0==19||LA78_0==23||(LA78_0>=26 && LA78_0<=34)||(LA78_0>=57 && LA78_0<=59)||LA78_0==62||LA78_0==65||LA78_0==67||LA78_0==71) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4866:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4866:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4867:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino10640);
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
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4883:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==95) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4884:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4884:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4885:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino10664);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4909:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4910:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4911:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver10701);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver10711); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4918:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4921:28: ( ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4922:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4922:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4922:2: () otherlv_1= 'return' ( (lv_devuelve_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4922:2: ()
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4923:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleDevolver10757); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getReturnKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4932:1: ( (lv_devuelve_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4933:1: (lv_devuelve_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4933:1: (lv_devuelve_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4934:3: lv_devuelve_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelvePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleDevolver10778);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4958:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4959:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4960:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10814);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion10824); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4967:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4970:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4971:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4971:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4971:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4971:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4972:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4972:1: (lv_paso_0_0= ruleTipoPaso )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4973:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10870);
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

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4989:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4990:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4990:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:4991:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion10891);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleParametroFuncion10903); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5011:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5012:1: (lv_variable_3_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5012:1: (lv_variable_3_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5013:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion10924);
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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5037:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5038:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5039:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion10960);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion10970); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5046:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5049:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )? otherlv_7= ')' (otherlv_8= 'const' )? (otherlv_9= 'type' )? otherlv_10= 'var' ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )? otherlv_13= 'initiation' ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )? ( (lv_devuelve_16_0= ruleDevolver ) ) otherlv_17= 'end_initiation' otherlv_18= 'end_function'
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5050:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5051:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5051:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5052:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion11016);
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

            otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleFuncion11028); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFunctionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5072:1: ( (lv_nombre_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5073:1: (lv_nombre_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5073:1: (lv_nombre_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5074:3: lv_nombre_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getNombreEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuncion11049);
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

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncion11061); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5094:1: ( ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )* )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==36||(LA82_0>=100 && LA82_0<=101)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5094:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5094:2: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5095:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5095:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5096:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion11083);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5112:2: (otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==21) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5112:4: otherlv_5= ',' ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuncion11096); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5116:1: ( (lv_parametrofuncion_6_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5117:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5117:1: (lv_parametrofuncion_6_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5118:3: lv_parametrofuncion_6_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion11117);
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
                    	    break loop81;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuncion11133); 

                	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5138:1: (otherlv_8= 'const' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==15) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5138:3: otherlv_8= 'const'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFuncion11146); 

                        	newLeafNode(otherlv_8, grammarAccess.getFuncionAccess().getConstKeyword_6());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5142:3: (otherlv_9= 'type' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==16) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5142:5: otherlv_9= 'type'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFuncion11161); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getTypeKeyword_7());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFuncion11175); 

                	newLeafNode(otherlv_10, grammarAccess.getFuncionAccess().getVarKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5150:1: ( ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_STRING && LA86_0<=RULE_ID)||(LA86_0>=74 && LA86_0<=78)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5150:2: ( (lv_declaracion_11_0= ruleDeclaracion ) ) ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5150:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5151:1: (lv_declaracion_11_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5151:1: (lv_declaracion_11_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5152:3: lv_declaracion_11_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion11197);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5168:2: ( (lv_declaracion_12_0= ruleDeclaracion ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( ((LA85_0>=RULE_STRING && LA85_0<=RULE_ID)||(LA85_0>=74 && LA85_0<=78)) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5169:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5169:1: (lv_declaracion_12_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5170:3: lv_declaracion_12_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion11218);
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
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleFuncion11233); 

                	newLeafNode(otherlv_13, grammarAccess.getFuncionAccess().getInitiationKeyword_10());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5190:1: ( ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )* )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( ((LA88_0>=RULE_STRING && LA88_0<=RULE_ID)||LA88_0==19||LA88_0==23||(LA88_0>=26 && LA88_0<=34)||(LA88_0>=57 && LA88_0<=59)||LA88_0==62||LA88_0==65||LA88_0==67||LA88_0==71) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5190:2: ( (lv_sentencias_14_0= ruleSentencias ) ) ( (lv_sentencias_15_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5190:2: ( (lv_sentencias_14_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5191:1: (lv_sentencias_14_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5191:1: (lv_sentencias_14_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5192:3: lv_sentencias_14_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion11255);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5208:2: ( (lv_sentencias_15_0= ruleSentencias ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( ((LA87_0>=RULE_STRING && LA87_0<=RULE_ID)||LA87_0==19||LA87_0==23||(LA87_0>=26 && LA87_0<=34)||(LA87_0>=57 && LA87_0<=59)||LA87_0==62||LA87_0==65||LA87_0==67||LA87_0==71) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5209:1: (lv_sentencias_15_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5209:1: (lv_sentencias_15_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5210:3: lv_sentencias_15_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_11_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion11276);
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
                    	    break loop87;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5226:5: ( (lv_devuelve_16_0= ruleDevolver ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5227:1: (lv_devuelve_16_0= ruleDevolver )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5227:1: (lv_devuelve_16_0= ruleDevolver )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5228:3: lv_devuelve_16_0= ruleDevolver
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion11300);
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

            otherlv_17=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleFuncion11312); 

                	newLeafNode(otherlv_17, grammarAccess.getFuncionAccess().getEnd_initiationKeyword_13());
                
            otherlv_18=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleFuncion11324); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5260:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5261:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5262:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento11360);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento11370); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5269:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' ) ;
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
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5272:28: ( (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5273:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5273:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure' )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5273:3: otherlv_0= 'procedure' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'const' )? (otherlv_8= 'type' )? otherlv_9= 'var' ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )? otherlv_12= 'initiation' ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )? otherlv_15= 'end_initiation' otherlv_16= 'end_procedure'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleProcedimiento11407); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedureKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5277:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5278:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5278:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5279:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcedimientoAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcedimiento11428);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProcedimiento11440); 

                	newLeafNode(otherlv_2, grammarAccess.getProcedimientoAccess().getLeftParenthesisKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5299:1: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==36||(LA90_0>=100 && LA90_0<=101)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5299:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5299:2: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5300:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5300:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5301:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11462);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5317:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==21) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5317:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleProcedimiento11475); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getProcedimientoAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5321:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5322:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5322:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5323:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11496);
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
                    	    break loop89;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleProcedimiento11512); 

                	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5343:1: (otherlv_7= 'const' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==15) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5343:3: otherlv_7= 'const'
                    {
                    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleProcedimiento11525); 

                        	newLeafNode(otherlv_7, grammarAccess.getProcedimientoAccess().getConstKeyword_5());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5347:3: (otherlv_8= 'type' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==16) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5347:5: otherlv_8= 'type'
                    {
                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleProcedimiento11540); 

                        	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getTypeKeyword_6());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleProcedimiento11554); 

                	newLeafNode(otherlv_9, grammarAccess.getProcedimientoAccess().getVarKeyword_7());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5355:1: ( ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_STRING && LA94_0<=RULE_ID)||(LA94_0>=74 && LA94_0<=78)) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5355:2: ( (lv_declaracion_10_0= ruleDeclaracion ) ) ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5355:2: ( (lv_declaracion_10_0= ruleDeclaracion ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5356:1: (lv_declaracion_10_0= ruleDeclaracion )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5356:1: (lv_declaracion_10_0= ruleDeclaracion )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5357:3: lv_declaracion_10_0= ruleDeclaracion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento11576);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5373:2: ( (lv_declaracion_11_0= ruleDeclaracion ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=RULE_STRING && LA93_0<=RULE_ID)||(LA93_0>=74 && LA93_0<=78)) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5374:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5374:1: (lv_declaracion_11_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5375:3: lv_declaracion_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento11597);
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
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleProcedimiento11612); 

                	newLeafNode(otherlv_12, grammarAccess.getProcedimientoAccess().getInitiationKeyword_9());
                
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5395:1: ( ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )* )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=RULE_STRING && LA96_0<=RULE_ID)||LA96_0==19||LA96_0==23||(LA96_0>=26 && LA96_0<=34)||(LA96_0>=57 && LA96_0<=59)||LA96_0==62||LA96_0==65||LA96_0==67||LA96_0==71) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5395:2: ( (lv_sentencias_13_0= ruleSentencias ) ) ( (lv_sentencias_14_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5395:2: ( (lv_sentencias_13_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5396:1: (lv_sentencias_13_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5396:1: (lv_sentencias_13_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5397:3: lv_sentencias_13_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11634);
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

                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5413:2: ( (lv_sentencias_14_0= ruleSentencias ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( ((LA95_0>=RULE_STRING && LA95_0<=RULE_ID)||LA95_0==19||LA95_0==23||(LA95_0>=26 && LA95_0<=34)||(LA95_0>=57 && LA95_0<=59)||LA95_0==62||LA95_0==65||LA95_0==67||LA95_0==71) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5414:1: (lv_sentencias_14_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5414:1: (lv_sentencias_14_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5415:3: lv_sentencias_14_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento11655);
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
                    	    break loop95;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleProcedimiento11670); 

                	newLeafNode(otherlv_15, grammarAccess.getProcedimientoAccess().getEnd_initiationKeyword_11());
                
            otherlv_16=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleProcedimiento11682); 

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5447:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5448:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5449:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11719);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso11730); 

            }

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
    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5456:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'E' | kw= 'E/S' | kw= 'S' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5459:28: ( (kw= 'E' | kw= 'E/S' | kw= 'S' ) )
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5460:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            {
            // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5460:1: (kw= 'E' | kw= 'E/S' | kw= 'S' )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt97=1;
                }
                break;
            case 100:
                {
                alt97=2;
                }
                break;
            case 101:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5461:2: kw= 'E'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTipoPaso11768); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getEKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5468:2: kw= 'E/S'
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleTipoPaso11787); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getESKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c/src-gen/vary/pseudocodigo/dsl/c/parser/antlr/internal/InternalVaryGrammar.g:5475:2: kw= 'S'
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleTipoPaso11806); 

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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\7\4\uffff\2\50\1\6\2\uffff";
    static final String DFA14_maxS =
        "\1\62\4\uffff\2\50\1\63\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\6\40\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\3\10\52\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "327:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\12\uffff";
    static final String DFA16_minS =
        "\1\7\5\uffff\2\24\2\uffff";
    static final String DFA16_maxS =
        "\1\107\5\uffff\2\52\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\7\1\6";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\6\1\7\12\uffff\1\4\3\uffff\1\5\2\uffff\11\10\26\uffff\1\1"+
            "\1\2\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "\1\10\16\uffff\1\11\4\uffff\1\11\1\uffff\1\11",
            "\1\10\16\uffff\1\11\4\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "496:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )";
        }
    }
    static final String DFA76_eotS =
        "\25\uffff";
    static final String DFA76_eofS =
        "\25\uffff";
    static final String DFA76_minS =
        "\1\7\2\43\1\6\1\uffff\1\43\6\53\1\6\2\uffff\1\44\4\6\1\53";
    static final String DFA76_maxS =
        "\1\10\2\52\1\120\1\uffff\7\57\1\6\2\uffff\1\57\2\47\2\6\1\57";
    static final String DFA76_acceptS =
        "\4\uffff\1\3\10\uffff\1\1\1\2\6\uffff";
    static final String DFA76_specialS =
        "\25\uffff}>";
    static final String[] DFA76_transitionS = {
            "\1\1\1\2",
            "\1\4\6\uffff\1\3",
            "\1\4\6\uffff\1\3",
            "\1\5\1\12\1\13\1\6\1\7\104\uffff\1\10\1\11",
            "",
            "\1\14\7\uffff\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\15\3\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\20\1\21\5\uffff\1\15\3\uffff\1\16",
            "\1\24\37\uffff\1\22\1\23",
            "\1\24\37\uffff\1\22\1\23",
            "\1\24",
            "\1\24",
            "\1\15\3\uffff\1\16"
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "4410:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleVariablesBasicas ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleVariablesBasicas ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleVariablesBasicas ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleCodigo122 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCodigo138 = new BitSet(new long[]{0x0040000000038010L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo159 = new BitSet(new long[]{0x0040000000038010L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleComentario_in_ruleCodigo180 = new BitSet(new long[]{0x0040000000038010L,0x0000000400007C00L});
        public static final BitSet FOLLOW_15_in_ruleCodigo196 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo218 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleCodigo239 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_16_in_ruleCodigo257 = new BitSet(new long[]{0x0045420000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo279 = new BitSet(new long[]{0x0045420000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleCodigo300 = new BitSet(new long[]{0x0045420000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_17_in_ruleCodigo318 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleCodigo340 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleCodigo361 = new BitSet(new long[]{0x0040000000038190L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo388 = new BitSet(new long[]{0x0040000000038010L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleCodigo409 = new BitSet(new long[]{0x0040000000038010L,0x0000000400007C00L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleCodigo433 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCodigo445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComentario_in_entryRuleComentario827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComentario837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComentario882 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_COMENT_in_ruleComentario898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_ruleSentencias1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque1193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque1304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion1393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir1512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir1522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleFuncionFicheroAbrir1559 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFuncionFicheroAbrir1571 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1593 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFuncionFicheroAbrir1605 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir1626 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFuncionFicheroAbrir1638 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir1659 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuncionFicheroAbrir1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar1708 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFuncionFicheroCerrar1755 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFuncionFicheroCerrar1767 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar1788 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuncionFicheroCerrar1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura1848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleModoApertura1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleModoApertura1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna1946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNombreInterna1995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleNombreInterna2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleNombreInterna2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleNombreInterna2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleNombreInterna2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleNombreInterna2090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleNombreInterna2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleNombreInterna2128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleNombreInterna2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2188 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat2283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat2294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2334 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleEFloat2352 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2367 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleEFloat2387 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_37_in_ruleEFloat2406 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_38_in_ruleEFloat2421 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_39_in_ruleEFloat2440 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro2504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo2594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido2713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente2803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes2893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes2903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes2949 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleConstantes2961 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes2982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector3018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector3028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleVector3065 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleVector3077 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector3098 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleVector3110 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleVector3122 = new BitSet(new long[]{0x0000000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector3143 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleVector3155 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz3212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz3222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleMatriz3259 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleMatriz3271 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz3292 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleMatriz3304 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz3325 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleMatriz3337 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleMatriz3349 = new BitSet(new long[]{0x0000000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz3370 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleMatriz3382 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz3403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro3439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro3449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleRegistro3486 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro3507 = new BitSet(new long[]{0x0000000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro3529 = new BitSet(new long[]{0x0002000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro3550 = new BitSet(new long[]{0x0002000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_49_in_ruleRegistro3564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo3600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleArchivo3647 = new BitSet(new long[]{0x0000000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo3668 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleArchivo3680 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo3701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado3737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado3747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado3793 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleEnumerado3805 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleEnumerado3817 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado3839 = new BitSet(new long[]{0x0010000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEnumerado3852 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado3873 = new BitSet(new long[]{0x0010000000200000L});
        public static final BitSet FOLLOW_52_in_ruleEnumerado3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango3924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango3934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango4008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico4043 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico4053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico4099 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSubrangoNumerico4111 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4133 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSubrangoNumerico4145 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico4166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado4203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado4213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4259 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSubrangoEnumerado4271 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4293 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSubrangoEnumerado4305 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado4326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio4363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio4373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleInicio4410 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInicio4431 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4453 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio4474 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_55_in_ruleInicio4489 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4511 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio4532 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_56_in_ruleInicio4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString4595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable4706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable4716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable4762 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleDeclaracionVariable4774 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable4795 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleDeclaracionVariable4808 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable4829 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia4867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia4877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia4923 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleDeclaracionPropia4935 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia4956 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleDeclaracionPropia4969 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia4990 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion5028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion5038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion5085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion5112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal5147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal5157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal5203 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsignacionNormal5215 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionNormal5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja5272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja5282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja5328 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsignacionCompleja5340 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleAsignacionCompleja5361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir5397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleEscribir5444 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEscribir5456 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir5477 = new BitSet(new long[]{0x00000007FC6007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_21_in_ruleEscribir5491 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir5512 = new BitSet(new long[]{0x00000007FC6007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir5540 = new BitSet(new long[]{0x00000007FC6007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_22_in_ruleEscribir5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer5590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer5600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleLeer5637 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLeer5649 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer5670 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLeer5682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi5718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi5728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleSi5765 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleSi5786 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_60_in_ruleSi5798 = new BitSet(new long[]{0x6E000007FC8807C0L,0x00000000F801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi5820 = new BitSet(new long[]{0x6E000007FC8807C0L,0x00000000F801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi5841 = new BitSet(new long[]{0x6E000007FC8807C0L,0x00000000F801808AL});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi5865 = new BitSet(new long[]{0x2000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi5887 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_61_in_ruleSi5900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras5936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras5946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rulemientras5983 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulemientras6004 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_rulemientras6016 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808BL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6038 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808BL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras6059 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808BL});
        public static final BitSet FOLLOW_64_in_rulemientras6074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir6110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir6120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rulerepetir6157 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808EL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir6179 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808EL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir6200 = new BitSet(new long[]{0x4E000007FC8807C0L,0x000000003801808EL});
        public static final BitSet FOLLOW_66_in_rulerepetir6215 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulerepetir6236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde6272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruledesde6319 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde6340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruledesde6352 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruledesde6373 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_ruledesde6385 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000380180AAL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde6407 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000380180AAL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde6428 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000380180AAL});
        public static final BitSet FOLLOW_69_in_ruledesde6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso6479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCaso6526 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso6547 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleCaso6559 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso6581 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso6602 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso6626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun6663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun6673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_rulesegun6710 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulesegun6722 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_rulesegun6743 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulesegun6755 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_63_in_rulesegun6767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000140L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun6789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000140L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun6810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000140L});
        public static final BitSet FOLLOW_72_in_rulesegun6825 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801828AL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun6847 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801828AL});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun6868 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801828AL});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun6892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_rulesegun6905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable6942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable6953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleTipoVariable6991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleTipoVariable7010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleTipoVariable7029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleTipoVariable7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleTipoVariable7067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable7117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable7172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_entryRulebooleano7209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebooleano7220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulebooleano7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_rulebooleano7277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr7320 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr7331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_rulesignoOr7368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd7408 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd7419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_rulesignoAnd7456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad7496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad7507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_rulesignoIgualdad7545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_rulesignoIgualdad7564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion7605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion7616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_rulesignoComparacion7654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesignoComparacion7673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_rulesignoComparacion7692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_rulesignoComparacion7711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma7752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma7763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rulesignoSuma7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta7840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rulesignoResta7888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion7928 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion7939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_rulesignoMultiplicacion7976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision8016 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision8027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_rulesignoDivision8064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion8103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion8113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion8159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr8193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr8203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr8250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr8280 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr8301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd8339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd8349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd8396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd8426 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleAnd8447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad8485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad8495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad8542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad8572 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad8593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000180000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion8631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion8641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion8688 = new BitSet(new long[]{0x0000000000000002L,0x0000000001E00000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion8718 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion8739 = new BitSet(new long[]{0x0000000000000002L,0x0000000001E00000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta8777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta8787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8834 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta8866 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta8904 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta8927 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision8965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision8975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision9022 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision9054 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision9092 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision9115 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria9153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria9163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_rulePrimaria9201 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria9223 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_91_in_rulePrimaria9234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_rulePrimaria9263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_rulePrimaria9290 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria9311 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePrimaria9323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_rulePrimaria9352 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulePrimaria9364 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_rulePrimaria9385 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePrimaria9397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_rulePrimaria9426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_rulePrimaria9453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_entryRuleFunciones9488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunciones9498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFunciones9554 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFunciones9566 = new BitSet(new long[]{0x00000007FC4007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones9588 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleFunciones9601 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones9622 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleFunciones9638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleFunciones9676 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFunciones9688 = new BitSet(new long[]{0x00000007FC4007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones9710 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleFunciones9723 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones9744 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleFunciones9760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas9797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesComplejas9807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas9864 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleVariablesComplejas9876 = new BitSet(new long[]{0x00000000000007C0L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas9897 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleVariablesComplejas9909 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleVariablesComplejas9923 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas9944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas9985 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleVariablesComplejas9997 = new BitSet(new long[]{0x00000000000007C0L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas10018 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleVariablesComplejas10030 = new BitSet(new long[]{0x00000000000007C0L,0x0000000000018000L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_ruleVariablesComplejas10051 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleVariablesComplejas10063 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleVariablesComplejas10077 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas10138 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleVariablesComplejas10150 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10172 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleVariablesComplejas10185 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas10206 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas10246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesBasicas10256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVariablesBasicas10312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleVariablesBasicas10350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleVariablesBasicas10384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleVariablesBasicas10423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebooleano_in_ruleVariablesBasicas10466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesBasicas10504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino10541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino10551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleSino10597 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino10619 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino10640 = new BitSet(new long[]{0x4E000007FC8807C2L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino10664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver10701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver10711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleDevolver10757 = new BitSet(new long[]{0x00000007FC0007C0L,0x0000000038018000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleDevolver10778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion10814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion10824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion10870 = new BitSet(new long[]{0x0000000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion10891 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleParametroFuncion10903 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion10924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion10960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion10970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion11016 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleFuncion11028 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuncion11049 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFuncion11061 = new BitSet(new long[]{0x0000001000400000L,0x0000003000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion11083 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleFuncion11096 = new BitSet(new long[]{0x0000001000000000L,0x0000003000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion11117 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleFuncion11133 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_15_in_ruleFuncion11146 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFuncion11161 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFuncion11175 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion11197 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion11218 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_55_in_ruleFuncion11233 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion11255 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion11276 = new BitSet(new long[]{0x4E000007FC8807C0L,0x00000000B801808AL});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion11300 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleFuncion11312 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleFuncion11324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento11360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento11370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_ruleProcedimiento11407 = new BitSet(new long[]{0x0000000000000180L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcedimiento11428 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleProcedimiento11440 = new BitSet(new long[]{0x0000001000400000L,0x0000003000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11462 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleProcedimiento11475 = new BitSet(new long[]{0x0000001000000000L,0x0000003000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento11496 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleProcedimiento11512 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_15_in_ruleProcedimiento11525 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleProcedimiento11540 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleProcedimiento11554 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento11576 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento11597 = new BitSet(new long[]{0x0080000000000180L,0x0000000000007C00L});
        public static final BitSet FOLLOW_55_in_ruleProcedimiento11612 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11634 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento11655 = new BitSet(new long[]{0x4F000007FC8807C0L,0x000000003801808AL});
        public static final BitSet FOLLOW_56_in_ruleProcedimiento11670 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_99_in_ruleProcedimiento11682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso11719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso11730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleTipoPaso11768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_ruleTipoPaso11787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_ruleTipoPaso11806 = new BitSet(new long[]{0x0000000000000002L});
    }


}