package vary.pseudocodigo.dsl.c.english.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVaryGrammarEnglishLexer extends Lexer {
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

    public InternalVaryGrammarEnglishLexer() {;} 
    public InternalVaryGrammarEnglishLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVaryGrammarEnglishLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:11:7: ( 'Algorithm' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:11:9: 'Algorithm'
            {
            match("Algorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:12:7: ( 'import' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:12:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:13:7: ( 'end_import' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:13:9: 'end_import'
            {
            match("end_import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:14:7: ( 'const' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:14:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:15:7: ( 'type' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:15:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:16:7: ( 'var' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:16:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:17:7: ( 'end_algorithm' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:17:9: 'end_algorithm'
            {
            match("end_algorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:18:7: ( 'Module' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:18:9: 'Module'
            {
            match("Module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:19:7: ( 'export' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:19:9: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:20:7: ( 'end_export' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:20:9: 'end_export'
            {
            match("end_export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:21:7: ( 'end_module' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:21:9: 'end_module'
            {
            match("end_module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:22:7: ( 'implementation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:22:9: 'implementation'
            {
            match("implementation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:23:7: ( 'end_implementation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:23:9: 'end_implementation'
            {
            match("end_implementation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:24:7: ( 'procedure' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:24:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:25:7: ( ',' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:26:7: ( ')' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:27:7: ( 'function' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:27:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:28:7: ( 'open' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:28:9: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:29:7: ( '(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:30:7: ( 'close' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:30:9: 'close'
            {
            match("close"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:31:7: ( 'writing' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:31:9: 'writing'
            {
            match("writing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:32:7: ( 'reading' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:32:9: 'reading'
            {
            match("reading"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:33:7: ( 'cos(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:33:9: 'cos('
            {
            match("cos("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:34:7: ( 'square(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:34:9: 'square('
            {
            match("square("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:35:7: ( 'exp(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:35:9: 'exp('
            {
            match("exp("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:36:7: ( 'ln(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:36:9: 'ln('
            {
            match("ln("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:37:7: ( 'log(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:37:9: 'log('
            {
            match("log("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:38:7: ( 'sen(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:38:9: 'sen('
            {
            match("sen("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:39:7: ( 'sqrt(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:39:9: 'sqrt('
            {
            match("sqrt("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:40:7: ( 'length(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:40:9: 'length('
            {
            match("length("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:41:7: ( 'concatena(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:41:9: 'concatena('
            {
            match("concatena("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:42:7: ( '.' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:42:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:43:7: ( 'E' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:43:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:44:7: ( 'e' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:44:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:45:7: ( '+' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:45:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:46:7: ( '-' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:47:7: ( '=' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:47:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:48:7: ( 'vector' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:48:9: 'vector'
            {
            match("vector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:49:7: ( '[' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:49:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:50:7: ( ']' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:50:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:51:7: ( 'of' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:51:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:52:7: ( ': ' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:52:9: ': '
            {
            match(": "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:53:7: ( 'matrix' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:53:9: 'matrix'
            {
            match("matrix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:54:7: ( '][' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:54:9: ']['
            {
            match("]["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:55:7: ( 'registry:' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:55:9: 'registry:'
            {
            match("registry:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:56:7: ( 'end_registry' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:56:9: 'end_registry'
            {
            match("end_registry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:57:7: ( 'archive of ' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:57:9: 'archive of '
            {
            match("archive of "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:58:7: ( '{' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:58:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:59:7: ( '}' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:59:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:60:7: ( '..' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:60:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:61:7: ( 'main' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:61:9: 'main'
            {
            match("main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:62:7: ( 'initiation' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:62:9: 'initiation'
            {
            match("initiation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:63:7: ( 'end_main' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:63:9: 'end_main'
            {
            match("end_main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:64:7: ( '<-' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:64:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:65:7: ( 'write(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:65:9: 'write('
            {
            match("write("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:66:7: ( 'read(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:66:9: 'read('
            {
            match("read("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:67:7: ( 'if' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:67:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:68:7: ( 'if(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:68:9: 'if('
            {
            match("if("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:69:7: ( 'then' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:69:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:70:7: ( 'end_if' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:70:9: 'end_if'
            {
            match("end_if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:71:7: ( 'while' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:71:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:72:7: ( 'while(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:72:9: 'while('
            {
            match("while("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:73:7: ( 'do' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:73:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:74:7: ( 'end_while' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:74:9: 'end_while'
            {
            match("end_while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:75:7: ( 'repeat' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:75:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:76:7: ( 'until' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:76:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:77:7: ( 'until(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:77:9: 'until('
            {
            match("until("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:78:7: ( 'for' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:78:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:79:7: ( 'to' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:79:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:80:7: ( 'end_for' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:80:9: 'end_for'
            {
            match("end_for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:81:7: ( 'case' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:81:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:82:7: ( 'according_to' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:82:9: 'according_to'
            {
            match("according_to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:83:7: ( 'according_to(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:83:9: 'according_to('
            {
            match("according_to("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:84:7: ( 'otherwise:' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:84:9: 'otherwise:'
            {
            match("otherwise:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:85:7: ( 'end_according_to' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:85:9: 'end_according_to'
            {
            match("end_according_to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:86:7: ( 'integer' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:86:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:87:7: ( 'character' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:87:9: 'character'
            {
            match("character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:88:7: ( 'real' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:88:9: 'real'
            {
            match("real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:89:7: ( 'boolean' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:89:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:90:7: ( 'string' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:90:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:91:7: ( 'or' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:91:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:92:7: ( 'and' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:92:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:93:7: ( '!=' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:93:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:94:7: ( '<' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:94:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:95:7: ( '>' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:95:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:96:8: ( '>=' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:96:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:97:8: ( '<=' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:97:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:98:8: ( '*' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:98:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:99:8: ( '/' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:99:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:100:8: ( 'mod' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:100:10: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:101:8: ( 'div' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:101:10: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:102:8: ( 'no' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:102:10: 'no'
            {
            match("no"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:103:8: ( 'else' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:103:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:104:8: ( 'return' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:104:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:105:8: ( 'end_function' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:105:10: 'end_function'
            {
            match("end_function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:106:8: ( 'end_procedure' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:106:10: 'end_procedure'
            {
            match("end_procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:107:8: ( 'I' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:107:10: 'I'
            {
            match('I'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:108:8: ( 'I/O' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:108:10: 'I/O'
            {
            match("I/O"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:109:8: ( 'O' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:109:10: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:110:8: ( 'true' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:110:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:111:8: ( 'false' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:111:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:41: ( '\\r' )? '\\n'
                    {
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6778:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NOMBRE_FUN"
    public final void mRULE_NOMBRE_FUN() throws RecognitionException {
        try {
            int _type = RULE_NOMBRE_FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6780:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* '(' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6780:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* '('
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6780:19: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE_FUN"

    // $ANTLR start "RULE_CAD"
    public final void mRULE_CAD() throws RecognitionException {
        try {
            int _type = RULE_CAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6782:10: ( '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' | ':' | ',' | '.' )* '\"' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6782:12: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' | ':' | ',' | '.' )* '\"'
            {
            match('\"'); 
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6782:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' | ':' | ',' | '.' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=' ' && LA5_0<='!')||LA5_0=='#'||(LA5_0>='%' && LA5_0<='&')||(LA5_0>='(' && LA5_0<=')')||(LA5_0>=',' && LA5_0<='.')||(LA5_0>='0' && LA5_0<=':')||LA5_0=='='||(LA5_0>='?' && LA5_0<='Z')||LA5_0=='\\'||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAD"

    // $ANTLR start "RULE_CAR"
    public final void mRULE_CAR() throws RecognitionException {
        try {
            int _type = RULE_CAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6784:10: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' ) '\\'' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6784:12: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' ) '\\''
            {
            match('\''); 
            if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAR"

    // $ANTLR start "RULE_COMENT"
    public final void mRULE_COMENT() throws RecognitionException {
        try {
            int _type = RULE_COMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6786:13: ( '/*' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' )* '*/' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6786:15: '/*' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' )* '*/'
            {
            match("/*"); 

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6786:20: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '!' | '#' | '@' | '%' | '&' | '(' | ')' | '=' | '?' | '\\\\' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=' ' && LA6_0<='!')||LA6_0=='#'||(LA6_0>='%' && LA6_0<='&')||(LA6_0>='(' && LA6_0<=')')||(LA6_0>='0' && LA6_0<='9')||LA6_0=='='||(LA6_0>='?' && LA6_0<='Z')||LA6_0=='\\'||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)=='#'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6788:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6788:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6788:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6788:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6788:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6790:10: ( ( '0' .. '9' )+ )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6790:12: ( '0' .. '9' )+
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6790:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6790:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6792:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6794:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6794:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6794:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6794:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6796:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6796:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6796:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6798:16: ( . )
            // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:6798:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_SL_COMMENT | RULE_NOMBRE_FUN | RULE_CAD | RULE_CAR | RULE_COMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=112;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:238: T__53
                {
                mT__53(); 

                }
                break;
            case 40 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:244: T__54
                {
                mT__54(); 

                }
                break;
            case 41 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:250: T__55
                {
                mT__55(); 

                }
                break;
            case 42 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:256: T__56
                {
                mT__56(); 

                }
                break;
            case 43 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:262: T__57
                {
                mT__57(); 

                }
                break;
            case 44 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:268: T__58
                {
                mT__58(); 

                }
                break;
            case 45 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:274: T__59
                {
                mT__59(); 

                }
                break;
            case 46 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:280: T__60
                {
                mT__60(); 

                }
                break;
            case 47 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:286: T__61
                {
                mT__61(); 

                }
                break;
            case 48 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:292: T__62
                {
                mT__62(); 

                }
                break;
            case 49 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:298: T__63
                {
                mT__63(); 

                }
                break;
            case 50 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:304: T__64
                {
                mT__64(); 

                }
                break;
            case 51 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:310: T__65
                {
                mT__65(); 

                }
                break;
            case 52 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:316: T__66
                {
                mT__66(); 

                }
                break;
            case 53 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:322: T__67
                {
                mT__67(); 

                }
                break;
            case 54 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:328: T__68
                {
                mT__68(); 

                }
                break;
            case 55 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:334: T__69
                {
                mT__69(); 

                }
                break;
            case 56 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:340: T__70
                {
                mT__70(); 

                }
                break;
            case 57 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:346: T__71
                {
                mT__71(); 

                }
                break;
            case 58 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:352: T__72
                {
                mT__72(); 

                }
                break;
            case 59 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:358: T__73
                {
                mT__73(); 

                }
                break;
            case 60 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:364: T__74
                {
                mT__74(); 

                }
                break;
            case 61 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:370: T__75
                {
                mT__75(); 

                }
                break;
            case 62 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:376: T__76
                {
                mT__76(); 

                }
                break;
            case 63 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:382: T__77
                {
                mT__77(); 

                }
                break;
            case 64 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:388: T__78
                {
                mT__78(); 

                }
                break;
            case 65 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:394: T__79
                {
                mT__79(); 

                }
                break;
            case 66 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:400: T__80
                {
                mT__80(); 

                }
                break;
            case 67 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:406: T__81
                {
                mT__81(); 

                }
                break;
            case 68 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:412: T__82
                {
                mT__82(); 

                }
                break;
            case 69 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:418: T__83
                {
                mT__83(); 

                }
                break;
            case 70 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:424: T__84
                {
                mT__84(); 

                }
                break;
            case 71 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:430: T__85
                {
                mT__85(); 

                }
                break;
            case 72 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:436: T__86
                {
                mT__86(); 

                }
                break;
            case 73 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:442: T__87
                {
                mT__87(); 

                }
                break;
            case 74 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:448: T__88
                {
                mT__88(); 

                }
                break;
            case 75 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:454: T__89
                {
                mT__89(); 

                }
                break;
            case 76 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:460: T__90
                {
                mT__90(); 

                }
                break;
            case 77 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:466: T__91
                {
                mT__91(); 

                }
                break;
            case 78 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:472: T__92
                {
                mT__92(); 

                }
                break;
            case 79 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:478: T__93
                {
                mT__93(); 

                }
                break;
            case 80 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:484: T__94
                {
                mT__94(); 

                }
                break;
            case 81 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:490: T__95
                {
                mT__95(); 

                }
                break;
            case 82 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:496: T__96
                {
                mT__96(); 

                }
                break;
            case 83 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:502: T__97
                {
                mT__97(); 

                }
                break;
            case 84 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:508: T__98
                {
                mT__98(); 

                }
                break;
            case 85 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:514: T__99
                {
                mT__99(); 

                }
                break;
            case 86 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:520: T__100
                {
                mT__100(); 

                }
                break;
            case 87 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:527: T__101
                {
                mT__101(); 

                }
                break;
            case 88 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:534: T__102
                {
                mT__102(); 

                }
                break;
            case 89 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:541: T__103
                {
                mT__103(); 

                }
                break;
            case 90 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:548: T__104
                {
                mT__104(); 

                }
                break;
            case 91 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:555: T__105
                {
                mT__105(); 

                }
                break;
            case 92 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:562: T__106
                {
                mT__106(); 

                }
                break;
            case 93 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:569: T__107
                {
                mT__107(); 

                }
                break;
            case 94 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:576: T__108
                {
                mT__108(); 

                }
                break;
            case 95 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:583: T__109
                {
                mT__109(); 

                }
                break;
            case 96 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:590: T__110
                {
                mT__110(); 

                }
                break;
            case 97 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:597: T__111
                {
                mT__111(); 

                }
                break;
            case 98 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:604: T__112
                {
                mT__112(); 

                }
                break;
            case 99 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:611: T__113
                {
                mT__113(); 

                }
                break;
            case 100 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:618: T__114
                {
                mT__114(); 

                }
                break;
            case 101 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:625: T__115
                {
                mT__115(); 

                }
                break;
            case 102 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:632: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 103 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:648: RULE_NOMBRE_FUN
                {
                mRULE_NOMBRE_FUN(); 

                }
                break;
            case 104 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:664: RULE_CAD
                {
                mRULE_CAD(); 

                }
                break;
            case 105 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:673: RULE_CAR
                {
                mRULE_CAR(); 

                }
                break;
            case 106 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:682: RULE_COMENT
                {
                mRULE_COMENT(); 

                }
                break;
            case 107 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:694: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:702: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 109 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:711: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 110 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:723: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 111 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:739: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 112 :
                // ../vary.pseudocodigo.dsl.c.english/src-gen/vary/pseudocodigo/dsl/c/english/parser/antlr/internal/InternalVaryGrammarEnglish.g:1:747: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\61\1\72\5\61\2\uffff\2\61\1\uffff\4\61\1\133\1\134\4\uffff\1\142\1\57\2\61\2\uffff\1\155\3\61\1\57\1\164\1\uffff\1\170\1\61\1\173\1\174\1\61\3\57\1\u0083\2\uffff\1\61\1\uffff\1\61\1\uffff\2\61\1\u008b\3\61\1\uffff\6\61\1\u0096\5\61\2\uffff\4\61\1\u00a0\1\61\1\u00a2\1\uffff\11\61\12\uffff\5\61\5\uffff\1\u00b6\3\61\7\uffff\1\u00bd\12\uffff\1\u0083\1\uffff\4\61\2\uffff\12\61\1\uffff\1\61\1\u00d6\4\61\1\u00db\2\61\1\uffff\1\61\1\uffff\12\61\1\uffff\4\61\1\u00ef\2\61\1\u00f2\1\uffff\1\u00f3\2\61\4\uffff\1\u00c0\2\uffff\1\u00f7\1\uffff\5\61\1\uffff\2\61\1\uffff\1\u0107\2\61\1\uffff\1\61\1\u010c\1\61\1\u010e\1\u010f\1\u0110\1\uffff\4\61\1\uffff\1\61\1\u0116\4\61\1\u011d\5\61\1\uffff\1\61\2\uffff\2\61\1\u0128\1\uffff\2\61\2\uffff\2\61\1\u012d\1\uffff\16\61\2\uffff\1\u0140\1\61\1\uffff\1\u0142\1\uffff\1\61\3\uffff\4\61\1\u0148\1\uffff\3\61\1\u014d\1\61\2\uffff\4\61\2\uffff\1\61\1\uffff\2\61\1\uffff\2\61\1\u015b\1\61\1\uffff\1\61\1\u015e\4\61\1\u0163\12\61\1\u016e\1\uffff\1\61\1\uffff\1\61\1\u0171\1\u0172\2\61\1\uffff\2\61\3\uffff\1\61\1\uffff\1\61\1\u017b\1\u017c\1\61\1\uffff\1\u017e\1\61\1\u0180\2\61\2\uffff\2\61\1\uffff\2\61\1\u0188\1\61\1\uffff\7\61\1\u0192\2\61\1\uffff\2\61\2\uffff\3\61\1\u019a\2\uffff\1\u019b\1\61\6\uffff\2\61\1\uffff\1\u01a1\3\61\1\uffff\6\61\1\u01ab\2\61\1\uffff\5\61\1\u01b3\1\61\2\uffff\1\61\3\uffff\1\61\1\uffff\1\u01b7\10\61\1\uffff\1\61\1\u01c1\3\61\1\u01c5\1\u01c6\1\uffff\1\61\1\uffff\1\61\1\uffff\1\61\1\u01ca\1\u01cb\3\61\1\u01cf\1\u01d0\1\61\1\uffff\2\61\4\uffff\2\61\2\uffff\3\61\2\uffff\3\61\1\uffff\5\61\1\u01e2\1\u01e3\1\61\1\u01e6\2\61\1\u01e9\1\61\2\uffff\1\u01eb\2\uffff\1\u01ed\1\61\1\uffff\1\61\3\uffff\3\61\1\u01f3\1\61\1\uffff\1\u01f5\1\uffff";
    static final String DFA15_eofS =
        "\u01f6\uffff";
    static final String DFA15_minS =
        "\1\0\10\50\2\uffff\2\50\1\uffff\4\50\1\56\1\50\4\uffff\1\133\1\40\2\50\2\uffff\1\55\3\50\2\75\1\uffff\1\52\4\50\2\0\1\101\1\50\2\uffff\1\50\1\uffff\1\50\1\uffff\6\50\1\uffff\14\50\2\uffff\7\50\1\uffff\11\50\12\uffff\5\50\5\uffff\4\50\5\uffff\1\0\1\uffff\1\50\3\uffff\1\0\1\uffff\1\0\1\uffff\2\0\1\uffff\1\50\1\uffff\4\50\2\uffff\12\50\1\uffff\11\50\1\uffff\1\50\1\uffff\12\50\1\uffff\10\50\1\uffff\3\50\2\0\2\uffff\2\0\1\uffff\1\0\1\uffff\5\50\1\uffff\2\50\1\uffff\3\50\1\uffff\6\50\1\uffff\4\50\1\uffff\14\50\1\uffff\1\50\2\uffff\3\50\1\uffff\2\50\2\uffff\2\50\1\0\1\uffff\16\50\2\uffff\2\50\1\uffff\1\50\1\uffff\1\50\3\uffff\5\50\1\uffff\5\50\2\uffff\4\50\2\uffff\1\50\1\uffff\2\50\1\uffff\4\50\1\uffff\22\50\1\uffff\1\50\1\uffff\5\50\1\uffff\2\50\3\uffff\1\50\1\uffff\4\50\1\uffff\5\50\2\uffff\2\50\1\uffff\4\50\1\uffff\12\50\1\uffff\2\50\2\uffff\4\50\2\uffff\2\50\6\uffff\1\40\1\50\1\uffff\4\50\1\uffff\11\50\1\uffff\7\50\2\uffff\1\50\3\uffff\1\50\1\uffff\11\50\1\uffff\7\50\1\uffff\1\50\1\uffff\1\50\1\uffff\11\50\1\uffff\2\50\4\uffff\2\50\2\uffff\3\50\2\uffff\3\50\1\uffff\15\50\2\uffff\1\50\2\uffff\2\50\1\uffff\1\50\3\uffff\5\50\1\uffff\1\50\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\10\172\2\uffff\2\172\1\uffff\4\172\1\56\1\172\4\uffff\1\133\1\40\2\172\2\uffff\1\75\3\172\2\75\1\uffff\1\57\4\172\2\uffff\2\172\2\uffff\1\172\1\uffff\1\172\1\uffff\6\172\1\uffff\14\172\2\uffff\7\172\1\uffff\11\172\12\uffff\5\172\5\uffff\4\172\5\uffff\1\uffff\1\uffff\1\172\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\172\1\uffff\4\172\2\uffff\12\172\1\uffff\11\172\1\uffff\1\172\1\uffff\12\172\1\uffff\10\172\1\uffff\3\172\2\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff\5\172\1\uffff\2\172\1\uffff\3\172\1\uffff\6\172\1\uffff\4\172\1\uffff\14\172\1\uffff\1\172\2\uffff\3\172\1\uffff\2\172\2\uffff\2\172\1\uffff\1\uffff\16\172\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\3\uffff\5\172\1\uffff\5\172\2\uffff\4\172\2\uffff\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\22\172\1\uffff\1\172\1\uffff\5\172\1\uffff\2\172\3\uffff\1\172\1\uffff\4\172\1\uffff\5\172\2\uffff\2\172\1\uffff\4\172\1\uffff\12\172\1\uffff\2\172\2\uffff\4\172\2\uffff\2\172\6\uffff\2\172\1\uffff\4\172\1\uffff\11\172\1\uffff\7\172\2\uffff\1\172\3\uffff\1\172\1\uffff\11\172\1\uffff\7\172\1\uffff\1\172\1\uffff\1\172\1\uffff\11\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff\3\172\1\uffff\15\172\2\uffff\1\172\2\uffff\2\172\1\uffff\1\172\3\uffff\5\172\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\17\1\20\2\uffff\1\23\6\uffff\1\43\1\44\1\45\1\47\4\uffff\1\60\1\61\6\uffff\1\130\11\uffff\1\157\1\160\1\uffff\1\153\1\uffff\1\147\6\uffff\1\42\14\uffff\1\17\1\20\7\uffff\1\23\11\uffff\1\62\1\40\1\41\1\43\1\44\1\45\1\47\1\54\1\50\1\52\5\uffff\1\60\1\61\1\66\1\127\1\124\4\uffff\1\123\1\126\1\125\1\130\1\146\1\uffff\1\131\1\uffff\1\142\1\141\1\143\1\uffff\1\150\1\uffff\1\155\2\uffff\1\154\1\uffff\1\157\4\uffff\1\72\1\71\12\uffff\1\105\11\uffff\1\51\1\uffff\1\121\12\uffff\1\32\10\uffff\1\77\5\uffff\1\156\1\134\2\uffff\1\150\1\uffff\1\151\5\uffff\1\72\2\uffff\1\31\3\uffff\1\27\6\uffff\1\6\4\uffff\1\104\14\uffff\1\34\1\uffff\1\32\1\33\3\uffff\1\132\2\uffff\1\122\1\133\3\uffff\1\151\16\uffff\1\31\1\135\2\uffff\1\27\1\uffff\1\107\1\uffff\1\5\1\73\1\144\5\uffff\1\22\5\uffff\1\70\1\116\4\uffff\1\35\1\34\1\uffff\1\33\2\uffff\1\63\4\uffff\1\152\22\uffff\1\4\1\uffff\1\24\5\uffff\1\145\2\uffff\1\67\1\76\1\75\1\uffff\1\70\4\uffff\1\35\5\uffff\1\103\1\102\2\uffff\1\2\4\uffff\1\74\12\uffff\1\11\2\uffff\1\46\1\10\4\uffff\1\67\1\76\2\uffff\1\101\1\136\1\30\1\120\1\36\1\53\2\uffff\1\103\4\uffff\1\114\11\uffff\1\106\7\uffff\1\25\1\26\1\uffff\1\30\1\36\1\57\1\uffff\1\117\11\uffff\1\65\7\uffff\1\21\1\uffff\1\55\1\uffff\1\1\11\uffff\1\100\2\uffff\1\37\1\115\1\16\1\112\2\uffff\1\64\1\3\3\uffff\1\12\1\13\3\uffff\1\37\15\uffff\1\56\1\137\1\uffff\1\111\1\110\2\uffff\1\7\1\uffff\1\140\1\111\1\14\5\uffff\1\113\1\uffff\1\15";
    static final String DFA15_specialS =
        "\1\12\51\uffff\1\1\1\15\113\uffff\1\11\5\uffff\1\6\1\uffff\1\4\1\uffff\1\5\1\2\67\uffff\1\14\1\0\2\uffff\1\7\1\3\1\uffff\1\10\64\uffff\1\13\u00ff\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\57\2\56\2\57\1\56\22\57\1\56\1\42\1\52\4\57\1\53\1\15\1\12\1\44\1\24\1\11\1\25\1\22\1\45\12\55\1\31\1\57\1\36\1\26\1\43\2\57\1\1\3\51\1\23\3\51\1\47\3\51\1\7\1\51\1\50\13\51\1\27\1\57\1\30\1\54\1\51\1\57\1\33\1\41\1\4\1\37\1\3\1\13\2\51\1\2\2\51\1\21\1\32\1\46\1\14\1\10\1\51\1\17\1\20\1\5\1\40\1\6\1\16\3\51\1\34\1\57\1\35\uff82\57",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\60\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\66\6\62\1\64\1\65\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\71\1\62\1\67\11\62\1\70\2\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\75\6\62\1\76\3\62\1\74\2\62\1\73\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\100\6\62\1\101\2\62\1\102\6\62\1\77\1\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\103\3\62\1\104\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\105\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\106\10\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\113\15\62\1\112\5\62\1\111\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\115\11\62\1\114\1\62\1\117\1\62\1\116\6\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\122\11\62\1\121\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\123\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\125\13\62\1\124\2\62\1\126\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\131\10\62\1\127\1\130\13\62",
            "\1\132",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\143",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\144\15\62\1\145\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\147\12\62\1\150\3\62\1\146\10\62",
            "",
            "",
            "\1\153\17\uffff\1\154",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\157\5\62\1\156\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\160\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\161\13\62",
            "\1\162",
            "\1\163",
            "",
            "\1\167\4\uffff\1\166",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\171\13\62",
            "\1\63\6\uffff\1\172\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\40\u0080\2\177\1\176\1\177\1\u0080\2\177\1\u0080\2\177\2\u0080\3\177\1\u0080\13\177\2\u0080\1\177\1\u0080\34\177\1\u0080\1\175\2\u0080\1\177\1\u0080\32\177\uff85\u0080",
            "\40\u0080\2\u0082\1\u0080\1\u0082\1\u0080\2\u0082\1\u0080\2\u0082\6\u0080\12\u0082\3\u0080\1\u0082\1\u0080\34\u0082\1\u0080\1\u0081\2\u0080\1\u0082\1\u0080\32\u0082\uff85\u0080",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\63\7\uffff\12\u0084\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0086\23\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0087\12\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0088\12\62\1\u0089\6\62",
            "\1\u008a\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u008c\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u008d\12\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u008e\7\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u008f\4\62\1\u0090\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0091\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0092\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0093\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0094\12\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0095\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0097\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0098\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0099\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u009a\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u009b\13\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u009c\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u009d\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u009e\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u009f\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00a1\22\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00a3\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00a4\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00a5\5\62\1\u00a6\10\62\1\u00a7\3\62\1\u00a8\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00aa\2\62\1\u00a9\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ab\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00ac\10\62",
            "\1\u00ad\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00ae\23\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00af\14\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b1\12\62\1\u00b0\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00b2\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00b3\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00b4\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00b5\26\62",
            "",
            "",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00b7\4\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00b8\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00b9\13\62",
            "",
            "",
            "",
            "",
            "",
            "\40\u00bc\2\u00bb\1\u00bc\1\u00bb\1\u00bc\2\u00bb\1\u00bc\2\u00bb\1\u00ba\5\u00bc\12\u00bb\3\u00bc\1\u00bb\1\u00bc\34\u00bb\1\u00bc\1\u00bb\2\u00bc\1\u00bb\1\u00bc\32\u00bb\uff85\u00bc",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\40\u0080\2\u00bf\1\u00be\1\u00bf\1\u0080\2\u00bf\1\u0080\2\u00bf\2\u0080\3\u00bf\1\u0080\13\u00bf\2\u0080\1\u00bf\1\u0080\34\u00bf\1\u0080\1\u00bf\2\u0080\1\u00bf\1\u0080\32\u00bf\uff85\u0080",
            "",
            "\40\u0080\2\177\1\176\1\177\1\u0080\2\177\1\u0080\2\177\2\u0080\3\177\1\u0080\13\177\2\u0080\1\177\1\u0080\34\177\1\u0080\1\175\2\u0080\1\177\1\u0080\32\177\uff85\u0080",
            "",
            "\47\u0080\1\u00c1\uffd8\u0080",
            "\47\u0080\1\u00c2\uffd8\u0080",
            "",
            "\1\63\7\uffff\12\u0084\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00c3\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00c5\2\62\1\u00c4\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00c6\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c7\25\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\u00c9\1\uffff\32\62",
            "\1\u00cb\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00ca\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00cc\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00ce\17\62\1\u00cd\7\62",
            "\1\u00cf\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00d0\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d1\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00d2\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d3\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00d4\14\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d5\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00d7\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00d8\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00d9\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00da\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00dc\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00dd\14\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00de\25\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00df\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00e0\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00e1\7\62\1\u00e2\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00e3\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00e4\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00e5\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00e6\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00e7\6\62",
            "\1\u00e8\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00e9\21\62",
            "",
            "\1\u00eb\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00ec\23\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00ed\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ee\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00f0\22\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f1\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00f4\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00f5\16\62",
            "\57\u00bc\1\u00f6\uffd0\u00bc",
            "\40\u00bc\2\u00bb\1\u00bc\1\u00bb\1\u00bc\2\u00bb\1\u00bc\2\u00bb\1\u00ba\5\u00bc\12\u00bb\3\u00bc\1\u00bb\1\u00bc\34\u00bb\1\u00bc\1\u00bb\2\u00bc\1\u00bb\1\u00bc\32\u00bb\uff85\u00bc",
            "",
            "",
            "\0\u0080",
            "\40\u0080\2\177\1\176\1\177\1\u0080\2\177\1\u0080\2\177\2\u0080\3\177\1\u0080\13\177\2\u0080\1\177\1\u0080\34\177\1\u0080\1\175\2\u0080\1\177\1\u0080\32\177\uff85\u0080",
            "",
            "\0\u0080",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00f8\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00f9\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00fa\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00fb\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00fc\23\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00fe\3\62\1\u00ff\1\u0103\2\62\1\u00fd\3\62\1\u0100\2\62\1\u0104\1\62\1\u0101\4\62\1\u0102\3\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0105\10\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0108\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0109\31\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010b\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u010d\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0111\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0112\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0113\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0114\6\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0115\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0117\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0119\3\62\1\u0118\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u011a\25\62",
            "\1\u011c\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u011b\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u011e\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u011f\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0120\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0121\10\62",
            "\1\u0122\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0124\14\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0126\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0127\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0129\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u012a\10\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u012b\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u012c\25\62",
            "\0\u00bc",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u012e\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u012f\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0130\15\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0131\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0132\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0134\6\62\1\u0133\15\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0136\10\62\1\u0135\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\27\62\1\u0137\2\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0139\15\62\1\u0138\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u013a\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u013b\22\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u013c\5\62\1\u013d\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u013e\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u013f\6\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0141\6\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0143\27\62",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0144\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0145\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0146\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0147\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u0149\3\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u014a\14\62",
            "\1\u014b\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u014c\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u014e\14\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0150\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0151\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0152\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0153\25\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0155\23\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0156\22\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\27\62\1\u0157\2\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u0158\4\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0159\26\62",
            "\1\u015a\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u015c\31\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u015d\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u015f\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0160\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0161\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0162\12\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0164\23\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0165\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0166\12\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0167\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0168\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0169\23\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u016a\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u016b\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u016c\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u016d\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u016f\25\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0170\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0173\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0174\13\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0175\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0176\23\62",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0179\23\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u017a\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u017d\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u017f\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0181\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0182\21\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0184\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0185\22\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0186\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0187\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u018a\2\62\1\u0189\13\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u018b\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u018c\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u018d\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u018e\5\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u018f\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0190\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0191\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0193\27\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0194\27\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0195\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0196\25\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0197\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0198\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0199\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u019c\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u019f\7\uffff\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01a0\14\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01a2\15\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01a3\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01a4\13\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a5\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01a6\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a7\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a8\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a9\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u01aa\16\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01ac\7\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01ad\25\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01ae\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01af\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01b0\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01b1\10\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b2\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b4\25\62",
            "",
            "",
            "\1\63\7\uffff\12\62\1\u01b5\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u01b6\23\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01b8\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01b9\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01ba\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01bb\15\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01bc\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01bd\26\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01be\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01bf\25\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01c0\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01c2\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01c3\26\62",
            "\1\u01c4\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\1\u01c7\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\u01c8\1\uffff\32\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01c9\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01cc\25\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01cd\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01ce\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01d1\10\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01d2\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u01d3\5\62",
            "",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01d5\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01d6\21\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01d7\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u01d8\22\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01d9\14\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01da\1\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01db\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01dc\10\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01dd\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01de\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01df\6\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01e0\15\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u01e1\23\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01e4\25\62",
            "\1\u01e5\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01e7\14\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01e8\31\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\u01ea\1\uffff\32\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01ee\6\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01ef\6\62",
            "",
            "",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01f0\21\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01f1\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01f2\13\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01f4\14\62",
            "",
            "\1\63\7\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    static class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_SL_COMMENT | RULE_NOMBRE_FUN | RULE_CAD | RULE_CAR | RULE_COMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_187 = input.LA(1);

                        s = -1;
                        if ( (LA15_187=='*') ) {s = 186;}

                        else if ( ((LA15_187>=' ' && LA15_187<='!')||LA15_187=='#'||(LA15_187>='%' && LA15_187<='&')||(LA15_187>='(' && LA15_187<=')')||(LA15_187>='0' && LA15_187<='9')||LA15_187=='='||(LA15_187>='?' && LA15_187<='Z')||LA15_187=='\\'||LA15_187=='_'||(LA15_187>='a' && LA15_187<='z')) ) {s = 187;}

                        else if ( ((LA15_187>='\u0000' && LA15_187<='\u001F')||LA15_187=='\"'||LA15_187=='$'||LA15_187=='\''||(LA15_187>='+' && LA15_187<='/')||(LA15_187>=':' && LA15_187<='<')||LA15_187=='>'||LA15_187=='['||(LA15_187>=']' && LA15_187<='^')||LA15_187=='`'||(LA15_187>='{' && LA15_187<='\uFFFF')) ) {s = 188;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_42 = input.LA(1);

                        s = -1;
                        if ( (LA15_42=='\\') ) {s = 125;}

                        else if ( (LA15_42=='\"') ) {s = 126;}

                        else if ( ((LA15_42>=' ' && LA15_42<='!')||LA15_42=='#'||(LA15_42>='%' && LA15_42<='&')||(LA15_42>='(' && LA15_42<=')')||(LA15_42>=',' && LA15_42<='.')||(LA15_42>='0' && LA15_42<=':')||LA15_42=='='||(LA15_42>='?' && LA15_42<='Z')||LA15_42=='_'||(LA15_42>='a' && LA15_42<='z')) ) {s = 127;}

                        else if ( ((LA15_42>='\u0000' && LA15_42<='\u001F')||LA15_42=='$'||LA15_42=='\''||(LA15_42>='*' && LA15_42<='+')||LA15_42=='/'||(LA15_42>=';' && LA15_42<='<')||LA15_42=='>'||LA15_42=='['||(LA15_42>=']' && LA15_42<='^')||LA15_42=='`'||(LA15_42>='{' && LA15_42<='\uFFFF')) ) {s = 128;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_130 = input.LA(1);

                        s = -1;
                        if ( (LA15_130=='\'') ) {s = 194;}

                        else if ( ((LA15_130>='\u0000' && LA15_130<='&')||(LA15_130>='(' && LA15_130<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_191 = input.LA(1);

                        s = -1;
                        if ( (LA15_191=='\"') ) {s = 126;}

                        else if ( (LA15_191=='\\') ) {s = 125;}

                        else if ( ((LA15_191>=' ' && LA15_191<='!')||LA15_191=='#'||(LA15_191>='%' && LA15_191<='&')||(LA15_191>='(' && LA15_191<=')')||(LA15_191>=',' && LA15_191<='.')||(LA15_191>='0' && LA15_191<=':')||LA15_191=='='||(LA15_191>='?' && LA15_191<='Z')||LA15_191=='_'||(LA15_191>='a' && LA15_191<='z')) ) {s = 127;}

                        else if ( ((LA15_191>='\u0000' && LA15_191<='\u001F')||LA15_191=='$'||LA15_191=='\''||(LA15_191>='*' && LA15_191<='+')||LA15_191=='/'||(LA15_191>=';' && LA15_191<='<')||LA15_191=='>'||LA15_191=='['||(LA15_191>=']' && LA15_191<='^')||LA15_191=='`'||(LA15_191>='{' && LA15_191<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_127 = input.LA(1);

                        s = -1;
                        if ( (LA15_127=='\"') ) {s = 126;}

                        else if ( (LA15_127=='\\') ) {s = 125;}

                        else if ( ((LA15_127>=' ' && LA15_127<='!')||LA15_127=='#'||(LA15_127>='%' && LA15_127<='&')||(LA15_127>='(' && LA15_127<=')')||(LA15_127>=',' && LA15_127<='.')||(LA15_127>='0' && LA15_127<=':')||LA15_127=='='||(LA15_127>='?' && LA15_127<='Z')||LA15_127=='_'||(LA15_127>='a' && LA15_127<='z')) ) {s = 127;}

                        else if ( ((LA15_127>='\u0000' && LA15_127<='\u001F')||LA15_127=='$'||LA15_127=='\''||(LA15_127>='*' && LA15_127<='+')||LA15_127=='/'||(LA15_127>=';' && LA15_127<='<')||LA15_127=='>'||LA15_127=='['||(LA15_127>=']' && LA15_127<='^')||LA15_127=='`'||(LA15_127>='{' && LA15_127<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_129 = input.LA(1);

                        s = -1;
                        if ( (LA15_129=='\'') ) {s = 193;}

                        else if ( ((LA15_129>='\u0000' && LA15_129<='&')||(LA15_129>='(' && LA15_129<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_125 = input.LA(1);

                        s = -1;
                        if ( (LA15_125=='\"') ) {s = 190;}

                        else if ( ((LA15_125>=' ' && LA15_125<='!')||LA15_125=='#'||(LA15_125>='%' && LA15_125<='&')||(LA15_125>='(' && LA15_125<=')')||(LA15_125>=',' && LA15_125<='.')||(LA15_125>='0' && LA15_125<=':')||LA15_125=='='||(LA15_125>='?' && LA15_125<='Z')||LA15_125=='\\'||LA15_125=='_'||(LA15_125>='a' && LA15_125<='z')) ) {s = 191;}

                        else if ( ((LA15_125>='\u0000' && LA15_125<='\u001F')||LA15_125=='$'||LA15_125=='\''||(LA15_125>='*' && LA15_125<='+')||LA15_125=='/'||(LA15_125>=';' && LA15_125<='<')||LA15_125=='>'||LA15_125=='['||(LA15_125>=']' && LA15_125<='^')||LA15_125=='`'||(LA15_125>='{' && LA15_125<='\uFFFF')) ) {s = 128;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_190 = input.LA(1);

                        s = -1;
                        if ( ((LA15_190>='\u0000' && LA15_190<='\uFFFF')) ) {s = 128;}

                        else s = 192;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_193 = input.LA(1);

                        s = -1;
                        if ( ((LA15_193>='\u0000' && LA15_193<='\uFFFF')) ) {s = 128;}

                        else s = 247;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_119 = input.LA(1);

                        s = -1;
                        if ( (LA15_119=='*') ) {s = 186;}

                        else if ( ((LA15_119>=' ' && LA15_119<='!')||LA15_119=='#'||(LA15_119>='%' && LA15_119<='&')||(LA15_119>='(' && LA15_119<=')')||(LA15_119>='0' && LA15_119<='9')||LA15_119=='='||(LA15_119>='?' && LA15_119<='Z')||LA15_119=='\\'||LA15_119=='_'||(LA15_119>='a' && LA15_119<='z')) ) {s = 187;}

                        else if ( ((LA15_119>='\u0000' && LA15_119<='\u001F')||LA15_119=='\"'||LA15_119=='$'||LA15_119=='\''||(LA15_119>='+' && LA15_119<='/')||(LA15_119>=':' && LA15_119<='<')||LA15_119=='>'||LA15_119=='['||(LA15_119>=']' && LA15_119<='^')||LA15_119=='`'||(LA15_119>='{' && LA15_119<='\uFFFF')) ) {s = 188;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='A') ) {s = 1;}

                        else if ( (LA15_0=='i') ) {s = 2;}

                        else if ( (LA15_0=='e') ) {s = 3;}

                        else if ( (LA15_0=='c') ) {s = 4;}

                        else if ( (LA15_0=='t') ) {s = 5;}

                        else if ( (LA15_0=='v') ) {s = 6;}

                        else if ( (LA15_0=='M') ) {s = 7;}

                        else if ( (LA15_0=='p') ) {s = 8;}

                        else if ( (LA15_0==',') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='f') ) {s = 11;}

                        else if ( (LA15_0=='o') ) {s = 12;}

                        else if ( (LA15_0=='(') ) {s = 13;}

                        else if ( (LA15_0=='w') ) {s = 14;}

                        else if ( (LA15_0=='r') ) {s = 15;}

                        else if ( (LA15_0=='s') ) {s = 16;}

                        else if ( (LA15_0=='l') ) {s = 17;}

                        else if ( (LA15_0=='.') ) {s = 18;}

                        else if ( (LA15_0=='E') ) {s = 19;}

                        else if ( (LA15_0=='+') ) {s = 20;}

                        else if ( (LA15_0=='-') ) {s = 21;}

                        else if ( (LA15_0=='=') ) {s = 22;}

                        else if ( (LA15_0=='[') ) {s = 23;}

                        else if ( (LA15_0==']') ) {s = 24;}

                        else if ( (LA15_0==':') ) {s = 25;}

                        else if ( (LA15_0=='m') ) {s = 26;}

                        else if ( (LA15_0=='a') ) {s = 27;}

                        else if ( (LA15_0=='{') ) {s = 28;}

                        else if ( (LA15_0=='}') ) {s = 29;}

                        else if ( (LA15_0=='<') ) {s = 30;}

                        else if ( (LA15_0=='d') ) {s = 31;}

                        else if ( (LA15_0=='u') ) {s = 32;}

                        else if ( (LA15_0=='b') ) {s = 33;}

                        else if ( (LA15_0=='!') ) {s = 34;}

                        else if ( (LA15_0=='>') ) {s = 35;}

                        else if ( (LA15_0=='*') ) {s = 36;}

                        else if ( (LA15_0=='/') ) {s = 37;}

                        else if ( (LA15_0=='n') ) {s = 38;}

                        else if ( (LA15_0=='I') ) {s = 39;}

                        else if ( (LA15_0=='O') ) {s = 40;}

                        else if ( ((LA15_0>='B' && LA15_0<='D')||(LA15_0>='F' && LA15_0<='H')||(LA15_0>='J' && LA15_0<='L')||LA15_0=='N'||(LA15_0>='P' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='g' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='k')||LA15_0=='q'||(LA15_0>='x' && LA15_0<='z')) ) {s = 41;}

                        else if ( (LA15_0=='\"') ) {s = 42;}

                        else if ( (LA15_0=='\'') ) {s = 43;}

                        else if ( (LA15_0=='^') ) {s = 44;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 45;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 46;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_246 = input.LA(1);

                        s = -1;
                        if ( ((LA15_246>='\u0000' && LA15_246<='\uFFFF')) ) {s = 188;}

                        else s = 301;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_186 = input.LA(1);

                        s = -1;
                        if ( (LA15_186=='/') ) {s = 246;}

                        else if ( ((LA15_186>='\u0000' && LA15_186<='.')||(LA15_186>='0' && LA15_186<='\uFFFF')) ) {s = 188;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( (LA15_43=='\\') ) {s = 129;}

                        else if ( ((LA15_43>=' ' && LA15_43<='!')||LA15_43=='#'||(LA15_43>='%' && LA15_43<='&')||(LA15_43>='(' && LA15_43<=')')||(LA15_43>='0' && LA15_43<='9')||LA15_43=='='||(LA15_43>='?' && LA15_43<='Z')||LA15_43=='_'||(LA15_43>='a' && LA15_43<='z')) ) {s = 130;}

                        else if ( ((LA15_43>='\u0000' && LA15_43<='\u001F')||LA15_43=='\"'||LA15_43=='$'||LA15_43=='\''||(LA15_43>='*' && LA15_43<='/')||(LA15_43>=':' && LA15_43<='<')||LA15_43=='>'||LA15_43=='['||(LA15_43>=']' && LA15_43<='^')||LA15_43=='`'||(LA15_43>='{' && LA15_43<='\uFFFF')) ) {s = 128;}

                        else s = 47;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}