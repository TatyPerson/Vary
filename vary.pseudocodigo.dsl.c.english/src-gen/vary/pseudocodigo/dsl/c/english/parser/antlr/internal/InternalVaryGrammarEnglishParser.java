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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NOMBRE_FUN", "RULE_INT", "RULE_STRING", "RULE_CAD", "RULE_CAR", "RULE_SL_COMMENT", "RULE_COMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Algorithm'", "'import'", "'end_import'", "'const'", "'type'", "'var'", "'end_algorithm'", "'Module'", "'export'", "'end_export'", "'end_module'", "'implementation'", "'end_implementation'", "'procedure'", "','", "')'", "'function'", "'open'", "'('", "'close'", "'writing'", "'reading'", "'cos('", "'square('", "'exp('", "'ln('", "'log('", "'sen('", "'sqrt('", "'length('", "'concatena('", "'.'", "'E'", "'e'", "'+'", "'-'", "'='", "'vector'", "'['", "']'", "'of'", "': '", "'matrix'", "']['", "'registry:'", "'end_registry'", "'archive of '", "'{'", "'}'", "'..'", "'main'", "'initiation'", "'end_main'", "'<-'", "'write('", "'read('", "'if'", "'if('", "'then'", "'end_if'", "'while'", "'while('", "'do'", "'end_while'", "'repeat'", "'until'", "'until('", "'for'", "'to'", "'end_for'", "'case'", "'according_to'", "'according_to('", "'otherwise:'", "'end_according_to'", "'integer'", "'character'", "'real'", "'boolean'", "'string'", "'or'", "'and'", "'!='", "'<'", "'>'", "'>='", "'<='", "'*'", "'/'", "'mod'", "'div'", "'no'", "'else'", "'return'", "'end_function'", "'end_procedure'", "'I'", "'I/O'", "'O'", "'true'", "'false'"
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
    public static final int RULE_ML_COMMENT=12;
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
    public static final int RULE_COMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int RULE_CAD=8;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:116:1: ruleAlgoritmo returns [EObject current=null] : (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'end_algorithm' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:119:28: ( (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'end_algorithm' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:1: (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'end_algorithm' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:1: (otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'end_algorithm' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:120:3: otherlv_0= 'Algorithm' ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )? (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )? (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )? (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )? ( (lv_funcion_11_0= ruleSubproceso ) )* ( (lv_tiene_12_0= ruleInicio ) ) otherlv_13= 'end_algorithm'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAlgoritmo241); 

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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:142:2: (otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:142:4: otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAlgoritmo275); 

                        	newLeafNode(otherlv_2, grammarAccess.getAlgoritmoAccess().getImportKeyword_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:146:1: ( (otherlv_3= RULE_ID ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:147:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:147:1: (otherlv_3= RULE_ID )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:148:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAlgoritmo295); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getAlgoritmoAccess().getImportacionesModuloCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAlgoritmo308); 

                        	newLeafNode(otherlv_4, grammarAccess.getAlgoritmoAccess().getEnd_importKeyword_2_2());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:163:3: (otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:163:5: otherlv_5= 'const' ( (lv_constantes_6_0= ruleConstantes ) )*
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAlgoritmo323); 

                        	newLeafNode(otherlv_5, grammarAccess.getAlgoritmoAccess().getConstKeyword_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:167:1: ( (lv_constantes_6_0= ruleConstantes ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:168:1: (lv_constantes_6_0= ruleConstantes )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:168:1: (lv_constantes_6_0= ruleConstantes )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:169:3: lv_constantes_6_0= ruleConstantes
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getConstantesConstantesParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleAlgoritmo344);
                    	    lv_constantes_6_0=ruleConstantes();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:185:5: (otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:185:7: otherlv_7= 'type' ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )*
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAlgoritmo360); 

                        	newLeafNode(otherlv_7, grammarAccess.getAlgoritmoAccess().getTypeKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:189:1: ( (lv_tipocomplejo_8_0= ruleTipoComplejo ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==RULE_STRING||LA6_0==52||LA6_0==57||LA6_0==59||LA6_0==61) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:190:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:190:1: (lv_tipocomplejo_8_0= ruleTipoComplejo )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:191:3: lv_tipocomplejo_8_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTipocomplejoTipoComplejoParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo381);
                    	    lv_tipocomplejo_8_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tipocomplejo",
                    	            		lv_tipocomplejo_8_0, 
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:207:5: (otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:207:7: otherlv_9= 'var' ( (lv_global_10_0= ruleDeclaracion ) )*
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAlgoritmo397); 

                        	newLeafNode(otherlv_9, grammarAccess.getAlgoritmoAccess().getVarKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:211:1: ( (lv_global_10_0= ruleDeclaracion ) )*
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case 90:
                            {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==56) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==56) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA8_3 = input.LA(2);

                            if ( (LA8_3==56) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 93:
                            {
                            int LA8_4 = input.LA(2);

                            if ( (LA8_4==56) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 94:
                            {
                            int LA8_5 = input.LA(2);

                            if ( (LA8_5==56) ) {
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
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:212:1: (lv_global_10_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:212:1: (lv_global_10_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:213:3: lv_global_10_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getGlobalDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleAlgoritmo418);
                    	    lv_global_10_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
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
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:229:5: ( (lv_funcion_11_0= ruleSubproceso ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||(LA10_0>=90 && LA10_0<=94)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:230:1: (lv_funcion_11_0= ruleSubproceso )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:230:1: (lv_funcion_11_0= ruleSubproceso )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:231:3: lv_funcion_11_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getFuncionSubprocesoParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleAlgoritmo442);
            	    lv_funcion_11_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funcion",
            	            		lv_funcion_11_0, 
            	            		"Subproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:247:3: ( (lv_tiene_12_0= ruleInicio ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:248:1: (lv_tiene_12_0= ruleInicio )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:248:1: (lv_tiene_12_0= ruleInicio )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:249:3: lv_tiene_12_0= ruleInicio
            {
             
            	        newCompositeNode(grammarAccess.getAlgoritmoAccess().getTieneInicioParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_ruleAlgoritmo464);
            lv_tiene_12_0=ruleInicio();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAlgoritmoRule());
            	        }
                   		set(
                   			current, 
                   			"tiene",
                    		lv_tiene_12_0, 
                    		"Inicio");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAlgoritmo476); 

                	newLeafNode(otherlv_13, grammarAccess.getAlgoritmoAccess().getEnd_algorithmKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:277:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:278:2: (iv_ruleModulo= ruleModulo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:279:2: iv_ruleModulo= ruleModulo EOF
            {
             newCompositeNode(grammarAccess.getModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModulo_in_entryRuleModulo512);
            iv_ruleModulo=ruleModulo();

            state._fsp--;

             current =iv_ruleModulo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModulo522); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:286:1: ruleModulo returns [EObject current=null] : (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' otherlv_5= 'export' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'end_export' ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'end_module' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:289:28: ( (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' otherlv_5= 'export' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'end_export' ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'end_module' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:290:1: (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' otherlv_5= 'export' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'end_export' ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'end_module' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:290:1: (otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' otherlv_5= 'export' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'end_export' ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'end_module' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:290:3: otherlv_0= 'Module' ( (lv_nombre_1_0= RULE_ID ) ) otherlv_2= 'import' ( (otherlv_3= RULE_ID ) )* otherlv_4= 'end_import' otherlv_5= 'export' (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )? (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )? (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )? ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )* otherlv_13= 'end_export' ( (lv_implementacion_14_0= ruleImplementacion ) ) otherlv_15= 'end_module'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleModulo559); 

                	newLeafNode(otherlv_0, grammarAccess.getModuloAccess().getModuleKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:294:1: ( (lv_nombre_1_0= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:295:1: (lv_nombre_1_0= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:295:1: (lv_nombre_1_0= RULE_ID )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:296:3: lv_nombre_1_0= RULE_ID
            {
            lv_nombre_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo576); 

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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleModulo593); 

                	newLeafNode(otherlv_2, grammarAccess.getModuloAccess().getImportKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:316:1: ( (otherlv_3= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:317:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:317:1: (otherlv_3= RULE_ID )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:318:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModuloRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModulo613); 

            	    		newLeafNode(otherlv_3, grammarAccess.getModuloAccess().getImportacionesModuloCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleModulo626); 

                	newLeafNode(otherlv_4, grammarAccess.getModuloAccess().getEnd_importKeyword_4());
                
            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleModulo638); 

                	newLeafNode(otherlv_5, grammarAccess.getModuloAccess().getExportKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:337:1: (otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:337:3: otherlv_6= 'const' ( (lv_exporta_constantes_7_0= ruleEString ) )*
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleModulo651); 

                        	newLeafNode(otherlv_6, grammarAccess.getModuloAccess().getConstKeyword_6_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:341:1: ( (lv_exporta_constantes_7_0= ruleEString ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:342:1: (lv_exporta_constantes_7_0= ruleEString )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:342:1: (lv_exporta_constantes_7_0= ruleEString )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:343:3: lv_exporta_constantes_7_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_constantesEStringParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo672);
                    	    lv_exporta_constantes_7_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_constantes",
                    	            		lv_exporta_constantes_7_0, 
                    	            		"EString");
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:359:5: (otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:359:7: otherlv_8= 'type' ( (lv_exporta_tipos_9_0= ruleEString ) )*
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleModulo688); 

                        	newLeafNode(otherlv_8, grammarAccess.getModuloAccess().getTypeKeyword_7_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:363:1: ( (lv_exporta_tipos_9_0= ruleEString ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:364:1: (lv_exporta_tipos_9_0= ruleEString )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:364:1: (lv_exporta_tipos_9_0= ruleEString )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:365:3: lv_exporta_tipos_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_tiposEStringParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleModulo709);
                    	    lv_exporta_tipos_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_tipos",
                    	            		lv_exporta_tipos_9_0, 
                    	            		"EString");
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:381:5: (otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:381:7: otherlv_10= 'var' ( (lv_exporta_global_11_0= ruleDeclaracion ) )*
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleModulo725); 

                        	newLeafNode(otherlv_10, grammarAccess.getModuloAccess().getVarKeyword_8_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:385:1: ( (lv_exporta_global_11_0= ruleDeclaracion ) )*
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case 90:
                            {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==56) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA16_3 = input.LA(2);

                            if ( (LA16_3==56) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA16_4 = input.LA(2);

                            if ( (LA16_4==56) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 93:
                            {
                            int LA16_5 = input.LA(2);

                            if ( (LA16_5==56) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 94:
                            {
                            int LA16_6 = input.LA(2);

                            if ( (LA16_6==56) ) {
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
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:386:1: (lv_exporta_global_11_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:386:1: (lv_exporta_global_11_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:387:3: lv_exporta_global_11_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_globalDeclaracionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleModulo746);
                    	    lv_exporta_global_11_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exporta_global",
                    	            		lv_exporta_global_11_0, 
                    	            		"Declaracion");
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:403:5: ( (lv_exporta_funciones_12_0= ruleCabeceraSubproceso ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28||(LA18_0>=90 && LA18_0<=94)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:404:1: (lv_exporta_funciones_12_0= ruleCabeceraSubproceso )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:404:1: (lv_exporta_funciones_12_0= ruleCabeceraSubproceso )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:405:3: lv_exporta_funciones_12_0= ruleCabeceraSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuloAccess().getExporta_funcionesCabeceraSubprocesoParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_ruleModulo770);
            	    lv_exporta_funciones_12_0=ruleCabeceraSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exporta_funciones",
            	            		lv_exporta_funciones_12_0, 
            	            		"CabeceraSubproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleModulo783); 

                	newLeafNode(otherlv_13, grammarAccess.getModuloAccess().getEnd_exportKeyword_10());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:425:1: ( (lv_implementacion_14_0= ruleImplementacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:426:1: (lv_implementacion_14_0= ruleImplementacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:426:1: (lv_implementacion_14_0= ruleImplementacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:427:3: lv_implementacion_14_0= ruleImplementacion
            {
             
            	        newCompositeNode(grammarAccess.getModuloAccess().getImplementacionImplementacionParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_ruleModulo804);
            lv_implementacion_14_0=ruleImplementacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuloRule());
            	        }
                   		set(
                   			current, 
                   			"implementacion",
                    		lv_implementacion_14_0, 
                    		"Implementacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleModulo816); 

                	newLeafNode(otherlv_15, grammarAccess.getModuloAccess().getEnd_moduleKeyword_12());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:455:1: entryRuleImplementacion returns [EObject current=null] : iv_ruleImplementacion= ruleImplementacion EOF ;
    public final EObject entryRuleImplementacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:456:2: (iv_ruleImplementacion= ruleImplementacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:457:2: iv_ruleImplementacion= ruleImplementacion EOF
            {
             newCompositeNode(grammarAccess.getImplementacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplementacion_in_entryRuleImplementacion852);
            iv_ruleImplementacion=ruleImplementacion();

            state._fsp--;

             current =iv_ruleImplementacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementacion862); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:464:1: ruleImplementacion returns [EObject current=null] : ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'end_implementation' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:467:28: ( ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'end_implementation' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:468:1: ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'end_implementation' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:468:1: ( () otherlv_1= 'implementation' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'end_implementation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:468:2: () otherlv_1= 'implementation' (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )? (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )? (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )? ( (lv_funcion_8_0= ruleSubproceso ) )* otherlv_9= 'end_implementation'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:468:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:469:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getImplementacionAccess().getImplementacionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleImplementacion908); 

                	newLeafNode(otherlv_1, grammarAccess.getImplementacionAccess().getImplementationKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:478:1: (otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:478:3: otherlv_2= 'const' ( (lv_constantes_3_0= ruleConstantes ) )*
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleImplementacion921); 

                        	newLeafNode(otherlv_2, grammarAccess.getImplementacionAccess().getConstKeyword_2_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:482:1: ( (lv_constantes_3_0= ruleConstantes ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:483:1: (lv_constantes_3_0= ruleConstantes )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:483:1: (lv_constantes_3_0= ruleConstantes )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:484:3: lv_constantes_3_0= ruleConstantes
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getConstantesConstantesParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_ruleImplementacion942);
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
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:500:5: (otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:500:7: otherlv_4= 'type' ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleImplementacion958); 

                        	newLeafNode(otherlv_4, grammarAccess.getImplementacionAccess().getTypeKeyword_3_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:504:1: ( (lv_tipocomplejo_5_0= ruleTipoComplejo ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING||LA21_0==52||LA21_0==57||LA21_0==59||LA21_0==61) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:505:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:505:1: (lv_tipocomplejo_5_0= ruleTipoComplejo )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:506:3: lv_tipocomplejo_5_0= ruleTipoComplejo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getTipocomplejoTipoComplejoParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_ruleImplementacion979);
                    	    lv_tipocomplejo_5_0=ruleTipoComplejo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tipocomplejo",
                    	            		lv_tipocomplejo_5_0, 
                    	            		"TipoComplejo");
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:522:5: (otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:522:7: otherlv_6= 'var' ( (lv_global_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleImplementacion995); 

                        	newLeafNode(otherlv_6, grammarAccess.getImplementacionAccess().getVarKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:526:1: ( (lv_global_7_0= ruleDeclaracion ) )*
                    loop23:
                    do {
                        int alt23=2;
                        switch ( input.LA(1) ) {
                        case 90:
                            {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==56) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 91:
                            {
                            int LA23_2 = input.LA(2);

                            if ( (LA23_2==56) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 92:
                            {
                            int LA23_3 = input.LA(2);

                            if ( (LA23_3==56) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 93:
                            {
                            int LA23_4 = input.LA(2);

                            if ( (LA23_4==56) ) {
                                alt23=1;
                            }


                            }
                            break;
                        case 94:
                            {
                            int LA23_5 = input.LA(2);

                            if ( (LA23_5==56) ) {
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
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:527:1: (lv_global_7_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:527:1: (lv_global_7_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:528:3: lv_global_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getGlobalDeclaracionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleImplementacion1016);
                    	    lv_global_7_0=ruleDeclaracion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"global",
                    	            		lv_global_7_0, 
                    	            		"Declaracion");
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:544:5: ( (lv_funcion_8_0= ruleSubproceso ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28||(LA25_0>=90 && LA25_0<=94)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:545:1: (lv_funcion_8_0= ruleSubproceso )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:545:1: (lv_funcion_8_0= ruleSubproceso )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:546:3: lv_funcion_8_0= ruleSubproceso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplementacionAccess().getFuncionSubprocesoParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_ruleImplementacion1040);
            	    lv_funcion_8_0=ruleSubproceso();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplementacionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funcion",
            	            		lv_funcion_8_0, 
            	            		"Subproceso");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleImplementacion1053); 

                	newLeafNode(otherlv_9, grammarAccess.getImplementacionAccess().getEnd_implementationKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:574:1: entryRuleCabeceraSubproceso returns [EObject current=null] : iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF ;
    public final EObject entryRuleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:575:2: (iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:576:2: iv_ruleCabeceraSubproceso= ruleCabeceraSubproceso EOF
            {
             newCompositeNode(grammarAccess.getCabeceraSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1089);
            iv_ruleCabeceraSubproceso=ruleCabeceraSubproceso();

            state._fsp--;

             current =iv_ruleCabeceraSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraSubproceso1099); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:583:1: ruleCabeceraSubproceso returns [EObject current=null] : (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) ;
    public final EObject ruleCabeceraSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_CabeceraProcedimiento_0 = null;

        EObject this_CabeceraFuncion_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:586:28: ( (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:587:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:587:1: (this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento | this_CabeceraFuncion_1= ruleCabeceraFuncion )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=90 && LA26_0<=94)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:588:5: this_CabeceraProcedimiento_0= ruleCabeceraProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraProcedimientoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1146);
                    this_CabeceraProcedimiento_0=ruleCabeceraProcedimiento();

                    state._fsp--;

                     
                            current = this_CabeceraProcedimiento_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:598:5: this_CabeceraFuncion_1= ruleCabeceraFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getCabeceraSubprocesoAccess().getCabeceraFuncionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1173);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:614:1: entryRuleCabeceraProcedimiento returns [EObject current=null] : iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF ;
    public final EObject entryRuleCabeceraProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:615:2: (iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:616:2: iv_ruleCabeceraProcedimiento= ruleCabeceraProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getCabeceraProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1208);
            iv_ruleCabeceraProcedimiento=ruleCabeceraProcedimiento();

            state._fsp--;

             current =iv_ruleCabeceraProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1218); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:623:1: ruleCabeceraProcedimiento returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:626:28: ( (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:627:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:627:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:627:3: otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCabeceraProcedimiento1255); 

                	newLeafNode(otherlv_0, grammarAccess.getCabeceraProcedimientoAccess().getProcedureKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:631:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:632:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:632:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:633:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraProcedimiento1272); 

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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:649:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=111 && LA28_0<=113)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:649:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:649:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:650:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:650:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:651:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1299);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:667:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==29) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:667:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraProcedimiento1312); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getCabeceraProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:671:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:672:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:672:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:673:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1333);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraProcedimiento1349); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:701:1: entryRuleCabeceraFuncion returns [EObject current=null] : iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF ;
    public final EObject entryRuleCabeceraFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCabeceraFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:702:2: (iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:703:2: iv_ruleCabeceraFuncion= ruleCabeceraFuncion EOF
            {
             newCompositeNode(grammarAccess.getCabeceraFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1385);
            iv_ruleCabeceraFuncion=ruleCabeceraFuncion();

            state._fsp--;

             current =iv_ruleCabeceraFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCabeceraFuncion1395); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:710:1: ruleCabeceraFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:713:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:714:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:714:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:714:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:715:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:715:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:716:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1441);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCabeceraFuncion1453); 

                	newLeafNode(otherlv_1, grammarAccess.getCabeceraFuncionAccess().getFunctionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:736:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:737:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:737:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:738:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraFuncion1470); 

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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:754:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=111 && LA30_0<=113)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:754:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:754:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:755:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:755:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:756:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1497);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:772:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==29) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:772:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCabeceraFuncion1510); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCabeceraFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:776:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:777:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:777:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:778:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCabeceraFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1531);
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
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCabeceraFuncion1547); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:806:1: entryRuleTipoComplejo returns [EObject current=null] : iv_ruleTipoComplejo= ruleTipoComplejo EOF ;
    public final EObject entryRuleTipoComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoComplejo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:807:2: (iv_ruleTipoComplejo= ruleTipoComplejo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:808:2: iv_ruleTipoComplejo= ruleTipoComplejo EOF
            {
             newCompositeNode(grammarAccess.getTipoComplejoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1583);
            iv_ruleTipoComplejo=ruleTipoComplejo();

            state._fsp--;

             current =iv_ruleTipoComplejo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoComplejo1593); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:815:1: ruleTipoComplejo returns [EObject current=null] : (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:818:28: ( (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )
            int alt31=6;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:820:5: this_Vector_0= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getVectorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVector_in_ruleTipoComplejo1640);
                    this_Vector_0=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:830:5: this_Matriz_1= ruleMatriz
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getMatrizParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_ruleTipoComplejo1667);
                    this_Matriz_1=ruleMatriz();

                    state._fsp--;

                     
                            current = this_Matriz_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:840:5: this_Registro_2= ruleRegistro
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getRegistroParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_ruleTipoComplejo1694);
                    this_Registro_2=ruleRegistro();

                    state._fsp--;

                     
                            current = this_Registro_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:850:5: this_Archivo_3= ruleArchivo
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getArchivoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_ruleTipoComplejo1721);
                    this_Archivo_3=ruleArchivo();

                    state._fsp--;

                     
                            current = this_Archivo_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:860:5: this_Enumerado_4= ruleEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getEnumeradoParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_ruleTipoComplejo1748);
                    this_Enumerado_4=ruleEnumerado();

                    state._fsp--;

                     
                            current = this_Enumerado_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:870:5: this_Subrango_5= ruleSubrango
                    {
                     
                            newCompositeNode(grammarAccess.getTipoComplejoAccess().getSubrangoParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_ruleTipoComplejo1775);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:886:1: entryRuleSubproceso returns [EObject current=null] : iv_ruleSubproceso= ruleSubproceso EOF ;
    public final EObject entryRuleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubproceso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:887:2: (iv_ruleSubproceso= ruleSubproceso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:888:2: iv_ruleSubproceso= ruleSubproceso EOF
            {
             newCompositeNode(grammarAccess.getSubprocesoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubproceso_in_entryRuleSubproceso1810);
            iv_ruleSubproceso=ruleSubproceso();

            state._fsp--;

             current =iv_ruleSubproceso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubproceso1820); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:895:1: ruleSubproceso returns [EObject current=null] : (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) ;
    public final EObject ruleSubproceso() throws RecognitionException {
        EObject current = null;

        EObject this_Funcion_0 = null;

        EObject this_Procedimiento_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:898:28: ( (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:899:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:899:1: (this_Funcion_0= ruleFuncion | this_Procedimiento_1= ruleProcedimiento )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=90 && LA32_0<=94)) ) {
                alt32=1;
            }
            else if ( (LA32_0==28) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:900:5: this_Funcion_0= ruleFuncion
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getFuncionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_ruleSubproceso1867);
                    this_Funcion_0=ruleFuncion();

                    state._fsp--;

                     
                            current = this_Funcion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:910:5: this_Procedimiento_1= ruleProcedimiento
                    {
                     
                            newCompositeNode(grammarAccess.getSubprocesoAccess().getProcedimientoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_ruleSubproceso1894);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:928:1: entryRuleSentencias returns [EObject current=null] : iv_ruleSentencias= ruleSentencias EOF ;
    public final EObject entryRuleSentencias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencias = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:929:2: (iv_ruleSentencias= ruleSentencias EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:930:2: iv_ruleSentencias= ruleSentencias EOF
            {
             newCompositeNode(grammarAccess.getSentenciasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_entryRuleSentencias1931);
            iv_ruleSentencias=ruleSentencias();

            state._fsp--;

             current =iv_ruleSentencias; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSentencias1941); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:937:1: ruleSentencias returns [EObject current=null] : (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:940:28: ( (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:941:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:941:1: (this_Escribir_0= ruleEscribir | this_Leer_1= ruleLeer | this_Bloque_2= ruleBloque | this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir | this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar | this_Asignacion_5= ruleAsignacion | this_Funciones_6= ruleFunciones )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt33=1;
                }
                break;
            case 70:
                {
                alt33=2;
                }
                break;
            case 71:
            case 72:
            case 75:
            case 76:
            case 79:
            case 82:
            case 86:
            case 87:
                {
                alt33=3;
                }
                break;
            case 32:
                {
                alt33=4;
                }
                break;
            case 34:
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:942:5: this_Escribir_0= ruleEscribir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getEscribirParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_ruleSentencias1988);
                    this_Escribir_0=ruleEscribir();

                    state._fsp--;

                     
                            current = this_Escribir_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:952:5: this_Leer_1= ruleLeer
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getLeerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLeer_in_ruleSentencias2015);
                    this_Leer_1=ruleLeer();

                    state._fsp--;

                     
                            current = this_Leer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:962:5: this_Bloque_2= ruleBloque
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getBloqueParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBloque_in_ruleSentencias2042);
                    this_Bloque_2=ruleBloque();

                    state._fsp--;

                     
                            current = this_Bloque_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:972:5: this_FuncionFicheroAbrir_3= ruleFuncionFicheroAbrir
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroAbrirParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2069);
                    this_FuncionFicheroAbrir_3=ruleFuncionFicheroAbrir();

                    state._fsp--;

                     
                            current = this_FuncionFicheroAbrir_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:982:5: this_FuncionFicheroCerrar_4= ruleFuncionFicheroCerrar
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionFicheroCerrarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2096);
                    this_FuncionFicheroCerrar_4=ruleFuncionFicheroCerrar();

                    state._fsp--;

                     
                            current = this_FuncionFicheroCerrar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:992:5: this_Asignacion_5= ruleAsignacion
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getAsignacionParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_ruleSentencias2123);
                    this_Asignacion_5=ruleAsignacion();

                    state._fsp--;

                     
                            current = this_Asignacion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1002:5: this_Funciones_6= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getSentenciasAccess().getFuncionesParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_ruleSentencias2150);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1018:1: entryRuleBloque returns [EObject current=null] : iv_ruleBloque= ruleBloque EOF ;
    public final EObject entryRuleBloque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloque = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1019:2: (iv_ruleBloque= ruleBloque EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1020:2: iv_ruleBloque= ruleBloque EOF
            {
             newCompositeNode(grammarAccess.getBloqueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBloque_in_entryRuleBloque2185);
            iv_ruleBloque=ruleBloque();

            state._fsp--;

             current =iv_ruleBloque; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBloque2195); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1027:1: ruleBloque returns [EObject current=null] : (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) ;
    public final EObject ruleBloque() throws RecognitionException {
        EObject current = null;

        EObject this_Si_0 = null;

        EObject this_mientras_1 = null;

        EObject this_repetir_2 = null;

        EObject this_desde_3 = null;

        EObject this_segun_4 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1030:28: ( (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1031:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1031:1: (this_Si_0= ruleSi | this_mientras_1= rulemientras | this_repetir_2= rulerepetir | this_desde_3= ruledesde | this_segun_4= rulesegun )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
                {
                alt34=1;
                }
                break;
            case 75:
            case 76:
                {
                alt34=2;
                }
                break;
            case 79:
                {
                alt34=3;
                }
                break;
            case 82:
                {
                alt34=4;
                }
                break;
            case 86:
            case 87:
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1032:5: this_Si_0= ruleSi
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSiParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSi_in_ruleBloque2242);
                    this_Si_0=ruleSi();

                    state._fsp--;

                     
                            current = this_Si_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1042:5: this_mientras_1= rulemientras
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getMientrasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulemientras_in_ruleBloque2269);
                    this_mientras_1=rulemientras();

                    state._fsp--;

                     
                            current = this_mientras_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1052:5: this_repetir_2= rulerepetir
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getRepetirParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulerepetir_in_ruleBloque2296);
                    this_repetir_2=rulerepetir();

                    state._fsp--;

                     
                            current = this_repetir_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1062:5: this_desde_3= ruledesde
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getDesdeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruledesde_in_ruleBloque2323);
                    this_desde_3=ruledesde();

                    state._fsp--;

                     
                            current = this_desde_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1072:5: this_segun_4= rulesegun
                    {
                     
                            newCompositeNode(grammarAccess.getBloqueAccess().getSegunParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulesegun_in_ruleBloque2350);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1088:1: entryRuleDeclaracion returns [EObject current=null] : iv_ruleDeclaracion= ruleDeclaracion EOF ;
    public final EObject entryRuleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1089:2: (iv_ruleDeclaracion= ruleDeclaracion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1090:2: iv_ruleDeclaracion= ruleDeclaracion EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2385);
            iv_ruleDeclaracion=ruleDeclaracion();

            state._fsp--;

             current =iv_ruleDeclaracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracion2395); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1097:1: ruleDeclaracion returns [EObject current=null] : (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) ;
    public final EObject ruleDeclaracion() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracionVariable_0 = null;

        EObject this_DeclaracionPropia_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1100:28: ( (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1101:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1101:1: (this_DeclaracionVariable_0= ruleDeclaracionVariable | this_DeclaracionPropia_1= ruleDeclaracionPropia )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=90 && LA35_0<=94)) ) {
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1102:5: this_DeclaracionVariable_0= ruleDeclaracionVariable
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionVariableParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2442);
                    this_DeclaracionVariable_0=ruleDeclaracionVariable();

                    state._fsp--;

                     
                            current = this_DeclaracionVariable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1112:5: this_DeclaracionPropia_1= ruleDeclaracionPropia
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaracionAccess().getDeclaracionPropiaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2469);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1128:1: entryRuleFuncionFicheroAbrir returns [EObject current=null] : iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF ;
    public final EObject entryRuleFuncionFicheroAbrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroAbrir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1129:2: (iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1130:2: iv_ruleFuncionFicheroAbrir= ruleFuncionFicheroAbrir EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroAbrirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir2504);
            iv_ruleFuncionFicheroAbrir=ruleFuncionFicheroAbrir();

            state._fsp--;

             current =iv_ruleFuncionFicheroAbrir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir2514); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1137:1: ruleFuncionFicheroAbrir returns [EObject current=null] : (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1140:28: ( (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1141:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1141:1: (otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1141:3: otherlv_0= 'open' otherlv_1= '(' ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFuncionFicheroAbrir2551); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroAbrirAccess().getOpenKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroAbrir2563); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroAbrirAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1149:1: ( ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1149:2: ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ',' ( (lv_modo_4_0= ruleModoApertura ) ) otherlv_5= ',' ( (lv_variable_6_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1149:2: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1150:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1150:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1151:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir2585);
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

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir2597); 

                	newLeafNode(otherlv_3, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1171:1: ( (lv_modo_4_0= ruleModoApertura ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1172:1: (lv_modo_4_0= ruleModoApertura )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1172:1: (lv_modo_4_0= ruleModoApertura )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1173:3: lv_modo_4_0= ruleModoApertura
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getModoModoAperturaParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir2618);
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

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncionFicheroAbrir2630); 

                	newLeafNode(otherlv_5, grammarAccess.getFuncionFicheroAbrirAccess().getCommaKeyword_2_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1193:1: ( (lv_variable_6_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1194:1: (lv_variable_6_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1194:1: (lv_variable_6_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1195:3: lv_variable_6_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroAbrirAccess().getVariablePrimariaParserRuleCall_2_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir2651);
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

            otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroAbrir2664); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1223:1: entryRuleFuncionFicheroCerrar returns [EObject current=null] : iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF ;
    public final EObject entryRuleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncionFicheroCerrar = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1224:2: (iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1225:2: iv_ruleFuncionFicheroCerrar= ruleFuncionFicheroCerrar EOF
            {
             newCompositeNode(grammarAccess.getFuncionFicheroCerrarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar2700);
            iv_ruleFuncionFicheroCerrar=ruleFuncionFicheroCerrar();

            state._fsp--;

             current =iv_ruleFuncionFicheroCerrar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar2710); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1232:1: ruleFuncionFicheroCerrar returns [EObject current=null] : (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) ;
    public final EObject ruleFuncionFicheroCerrar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1235:28: ( (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1236:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1236:1: (otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1236:3: otherlv_0= 'close' otherlv_1= '(' ( (lv_variable_2_0= rulePrimaria ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFuncionFicheroCerrar2747); 

                	newLeafNode(otherlv_0, grammarAccess.getFuncionFicheroCerrarAccess().getCloseKeyword_0());
                
            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFuncionFicheroCerrar2759); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionFicheroCerrarAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1244:1: ( (lv_variable_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1245:1: (lv_variable_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1245:1: (lv_variable_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1246:3: lv_variable_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getFuncionFicheroCerrarAccess().getVariablePrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar2780);
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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncionFicheroCerrar2792); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1274:1: entryRuleModoApertura returns [String current=null] : iv_ruleModoApertura= ruleModoApertura EOF ;
    public final String entryRuleModoApertura() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModoApertura = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1275:2: (iv_ruleModoApertura= ruleModoApertura EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1276:2: iv_ruleModoApertura= ruleModoApertura EOF
            {
             newCompositeNode(grammarAccess.getModoAperturaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModoApertura_in_entryRuleModoApertura2829);
            iv_ruleModoApertura=ruleModoApertura();

            state._fsp--;

             current =iv_ruleModoApertura.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModoApertura2840); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1283:1: ruleModoApertura returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'writing' | kw= 'reading' ) ;
    public final AntlrDatatypeRuleToken ruleModoApertura() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1286:28: ( (kw= 'writing' | kw= 'reading' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1287:1: (kw= 'writing' | kw= 'reading' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1287:1: (kw= 'writing' | kw= 'reading' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            else if ( (LA36_0==36) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1288:2: kw= 'writing'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleModoApertura2878); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getModoAperturaAccess().getWritingKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1295:2: kw= 'reading'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleModoApertura2897); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1308:1: entryRuleNombreInterna returns [String current=null] : iv_ruleNombreInterna= ruleNombreInterna EOF ;
    public final String entryRuleNombreInterna() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreInterna = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1309:2: (iv_ruleNombreInterna= ruleNombreInterna EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1310:2: iv_ruleNombreInterna= ruleNombreInterna EOF
            {
             newCompositeNode(grammarAccess.getNombreInternaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna2938);
            iv_ruleNombreInterna=ruleNombreInterna();

            state._fsp--;

             current =iv_ruleNombreInterna.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNombreInterna2949); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1317:1: ruleNombreInterna returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cos(' | kw= 'square(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'length(' | kw= 'concatena(' ) ;
    public final AntlrDatatypeRuleToken ruleNombreInterna() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1320:28: ( (kw= 'cos(' | kw= 'square(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'length(' | kw= 'concatena(' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1321:1: (kw= 'cos(' | kw= 'square(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'length(' | kw= 'concatena(' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1321:1: (kw= 'cos(' | kw= 'square(' | kw= 'exp(' | kw= 'ln(' | kw= 'log(' | kw= 'sen(' | kw= 'sqrt(' | kw= 'length(' | kw= 'concatena(' )
            int alt37=9;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt37=1;
                }
                break;
            case 38:
                {
                alt37=2;
                }
                break;
            case 39:
                {
                alt37=3;
                }
                break;
            case 40:
                {
                alt37=4;
                }
                break;
            case 41:
                {
                alt37=5;
                }
                break;
            case 42:
                {
                alt37=6;
                }
                break;
            case 43:
                {
                alt37=7;
                }
                break;
            case 44:
                {
                alt37=8;
                }
                break;
            case 45:
                {
                alt37=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1322:2: kw= 'cos('
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleNombreInterna2987); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getCosKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1329:2: kw= 'square('
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNombreInterna3006); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSquareKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1336:2: kw= 'exp('
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNombreInterna3025); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getExpKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1343:2: kw= 'ln('
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNombreInterna3044); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLnKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1350:2: kw= 'log('
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleNombreInterna3063); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLogKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1357:2: kw= 'sen('
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleNombreInterna3082); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSenKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1364:2: kw= 'sqrt('
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleNombreInterna3101); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getSqrtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1371:2: kw= 'length('
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleNombreInterna3120); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNombreInternaAccess().getLengthKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1378:2: kw= 'concatena('
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleNombreInterna3139); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1391:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1392:2: (iv_ruleEInt= ruleEInt EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1393:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt3180);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt3191); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1400:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1403:28: (this_INT_0= RULE_INT )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1404:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt3230); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1419:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1420:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1421:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat3275);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat3286); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1428:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1431:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1432:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1432:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1432:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3326); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEFloat3344); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3359); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2()); 
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1452:1: ( (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=47 && LA40_0<=48)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1452:2: (kw= 'E' | kw= 'e' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1452:2: (kw= 'E' | kw= 'e' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==47) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==48) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1453:2: kw= 'E'
                            {
                            kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEFloat3379); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1460:2: kw= 'e'
                            {
                            kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleEFloat3398); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_3_0_1()); 
                                

                            }
                            break;

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1465:2: (kw= '+' | kw= '-' )?
                    int alt39=3;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==49) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==50) ) {
                        alt39=2;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1466:2: kw= '+'
                            {
                            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEFloat3413); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getPlusSignKeyword_3_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1473:2: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleEFloat3432); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_3_1_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat3449); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1493:1: entryRuleCampoRegistro returns [EObject current=null] : iv_ruleCampoRegistro= ruleCampoRegistro EOF ;
    public final EObject entryRuleCampoRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCampoRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1494:2: (iv_ruleCampoRegistro= ruleCampoRegistro EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1495:2: iv_ruleCampoRegistro= ruleCampoRegistro EOF
            {
             newCompositeNode(grammarAccess.getCampoRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3496);
            iv_ruleCampoRegistro=ruleCampoRegistro();

            state._fsp--;

             current =iv_ruleCampoRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCampoRegistro3506); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1502:1: ruleCampoRegistro returns [EObject current=null] : ( (lv_nombre_campo_0_0= ruleEString ) ) ;
    public final EObject ruleCampoRegistro() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_campo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1505:28: ( ( (lv_nombre_campo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1506:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1506:1: ( (lv_nombre_campo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1507:1: (lv_nombre_campo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1507:1: (lv_nombre_campo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1508:3: lv_nombre_campo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCampoRegistroAccess().getNombre_campoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCampoRegistro3551);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1532:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1533:2: (iv_ruleTipo= ruleTipo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1534:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_entryRuleTipo3586);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipo3596); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1541:1: ruleTipo returns [EObject current=null] : (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject this_TipoDefinido_0 = null;

        EObject this_TipoExistente_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1544:28: ( (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1545:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1545:1: (this_TipoDefinido_0= ruleTipoDefinido | this_TipoExistente_1= ruleTipoExistente )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=90 && LA41_0<=94)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1546:5: this_TipoDefinido_0= ruleTipoDefinido
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoDefinidoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_ruleTipo3643);
                    this_TipoDefinido_0=ruleTipoDefinido();

                    state._fsp--;

                     
                            current = this_TipoDefinido_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1556:5: this_TipoExistente_1= ruleTipoExistente
                    {
                     
                            newCompositeNode(grammarAccess.getTipoAccess().getTipoExistenteParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_ruleTipo3670);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1572:1: entryRuleTipoDefinido returns [EObject current=null] : iv_ruleTipoDefinido= ruleTipoDefinido EOF ;
    public final EObject entryRuleTipoDefinido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoDefinido = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1573:2: (iv_ruleTipoDefinido= ruleTipoDefinido EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1574:2: iv_ruleTipoDefinido= ruleTipoDefinido EOF
            {
             newCompositeNode(grammarAccess.getTipoDefinidoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3705);
            iv_ruleTipoDefinido=ruleTipoDefinido();

            state._fsp--;

             current =iv_ruleTipoDefinido; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoDefinido3715); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1581:1: ruleTipoDefinido returns [EObject current=null] : ( (lv_tipo_0_0= ruleEString ) ) ;
    public final EObject ruleTipoDefinido() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1584:28: ( ( (lv_tipo_0_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1585:1: ( (lv_tipo_0_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1585:1: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1586:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1586:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1587:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTipoDefinidoAccess().getTipoEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTipoDefinido3760);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1611:1: entryRuleTipoExistente returns [EObject current=null] : iv_ruleTipoExistente= ruleTipoExistente EOF ;
    public final EObject entryRuleTipoExistente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoExistente = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1612:2: (iv_ruleTipoExistente= ruleTipoExistente EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1613:2: iv_ruleTipoExistente= ruleTipoExistente EOF
            {
             newCompositeNode(grammarAccess.getTipoExistenteRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3795);
            iv_ruleTipoExistente=ruleTipoExistente();

            state._fsp--;

             current =iv_ruleTipoExistente; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoExistente3805); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1620:1: ruleTipoExistente returns [EObject current=null] : ( (lv_tipo_0_0= ruleTipoVariable ) ) ;
    public final EObject ruleTipoExistente() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tipo_0_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1623:28: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1624:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1624:1: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1625:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1625:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1626:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getTipoExistenteAccess().getTipoTipoVariableParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleTipoExistente3850);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1650:1: entryRuleConstantes returns [EObject current=null] : iv_ruleConstantes= ruleConstantes EOF ;
    public final EObject entryRuleConstantes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantes = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1651:2: (iv_ruleConstantes= ruleConstantes EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1652:2: iv_ruleConstantes= ruleConstantes EOF
            {
             newCompositeNode(grammarAccess.getConstantesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantes_in_entryRuleConstantes3885);
            iv_ruleConstantes=ruleConstantes();

            state._fsp--;

             current =iv_ruleConstantes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantes3895); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1659:1: ruleConstantes returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) ;
    public final EObject ruleConstantes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valor_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1662:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1663:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1663:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1663:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_valor_2_0= rulePrimaria ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1663:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1664:1: (lv_variable_0_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1664:1: (lv_variable_0_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1665:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleConstantes3941);
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleConstantes3953); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantesAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1685:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1686:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1686:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1687:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getConstantesAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleConstantes3974);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1711:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1712:2: (iv_ruleVector= ruleVector EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1713:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVector_in_entryRuleVector4010);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVector4020); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1720:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1723:28: ( (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1724:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1724:1: (otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1724:3: otherlv_0= 'vector' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= ']' otherlv_4= 'of' ( (lv_tipo_5_0= ruleTipo ) ) otherlv_6= ': ' ( (lv_nombre_7_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleVector4057); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVectorKeyword_0());
                
            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVector4069); 

                	newLeafNode(otherlv_1, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1732:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1733:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1733:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1734:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleVector4090);
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

            otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVector4102); 

                	newLeafNode(otherlv_3, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleVector4114); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getOfKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1758:1: ( (lv_tipo_5_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1759:1: (lv_tipo_5_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1759:1: (lv_tipo_5_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1760:3: lv_tipo_5_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTipoTipoParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleVector4135);
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

            otherlv_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleVector4147); 

                	newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getColonSpaceKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1780:1: ( (lv_nombre_7_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1781:1: (lv_nombre_7_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1781:1: (lv_nombre_7_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1782:3: lv_nombre_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getNombreEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVector4168);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1806:1: entryRuleMatriz returns [EObject current=null] : iv_ruleMatriz= ruleMatriz EOF ;
    public final EObject entryRuleMatriz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatriz = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1807:2: (iv_ruleMatriz= ruleMatriz EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1808:2: iv_ruleMatriz= ruleMatriz EOF
            {
             newCompositeNode(grammarAccess.getMatrizRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMatriz_in_entryRuleMatriz4204);
            iv_ruleMatriz=ruleMatriz();

            state._fsp--;

             current =iv_ruleMatriz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMatriz4214); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1815:1: ruleMatriz returns [EObject current=null] : (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1818:28: ( (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1819:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1819:1: (otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1819:3: otherlv_0= 'matrix' otherlv_1= '[' ( (lv_valor_2_0= rulePrimaria ) ) otherlv_3= '][' ( (lv_valor_4_0= rulePrimaria ) ) otherlv_5= ']' otherlv_6= 'of' ( (lv_tipo_7_0= ruleTipo ) ) otherlv_8= ': ' ( (lv_nombre_9_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleMatriz4251); 

                	newLeafNode(otherlv_0, grammarAccess.getMatrizAccess().getMatrixKeyword_0());
                
            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleMatriz4263); 

                	newLeafNode(otherlv_1, grammarAccess.getMatrizAccess().getLeftSquareBracketKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1827:1: ( (lv_valor_2_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1828:1: (lv_valor_2_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1828:1: (lv_valor_2_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1829:3: lv_valor_2_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4284);
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

            otherlv_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleMatriz4296); 

                	newLeafNode(otherlv_3, grammarAccess.getMatrizAccess().getRightSquareBracketLeftSquareBracketKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1849:1: ( (lv_valor_4_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1850:1: (lv_valor_4_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1850:1: (lv_valor_4_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1851:3: lv_valor_4_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getValorPrimariaParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMatriz4317);
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

            otherlv_5=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleMatriz4329); 

                	newLeafNode(otherlv_5, grammarAccess.getMatrizAccess().getRightSquareBracketKeyword_5());
                
            otherlv_6=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleMatriz4341); 

                	newLeafNode(otherlv_6, grammarAccess.getMatrizAccess().getOfKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1875:1: ( (lv_tipo_7_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1876:1: (lv_tipo_7_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1876:1: (lv_tipo_7_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1877:3: lv_tipo_7_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getTipoTipoParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleMatriz4362);
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

            otherlv_8=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleMatriz4374); 

                	newLeafNode(otherlv_8, grammarAccess.getMatrizAccess().getColonSpaceKeyword_8());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1897:1: ( (lv_nombre_9_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1898:1: (lv_nombre_9_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1898:1: (lv_nombre_9_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1899:3: lv_nombre_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMatrizAccess().getNombreEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMatriz4395);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1923:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1924:2: (iv_ruleRegistro= ruleRegistro EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1925:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegistro_in_entryRuleRegistro4431);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegistro4441); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1932:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'end_registry' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_variable_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1935:28: ( (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'end_registry' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1936:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'end_registry' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1936:1: (otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'end_registry' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1936:3: otherlv_0= 'registry:' ( (lv_nombre_1_0= ruleEString ) ) ( (lv_variable_2_0= ruleDeclaracion ) )+ otherlv_3= 'end_registry'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRegistro4478); 

                	newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistryKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1940:1: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1941:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1941:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1942:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRegistroAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRegistro4499);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1958:2: ( (lv_variable_2_0= ruleDeclaracion ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==RULE_STRING||(LA42_0>=90 && LA42_0<=94)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1959:1: (lv_variable_2_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1959:1: (lv_variable_2_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1960:3: lv_variable_2_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegistroAccess().getVariableDeclaracionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleRegistro4520);
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
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_3=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleRegistro4533); 

                	newLeafNode(otherlv_3, grammarAccess.getRegistroAccess().getEnd_registryKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1988:1: entryRuleArchivo returns [EObject current=null] : iv_ruleArchivo= ruleArchivo EOF ;
    public final EObject entryRuleArchivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchivo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1989:2: (iv_ruleArchivo= ruleArchivo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1990:2: iv_ruleArchivo= ruleArchivo EOF
            {
             newCompositeNode(grammarAccess.getArchivoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArchivo_in_entryRuleArchivo4569);
            iv_ruleArchivo=ruleArchivo();

            state._fsp--;

             current =iv_ruleArchivo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArchivo4579); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1997:1: ruleArchivo returns [EObject current=null] : (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) ;
    public final EObject ruleArchivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_tipo_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2000:28: ( (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2001:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2001:1: (otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2001:3: otherlv_0= 'archive of ' ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_nombre_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleArchivo4616); 

                	newLeafNode(otherlv_0, grammarAccess.getArchivoAccess().getArchiveOfKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2005:1: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2006:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2006:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2007:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleArchivo4637);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleArchivo4649); 

                	newLeafNode(otherlv_2, grammarAccess.getArchivoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2027:1: ( (lv_nombre_3_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2028:1: (lv_nombre_3_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2028:1: (lv_nombre_3_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2029:3: lv_nombre_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArchivoAccess().getNombreEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArchivo4670);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2053:1: entryRuleEnumerado returns [EObject current=null] : iv_ruleEnumerado= ruleEnumerado EOF ;
    public final EObject entryRuleEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2054:2: (iv_ruleEnumerado= ruleEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2055:2: iv_ruleEnumerado= ruleEnumerado EOF
            {
             newCompositeNode(grammarAccess.getEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumerado_in_entryRuleEnumerado4706);
            iv_ruleEnumerado=ruleEnumerado();

            state._fsp--;

             current =iv_ruleEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerado4716); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2062:1: ruleEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2065:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* ) otherlv_6= '}'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2066:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2067:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2067:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2068:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumerado4762);
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleEnumerado4774); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumeradoAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEnumerado4786); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumeradoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2092:1: ( ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2092:2: ( (lv_valor_3_0= rulePrimaria ) ) (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2092:2: ( (lv_valor_3_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2093:1: (lv_valor_3_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2093:1: (lv_valor_3_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2094:3: lv_valor_3_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado4808);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2110:2: (otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==29) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2110:4: otherlv_4= ',' ( (lv_valor_5_0= rulePrimaria ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumerado4821); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumeradoAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2114:1: ( (lv_valor_5_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2115:1: (lv_valor_5_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2115:1: (lv_valor_5_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2116:3: lv_valor_5_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumeradoAccess().getValorPrimariaParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEnumerado4842);
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
            	    break loop43;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleEnumerado4857); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2144:1: entryRuleSubrango returns [EObject current=null] : iv_ruleSubrango= ruleSubrango EOF ;
    public final EObject entryRuleSubrango() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrango = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2145:2: (iv_ruleSubrango= ruleSubrango EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2146:2: iv_ruleSubrango= ruleSubrango EOF
            {
             newCompositeNode(grammarAccess.getSubrangoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrango_in_entryRuleSubrango4893);
            iv_ruleSubrango=ruleSubrango();

            state._fsp--;

             current =iv_ruleSubrango; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrango4903); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2153:1: ruleSubrango returns [EObject current=null] : (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) ;
    public final EObject ruleSubrango() throws RecognitionException {
        EObject current = null;

        EObject this_SubrangoNumerico_0 = null;

        EObject this_SubrangoEnumerado_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2156:28: ( (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2157:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2157:1: (this_SubrangoNumerico_0= ruleSubrangoNumerico | this_SubrangoEnumerado_1= ruleSubrangoEnumerado )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==51) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==RULE_INT) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==RULE_ID||LA44_3==RULE_STRING) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA44_0==RULE_ID) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==51) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==RULE_INT) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==RULE_ID||LA44_3==RULE_STRING) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2158:5: this_SubrangoNumerico_0= ruleSubrangoNumerico
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoNumericoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4950);
                    this_SubrangoNumerico_0=ruleSubrangoNumerico();

                    state._fsp--;

                     
                            current = this_SubrangoNumerico_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2168:5: this_SubrangoEnumerado_1= ruleSubrangoEnumerado
                    {
                     
                            newCompositeNode(grammarAccess.getSubrangoAccess().getSubrangoEnumeradoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango4977);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2184:1: entryRuleSubrangoNumerico returns [EObject current=null] : iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF ;
    public final EObject entryRuleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoNumerico = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2185:2: (iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2186:2: iv_ruleSubrangoNumerico= ruleSubrangoNumerico EOF
            {
             newCompositeNode(grammarAccess.getSubrangoNumericoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5012);
            iv_ruleSubrangoNumerico=ruleSubrangoNumerico();

            state._fsp--;

             current =iv_ruleSubrangoNumerico; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoNumerico5022); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2193:1: ruleSubrangoNumerico returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) ;
    public final EObject ruleSubrangoNumerico() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2196:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2197:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2197:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2197:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2197:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2198:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2198:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2199:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoNumerico5068);
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangoNumerico5080); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoNumericoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2219:1: ( ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2219:2: ( (lv_limite_inf_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEInt ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2219:2: ( (lv_limite_inf_2_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2220:1: (lv_limite_inf_2_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2220:1: (lv_limite_inf_2_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2221:3: lv_limite_inf_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_infEIntParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5102);
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

            otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleSubrangoNumerico5114); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoNumericoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2241:1: ( (lv_limite_sup_4_0= ruleEInt ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2242:1: (lv_limite_sup_4_0= ruleEInt )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2242:1: (lv_limite_sup_4_0= ruleEInt )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2243:3: lv_limite_sup_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoNumericoAccess().getLimite_supEIntParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubrangoNumerico5135);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2267:1: entryRuleSubrangoEnumerado returns [EObject current=null] : iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF ;
    public final EObject entryRuleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangoEnumerado = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2268:2: (iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2269:2: iv_ruleSubrangoEnumerado= ruleSubrangoEnumerado EOF
            {
             newCompositeNode(grammarAccess.getSubrangoEnumeradoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5172);
            iv_ruleSubrangoEnumerado=ruleSubrangoEnumerado();

            state._fsp--;

             current =iv_ruleSubrangoEnumerado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangoEnumerado5182); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2276:1: ruleSubrangoEnumerado returns [EObject current=null] : ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSubrangoEnumerado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_nombre_0_0 = null;

        AntlrDatatypeRuleToken lv_limite_inf_2_0 = null;

        AntlrDatatypeRuleToken lv_limite_sup_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2279:28: ( ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2280:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2280:1: ( ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2280:2: ( (lv_nombre_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2280:2: ( (lv_nombre_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2281:1: (lv_nombre_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2281:1: (lv_nombre_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2282:3: lv_nombre_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getNombreEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5228);
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangoEnumerado5240); 

                	newLeafNode(otherlv_1, grammarAccess.getSubrangoEnumeradoAccess().getEqualsSignKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2302:1: ( ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2302:2: ( (lv_limite_inf_2_0= ruleEString ) ) otherlv_3= '..' ( (lv_limite_sup_4_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2302:2: ( (lv_limite_inf_2_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2303:1: (lv_limite_inf_2_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2303:1: (lv_limite_inf_2_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2304:3: lv_limite_inf_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_infEStringParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5262);
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

            otherlv_3=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleSubrangoEnumerado5274); 

                	newLeafNode(otherlv_3, grammarAccess.getSubrangoEnumeradoAccess().getFullStopFullStopKeyword_2_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2324:1: ( (lv_limite_sup_4_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2325:1: (lv_limite_sup_4_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2325:1: (lv_limite_sup_4_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2326:3: lv_limite_sup_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSubrangoEnumeradoAccess().getLimite_supEStringParserRuleCall_2_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSubrangoEnumerado5295);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2350:1: entryRuleInicio returns [EObject current=null] : iv_ruleInicio= ruleInicio EOF ;
    public final EObject entryRuleInicio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInicio = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2351:2: (iv_ruleInicio= ruleInicio EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2352:2: iv_ruleInicio= ruleInicio EOF
            {
             newCompositeNode(grammarAccess.getInicioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInicio_in_entryRuleInicio5332);
            iv_ruleInicio=ruleInicio();

            state._fsp--;

             current =iv_ruleInicio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInicio5342); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2359:1: ruleInicio returns [EObject current=null] : (otherlv_0= 'main' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'initiation' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'end_main' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2362:28: ( (otherlv_0= 'main' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'initiation' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'end_main' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2363:1: (otherlv_0= 'main' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'initiation' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'end_main' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2363:1: (otherlv_0= 'main' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'initiation' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'end_main' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2363:3: otherlv_0= 'main' () otherlv_2= 'var' ( (lv_declaracion_3_0= ruleDeclaracion ) )* otherlv_4= 'initiation' ( (lv_tiene_5_0= ruleSentencias ) )* otherlv_6= 'end_main'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleInicio5379); 

                	newLeafNode(otherlv_0, grammarAccess.getInicioAccess().getMainKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2367:1: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInicioAccess().getInicioAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInicio5400); 

                	newLeafNode(otherlv_2, grammarAccess.getInicioAccess().getVarKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2377:1: ( (lv_declaracion_3_0= ruleDeclaracion ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID||LA45_0==RULE_STRING||(LA45_0>=90 && LA45_0<=94)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2378:1: (lv_declaracion_3_0= ruleDeclaracion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2378:1: (lv_declaracion_3_0= ruleDeclaracion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2379:3: lv_declaracion_3_0= ruleDeclaracion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getDeclaracionDeclaracionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleInicio5421);
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
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleInicio5434); 

                	newLeafNode(otherlv_4, grammarAccess.getInicioAccess().getInitiationKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2399:1: ( (lv_tiene_5_0= ruleSentencias ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_NOMBRE_FUN)||LA46_0==RULE_STRING||LA46_0==32||LA46_0==34||(LA46_0>=37 && LA46_0<=45)||(LA46_0>=69 && LA46_0<=72)||(LA46_0>=75 && LA46_0<=76)||LA46_0==79||LA46_0==82||(LA46_0>=86 && LA46_0<=87)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2400:1: (lv_tiene_5_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2400:1: (lv_tiene_5_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2401:3: lv_tiene_5_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInicioAccess().getTieneSentenciasParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleInicio5455);
            	    lv_tiene_5_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInicioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tiene",
            	            		lv_tiene_5_0, 
            	            		"Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_6=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleInicio5468); 

                	newLeafNode(otherlv_6, grammarAccess.getInicioAccess().getEnd_mainKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2429:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2430:2: (iv_ruleEString= ruleEString EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2431:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5505);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5516); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2438:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2441:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2442:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2442:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2442:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5556); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2450:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5582); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2465:1: entryRuleDeclaracionVariable returns [EObject current=null] : iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF ;
    public final EObject entryRuleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2466:2: (iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2467:2: iv_ruleDeclaracionVariable= ruleDeclaracionVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5627);
            iv_ruleDeclaracionVariable=ruleDeclaracionVariable();

            state._fsp--;

             current =iv_ruleDeclaracionVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionVariable5637); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2474:1: ruleDeclaracionVariable returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2477:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2478:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2478:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2478:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2478:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2479:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2479:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2480:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5683);
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

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleDeclaracionVariable5695); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionVariableAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2500:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2501:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2501:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2502:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5716);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2518:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==29) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2518:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionVariable5729); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionVariableAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2522:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2523:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2523:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2524:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionVariableAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionVariable5750);
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
    // $ANTLR end "ruleDeclaracionVariable"


    // $ANTLR start "entryRuleDeclaracionPropia"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2548:1: entryRuleDeclaracionPropia returns [EObject current=null] : iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF ;
    public final EObject entryRuleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracionPropia = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2549:2: (iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2550:2: iv_ruleDeclaracionPropia= ruleDeclaracionPropia EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionPropiaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5788);
            iv_ruleDeclaracionPropia=ruleDeclaracionPropia();

            state._fsp--;

             current =iv_ruleDeclaracionPropia; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaracionPropia5798); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2557:1: ruleDeclaracionPropia returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) ;
    public final EObject ruleDeclaracionPropia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2560:28: ( ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2561:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2561:1: ( ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2561:2: ( (lv_tipo_0_0= ruleEString ) ) otherlv_1= ': ' ( (lv_variable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2561:2: ( (lv_tipo_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2562:1: (lv_tipo_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2562:1: (lv_tipo_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2563:3: lv_tipo_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getTipoEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDeclaracionPropia5844);
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

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleDeclaracionPropia5856); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaracionPropiaAccess().getColonSpaceKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2583:1: ( (lv_variable_2_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2584:1: (lv_variable_2_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2584:1: (lv_variable_2_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2585:3: lv_variable_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5877);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2601:2: (otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==29) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2601:4: otherlv_3= ',' ( (lv_variable_4_0= ruleVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDeclaracionPropia5890); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeclaracionPropiaAccess().getCommaKeyword_3_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2605:1: ( (lv_variable_4_0= ruleVariable ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2606:1: (lv_variable_4_0= ruleVariable )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2606:1: (lv_variable_4_0= ruleVariable )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2607:3: lv_variable_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclaracionPropiaAccess().getVariableVariableParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleDeclaracionPropia5911);
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
            	    break loop49;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2631:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2632:2: (iv_ruleAsignacion= ruleAsignacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2633:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacion_in_entryRuleAsignacion5949);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacion5959); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2640:1: ruleAsignacion returns [EObject current=null] : (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject this_AsignacionNormal_0 = null;

        EObject this_AsignacionCompleja_1 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2643:28: ( (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2644:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2644:1: (this_AsignacionNormal_0= ruleAsignacionNormal | this_AsignacionCompleja_1= ruleAsignacionCompleja )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==46||LA50_1==53) ) {
                    alt50=2;
                }
                else if ( (LA50_1==68) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==RULE_ID) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==46||LA50_2==53) ) {
                    alt50=2;
                }
                else if ( (LA50_2==68) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2645:5: this_AsignacionNormal_0= ruleAsignacionNormal
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionNormalParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6006);
                    this_AsignacionNormal_0=ruleAsignacionNormal();

                    state._fsp--;

                     
                            current = this_AsignacionNormal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2655:5: this_AsignacionCompleja_1= ruleAsignacionCompleja
                    {
                     
                            newCompositeNode(grammarAccess.getAsignacionAccess().getAsignacionComplejaParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6033);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2671:1: entryRuleAsignacionNormal returns [EObject current=null] : iv_ruleAsignacionNormal= ruleAsignacionNormal EOF ;
    public final EObject entryRuleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionNormal = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2672:2: (iv_ruleAsignacionNormal= ruleAsignacionNormal EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2673:2: iv_ruleAsignacionNormal= ruleAsignacionNormal EOF
            {
             newCompositeNode(grammarAccess.getAsignacionNormalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6068);
            iv_ruleAsignacionNormal=ruleAsignacionNormal();

            state._fsp--;

             current =iv_ruleAsignacionNormal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionNormal6078); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2680:1: ruleAsignacionNormal returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionNormal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2683:28: ( ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2684:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2684:1: ( ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2684:2: ( (lv_valor_asignacion_0_0= ruleEString ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2684:2: ( (lv_valor_asignacion_0_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2685:1: (lv_valor_asignacion_0_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2685:1: (lv_valor_asignacion_0_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2686:3: lv_valor_asignacion_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getValor_asignacionEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsignacionNormal6124);
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

            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAsignacionNormal6136); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionNormalAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2706:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2707:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2707:1: (lv_operador_2_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2708:3: lv_operador_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionNormalAccess().getOperadorOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_ruleAsignacionNormal6157);
            lv_operador_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionNormalRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"OperacionCompleta");
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2732:1: entryRuleAsignacionCompleja returns [EObject current=null] : iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF ;
    public final EObject entryRuleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionCompleja = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2733:2: (iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2734:2: iv_ruleAsignacionCompleja= ruleAsignacionCompleja EOF
            {
             newCompositeNode(grammarAccess.getAsignacionComplejaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6193);
            iv_ruleAsignacionCompleja=ruleAsignacionCompleja();

            state._fsp--;

             current =iv_ruleAsignacionCompleja; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsignacionCompleja6203); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2741:1: ruleAsignacionCompleja returns [EObject current=null] : ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleAsignacionCompleja() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_valor_asignacion_0_0 = null;

        EObject lv_operador_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2744:28: ( ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2745:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2745:1: ( ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2745:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) ) otherlv_1= '<-' ( (lv_operador_2_0= ruleOperacionCompleta ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2745:2: ( (lv_valor_asignacion_0_0= ruleVariablesComplejas ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2746:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2746:1: (lv_valor_asignacion_0_0= ruleVariablesComplejas )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2747:3: lv_valor_asignacion_0_0= ruleVariablesComplejas
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getValor_asignacionVariablesComplejasParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6249);
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

            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAsignacionCompleja6261); 

                	newLeafNode(otherlv_1, grammarAccess.getAsignacionComplejaAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2767:1: ( (lv_operador_2_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2768:1: (lv_operador_2_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2768:1: (lv_operador_2_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2769:3: lv_operador_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getAsignacionComplejaAccess().getOperadorOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_ruleAsignacionCompleja6282);
            lv_operador_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsignacionComplejaRule());
            	        }
                   		set(
                   			current, 
                   			"operador",
                    		lv_operador_2_0, 
                    		"OperacionCompleta");
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2793:1: entryRuleEscribir returns [EObject current=null] : iv_ruleEscribir= ruleEscribir EOF ;
    public final EObject entryRuleEscribir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscribir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2794:2: (iv_ruleEscribir= ruleEscribir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2795:2: iv_ruleEscribir= ruleEscribir EOF
            {
             newCompositeNode(grammarAccess.getEscribirRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEscribir_in_entryRuleEscribir6318);
            iv_ruleEscribir=ruleEscribir();

            state._fsp--;

             current =iv_ruleEscribir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEscribir6328); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2802:1: ruleEscribir returns [EObject current=null] : (otherlv_0= 'write(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2805:28: ( (otherlv_0= 'write(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2806:1: (otherlv_0= 'write(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2806:1: (otherlv_0= 'write(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2806:3: otherlv_0= 'write(' ( (lv_operador_1_0= rulePrimaria ) ) ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleEscribir6365); 

                	newLeafNode(otherlv_0, grammarAccess.getEscribirAccess().getWriteKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2810:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2811:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2811:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2812:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6386);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2828:2: ( (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) ) | ( (lv_operador_4_0= ruleoperacion ) ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==29) ) {
                    alt51=1;
                }
                else if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_CAR)||LA51_0==33||(LA51_0>=37 && LA51_0<=45)||(LA51_0>=114 && LA51_0<=115)) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2828:3: (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2828:3: (otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2828:5: otherlv_2= ',' ( (lv_operador_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEscribir6400); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEscribirAccess().getCommaKeyword_2_0_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2832:1: ( (lv_operador_3_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2833:1: (lv_operador_3_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2833:1: (lv_operador_3_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2834:3: lv_operador_3_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorPrimariaParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleEscribir6421);
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
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2851:6: ( (lv_operador_4_0= ruleoperacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2851:6: ( (lv_operador_4_0= ruleoperacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2852:1: (lv_operador_4_0= ruleoperacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2852:1: (lv_operador_4_0= ruleoperacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2853:3: lv_operador_4_0= ruleoperacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEscribirAccess().getOperadorOperacionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleEscribir6449);
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
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEscribir6463); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2881:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2882:2: (iv_ruleLeer= ruleLeer EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2883:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLeer_in_entryRuleLeer6499);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLeer6509); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2890:1: ruleLeer returns [EObject current=null] : (otherlv_0= 'read(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2893:28: ( (otherlv_0= 'read(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2894:1: (otherlv_0= 'read(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2894:1: (otherlv_0= 'read(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2894:3: otherlv_0= 'read(' ( (lv_variable_1_0= rulePrimaria ) ) (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleLeer6546); 

                	newLeafNode(otherlv_0, grammarAccess.getLeerAccess().getReadKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2898:1: ( (lv_variable_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2899:1: (lv_variable_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2899:1: (lv_variable_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2900:3: lv_variable_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer6567);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2916:2: (otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==29) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2916:4: otherlv_2= ',' ( (lv_variable_3_0= rulePrimaria ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLeer6580); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLeerAccess().getCommaKeyword_2_0());
            	        
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2920:1: ( (lv_variable_3_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2921:1: (lv_variable_3_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2921:1: (lv_variable_3_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2922:3: lv_variable_3_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeerAccess().getVariablePrimariaParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleLeer6601);
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
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLeer6615); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2950:1: entryRuleSi returns [EObject current=null] : iv_ruleSi= ruleSi EOF ;
    public final EObject entryRuleSi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSi = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2951:2: (iv_ruleSi= ruleSi EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2952:2: iv_ruleSi= ruleSi EOF
            {
             newCompositeNode(grammarAccess.getSiRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSi_in_entryRuleSi6651);
            iv_ruleSi=ruleSi();

            state._fsp--;

             current =iv_ruleSi; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSi6661); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2959:1: ruleSi returns [EObject current=null] : ( ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'then' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'end_if' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2962:28: ( ( ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'then' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'end_if' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:1: ( ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'then' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'end_if' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:1: ( ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'then' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'end_if' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:2: ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'then' ( (lv_sentencias_6_0= ruleSentencias ) )* ( (lv_devuelve_7_0= ruleDevolver ) )? ( (lv_sino_8_0= ruleSino ) )? otherlv_9= 'end_if'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:2: ( (otherlv_0= 'if' otherlv_1= '(' ) | otherlv_2= 'if(' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==71) ) {
                alt53=1;
            }
            else if ( (LA53_0==72) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:3: (otherlv_0= 'if' otherlv_1= '(' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:3: (otherlv_0= 'if' otherlv_1= '(' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2963:5: otherlv_0= 'if' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleSi6700); 

                        	newLeafNode(otherlv_0, grammarAccess.getSiAccess().getIfKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSi6712); 

                        	newLeafNode(otherlv_1, grammarAccess.getSiAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2972:7: otherlv_2= 'if('
                    {
                    otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleSi6731); 

                        	newLeafNode(otherlv_2, grammarAccess.getSiAccess().getIfKeyword_0_1());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2976:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2977:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2977:1: (lv_valor_3_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:2978:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSiAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_ruleSi6753);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSi6765); 

                	newLeafNode(otherlv_4, grammarAccess.getSiAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleSi6777); 

                	newLeafNode(otherlv_5, grammarAccess.getSiAccess().getThenKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3002:1: ( (lv_sentencias_6_0= ruleSentencias ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_NOMBRE_FUN)||LA54_0==RULE_STRING||LA54_0==32||LA54_0==34||(LA54_0>=37 && LA54_0<=45)||(LA54_0>=69 && LA54_0<=72)||(LA54_0>=75 && LA54_0<=76)||LA54_0==79||LA54_0==82||(LA54_0>=86 && LA54_0<=87)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3003:1: (lv_sentencias_6_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3003:1: (lv_sentencias_6_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3004:3: lv_sentencias_6_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiAccess().getSentenciasSentenciasParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSi6798);
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
            	    break loop54;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3020:3: ( (lv_devuelve_7_0= ruleDevolver ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==108) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3021:1: (lv_devuelve_7_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3021:1: (lv_devuelve_7_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3022:3: lv_devuelve_7_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getDevuelveDevolverParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSi6820);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3038:3: ( (lv_sino_8_0= ruleSino ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==107) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3039:1: (lv_sino_8_0= ruleSino )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3039:1: (lv_sino_8_0= ruleSino )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3040:3: lv_sino_8_0= ruleSino
                    {
                     
                    	        newCompositeNode(grammarAccess.getSiAccess().getSinoSinoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSino_in_ruleSi6842);
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

            otherlv_9=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleSi6855); 

                	newLeafNode(otherlv_9, grammarAccess.getSiAccess().getEnd_ifKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3068:1: entryRulemientras returns [EObject current=null] : iv_rulemientras= rulemientras EOF ;
    public final EObject entryRulemientras() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemientras = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3069:2: (iv_rulemientras= rulemientras EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3070:2: iv_rulemientras= rulemientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FollowSets000.FOLLOW_rulemientras_in_entryRulemientras6891);
            iv_rulemientras=rulemientras();

            state._fsp--;

             current =iv_rulemientras; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemientras6901); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3077:1: rulemientras returns [EObject current=null] : ( ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'end_while' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3080:28: ( ( ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'end_while' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:1: ( ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'end_while' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:1: ( ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'end_while' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:2: ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_sentencias_6_0= ruleSentencias ) )* otherlv_7= 'end_while'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:2: ( (otherlv_0= 'while' otherlv_1= '(' ) | otherlv_2= 'while(' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==75) ) {
                alt57=1;
            }
            else if ( (LA57_0==76) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:3: (otherlv_0= 'while' otherlv_1= '(' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:3: (otherlv_0= 'while' otherlv_1= '(' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3081:5: otherlv_0= 'while' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_rulemientras6940); 

                        	newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getWhileKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulemientras6952); 

                        	newLeafNode(otherlv_1, grammarAccess.getMientrasAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3090:7: otherlv_2= 'while('
                    {
                    otherlv_2=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulemientras6971); 

                        	newLeafNode(otherlv_2, grammarAccess.getMientrasAccess().getWhileKeyword_0_1());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3094:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3095:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3095:1: (lv_valor_3_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3096:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getMientrasAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_rulemientras6993);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMientrasRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulemientras7005); 

                	newLeafNode(otherlv_4, grammarAccess.getMientrasAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulemientras7017); 

                	newLeafNode(otherlv_5, grammarAccess.getMientrasAccess().getDoKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3120:1: ( (lv_sentencias_6_0= ruleSentencias ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_ID && LA58_0<=RULE_NOMBRE_FUN)||LA58_0==RULE_STRING||LA58_0==32||LA58_0==34||(LA58_0>=37 && LA58_0<=45)||(LA58_0>=69 && LA58_0<=72)||(LA58_0>=75 && LA58_0<=76)||LA58_0==79||LA58_0==82||(LA58_0>=86 && LA58_0<=87)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3121:1: (lv_sentencias_6_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3121:1: (lv_sentencias_6_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3122:3: lv_sentencias_6_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMientrasAccess().getSentenciasSentenciasParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulemientras7038);
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
            	    break loop58;
                }
            } while (true);

            otherlv_7=(Token)match(input,78,FollowSets000.FOLLOW_78_in_rulemientras7051); 

                	newLeafNode(otherlv_7, grammarAccess.getMientrasAccess().getEnd_whileKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3150:1: entryRulerepetir returns [EObject current=null] : iv_rulerepetir= rulerepetir EOF ;
    public final EObject entryRulerepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetir = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3151:2: (iv_rulerepetir= rulerepetir EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3152:2: iv_rulerepetir= rulerepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FollowSets000.FOLLOW_rulerepetir_in_entryRulerepetir7087);
            iv_rulerepetir=rulerepetir();

            state._fsp--;

             current =iv_rulerepetir; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulerepetir7097); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3159:1: rulerepetir returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3162:28: ( (otherlv_0= 'repeat' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3163:1: (otherlv_0= 'repeat' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3163:1: (otherlv_0= 'repeat' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3163:3: otherlv_0= 'repeat' ( (lv_sentencias_1_0= ruleSentencias ) )* ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' ) ( (lv_valor_5_0= ruleOperacionCompleta ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulerepetir7134); 

                	newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepeatKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3167:1: ( (lv_sentencias_1_0= ruleSentencias ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_NOMBRE_FUN)||LA59_0==RULE_STRING||LA59_0==32||LA59_0==34||(LA59_0>=37 && LA59_0<=45)||(LA59_0>=69 && LA59_0<=72)||(LA59_0>=75 && LA59_0<=76)||LA59_0==79||LA59_0==82||(LA59_0>=86 && LA59_0<=87)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3168:1: (lv_sentencias_1_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3168:1: (lv_sentencias_1_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3169:3: lv_sentencias_1_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepetirAccess().getSentenciasSentenciasParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulerepetir7155);
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
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3185:3: ( (otherlv_2= 'until' otherlv_3= '(' ) | otherlv_4= 'until(' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==80) ) {
                alt60=1;
            }
            else if ( (LA60_0==81) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3185:4: (otherlv_2= 'until' otherlv_3= '(' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3185:4: (otherlv_2= 'until' otherlv_3= '(' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3185:6: otherlv_2= 'until' otherlv_3= '('
                    {
                    otherlv_2=(Token)match(input,80,FollowSets000.FOLLOW_80_in_rulerepetir7170); 

                        	newLeafNode(otherlv_2, grammarAccess.getRepetirAccess().getUntilKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulerepetir7182); 

                        	newLeafNode(otherlv_3, grammarAccess.getRepetirAccess().getLeftParenthesisKeyword_2_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3194:7: otherlv_4= 'until('
                    {
                    otherlv_4=(Token)match(input,81,FollowSets000.FOLLOW_81_in_rulerepetir7201); 

                        	newLeafNode(otherlv_4, grammarAccess.getRepetirAccess().getUntilKeyword_2_1());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3198:2: ( (lv_valor_5_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3199:1: (lv_valor_5_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3199:1: (lv_valor_5_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3200:3: lv_valor_5_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getRepetirAccess().getValorOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_rulerepetir7223);
            lv_valor_5_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepetirRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_5_0, 
                    		"OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulerepetir7235); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3228:1: entryRuledesde returns [EObject current=null] : iv_ruledesde= ruledesde EOF ;
    public final EObject entryRuledesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledesde = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3229:2: (iv_ruledesde= ruledesde EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3230:2: iv_ruledesde= ruledesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruledesde_in_entryRuledesde7271);
            iv_ruledesde=ruledesde();

            state._fsp--;

             current =iv_ruledesde; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledesde7281); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3237:1: ruledesde returns [EObject current=null] : (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'do' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'end_for' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3240:28: ( (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'do' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'end_for' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3241:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'do' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'end_for' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3241:1: (otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'do' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'end_for' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3241:3: otherlv_0= 'for' ( (lv_asignacion_1_0= ruleAsignacionNormal ) ) otherlv_2= 'to' ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= 'do' ( (lv_sentencias_5_0= ruleSentencias ) )* otherlv_6= 'end_for'
            {
            otherlv_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruledesde7318); 

                	newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getForKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3245:1: ( (lv_asignacion_1_0= ruleAsignacionNormal ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3246:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3246:1: (lv_asignacion_1_0= ruleAsignacionNormal )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3247:3: lv_asignacion_1_0= ruleAsignacionNormal
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getAsignacionAsignacionNormalParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsignacionNormal_in_ruledesde7339);
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

            otherlv_2=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruledesde7351); 

                	newLeafNode(otherlv_2, grammarAccess.getDesdeAccess().getToKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3267:1: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3268:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3268:1: (lv_valor_3_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3269:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getDesdeAccess().getValorOperacionCompletaParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_ruledesde7372);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDesdeRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruledesde7384); 

                	newLeafNode(otherlv_4, grammarAccess.getDesdeAccess().getDoKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3289:1: ( (lv_sentencias_5_0= ruleSentencias ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_ID && LA61_0<=RULE_NOMBRE_FUN)||LA61_0==RULE_STRING||LA61_0==32||LA61_0==34||(LA61_0>=37 && LA61_0<=45)||(LA61_0>=69 && LA61_0<=72)||(LA61_0>=75 && LA61_0<=76)||LA61_0==79||LA61_0==82||(LA61_0>=86 && LA61_0<=87)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3290:1: (lv_sentencias_5_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3290:1: (lv_sentencias_5_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3291:3: lv_sentencias_5_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesdeAccess().getSentenciasSentenciasParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruledesde7405);
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
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruledesde7418); 

                	newLeafNode(otherlv_6, grammarAccess.getDesdeAccess().getEnd_forKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3319:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3320:2: (iv_ruleCaso= ruleCaso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3321:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCaso_in_entryRuleCaso7454);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCaso7464); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3328:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_operador_1_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3331:28: ( (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3332:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3332:1: (otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3332:3: otherlv_0= 'case' ( (lv_operador_1_0= rulePrimaria ) ) otherlv_2= ': ' ( (lv_sentencias_3_0= ruleSentencias ) )* ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleCaso7501); 

                	newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCaseKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3336:1: ( (lv_operador_1_0= rulePrimaria ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3337:1: (lv_operador_1_0= rulePrimaria )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3337:1: (lv_operador_1_0= rulePrimaria )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3338:3: lv_operador_1_0= rulePrimaria
            {
             
            	        newCompositeNode(grammarAccess.getCasoAccess().getOperadorPrimariaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleCaso7522);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCaso7534); 

                	newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3358:1: ( (lv_sentencias_3_0= ruleSentencias ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_NOMBRE_FUN)||LA62_0==RULE_STRING||LA62_0==32||LA62_0==34||(LA62_0>=37 && LA62_0<=45)||(LA62_0>=69 && LA62_0<=72)||(LA62_0>=75 && LA62_0<=76)||LA62_0==79||LA62_0==82||(LA62_0>=86 && LA62_0<=87)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3359:1: (lv_sentencias_3_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3359:1: (lv_sentencias_3_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3360:3: lv_sentencias_3_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciasParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleCaso7555);
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
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3376:3: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==108) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3377:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3377:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3378:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getCasoAccess().getDevuelveDevolverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleCaso7577);
                    lv_devuelve_4_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCasoRule());
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
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRulesegun"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3402:1: entryRulesegun returns [EObject current=null] : iv_rulesegun= rulesegun EOF ;
    public final EObject entryRulesegun() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesegun = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3403:2: (iv_rulesegun= rulesegun EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3404:2: iv_rulesegun= rulesegun EOF
            {
             newCompositeNode(grammarAccess.getSegunRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesegun_in_entryRulesegun7614);
            iv_rulesegun=rulesegun();

            state._fsp--;

             current =iv_rulesegun; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesegun7624); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3411:1: rulesegun returns [EObject current=null] : ( ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'otherwise:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'end_according_to' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3414:28: ( ( ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'otherwise:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'end_according_to' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:1: ( ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'otherwise:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'end_according_to' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:1: ( ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'otherwise:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'end_according_to' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:2: ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' ) ( (lv_valor_3_0= ruleOperacionCompleta ) ) otherlv_4= ')' otherlv_5= 'do' ( (lv_caso_6_0= ruleCaso ) )* otherlv_7= 'otherwise:' ( (lv_sentencias_8_0= ruleSentencias ) )* ( (lv_devuelve_9_0= ruleDevolver ) )? otherlv_10= 'end_according_to'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:2: ( (otherlv_0= 'according_to' otherlv_1= '(' ) | otherlv_2= 'according_to(' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==86) ) {
                alt64=1;
            }
            else if ( (LA64_0==87) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:3: (otherlv_0= 'according_to' otherlv_1= '(' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:3: (otherlv_0= 'according_to' otherlv_1= '(' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3415:5: otherlv_0= 'according_to' otherlv_1= '('
                    {
                    otherlv_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_rulesegun7663); 

                        	newLeafNode(otherlv_0, grammarAccess.getSegunAccess().getAccording_toKeyword_0_0_0());
                        
                    otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulesegun7675); 

                        	newLeafNode(otherlv_1, grammarAccess.getSegunAccess().getLeftParenthesisKeyword_0_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3424:7: otherlv_2= 'according_to('
                    {
                    otherlv_2=(Token)match(input,87,FollowSets000.FOLLOW_87_in_rulesegun7694); 

                        	newLeafNode(otherlv_2, grammarAccess.getSegunAccess().getAccording_toKeyword_0_1());
                        

                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3428:2: ( (lv_valor_3_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3429:1: (lv_valor_3_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3429:1: (lv_valor_3_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3430:3: lv_valor_3_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getSegunAccess().getValorOperacionCompletaParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_rulesegun7716);
            lv_valor_3_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSegunRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"OperacionCompleta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulesegun7728); 

                	newLeafNode(otherlv_4, grammarAccess.getSegunAccess().getRightParenthesisKeyword_2());
                
            otherlv_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_rulesegun7740); 

                	newLeafNode(otherlv_5, grammarAccess.getSegunAccess().getDoKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3454:1: ( (lv_caso_6_0= ruleCaso ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==85) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3455:1: (lv_caso_6_0= ruleCaso )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3455:1: (lv_caso_6_0= ruleCaso )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3456:3: lv_caso_6_0= ruleCaso
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getCasoCasoParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCaso_in_rulesegun7761);
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
            	    break loop65;
                }
            } while (true);

            otherlv_7=(Token)match(input,88,FollowSets000.FOLLOW_88_in_rulesegun7774); 

                	newLeafNode(otherlv_7, grammarAccess.getSegunAccess().getOtherwiseKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3476:1: ( (lv_sentencias_8_0= ruleSentencias ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_NOMBRE_FUN)||LA66_0==RULE_STRING||LA66_0==32||LA66_0==34||(LA66_0>=37 && LA66_0<=45)||(LA66_0>=69 && LA66_0<=72)||(LA66_0>=75 && LA66_0<=76)||LA66_0==79||LA66_0==82||(LA66_0>=86 && LA66_0<=87)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3477:1: (lv_sentencias_8_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3477:1: (lv_sentencias_8_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3478:3: lv_sentencias_8_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSegunAccess().getSentenciasSentenciasParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_rulesegun7795);
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
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3494:3: ( (lv_devuelve_9_0= ruleDevolver ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==108) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3495:1: (lv_devuelve_9_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3495:1: (lv_devuelve_9_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3496:3: lv_devuelve_9_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSegunAccess().getDevuelveDevolverParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_rulesegun7817);
                    lv_devuelve_9_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSegunRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_9_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,89,FollowSets000.FOLLOW_89_in_rulesegun7830); 

                	newLeafNode(otherlv_10, grammarAccess.getSegunAccess().getEnd_according_toKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3524:1: entryRuleTipoVariable returns [String current=null] : iv_ruleTipoVariable= ruleTipoVariable EOF ;
    public final String entryRuleTipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3525:2: (iv_ruleTipoVariable= ruleTipoVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3526:2: iv_ruleTipoVariable= ruleTipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7867);
            iv_ruleTipoVariable=ruleTipoVariable();

            state._fsp--;

             current =iv_ruleTipoVariable.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoVariable7878); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3533:1: ruleTipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleTipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3536:28: ( (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3537:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3537:1: (kw= 'integer' | kw= 'character' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            int alt68=5;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt68=1;
                }
                break;
            case 91:
                {
                alt68=2;
                }
                break;
            case 92:
                {
                alt68=3;
                }
                break;
            case 93:
                {
                alt68=4;
                }
                break;
            case 94:
                {
                alt68=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3538:2: kw= 'integer'
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleTipoVariable7916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getIntegerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3545:2: kw= 'character'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleTipoVariable7935); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getCharacterKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3552:2: kw= 'real'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleTipoVariable7954); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3559:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleTipoVariable7973); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoVariableAccess().getBooleanKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3566:2: kw= 'string'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleTipoVariable7992); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3579:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3580:2: (iv_ruleVariable= ruleVariable EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3581:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable8032);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable8042); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3588:1: ruleVariable returns [EObject current=null] : ( () ( (lv_nombre_1_0= ruleEString ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3591:28: ( ( () ( (lv_nombre_1_0= ruleEString ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3592:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3592:1: ( () ( (lv_nombre_1_0= ruleEString ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3592:2: () ( (lv_nombre_1_0= ruleEString ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3592:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3593:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVariableAccess().getVariableAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3598:2: ( (lv_nombre_1_0= ruleEString ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3599:1: (lv_nombre_1_0= ruleEString )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3599:1: (lv_nombre_1_0= ruleEString )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3600:3: lv_nombre_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getNombreEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariable8097);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3626:1: entryRulesignoOr returns [String current=null] : iv_rulesignoOr= rulesignoOr EOF ;
    public final String entryRulesignoOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3627:2: (iv_rulesignoOr= rulesignoOr EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3628:2: iv_rulesignoOr= rulesignoOr EOF
            {
             newCompositeNode(grammarAccess.getSignoOrRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_entryRulesignoOr8136);
            iv_rulesignoOr=rulesignoOr();

            state._fsp--;

             current =iv_rulesignoOr.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoOr8147); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3635:1: rulesignoOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken rulesignoOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3638:28: (kw= 'or' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3640:2: kw= 'or'
            {
            kw=(Token)match(input,95,FollowSets000.FOLLOW_95_in_rulesignoOr8184); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3653:1: entryRulesignoAnd returns [String current=null] : iv_rulesignoAnd= rulesignoAnd EOF ;
    public final String entryRulesignoAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3654:2: (iv_rulesignoAnd= rulesignoAnd EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3655:2: iv_rulesignoAnd= rulesignoAnd EOF
            {
             newCompositeNode(grammarAccess.getSignoAndRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_entryRulesignoAnd8224);
            iv_rulesignoAnd=rulesignoAnd();

            state._fsp--;

             current =iv_rulesignoAnd.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoAnd8235); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3662:1: rulesignoAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken rulesignoAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3665:28: (kw= 'and' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3667:2: kw= 'and'
            {
            kw=(Token)match(input,96,FollowSets000.FOLLOW_96_in_rulesignoAnd8272); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3680:1: entryRulesignoIgualdad returns [String current=null] : iv_rulesignoIgualdad= rulesignoIgualdad EOF ;
    public final String entryRulesignoIgualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3681:2: (iv_rulesignoIgualdad= rulesignoIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3682:2: iv_rulesignoIgualdad= rulesignoIgualdad EOF
            {
             newCompositeNode(grammarAccess.getSignoIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8312);
            iv_rulesignoIgualdad=rulesignoIgualdad();

            state._fsp--;

             current =iv_rulesignoIgualdad.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoIgualdad8323); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3689:1: rulesignoIgualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken rulesignoIgualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3692:28: ( (kw= '=' | kw= '!=' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3693:1: (kw= '=' | kw= '!=' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3693:1: (kw= '=' | kw= '!=' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==51) ) {
                alt69=1;
            }
            else if ( (LA69_0==97) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3694:2: kw= '='
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulesignoIgualdad8361); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoIgualdadAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3701:2: kw= '!='
                    {
                    kw=(Token)match(input,97,FollowSets000.FOLLOW_97_in_rulesignoIgualdad8380); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3714:1: entryRulesignoComparacion returns [String current=null] : iv_rulesignoComparacion= rulesignoComparacion EOF ;
    public final String entryRulesignoComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3715:2: (iv_rulesignoComparacion= rulesignoComparacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3716:2: iv_rulesignoComparacion= rulesignoComparacion EOF
            {
             newCompositeNode(grammarAccess.getSignoComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion8421);
            iv_rulesignoComparacion=rulesignoComparacion();

            state._fsp--;

             current =iv_rulesignoComparacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoComparacion8432); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3723:1: rulesignoComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken rulesignoComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3726:28: ( (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3727:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3727:1: (kw= '<' | kw= '>' | kw= '>=' | kw= '<=' )
            int alt70=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt70=1;
                }
                break;
            case 99:
                {
                alt70=2;
                }
                break;
            case 100:
                {
                alt70=3;
                }
                break;
            case 101:
                {
                alt70=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3728:2: kw= '<'
                    {
                    kw=(Token)match(input,98,FollowSets000.FOLLOW_98_in_rulesignoComparacion8470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getLessThanSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3735:2: kw= '>'
                    {
                    kw=(Token)match(input,99,FollowSets000.FOLLOW_99_in_rulesignoComparacion8489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3742:2: kw= '>='
                    {
                    kw=(Token)match(input,100,FollowSets000.FOLLOW_100_in_rulesignoComparacion8508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignoComparacionAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3749:2: kw= '<='
                    {
                    kw=(Token)match(input,101,FollowSets000.FOLLOW_101_in_rulesignoComparacion8527); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3762:1: entryRulesignoSuma returns [String current=null] : iv_rulesignoSuma= rulesignoSuma EOF ;
    public final String entryRulesignoSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoSuma = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3763:2: (iv_rulesignoSuma= rulesignoSuma EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3764:2: iv_rulesignoSuma= rulesignoSuma EOF
            {
             newCompositeNode(grammarAccess.getSignoSumaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_entryRulesignoSuma8568);
            iv_rulesignoSuma=rulesignoSuma();

            state._fsp--;

             current =iv_rulesignoSuma.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoSuma8579); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3771:1: rulesignoSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulesignoSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3774:28: (kw= '+' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3776:2: kw= '+'
            {
            kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulesignoSuma8616); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3789:1: entryRulesignoResta returns [String current=null] : iv_rulesignoResta= rulesignoResta EOF ;
    public final String entryRulesignoResta() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3790:2: (iv_rulesignoResta= rulesignoResta EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3791:2: iv_rulesignoResta= rulesignoResta EOF
            {
             newCompositeNode(grammarAccess.getSignoRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_entryRulesignoResta8656);
            iv_rulesignoResta=rulesignoResta();

            state._fsp--;

             current =iv_rulesignoResta.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoResta8667); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3798:1: rulesignoResta returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulesignoResta() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3801:28: (kw= '-' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3803:2: kw= '-'
            {
            kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulesignoResta8704); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3816:1: entryRulesignoMultiplicacion returns [String current=null] : iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF ;
    public final String entryRulesignoMultiplicacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoMultiplicacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3817:2: (iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3818:2: iv_rulesignoMultiplicacion= rulesignoMultiplicacion EOF
            {
             newCompositeNode(grammarAccess.getSignoMultiplicacionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion8744);
            iv_rulesignoMultiplicacion=rulesignoMultiplicacion();

            state._fsp--;

             current =iv_rulesignoMultiplicacion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoMultiplicacion8755); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3825:1: rulesignoMultiplicacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulesignoMultiplicacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3828:28: (kw= '*' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3830:2: kw= '*'
            {
            kw=(Token)match(input,102,FollowSets000.FOLLOW_102_in_rulesignoMultiplicacion8792); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3843:1: entryRulesignoDivision returns [String current=null] : iv_rulesignoDivision= rulesignoDivision EOF ;
    public final String entryRulesignoDivision() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3844:2: (iv_rulesignoDivision= rulesignoDivision EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3845:2: iv_rulesignoDivision= rulesignoDivision EOF
            {
             newCompositeNode(grammarAccess.getSignoDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_entryRulesignoDivision8832);
            iv_rulesignoDivision=rulesignoDivision();

            state._fsp--;

             current =iv_rulesignoDivision.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDivision8843); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3852:1: rulesignoDivision returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken rulesignoDivision() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3855:28: (kw= '/' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3857:2: kw= '/'
            {
            kw=(Token)match(input,103,FollowSets000.FOLLOW_103_in_rulesignoDivision8880); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3870:1: entryRulesignoModulo returns [String current=null] : iv_rulesignoModulo= rulesignoModulo EOF ;
    public final String entryRulesignoModulo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoModulo = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3871:2: (iv_rulesignoModulo= rulesignoModulo EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3872:2: iv_rulesignoModulo= rulesignoModulo EOF
            {
             newCompositeNode(grammarAccess.getSignoModuloRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_entryRulesignoModulo8920);
            iv_rulesignoModulo=rulesignoModulo();

            state._fsp--;

             current =iv_rulesignoModulo.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoModulo8931); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3879:1: rulesignoModulo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mod' ;
    public final AntlrDatatypeRuleToken rulesignoModulo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3882:28: (kw= 'mod' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3884:2: kw= 'mod'
            {
            kw=(Token)match(input,104,FollowSets000.FOLLOW_104_in_rulesignoModulo8968); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3897:1: entryRulesignoDiv returns [String current=null] : iv_rulesignoDiv= rulesignoDiv EOF ;
    public final String entryRulesignoDiv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignoDiv = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3898:2: (iv_rulesignoDiv= rulesignoDiv EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3899:2: iv_rulesignoDiv= rulesignoDiv EOF
            {
             newCompositeNode(grammarAccess.getSignoDivRule()); 
            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_entryRulesignoDiv9008);
            iv_rulesignoDiv=rulesignoDiv();

            state._fsp--;

             current =iv_rulesignoDiv.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignoDiv9019); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3906:1: rulesignoDiv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'div' ;
    public final AntlrDatatypeRuleToken rulesignoDiv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3909:28: (kw= 'div' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3911:2: kw= 'div'
            {
            kw=(Token)match(input,105,FollowSets000.FOLLOW_105_in_rulesignoDiv9056); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3924:1: entryRuleoperacion returns [EObject current=null] : iv_ruleoperacion= ruleoperacion EOF ;
    public final EObject entryRuleoperacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3925:2: (iv_ruleoperacion= ruleoperacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3926:2: iv_ruleoperacion= ruleoperacion EOF
            {
             newCompositeNode(grammarAccess.getOperacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_entryRuleoperacion9095);
            iv_ruleoperacion=ruleoperacion();

            state._fsp--;

             current =iv_ruleoperacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacion9105); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3933:1: ruleoperacion returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleoperacion() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3936:28: (this_Or_0= ruleOr )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3938:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getOperacionAccess().getOrParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_ruleoperacion9151);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3954:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3955:2: (iv_ruleOr= ruleOr EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3956:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr9185);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr9195); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3963:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_And_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3966:28: ( (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3967:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3967:1: (this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3968:5: this_And_0= ruleAnd ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9242);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3976:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==95) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3976:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleAnd ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3976:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3977:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3982:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3983:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3983:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:3984:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOr9272);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4000:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==50) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4001:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4001:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4002:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOr9290); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOrAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4015:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==106) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4016:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4016:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4017:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleOr9322); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getOrAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getOrRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4030:3: ( (lv_right_5_0= ruleAnd ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4031:1: (lv_right_5_0= ruleAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4031:1: (lv_right_5_0= ruleAnd )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4032:3: lv_right_5_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_ruleOr9357);
            	    lv_right_5_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4056:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4057:2: (iv_ruleAnd= ruleAnd EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4058:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd9395);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd9405); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4065:1: ruleAnd returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Mod_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4068:28: ( (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4069:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4069:1: (this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4070:5: this_Mod_0= ruleMod ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getModParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd9452);
            this_Mod_0=ruleMod();

            state._fsp--;

             
                    current = this_Mod_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4078:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==96) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4078:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleMod ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4078:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4079:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4084:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4085:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4085:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4086:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAnd9482);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4102:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==50) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4103:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4103:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4104:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAnd9500); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getAndAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop74;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4117:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==106) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4118:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4118:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4119:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleAnd9532); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getAndAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getAndRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4132:3: ( (lv_right_5_0= ruleMod ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4133:1: (lv_right_5_0= ruleMod )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4133:1: (lv_right_5_0= ruleMod )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4134:3: lv_right_5_0= ruleMod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightModParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMod_in_ruleAnd9567);
            	    lv_right_5_0=ruleMod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Mod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4158:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4159:2: (iv_ruleMod= ruleMod EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4160:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMod_in_entryRuleMod9605);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMod9615); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4167:1: ruleMod returns [EObject current=null] : (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Igualdad_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4170:28: ( (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4171:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4171:1: (this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4172:5: this_Igualdad_0= ruleIgualdad ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getModAccess().getIgualdadParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod9662);
            this_Igualdad_0=ruleIgualdad();

            state._fsp--;

             
                    current = this_Igualdad_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4180:1: ( () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==104) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4180:2: () ( (lv_signo_op_2_0= rulesignoModulo ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleIgualdad ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4180:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4181:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getModAccess().getModLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4186:2: ( (lv_signo_op_2_0= rulesignoModulo ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4187:1: (lv_signo_op_2_0= rulesignoModulo )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4187:1: (lv_signo_op_2_0= rulesignoModulo )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4188:3: lv_signo_op_2_0= rulesignoModulo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getSigno_opSignoModuloParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoModulo_in_ruleMod9692);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4204:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==50) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4205:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4205:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4206:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMod9710); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getModAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4219:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==106) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4220:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4220:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4221:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleMod9742); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getModAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getModRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4234:3: ( (lv_right_5_0= ruleIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4235:1: (lv_right_5_0= ruleIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4235:1: (lv_right_5_0= ruleIgualdad )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4236:3: lv_right_5_0= ruleIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModAccess().getRightIgualdadParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_ruleMod9777);
            	    lv_right_5_0=ruleIgualdad();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Igualdad");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4260:1: entryRuleIgualdad returns [EObject current=null] : iv_ruleIgualdad= ruleIgualdad EOF ;
    public final EObject entryRuleIgualdad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdad = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4261:2: (iv_ruleIgualdad= ruleIgualdad EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4262:2: iv_ruleIgualdad= ruleIgualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdad_in_entryRuleIgualdad9815);
            iv_ruleIgualdad=ruleIgualdad();

            state._fsp--;

             current =iv_ruleIgualdad; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdad9825); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4269:1: ruleIgualdad returns [EObject current=null] : (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) ;
    public final EObject ruleIgualdad() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_Comparacion_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4272:28: ( (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4273:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4273:1: (this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4274:5: this_Comparacion_0= ruleComparacion ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadAccess().getComparacionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad9872);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;

             
                    current = this_Comparacion_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4282:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==51||LA82_0==97) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4282:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleComparacion ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4282:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4283:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4288:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4289:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4289:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4290:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdad9902);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4306:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==50) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4307:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4307:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4308:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleIgualdad9920); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4321:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==106) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4322:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4322:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4323:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleIgualdad9952); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getIgualdadAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIgualdadRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4336:3: ( (lv_right_5_0= ruleComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4337:1: (lv_right_5_0= ruleComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4337:1: (lv_right_5_0= ruleComparacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4338:3: lv_right_5_0= ruleComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadAccess().getRightComparacionParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_ruleIgualdad9987);
            	    lv_right_5_0=ruleComparacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIgualdadRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Comparacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4362:1: entryRuleComparacion returns [EObject current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final EObject entryRuleComparacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4363:2: (iv_ruleComparacion= ruleComparacion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4364:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacion_in_entryRuleComparacion10025);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacion10035); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4371:1: ruleComparacion returns [EObject current=null] : (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) ;
    public final EObject ruleComparacion() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesFinales_3_0=null;
        Token lv_negacionesFinales_4_0=null;
        EObject this_SumaResta_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4374:28: ( (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4375:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4375:1: (this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4376:5: this_SumaResta_0= ruleSumaResta ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionAccess().getSumaRestaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10082);
            this_SumaResta_0=ruleSumaResta();

            state._fsp--;

             
                    current = this_SumaResta_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4384:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=98 && LA85_0<=101)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4384:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_negacionesFinales_3_0= '-' ) )* ( (lv_negacionesFinales_4_0= 'no' ) )* ( (lv_right_5_0= ruleSumaResta ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4384:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4385:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4390:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4391:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4391:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4392:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacion10112);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4408:2: ( (lv_negacionesFinales_3_0= '-' ) )*
            	    loop83:
            	    do {
            	        int alt83=2;
            	        int LA83_0 = input.LA(1);

            	        if ( (LA83_0==50) ) {
            	            alt83=1;
            	        }


            	        switch (alt83) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4409:1: (lv_negacionesFinales_3_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4409:1: (lv_negacionesFinales_3_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4410:3: lv_negacionesFinales_3_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_3_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleComparacion10130); 

            	    	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getComparacionAccess().getNegacionesFinalesHyphenMinusKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop83;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4423:3: ( (lv_negacionesFinales_4_0= 'no' ) )*
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==106) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4424:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4424:1: (lv_negacionesFinales_4_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4425:3: lv_negacionesFinales_4_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_4_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleComparacion10162); 

            	    	            newLeafNode(lv_negacionesFinales_4_0, grammarAccess.getComparacionAccess().getNegacionesFinalesNoKeyword_1_3_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getComparacionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_4_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop84;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4438:3: ( (lv_right_5_0= ruleSumaResta ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4439:1: (lv_right_5_0= ruleSumaResta )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4439:1: (lv_right_5_0= ruleSumaResta )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4440:3: lv_right_5_0= ruleSumaResta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionAccess().getRightSumaRestaParserRuleCall_1_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_ruleComparacion10197);
            	    lv_right_5_0=ruleSumaResta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparacionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"SumaResta");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4464:1: entryRuleSumaResta returns [EObject current=null] : iv_ruleSumaResta= ruleSumaResta EOF ;
    public final EObject entryRuleSumaResta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaResta = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4465:2: (iv_ruleSumaResta= ruleSumaResta EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4466:2: iv_ruleSumaResta= ruleSumaResta EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaResta_in_entryRuleSumaResta10235);
            iv_ruleSumaResta=ruleSumaResta();

            state._fsp--;

             current =iv_ruleSumaResta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaResta10245); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4473:1: ruleSumaResta returns [EObject current=null] : (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4476:28: ( (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4477:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4477:1: (this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4478:5: this_MultiplicacionDivision_0= ruleMultiplicacionDivision ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaAccess().getMultiplicacionDivisionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10292);
            this_MultiplicacionDivision_0=ruleMultiplicacionDivision();

            state._fsp--;

             
                    current = this_MultiplicacionDivision_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=49 && LA89_0<=50)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_negacionesFinales_5_0= '-' ) )* ( (lv_negacionesFinales_6_0= 'no' ) )* ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==49) ) {
            	        alt86=1;
            	    }
            	    else if ( (LA86_0==50) ) {
            	        alt86=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 86, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4486:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4487:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4492:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4493:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4493:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4494:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaResta10324);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4511:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4511:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4511:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4511:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4512:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4517:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4518:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4518:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4519:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaResta10362);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4535:4: ( (lv_negacionesFinales_5_0= '-' ) )*
            	    loop87:
            	    do {
            	        int alt87=2;
            	        int LA87_0 = input.LA(1);

            	        if ( (LA87_0==50) ) {
            	            alt87=1;
            	        }


            	        switch (alt87) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4536:1: (lv_negacionesFinales_5_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4536:1: (lv_negacionesFinales_5_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4537:3: lv_negacionesFinales_5_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_5_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSumaResta10382); 

            	    	            newLeafNode(lv_negacionesFinales_5_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_5_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop87;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4550:3: ( (lv_negacionesFinales_6_0= 'no' ) )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);

            	        if ( (LA88_0==106) ) {
            	            alt88=1;
            	        }


            	        switch (alt88) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4551:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4551:1: (lv_negacionesFinales_6_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4552:3: lv_negacionesFinales_6_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_6_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleSumaResta10414); 

            	    	            newLeafNode(lv_negacionesFinales_6_0, grammarAccess.getSumaRestaAccess().getNegacionesFinalesNoKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getSumaRestaRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_6_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop88;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4565:3: ( (lv_right_7_0= ruleMultiplicacionDivision ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4566:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4566:1: (lv_right_7_0= ruleMultiplicacionDivision )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4567:3: lv_right_7_0= ruleMultiplicacionDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaAccess().getRightMultiplicacionDivisionParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10449);
            	    lv_right_7_0=ruleMultiplicacionDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSumaRestaRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"MultiplicacionDivision");
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
    // $ANTLR end "ruleSumaResta"


    // $ANTLR start "entryRuleMultiplicacionDivision"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4591:1: entryRuleMultiplicacionDivision returns [EObject current=null] : iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF ;
    public final EObject entryRuleMultiplicacionDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivision = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4592:2: (iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4593:2: iv_ruleMultiplicacionDivision= ruleMultiplicacionDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10487);
            iv_ruleMultiplicacionDivision=ruleMultiplicacionDivision();

            state._fsp--;

             current =iv_ruleMultiplicacionDivision; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivision10497); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4600:1: ruleMultiplicacionDivision returns [EObject current=null] : (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4603:28: ( (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4604:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4604:1: (this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4605:5: this_Primaria_0= rulePrimaria ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getPrimariaParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10544);
            this_Primaria_0=rulePrimaria();

            state._fsp--;

             
                    current = this_Primaria_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=102 && LA93_0<=103)||LA93_0==105) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_negacionesFinales_7_0= '-' ) )* ( (lv_negacionesFinales_8_0= 'no' ) )* ( (lv_right_9_0= rulePrimaria ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt90=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt90=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt90=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt90=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt90) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4613:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4614:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4619:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4620:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4620:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4621:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10576);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4638:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4638:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4638:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4638:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4639:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4644:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4645:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4645:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4646:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10614);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4663:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4663:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4663:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4663:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4664:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4669:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4670:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4670:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4671:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivision10652);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4687:4: ( (lv_negacionesFinales_7_0= '-' ) )*
            	    loop91:
            	    do {
            	        int alt91=2;
            	        int LA91_0 = input.LA(1);

            	        if ( (LA91_0==50) ) {
            	            alt91=1;
            	        }


            	        switch (alt91) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4688:1: (lv_negacionesFinales_7_0= '-' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4688:1: (lv_negacionesFinales_7_0= '-' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4689:3: lv_negacionesFinales_7_0= '-'
            	    	    {
            	    	    lv_negacionesFinales_7_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleMultiplicacionDivision10672); 

            	    	            newLeafNode(lv_negacionesFinales_7_0, grammarAccess.getMultiplicacionDivisionAccess().getNegacionesFinalesHyphenMinusKeyword_1_1_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getMultiplicacionDivisionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_7_0, "-");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop91;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4702:3: ( (lv_negacionesFinales_8_0= 'no' ) )*
            	    loop92:
            	    do {
            	        int alt92=2;
            	        int LA92_0 = input.LA(1);

            	        if ( (LA92_0==106) ) {
            	            alt92=1;
            	        }


            	        switch (alt92) {
            	    	case 1 :
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4703:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    {
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4703:1: (lv_negacionesFinales_8_0= 'no' )
            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4704:3: lv_negacionesFinales_8_0= 'no'
            	    	    {
            	    	    lv_negacionesFinales_8_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleMultiplicacionDivision10704); 

            	    	            newLeafNode(lv_negacionesFinales_8_0, grammarAccess.getMultiplicacionDivisionAccess().getNegacionesFinalesNoKeyword_1_2_0());
            	    	        

            	    	    	        if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getMultiplicacionDivisionRule());
            	    	    	        }
            	    	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_8_0, "no");
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop92;
            	        }
            	    } while (true);

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4717:3: ( (lv_right_9_0= rulePrimaria ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4718:1: (lv_right_9_0= rulePrimaria )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4718:1: (lv_right_9_0= rulePrimaria )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4719:3: lv_right_9_0= rulePrimaria
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionAccess().getRightPrimariaParserRuleCall_1_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10739);
            	    lv_right_9_0=rulePrimaria();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicacionDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
            	            		"Primaria");
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
    // $ANTLR end "ruleMultiplicacionDivision"


    // $ANTLR start "entryRuleoperacionIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4743:1: entryRuleoperacionIndice returns [EObject current=null] : iv_ruleoperacionIndice= ruleoperacionIndice EOF ;
    public final EObject entryRuleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4744:2: (iv_ruleoperacionIndice= ruleoperacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4745:2: iv_ruleoperacionIndice= ruleoperacionIndice EOF
            {
             newCompositeNode(grammarAccess.getOperacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10777);
            iv_ruleoperacionIndice=ruleoperacionIndice();

            state._fsp--;

             current =iv_ruleoperacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleoperacionIndice10787); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4752:1: ruleoperacionIndice returns [EObject current=null] : this_OrIndice_0= ruleOrIndice ;
    public final EObject ruleoperacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_OrIndice_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4755:28: (this_OrIndice_0= ruleOrIndice )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4757:5: this_OrIndice_0= ruleOrIndice
            {
             
                    newCompositeNode(grammarAccess.getOperacionIndiceAccess().getOrIndiceParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_ruleoperacionIndice10833);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4773:1: entryRuleOrIndice returns [EObject current=null] : iv_ruleOrIndice= ruleOrIndice EOF ;
    public final EObject entryRuleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4774:2: (iv_ruleOrIndice= ruleOrIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4775:2: iv_ruleOrIndice= ruleOrIndice EOF
            {
             newCompositeNode(grammarAccess.getOrIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrIndice_in_entryRuleOrIndice10867);
            iv_ruleOrIndice=ruleOrIndice();

            state._fsp--;

             current =iv_ruleOrIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrIndice10877); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4782:1: ruleOrIndice returns [EObject current=null] : (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) ;
    public final EObject ruleOrIndice() throws RecognitionException {
        EObject current = null;

        EObject this_AndIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4785:28: ( (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4786:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4786:1: (this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4787:5: this_AndIndice_0= ruleAndIndice ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrIndiceAccess().getAndIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice10924);
            this_AndIndice_0=ruleAndIndice();

            state._fsp--;

             
                    current = this_AndIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4795:1: ( () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==95) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4795:2: () ( (lv_signo_op_2_0= rulesignoOr ) ) ( (lv_right_3_0= ruleAndIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4795:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4796:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrIndiceAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4801:2: ( (lv_signo_op_2_0= rulesignoOr ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4802:1: (lv_signo_op_2_0= rulesignoOr )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4802:1: (lv_signo_op_2_0= rulesignoOr )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4803:3: lv_signo_op_2_0= rulesignoOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getSigno_opSignoOrParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoOr_in_ruleOrIndice10954);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4819:2: ( (lv_right_3_0= ruleAndIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4820:1: (lv_right_3_0= ruleAndIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4820:1: (lv_right_3_0= ruleAndIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4821:3: lv_right_3_0= ruleAndIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrIndiceAccess().getRightAndIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_ruleOrIndice10975);
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
    // $ANTLR end "ruleOrIndice"


    // $ANTLR start "entryRuleAndIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4845:1: entryRuleAndIndice returns [EObject current=null] : iv_ruleAndIndice= ruleAndIndice EOF ;
    public final EObject entryRuleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4846:2: (iv_ruleAndIndice= ruleAndIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4847:2: iv_ruleAndIndice= ruleAndIndice EOF
            {
             newCompositeNode(grammarAccess.getAndIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndIndice_in_entryRuleAndIndice11013);
            iv_ruleAndIndice=ruleAndIndice();

            state._fsp--;

             current =iv_ruleAndIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndIndice11023); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4854:1: ruleAndIndice returns [EObject current=null] : (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) ;
    public final EObject ruleAndIndice() throws RecognitionException {
        EObject current = null;

        EObject this_IgualdadIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4857:28: ( (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4858:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4858:1: (this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4859:5: this_IgualdadIndice_0= ruleIgualdadIndice ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndIndiceAccess().getIgualdadIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11070);
            this_IgualdadIndice_0=ruleIgualdadIndice();

            state._fsp--;

             
                    current = this_IgualdadIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4867:1: ( () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==96) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4867:2: () ( (lv_signo_op_2_0= rulesignoAnd ) ) ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4867:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4868:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndIndiceAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4873:2: ( (lv_signo_op_2_0= rulesignoAnd ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4874:1: (lv_signo_op_2_0= rulesignoAnd )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4874:1: (lv_signo_op_2_0= rulesignoAnd )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4875:3: lv_signo_op_2_0= rulesignoAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getSigno_opSignoAndParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoAnd_in_ruleAndIndice11100);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4891:2: ( (lv_right_3_0= ruleIgualdadIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4892:1: (lv_right_3_0= ruleIgualdadIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4892:1: (lv_right_3_0= ruleIgualdadIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4893:3: lv_right_3_0= ruleIgualdadIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndIndiceAccess().getRightIgualdadIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11121);
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
    // $ANTLR end "ruleAndIndice"


    // $ANTLR start "entryRuleIgualdadIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4917:1: entryRuleIgualdadIndice returns [EObject current=null] : iv_ruleIgualdadIndice= ruleIgualdadIndice EOF ;
    public final EObject entryRuleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgualdadIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4918:2: (iv_ruleIgualdadIndice= ruleIgualdadIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4919:2: iv_ruleIgualdadIndice= ruleIgualdadIndice EOF
            {
             newCompositeNode(grammarAccess.getIgualdadIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11159);
            iv_ruleIgualdadIndice=ruleIgualdadIndice();

            state._fsp--;

             current =iv_ruleIgualdadIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIgualdadIndice11169); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4926:1: ruleIgualdadIndice returns [EObject current=null] : (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) ;
    public final EObject ruleIgualdadIndice() throws RecognitionException {
        EObject current = null;

        EObject this_ComparacionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4929:28: ( (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4930:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4930:1: (this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4931:5: this_ComparacionIndice_0= ruleComparacionIndice ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getComparacionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11216);
            this_ComparacionIndice_0=ruleComparacionIndice();

            state._fsp--;

             
                    current = this_ComparacionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4939:1: ( () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==51||LA96_0==97) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4939:2: () ( (lv_signo_op_2_0= rulesignoIgualdad ) ) ( (lv_right_3_0= ruleComparacionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4939:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4940:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getIgualdadIndiceAccess().getIgualdadLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4945:2: ( (lv_signo_op_2_0= rulesignoIgualdad ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4946:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4946:1: (lv_signo_op_2_0= rulesignoIgualdad )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4947:3: lv_signo_op_2_0= rulesignoIgualdad
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getSigno_opSignoIgualdadParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11246);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4963:2: ( (lv_right_3_0= ruleComparacionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4964:1: (lv_right_3_0= ruleComparacionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4964:1: (lv_right_3_0= ruleComparacionIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4965:3: lv_right_3_0= ruleComparacionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIgualdadIndiceAccess().getRightComparacionIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11267);
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
    // $ANTLR end "ruleIgualdadIndice"


    // $ANTLR start "entryRuleComparacionIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4989:1: entryRuleComparacionIndice returns [EObject current=null] : iv_ruleComparacionIndice= ruleComparacionIndice EOF ;
    public final EObject entryRuleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparacionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4990:2: (iv_ruleComparacionIndice= ruleComparacionIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4991:2: iv_ruleComparacionIndice= ruleComparacionIndice EOF
            {
             newCompositeNode(grammarAccess.getComparacionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11305);
            iv_ruleComparacionIndice=ruleComparacionIndice();

            state._fsp--;

             current =iv_ruleComparacionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparacionIndice11315); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:4998:1: ruleComparacionIndice returns [EObject current=null] : (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) ;
    public final EObject ruleComparacionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_SumaRestaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5001:28: ( (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5002:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5002:1: (this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5003:5: this_SumaRestaIndice_0= ruleSumaRestaIndice ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSumaRestaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11362);
            this_SumaRestaIndice_0=ruleSumaRestaIndice();

            state._fsp--;

             
                    current = this_SumaRestaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5011:1: ( () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=98 && LA97_0<=101)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5011:2: () ( (lv_signo_op_2_0= rulesignoComparacion ) ) ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5011:2: ()
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5012:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparacionIndiceAccess().getComparacionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5017:2: ( (lv_signo_op_2_0= rulesignoComparacion ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5018:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5018:1: (lv_signo_op_2_0= rulesignoComparacion )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5019:3: lv_signo_op_2_0= rulesignoComparacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getSigno_opSignoComparacionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11392);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5035:2: ( (lv_right_3_0= ruleSumaRestaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5036:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5036:1: (lv_right_3_0= ruleSumaRestaIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5037:3: lv_right_3_0= ruleSumaRestaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparacionIndiceAccess().getRightSumaRestaIndiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11413);
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
    // $ANTLR end "ruleComparacionIndice"


    // $ANTLR start "entryRuleSumaRestaIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5061:1: entryRuleSumaRestaIndice returns [EObject current=null] : iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF ;
    public final EObject entryRuleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumaRestaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5062:2: (iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5063:2: iv_ruleSumaRestaIndice= ruleSumaRestaIndice EOF
            {
             newCompositeNode(grammarAccess.getSumaRestaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11451);
            iv_ruleSumaRestaIndice=ruleSumaRestaIndice();

            state._fsp--;

             current =iv_ruleSumaRestaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSumaRestaIndice11461); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5070:1: ruleSumaRestaIndice returns [EObject current=null] : (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) ;
    public final EObject ruleSumaRestaIndice() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicacionDivisionIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5073:28: ( (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5074:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5074:1: (this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5075:5: this_MultiplicacionDivisionIndice_0= ruleMultiplicacionDivisionIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getMultiplicacionDivisionIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11508);
            this_MultiplicacionDivisionIndice_0=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             
                    current = this_MultiplicacionDivisionIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=49 && LA99_0<=50)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) ) ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:2: ( ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoResta ) ) ) )
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==49) ) {
            	        alt98=1;
            	    }
            	    else if ( (LA98_0==50) ) {
            	        alt98=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 98, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:3: ( () ( (lv_signo_op_2_0= rulesignoSuma ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:4: () ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5083:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5084:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getSumaLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5089:2: ( (lv_signo_op_2_0= rulesignoSuma ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5090:1: (lv_signo_op_2_0= rulesignoSuma )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5090:1: (lv_signo_op_2_0= rulesignoSuma )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5091:3: lv_signo_op_2_0= rulesignoSuma
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoSumaParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11540);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5108:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5108:6: ( () ( (lv_signo_op_4_0= rulesignoResta ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5108:7: () ( (lv_signo_op_4_0= rulesignoResta ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5108:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5109:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getSumaRestaIndiceAccess().getRestaLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5114:2: ( (lv_signo_op_4_0= rulesignoResta ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5115:1: (lv_signo_op_4_0= rulesignoResta )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5115:1: (lv_signo_op_4_0= rulesignoResta )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5116:3: lv_signo_op_4_0= rulesignoResta
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getSigno_opSignoRestaParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11578);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5132:4: ( (lv_right_5_0= ruleMultiplicacionDivisionIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5133:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5133:1: (lv_right_5_0= ruleMultiplicacionDivisionIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5134:3: lv_right_5_0= ruleMultiplicacionDivisionIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSumaRestaIndiceAccess().getRightMultiplicacionDivisionIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11601);
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
    // $ANTLR end "ruleSumaRestaIndice"


    // $ANTLR start "entryRuleMultiplicacionDivisionIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5158:1: entryRuleMultiplicacionDivisionIndice returns [EObject current=null] : iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF ;
    public final EObject entryRuleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicacionDivisionIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5159:2: (iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5160:2: iv_ruleMultiplicacionDivisionIndice= ruleMultiplicacionDivisionIndice EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11639);
            iv_ruleMultiplicacionDivisionIndice=ruleMultiplicacionDivisionIndice();

            state._fsp--;

             current =iv_ruleMultiplicacionDivisionIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11649); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5167:1: ruleMultiplicacionDivisionIndice returns [EObject current=null] : (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) ;
    public final EObject ruleMultiplicacionDivisionIndice() throws RecognitionException {
        EObject current = null;

        EObject this_PrimariaIndice_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_2_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_4_0 = null;

        AntlrDatatypeRuleToken lv_signo_op_6_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5170:28: ( (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5171:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5171:1: (this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5172:5: this_PrimariaIndice_0= rulePrimariaIndice ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getPrimariaIndiceParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11696);
            this_PrimariaIndice_0=rulePrimariaIndice();

            state._fsp--;

             
                    current = this_PrimariaIndice_0; 
                    afterParserOrEnumRuleCall();
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:1: ( ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=102 && LA101_0<=103)||LA101_0==105) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) ) ( (lv_right_7_0= rulePrimariaIndice ) )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:2: ( ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) ) | ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) ) | ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) ) )
            	    int alt100=3;
            	    switch ( input.LA(1) ) {
            	    case 102:
            	        {
            	        alt100=1;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt100=2;
            	        }
            	        break;
            	    case 105:
            	        {
            	        alt100=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 100, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt100) {
            	        case 1 :
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:3: ( () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:4: () ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5180:4: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5181:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getMultiplicacionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5186:2: ( (lv_signo_op_2_0= rulesignoMultiplicacion ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5187:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5187:1: (lv_signo_op_2_0= rulesignoMultiplicacion )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5188:3: lv_signo_op_2_0= rulesignoMultiplicacion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoMultiplicacionParserRuleCall_1_0_0_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11728);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5205:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5205:6: ( () ( (lv_signo_op_4_0= rulesignoDivision ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5205:7: () ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5205:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5206:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5211:2: ( (lv_signo_op_4_0= rulesignoDivision ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5212:1: (lv_signo_op_4_0= rulesignoDivision )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5212:1: (lv_signo_op_4_0= rulesignoDivision )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5213:3: lv_signo_op_4_0= rulesignoDivision
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivisionParserRuleCall_1_0_1_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11766);
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
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5230:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5230:6: ( () ( (lv_signo_op_6_0= rulesignoDiv ) ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5230:7: () ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5230:7: ()
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5231:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicacionDivisionIndiceAccess().getDivLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5236:2: ( (lv_signo_op_6_0= rulesignoDiv ) )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5237:1: (lv_signo_op_6_0= rulesignoDiv )
            	            {
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5237:1: (lv_signo_op_6_0= rulesignoDiv )
            	            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5238:3: lv_signo_op_6_0= rulesignoDiv
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getSigno_opSignoDivParserRuleCall_1_0_2_1_0()); 
            	            	    
            	            pushFollow(FollowSets000.FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivisionIndice11804);
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

            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5254:4: ( (lv_right_7_0= rulePrimariaIndice ) )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5255:1: (lv_right_7_0= rulePrimariaIndice )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5255:1: (lv_right_7_0= rulePrimariaIndice )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5256:3: lv_right_7_0= rulePrimariaIndice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicacionDivisionIndiceAccess().getRightPrimariaIndiceParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11827);
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
    // $ANTLR end "ruleMultiplicacionDivisionIndice"


    // $ANTLR start "entryRulePrimariaIndice"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5280:1: entryRulePrimariaIndice returns [EObject current=null] : iv_rulePrimariaIndice= rulePrimariaIndice EOF ;
    public final EObject entryRulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimariaIndice = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5281:2: (iv_rulePrimariaIndice= rulePrimariaIndice EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5282:2: iv_rulePrimariaIndice= rulePrimariaIndice EOF
            {
             newCompositeNode(grammarAccess.getPrimariaIndiceRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice11865);
            iv_rulePrimariaIndice=rulePrimariaIndice();

            state._fsp--;

             current =iv_rulePrimariaIndice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimariaIndice11875); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5289:1: rulePrimariaIndice returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) ;
    public final EObject rulePrimariaIndice() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5292:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_nombre_3_0= ruleEString ) ) ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_INT) ) {
                alt102=1;
            }
            else if ( (LA102_0==RULE_ID||LA102_0==RULE_STRING) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5293:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5294:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5299:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5300:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5300:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5301:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePrimariaIndice11931);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5318:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5318:6: ( () ( (lv_nombre_3_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5318:7: () ( (lv_nombre_3_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5318:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5319:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimariaIndiceAccess().getVariableIDAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5324:2: ( (lv_nombre_3_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5325:1: (lv_nombre_3_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5325:1: (lv_nombre_3_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5326:3: lv_nombre_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimariaIndiceAccess().getNombreEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimariaIndice11969);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5350:1: entryRulePrimaria returns [EObject current=null] : iv_rulePrimaria= rulePrimaria EOF ;
    public final EObject entryRulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaria = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5351:2: (iv_rulePrimaria= rulePrimaria EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5352:2: iv_rulePrimaria= rulePrimaria EOF
            {
             newCompositeNode(grammarAccess.getPrimariaRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaria_in_entryRulePrimaria12006);
            iv_rulePrimaria=rulePrimaria();

            state._fsp--;

             current =iv_rulePrimaria; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaria12016); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5359:1: rulePrimaria returns [EObject current=null] : (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) ;
    public final EObject rulePrimaria() throws RecognitionException {
        EObject current = null;

        EObject this_VariablesBasicas_0 = null;

        EObject this_VariablesComplejas_1 = null;

        EObject this_Funciones_2 = null;

        EObject this_OperacionParentesis_3 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5362:28: ( (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5363:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5363:1: (this_VariablesBasicas_0= ruleVariablesBasicas | this_VariablesComplejas_1= ruleVariablesComplejas | this_Funciones_2= ruleFunciones | this_OperacionParentesis_3= ruleOperacionParentesis )
            int alt103=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_CAD:
            case RULE_CAR:
            case 114:
            case 115:
                {
                alt103=1;
                }
                break;
            case RULE_STRING:
                {
                int LA103_2 = input.LA(2);

                if ( (LA103_2==EOF||(LA103_2>=RULE_ID && LA103_2<=RULE_CAR)||(LA103_2>=19 && LA103_2<=20)||(LA103_2>=27 && LA103_2<=30)||(LA103_2>=32 && LA103_2<=34)||(LA103_2>=37 && LA103_2<=45)||(LA103_2>=49 && LA103_2<=51)||LA103_2==54||LA103_2==56||LA103_2==58||LA103_2==63||LA103_2==65||LA103_2==67||(LA103_2>=69 && LA103_2<=72)||(LA103_2>=74 && LA103_2<=105)||(LA103_2>=107 && LA103_2<=110)||(LA103_2>=114 && LA103_2<=115)) ) {
                    alt103=1;
                }
                else if ( (LA103_2==46||LA103_2==53) ) {
                    alt103=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA103_3 = input.LA(2);

                if ( (LA103_3==46||LA103_3==53) ) {
                    alt103=2;
                }
                else if ( (LA103_3==EOF||(LA103_3>=RULE_ID && LA103_3<=RULE_CAR)||(LA103_3>=19 && LA103_3<=20)||(LA103_3>=27 && LA103_3<=30)||(LA103_3>=32 && LA103_3<=34)||(LA103_3>=37 && LA103_3<=45)||(LA103_3>=49 && LA103_3<=51)||LA103_3==54||LA103_3==56||LA103_3==58||LA103_3==63||LA103_3==65||LA103_3==67||(LA103_3>=69 && LA103_3<=72)||(LA103_3>=74 && LA103_3<=105)||(LA103_3>=107 && LA103_3<=110)||(LA103_3>=114 && LA103_3<=115)) ) {
                    alt103=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 103, 3, input);

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
                {
                alt103=3;
                }
                break;
            case 33:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5364:5: this_VariablesBasicas_0= ruleVariablesBasicas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesBasicasParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_rulePrimaria12063);
                    this_VariablesBasicas_0=ruleVariablesBasicas();

                    state._fsp--;

                     
                            current = this_VariablesBasicas_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5374:5: this_VariablesComplejas_1= ruleVariablesComplejas
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getVariablesComplejasParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_rulePrimaria12090);
                    this_VariablesComplejas_1=ruleVariablesComplejas();

                    state._fsp--;

                     
                            current = this_VariablesComplejas_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5384:5: this_Funciones_2= ruleFunciones
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getFuncionesParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_rulePrimaria12117);
                    this_Funciones_2=ruleFunciones();

                    state._fsp--;

                     
                            current = this_Funciones_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5394:5: this_OperacionParentesis_3= ruleOperacionParentesis
                    {
                     
                            newCompositeNode(grammarAccess.getPrimariaAccess().getOperacionParentesisParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOperacionParentesis_in_rulePrimaria12144);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5410:1: entryRuleOperacionCompleta returns [EObject current=null] : iv_ruleOperacionCompleta= ruleOperacionCompleta EOF ;
    public final EObject entryRuleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionCompleta = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5411:2: (iv_ruleOperacionCompleta= ruleOperacionCompleta EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5412:2: iv_ruleOperacionCompleta= ruleOperacionCompleta EOF
            {
             newCompositeNode(grammarAccess.getOperacionCompletaRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_entryRuleOperacionCompleta12179);
            iv_ruleOperacionCompleta=ruleOperacionCompleta();

            state._fsp--;

             current =iv_ruleOperacionCompleta; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperacionCompleta12189); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5419:1: ruleOperacionCompleta returns [EObject current=null] : ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) ) ;
    public final EObject ruleOperacionCompleta() throws RecognitionException {
        EObject current = null;

        Token lv_negacionesIniciales_1_0=null;
        Token lv_negacionesIniciales_2_0=null;
        EObject lv_valor_operacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5422:28: ( ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5423:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5423:1: ( () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5423:2: () ( (lv_negacionesIniciales_1_0= '-' ) )* ( (lv_negacionesIniciales_2_0= 'no' ) )* ( (lv_valor_operacion_3_0= ruleoperacion ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5423:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5424:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionCompletaAccess().getOperacionCompletaAction_0(),
                        current);
                

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5429:2: ( (lv_negacionesIniciales_1_0= '-' ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==50) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5430:1: (lv_negacionesIniciales_1_0= '-' )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5430:1: (lv_negacionesIniciales_1_0= '-' )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5431:3: lv_negacionesIniciales_1_0= '-'
            	    {
            	    lv_negacionesIniciales_1_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperacionCompleta12241); 

            	            newLeafNode(lv_negacionesIniciales_1_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesHyphenMinusKeyword_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_1_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5444:3: ( (lv_negacionesIniciales_2_0= 'no' ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==106) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:1: (lv_negacionesIniciales_2_0= 'no' )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5445:1: (lv_negacionesIniciales_2_0= 'no' )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5446:3: lv_negacionesIniciales_2_0= 'no'
            	    {
            	    lv_negacionesIniciales_2_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleOperacionCompleta12273); 

            	            newLeafNode(lv_negacionesIniciales_2_0, grammarAccess.getOperacionCompletaAccess().getNegacionesInicialesNoKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionCompletaRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesIniciales", lv_negacionesIniciales_2_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5459:3: ( (lv_valor_operacion_3_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5460:1: (lv_valor_operacion_3_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5460:1: (lv_valor_operacion_3_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5461:3: lv_valor_operacion_3_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionCompletaAccess().getValor_operacionOperacionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleOperacionCompleta12308);
            lv_valor_operacion_3_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionCompletaRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_3_0, 
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
    // $ANTLR end "ruleOperacionCompleta"


    // $ANTLR start "entryRuleOperacionParentesis"
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5485:1: entryRuleOperacionParentesis returns [EObject current=null] : iv_ruleOperacionParentesis= ruleOperacionParentesis EOF ;
    public final EObject entryRuleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacionParentesis = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5486:2: (iv_ruleOperacionParentesis= ruleOperacionParentesis EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5487:2: iv_ruleOperacionParentesis= ruleOperacionParentesis EOF
            {
             newCompositeNode(grammarAccess.getOperacionParentesisRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperacionParentesis_in_entryRuleOperacionParentesis12344);
            iv_ruleOperacionParentesis=ruleOperacionParentesis();

            state._fsp--;

             current =iv_ruleOperacionParentesis; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperacionParentesis12354); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5494:1: ruleOperacionParentesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) ;
    public final EObject ruleOperacionParentesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_negacionesFinales_2_0=null;
        Token lv_negacionesFinales_3_0=null;
        Token otherlv_5=null;
        EObject lv_valor_operacion_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5497:28: ( ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5498:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5498:1: ( () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5498:2: () otherlv_1= '(' ( (lv_negacionesFinales_2_0= '-' ) )* ( (lv_negacionesFinales_3_0= 'no' ) )* ( (lv_valor_operacion_4_0= ruleoperacion ) ) otherlv_5= ')'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5498:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperacionParentesisAccess().getOperacionParentesisAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleOperacionParentesis12400); 

                	newLeafNode(otherlv_1, grammarAccess.getOperacionParentesisAccess().getLeftParenthesisKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5508:1: ( (lv_negacionesFinales_2_0= '-' ) )*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==50) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5509:1: (lv_negacionesFinales_2_0= '-' )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5509:1: (lv_negacionesFinales_2_0= '-' )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5510:3: lv_negacionesFinales_2_0= '-'
            	    {
            	    lv_negacionesFinales_2_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleOperacionParentesis12418); 

            	            newLeafNode(lv_negacionesFinales_2_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesHyphenMinusKeyword_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_2_0, "-");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5523:3: ( (lv_negacionesFinales_3_0= 'no' ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==106) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5524:1: (lv_negacionesFinales_3_0= 'no' )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5524:1: (lv_negacionesFinales_3_0= 'no' )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5525:3: lv_negacionesFinales_3_0= 'no'
            	    {
            	    lv_negacionesFinales_3_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleOperacionParentesis12450); 

            	            newLeafNode(lv_negacionesFinales_3_0, grammarAccess.getOperacionParentesisAccess().getNegacionesFinalesNoKeyword_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOperacionParentesisRule());
            	    	        }
            	           		addWithLastConsumed(current, "negacionesFinales", lv_negacionesFinales_3_0, "no");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5538:3: ( (lv_valor_operacion_4_0= ruleoperacion ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5539:1: (lv_valor_operacion_4_0= ruleoperacion )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5539:1: (lv_valor_operacion_4_0= ruleoperacion )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5540:3: lv_valor_operacion_4_0= ruleoperacion
            {
             
            	        newCompositeNode(grammarAccess.getOperacionParentesisAccess().getValor_operacionOperacionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleOperacionParentesis12485);
            lv_valor_operacion_4_0=ruleoperacion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperacionParentesisRule());
            	        }
                   		set(
                   			current, 
                   			"valor_operacion",
                    		lv_valor_operacion_4_0, 
                    		"operacion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleOperacionParentesis12497); 

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5568:1: entryRuleFunciones returns [EObject current=null] : iv_ruleFunciones= ruleFunciones EOF ;
    public final EObject entryRuleFunciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunciones = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5569:2: (iv_ruleFunciones= ruleFunciones EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5570:2: iv_ruleFunciones= ruleFunciones EOF
            {
             newCompositeNode(grammarAccess.getFuncionesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFunciones_in_entryRuleFunciones12533);
            iv_ruleFunciones=ruleFunciones();

            state._fsp--;

             current =iv_ruleFunciones; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunciones12543); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5577:1: ruleFunciones returns [EObject current=null] : ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' ) | ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' ) ) ;
    public final EObject ruleFunciones() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_operadores_4_0 = null;

        EObject lv_operadores_8_0 = null;

        AntlrDatatypeRuleToken lv_nombre_11_0 = null;

        EObject lv_operadores_14_0 = null;

        EObject lv_operadores_18_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5580:28: ( ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' ) | ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' ) | ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:1: ( ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' ) | ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_NOMBRE_FUN) ) {
                alt120=1;
            }
            else if ( ((LA120_0>=37 && LA120_0<=45)) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:2: ( () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:3: () ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )? otherlv_9= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5581:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5582:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getLlamadaFuncionAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5587:2: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5588:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5588:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5589:3: lv_nombre_1_0= RULE_NOMBRE_FUN
                    {
                    lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleFunciones12595); 

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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5605:2: ( (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )* )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( ((LA113_0>=RULE_ID && LA113_0<=RULE_CAR)||LA113_0==33||(LA113_0>=37 && LA113_0<=45)||LA113_0==50||LA113_0==106||(LA113_0>=114 && LA113_0<=115)) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5605:3: (otherlv_2= '-' )* (otherlv_3= 'no' )* ( (lv_operadores_4_0= ruleoperacion ) ) (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5605:3: (otherlv_2= '-' )*
                            loop108:
                            do {
                                int alt108=2;
                                int LA108_0 = input.LA(1);

                                if ( (LA108_0==50) ) {
                                    alt108=1;
                                }


                                switch (alt108) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5605:5: otherlv_2= '-'
                            	    {
                            	    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFunciones12614); 

                            	        	newLeafNode(otherlv_2, grammarAccess.getFuncionesAccess().getHyphenMinusKeyword_0_2_0());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop108;
                                }
                            } while (true);

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5609:3: (otherlv_3= 'no' )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==106) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5609:5: otherlv_3= 'no'
                            	    {
                            	    otherlv_3=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFunciones12629); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getFuncionesAccess().getNoKeyword_0_2_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop109;
                                }
                            } while (true);

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5613:3: ( (lv_operadores_4_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5614:1: (lv_operadores_4_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5614:1: (lv_operadores_4_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5615:3: lv_operadores_4_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_2_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12652);
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

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5631:2: (otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) ) )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( (LA112_0==29) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5631:4: otherlv_5= ',' (otherlv_6= '-' )* (otherlv_7= 'no' )* ( (lv_operadores_8_0= ruleoperacion ) )
                            	    {
                            	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12665); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getFuncionesAccess().getCommaKeyword_0_2_3_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5635:1: (otherlv_6= '-' )*
                            	    loop110:
                            	    do {
                            	        int alt110=2;
                            	        int LA110_0 = input.LA(1);

                            	        if ( (LA110_0==50) ) {
                            	            alt110=1;
                            	        }


                            	        switch (alt110) {
                            	    	case 1 :
                            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5635:3: otherlv_6= '-'
                            	    	    {
                            	    	    otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFunciones12678); 

                            	    	        	newLeafNode(otherlv_6, grammarAccess.getFuncionesAccess().getHyphenMinusKeyword_0_2_3_1());
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop110;
                            	        }
                            	    } while (true);

                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5639:3: (otherlv_7= 'no' )*
                            	    loop111:
                            	    do {
                            	        int alt111=2;
                            	        int LA111_0 = input.LA(1);

                            	        if ( (LA111_0==106) ) {
                            	            alt111=1;
                            	        }


                            	        switch (alt111) {
                            	    	case 1 :
                            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5639:5: otherlv_7= 'no'
                            	    	    {
                            	    	    otherlv_7=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFunciones12693); 

                            	    	        	newLeafNode(otherlv_7, grammarAccess.getFuncionesAccess().getNoKeyword_0_2_3_2());
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop111;
                            	        }
                            	    } while (true);

                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5643:3: ( (lv_operadores_8_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5644:1: (lv_operadores_8_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5644:1: (lv_operadores_8_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5645:3: lv_operadores_8_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_0_2_3_3_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12716);
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


                            	    }
                            	    break;

                            	default :
                            	    break loop112;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12732); 

                        	newLeafNode(otherlv_9, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5666:6: ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5666:6: ( () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5666:7: () ( (lv_nombre_11_0= ruleNombreInterna ) ) ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )? otherlv_19= ')'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5666:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5667:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFuncionesAccess().getInternasAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5672:2: ( (lv_nombre_11_0= ruleNombreInterna ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5673:1: (lv_nombre_11_0= ruleNombreInterna )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5673:1: (lv_nombre_11_0= ruleNombreInterna )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5674:3: lv_nombre_11_0= ruleNombreInterna
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionesAccess().getNombreNombreInternaParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNombreInterna_in_ruleFunciones12770);
                    lv_nombre_11_0=ruleNombreInterna();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                    	        }
                           		set(
                           			current, 
                           			"nombre",
                            		lv_nombre_11_0, 
                            		"NombreInterna");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5690:2: ( (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )* )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( ((LA119_0>=RULE_ID && LA119_0<=RULE_CAR)||LA119_0==33||(LA119_0>=37 && LA119_0<=45)||LA119_0==50||LA119_0==106||(LA119_0>=114 && LA119_0<=115)) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5690:3: (otherlv_12= '-' )* (otherlv_13= 'no' )* ( (lv_operadores_14_0= ruleoperacion ) ) (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )*
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5690:3: (otherlv_12= '-' )*
                            loop114:
                            do {
                                int alt114=2;
                                int LA114_0 = input.LA(1);

                                if ( (LA114_0==50) ) {
                                    alt114=1;
                                }


                                switch (alt114) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5690:5: otherlv_12= '-'
                            	    {
                            	    otherlv_12=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFunciones12784); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getFuncionesAccess().getHyphenMinusKeyword_1_2_0());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop114;
                                }
                            } while (true);

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5694:3: (otherlv_13= 'no' )*
                            loop115:
                            do {
                                int alt115=2;
                                int LA115_0 = input.LA(1);

                                if ( (LA115_0==106) ) {
                                    alt115=1;
                                }


                                switch (alt115) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5694:5: otherlv_13= 'no'
                            	    {
                            	    otherlv_13=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFunciones12799); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getFuncionesAccess().getNoKeyword_1_2_1());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop115;
                                }
                            } while (true);

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5698:3: ( (lv_operadores_14_0= ruleoperacion ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5699:1: (lv_operadores_14_0= ruleoperacion )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5699:1: (lv_operadores_14_0= ruleoperacion )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5700:3: lv_operadores_14_0= ruleoperacion
                            {
                             
                            	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_2_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12822);
                            lv_operadores_14_0=ruleoperacion();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"operadores",
                                    		lv_operadores_14_0, 
                                    		"operacion");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5716:2: (otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) ) )*
                            loop118:
                            do {
                                int alt118=2;
                                int LA118_0 = input.LA(1);

                                if ( (LA118_0==29) ) {
                                    alt118=1;
                                }


                                switch (alt118) {
                            	case 1 :
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5716:4: otherlv_15= ',' (otherlv_16= '-' )* (otherlv_17= 'no' )* ( (lv_operadores_18_0= ruleoperacion ) )
                            	    {
                            	    otherlv_15=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFunciones12835); 

                            	        	newLeafNode(otherlv_15, grammarAccess.getFuncionesAccess().getCommaKeyword_1_2_3_0());
                            	        
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5720:1: (otherlv_16= '-' )*
                            	    loop116:
                            	    do {
                            	        int alt116=2;
                            	        int LA116_0 = input.LA(1);

                            	        if ( (LA116_0==50) ) {
                            	            alt116=1;
                            	        }


                            	        switch (alt116) {
                            	    	case 1 :
                            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5720:3: otherlv_16= '-'
                            	    	    {
                            	    	    otherlv_16=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleFunciones12848); 

                            	    	        	newLeafNode(otherlv_16, grammarAccess.getFuncionesAccess().getHyphenMinusKeyword_1_2_3_1());
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop116;
                            	        }
                            	    } while (true);

                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5724:3: (otherlv_17= 'no' )*
                            	    loop117:
                            	    do {
                            	        int alt117=2;
                            	        int LA117_0 = input.LA(1);

                            	        if ( (LA117_0==106) ) {
                            	            alt117=1;
                            	        }


                            	        switch (alt117) {
                            	    	case 1 :
                            	    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5724:5: otherlv_17= 'no'
                            	    	    {
                            	    	    otherlv_17=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleFunciones12863); 

                            	    	        	newLeafNode(otherlv_17, grammarAccess.getFuncionesAccess().getNoKeyword_1_2_3_2());
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    break loop117;
                            	        }
                            	    } while (true);

                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5728:3: ( (lv_operadores_18_0= ruleoperacion ) )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5729:1: (lv_operadores_18_0= ruleoperacion )
                            	    {
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5729:1: (lv_operadores_18_0= ruleoperacion )
                            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5730:3: lv_operadores_18_0= ruleoperacion
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFuncionesAccess().getOperadoresOperacionParserRuleCall_1_2_3_3_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleoperacion_in_ruleFunciones12886);
                            	    lv_operadores_18_0=ruleoperacion();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFuncionesRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"operadores",
                            	            		lv_operadores_18_0, 
                            	            		"operacion");
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
                            break;

                    }

                    otherlv_19=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFunciones12902); 

                        	newLeafNode(otherlv_19, grammarAccess.getFuncionesAccess().getRightParenthesisKeyword_1_3());
                        

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5758:1: entryRuleVariablesComplejas returns [EObject current=null] : iv_ruleVariablesComplejas= ruleVariablesComplejas EOF ;
    public final EObject entryRuleVariablesComplejas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesComplejas = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5759:2: (iv_ruleVariablesComplejas= ruleVariablesComplejas EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5760:2: iv_ruleVariablesComplejas= ruleVariablesComplejas EOF
            {
             newCompositeNode(grammarAccess.getVariablesComplejasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12939);
            iv_ruleVariablesComplejas=ruleVariablesComplejas();

            state._fsp--;

             current =iv_ruleVariablesComplejas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesComplejas12949); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5767:1: ruleVariablesComplejas returns [EObject current=null] : ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5770:28: ( ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )
            int alt124=3;
            alt124 = dfa124.predict(input);
            switch (alt124) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:2: ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:3: () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5771:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5772:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorVectorAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5777:2: ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5777:3: ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5777:3: ( (lv_nombre_vector_1_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5778:1: (lv_nombre_vector_1_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5778:1: (lv_nombre_vector_1_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5779:3: lv_nombre_vector_1_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_vectorEStringParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas13006);
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

                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas13018); 

                        	newLeafNode(otherlv_2, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_0_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5799:1: ( (lv_indice_3_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5800:1: (lv_indice_3_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5800:1: (lv_indice_3_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5801:3: lv_indice_3_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getIndiceOperacionIndiceParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13039);
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

                    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVariablesComplejas13051); 

                        	newLeafNode(otherlv_4, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_0_1_3());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5821:2: (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==46) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5821:4: otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) )
                            {
                            otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13065); 

                                	newLeafNode(otherlv_5, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_0_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5825:1: ( (lv_campo_6_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5826:1: (lv_campo_6_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5826:1: (lv_campo_6_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5827:3: lv_campo_6_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13086);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5844:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5844:6: ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5844:7: () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5844:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5845:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorMatrizAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5850:2: ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5850:3: ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5850:3: ( (lv_nombre_matriz_8_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5851:1: (lv_nombre_matriz_8_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5851:1: (lv_nombre_matriz_8_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5852:3: lv_nombre_matriz_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_matrizEStringParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas13127);
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

                    otherlv_9=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleVariablesComplejas13139); 

                        	newLeafNode(otherlv_9, grammarAccess.getVariablesComplejasAccess().getLeftSquareBracketKeyword_1_1_1());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5872:1: ( (lv_primerIndice_10_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5873:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5873:1: (lv_primerIndice_10_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5874:3: lv_primerIndice_10_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getPrimerIndiceOperacionIndiceParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13160);
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

                    otherlv_11=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleVariablesComplejas13172); 

                        	newLeafNode(otherlv_11, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketLeftSquareBracketKeyword_1_1_3());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5894:1: ( (lv_segundoIndice_12_0= ruleoperacionIndice ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5895:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5895:1: (lv_segundoIndice_12_0= ruleoperacionIndice )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5896:3: lv_segundoIndice_12_0= ruleoperacionIndice
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getSegundoIndiceOperacionIndiceParserRuleCall_1_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13193);
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

                    otherlv_13=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleVariablesComplejas13205); 

                        	newLeafNode(otherlv_13, grammarAccess.getVariablesComplejasAccess().getRightSquareBracketKeyword_1_1_5());
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5916:2: (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==46) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5916:4: otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) )
                            {
                            otherlv_14=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13219); 

                                	newLeafNode(otherlv_14, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_1_2_0());
                                
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5920:1: ( (lv_campo_15_0= ruleCampoRegistro ) )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5921:1: (lv_campo_15_0= ruleCampoRegistro )
                            {
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5921:1: (lv_campo_15_0= ruleCampoRegistro )
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5922:3: lv_campo_15_0= ruleCampoRegistro
                            {
                             
                            	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_1_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13240);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5939:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5939:6: ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5939:7: () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5939:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5940:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesComplejasAccess().getValorRegistroAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5945:2: ( (lv_nombre_registro_17_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5946:1: (lv_nombre_registro_17_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5946:1: (lv_nombre_registro_17_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5947:3: lv_nombre_registro_17_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getNombre_registroEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesComplejas13280);
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

                    otherlv_18=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13292); 

                        	newLeafNode(otherlv_18, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_2());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5967:1: ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5967:2: ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5967:2: ( (lv_campo_19_0= ruleCampoRegistro ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5968:1: (lv_campo_19_0= ruleCampoRegistro )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5968:1: (lv_campo_19_0= ruleCampoRegistro )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5969:3: lv_campo_19_0= ruleCampoRegistro
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13314);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5985:2: (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==46) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5985:4: otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    {
                    	    otherlv_20=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVariablesComplejas13327); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getVariablesComplejasAccess().getFullStopKeyword_2_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5989:1: ( (lv_campo_21_0= ruleCampoRegistro ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5990:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5990:1: (lv_campo_21_0= ruleCampoRegistro )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:5991:3: lv_campo_21_0= ruleCampoRegistro
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVariablesComplejasAccess().getCampoCampoRegistroParserRuleCall_2_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13348);
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
                    	    break loop123;
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6015:1: entryRuleVariablesBasicas returns [EObject current=null] : iv_ruleVariablesBasicas= ruleVariablesBasicas EOF ;
    public final EObject entryRuleVariablesBasicas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariablesBasicas = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6016:2: (iv_ruleVariablesBasicas= ruleVariablesBasicas EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6017:2: iv_ruleVariablesBasicas= ruleVariablesBasicas EOF
            {
             newCompositeNode(grammarAccess.getVariablesBasicasRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13388);
            iv_ruleVariablesBasicas=ruleVariablesBasicas();

            state._fsp--;

             current =iv_ruleVariablesBasicas; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariablesBasicas13398); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6024:1: ruleVariablesBasicas returns [EObject current=null] : ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6027:28: ( ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:1: ( ( () ( (lv_valor_1_0= ruleEInt ) ) ) | ( () ( (lv_valor_3_0= ruleEFloat ) ) ) | ( () ( (lv_contenido_5_0= RULE_CAD ) ) ) | ( () ( (lv_contenido_7_0= RULE_CAR ) ) ) | ( () ( (lv_valor_9_0= ruleBooleano ) ) ) | ( () ( (lv_nombre_11_0= ruleEString ) ) ) )
            int alt125=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA125_1 = input.LA(2);

                if ( (LA125_1==46) ) {
                    alt125=2;
                }
                else if ( (LA125_1==EOF||(LA125_1>=RULE_ID && LA125_1<=RULE_CAR)||(LA125_1>=19 && LA125_1<=20)||(LA125_1>=27 && LA125_1<=30)||(LA125_1>=32 && LA125_1<=34)||(LA125_1>=37 && LA125_1<=45)||(LA125_1>=49 && LA125_1<=51)||LA125_1==54||LA125_1==56||LA125_1==58||LA125_1==63||LA125_1==65||LA125_1==67||(LA125_1>=69 && LA125_1<=72)||(LA125_1>=74 && LA125_1<=105)||(LA125_1>=107 && LA125_1<=110)||(LA125_1>=114 && LA125_1<=115)) ) {
                    alt125=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_CAD:
                {
                alt125=3;
                }
                break;
            case RULE_CAR:
                {
                alt125=4;
                }
                break;
            case 114:
            case 115:
                {
                alt125=5;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt125=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:2: ( () ( (lv_valor_1_0= ruleEInt ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:3: () ( (lv_valor_1_0= ruleEInt ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6028:3: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6029:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroEnteroAction_0_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6034:2: ( (lv_valor_1_0= ruleEInt ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6035:1: (lv_valor_1_0= ruleEInt )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6035:1: (lv_valor_1_0= ruleEInt )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6036:3: lv_valor_1_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEIntParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleVariablesBasicas13454);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6053:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6053:6: ( () ( (lv_valor_3_0= ruleEFloat ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6053:7: () ( (lv_valor_3_0= ruleEFloat ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6053:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6054:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getNumeroDecimalAction_1_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6059:2: ( (lv_valor_3_0= ruleEFloat ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6060:1: (lv_valor_3_0= ruleEFloat )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6060:1: (lv_valor_3_0= ruleEFloat )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6061:3: lv_valor_3_0= ruleEFloat
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorEFloatParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleVariablesBasicas13492);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:6: ( () ( (lv_contenido_5_0= RULE_CAD ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:7: () ( (lv_contenido_5_0= RULE_CAD ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6078:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6079:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getConstCadenaAction_2_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6084:2: ( (lv_contenido_5_0= RULE_CAD ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6085:1: (lv_contenido_5_0= RULE_CAD )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6085:1: (lv_contenido_5_0= RULE_CAD )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6086:3: lv_contenido_5_0= RULE_CAD
                    {
                    lv_contenido_5_0=(Token)match(input,RULE_CAD,FollowSets000.FOLLOW_RULE_CAD_in_ruleVariablesBasicas13526); 

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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6103:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6103:6: ( () ( (lv_contenido_7_0= RULE_CAR ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6103:7: () ( (lv_contenido_7_0= RULE_CAR ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6103:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6104:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getCaracterAction_3_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6109:2: ( (lv_contenido_7_0= RULE_CAR ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6110:1: (lv_contenido_7_0= RULE_CAR )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6110:1: (lv_contenido_7_0= RULE_CAR )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6111:3: lv_contenido_7_0= RULE_CAR
                    {
                    lv_contenido_7_0=(Token)match(input,RULE_CAR,FollowSets000.FOLLOW_RULE_CAR_in_ruleVariablesBasicas13565); 

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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6128:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6128:6: ( () ( (lv_valor_9_0= ruleBooleano ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6128:7: () ( (lv_valor_9_0= ruleBooleano ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6128:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6129:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getValorBooleanoAction_4_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6134:2: ( (lv_valor_9_0= ruleBooleano ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6135:1: (lv_valor_9_0= ruleBooleano )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6135:1: (lv_valor_9_0= ruleBooleano )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6136:3: lv_valor_9_0= ruleBooleano
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getValorBooleanoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_ruleVariablesBasicas13608);
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
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6153:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6153:6: ( () ( (lv_nombre_11_0= ruleEString ) ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6153:7: () ( (lv_nombre_11_0= ruleEString ) )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6153:7: ()
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6154:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getVariablesBasicasAccess().getVariableIDAction_5_0(),
                                current);
                        

                    }

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6159:2: ( (lv_nombre_11_0= ruleEString ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6160:1: (lv_nombre_11_0= ruleEString )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6160:1: (lv_nombre_11_0= ruleEString )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6161:3: lv_nombre_11_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariablesBasicasAccess().getNombreEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVariablesBasicas13646);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6185:1: entryRuleSino returns [EObject current=null] : iv_ruleSino= ruleSino EOF ;
    public final EObject entryRuleSino() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSino = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6186:2: (iv_ruleSino= ruleSino EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6187:2: iv_ruleSino= ruleSino EOF
            {
             newCompositeNode(grammarAccess.getSinoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSino_in_entryRuleSino13683);
            iv_ruleSino=ruleSino();

            state._fsp--;

             current =iv_ruleSino; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSino13693); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6194:1: ruleSino returns [EObject current=null] : ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) ;
    public final EObject ruleSino() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sentencias_2_0 = null;

        EObject lv_sentencias_3_0 = null;

        EObject lv_devuelve_4_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6197:28: ( ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6198:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6198:1: ( () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6198:2: () otherlv_1= 'else' ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )? ( (lv_devuelve_4_0= ruleDevolver ) )?
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6198:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6199:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSinoAccess().getSinoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleSino13739); 

                	newLeafNode(otherlv_1, grammarAccess.getSinoAccess().getElseKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6208:1: ( ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( ((LA127_0>=RULE_ID && LA127_0<=RULE_NOMBRE_FUN)||LA127_0==RULE_STRING||LA127_0==32||LA127_0==34||(LA127_0>=37 && LA127_0<=45)||(LA127_0>=69 && LA127_0<=72)||(LA127_0>=75 && LA127_0<=76)||LA127_0==79||LA127_0==82||(LA127_0>=86 && LA127_0<=87)) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6208:2: ( (lv_sentencias_2_0= ruleSentencias ) ) ( (lv_sentencias_3_0= ruleSentencias ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6208:2: ( (lv_sentencias_2_0= ruleSentencias ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6209:1: (lv_sentencias_2_0= ruleSentencias )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6209:1: (lv_sentencias_2_0= ruleSentencias )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6210:3: lv_sentencias_2_0= ruleSentencias
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13761);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6226:2: ( (lv_sentencias_3_0= ruleSentencias ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( ((LA126_0>=RULE_ID && LA126_0<=RULE_NOMBRE_FUN)||LA126_0==RULE_STRING||LA126_0==32||LA126_0==34||(LA126_0>=37 && LA126_0<=45)||(LA126_0>=69 && LA126_0<=72)||(LA126_0>=75 && LA126_0<=76)||LA126_0==79||LA126_0==82||(LA126_0>=86 && LA126_0<=87)) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6227:1: (lv_sentencias_3_0= ruleSentencias )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6227:1: (lv_sentencias_3_0= ruleSentencias )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6228:3: lv_sentencias_3_0= ruleSentencias
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSinoAccess().getSentenciasSentenciasParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleSino13782);
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
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6244:5: ( (lv_devuelve_4_0= ruleDevolver ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==108) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6245:1: (lv_devuelve_4_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6245:1: (lv_devuelve_4_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6246:3: lv_devuelve_4_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getSinoAccess().getDevuelveDevolverParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleSino13806);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6270:1: entryRuleDevolver returns [EObject current=null] : iv_ruleDevolver= ruleDevolver EOF ;
    public final EObject entryRuleDevolver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevolver = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6271:2: (iv_ruleDevolver= ruleDevolver EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6272:2: iv_ruleDevolver= ruleDevolver EOF
            {
             newCompositeNode(grammarAccess.getDevolverRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_entryRuleDevolver13843);
            iv_ruleDevolver=ruleDevolver();

            state._fsp--;

             current =iv_ruleDevolver; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDevolver13853); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6279:1: ruleDevolver returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) ;
    public final EObject ruleDevolver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_devuelve_2_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6282:28: ( ( () otherlv_1= 'return' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6283:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6283:1: ( () otherlv_1= 'return' ( (lv_devuelve_2_0= ruleOperacionCompleta ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6283:2: () otherlv_1= 'return' ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6283:2: ()
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6284:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDevolverAccess().getDevolverAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleDevolver13899); 

                	newLeafNode(otherlv_1, grammarAccess.getDevolverAccess().getReturnKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6293:1: ( (lv_devuelve_2_0= ruleOperacionCompleta ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6294:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6294:1: (lv_devuelve_2_0= ruleOperacionCompleta )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6295:3: lv_devuelve_2_0= ruleOperacionCompleta
            {
             
            	        newCompositeNode(grammarAccess.getDevolverAccess().getDevuelveOperacionCompletaParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOperacionCompleta_in_ruleDevolver13920);
            lv_devuelve_2_0=ruleOperacionCompleta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDevolverRule());
            	        }
                   		set(
                   			current, 
                   			"devuelve",
                    		lv_devuelve_2_0, 
                    		"OperacionCompleta");
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6319:1: entryRuleParametroFuncion returns [EObject current=null] : iv_ruleParametroFuncion= ruleParametroFuncion EOF ;
    public final EObject entryRuleParametroFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametroFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6320:2: (iv_ruleParametroFuncion= ruleParametroFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6321:2: iv_ruleParametroFuncion= ruleParametroFuncion EOF
            {
             newCompositeNode(grammarAccess.getParametroFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13956);
            iv_ruleParametroFuncion=ruleParametroFuncion();

            state._fsp--;

             current =iv_ruleParametroFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParametroFuncion13966); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6328:1: ruleParametroFuncion returns [EObject current=null] : ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) ;
    public final EObject ruleParametroFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_paso_0_0 = null;

        EObject lv_tipo_1_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6331:28: ( ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6332:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6332:1: ( ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6332:2: ( (lv_paso_0_0= ruleTipoPaso ) ) ( (lv_tipo_1_0= ruleTipo ) ) otherlv_2= ': ' ( (lv_variable_3_0= ruleVariable ) )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6332:2: ( (lv_paso_0_0= ruleTipoPaso ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6333:1: (lv_paso_0_0= ruleTipoPaso )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6333:1: (lv_paso_0_0= ruleTipoPaso )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6334:3: lv_paso_0_0= ruleTipoPaso
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getPasoTipoPasoParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_ruleParametroFuncion14012);
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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6350:2: ( (lv_tipo_1_0= ruleTipo ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6351:1: (lv_tipo_1_0= ruleTipo )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6351:1: (lv_tipo_1_0= ruleTipo )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6352:3: lv_tipo_1_0= ruleTipo
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getTipoTipoParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipo_in_ruleParametroFuncion14033);
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

            otherlv_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleParametroFuncion14045); 

                	newLeafNode(otherlv_2, grammarAccess.getParametroFuncionAccess().getColonSpaceKeyword_2());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6372:1: ( (lv_variable_3_0= ruleVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6373:1: (lv_variable_3_0= ruleVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6373:1: (lv_variable_3_0= ruleVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6374:3: lv_variable_3_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getParametroFuncionAccess().getVariableVariableParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleParametroFuncion14066);
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6398:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6399:2: (iv_ruleFuncion= ruleFuncion EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6400:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuncion_in_entryRuleFuncion14102);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuncion14112); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6407:1: ruleFuncion returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'initiation' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'end_function' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6410:28: ( ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'initiation' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'end_function' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6411:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'initiation' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'end_function' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6411:1: ( ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'initiation' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'end_function' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6411:2: ( (lv_tipo_0_0= ruleTipoVariable ) ) otherlv_1= 'function' ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )? otherlv_6= ')' (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )? otherlv_9= 'initiation' ( (lv_sentencias_10_0= ruleSentencias ) )* ( (lv_devuelve_11_0= ruleDevolver ) )? otherlv_12= 'end_function'
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6411:2: ( (lv_tipo_0_0= ruleTipoVariable ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6412:1: (lv_tipo_0_0= ruleTipoVariable )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6412:1: (lv_tipo_0_0= ruleTipoVariable )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6413:3: lv_tipo_0_0= ruleTipoVariable
            {
             
            	        newCompositeNode(grammarAccess.getFuncionAccess().getTipoTipoVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTipoVariable_in_ruleFuncion14158);
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

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFuncion14170); 

                	newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFunctionKeyword_1());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6433:1: ( (lv_nombre_2_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6434:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6434:1: (lv_nombre_2_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6435:3: lv_nombre_2_0= RULE_NOMBRE_FUN
            {
            lv_nombre_2_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleFuncion14187); 

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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6451:2: ( ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )* )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=111 && LA130_0<=113)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6451:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) ) (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6451:3: ( (lv_parametrofuncion_3_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6452:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6452:1: (lv_parametrofuncion_3_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6453:3: lv_parametrofuncion_3_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion14214);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6469:2: (otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) ) )*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==29) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6469:4: otherlv_4= ',' ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFuncion14227); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFuncionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6473:1: ( (lv_parametrofuncion_5_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6474:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6474:1: (lv_parametrofuncion_5_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6475:3: lv_parametrofuncion_5_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getParametrofuncionParametroFuncionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleFuncion14248);
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
                    	    break loop129;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleFuncion14264); 

                	newLeafNode(otherlv_6, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_4());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6495:1: (otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )* )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==20) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6495:3: otherlv_7= 'var' ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuncion14277); 

                        	newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getVarKeyword_5_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6499:1: ( (lv_declaracion_8_0= ruleDeclaracion ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==RULE_ID||LA131_0==RULE_STRING||(LA131_0>=90 && LA131_0<=94)) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6500:1: (lv_declaracion_8_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6500:1: (lv_declaracion_8_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6501:3: lv_declaracion_8_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFuncionAccess().getDeclaracionDeclaracionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleFuncion14298);
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
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleFuncion14313); 

                	newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getInitiationKeyword_6());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6521:1: ( (lv_sentencias_10_0= ruleSentencias ) )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( ((LA133_0>=RULE_ID && LA133_0<=RULE_NOMBRE_FUN)||LA133_0==RULE_STRING||LA133_0==32||LA133_0==34||(LA133_0>=37 && LA133_0<=45)||(LA133_0>=69 && LA133_0<=72)||(LA133_0>=75 && LA133_0<=76)||LA133_0==79||LA133_0==82||(LA133_0>=86 && LA133_0<=87)) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6522:1: (lv_sentencias_10_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6522:1: (lv_sentencias_10_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6523:3: lv_sentencias_10_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFuncionAccess().getSentenciasSentenciasParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleFuncion14334);
            	    lv_sentencias_10_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sentencias",
            	            		lv_sentencias_10_0, 
            	            		"Sentencias");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6539:3: ( (lv_devuelve_11_0= ruleDevolver ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==108) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6540:1: (lv_devuelve_11_0= ruleDevolver )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6540:1: (lv_devuelve_11_0= ruleDevolver )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6541:3: lv_devuelve_11_0= ruleDevolver
                    {
                     
                    	        newCompositeNode(grammarAccess.getFuncionAccess().getDevuelveDevolverParserRuleCall_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDevolver_in_ruleFuncion14356);
                    lv_devuelve_11_0=ruleDevolver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	        }
                           		set(
                           			current, 
                           			"devuelve",
                            		lv_devuelve_11_0, 
                            		"Devolver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleFuncion14369); 

                	newLeafNode(otherlv_12, grammarAccess.getFuncionAccess().getEnd_functionKeyword_9());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6569:1: entryRuleProcedimiento returns [EObject current=null] : iv_ruleProcedimiento= ruleProcedimiento EOF ;
    public final EObject entryRuleProcedimiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimiento = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6570:2: (iv_ruleProcedimiento= ruleProcedimiento EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6571:2: iv_ruleProcedimiento= ruleProcedimiento EOF
            {
             newCompositeNode(grammarAccess.getProcedimientoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14405);
            iv_ruleProcedimiento=ruleProcedimiento();

            state._fsp--;

             current =iv_ruleProcedimiento; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcedimiento14415); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6578:1: ruleProcedimiento returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'initiation' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'end_procedure' ) ;
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
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6581:28: ( (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'initiation' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'end_procedure' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6582:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'initiation' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'end_procedure' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6582:1: (otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'initiation' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'end_procedure' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6582:3: otherlv_0= 'procedure' ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) ) ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )? otherlv_5= ')' (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )? otherlv_8= 'initiation' ( (lv_sentencias_9_0= ruleSentencias ) )* otherlv_10= 'end_procedure'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleProcedimiento14452); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedimientoAccess().getProcedureKeyword_0());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6586:1: ( (lv_nombre_1_0= RULE_NOMBRE_FUN ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6587:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6587:1: (lv_nombre_1_0= RULE_NOMBRE_FUN )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6588:3: lv_nombre_1_0= RULE_NOMBRE_FUN
            {
            lv_nombre_1_0=(Token)match(input,RULE_NOMBRE_FUN,FollowSets000.FOLLOW_RULE_NOMBRE_FUN_in_ruleProcedimiento14469); 

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

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6604:2: ( ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=111 && LA136_0<=113)) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6604:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) ) (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6604:3: ( (lv_parametrofuncion_2_0= ruleParametroFuncion ) )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6605:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6605:1: (lv_parametrofuncion_2_0= ruleParametroFuncion )
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6606:3: lv_parametrofuncion_2_0= ruleParametroFuncion
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14496);
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

                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6622:2: (otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==29) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6622:4: otherlv_3= ',' ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleProcedimiento14509); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getProcedimientoAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6626:1: ( (lv_parametrofuncion_4_0= ruleParametroFuncion ) )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6627:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6627:1: (lv_parametrofuncion_4_0= ruleParametroFuncion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6628:3: lv_parametrofuncion_4_0= ruleParametroFuncion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getParametrofuncionParametroFuncionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14530);
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
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleProcedimiento14546); 

                	newLeafNode(otherlv_5, grammarAccess.getProcedimientoAccess().getRightParenthesisKeyword_3());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6648:1: (otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )* )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==20) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6648:3: otherlv_6= 'var' ( (lv_declaracion_7_0= ruleDeclaracion ) )*
                    {
                    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleProcedimiento14559); 

                        	newLeafNode(otherlv_6, grammarAccess.getProcedimientoAccess().getVarKeyword_4_0());
                        
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6652:1: ( (lv_declaracion_7_0= ruleDeclaracion ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==RULE_ID||LA137_0==RULE_STRING||(LA137_0>=90 && LA137_0<=94)) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6653:1: (lv_declaracion_7_0= ruleDeclaracion )
                    	    {
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6653:1: (lv_declaracion_7_0= ruleDeclaracion )
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6654:3: lv_declaracion_7_0= ruleDeclaracion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getDeclaracionDeclaracionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaracion_in_ruleProcedimiento14580);
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
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleProcedimiento14595); 

                	newLeafNode(otherlv_8, grammarAccess.getProcedimientoAccess().getInitiationKeyword_5());
                
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6674:1: ( (lv_sentencias_9_0= ruleSentencias ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( ((LA139_0>=RULE_ID && LA139_0<=RULE_NOMBRE_FUN)||LA139_0==RULE_STRING||LA139_0==32||LA139_0==34||(LA139_0>=37 && LA139_0<=45)||(LA139_0>=69 && LA139_0<=72)||(LA139_0>=75 && LA139_0<=76)||LA139_0==79||LA139_0==82||(LA139_0>=86 && LA139_0<=87)) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6675:1: (lv_sentencias_9_0= ruleSentencias )
            	    {
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6675:1: (lv_sentencias_9_0= ruleSentencias )
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6676:3: lv_sentencias_9_0= ruleSentencias
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedimientoAccess().getSentenciasSentenciasParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSentencias_in_ruleProcedimiento14616);
            	    lv_sentencias_9_0=ruleSentencias();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedimientoRule());
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
            	    break loop139;
                }
            } while (true);

            otherlv_10=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleProcedimiento14629); 

                	newLeafNode(otherlv_10, grammarAccess.getProcedimientoAccess().getEnd_procedureKeyword_7());
                

            }


            }

             leaveRule(); 
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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6704:1: entryRuleTipoPaso returns [String current=null] : iv_ruleTipoPaso= ruleTipoPaso EOF ;
    public final String entryRuleTipoPaso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoPaso = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6705:2: (iv_ruleTipoPaso= ruleTipoPaso EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6706:2: iv_ruleTipoPaso= ruleTipoPaso EOF
            {
             newCompositeNode(grammarAccess.getTipoPasoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14666);
            iv_ruleTipoPaso=ruleTipoPaso();

            state._fsp--;

             current =iv_ruleTipoPaso.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTipoPaso14677); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6713:1: ruleTipoPaso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'I' | kw= 'I/O' | kw= 'O' ) ;
    public final AntlrDatatypeRuleToken ruleTipoPaso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6716:28: ( (kw= 'I' | kw= 'I/O' | kw= 'O' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6717:1: (kw= 'I' | kw= 'I/O' | kw= 'O' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6717:1: (kw= 'I' | kw= 'I/O' | kw= 'O' )
            int alt140=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt140=1;
                }
                break;
            case 112:
                {
                alt140=2;
                }
                break;
            case 113:
                {
                alt140=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6718:2: kw= 'I'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleTipoPaso14715); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getIKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6725:2: kw= 'I/O'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleTipoPaso14734); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getIOKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6732:2: kw= 'O'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleTipoPaso14753); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTipoPasoAccess().getOKeyword_2()); 
                        

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6745:1: entryRuleBooleano returns [String current=null] : iv_ruleBooleano= ruleBooleano EOF ;
    public final String entryRuleBooleano() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleano = null;


        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6746:2: (iv_ruleBooleano= ruleBooleano EOF )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6747:2: iv_ruleBooleano= ruleBooleano EOF
            {
             newCompositeNode(grammarAccess.getBooleanoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleano_in_entryRuleBooleano14794);
            iv_ruleBooleano=ruleBooleano();

            state._fsp--;

             current =iv_ruleBooleano.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleano14805); 

            }

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
    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6754:1: ruleBooleano returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBooleano() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6757:28: ( (kw= 'true' | kw= 'false' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6758:1: (kw= 'true' | kw= 'false' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6758:1: (kw= 'true' | kw= 'false' )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==114) ) {
                alt141=1;
            }
            else if ( (LA141_0==115) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6759:2: kw= 'true'
                    {
                    kw=(Token)match(input,114,FollowSets000.FOLLOW_114_in_ruleBooleano14843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBooleanoAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6766:2: kw= 'false'
                    {
                    kw=(Token)match(input,115,FollowSets000.FOLLOW_115_in_ruleBooleano14862); 

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
    // $ANTLR end "ruleBooleano"

    // Delegated rules


    protected DFA31 dfa31 = new DFA31(this);
    protected DFA124 dfa124 = new DFA124(this);
    static final String DFA31_eotS =
        "\12\uffff";
    static final String DFA31_eofS =
        "\12\uffff";
    static final String DFA31_minS =
        "\1\4\4\uffff\2\63\1\4\2\uffff";
    static final String DFA31_maxS =
        "\1\75\4\uffff\2\63\1\76\2\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\1\5";
    static final String DFA31_specialS =
        "\12\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\6\2\uffff\1\5\54\uffff\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\7",
            "\1\7",
            "\1\10\1\uffff\2\10\66\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "819:1: (this_Vector_0= ruleVector | this_Matriz_1= ruleMatriz | this_Registro_2= ruleRegistro | this_Archivo_3= ruleArchivo | this_Enumerado_4= ruleEnumerado | this_Subrango_5= ruleSubrango )";
        }
    }
    static final String DFA124_eotS =
        "\u0172\uffff";
    static final String DFA124_eofS =
        "\u0172\uffff";
    static final String DFA124_minS =
        "\1\4\2\56\1\4\1\uffff\3\61\15\4\2\uffff\22\61\50\4\55\61\70\4\74\61\52\4\55\61\21\4\22\61\3\4\3\61";
    static final String DFA124_maxS =
        "\1\7\2\65\1\7\1\uffff\3\151\15\7\2\uffff\22\151\50\7\55\151\70\7\74\151\52\7\55\151\21\7\22\151\3\7\3\151";
    static final String DFA124_acceptS =
        "\4\uffff\1\3\20\uffff\1\1\1\2\u015b\uffff";
    static final String DFA124_specialS =
        "\u0172\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\4\6\uffff\1\3",
            "\1\4\6\uffff\1\3",
            "\1\7\1\uffff\1\5\1\6",
            "",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
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
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\10\1\11\1\uffff\1\12",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
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
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\13\1\14\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\51\1\52\1\uffff\1\53",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\54\1\55\1\uffff\1\56",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\61\1\62\1\uffff\1\63",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\72\1\73\1\uffff\1\74",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\105\1\106\1\uffff\1\107",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
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
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\57\1\60\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\15\1\16\1\17\1\20\1\176\1\177\1\uffff\1\u0080",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\64\1\65\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0081\1\u0082\1\uffff\1\u0083",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u0084\1\u0085\1\uffff\1\u0086",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\75\1\76\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u0089\1\u008a\1\uffff\1\u008b",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u008c\1\u008d\1\uffff\1\u008e",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0091\1\u0092\1\uffff\1\u0093",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\110\1\111\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009a\1\u009b\1\uffff\1\u009c",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u009d\1\u009e\1\uffff\1\u009f",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u00a2\1\u00a3\1\uffff\1\u00a4",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00ab\1\u00ac\1\uffff\1\u00ad",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
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
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u0087\1\u0088\1\21\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\22\1\66\1\67\1\70\1\71\1\u00f2\1\u00f3\1\uffff\1\u00f4",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u008f\1\u0090\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\77\1\100\1\101\1\102\1\u00f5\1\u00f6\1\uffff\1\u00f7",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u0094\1\u0095\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00f8\1\u00f9\1\uffff\1\u00fa",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u00fb\1\u00fc\1\uffff\1\u00fd",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a0\1\u00a1\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\112\1\113\1\114\1\115\1\u0100\1\u0101\1\uffff\1\u0102",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u00a5\1\u00a6\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0103\1\u0104\1\uffff\1\u0105",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u0106\1\u0107\1\uffff\1\u0108",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u00ae\1\u00af\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010b\1\u010c\1\uffff\1\u010d",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u010e\1\u010f\1\uffff\1\u0110",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0113\1\u0114\1\uffff\1\u0115",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
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
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u00fe\1\u00ff\1\103\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\23\1\104\1\u0096\1\u0097\1\u0098\1\u0099\1\u0149\1\u014a\1\uffff\1\u014b",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0109\1\u010a\1\116\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\117\1\u00a7\1\u00a8\1\u00a9\1\u00aa\1\u014c\1\u014d\1\uffff\1\u014e",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0111\1\u0112\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u014f\1\u0150\1\uffff\1\u0151",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0116\1\u0117\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0152\1\u0153\1\uffff\1\u0154",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u0155\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0171\1\uffff\1\u016f\1\u0170",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e",
            "\1\u0158\1\u0159\1\u00b4\2\uffff\1\25\3\uffff\1\26\44\uffff\1\24\1\120\1\u00b5\1\u0118\1\u0119\1\u011a\1\u011b\1\u016c\1\u016d\1\uffff\1\u016e"
    };

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "5771:1: ( ( () ( ( (lv_nombre_vector_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_indice_3_0= ruleoperacionIndice ) ) otherlv_4= ']' ) (otherlv_5= '.' ( (lv_campo_6_0= ruleCampoRegistro ) ) )? ) | ( () ( ( (lv_nombre_matriz_8_0= ruleEString ) ) otherlv_9= '[' ( (lv_primerIndice_10_0= ruleoperacionIndice ) ) otherlv_11= '][' ( (lv_segundoIndice_12_0= ruleoperacionIndice ) ) otherlv_13= ']' ) (otherlv_14= '.' ( (lv_campo_15_0= ruleCampoRegistro ) ) )? ) | ( () ( (lv_nombre_registro_17_0= ruleEString ) ) otherlv_18= '.' ( ( (lv_campo_19_0= ruleCampoRegistro ) ) (otherlv_20= '.' ( (lv_campo_21_0= ruleCampoRegistro ) ) )* ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCodigo_in_entryRuleCodigo75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCodigo85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_ruleCodigo132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_ruleCodigo159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAlgoritmo_in_entryRuleAlgoritmo194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAlgoritmo204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAlgoritmo241 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAlgoritmo262 = new BitSet(new long[]{0x00000000101D0000L,0x000000007C000002L});
        public static final BitSet FOLLOW_16_in_ruleAlgoritmo275 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAlgoritmo295 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleAlgoritmo308 = new BitSet(new long[]{0x00000000101D0000L,0x000000007C000002L});
        public static final BitSet FOLLOW_18_in_ruleAlgoritmo323 = new BitSet(new long[]{0x00000000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleAlgoritmo344 = new BitSet(new long[]{0x00000000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_19_in_ruleAlgoritmo360 = new BitSet(new long[]{0x2A100000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleAlgoritmo381 = new BitSet(new long[]{0x2A100000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_20_in_ruleAlgoritmo397 = new BitSet(new long[]{0x00000000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleAlgoritmo418 = new BitSet(new long[]{0x00000000101D0090L,0x000000007C000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleAlgoritmo442 = new BitSet(new long[]{0x00000000101D0000L,0x000000007C000002L});
        public static final BitSet FOLLOW_ruleInicio_in_ruleAlgoritmo464 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAlgoritmo476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModulo_in_entryRuleModulo512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModulo522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleModulo559 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo576 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleModulo593 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModulo613 = new BitSet(new long[]{0x0000000000020010L});
        public static final BitSet FOLLOW_17_in_ruleModulo626 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleModulo638 = new BitSet(new long[]{0x00000000111C0000L,0x000000007C000000L});
        public static final BitSet FOLLOW_18_in_ruleModulo651 = new BitSet(new long[]{0x0000000011180090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo672 = new BitSet(new long[]{0x0000000011180090L,0x000000007C000000L});
        public static final BitSet FOLLOW_19_in_ruleModulo688 = new BitSet(new long[]{0x0000000011100090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleEString_in_ruleModulo709 = new BitSet(new long[]{0x0000000011100090L,0x000000007C000000L});
        public static final BitSet FOLLOW_20_in_ruleModulo725 = new BitSet(new long[]{0x0000000011000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleModulo746 = new BitSet(new long[]{0x0000000011000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_ruleModulo770 = new BitSet(new long[]{0x0000000011000000L,0x000000007C000000L});
        public static final BitSet FOLLOW_24_in_ruleModulo783 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleImplementacion_in_ruleModulo804 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleModulo816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementacion_in_entryRuleImplementacion852 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementacion862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleImplementacion908 = new BitSet(new long[]{0x00000000181C0000L,0x000000007C000000L});
        public static final BitSet FOLLOW_18_in_ruleImplementacion921 = new BitSet(new long[]{0x0000000018180090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleConstantes_in_ruleImplementacion942 = new BitSet(new long[]{0x0000000018180090L,0x000000007C000000L});
        public static final BitSet FOLLOW_19_in_ruleImplementacion958 = new BitSet(new long[]{0x2A10000018100090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_ruleImplementacion979 = new BitSet(new long[]{0x2A10000018100090L,0x000000007C000000L});
        public static final BitSet FOLLOW_20_in_ruleImplementacion995 = new BitSet(new long[]{0x0000000018000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleImplementacion1016 = new BitSet(new long[]{0x0000000018000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleSubproceso_in_ruleImplementacion1040 = new BitSet(new long[]{0x0000000018000000L,0x000000007C000000L});
        public static final BitSet FOLLOW_27_in_ruleImplementacion1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraSubproceso_in_entryRuleCabeceraSubproceso1089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraSubproceso1099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_ruleCabeceraSubproceso1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_ruleCabeceraSubproceso1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraProcedimiento_in_entryRuleCabeceraProcedimiento1208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraProcedimiento1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCabeceraProcedimiento1255 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraProcedimiento1272 = new BitSet(new long[]{0x0000000040000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1299 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraProcedimiento1312 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraProcedimiento1333 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraProcedimiento1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCabeceraFuncion_in_entryRuleCabeceraFuncion1385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCabeceraFuncion1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleCabeceraFuncion1441 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCabeceraFuncion1453 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleCabeceraFuncion1470 = new BitSet(new long[]{0x0000000040000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1497 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleCabeceraFuncion1510 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleCabeceraFuncion1531 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleCabeceraFuncion1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoComplejo_in_entryRuleTipoComplejo1583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoComplejo1593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_ruleTipoComplejo1640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_ruleTipoComplejo1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_ruleTipoComplejo1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_ruleTipoComplejo1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_ruleTipoComplejo1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_ruleTipoComplejo1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubproceso_in_entryRuleSubproceso1810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubproceso1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_ruleSubproceso1867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_ruleSubproceso1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSentencias_in_entryRuleSentencias1931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSentencias1941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_ruleSentencias1988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_ruleSentencias2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_ruleSentencias2042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_ruleSentencias2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_ruleSentencias2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_ruleSentencias2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_ruleSentencias2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBloque_in_entryRuleBloque2185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBloque2195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_ruleBloque2242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_ruleBloque2269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_ruleBloque2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_ruleBloque2323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_ruleBloque2350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_entryRuleDeclaracion2385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracion2395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_ruleDeclaracion2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_ruleDeclaracion2469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroAbrir_in_entryRuleFuncionFicheroAbrir2504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroAbrir2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFuncionFicheroAbrir2551 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroAbrir2563 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir2585 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir2597 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_ruleModoApertura_in_ruleFuncionFicheroAbrir2618 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncionFicheroAbrir2630 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroAbrir2651 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroAbrir2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncionFicheroCerrar_in_entryRuleFuncionFicheroCerrar2700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncionFicheroCerrar2710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFuncionFicheroCerrar2747 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleFuncionFicheroCerrar2759 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleFuncionFicheroCerrar2780 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncionFicheroCerrar2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModoApertura_in_entryRuleModoApertura2829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModoApertura2840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleModoApertura2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleModoApertura2897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_entryRuleNombreInterna2938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNombreInterna2949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleNombreInterna2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNombreInterna3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNombreInterna3025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNombreInterna3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleNombreInterna3063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleNombreInterna3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleNombreInterna3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleNombreInterna3120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleNombreInterna3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt3180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt3191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat3275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3326 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleEFloat3344 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3359 = new BitSet(new long[]{0x0001800000000002L});
        public static final BitSet FOLLOW_47_in_ruleEFloat3379 = new BitSet(new long[]{0x0006000000000040L});
        public static final BitSet FOLLOW_48_in_ruleEFloat3398 = new BitSet(new long[]{0x0006000000000040L});
        public static final BitSet FOLLOW_49_in_ruleEFloat3413 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_50_in_ruleEFloat3432 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat3449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_entryRuleCampoRegistro3496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCampoRegistro3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCampoRegistro3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipo_in_entryRuleTipo3586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipo3596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_ruleTipo3643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_ruleTipo3670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoDefinido_in_entryRuleTipoDefinido3705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoDefinido3715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTipoDefinido3760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoExistente_in_entryRuleTipoExistente3795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoExistente3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleTipoExistente3850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantes_in_entryRuleConstantes3885 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantes3895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleConstantes3941 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleConstantes3953 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleConstantes3974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVector4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleVector4057 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVector4069 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleVector4090 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVector4102 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleVector4114 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleVector4135 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleVector4147 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVector4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMatriz_in_entryRuleMatriz4204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMatriz4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleMatriz4251 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleMatriz4263 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4284 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleMatriz4296 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMatriz4317 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleMatriz4329 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleMatriz4341 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleMatriz4362 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleMatriz4374 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMatriz4395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegistro_in_entryRuleRegistro4431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegistro4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleRegistro4478 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRegistro4499 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleRegistro4520 = new BitSet(new long[]{0x1000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_60_in_ruleRegistro4533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArchivo_in_entryRuleArchivo4569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArchivo4579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleArchivo4616 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleArchivo4637 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleArchivo4649 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArchivo4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerado_in_entryRuleEnumerado4706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerado4716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumerado4762 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleEnumerado4774 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_62_in_ruleEnumerado4786 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado4808 = new BitSet(new long[]{0x8000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleEnumerado4821 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEnumerado4842 = new BitSet(new long[]{0x8000000020000000L});
        public static final BitSet FOLLOW_63_in_ruleEnumerado4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrango_in_entryRuleSubrango4893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrango4903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_ruleSubrango4950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_ruleSubrango4977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoNumerico_in_entryRuleSubrangoNumerico5012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoNumerico5022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoNumerico5068 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSubrangoNumerico5080 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleSubrangoNumerico5114 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubrangoNumerico5135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangoEnumerado_in_entryRuleSubrangoEnumerado5172 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangoEnumerado5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5228 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSubrangoEnumerado5240 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleSubrangoEnumerado5274 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSubrangoEnumerado5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInicio_in_entryRuleInicio5332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInicio5342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleInicio5379 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInicio5400 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleInicio5421 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_66_in_ruleInicio5434 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C499E8L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleInicio5455 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C499E8L});
        public static final BitSet FOLLOW_67_in_ruleInicio5468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5505 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaracionVariable_in_entryRuleDeclaracionVariable5627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionVariable5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleDeclaracionVariable5683 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDeclaracionVariable5695 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5716 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionVariable5729 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionVariable5750 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleDeclaracionPropia_in_entryRuleDeclaracionPropia5788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaracionPropia5798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDeclaracionPropia5844 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleDeclaracionPropia5856 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5877 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleDeclaracionPropia5890 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleDeclaracionPropia5911 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleAsignacion_in_entryRuleAsignacion5949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacion5959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruleAsignacion6006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_ruleAsignacion6033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_entryRuleAsignacionNormal6068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionNormal6078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsignacionNormal6124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleAsignacionNormal6136 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_ruleAsignacionNormal6157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsignacionCompleja_in_entryRuleAsignacionCompleja6193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsignacionCompleja6203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_ruleAsignacionCompleja6249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleAsignacionCompleja6261 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_ruleAsignacionCompleja6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEscribir_in_entryRuleEscribir6318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEscribir6328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleEscribir6365 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6386 = new BitSet(new long[]{0x00043FE2600003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_29_in_ruleEscribir6400 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleEscribir6421 = new BitSet(new long[]{0x00043FE2600003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleEscribir6449 = new BitSet(new long[]{0x00043FE2600003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_30_in_ruleEscribir6463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLeer_in_entryRuleLeer6499 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLeer6509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleLeer6546 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer6567 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleLeer6580 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleLeer6601 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleLeer6615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSi_in_entryRuleSi6651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSi6661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleSi6700 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleSi6712 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_72_in_ruleSi6731 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_ruleSi6753 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSi6765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleSi6777 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000180000C49DE0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSi6798 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000180000C49DE0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSi6820 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000400L});
        public static final BitSet FOLLOW_ruleSino_in_ruleSi6842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_74_in_ruleSi6855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemientras_in_entryRulemientras6891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemientras6901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_rulemientras6940 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulemientras6952 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_76_in_rulemientras6971 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_rulemientras6993 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulemientras7005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_rulemientras7017 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C4D9E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulemientras7038 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C4D9E0L});
        public static final BitSet FOLLOW_78_in_rulemientras7051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulerepetir_in_entryRulerepetir7087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulerepetir7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulerepetir7134 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C799E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulerepetir7155 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000C799E0L});
        public static final BitSet FOLLOW_80_in_rulerepetir7170 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulerepetir7182 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_81_in_rulerepetir7201 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_rulerepetir7223 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulerepetir7235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledesde_in_entryRuledesde7271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledesde7281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruledesde7318 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleAsignacionNormal_in_ruledesde7339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_83_in_ruledesde7351 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_ruledesde7372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_ruledesde7384 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000D499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruledesde7405 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000000000D499E0L});
        public static final BitSet FOLLOW_84_in_ruledesde7418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCaso_in_entryRuleCaso7454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCaso7464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleCaso7501 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C000000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleCaso7522 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleCaso7534 = new BitSet(new long[]{0x00003FE5000000B2L,0x0000100000C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleCaso7555 = new BitSet(new long[]{0x00003FE5000000B2L,0x0000100000C499E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleCaso7577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesegun_in_entryRulesegun7614 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesegun7624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_rulesegun7663 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_rulesegun7675 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_87_in_rulesegun7694 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_rulesegun7716 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulesegun7728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_77_in_rulesegun7740 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
        public static final BitSet FOLLOW_ruleCaso_in_rulesegun7761 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
        public static final BitSet FOLLOW_88_in_rulesegun7774 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000100002C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_rulesegun7795 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000100002C499E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_rulesegun7817 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_89_in_rulesegun7830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_entryRuleTipoVariable7867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoVariable7878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleTipoVariable7916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleTipoVariable7935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleTipoVariable7954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleTipoVariable7973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleTipoVariable7992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable8042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariable8097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoOr_in_entryRulesignoOr8136 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoOr8147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_rulesignoOr8184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoAnd_in_entryRulesignoAnd8224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoAnd8235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_96_in_rulesignoAnd8272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_entryRulesignoIgualdad8312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoIgualdad8323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulesignoIgualdad8361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_97_in_rulesignoIgualdad8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_entryRulesignoComparacion8421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoComparacion8432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_98_in_rulesignoComparacion8470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_99_in_rulesignoComparacion8489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_100_in_rulesignoComparacion8508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_101_in_rulesignoComparacion8527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_entryRulesignoSuma8568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoSuma8579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rulesignoSuma8616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoResta_in_entryRulesignoResta8656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoResta8667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rulesignoResta8704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_entryRulesignoMultiplicacion8744 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoMultiplicacion8755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_102_in_rulesignoMultiplicacion8792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDivision_in_entryRulesignoDivision8832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDivision8843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_103_in_rulesignoDivision8880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoModulo_in_entryRulesignoModulo8920 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoModulo8931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_rulesignoModulo8968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignoDiv_in_entryRulesignoDiv9008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignoDiv9019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_105_in_rulesignoDiv9056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoperacion_in_entryRuleoperacion9095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacion9105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_ruleoperacion9151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr9185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr9195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9242 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOr9272 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleOr9290 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleOr9322 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleAnd_in_ruleOr9357 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd9395 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd9405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd9452 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAnd9482 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleAnd9500 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleAnd9532 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleMod_in_ruleAnd9567 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_ruleMod_in_entryRuleMod9605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMod9615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod9662 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_rulesignoModulo_in_ruleMod9692 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleMod9710 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleMod9742 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_ruleMod9777 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_ruleIgualdad_in_entryRuleIgualdad9815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdad9825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad9872 = new BitSet(new long[]{0x0008000000000002L,0x0000000200000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdad9902 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleIgualdad9920 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleIgualdad9952 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_ruleIgualdad9987 = new BitSet(new long[]{0x0008000000000002L,0x0000000200000000L});
        public static final BitSet FOLLOW_ruleComparacion_in_entryRuleComparacion10025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacion10035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10082 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacion10112 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleComparacion10130 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleComparacion10162 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_ruleComparacion10197 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
        public static final BitSet FOLLOW_ruleSumaResta_in_entryRuleSumaResta10235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaResta10245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10292 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaResta10324 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaResta10362 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleSumaResta10382 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleSumaResta10414 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_ruleSumaResta10449 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivision_in_entryRuleMultiplicacionDivision10487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivision10497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10544 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivision10576 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivision10614 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivision10652 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleMultiplicacionDivision10672 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleMultiplicacionDivision10704 = new BitSet(new long[]{0x00003FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_rulePrimaria_in_ruleMultiplicacionDivision10739 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_entryRuleoperacionIndice10777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleoperacionIndice10787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_ruleoperacionIndice10833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrIndice_in_entryRuleOrIndice10867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrIndice10877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice10924 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_rulesignoOr_in_ruleOrIndice10954 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleAndIndice_in_ruleOrIndice10975 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
        public static final BitSet FOLLOW_ruleAndIndice_in_entryRuleAndIndice11013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndIndice11023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11070 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_rulesignoAnd_in_ruleAndIndice11100 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_ruleAndIndice11121 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_ruleIgualdadIndice_in_entryRuleIgualdadIndice11159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIgualdadIndice11169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11216 = new BitSet(new long[]{0x0008000000000002L,0x0000000200000000L});
        public static final BitSet FOLLOW_rulesignoIgualdad_in_ruleIgualdadIndice11246 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_ruleIgualdadIndice11267 = new BitSet(new long[]{0x0008000000000002L,0x0000000200000000L});
        public static final BitSet FOLLOW_ruleComparacionIndice_in_entryRuleComparacionIndice11305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparacionIndice11315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11362 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
        public static final BitSet FOLLOW_rulesignoComparacion_in_ruleComparacionIndice11392 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_ruleComparacionIndice11413 = new BitSet(new long[]{0x0000000000000002L,0x0000003C00000000L});
        public static final BitSet FOLLOW_ruleSumaRestaIndice_in_entryRuleSumaRestaIndice11451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSumaRestaIndice11461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11508 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_rulesignoSuma_in_ruleSumaRestaIndice11540 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_rulesignoResta_in_ruleSumaRestaIndice11578 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_ruleSumaRestaIndice11601 = new BitSet(new long[]{0x0006000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicacionDivisionIndice_in_entryRuleMultiplicacionDivisionIndice11639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicacionDivisionIndice11649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11696 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_rulesignoMultiplicacion_in_ruleMultiplicacionDivisionIndice11728 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_rulesignoDivision_in_ruleMultiplicacionDivisionIndice11766 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_rulesignoDiv_in_ruleMultiplicacionDivisionIndice11804 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_ruleMultiplicacionDivisionIndice11827 = new BitSet(new long[]{0x0000000000000002L,0x000002C000000000L});
        public static final BitSet FOLLOW_rulePrimariaIndice_in_entryRulePrimariaIndice11865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimariaIndice11875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePrimariaIndice11931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimariaIndice11969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaria_in_entryRulePrimaria12006 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaria12016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_rulePrimaria12063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_rulePrimaria12090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_rulePrimaria12117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperacionParentesis_in_rulePrimaria12144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_entryRuleOperacionCompleta12179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperacionCompleta12189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleOperacionCompleta12241 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleOperacionCompleta12273 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleOperacionCompleta12308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperacionParentesis_in_entryRuleOperacionParentesis12344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperacionParentesis12354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleOperacionParentesis12400 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleOperacionParentesis12418 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleOperacionParentesis12450 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleOperacionParentesis12485 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleOperacionParentesis12497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunciones_in_entryRuleFunciones12533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunciones12543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleFunciones12595 = new BitSet(new long[]{0x00043FE2400003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleFunciones12614 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFunciones12629 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12652 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12665 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleFunciones12678 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFunciones12693 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12716 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNombreInterna_in_ruleFunciones12770 = new BitSet(new long[]{0x00043FE2400003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleFunciones12784 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFunciones12799 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12822 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFunciones12835 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_50_in_ruleFunciones12848 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_106_in_ruleFunciones12863 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleoperacion_in_ruleFunciones12886 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFunciones12902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariablesComplejas_in_entryRuleVariablesComplejas12939 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesComplejas12949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas13006 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas13018 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13039 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVariablesComplejas13051 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13065 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas13127 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleVariablesComplejas13139 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13160 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_58_in_ruleVariablesComplejas13172 = new BitSet(new long[]{0x00000000000000D0L});
        public static final BitSet FOLLOW_ruleoperacionIndice_in_ruleVariablesComplejas13193 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleVariablesComplejas13205 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13219 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesComplejas13280 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13292 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13314 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleVariablesComplejas13327 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleCampoRegistro_in_ruleVariablesComplejas13348 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleVariablesBasicas_in_entryRuleVariablesBasicas13388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariablesBasicas13398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleVariablesBasicas13454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleVariablesBasicas13492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAD_in_ruleVariablesBasicas13526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CAR_in_ruleVariablesBasicas13565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_ruleVariablesBasicas13608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVariablesBasicas13646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSino_in_entryRuleSino13683 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSino13693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_107_in_ruleSino13739 = new BitSet(new long[]{0x00003FE5000000B2L,0x0000100000C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13761 = new BitSet(new long[]{0x00003FE5000000B2L,0x0000100000C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleSino13782 = new BitSet(new long[]{0x00003FE5000000B2L,0x0000100000C499E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleSino13806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDevolver_in_entryRuleDevolver13843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDevolver13853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleDevolver13899 = new BitSet(new long[]{0x00043FE2000003F0L,0x000C040000000000L});
        public static final BitSet FOLLOW_ruleOperacionCompleta_in_ruleDevolver13920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_entryRuleParametroFuncion13956 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParametroFuncion13966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_ruleParametroFuncion14012 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000000L});
        public static final BitSet FOLLOW_ruleTipo_in_ruleParametroFuncion14033 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleParametroFuncion14045 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleParametroFuncion14066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuncion_in_entryRuleFuncion14102 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuncion14112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoVariable_in_ruleFuncion14158 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleFuncion14170 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleFuncion14187 = new BitSet(new long[]{0x0000000040000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion14214 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleFuncion14227 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleFuncion14248 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleFuncion14264 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
        public static final BitSet FOLLOW_20_in_ruleFuncion14277 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleFuncion14298 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_66_in_ruleFuncion14313 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000300000C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleFuncion14334 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000300000C499E0L});
        public static final BitSet FOLLOW_ruleDevolver_in_ruleFuncion14356 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_109_in_ruleFuncion14369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcedimiento_in_entryRuleProcedimiento14405 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcedimiento14415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleProcedimiento14452 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_NOMBRE_FUN_in_ruleProcedimiento14469 = new BitSet(new long[]{0x0000000040000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14496 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_29_in_ruleProcedimiento14509 = new BitSet(new long[]{0x0000000000000000L,0x0003800000000000L});
        public static final BitSet FOLLOW_ruleParametroFuncion_in_ruleProcedimiento14530 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_30_in_ruleProcedimiento14546 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000004L});
        public static final BitSet FOLLOW_20_in_ruleProcedimiento14559 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_ruleDeclaracion_in_ruleProcedimiento14580 = new BitSet(new long[]{0x0000000000000090L,0x000000007C000004L});
        public static final BitSet FOLLOW_66_in_ruleProcedimiento14595 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000400000C499E0L});
        public static final BitSet FOLLOW_ruleSentencias_in_ruleProcedimiento14616 = new BitSet(new long[]{0x00003FE5000000B0L,0x0000400000C499E0L});
        public static final BitSet FOLLOW_110_in_ruleProcedimiento14629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTipoPaso_in_entryRuleTipoPaso14666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTipoPaso14677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_111_in_ruleTipoPaso14715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_112_in_ruleTipoPaso14734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleTipoPaso14753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleano_in_entryRuleBooleano14794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleano14805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_114_in_ruleBooleano14843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_115_in_ruleBooleano14862 = new BitSet(new long[]{0x0000000000000002L});
    }


}